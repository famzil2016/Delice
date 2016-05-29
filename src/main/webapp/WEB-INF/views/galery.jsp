<%@ include file="header.jsp"%>
<body>
	<div id="header"></div>
<body>
	<!-- header -->
	<div id="header"></div>
	<!-- header -->
	<!-- banner1 -->
	<div class="banner3">
		<div class="container"></div>
	</div>
	<!-- //banner1 -->
	<div class="banner-bottom">
		<div class="container">
			<div class="banner-bottom-grids">
				<h1>Délice galerie</h1>
				<div class="services">
					<div class="container">
						<div class="service-grids">
							<c:forEach var="product" items="${products}">
								<div class="col-md-4 service-grid">
									<div class="service-grd wow fadeInLeftBig"
										data-wow-duration="1000ms" data-wow-delay="300ms">
										<img src="<c:url value="${product.img_product}.png" />"
											alt=" " class="img-responsive" />
									</div>
								</div>
							</c:forEach>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>


</body>
<%@ include file="footer.jsp"%>
<%@ include file="login.jsp"%>
