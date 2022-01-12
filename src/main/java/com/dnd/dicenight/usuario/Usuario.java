package com.dnd.dicenight.usuario;

import com.dnd.dicenight.partida.Partida;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String usuario;
    private String contrasena;

    @ManyToMany
    @JoinTable(name = "usuarios_partidas", joinColumns = @JoinColumn(name="usuario_id"), inverseJoinColumns = @JoinColumn(name="partied_id"))
    private List<Partida> partidas;

}
