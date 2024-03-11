package com.consultas.citas.java.entities;

import java.time.LocalDateTime;

import com.consultas.citas.java.interfaces.IAgendado;

public class CitaEnfermero extends Cita implements IAgendado {
    private String procedimiento;
    private Enfermero enfermero;

    public CitaEnfermero(Integer id, 
                        LocalDateTime fecha, 
                        com.consultas.citas.java.entities.Paciente paciente,
            com.consultas.citas.java.entities.Consultorio consultorio ,
            Enfermero enfermero ,
            String procedimiento) {
        super(id, fecha, paciente, consultorio);
        this.enfermero = enfermero;
        this.procedimiento = procedimiento;
      }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    public Enfermero getEnfermero() {
        return enfermero;
    }

    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }

    @Override
    public void agendarCita(LocalDateTime fecha) {
        //se le esta asignando a la fecha de la cita (clase papá)
        //fecha como parametro 
        super.fecha = fecha; 
        
        throw new UnsupportedOperationException("Unimplemented method 'agendarCita'");
    }

    @Override
    public void cancelarCita() {
       System.out.println("Cita cancelada");
        throw new UnsupportedOperationException("Unimplemented method 'cancelarCita'");
    }

    @Override
    public void reagendarCita(LocalDateTime fecha) {
       super.fecha = fecha;
        throw new UnsupportedOperationException("Unimplemented method 'reagendarCita'");
    }

}
