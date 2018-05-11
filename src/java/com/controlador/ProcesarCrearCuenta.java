/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador;

import com.dao.DaoCrearCuenta;
import com.dao.daoUsuario;
import com.modelo.TipoUsuario;
import com.modelo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kamt
 */
public class ProcesarCrearCuenta extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        RequestDispatcher rq = null;
       String msj=null;
       
       DaoCrearCuenta daop = new DaoCrearCuenta();
       TipoUsuario prov = new TipoUsuario();
       Usuario prod = new Usuario();
       
        try 
        {
            
            prod.setCorreo(request.getParameter("txtEmail"));
            prod.setContrasenia(request.getParameter("txtPassword"));
            
            
            
            prov.setIdTipoUsuario(Integer.parseInt(request.getParameter("tipoUsuario")));
            prod.setTipoUsuario(prov);
            if (request.getParameter("btnEnviar")!=null) {
                daop.agregarUsuario(prod);
                msj="As creado tu cuenta";
            }
            
            rq = request.getRequestDispatcher("login.jsp");
            request.setAttribute("msj", msj);
        } catch (Exception e) 
        {
            request.setAttribute("error", e.toString());
        }
        rq.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
