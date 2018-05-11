/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.conexion.Conexion;
import com.modelo.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author kamt
 */
public class Validar extends Conexion{
    String sql="";
    PreparedStatement pre;
    ResultSet res;
    
    public int validarUsuario (Usuario urs) throws Exception{
    
    int nivel=0;
        try {
            this.conectar();
            sql="select idTipoUsuario from usuario where correo=? and contrasenia=?";
            pre=this.getCon().prepareStatement(sql);
            pre.setString(1, urs.getCorreo());
            pre.setString(2, urs.getContrasenia());
            res=pre.executeQuery();
            while(res.next()){
                
                nivel=res.getInt(1);
            
            
            }
            
            res.close();
            
        } catch (Exception e) {
            throw e;
        }finally{
            this.desconectar();
        
        
        }
        return nivel;
    
    }
    
}
