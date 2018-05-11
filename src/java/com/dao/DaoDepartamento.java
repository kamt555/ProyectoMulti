/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;


import com.conexion.Conexion;
import com.modelo.Departamento;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kamt
 */
public class DaoDepartamento extends Conexion{
    public List<Departamento> mostrarDepartamento() throws Exception{
        ResultSet rs;
        List<Departamento> lst=new ArrayList();
        
        try {
            this.conectar();
            String sql="select * from departamento";
            PreparedStatement pre=this.getCon().prepareStatement(sql);
            rs=pre.executeQuery();
            
            while(rs.next()){
                Departamento prv = new Departamento();
                prv.setIdDepartamento(rs.getInt("idDepartamento"));
                prv.setNombreDepto(rs.getString("nombreDepto"));
                
                lst.add(prv);
            
            
            }
            
        } catch (Exception e) {
            throw e;
        }finally{
            this.desconectar();
        }
        return lst;
    
    
    
    
    }
    
    
    
    public void agregarDepartamento(Departamento prv) throws Exception{
        try {
            this.conectar();
            String sql="insert into departamento values(?,?)";
            PreparedStatement pre= this.getCon().prepareStatement(sql);
            
            pre.setInt(1, prv.getIdDepartamento());
            pre.setString(2, prv.getNombreDepto());
            
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
            
        }finally{
            this.desconectar();
        
        }
    
    
    
    }
    
    public void eliminarDepartamento(Departamento prv) throws Exception{
        try {
            this.conectar();
            String sql="delete from departamento where idDepartamento=?";
            PreparedStatement pre= this.getCon().prepareStatement(sql);
            
            pre.setInt(1, prv.getIdDepartamento());
            
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
            
        }finally{
            this.desconectar();
        
        }
    
    
    
    }
    
    public void modificarDepartamento(Departamento prv) throws Exception{
        try {
            this.conectar();
            String sql="update departamento set nombreDepto=? where idDepartamento=?";
            PreparedStatement pre= this.getCon().prepareStatement(sql);
            
            
            pre.setString(1, prv.getNombreDepto());
            pre.setInt(2, prv.getIdDepartamento());
            
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
            
        }finally{
            this.desconectar();
        
        }
    
    
    
    }
}
