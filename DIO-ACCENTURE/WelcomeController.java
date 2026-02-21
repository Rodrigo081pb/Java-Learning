package dio.myApi.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller de boas-vindas
 * Fornece endpoint inicial da API
 */
@RestController
@Tag(name = "Welcome", description = "Endpoint de boas-vindas da API")
public class WelcomeController {

    /**
     * Endpoint raiz da API que retorna mensagem de boas-vindas
     * @return Mensagem de boas-vindas
     */
    @GetMapping
    @Operation(
            summary = "Mensagem de boas-vindas",
            description = "Retorna uma mensagem de boas-vindas da API"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Mensagem retornada com sucesso")
    })
    public String welcome() {
        return "Welcome to my API!";
    }

}
