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
public class TipoUsuario {
    private int idTipoUsuario;
    private String nombre;

    public TipoUsuario() {
    }

    public TipoUsuario(int idTipoUsuario, String nombre) {
        this.idTipoUsuario = idTipoUsuario;
        this.nombre = nombre;
    }

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
