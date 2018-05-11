/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.conexion.Conexion;
import com.modelo.Usuario;
import java.sql.PreparedStatement;

/**
 *
 * @author kamt
 */
public class DaoCrearCuenta extends Conexion{
    public void agregarUsuario(Usuario prv) throws Exception{
        try {
            this.conectar();
            String sql="insert into usuario(correo,contrasenia,idTipoUsuario) values(?,?,?)";
            PreparedStatement pre= this.getCon().prepareStatement(sql);
            
            
            pre.setString(1, prv.getCorreo());
            pre.setString(2, prv.getContrasenia());
           
            pre.setInt(3, prv.getTipoUsuario().getIdTipoUsuario());
            
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
            
        }finally{
            this.desconectar();
        
        }
    
    
    
    }
    
}
