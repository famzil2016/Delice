<%@ include file="header.jsp"%>
<body>
	<div id="header"></div>
	<!-- banner -->
	<div class="banner">
		<div class="container">
			<div class="banner-info">
				<h1 class="animated fadeInLeftBig" data-wow-duration="1000ms"
					data-wow-delay="300ms">
					Délice<span>Qualité . Goût . Créativité</span>
				</h1>
				<div class="banner-info1 animated wow fadeInDown"
					data-wow-duration="1000ms" data-wow-delay="300ms">
					<ul id="flexiselDemo1">
						<li>
							<div class="banner-info1-grid">
								<img src="<c:url value="${product1.img_product}.png" />" alt=" "
									class="img-responsive" />
								<h3>${product1.name_product}</h3>
								<p>${product1.description_short_product}</p>
							</div>
						</li>
						<li>
							<div class="banner-info1-grid">
								<img src="<c:url value="${product2.img_product}.png" />" alt=" "
									class="img-responsive" />
								<h3>${product2.name_product}</h3>
								<p>${product2.description_short_product}</p>
							</div>
						</li>
						<li>
							<div class="banner-info1-grid">
								<img src="<c:url value="${product3.img_product}.png" />" alt=" "
									class="img-responsive" />
								<h3>${product3.name_product}</h3>
								<p>${product3.description_short_product}</p>
							</div>
						</li>
					</ul>
					<script type="text/javascript">
						$(window).load(function() {
							$("#flexiselDemo1").flexisel({
								visibleItems : 3,
								animationSpeed : 1000,
								autoPlay : true,
								autoPlaySpeed : 3000,
								pauseOnHover : true,
								enableResponsiveBreakpoints : true,
								responsiveBreakpoints : {
									portrait : {
										changePoint : 480,
										visibleItems : 1
									},
									landscape : {
										changePoint : 640,
										visibleItems : 2
									},
									tablet : {
										changePoint : 768,
										visibleItems : 2
									}
								}
							});

						});
					</script>
					<script type="text/javascript"
						src="<c:url value="/resources/js/jquery.flexisel.js" />"></script>
					<div class="more wow fadeInUp" data-wow-duration="1000ms"
						data-wow-delay="300ms">
						<a href="catalogue" class="hvr-curl-bottom-right">Lire la
							suite</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- //banner -->
	<!-- banner-bottom -->
	<div class="banner-bottom">
		<div class="container">
			<div class="banner-bottom-grids">
				<div class="col-md-5 banner-bottom-grid wow fadeInRightBig"
					data-wow-duration="1000ms" data-wow-delay="300ms">
					<h2>${newProd1.name_product}</h2>
					<p>${newProd1.description_long_product}</p>
					<div class="more">
						<c:set var="prod"
							value="nouveaux-délices/${newProd1.id_product}/single" />
						<a href=${prod } class="hvr-curl-bottom-right">Lire la suite</a>
					</div>
				</div>
				<div class="col-md-7 banner-bottom-grid wow flipInY"
					data-wow-duration="1000ms" data-wow-delay="300ms">
					<div class="banner-bottom-grid1">
						<img src="<c:url value="${newProd1.img_product}-single.png" />" alt=" " class="img-responsive" />
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="newsletter-bottom-grids">
				<div class="col-md-6 newsletter-bottom-grid wow flipInY"
					data-wow-duration="1000ms" data-wow-delay="300ms">
					<img src="<c:url value="${newProd2.img_product}-single.png" />" alt=" " class="img-responsive" />
				</div>
				<div class="col-md-6 newsletter-bottom-grid  wow fadeInLeftBig"
					data-wow-duration="1000ms" data-wow-delay="300ms">
					<h3>${newProd2.name_product}</h3>
					<p>${newProd2.description_long_product}</p>
					<div class="more">
						<c:set var="prod" value="nouveaux-délices/${newProd2.id_product}/single" />
						<a href=${prod }  class="hvr-curl-bottom-right">Lire la
							suite</a>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!-- //banner-bottom -->
	<!-- newsletter -->
	<div class="newsletter">
		<div class="container">
			<div class="newsletter-info">
				<h3 class="wow fadeInUp" data-wow-duration="1000ms"
					data-wow-delay="300ms">Newsletter</h3>
				<p class="wow fadeInUp" data-wow-duration="1000ms"
					data-wow-delay="300ms">Abonnez-vous à  la newsletter de Délice
					pour vous tenir au courant de nos nouveaux délices et recever
					occasionnellement les bons plans de Délice</p>
				<form class="wow fadeInLeftBig" data-wow-duration="1000ms"
					data-wow-delay="300ms">
					<input type="mail" value="Enter Your Email"
						onfocus="this.value = '';"
						onblur="if (this.value == '') {this.value = 'Enter Your Email';}"
						required=""> <input type="submit" value="Envoyer">
				</form>
			</div>
		</div>
	</div>
	<!-- //newsletter -->
	<!-- newsletter-bottom -->
	<div class="newsletter-bottom">
		<div class="container">
			<div class="newsletter-bottom-grids">
				<div class="col-md-6 newsletter-bottom-grid wow fadeInLeftBig"
					data-wow-duration="1000ms" data-wow-delay="300ms">
					<h3>${newProd3.name_product}</h3>
					<p>${newProd3.description_long_product}</p>
					<div class="more">
						<c:set var="prod" value="nouveaux-délices/${newProd3.id_product}/single" />
						<a href=${prod }  class="hvr-curl-bottom-right">Lire la
							suite</a>
					</div>
				</div>
				<div class="col-md-6 newsletter-bottom-grid wow flipInY"
					data-wow-duration="1000ms" data-wow-delay="300ms">
					<img src="<c:url value="${newProd3.img_product}-single.png" />" alt=" " class="img-responsive" />
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="newsletter-bottom-grids">
				<div class="col-md-6 newsletter-bottom-grid wow flipInY"
					data-wow-duration="1000ms" data-wow-delay="300ms">
					<img src="<c:url value="${newProd4.img_product}-single.png" />" alt=" " class="img-responsive" />
				</div>
				<div class="col-md-6 newsletter-bottom-grid  wow fadeInLeftBig"
					data-wow-duration="1000ms" data-wow-delay="300ms">
					<h3>${newProd4.name_product}</h3>
					<p>${newProd4.description_long_product}</p>
					<div class="more">
						<c:set var="prod" value="nouveaux-délices/${newProd4.id_product}/single" />
						<a href=${prod }  class="hvr-curl-bottom-right">Lire la
							suite</a>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!-- //newsletter-bottom -->
</body>
<%@ include file="footer.jsp"%>
<%@ include file="login.jsp"%>
