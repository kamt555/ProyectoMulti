/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

import com.conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kamt
 */
public class DaoDepartamento extends Conexion{
    public List<Departamento> mostrarDepartamento() throws Exception
    {
        ResultSet res;
        List<Departamento> ls = new ArrayList();
        try 
        {
            this.conectar();
            String sql="select * from departamento";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            res=pre.executeQuery();
            while(res.next())
            {
                Departamento dep= new Departamento();
                dep.setIdDepartamento(res.getInt("idDepartamento"));
                dep.setNombreDepto(res.getString("nombreDepto"));
                
               
                ls.add(dep);
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
