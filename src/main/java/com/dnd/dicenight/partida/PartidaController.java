package com.dnd.dicenight.partida;

import com.dnd.dicenight.usuario.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("partida")
public class PartidaController {

    @GetMapping
    public List<Partida> obtenerPartidas(@RequestBody Usuario usuario){
        return null;
    }

    @PostMapping
    public Partida crearPartida(@RequestBody Partida partida){
        return null;
    }
}
