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
public class Profesion {
    private int idProfesion;
    private String nombrePprofesion;

    public Profesion() {
    }

    public Profesion(int idProfesion, String nombrePprofesion) {
        this.idProfesion = idProfesion;
        this.nombrePprofesion = nombrePprofesion;
    }

    public int getIdProfesion() {
        return idProfesion;
    }

    public void setIdProfesion(int idProfesion) {
        this.idProfesion = idProfesion;
    }

    public String getNombrePprofesion() {
        return nombrePprofesion;
    }

    public void setNombrePprofesion(String nombrePprofesion) {
        this.nombrePprofesion = nombrePprofesion;
    }
    
    
}
