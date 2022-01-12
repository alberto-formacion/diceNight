package com.dnd.dicenight.objeto;

import com.dnd.dicenight.mapa.Mapa;

import javax.persistence.*;

@Entity
@Table(name="objetos")
public class Objeto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    @ManyToOne
    @JoinColumn(name="mapa_id")
    private Mapa mapa;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
