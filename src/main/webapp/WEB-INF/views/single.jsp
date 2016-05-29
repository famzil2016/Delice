<%@ include file="header.jsp"%>
<body>
	<div id="header"></div>
<body>
	<!-- header -->
	<div id="header"></div>
	<!-- header -->
	<!-- single -->
	<div class="single">
		<div class="container">
			<h1 class="animated fadeInLeftBig" data-wow-duration="1000ms"
				data-wow-delay="300ms">${item.name_product }</h1>
			<div class="single-left wow fadeInLeftBig" data-wow-duration="1000ms"
				data-wow-delay="300ms">
				<p>
					Publié en <span>${item.add_date_product }</span>
				</p>
				<c:set var="img" value="${item.img_product}-single.png"/>
				<img src="<c:url value="${img}" />"
					class="img-responsive" />
			</div>
			<div class="single-right wow fadeInRightBig"
				data-wow-duration="1000ms" data-wow-delay="300ms">
				<h2>${item.description_short_product }</h2>
				<p>
					<span>${item.description_long_product }</span>
				</p>
				</br> </br>
				<h2>Détail:</h2>
				<p>${item.details_product }</p>
			</div>
			<div class="clearfix"></div>
			<div class ="price-info">
				<span class="item-price">${item.price } &#8364; </span>
			</div>
			<div class="command-right">
				<div class="command">
					<a href="#">Commander</a>
				</div>
			</div>
			<div class="three-com">
				<h3 class="wow fadeInUp" data-wow-duration="1000ms"
					data-wow-delay="300ms">
					3 Comment <span>on</span> <label>${item.name_product }</label>
				</h3>
				<div class="tom-grid wow fadeInUp" data-wow-duration="1000ms"
					data-wow-delay="300ms">
					<div class="tom">
						<img src="resources/images/co.png" alt=" " />
					</div>
					<div class="tom-right">
						<div class="Hardy">
							<h4>Tom Hardy</h4>
							<p>
								<label>10 September 2015</label>
							</p>
						</div>
						<div class="reply">
							<a href="#">Répondre</a>
						</div>
						<div class="clearfix"></div>
						<p class="lorem">There are many variations of passages of
							Lorem Ipsum available, but the majority have suffered alteration
							in some form, by injected humour, or randomised words which
							don't.</p>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="tom-grid humour wow fadeInUp" data-wow-duration="1000ms"
					data-wow-delay="300ms">
					<div class="tom">
						<img src="resources/images/co.png" alt=" " />
					</div>
					<div class="tom-right">
						<div class="Hardy">
							<h4>Prad Pitt</h4>
							<p>
								<label>10 September 2015</label>
							</p>
						</div>
						<div class="reply">
							<a href="#">Répondre</a>
						</div>
						<div class="clearfix"></div>
						<p class="lorem">There are many variations of passages of
							Lorem Ipsum available, but the majority have suffered alteration
							in some form, by injected humour, or randomised words which
							don't.</p>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="tom-grid wow fadeInUp" data-wow-duration="1000ms"
					data-wow-delay="300ms">
					<div class="tom">
						<img src="resources/images/co.png" alt=" " />
					</div>
					<div class="tom-right">
						<div class="Hardy">
							<h4>Tom Cruis</h4>
							<p>
								<label>10 September 2015</label>
							</p>
						</div>
						<div class="reply">
							<a href="#">Répondre</a>
						</div>
						<div class="clearfix"></div>
						<p class="lorem">There are many variations of passages of
							Lorem Ipsum available, but the majority have suffered alteration
							in some form, by injected humour, or randomised words which
							don't.</p>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
			<div class="leave-comment wow fadeInUp" data-wow-duration="1000ms"
				data-wow-delay="300ms">
				<h3>Laisser un commentaire</h3>
				<p>Racontez votre expérience aux autres ...</p>
				<form>
					<input type="text" placeholder="Nom" required=" "> <input
						type="text" placeholder="Email" required=" "> <input
						type="text" placeholder="Votre site web" required=" ">
					<textarea placeholder="Message" required=" "></textarea>
					<input type="submit" value="Commenter">
					<div class="clearfix"></div>
				</form>
			</div>
		</div>
	</div>
	<!-- //single -->
</body>
<%@ include file="footer.jsp"%>
<%@ include file="login.jsp"%>