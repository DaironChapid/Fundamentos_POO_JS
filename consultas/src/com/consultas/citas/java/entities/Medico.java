package com.consultas.citas.java.entities;
import com.consultas.citas.java.enums.Especialidad;
import com.consultas.citas.java.enums.TipoIdentificacion;

public class Medico extends Usuario {

    private long registroMedico;
    private Especialidad especialidad;
    public Medico(int id, 
                 String nombres, 
                 String apellidos, 
                 TipoIdentificacion tipoIdentificacion, 
                 long numeroIdentificacion,
                 long registroMedico, 
                 Especialidad especialidad) {
        //Super: estas invocando al constructor
        //de la clase padre
        //la invocacion(llamado) a super
        //debe ser la primera instruccion
        //en el constructor de la
        //clase hija
        super(id, 
              nombres, 
              apellidos, 
              tipoIdentificacion, 
              numeroIdentificacion);
              //despues los atributos
              //de la calse hija
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }
    public long getRegistroMedico() {
        return registroMedico;
    }
    public void setRegistroMedico(long registroMedico) {
        this.registroMedico = registroMedico;
    }
    public Especialidad getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }


}
