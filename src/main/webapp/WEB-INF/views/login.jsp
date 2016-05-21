<!-- login -->
<div class="modal fade" id="myModal4" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog" role="document">
		<div class="modal-content modal-info">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body modal-spa">
				<div class="login-grids">
					<div class="login">
						<div class="login-bottom">
							<h3>Inscription gratuite</h3>
							<form id="signUpForm" class="form-horizontal"
								modelAttribute="signupForm" method="post" action="signup">
								<div class="sign-up">
									<h4>Email :</h4>
									<input type="email" name="email_customer"
										class="form-control" placeholder="Email ..."
										aria-describedby="sizing-addon1">
								</div>
								<div class="sign-up">
									<h4>Mot de passe :</h4>
									<input type="password" name="password_customer"
										class="form-control" placeholder="Mot de passe ..."
										aria-describedby="sizing-addon1">

								</div>
								<div class="sign-up">
									<h4>Confirmation de mot de passe :</h4>
									<input type="password" name="password_confirmation"
										class="form-control" placeholder="Confirmation mot de passe ..."
										aria-describedby="sizing-addon1">
								
								</div>
								<div class="sign-up">
									<input type="submit" class="push" value="S'inscrire">
								</div>

							</form>
						</div>
						<div class="login-right">
							<h3>Connectez-vous avec votre compte</h3>
							<form id="loginForm" method="post" action="login"">
								<div class="sign-in">
									<h4>Email :</h4>
									<input type="email" name="email_customer" class="form-control"
									placeholder="Email ..." aria-describedby="sizing-addon1">
								</div>
								<div class="sign-in">
									<h4>Mot de passe :</h4>
									<input type="password" name="password_customer"
									class="form-control" placeholder="Mot de passe ..."
									aria-describedby="sizing-addon1"> <a href="#">Mot de passe oublié?</a>
								</div>
								<div class="single-bottom">
									<input type="checkbox" id="brand" value=""> <label
										for="brand"><span></span>Se souvenir de moi.</label>
								</div>
								<div class="sign-in">
									<input type="submit" value="Se connecter">
								</div>
							</form>
						</div>
						<div class="clearfix"></div>
					</div>
					<p>
						En vous connectant, vous acceptez nos <a href="#">Termes &
							Conditions</a> et <a href="#"> notre politique de confidentialité</a>
					</p>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- //login -->
