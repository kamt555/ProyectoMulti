<%-- 
    Document   : crearUsuario
    Created on : 05-10-2018, 06:20:22 PM
    Author     : kamt
--%>

<%@page import="com.modelo.DaoDepartamento"%>
<%@page import="java.util.List"%>
<%@page import="com.modelo.Departamento"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos Personales</title>
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
					<h1><a href="index.jsp">Alpha for you</a> </h1>
					<nav id="nav">
						<ul>
							<li><a href="index.jsp">Home</a></li>
                                                        <li><a href="nuevaEntrada.jsp">Buscar Ofertas</a></li>
							<li><a href="crearCuenta.jsp" class="button">Regístrate</a></li>
							<li><a href="login.jsp" class="button">Iniciar Sesión</a></li>
						</ul>
					</nav>
				</header>

			<!-- Main -->
				<section id="main" class="container 75%">
					<header>
						<h2>Ingresa tus datos Personales</h2>
						<p></p>
					</header>
					<div class="box">
                                            
						<form method="post" action="#">
                                                    
							
							
                                                            <!-- el idusuario y idPersona son auto increment    -->
                                                            
                                                            <div class="row uniform 50%" >
                                                                <div class=" 12u(mobilep)">
								
                                                                    <h4>Nombre:</h4>
                                                                </div>
                                                            <div class="12u">
								<input type="text" name="txtNombre" id="name" value="" placeholder="Nombre" />
                                                            </div>
                                                         </div>   
                                                         
                                                        
                                                        
                                                            <!-- el idusuario y idPersona son auto increment    -->
                                                            
                                                            <div class="row uniform 50%">
                                                                <div class=" 12u">
								
                                                                    <h4>Apellido:</h4>
                                                                </div>
                                                            <div class=" 12u">
								<input type="text" name="txtApellido" id="name" value="" placeholder="Apellido" />
                                                            </div>
                                                         </div>   
                                                        
                                                    
                                                    
                                                        <div class="row uniform 50%">
                                                            <!-- el idusuario y idPersona son auto increment    -->
                                                            
                                                            <div class="row uniform 50%">
                                                                <div class=" 12u">
								
                                                                    <h4>Genero:</h4>
                                                                </div>
                                                            <div class=" 12u">
                                                                
                                                               <div class="4u 12u(narrower)">
                                                                    <input type="radio" id="priority-low" name="genero" value="Masculino"checked>
                                                                    <label for="priority-low">Masculino</label>
								</div>
								<div class="4u 12u(narrower)">
                                                                    <input type="radio" id="priority-normal" name="genero" value="Femenino">
                                                                    <label for="priority-normal">Femenino</label>
								</div>
                                                            </div>
                                                         </div>   
                                                        </div> 
                                                    
                                                        
                                                            <!-- el idusuario y idPersona son auto increment    -->
                                                            
                                                            <div class="row uniform 50%">
                                                                <div class=" 12u">
								
                                                                    <h4>Fecha de nacimiento:</h4>
                                                                </div>
                                                            <div class=" 12u">
                                                                <input type="date" name="txtFechaN" id="name"  />
                                                            </div>
                                                         </div>   
                                                        
                                                    
                                                        
                                                            <!-- el idusuario y idPersona son auto increment    -->
                                                            
                                                            <div class="row uniform 50%" >
                                                                <div class=" 12u(mobilep)">
								
                                                                    <h4>Direccion:</h4>
                                                                </div>
                                                            <div class="12u">
								<input type="text" name="txtDirecion" id="name" value="" placeholder="Direcion" />
                                                            </div>
                                                         </div>   
                                                        
                                                        
                                                            <!-- el idusuario y idPersona son auto increment    -->
                                                            
                                                            <div class="row uniform 50%" >
                                                                <div class=" 12u(mobilep)">
								
                                                                    <h4>Telefono:</h4>
                                                                </div>
                                                            <div class="12u">
								<input type="text" name="txtTelefono" id="name" value="" placeholder="Telefono" />
                                                            </div>
                                                         </div>   
                                                         
                                                    
                                                    
                                                    
                                                        
                                                            <!-- el idusuario y idPersona son auto increment    -->
                                                        <div class="row uniform 50%">   
                                                        <div class="row uniform 50%">
							<div class="6u 12u(mobilep)">
								
							<h4>Departamento:</h4>
							</div>
							<div class="6u 12u(mobilep)">
								<div class="select-wrapper">
                                                                    
                                                                    
                                                                    <select name="selectDepartemento" id="category">
                                                                            <%
                                                                                DaoDepartamento daoPro=new DaoDepartamento();
                                                                                List<Departamento> lstPv=daoPro.mostrarDepartamento();
                                                                                for(Departamento d:lstPv ){
            
                                                                            %>
                                                                        <option value="<%=d.getIdDepartamento()  %>"><%=d.getNombreDepto() %></option>
                                                                            <% 

                                                                                }

                                                                            %>
                                                                     </select>
								</div></div></div>
                                                        </div>
                                                    
                                                    
                                                    
							<div class="row uniform">
								<div class="12u">
									<ul class="actions align-center">
										<li><input type="submit" value="Guardar" name="btnEnviar" /></li>
                                                                                <li><input type="reset" value="Limpiar" /></li>
									</ul>
                                                                        
								</div>
							</div>
                                                            
                                                       
						</form>
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
    </body>
</html>
