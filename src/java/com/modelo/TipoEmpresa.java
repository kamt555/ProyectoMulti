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
public class TipoEmpresa {
    private int idTipoEmpresa;
    private  String  nombre;

    public TipoEmpresa() {
    }

    public TipoEmpresa(int idTipoEmpresa, String nombre) {
        this.idTipoEmpresa = idTipoEmpresa;
        this.nombre = nombre;
    }

    public int getIdTipoEmpresa() {
        return idTipoEmpresa;
    }

    public void setIdTipoEmpresa(int idTipoEmpresa) {
        this.idTipoEmpresa = idTipoEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
