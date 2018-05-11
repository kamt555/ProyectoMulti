<%-- 
    Document   : crudEmpresa
    Created on : 05-11-2018, 04:59:21 AM
    Author     : kamt
--%>

<%@page import="com.dao.daoUsuario"%>
<%@page import="com.modelo.TipoEmpresa"%>
<%@page import="com.dao.DaoEmpresa"%>
<%@page import="com.modelo.Usuario"%>
<%@page import="com.modelo.Empresa"%>
<%@page import="java.util.List"%>
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
            function cargar(idEmpre, nombre, tipo, usu) {
                document.frmEmpresa.idEmpresa.value = idEmpre;
                document.frmEmpresa.txtNombre.value = nombre;
                document.frmEmpresa.empresa.value = tipo;
                document.frmEmpresa.usuario.value = usu;
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
                    <h2>Empresa</h2>
                    <p></p>
                </header>
                <div class="box">

                    <form method="post"  name="frmEmpresa" action="procesarEmpresa">



                        <!-- el idusuario y idPersona son auto increment    -->

                        <div class="row uniform 50%" >
                            <div class=" 12u(mobilep)">

                                <h4>Id Empresa:</h4>
                            </div>
                            <div class="12u">
                                <input type="text" name="idEmpresa" id="name"  placeholder="idEmpresa" />
                            </div>
                        </div>   

                        <!-- el idusuario y idPersona son auto increment    -->

                        <div class="row uniform 50%">
                            <div class=" 12u">
                                <h4>Nombre Empresa:</h4>
                            </div>
                            <div class=" 12u">
                                <input type="text" name="txtNombre" id="name"  placeholder="Empresa" />
                            </div>
                        </div>   
                        <div class="row uniform 50%" >
                            <div class=" 12u(mobilep)">

                                <h4>Tipo de Empresa:</h4>
                            </div>
                            <div class="12u">
                                <select name="empresa" id="name">
                                    <%
                                        DaoEmpresa daoe = new DaoEmpresa();
                                        List<TipoEmpresa> lsp = daoe.mostrarTipoEmpresa();
                                        for (TipoEmpresa tip : lsp) {
                                    %>
                                    <option value="<%=tip.getIdTipoEmpresa()%>"><%=tip.getNombre()%>

                                    </option>
                                    <%
                                        }
                                    %>
                                </select>
                            </div>
                        </div>   

                        <!-- el idusuario y idPersona son auto increment    -->

                        <div class="row uniform 50%">
                            <div class=" 12u">
                                <h4>Usuario</h4>
                            </div>
                            <div class=" 12u">
                                <select name="usuario" id="name">
                                    <%
                                        daoUsuario daou = new daoUsuario();
                                        List<Usuario> ls = daou.mostrarUsuario();
                                        for (Usuario usu : ls) {
                                    %>
                                    <option value="<%=usu.getIdUsuario()%>"><%=usu.getCorreo()%>

                                    </option>
                                    <%
                                        }
                                    %>
                                </select>
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
                                <th>tipo empresa</th>
                                <th>usuarios</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                
                                List<Empresa> lst = daoe.mostrarEmpresa();
                                for (Empresa emp : lst) {

                            %>
                            <tr>
                                <td><%=  emp.getIdEmpresa()%></td>
                                <td><%= emp.getNombreEmpresa()%></td>
                                <td><%= emp.getTipoEmpresa().getIdTipoEmpresa()%></td>
                                <td><%= emp.getUsuario().getIdUsuario()%></td>

                                <td><a href="javascript:cargar(<%= emp.getIdEmpresa()%>,'<%= emp.getNombreEmpresa()%>',<%= emp.getTipoEmpresa().getIdTipoEmpresa()%>,<%= emp.getUsuario().getIdUsuario()%>)">Selecionar</a></td>

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
