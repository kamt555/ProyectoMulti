/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.conexion.Conexion;
import com.modelo.TrabajoEmpresa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kamt
 */
public class DaoTrabajoEmpresa extends Conexion{
    public List<TrabajoEmpresa> mostrarTrabajoEmpresa() throws Exception{
        ResultSet rs;
        List<TrabajoEmpresa> lst=new ArrayList();
        
        try {
            this.conectar();
            String sql="select * from trabajoempresa";
            PreparedStatement pre=this.getCon().prepareStatement(sql);
            rs=pre.executeQuery();
            
            while(rs.next()){
                TrabajoEmpresa prv = new TrabajoEmpresa();
                prv.setIdTrabajo(rs.getInt("idTrabajo"));
                prv.setNombreEmpresa(rs.getString("nombreEmpresa"));
                prv.setFechaInicio(rs.getString("fechaInicio"));
                prv.setFechaFinal(rs.getString("fechaFinal"));
                
                lst.add(prv);
            
            
            }
            
        } catch (Exception e) {
            throw e;
        }finally{
            this.desconectar();
        }
        return lst;
    
    
    
    
    }
    
    
    
    public void agregarTrabajoEmpresa(TrabajoEmpresa prv) throws Exception{
        try {
            this.conectar();
            String sql="insert into trabajoempresa values(?,?,?,?)";
            PreparedStatement pre= this.getCon().prepareStatement(sql);
            
            pre.setInt(1, prv.getIdTrabajo());
            pre.setString(2, prv.getNombreEmpresa());
            pre.setString(3, prv.getFechaInicio());
            pre.setString(4, prv.getFechaFinal());
            
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
            
        }finally{
            this.desconectar();
        
        }
    
    
    
    }
    
    public void eliminarTrabajoEmpresa(TrabajoEmpresa prv) throws Exception{
        try {
            this.conectar();
            String sql="delete from trabajoempresa  where idTrabajo=?";
            PreparedStatement pre= this.getCon().prepareStatement(sql);
            
            pre.setInt(1, prv.getIdTrabajo());
            
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
            
        }finally{
            this.desconectar();
        
        }
    
    
    
    }
    
    public void modificarTrabajoEmpresa(TrabajoEmpresa prv) throws Exception{
        try {
            this.conectar();
            String sql="update trabajoempresa set nombreEmpresa=?,fechaInicio=?,fechaFinal=? where idTrabajo=?";
            PreparedStatement pre= this.getCon().prepareStatement(sql);
            
            
            pre.setString(1, prv.getNombreEmpresa());
            pre.setString(2, prv.getFechaInicio());
            pre.setString(3, prv.getFechaFinal());
            pre.setInt(4, prv.getIdTrabajo());
            
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
            
        }finally{
            this.desconectar();
        
        }
    }
}
