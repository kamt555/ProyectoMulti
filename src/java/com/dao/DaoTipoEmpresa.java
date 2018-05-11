/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.conexion.Conexion;
import com.modelo.TipoEmpresa;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kamt
 */
public class DaoTipoEmpresa extends Conexion{
    public List<TipoEmpresa> mostrarTipoEmpresa() throws Exception{
        ResultSet rs;
        List<TipoEmpresa> lst=new ArrayList();
        
        try {
            this.conectar();
            String sql="select * from tipoempresa";
            PreparedStatement pre=this.getCon().prepareStatement(sql);
            rs=pre.executeQuery();
            
            while(rs.next()){
                TipoEmpresa prv = new TipoEmpresa();
                prv.setIdTipoEmpresa(rs.getInt("idTipoEmpresa"));
                prv.setNombre(rs.getString("nombre"));
                
                lst.add(prv);
            
            
            }
            
        } catch (Exception e) {
            throw e;
        }finally{
            this.desconectar();
        }
        return lst;
    
    
    
    
    }
    
    
    
    public void agregarTipoEmpresa(TipoEmpresa prv) throws Exception{
        try {
            this.conectar();
            String sql="insert into tipoempresa values(?,?)";
            PreparedStatement pre= this.getCon().prepareStatement(sql);
            
            pre.setInt(1, prv.getIdTipoEmpresa());
            pre.setString(2, prv.getNombre());
            
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
            
        }finally{
            this.desconectar();
        
        }
    
    
    
    }
    
    public void eliminarTipoEmpresa(TipoEmpresa prv) throws Exception{
        try {
            this.conectar();
            String sql="delete from tipoempresa where idTipoEmpresa=?";
            PreparedStatement pre= this.getCon().prepareStatement(sql);
            
            pre.setInt(1, prv.getIdTipoEmpresa());
            
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
            
        }finally{
            this.desconectar();
        
        }
    
    
    
    }
    
    public void modificarTipoEmpresa(TipoEmpresa prv) throws Exception{
        try {
            this.conectar();
            String sql="update tipoempresa set nombre=? where idTipoEmpresa=?";
            PreparedStatement pre= this.getCon().prepareStatement(sql);
            
            
            pre.setString(1, prv.getNombre());
            pre.setInt(2, prv.getIdTipoEmpresa());
            
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
            
        }finally{
            this.desconectar();
        
        }
    
    
    
    }
    
}
