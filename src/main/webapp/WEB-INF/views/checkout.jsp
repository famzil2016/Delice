<%@ include file="header.jsp"%>
<body>
	<div id="header"></div>
<body>

	<!-- banner1 -->
	<div class="banner1">
		<div class="container"></div>
	</div>
	<!-- //banner1 -->
	<!-- check out -->
	<div class="checkout">
		<div class="container">
			<h3>My Shopping Bag</h3>
			<div>
				<table>
					<thead>
						<tr>
							<th>Remove</th>
							<th>Product</th>
							<th>Quantity</th>
							<th>Product Name</th>
							<th>Price</th>
						</tr>
					</thead>
					<tr>
						<td>
							<div>
								<div></div>
							</div> <script>$(document).ready(function(c) {
								$('.close1').on('click', function(c){
									$('.rem1').fadeOut('slow', function(c){
										$('.rem1').remove();
									});
									});
								});
						   </script>
						</td>
						<td><a href="single"><img src="resources/images/4.png" alt=" " /></a></td>
						<td>
							<div>
								<div>
									<div>&nbsp;</div>
									<div>
										<span>1</span>
									</div>
									<div>&nbsp;</div>
								</div>
							</div>
						</td>
						<td>Hand Bag</td>
						<td>$45.99</td>
					</tr>
					<tr>
						<td>
							<div>
								<div></div>
							</div> <script>$(document).ready(function(c) {
								$('.close2').on('click', function(c){
									$('.rem2').fadeOut('slow', function(c){
										$('.rem2').remove();
									});
									});
								});
						   </script>
						</td>
						<td><a href="single"><img src="resources/images/3.png" alt=" " /></a></td>
						<td>
							<div>
								<div>
									<div>&nbsp;</div>
									<div>
										<span>1</span>
									</div>
									<div>&nbsp;</div>
								</div>
							</div>
						</td>
						<td>Watches</td>
						<td>$45.99</td>

					</tr>
					<tr>
						<td>
							<div>
								<div></div>
							</div> <script>$(document).ready(function(c) {
								$('.close3').on('click', function(c){
									$('.rem3').fadeOut('slow', function(c){
										$('.rem3').remove();
									});
									});
								});
						   </script>
						</td>
						<td><a href="single"><img src="resources/images/2.png" alt=" " /></a></td>
						<td>
							<div>
								<div>
									<div>&nbsp;</div>
									<div>
										<span>1</span>
									</div>
									<div>&nbsp;</div>
								</div>
							</div>
						</td>
						<td>Sandals</td>
						<td>$45.99</td>

					</tr>
					<tr>
						<td>
							<div>
								<div></div>
							</div> <script>$(document).ready(function(c) {
								$('.close4').on('click', function(c){
									$('.rem4').fadeOut('slow', function(c){
										$('.rem4').remove();
									});
									});
								});
						   </script>
						</td>
						<td><a href="single"><img src="resources/images/1.png" alt=" " /></a></td>
						<td>
							<div>
								<div>
									<div>&nbsp;</div>
									<div>
										<span>1</span>
									</div>
									<div>&nbsp;</div>
								</div>
							</div>
						</td>
						<td>Wedges</td>
						<td>$45.99</td>

					</tr>

					<!--quantity-->
					<script>
									$('.value-plus').on('click', function(){
										var divUpd = $(this).parent().find('.value'), newVal = parseInt(divUpd.text(), 10)+1;
										divUpd.text(newVal);
									});

									$('.value-minus').on('click', function(){
										var divUpd = $(this).parent().find('.value'), newVal = parseInt(divUpd.text(), 10)-1;
										if(newVal>=1) divUpd.text(newVal);
									});
									</script>
					<!--quantity-->
				</table>
			</div>
			<div>

				<div>
					<a href="services"><span
						class="glyphicon glyphicon-menu-left" aria-hidden="true"></span>Back
						To Shopping</a>
				</div>
				<div>
					<h4>Shopping basket</h4>
					<ul>
						<li>Hand Bag <i>-</i> <span>$45.99</span></li>
						<li>Watches <i>-</i> <span>$45.99</span></li>
						<li>Sandals <i>-</i> <span>$45.99</span></li>
						<li>Wedges <i>-</i> <span>$45.99</span></li>
						<li>Total <i>-</i> <span>$183.96</span></li>
					</ul>
				</div>
				<div></div>
			</div>
		</div>
	</div>
</body>
<%@ include file="footer.jsp"%>
<%@ include file="login.jsp"%>
