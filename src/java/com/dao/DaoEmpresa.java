/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.conexion.Conexion;
import com.modelo.Empresa;
import com.modelo.TipoEmpresa;
import com.modelo.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kamt
 */
public class DaoEmpresa extends Conexion{
    public List<Empresa> mostrarEmpresa() throws Exception {
        ResultSet res;
        List<Empresa> ls = new ArrayList();
        try {
            this.conectar();
            String sql = "select * from empresa";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            Empresa empre;
            res = pre.executeQuery();
            while (res.next()) {
                TipoEmpresa tipoempre = new TipoEmpresa();
                Usuario usu = new Usuario();
                tipoempre.setIdTipoEmpresa(res.getInt("idTipoEmpresa"));
                usu.setIdUsuario(res.getInt("idUsuario"));
                empre = new Empresa(
                        res.getInt("idEmpresa"),
                        res.getString("nombreEmpresa"),
                        tipoempre,usu);
                ls.add(empre);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return ls;
    }

    public void agregarEmpresa(Empresa emp) throws Exception {
        try {
            this.conectar();
            String sql = "insert into empresa values(?,?,?,?)";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            pre.setInt(1, emp.getIdEmpresa());
            pre.setString(2, emp.getNombreEmpresa());
            pre.setInt(3, emp.getTipoEmpresa().getIdTipoEmpresa());
            pre.setInt(4, emp.getUsuario().getIdUsuario());
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

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
    
    public void modificarEmpresa(Empresa emp) throws Exception {
        try {
            this.conectar();
            String sql = "update empresa set nombreEmpresa=?,idTipoEmpresa=?,idUsuario=? where idEmpresa=?";
            PreparedStatement pre = this.getCon().prepareStatement(sql);           
            pre.setString(1, emp.getNombreEmpresa());
            pre.setInt(2, emp.getTipoEmpresa().getIdTipoEmpresa());
            pre.setInt(3, emp.getUsuario().getIdUsuario());
            pre.setInt(4, emp.getIdEmpresa());
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    public void eliminarEmpresa(Empresa emp) throws Exception {
        try {
            this.conectar();
            String sql = "delete from empresa where idEmpresa=?";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            pre.setInt(1, emp.getIdEmpresa());
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }
    
}
