/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.conexion.Conexion;
import com.modelo.Profesion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kamt
 */
public class DaoProfesion extends Conexion{
    
     public List<Profesion> mostrarProfesion() throws Exception{
        ResultSet rs;
        List<Profesion> lst=new ArrayList();
        
        try {
            this.conectar();
            String sql="select * from profesion";
            PreparedStatement pre=this.getCon().prepareStatement(sql);
            rs=pre.executeQuery();
            
            while(rs.next()){
                Profesion prv = new Profesion();
                prv.setIdProfesion(rs.getInt("idProfesion"));
                prv.setNombrePprofesion(rs.getString("nombrePprofesion"));
                
                lst.add(prv);
            
            
            }
            
        } catch (Exception e) {
            throw e;
        }finally{
            this.desconectar();
        }
        return lst;
    
    
    
    
    }
    
    public void agregarProfesion(Profesion prv) throws Exception{
        try {
            this.conectar();
            String sql="insert into profesion values(?,?)";
            PreparedStatement pre= this.getCon().prepareStatement(sql);
            
            pre.setInt(1, prv.getIdProfesion());
            pre.setString(2, prv.getNombrePprofesion());
            ;
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
            
        }finally{
            this.desconectar();
        
        }
    
    
    
    }
    
    public void eliminarProfesion(Profesion prv) throws Exception{
        try {
            this.conectar();
            String sql="delete from profesion where idProfesion=?";
            PreparedStatement pre= this.getCon().prepareStatement(sql);
            
            pre.setInt(1, prv.getIdProfesion());
            
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
            
        }finally{
            this.desconectar();
        
        }
    
    
    
    }
    
    public void midificarProfesion(Profesion prv) throws Exception{
        try {
            this.conectar();
            String sql="update profesion set nombrePprofesion=? where idProfesion=?";
            PreparedStatement pre= this.getCon().prepareStatement(sql);
            
            
            pre.setString(1, prv.getNombrePprofesion());
            pre.setInt(2, prv.getIdProfesion());
            
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
            
        }finally{
            this.desconectar();
        
        }
    
    
    
    }
    
}
