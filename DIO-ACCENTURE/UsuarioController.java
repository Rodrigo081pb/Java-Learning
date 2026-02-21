package dio.myApi.controllers;

import dio.myApi.models.Usuario;
import dio.myApi.repositorys.UserRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller REST para gerenciamento de usuários
 * Fornece endpoints para operações CRUD de usuários
 */
@RestController
@RequestMapping("/users")
@Tag(name = "Usuários", description = "API para gerenciamento de usuários do sistema")
public class UsuarioController {

    @Autowired
    private UserRepository userRepository;

    /**
     * Retorna todos os usuários cadastrados no sistema
     * @return Lista com todos os usuários
     */
    @GetMapping("/AllUsers")
    @Operation(
            summary = "Listar todos os usuários",
            description = "Retorna uma lista com todos os usuários cadastrados no sistema"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Lista de usuários retornada com sucesso"),
            @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
    })
    public List<Usuario> getUsers(){
        return userRepository.findAll();
    }

    /**
     * Busca um usuário específico pelo nome de login
     * @param username Nome de login do usuário
     * @return Usuário encontrado
     */
    @GetMapping("/{username}")
    @Operation(
            summary = "Buscar usuário por login",
            description = "Retorna um usuário específico através do seu nome de login"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Usuário encontrado com sucesso"),
            @ApiResponse(responseCode = "404", description = "Usuário não encontrado"),
            @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
    })
    public Usuario getOne(
            @Parameter(description = "Nome de login do usuário", required = true)
            @PathVariable("username") String username
    ){
        return userRepository.findByLogin(username);
    }

    /**
     * Remove um usuário do sistema pelo ID
     * @param id ID do usuário a ser removido
     */
    @DeleteMapping("/deleteUser/{id}")
    @Operation(
            summary = "Deletar usuário",
            description = "Remove um usuário do sistema através do seu ID"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Usuário deletado com sucesso"),
            @ApiResponse(responseCode = "404", description = "Usuário não encontrado"),
            @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
    })
    public void deleteUser(
            @Parameter(description = "ID do usuário a ser deletado", required = true)
            @PathVariable("id") Integer id
    ){
        userRepository.deleteById(id);
    }

    /**
     * Cria um novo usuário no sistema
     * @param usuario Objeto usuário com os dados a serem cadastrados
     */
    @PostMapping("/createUser")
    @Operation(
            summary = "Criar novo usuário",
            description = "Cadastra um novo usuário no sistema"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Usuário criado com sucesso"),
            @ApiResponse(responseCode = "400", description = "Dados inválidos fornecidos"),
            @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
    })
    public void postUser(
            @Parameter(description = "Dados do novo usuário", required = true)
            @RequestBody Usuario usuario
    ){
        userRepository.save(usuario);
    }


}
