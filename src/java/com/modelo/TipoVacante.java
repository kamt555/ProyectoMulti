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
public class TipoVacante {
   public int idTipoVacante;
   public String nombreTipoVacante;

    public TipoVacante() {
    }

    public TipoVacante(int idTipoVacante, String nombreTipoVacante) {
        this.idTipoVacante = idTipoVacante;
        this.nombreTipoVacante = nombreTipoVacante;
    }

    public int getIdTipoVacante() {
        return idTipoVacante;
    }

    public void setIdTipoVacante(int idTipoVacante) {
        this.idTipoVacante = idTipoVacante;
    }

    public String getNombreTipoVacante() {
        return nombreTipoVacante;
    }

    public void setNombreTipoVacante(String nombreTipoVacante) {
        this.nombreTipoVacante = nombreTipoVacante;
    }
   
   
}
