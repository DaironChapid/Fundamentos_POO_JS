package com.consultas.citas.java.entities;

import com.consultas.citas.java.enums.TipoIdentificacion;
import com.consultas.citas.java.enums.TipoSangre;
import java.time.LocalDateTime;


public class Paciente extends Usuario{

    private String correoElectronico;
    private Long celular;
    private LocalDateTime fechaNacimiento;
    private Double altura;
    private Double peso;
    private TipoSangre tipoSangre;
    private char factorRH;


    public Paciente(int id, 
                    String nombres, 
                    String apellidos, 
                    TipoIdentificacion tipoIdentificacion,
                    long numeroIdentificacion, 
                    String correoElectronico, 
                    Long celular, 
                    LocalDateTime fechaNacimiento,
                    Double altura, 
                    Double peso, 
                    TipoSangre tipoSangre, 
                    char factorRH) {
        super(id, 
              nombres, 
              apellidos, 
              tipoIdentificacion, 
              numeroIdentificacion);
        this.correoElectronico = correoElectronico;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        this.factorRH = factorRH;
    }


    public String getCorreoElectronico() {
        return correoElectronico;
    }


    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }


    public Long getCelular() {
        return celular;
    }


    public void setCelular(Long celular) {
        this.celular = celular;
    }


    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }


    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    public Double getAltura() {
        return altura;
    }


    public void setAltura(Double altura) {
        this.altura = altura;
    }


    public Double getPeso() {
        return peso;
    }


    public void setPeso(Double peso) {
        this.peso = peso;
    }


    public TipoSangre getTipoSangre() {
        return tipoSangre;
    }


    public void setTipoSangre(TipoSangre tipoSangre) {
        this.tipoSangre = tipoSangre;
    }


    public char getFactorRH() {
        return factorRH;
    }


    public void setFactorRH(char factorRH) {
        this.factorRH = factorRH;
    }


    
}