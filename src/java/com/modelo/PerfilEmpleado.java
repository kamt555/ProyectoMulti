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
public class PerfilEmpleado {
    public int idPerfilEmpleado;
    public Persona persona;
    public Profesion profesion;
    public String tipoExperiencia;
    public TrabajoEmpresa  trabajoEmpresa;  

    public PerfilEmpleado() {
    }

    public PerfilEmpleado(int idPerfilEmpleado, Persona persona, Profesion profesion, String tipoExperiencia, TrabajoEmpresa trabajoEmpresa) {
        this.idPerfilEmpleado = idPerfilEmpleado;
        this.persona = persona;
        this.profesion = profesion;
        this.tipoExperiencia = tipoExperiencia;
        this.trabajoEmpresa = trabajoEmpresa;
    }

    public int getIdPerfilEmpleado() {
        return idPerfilEmpleado;
    }

    public void setIdPerfilEmpleado(int idPerfilEmpleado) {
        this.idPerfilEmpleado = idPerfilEmpleado;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Profesion getProfesion() {
        return profesion;
    }

    public void setProfesion(Profesion profesion) {
        this.profesion = profesion;
    }

    public String getTipoExperiencia() {
        return tipoExperiencia;
    }

    public void setTipoExperiencia(String tipoExperiencia) {
        this.tipoExperiencia = tipoExperiencia;
    }

    public TrabajoEmpresa getTrabajoEmpresa() {
        return trabajoEmpresa;
    }

    public void setTrabajoEmpresa(TrabajoEmpresa trabajoEmpresa) {
        this.trabajoEmpresa = trabajoEmpresa;
    }
    
    
    
}
