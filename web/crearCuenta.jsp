<%-- 
    Document   : crearCuenta
    Created on : 05-10-2018, 03:59:46 PM
    Author     : kamt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrate</title>
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
						<h2>Regístrate</h2>
						<p></p>
					</header>
					<div class="box">
						<form method="post" action="#">
							
							<div class="row uniform 50%">
								<div class="12u">
                                                                    
                                                                    
									<input type="email" name="btnEmail" id="email"  placeholder="Email" />
								</div>
							</div>
                                                        <div class="row uniform 50%">
								<div class="12u">
                                                                    <input type="password" name="btnPassword" id="password"  placeholder="Password" />
								</div>
							</div>
							
                                                        <div class="row uniform 50%">
							<div class="6u 12u(mobilep)">
								
							<p><h4>Tipo de cuenta:</h4></p>
							</div>
							<div class="6u 12u(mobilep)">
								<div class="select-wrapper">
                                                                    
                                                                    <select name="tipoUsuario" id="category">
									<option value="3">Profecional</option>
									<option value="2">Empresa</option>
									
														
                                                                    </select>
								</div></div>
                                                        </div>
                                                    
                                                    
                                                    
							<div class="row uniform">
								<div class="12u">
									<ul class="actions align-center">
										<li><input type="submit" value="Entrar" name="btnEnviar" /></li>
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
