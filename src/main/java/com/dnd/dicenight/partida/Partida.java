package com.dnd.dicenight.partida;

import com.dnd.dicenight.mapa.Mapa;
import com.dnd.dicenight.usuario.Usuario;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="partidas")
public class Partida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;

    @ManyToMany(mappedBy = "partidas")
    private List<Usuario> usuarios;

    @OneToMany(mappedBy = "partida")
    private List<Mapa> mapas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Mapa> getMapas() {
        return mapas;
    }

    public void setMapas(List<Mapa> mapas) {
        this.mapas = mapas;
    }
}
