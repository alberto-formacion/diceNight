package com.dnd.dicenight.mapa;

import com.dnd.dicenight.partida.Partida;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("mapa")
public class MapaController {
    @GetMapping
    public List<Mapa> obtenerMapas(@RequestBody Partida partida){
        return null;
    }
}
