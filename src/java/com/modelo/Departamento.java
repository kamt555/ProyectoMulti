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
public class Departamento {
    private int idDepartamento;
    private String nombreDepto;

    public Departamento() {
    }

    public Departamento(int idDepartamento, String nombreDepto) {
        this.idDepartamento = idDepartamento;
        this.nombreDepto = nombreDepto;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombreDepto() {
        return nombreDepto;
    }

    public void setNombreDepto(String nombreDepto) {
        this.nombreDepto = nombreDepto;
    }
    
    
    
}
