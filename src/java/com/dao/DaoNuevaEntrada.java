/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;


import com.conexion.Conexion;
import com.modelo.Empresa;
import com.modelo.TipoVacante;
import com.modelo.Vacante;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kamt
 */
public class DaoNuevaEntrada extends Conexion {
     public List<Vacante> mostrarVacante() throws Exception
    {
        ResultSet rs;
        List<Vacante> ls = new ArrayList();
        try 
        {
            this.conectar();
            String sql="select * from vacante";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            rs=pre.executeQuery();
            Vacante prv;
            while(rs.next())
            {
                Empresa emp = new Empresa();
                TipoVacante tpv=new TipoVacante();
               emp.setIdEmpresa(rs.getInt("idEmpresa"));
               tpv.setIdTipoVacante(rs.getInt("idTipoVacante"));
               prv = new Vacante
               (
               rs.getInt("idVacante"),emp,rs.getInt("NoVacantes"),
               rs.getString("especificaciones"),tpv);
               ls.add(prv);
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
     
     
      public List<Empresa> mostrarEmpresa() throws Exception
    {
        ResultSet res;
        List<Empresa> ls = new ArrayList();
        try 
        {
            this.conectar();
            String sql="select idEmpresa,nombreEmpresa  from empresa";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            res=pre.executeQuery();
            while(res.next())
            {
                Empresa pro= new Empresa();
                
                
                pro.setIdEmpresa(res.getInt("idEmpresa"));
                pro.setNombreEmpresa(res.getString("nombreEmpresa"));
                
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
     
}
