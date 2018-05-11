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
public class Vacante {
   private int idVacante;
   private Empresa empresa;
   private  int NoVacantes;
   private  String especificaciones;   
   private  TipoVacante tipoVacante;

    public Vacante() {
    }

    public Vacante(int idVacante, Empresa empresa, int NoVacantes, String especificaciones, TipoVacante tipoVacante) {
        this.idVacante = idVacante;
        this.empresa = empresa;
        this.NoVacantes = NoVacantes;
        this.especificaciones = especificaciones;
        this.tipoVacante = tipoVacante;
    }

    public int getIdVacante() {
        return idVacante;
    }

    public void setIdVacante(int idVacante) {
        this.idVacante = idVacante;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public int getNoVacantes() {
        return NoVacantes;
    }

    public void setNoVacantes(int NoVacantes) {
        this.NoVacantes = NoVacantes;
    }

    public String getEspecificaciones() {
        return especificaciones;
    }

    public void setEspecificaciones(String especificaciones) {
        this.especificaciones = especificaciones;
    }

    public TipoVacante getTipoVacante() {
        return tipoVacante;
    }

    public void setTipoVacante(TipoVacante tipoVacante) {
        this.tipoVacante = tipoVacante;
    }
   
   
   
                     
}
