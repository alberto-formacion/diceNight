package com.dnd.dicenight.tipoobjeto;

import javax.persistence.*;

@Entity
@Table(name="tiposObjeto")
public class TipoObjeto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
}
