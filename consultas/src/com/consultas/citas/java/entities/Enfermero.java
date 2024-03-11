package com.consultas.citas.java.entities;

import com.consultas.citas.java.enums.TipoIdentificacion;

public class Enfermero extends Usuario {

    public Enfermero(int id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            long numeroIdentificacion) {
        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificacion);
        //TODO Auto-generated constructor stub
    }

}
