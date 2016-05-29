<!-- footer -->
<div class="footer">
	<div class="container">
		<div class="footer-grids">
			<div class="col-md-3 footer-grid wow fadeInUp"
				data-wow-duration="1000ms" data-wow-delay="300ms">
				<h3>Qui somme nous?</h3>
				<div class="footer-grd-left">
					<img src="<c:url value="/resources/images/6.jpg" />" class="img-responsive" alt=" " />
				</div>
				<div class="footer-grd-left">
					<p style="text-align: justify;">Délice est votre boutique
						enligne. C'est tout pour une cuisine déjantée et la pâtisserie
						créative. Chocolat, cake design, moules à gâteaux, avec Délice
						vous pouvez commander des cup cakes, des pop cakes, des beaux
						gâteaux grâce à toutes nos décorations comestibles, sprinkles,
						colorants alimentaires, feutres et personnaliser en plus votre
						commande comme vous voulez!</p>
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="col-md-3 footer-grid wow fadeInUp"
				data-wow-duration="1000ms" data-wow-delay="300ms">
				<h3>Nos délice</h3>
				<br />
				<ul>
					<li><a <% request.setAttribute("name", "patisseries"); %>
						href="${name}">Pâtisseries</a></li>
					<li><a <% request.setAttribute("name", "gouters"); %>
						href="${name}">Goûters</a></li>
					<li><a <% request.setAttribute("name", "macarons"); %>
						href="${name}">Macarons</a></li>
					<li><a
						<% request.setAttribute("name", "bonbons-de-chocolat"); %>
						href="${name}">Bonbons de chocolat</a></li>
					<li><a <% request.setAttribute("name", "piece-montees"); %>
						href="${name}">Pièces montées</a></li>
					<li><a <% request.setAttribute("name", "tablettes"); %>
						href="${name}">Tablettes</a></li>
					<li><a
						<% request.setAttribute("name", "coktails-et-buffets"); %>
						href="${name}">Cocktails et buffets</a></li>
					<li><a <% request.setAttribute("name", "bouchees"); %>
						href="${name}">Bouchées</a></li>
				</ul>
			</div>
			<div class="col-md-3 footer-grid wow fadeInUp"
				data-wow-duration="1000ms" data-wow-delay="300ms">
				<h3>Liens</h3>
				<br />
				<ul>
					<li><a href="acceuil">Acceuil</a></li>
					<li><a href="catalogue">Catalogue</a></li>
					<li><a href="#">Nos cartes</a></li>
					<li><a href="galerie-photo">Galerie photos</a></li>
					<li><a href="mail">Contactez-nous</a></li>
					<li><a href="nous-somme">Qui somme nous</a></li>
					<li><a <% request.setAttribute("name", "les-gourmandises-expediables"); %> href="${name}">Commandes expédiables</a></li>
				</ul>
			</div>
			<div class="col-md-3 footer-grid wow fadeInUp"
				data-wow-duration="1000ms" data-wow-delay="300ms">
				<h3>Suivez-nous</h3>
				</br>
				<div class="footer-grd">
					<a href="#"><img src="<c:url value="/resources/images/7.jpg" />"
						class="img-responsive" alt=" " /></a>
				</div>
				<div class="footer-grd">
					<a href="#"><img src="<c:url value="/resources/images/8.jpg" />"
						class="img-responsive" alt=" " /></a>
				</div>
				<div class="footer-grd">
					<a href="#"><img src="<c:url value="/resources/images/7.jpg" />"
						class="img-responsive" alt=" " /></a>
				</div>
				<div class="clearfix"></div>
				<div class="footer-grd">
					<a href="#"><img src="<c:url value="/resources/images/8.jpg" />"
						class="img-responsive" alt=" " /></a>
				</div>
				<div class="footer-grd">
					<a href="#"><img src="<c:url value="/resources/images/7.jpg" />"
						class="img-responsive" alt=" " /></a>
				</div>
				<div class="footer-grd">
					<a href="#"><img src="<c:url value="/resources/images/8.jpg" />"
						class="img-responsive" alt=" " /></a>
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="social-icons">
				<ul>
					<li><a class="icon-link round facebook"
						href="https://www.twitter.com/"></a></li>
					<li><a class="icon-link round p"
						href="https://fr.pinterest.com/"></a></li>
					<li><a class="icon-link round twitter"
						href="https://www.facebook.com/"></a></li>
					<li><a class="icon-link round dribble" href="#"></a></li>
				</ul>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
</div>
<div class="footer-bottom wow fadeInUp" data-wow-duration="1000ms"
	data-wow-delay="300ms">
	<div class="container">
		<p>
			&copy Delice 2016 . AMZIL Fatima</a>
		</p>
	</div>
</div>
<!-- //footer -->
<!-- for bootstrap working -->
<script src="<c:url value="/resources/js/bootstrap.js" />"></script>
<!-- //for bootstrap working -->
</html>