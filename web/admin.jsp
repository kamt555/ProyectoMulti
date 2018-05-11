<%-- 
    Document   : admin
    Created on : 05-07-2018, 05:33:46 PM
    Author     : kevin mejia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>ç
<%@page session="true" %>
<%
    HttpSession sesion=request.getSession();
    if(sesion.getAttribute("idTipoUsuario")== null){
        response.sendRedirect("login.jsp");
    }else{
        String nivel=sesion.getAttribute("idTipoUsuario").toString();
        if(!nivel.equals("1")){
        
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
        
        <br>
        <p>
            Acceder a <a href="../producto.jsp">Crud productos</a><br>
            Acceder a <a href="../proveedor.jsp">Crud Proveedor</a>
            
        </p>
        
    </body>
</html>
