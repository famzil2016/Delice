<%@ include file="header.jsp"%>
<body>
	<div id="header"></div>
	<!-- banner -->
	<div class="banner"> 
		<div class="container">
			<div class="banner-info">
				<h1 class="animated fadeInLeftBig" data-wow-duration="1000ms"
					data-wow-delay="300ms">
					D�lice<span>Qualit� . Go�t . Cr�ativit�</span>
				</h1>
				<div class="banner-info1 animated wow fadeInDown"
					data-wow-duration="1000ms" data-wow-delay="300ms">
					<ul id="flexiselDemo1">
						<li>
							<div class="banner-info1-grid">
								<img src=${product1.img_product } alt=" "
									class="img-responsive" />
								<h3>${product1.name_product}</h3>
								<p>${product1.description_short_product}</p>
							</div>
						</li>
						<li>
							<div class="banner-info1-grid">
								<img src=${product2.img_product } alt=" "
									class="img-responsive" />
								<h3>${product2.name_product}</h3>
								<p>${product2.description_short_product}</p>
							</div>
						</li>
						<li>
							<div class="banner-info1-grid">
								<img src=${product3.img_product } alt=" "
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
					<script type="text/javascript" src="<c:url value="/resources/js/jquery.flexisel.js" />"></script>
					<div class="more wow fadeInUp" data-wow-duration="1000ms"
						data-wow-delay="300ms">
						<a href="single.jsp" class="hvr-curl-bottom-right">Lire la
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
					<h2>vel illum qui dolorem eum</h2>
					<p>"Sed ut perspiciatis unde omnis iste natus error sit
						voluptatem accusantium doloremque laudantium, totam rem aperiam,
						eaque ipsa quae ab illo inventore veritatis et quasi architecto
						beatae vitae dicta sunt explicabo.</p>
					<div class="more">
						<a href="single.jsp" class="hvr-curl-bottom-right">Lire la
							suite</a>
					</div>
				</div>
				<div class="col-md-7 banner-bottom-grid wow flipInY"
					data-wow-duration="1000ms" data-wow-delay="300ms">
					<div class="banner-bottom-grid1">
						<img src="resources/images/1.jpg" alt=" " class="img-responsive" />
						<div class="banner-bottom-grid-pos">
							<div class="progress">
								<div class="progress-bar" role="progressbar" aria-valuenow="30"
									aria-valuemin="0" aria-valuemax="100" style="width: 30%;">
									<span class="sr-only">30% Complete</span>
								</div>
							</div>
							<div class="progress progress1">
								<div class="progress-bar" role="progressbar" aria-valuenow="20"
									aria-valuemin="0" aria-valuemax="100" style="width: 20%;">
									<span class="sr-only">20% Complete</span>
								</div>
							</div>
							<div class="progress progress2">
								<div class="progress-bar" role="progressbar" aria-valuenow="30"
									aria-valuemin="0" aria-valuemax="100" style="width: 30%;">
									<span class="sr-only">30% Complete</span>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="banner-bottom-grids">
				<div class="col-md-6 banner-bottom-grid-1 wow flipInY"
					data-wow-duration="1000ms" data-wow-delay="300ms">
					<div class="banner-bottom-grid-11">
						<img src="resources/images/2.jpg" alt=" " class="img-responsive" />
						<div class="banner-bottom-grid-11-pos">
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit,
								sed do eiusmod tempor incididunt ut labore et dolore magna
								aliqua.Quis autem vel eum iure reprehenderit qui in ea voluptate
								velit esse quam nihil molestiae consequatur.</p>
							<div class="more m1">
								<a href="single.jsp" class="hvr-curl-bottom-right">Lire la
									suite</a>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-6 banner-bottom-grid-1 wow fadeInLeftBig"
					data-wow-duration="1500ms" data-wow-delay="100ms">
					<h3>Excepteur sint occaecat cupidatat non proident</h3>
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
					data-wow-delay="300ms">Abonnez-vous � la newsletter de D�lice
					pour vous tenir au courant de nos nouveaux d�lices et recever
					occasionnellement les bons plans de D�lice</p>
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
					<h3>At vero eos et accusamus et iusto odio</h3>
					<p>Sed ut perspiciatis unde omnis iste natus error sit
						voluptatem accusantium doloremque laudantium, totam rem aperiam,
						eaque ipsa quae ab illo inventore veritatis et quasi architecto
						beatae vitae dicta sunt explicabo.</p>
					<div class="more">
						<a href="single.jsp" class="hvr-curl-bottom-right">Lire la
							suite</a>
					</div>
				</div>
				<div class="col-md-6 newsletter-bottom-grid wow flipInY"
					data-wow-duration="1000ms" data-wow-delay="300ms">
					<img src="resources/images/4.jpg" alt=" " class="img-responsive" />
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="newsletter-bottom-grids">
				<div class="col-md-6 newsletter-bottom-grid wow flipInY"
					data-wow-duration="1000ms" data-wow-delay="300ms">
					<img src="resources/images/5.jpg" alt=" " class="img-responsive" />
				</div>
				<div class="col-md-6 newsletter-bottom-grid  wow fadeInLeftBig"
					data-wow-duration="1000ms" data-wow-delay="300ms">
					<h3>At vero eos et accusamus et iusto odio</h3>
					<p>Sed ut perspiciatis unde omnis iste natus error sit
						voluptatem accusantium doloremque laudantium, totam rem aperiam,
						eaque ipsa quae ab illo inventore veritatis et quasi architecto
						beatae vitae dicta sunt explicabo.</p>
					<div class="more">
						<a href="single.jsp" class="hvr-curl-bottom-right">Lire la
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
