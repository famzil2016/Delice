<%@ include file="header.jsp"%>
<body>
	<div id="header"></div>
<body>
	<!-- header -->
	<div id="header"></div>
	<!-- header -->
	<!-- banner1 -->
	<div class="banner1">
		<div class="container"></div>
	</div>
	<!-- //banner1 -->
	<!-- services -->
	<c:set var="count" value="0" scope="page" />
	<div class="services">
		<div class="container">
			<h1 class="animated fadeInLeftBig" data-wow-duration="1000ms"
				data-wow-delay="300ms">${cat}</h1>
			<div class="service-grids">
				<c:forEach var="product" items="${products}" varStatus="loop">
					<div class="col-md-4 service-grid">
						<div class="service-grd wow fadeInLeftBig"
							data-wow-duration="1000ms" data-wow-delay="300ms">
							<img src="<c:url value="${product.img_product}.png" />" alt=" "
								class="img-responsive" />
							<div class="service-grd-pos">
								<h4>${product.name_product}</h4>
								<div class="more m2">
									<c:set var="prod" value="${cat}/${product.id_product}/produit" />
									<a href="${catlink}/${product.id_product}/produit" class="hvr-curl-bottom-right">voir</a>
								</div>
							</div>
							<div class="service-grd-pos2">
								<p>${product.price}&#8364;</p>
							</div>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
	</div>


	<!-- //services -->
</body>
<%@ include file="footer.jsp"%>
<%@ include file="login.jsp"%>

