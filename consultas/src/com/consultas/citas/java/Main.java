package com.consultas.citas.java;

import com.consultas.citas.java.entities.Medico;
import com.consultas.citas.java.enums.Especialidad;
import com.consultas.citas.java.enums.TipoIdentificacion;

public class Main {

    public static void main(String[] args) {
        
        //Crear o instanciar un Medico
        Medico m = new Medico(1,
                             "David", 
                             "Valencia", 
                             TipoIdentificacion.CC, 
                             1213124467L, 
                             1213124467L, 
                             Especialidad.GASTROENTEROLOGICO);
    }
}
