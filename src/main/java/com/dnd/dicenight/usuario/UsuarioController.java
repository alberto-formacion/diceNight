package com.dnd.dicenight.usuario;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuario")
public class UsuarioController {
    @GetMapping
    public Usuario obtenerUsuario(@RequestBody Usuario usuario){
        return null;
    }
}
