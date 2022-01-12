package com.dnd.dicenight.mapa;

import com.dnd.dicenight.objeto.Objeto;
import com.dnd.dicenight.partida.Partida;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="mapas")
public class Mapa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private Double ancho;
    private Double alto;
    private String ruta;

    @ManyToOne
    @JoinColumn(name="partida_id")
    private Partida partida;

    @OneToMany(mappedBy="mapa")
    private List<Objeto> objetos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
