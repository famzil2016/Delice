<%@ include file="header.jsp"%>
<body>
	<div id="header"></div>
	<!-- header -->
	<!-- banner1 -->
	<div class="banner1">
		<div class="container"></div>
	</div>
	<!-- //banner1 -->
	<!-- contact -->
	<div class="contact">
		<div class="container">
			<h1 class="animated fadeInLeftBig" data-wow-duration="1000ms"
				data-wow-delay="300ms">Envoyez-nous un message</h1>
			<div class="contact-bottom wow fadeInLeft" data-wow-duration="1000ms"
				data-wow-delay="300ms">
				<iframe
					src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2564.958900464012!2d36.23097800000001!3d49.993379999999995!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x4127a0f009ab9f07%3A0xa21e10f67fa29ce!2sGeorgia+Education+Center!5e0!3m2!1sen!2sin!4v1436943860334"
					frameborder="0" style="border: 0" allowfullscreen></iframe>
			</div>
			<div class="col-md-4 contact-left wow fadeInLeftBig"
				data-wow-duration="1000ms" data-wow-delay="300ms">
				<h4>Adresse</h4>
				<h2 style="text-align: justify;">
					Boutique Délice, ouvert du Lundi au vendredi de 8h00 à 19h00 et
					le samedi et dimanche de 9h00 à 13h30. <span>27 Quai Roi de
						Pologne Angers</span>
				</h2>
				<ul>
					<li>Free Phone :+33 078 4589 2456</li>
					<li>Telephone :+33 06 45 47 62 99</li>
					<li>Fax :+33 078 4589 2456</li>
					<li><a href="mailto:info@delice.com">info@delice.com</a></li>
				</ul>
			</div>
			<div class="col-md-8 contact-left wow fadeInRight"
				data-wow-duration="1000ms" data-wow-delay="300ms">
				<h4>Contactez-nous</h4>
				<form>
					<input type="text" value="Nom" onfocus="this.value = '';"
						onblur="if (this.value == '') {this.value = 'Name';}" required="">
					<input type="email" value="Email" onfocus="this.value = '';"
						onblur="if (this.value == '') {this.value = 'Email';}" required="">
					<input type="text" value="Téléphone" onfocus="this.value = '';"
						onblur="if (this.value == '') {this.value = 'Telephone';}"
						required="">
					<textarea type="text" onfocus="this.value = '';"
						onblur="if (this.value == '') {this.value = 'Message...';}"
						required="">Message...</textarea>
					<input type="submit" value="Envoyer"><input type="reset"
						value="Effacer">
				</form>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
</body>
<%@ include file="footer.jsp"%>
<%@ include file="login.jsp"%>

