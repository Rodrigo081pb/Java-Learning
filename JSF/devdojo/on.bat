@echo off
chcp 65001 >nul
setlocal enabledelayedexpansion

:: Configurações do projeto
set WILDFLY_HOME=C:\dev\wildfly-10.1.0.Final
set PROJECT_DIR=%~dp0
set WAR_FILE=%PROJECT_DIR%target\devdojo.war
set DEPLOY_DIR=%WILDFLY_HOME%\standalone\deployments

:: Configurar JAVA_HOME para usar JDK em vez de JRE
set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_202
set PATH=%JAVA_HOME%\bin;%PATH%

:MENU
cls
echo ===============================================
echo    GERENCIADOR DE SERVIDOR WILDFLY
echo    Projeto: DevDojo
echo ===============================================
echo.
echo  [1] Iniciar Servidor (Build + Deploy + Start)
echo  [2] Parar Servidor
echo  [0] Sair
echo.
echo ===============================================
set /p opcao="Escolha uma opcao: "

if "%opcao%"=="1" goto INICIAR
if "%opcao%"=="2" goto PARAR
if "%opcao%"=="0" goto SAIR

echo Opcao invalida!
timeout /t 2 >nul
goto MENU

:INICIAR
cls
echo ===============================================
echo    INICIANDO SERVIDOR WILDFLY
echo ===============================================
echo.

:: Passo 1: Parar servidor se estiver rodando
echo [1/5] Parando servidor anterior (se existir)...
call :PARAR_PORTAS_SILENCIOSO

:: Passo 2: Limpar deployment anterior
echo [2/5] Limpando deployment anterior...
del /Q "%DEPLOY_DIR%\devdojo.war" 2>nul
del /Q "%DEPLOY_DIR%\devdojo.war.deployed" 2>nul
del /Q "%DEPLOY_DIR%\devdojo.war.failed" 2>nul
del /Q "%DEPLOY_DIR%\devdojo.war.isdeploying" 2>nul
rmdir /S /Q "%DEPLOY_DIR%\devdojo.war" 2>nul

:: Passo 3: Build do projeto
echo [3/5] Executando Maven clean package...
cd /d "%PROJECT_DIR%"
call mvn clean package -DskipTests
if %errorlevel% neq 0 (
    echo.
    echo ========================================
    echo ERRO: Build Maven falhou!
    echo ========================================
    pause
    goto MENU
)

:: Passo 4: Deploy do WAR
echo [4/5] Copiando WAR para deployment...
if exist "%WAR_FILE%" (
    copy /Y "%WAR_FILE%" "%DEPLOY_DIR%\"
    if %errorlevel% neq 0 (
        echo ERRO ao copiar WAR!
        pause
        goto MENU
    )
    echo WAR copiado com sucesso!
) else (
    echo.
    echo ========================================
    echo ERRO: Arquivo WAR nao encontrado!
    echo ========================================
    pause
    goto MENU
)

:: Passo 5: Iniciar servidor
echo [5/5] Iniciando WildFly...
timeout /t 2 >nul
start "WildFly Server" cmd /c "%WILDFLY_HOME%\bin\standalone.bat"
echo.
echo ===============================================
echo  SERVIDOR INICIADO COM SUCESSO!
echo ===============================================
echo.
echo  Aguarde ~30 segundos para o deploy completar
echo.
echo  Aplicacao: http://localhost:8080/devdojo
echo  Console:   http://localhost:9990
echo.
pause
goto MENU

:PARAR
cls
echo ===============================================
echo    PARANDO SERVIDOR WILDFLY
echo ===============================================
echo.
call :PARAR_PORTAS
pause
goto MENU

:PARAR_PORTAS
echo Procurando processos nas portas 8080, 9990 e 8443...
echo.
for /f "tokens=5" %%a in ('netstat -ano ^| findstr ":8080" ^| findstr "LISTENING"') do (
    echo Parando processo na porta 8080 (PID: %%a)
    taskkill /F /PID %%a >nul 2>&1
)
for /f "tokens=5" %%a in ('netstat -ano ^| findstr ":9990" ^| findstr "LISTENING"') do (
    echo Parando processo na porta 9990 (PID: %%a)
    taskkill /F /PID %%a >nul 2>&1
)
for /f "tokens=5" %%a in ('netstat -ano ^| findstr ":8443" ^| findstr "LISTENING"') do (
    echo Parando processo na porta 8443 (PID: %%a)
    taskkill /F /PID %%a >nul 2>&1
)
echo.
echo Servidor WildFly parado!
timeout /t 2 >nul
goto :EOF

:PARAR_PORTAS_SILENCIOSO
for /f "tokens=5" %%a in ('netstat -ano ^| findstr ":8080" ^| findstr "LISTENING"') do (
    taskkill /F /PID %%a >nul 2>&1
)
for /f "tokens=5" %%a in ('netstat -ano ^| findstr ":9990" ^| findstr "LISTENING"') do (
    taskkill /F /PID %%a >nul 2>&1
)
for /f "tokens=5" %%a in ('netstat -ano ^| findstr ":8443" ^| findstr "LISTENING"') do (
    taskkill /F /PID %%a >nul 2>&1
)
goto :EOF

:SAIR
cls
echo.
echo Encerrando...
timeout /t 1 >nul
exit /b

