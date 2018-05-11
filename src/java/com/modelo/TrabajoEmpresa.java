/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

/**
 *
 * @author kamt
 */
public class TrabajoEmpresa {
    
    public int idTrabajo;
    public String nombreEmpresa;
    public String fechaInicio;
    public String fechaFinal;        

    public TrabajoEmpresa() {
    }

    public TrabajoEmpresa(int idTrabajo, String nombreEmpresa, String fechaInicio, String fechaFinal) {
        this.idTrabajo = idTrabajo;
        this.nombreEmpresa = nombreEmpresa;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    public int getIdTrabajo() {
        return idTrabajo;
    }

    public void setIdTrabajo(int idTrabajo) {
        this.idTrabajo = idTrabajo;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
    
    
    
    
}
