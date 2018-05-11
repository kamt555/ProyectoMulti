<%-- 
    Document   : usuariosProf
    Created on : 05-10-2018, 09:16:39 PM
    Author     : kamt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<%
    HttpSession sesion=request.getSession();
    if(sesion.getAttribute("idTipoUsuario")== null){
        response.sendRedirect("login.jsp");
    }else{
        String nivel=sesion.getAttribute("idTipoUsuario").toString();
        if(!nivel.equals("3")){
        
            response.sendRedirect("login.jsp");
        
        }
    
    
    }
    
    
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>BIENVENID@ <%= sesion.getAttribute("idUsuario")  %></h1>
        <a href="login.jsp?cerrar=true" >Cerrar Sesion</a>
    </body>
</html>
