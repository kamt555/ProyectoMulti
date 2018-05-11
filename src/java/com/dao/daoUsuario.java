/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.conexion.Conexion;
import com.modelo.TipoUsuario;
import com.modelo.Usuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kamt
 */
public class daoUsuario extends Conexion{
    public List<Usuario> mostrarUsuario() throws Exception{
        ResultSet rs;
        List<Usuario> lst=new ArrayList();
        
        try {
            
            this.conectar();
           String sql="select * from usuario";
           PreparedStatement pst = this.getCon().prepareStatement(sql);
           Usuario prv;
           rs=pst.executeQuery();
           while(rs.next())
           {
               TipoUsuario tu = new TipoUsuario();
               tu.setIdTipoUsuario(rs.getInt("idTipoUsuario"));
               prv = new Usuario
               (
               rs.getInt("idUsuario"),rs.getString("correo"),rs.getString("contrasenia"),
               rs.getString("estado"),rs.getByte("img"),tu);
               lst.add(prv);
            
            
            
            }
            
        } catch (Exception e) {
            throw e;
        }finally{
            this.desconectar();
        }
        return lst;
    
    
    
    
    }
    
    
    
    public void agregarUsuario(Usuario prv) throws Exception{
        try {
            this.conectar();
            String sql="insert into usuario(idUsuario,correo,contrasenia,estado,idTipoUsuario) values(?,?,?,?,?)";
            PreparedStatement pre= this.getCon().prepareStatement(sql);
            
            pre.setInt(1, prv.getIdUsuario());
            pre.setString(2, prv.getCorreo());
            pre.setString(3, prv.getContrasenia());
            pre.setString(4, prv.getEstado());
            
            pre.setInt(5, prv.getTipoUsuario().getIdTipoUsuario());
            
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
            
        }finally{
            this.desconectar();
        
        }
    
    
    
    }
    
    public void eliminarUsuario(Usuario prv) throws Exception{
        try {
            this.conectar();
            String sql="delete from usuario  where idUsuario=?";
            PreparedStatement pre= this.getCon().prepareStatement(sql);
            
            pre.setInt(1, prv.getIdUsuario());
            
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
            
        }finally{
            this.desconectar();
        
        }
    
    
    
    }
    
    public void modificarUsuario(Usuario prv) throws Exception{
        try {
            this.conectar();
            String sql="update usuario set correo=?,contrasenia=?,estado=?,idTipoUsuario=? where idUsuario=?";
            PreparedStatement pre= this.getCon().prepareStatement(sql);
            
            
            
            pre.setString(1, prv.getCorreo());
            pre.setString(2, prv.getContrasenia());
            pre.setString(3, prv.getEstado());
            
            pre.setInt(4, prv.getTipoUsuario().getIdTipoUsuario());
            pre.setInt(5, prv.getIdUsuario());
            
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
            
        }finally{
            this.desconectar();
        
        }
    }
    
    
    public List<TipoUsuario> mostrarTipoUsuario() throws Exception
    {
        ResultSet res;
        List<TipoUsuario> ls = new ArrayList();
        try 
        {
            this.conectar();
            String sql="select * from tipousuario";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            res=pre.executeQuery();
            while(res.next())
            {
                TipoUsuario pro= new TipoUsuario();
                pro.setIdTipoUsuario(res.getInt("idTipoUsuario"));
                pro.setNombre(res.getString("nombre"));
                
                ls.add(pro);
            }
        } catch (Exception e) 
        {
            throw e ;
        }
        finally
        {
            this.desconectar();
        }
        return ls;
    }
    
}
