/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;


import com.conexion.Conexion;
import com.modelo.TipoVacante;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kamt
 */
public class DaoTipoVacante  extends Conexion{
    public List<TipoVacante> mostrarTipoVacante() throws Exception{
        ResultSet rs;
        List<TipoVacante> lst=new ArrayList();
        
        try {
            this.conectar();
            String sql="select * from tipovacante";
            PreparedStatement pre=this.getCon().prepareStatement(sql);
            rs=pre.executeQuery();
            
            while(rs.next()){
                TipoVacante prv = new TipoVacante();
                prv.setIdTipoVacante(rs.getInt("idTipoVacante"));
                prv.setNombreTipoVacante(rs.getString("nombreTipoVacante"));
                
                lst.add(prv);
            
            
            }
            
        } catch (Exception e) {
            throw e;
        }finally{
            this.desconectar();
        }
        return lst;
    
    
    
    
    }
    
    
    
    public void agregarTipoVacante(TipoVacante prv) throws Exception{
        try {
            this.conectar();
            String sql="insert into tipovacante  values(?,?)";
            PreparedStatement pre= this.getCon().prepareStatement(sql);
            
            pre.setInt(1, prv.idTipoVacante);
            pre.setString(2, prv.getNombreTipoVacante());
            
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
            
        }finally{
            this.desconectar();
        
        }
    
    
    
    }
    
    public void eliminarTipoVacante(TipoVacante prv) throws Exception{
        try {
            this.conectar();
            String sql="delete from tipovacante  where idTipoVacante=?";
            PreparedStatement pre= this.getCon().prepareStatement(sql);
            
            pre.setInt(1, prv.getIdTipoVacante());
            
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
            
        }finally{
            this.desconectar();
        
        }
    
    
    
    }
    
    public void modificarTipoVacante(TipoVacante prv) throws Exception{
        try {
            this.conectar();
            String sql="update tipovacante set nombreTipoVacante=? where idTipoVacante=?";
            PreparedStatement pre= this.getCon().prepareStatement(sql);
            
            
            pre.setString(1, prv.getNombreTipoVacante());
            pre.setInt(2, prv.idTipoVacante);
            
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
            
        }finally{
            this.desconectar();
        
        }
    
    
    
    }
}
