<!-- header -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE HTML>
<html>
<head>
<link rel="shortcut icon" type="image/png"
	href="<c:url value="/resources/images/logo.png" />" />
<title>Délice</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Cooks Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 
</script>
<!-- Custom Theme files -->
<link href="<c:url value="/resources/css/bootstrap.css" />"
	rel="stylesheet" type="text/css" media="all">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet"
	type="text/css" media="all">
<link rel="stylesheet" media="screen"
	href="https://fontlibrary.org/face/alex-brush" type="text/css" />
<!-- js -->
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<!-- //js -->
<!-- animation-effect -->
<link href="<c:url value="/resources/css/animate.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/wow.min.js" />"></script>
<script>
	new WOW().init();
</script>
<!-- //animation-effect -->
<link href='//fonts.googleapis.com/css?family=Alex+Brush'
	rel='stylesheet' type='text/css'>
<link
	href='//fonts.googleapis.com/css?family=Cabin:400,400italic,500,500italic,600,600italic,700,700italic'
	rel='stylesheet' type='text/css'>
</head>
<div class="header">
	<div class="container">
		<nav class="navbar navbar-default">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<div class="logo">
					<a class="navbar-brand" href="acceuil">Délice</a>
				</div>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse nav-wil"
				id="bs-example-navbar-collapse-1">
				<nav class="cl-effect-13" id="cl-effect-13">
					<ul class="nav navbar-nav">
						<li><a href="acceuil" class="active">Acceuil</a></li>
						<li role="presentation" class="dropdown"><a
							class="dropdown-toggle" data-toggle="dropdown" href="#"
							role="button" aria-haspopup="true" aria-expanded="false">
								Catalogue <span class="caret"></span>
						</a>
							<ul class="dropdown-menu">
								<li><a <% request.setAttribute("name", "patisseries"); %> href="${name}">Pâtisseries</a></li>
								<li><a <% request.setAttribute("name", "gouters"); %> href="${name}">Goûters</a></li>
								<li><a <% request.setAttribute("name", "macorons"); %> href="${name}">Macarons</a></li>
								<li><a <% request.setAttribute("name", "bonbons-de-chocolat"); %> href="${name}">Bonbons de chocolat</a></li>
								<li><a <% request.setAttribute("name", "piece-montees"); %> href="${name}">Pièces montées</a></li>
								<li><a <% request.setAttribute("name", "tablette"); %> href="${name}">Tablettes</a></li>
								<li><a <% request.setAttribute("name", "coktails-et-buffets"); %> href="${name}">Cocktails et buffets</a></li>
								<li><a <% request.setAttribute("name", "bouchees"); %> href="${name}">Bouchées</a></li>
							</ul></li>
						<li><a href="galerie-photo">Galerie photos</a></li>
						<li><a href="nous-somme">Qui somme nous?</a></li>
						
							<li><a href="#" data-toggle="modal" data-target="#myModal4"><span>Se connecter</span></a></li>
	
					</ul>
				</nav>
				<div class="social-icons">
					<div class="cart box_1">
						<a href="checkout">
							<h3>
								<div class="total">
									<i class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></i>
									<span class="simpleCart_total"></span> (<span
										id="simpleCart_quantity" class="simpleCart_quantity"></span>
									items)
								</div>
							</h3>
						</a>
						<p>
							<a href="javascript:;" class="simpleCart_empty">Panier vide</a>
						</p>
					</div>
				</div>
			</div>
			<!-- /.navbar-collapse -->
		</nav>
	</div>
</div>
<!-- header -->