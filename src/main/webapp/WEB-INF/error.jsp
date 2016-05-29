<%@ include file="views/header.jsp"%>
<body>
	<div id="header"></div>
	<!-- header -->
	<div class="newsletter-bottom">
		<div class="container">
			<div class="newsletter-bottom-grids">
				<div class="col-md-6 newsletter-bottom-grid wow flipInY"
					data-wow-duration="1000ms" data-wow-delay="300ms">
					<img src="<c:url value="/resources/images/not-found.jpg" />"
						alt=" " class="img-responsive" />
				</div>
				<div class="col-md-6 newsletter-bottom-grid  wow fadeInLeftBig"
					data-wow-duration="1000ms" data-wow-delay="300ms">
					<h3>Ooooops! Erreur 404</h3>
					<p>La page que vous cherchez n'existe pas (ou plus).</p>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>

</body>
<%@ include file="views/footer.jsp"%>
<%@ include file="views/login.jsp"%>
