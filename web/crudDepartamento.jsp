<%-- 
    Document   : crudDepartamento
    Created on : 05-10-2018, 11:20:29 PM
    Author     : kamt
--%>

<%@page import="java.util.List"%>
<%@page import="com.modelo.Departamento"%>
<%@page import="com.dao.DaoDepartamento"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <title>Crud Profecion</title>
        <script Language='JavaScript'>
            function cargar(idDepartamento,nombreDepto){
               document.frmProfesion.txtCodigo.value=idDepartamento; 
               document.frmProfesion.txtNombre.value=nombreDepto;
               
               
                
                
            }
            
            
        </script>
        
        
        <% 
            if(request.getAttribute("msj")!=null){
        
        %>
        <script type="text/javascript">
            
            alert('<%= request.getAttribute("msj") %>');
            
        </script>
        
        <%
            }    
        %>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
		<link rel="stylesheet" href="assets/css/main.css" />
		<!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
	</head>
	<body>
		<div id="page-wrapper">

			<!-- Header -->
				<header id="header">
                                    <h1>BIENVENID@ <%= sesion.getAttribute("idUsuario")  %></h1>
       
					
					<nav id="nav">
						<ul> 
                                                        <li> <a href="admin.jsp" class="button">Regersar</a></li>
							<li> <a href="login.jsp?cerrar=true" class="button">Cerrar Sesion</a></li>
                                                        
							
						</ul>
					</nav>
				</header>

			<!-- Main -->
				<section id="main" class="container 75%">
					<header>
						<h2>Crud Departamento</h2>
						<p></p>
					</header>
					<div class="box">
                                            
                                            <form method="post"  name="frmProfesion" action="procesarDepartamento">
                                                    
							
							
                                                            <!-- el idusuario y idPersona son auto increment    -->
                                                            
                                                            <div class="row uniform 50%" >
                                                                <div class=" 12u(mobilep)">
								
                                                                    <h4>Codigo Departamento:</h4>
                                                                </div>
                                                            <div class="12u">
								<input type="text" name="txtCodigo" id="name"  placeholder="Codigo" />
                                                            </div>
                                                         </div>   
                                                         
                                                        
                                                        
                                                            <!-- el idusuario y idPersona son auto increment    -->
                                                            
                                                            <div class="row uniform 50%">
                                                                <div class=" 12u">
								
                                                                    <h4>Nombre:</h4>
                                                                </div>
                                                            <div class=" 12u">
								<input type="text" name="txtNombre" id="name"  placeholder="Nombre" />
                                                            </div>
                                                         </div>   
                                                        
                                                    
                                                    
                                                        
                                                         
                                                    
                                                    
                                                    
                                                        
                                                       
                                                    
                                                    
                                                    
							<div class="row uniform">
								<div class="12u">
									<ul class="actions align-center">
										<li><input type="submit" value="Agregar" name="btnEnviar" /></li>
                                                                                <li><input type="submit" value="Modificar" name="btnModificar" /></li>
                                                                                <li><input type="submit" value="Eliminar" name="btnEliminar" /></li>
                                                                                <li><input type="reset" value="Limpiar" /></li>
									</ul>
                                                                        
								</div>
							</div>
                                                            
                                                       
						</form>
					</div>
				</section>
                        
                                
                                <section  class="box">
					<h3>Profesiones</h3>

					
					<div class="table-wrapper">
						<table>
							<thead>
								<tr>
									<th>Codigo</th>
									<th>Nombre</th>
									<th>Selecionar</th>
								</tr>
							</thead>
							<tbody>
                                                            <%
                                                                DaoDepartamento daoP=new DaoDepartamento();
                                                                List<Departamento> lst=daoP.mostrarDepartamento();
                                                                for(Departamento prv:lst){
                
                                                            %>
                                                        <tr>
                                                            <td><%=  prv.getIdDepartamento() %></td>
                                                            <td><%= prv.getNombreDepto()  %></td>
                                                            
                                                            <td><a href="javascript:cargar(<%=prv.getIdDepartamento()%>,'<%=prv.getNombreDepto()%>')">Selecionar</a></td>

                                                        </tr>
                                                            <%  
                                                                }
                                                            %>
                                                                                            
                                                                                            
                                                                                            
							</tbody>
											
						</table>
					</div>
                                        
                                </section>
                                                           

			<!-- Footer -->
				<footer id="footer">
					<ul class="icons">
						<li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
						<li><a href="#" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
						<li><a href="#" class="icon fa-instagram"><span class="label">Instagram</span></a></li>
						<li><a href="#" class="icon fa-github"><span class="label">Github</span></a></li>
						<li><a href="#" class="icon fa-dribbble"><span class="label">Dribbble</span></a></li>
						<li><a href="#" class="icon fa-google-plus"><span class="label">Google+</span></a></li>
					</ul>
					<ul class="copyright">
						<li>&copy; Untitled. All rights reserved.</li><li>Design: <a href="http://html5up.net">HTML5 UP</a></li>
					</ul>
				</footer>

		</div>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/jquery.dropotron.min.js"></script>
			<script src="assets/js/jquery.scrollgress.min.js"></script>
			<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/util.js"></script>
			<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
			<script src="assets/js/main.js"></script>
        
        
        <br>
        
    </body>
</html>
