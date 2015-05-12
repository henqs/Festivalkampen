
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import controllers.routes.javascript._

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE HTML>
<!--
	PVT 15 - Grupp 11
    Anledningen till varför det står på engelska är pga arbetsskada haha!!
    Har även mycket automatgenererad kod via Dreamweaver. 
-->
<html>
	<head>
	    """),format.raw/*10.1*/("""        """),format.raw/*11.1*/("""		"""),format.raw/*11.3*/("""<title>Festivalkampen</title>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<!--[if lte IE 8]><script src=""""),_display_(/*15.35*/routes/*15.41*/.Assets.at("stylesheets/css/ie/html5shiv.js")),format.raw/*15.86*/(""""></script><![endif]-->
		<script  src=""""),_display_(/*16.18*/routes/*16.24*/.Assets.at("/javascripts/jquery.min.js")),format.raw/*16.64*/(""""></script>
		<script  src=""""),_display_(/*17.18*/routes/*17.24*/.Assets.at("/javascripts/jquery.dropotron.min.js")),format.raw/*17.74*/(""""></script>
		<script  src=""""),_display_(/*18.18*/routes/*18.24*/.Assets.at("/javascripts/skel.min.js")),format.raw/*18.62*/(""""></script>
		<script  src=""""),_display_(/*19.18*/routes/*19.24*/.Assets.at("/javascripts/skel-layers.min.js")),format.raw/*19.69*/(""""></script>
		<script  src=""""),_display_(/*20.18*/routes/*20.24*/.Assets.at("/javascripts/init.js")),format.raw/*20.58*/(""""></script>
		<script  src=""""),_display_(/*21.18*/routes/*21.24*/.Assets.at("/javascripts/facebookSDK.js")),format.raw/*21.65*/(""""></script>
		<script  src=""""),_display_(/*22.18*/routes/*22.24*/.Assets.at("/javascripts/instafeed.js")),format.raw/*22.63*/(""""></script>
		<script  src=""""),_display_(/*23.18*/routes/*23.24*/.Assets.at("/javascripts/chart.js")),format.raw/*23.59*/(""""></script>
		<script type="text/javascript" src=""""),_display_(/*24.40*/routes/*24.46*/.Application.javascriptRoutes),format.raw/*24.75*/(""""></script>
		
		<!--[if lte IE 8]><link rel="stylesheet" href=""""),_display_(/*26.51*/routes/*26.57*/.Assets.at("stylesheets/css/ie/v8.css")),format.raw/*26.96*/("""" /><![endif]-->
	</head>
	<body class="homepage">
	<!--DET HÄR ÄR POÄNGGIVARTESTER-->
	<input type='button' value='Ge Axel 10 poäng' id='givePointsBtn' />
	
	<script>
	    var givePoints = function() """),format.raw/*33.34*/("""{"""),format.raw/*33.35*/("""
		    """),format.raw/*34.7*/("""var userId = "628246407306132";
            jsRoutes.controllers.Application.givePoints(userId, "10").ajax("""),format.raw/*35.76*/("""{"""),format.raw/*35.77*/("""
                """),format.raw/*36.17*/("""success: function(data) """),format.raw/*36.41*/("""{"""),format.raw/*36.42*/("""
                    """),format.raw/*37.21*/("""$("#result").html(data);
                """),format.raw/*38.17*/("""}"""),format.raw/*38.18*/(""",
                error: function() """),format.raw/*39.35*/("""{"""),format.raw/*39.36*/("""
                    """),format.raw/*40.21*/("""alert("Problem med att ge poäng.")
                """),format.raw/*41.17*/("""}"""),format.raw/*41.18*/("""
            """),format.raw/*42.13*/("""}"""),format.raw/*42.14*/(""")
        """),format.raw/*43.9*/("""}"""),format.raw/*43.10*/(""";
        $('#givePointsBtn').click(givePoints);
	</script>
	<!--HÄR TAR POÄNGGIVARTESTET SLUT-->
	<script>
	window.fbAsyncInit = function() """),format.raw/*48.34*/("""{"""),format.raw/*48.35*/("""
			"""),format.raw/*49.4*/("""FB.init("""),format.raw/*49.12*/("""{"""),format.raw/*49.13*/("""
				"""),format.raw/*50.5*/("""appId      : '909582695765355',
				cookie     : true,  // enable cookies to allow the server to access 
									// the session
				xfbml      : true,  // parse social plugins on this page
				version    : 'v2.2' // use version 2.2
			"""),format.raw/*55.4*/("""}"""),format.raw/*55.5*/(""");
	
			// Now that we've initialized the JavaScript SDK, we call 
			// FB.getLoginStatus().  This function gets the state of the
			// person visiting this page and can return one of three states to
			// the callback you provide.  They can be:
			//
			// 1. Logged into your app ('connected')
			// 2. Logged into Facebook, but not your app ('not_authorized')
			// 3. Not logged into Facebook and can't tell if they are logged into
			//    your app or not.
			//
			// These three cases are handled in the callback function.
			
			FB.getLoginStatus(function(response) """),format.raw/*69.41*/("""{"""),format.raw/*69.42*/("""
				"""),format.raw/*70.5*/("""statusChangeCallback(response);
				if (response.status === 'connected') """),format.raw/*71.42*/("""{"""),format.raw/*71.43*/("""
					"""),format.raw/*72.6*/("""// Logged into your app and Facebook.
					console.log('Logged in!');
					var login = document.getElementById("login");
					//login.style.display = 'none';
					login.innerHTML = '<li id="login"><a onclick="FB.logout(function(response) """),format.raw/*76.81*/("""{"""),format.raw/*76.82*/("""}"""),format.raw/*76.83*/("""); location.reload();" class="button big icon fa-arrow-circle-right">Logga ut</a></li>';
					var welcomeText = document.getElementById("welcome-text");
					FB.api('/me', function(response) """),format.raw/*78.39*/("""{"""),format.raw/*78.40*/("""
						"""),format.raw/*79.7*/("""console.log(response);
						welcomeText.innerHTML = "Välkommen till Festivalkampen " + response.first_name + "!";
						//Här vill vi köra updateUserTable()
				        var updateDatabase = function() """),format.raw/*82.45*/("""{"""),format.raw/*82.46*/("""
				            """),format.raw/*83.17*/("""var userId = ""+response.id;
				            var userGender = ""+response.gender;
				            var userFullName = ""+response.first_name+" "+response.last_name;
				            var userEmail = ""+response.email;
				            console.log(userId);
				            console.log(userGender);
				            console.log(userFullName);
				            console.log(userEmail);
                            jsRoutes.controllers.Application.updateUserTable(userId, userGender, userFullName, userEmail).ajax("""),format.raw/*91.128*/("""{"""),format.raw/*91.129*/("""
                                """),format.raw/*92.33*/("""success: function(data) """),format.raw/*92.57*/("""{"""),format.raw/*92.58*/("""
                                    """),format.raw/*93.37*/("""$("#result").html(data);
                                """),format.raw/*94.33*/("""}"""),format.raw/*94.34*/(""",
                                error: function() """),format.raw/*95.51*/("""{"""),format.raw/*95.52*/("""
                                    """),format.raw/*96.37*/("""alert("Problem med anslutningen till Facebook.")
                                """),format.raw/*97.33*/("""}"""),format.raw/*97.34*/("""
                            """),format.raw/*98.29*/("""}"""),format.raw/*98.30*/(""")
                        """),format.raw/*99.25*/("""}"""),format.raw/*99.26*/(""";
						updateDatabase();
					"""),format.raw/*101.6*/("""}"""),format.raw/*101.7*/(""");
				"""),format.raw/*102.5*/("""}"""),format.raw/*102.6*/(""" """),format.raw/*102.7*/("""else if (response.status === 'not_authorized') """),format.raw/*102.54*/("""{"""),format.raw/*102.55*/("""
					"""),format.raw/*103.6*/("""// The person is logged into Facebook, but not your app.
				"""),format.raw/*104.5*/("""}"""),format.raw/*104.6*/(""" """),format.raw/*104.7*/("""else """),format.raw/*104.12*/("""{"""),format.raw/*104.13*/("""
					"""),format.raw/*105.6*/("""// The person is not logged into Facebook, so we're not sure if
					// they are logged into this app or not.
				"""),format.raw/*107.5*/("""}"""),format.raw/*107.6*/("""
			"""),format.raw/*108.4*/("""}"""),format.raw/*108.5*/(""");
		"""),format.raw/*109.3*/("""}"""),format.raw/*109.4*/(""";
	    
		</script>
		<!-- Header -->
			<div id="header-wrapper">
				<header id="header" class="container">
				
					<!-- Logo -->
						<div id="logo">
							<h1><a href=""""),_display_(/*118.22*/routes/*118.28*/.Application.index()),format.raw/*118.48*/("""">Festivalkampen</a></h1>
							<span>av Grupp 11</span>
						</div>
					
					<!-- Nav -->
						<nav id="nav">
							<ul>
								<li class="current"><a name="toppen" href=""""),_display_(/*125.53*/routes/*125.59*/.Application.index()),format.raw/*125.79*/("""">Välkommen</a></li>
								<li>
											<a href=""""),_display_(/*127.22*/routes/*127.28*/.Application.spelhub()),format.raw/*127.50*/("""">Spel</a>
											<ul>
												<li><a href=""""),_display_(/*129.27*/routes/*129.33*/.Application.quizStart()),format.raw/*129.57*/("""">Quiz</a></li>
												<li><a href="#">Skyrim</a></li>
											</ul>
									
								</li>
								<li><a href=""""),_display_(/*134.23*/routes/*134.29*/.Application.gruppSida()),format.raw/*134.53*/("""">Gruppsida</a></li>
								<li><a href=""""),_display_(/*135.23*/routes/*135.29*/.Application.kontakta()),format.raw/*135.52*/("""">Kontakta oss</a></li>
							</ul>
						</nav>
					
				</header>
			</div>
		
		<!-- Banner -->
			<div id="banner-wrapper">
				<div id="banner" class="box container">
					<div class="row">
						<div class="7u">
							<h2 id="welcome-text">Välkommen till Festivalkampen!</h2>
							<p>Detta är en app som förgyller din vistelse hos oss.</p>
						</div>
						<div class="5u">
							<ul>
								<li id="login"><a href=""""),_display_(/*152.34*/routes/*152.40*/.Application.login()),format.raw/*152.60*/("""" class="button big icon fa-arrow-circle-right">Logga in</a></li>
								<li id="info"><a href="#" class="button alt big icon fa-question-circle">Mer info</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		
		<div id="instafeed" class="box container">
	    	<script type="text/javascript">
							var feed = new Instafeed("""),format.raw/*162.33*/("""{"""),format.raw/*162.34*/("""
							  """),format.raw/*163.10*/("""clientId: '6d41d581bf5542f583a285e8d4d9be0e',
								limit: 2,
								sortBy: 'most-liked',
								after: function () """),format.raw/*166.28*/("""{"""),format.raw/*166.29*/("""
							"""),format.raw/*167.8*/("""var images = $("#instafeed").find('a');
								$.each(images, function(index, image) """),format.raw/*168.47*/("""{"""),format.raw/*168.48*/("""
							"""),format.raw/*169.8*/("""var delay = (index * 5) + 'ms';
								$(image).css('-webkit-animation-delay', delay);
								$(image).css('-moz-animation-delay', delay);
								$(image).css('-ms-animation-delay', delay);
								$(image).css('-o-animation-delay', delay);
								$(image).css('animation-delay', delay);
								$(image).addClass('animated flipInX');
								"""),format.raw/*176.9*/("""}"""),format.raw/*176.10*/(""");
						"""),format.raw/*177.7*/("""}"""),format.raw/*177.8*/(""",
							template: '<a href=""""),format.raw/*178.28*/("""{"""),format.raw/*178.29*/("""{"""),format.raw/*178.30*/("""link"""),format.raw/*178.34*/("""}"""),format.raw/*178.35*/("""}"""),format.raw/*178.36*/("""" target="_blank"><img src=""""),format.raw/*178.64*/("""{"""),format.raw/*178.65*/("""{"""),format.raw/*178.66*/("""image"""),format.raw/*178.71*/("""}"""),format.raw/*178.72*/("""}"""),format.raw/*178.73*/("""" /><div class="likes">&hearts; """),format.raw/*178.105*/("""{"""),format.raw/*178.106*/("""{"""),format.raw/*178.107*/("""likes"""),format.raw/*178.112*/("""}"""),format.raw/*178.113*/("""}"""),format.raw/*178.114*/("""</div></a>'
					"""),format.raw/*179.6*/("""}"""),format.raw/*179.7*/(""");
						feed.run();
			</script>
		 </div>
		<!-- Features -->
			<div id="features-wrapper">
				<div class="container">
					<div class="row">
						<div class="4u">
						
							<!-- Box -->
								<section class="box feature">
								<h2 id="team-standings">Ställningarna just nu:</h2>
								<p id="red-points" style="color:red">Lag Röd:</p>
			                    <p id="blue-points" style="color:blue">Lag Blå:</p>
			                    <p id="black-points" style="color:black">Lag Svart:</p>
									<div id="canvas-holder">
			                <canvas id="chart-area" width="440" height="300"/>
            		    </div>
        <script>
        jsRoutes.controllers.Application.getTeamStandings().ajax("""),format.raw/*199.66*/("""{"""),format.raw/*199.67*/("""
            """),format.raw/*200.13*/("""success: function(data) """),format.raw/*200.37*/("""{"""),format.raw/*200.38*/("""
                """),format.raw/*201.17*/("""$("#result").html(data);
                console.log(data);
                var scalingRed = data.substring(0, data.indexOf('_'));
                var scalingBlue = data.substring((data.indexOf('_')+1), data.indexOf('-'));
                var scalingBlack = data.substring((data.indexOf('-')+1), data.indexOf('+'));
                var scalingRedInt = parseInt(scalingRed);
                var scalingBlueInt = parseInt(scalingBlue);
                var scalingBlackInt = parseInt(scalingBlack);
                console.log(scalingRedInt);
                	var pieData = [
				"""),format.raw/*211.5*/("""{"""),format.raw/*211.6*/("""
					"""),format.raw/*212.6*/("""value: scalingRedInt,
					color:"#FF0000",
					highlight: "#FF3333",
					label: "Röda laget!"
				"""),format.raw/*216.5*/("""}"""),format.raw/*216.6*/(""",
				"""),format.raw/*217.5*/("""{"""),format.raw/*217.6*/("""
					"""),format.raw/*218.6*/("""value: scalingBlueInt,
					color: "#0000FF",
					highlight: "#4D4DFF",
					label: "Blå laget!"
				"""),format.raw/*222.5*/("""}"""),format.raw/*222.6*/(""",
				"""),format.raw/*223.5*/("""{"""),format.raw/*223.6*/("""
					"""),format.raw/*224.6*/("""value: scalingBlackInt,
					color: "#191919",
					highlight: "#474747",
					label: "Svarta laget!"
				"""),format.raw/*228.5*/("""}"""),format.raw/*228.6*/(""",

			];
            var redPoints = document.getElementById("red-points");
            var bluePoints = document.getElementById("blue-points");
            var blackPoints = document.getElementById("black-points");
            redPoints.innerHTML = "Lag Röd: "+scalingRedInt+" poäng!";
            bluePoints.innerHTML = "Lag Blå: "+scalingBlueInt+" poäng!";
            blackPoints.innerHTML ="Lag Svart: "+scalingBlackInt+" poäng!";
			loadPieChart = function()"""),format.raw/*237.29*/("""{"""),format.raw/*237.30*/("""
				"""),format.raw/*238.5*/("""var ctx = document.getElementById("chart-area").getContext("2d");
				window.myPie = new Chart(ctx).Pie(pieData);
			"""),format.raw/*240.4*/("""}"""),format.raw/*240.5*/(""";
			loadPieChart();
            """),format.raw/*242.13*/("""}"""),format.raw/*242.14*/(""",
            error: function() """),format.raw/*243.31*/("""{"""),format.raw/*243.32*/("""
                """),format.raw/*244.17*/("""alert("Problem uppstod vid hämtning av lagställningarna")
            """),format.raw/*245.13*/("""}"""),format.raw/*245.14*/("""
        """),format.raw/*246.9*/("""}"""),format.raw/*246.10*/(""")
		
        </script>
			</section>
				</div>
						<div class="4u">
						
							<!-- Box -->
								<section class="box feature">
									<a href="#" class="image featured"><img src=""""),_display_(/*255.56*/routes/*255.62*/.Assets.at("images/pic02.jpg")),format.raw/*255.92*/("""">
									<div class="inner">
										<header>
											<h2>Plats för text</h2>
											<p>Även bild kan redigeras</p>
										</header>
										<p>Informativ text.</p>
									</div>
								</section>

						</div>
		
						<div class="4u">
						
							<!-- Box -->
								<section class="box feature last">
									<a href=""""),_display_(/*271.20*/routes/*271.26*/.Application.gruppSida()),format.raw/*271.50*/("""" class="image featured"><img src=""""),_display_(/*271.86*/routes/*271.92*/.Assets.at("images/pic03.jpg")),format.raw/*271.122*/("""">
									<div class="inner">
										<header>
											<h2><a href=""""),_display_(/*274.26*/routes/*274.32*/.Application.gruppSida()),format.raw/*274.56*/("""">Klicka här för att komma till gruppsidan</a></h2>
											<p>Möt din grupp!</p>
										</header>
										<p>Chatta med gruppen!
										Se din grupps totala poäng!</p>
									</div>
								</section>

						</div>
					</div>
				</div>
			</div>

		<!-- Main -->
			<div id="main-wrapper">
				<div class="container">
					<div class="row">
						<div class="4u">
						
							<!-- Sidebar --> 
								<div id="sidebar">
									<section class="widget thumbnails">
										<h3>Logga in</h3>
										<div class="grid">
											<div class="row no-collapse 50%">
												<div class="6u"><a href="#" class="image fit"><img src=""""),_display_(/*299.70*/routes/*299.76*/.Assets.at("images/pic04.jpg")),format.raw/*299.106*/("""" alt="" /></a></div>
												<div class="6u"><a href="#" class="image fit"><img src=""""),_display_(/*300.70*/routes/*300.76*/.Assets.at("images/pic05.jpg")),format.raw/*300.106*/("""" alt="" /></a></div>
											</div>
											<div class="row no-collapse 50%">
												<div class="6u"><a href="#" class="image fit"><img src=""""),_display_(/*303.70*/routes/*303.76*/.Assets.at("images/pic06.jpg")),format.raw/*303.106*/("""" alt="" /></a></div>
												<div class="6u"><a href="#" class="image fit"><img src=""""),_display_(/*304.70*/routes/*304.76*/.Assets.at("images/pic07.jpg")),format.raw/*304.106*/("""" alt="" /></a></div>
											</div>
										</div>
										<a href="#" class="button icon fa-file-text-o">Glömt lösenord</a>
									</section>
								</div>
						
						</div>
						<div class="8u important(collapse)"> 
                        
							<!-- Content -->
								<div id="content">
									<section class="last">
										<h2>Om Festivalkampen</h2>
										<p>Det är en app som är framtagen av ett par studenter vars intresse är vädligt uppskattad av universiteten.</p>
										<a href="#" class="button icon fa-arrow-circle-right">Läs mer</a>
									</section>
								</div>

						</div>
					</div>
				</div>
			</div>

		<!-- Footer -->
			<div id="footer-wrapper">
				<footer id="footer" class="container">
					<div class="row">
						<div class="3u">
						
							<!-- Links -->
								<section class="widget links">
									<h3>Vad som helst1</h3>
									<ul class="style2">
										<li><a href="#">Text alt. länk - rad1, kolumn 1</a></li>
										<li>Text alt. länk - rad2, kolumn 1</li>
										<li>Text alt. länk - rad3, kolumn 1</li>
									</ul>
								</section>
						
						</div>
						<div class="3u">
						
							<!-- Links -->
								<section class="widget links">
									<h3>Vad som helst2</h3>
									<ul class="style2">
										<li><a href=""""),_display_(/*351.25*/routes/*351.31*/.Application.gruppSida()),format.raw/*351.55*/("""">Klicka här för att komma till gruppsidan</a></li>
										<li>Text alt. länk - rad2, kolumn 2</li>
									</ul>
								</section>
						
						</div>
						<div class="3u">
						
							<!-- Links -->
								<section class="widget links">
									<h3><a href="#toppen">Tillbaka till början</a></h3>
									<ul class="style2">
										<li><a href="#">Tillbaka till toppen</a></li>
									</ul>
								</section>
						
						</div>
						<div class="3u">
						
							<!-- Contact -->
								<section class="widget contact last">
									<h3><a name=""""),_display_(/*372.24*/routes/*372.30*/.Application.kontakta()),format.raw/*372.53*/(""""> Kontakta oss</a></h3>
									<ul>
										<li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
										<li><a href="http://facebook.com/festivalkampen" class="icon fa-facebook" target="_blank"><span class="label">Facebook</span></a></li>
										<li><a href="#" class="icon fa-instagram"><span class="label">Instagram</span></a></li>
									</ul>
									<p>Stockholms Universitet<br />
									Borgarfjordsgatan 12, 164 55 Kista<br />
									Sweden</p>
								</section>
						
						</div>
					</div>
					<div class="row">
						<div class="12u">
							<div id="copyright">
								<ul class="menu">
									<li>&copy; Festivalkampen. All rights reserved</li><li>Grupp 11</li>
								</ul>
							</div>
						</div>
					</div>
				</footer>
			</div>

	</body>
</html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue May 12 11:51:54 CEST 2015
                  SOURCE: C:/Users/svett_000/Documents/GitHub/testApp/app/views/index.scala.html
                  HASH: 9518d6b8a9713cba2ff62576bc65a8c9d75609a2
                  MATRIX: 852->0|1077->215|1112->263|1141->265|1383->480|1398->486|1464->531|1532->572|1547->578|1608->618|1664->647|1679->653|1750->703|1806->732|1821->738|1880->776|1936->805|1951->811|2017->856|2073->885|2088->891|2143->925|2199->954|2214->960|2276->1001|2332->1030|2347->1036|2407->1075|2463->1104|2478->1110|2534->1145|2612->1196|2627->1202|2677->1231|2769->1296|2784->1302|2844->1341|3073->1542|3102->1543|3136->1550|3271->1657|3300->1658|3345->1675|3397->1699|3426->1700|3475->1721|3544->1762|3573->1763|3637->1799|3666->1800|3715->1821|3794->1872|3823->1873|3864->1886|3893->1887|3930->1897|3959->1898|4128->2039|4157->2040|4188->2044|4224->2052|4253->2053|4285->2058|4548->2294|4576->2295|5179->2870|5208->2871|5240->2876|5341->2949|5370->2950|5403->2956|5669->3194|5698->3195|5727->3196|5946->3387|5975->3388|6009->3395|6239->3597|6268->3598|6313->3615|6845->4118|6875->4119|6936->4152|6988->4176|7017->4177|7082->4214|7167->4271|7196->4272|7276->4324|7305->4325|7370->4362|7479->4443|7508->4444|7565->4473|7594->4474|7648->4500|7677->4501|7736->4532|7765->4533|7800->4540|7829->4541|7858->4542|7934->4589|7964->4590|7998->4596|8087->4657|8116->4658|8145->4659|8179->4664|8209->4665|8243->4671|8385->4785|8414->4786|8446->4790|8475->4791|8508->4796|8537->4797|8742->4974|8758->4980|8800->5000|9008->5180|9024->5186|9066->5206|9149->5261|9165->5267|9209->5289|9290->5342|9306->5348|9352->5372|9503->5495|9519->5501|9565->5525|9636->5568|9652->5574|9697->5597|10157->6029|10173->6035|10215->6055|10586->6397|10616->6398|10655->6408|10805->6529|10835->6530|10871->6538|10986->6624|11016->6625|11052->6633|11427->6980|11457->6981|11494->6990|11523->6991|11581->7020|11611->7021|11641->7022|11674->7026|11704->7027|11734->7028|11791->7056|11821->7057|11851->7058|11885->7063|11915->7064|11945->7065|12007->7097|12038->7098|12069->7099|12104->7104|12135->7105|12166->7106|12211->7123|12240->7124|12986->7841|13016->7842|13058->7855|13111->7879|13141->7880|13187->7897|13792->8474|13821->8475|13855->8481|13984->8582|14013->8583|14047->8589|14076->8590|14110->8596|14240->8698|14269->8699|14303->8705|14332->8706|14366->8712|14500->8818|14529->8819|15022->9283|15052->9284|15085->9289|15230->9406|15259->9407|15321->9440|15351->9441|15412->9473|15442->9474|15488->9491|15587->9561|15617->9562|15654->9571|15684->9572|15903->9763|15919->9769|15971->9799|16345->10145|16361->10151|16407->10175|16471->10211|16487->10217|16540->10247|16644->10323|16660->10329|16706->10353|17389->11008|17405->11014|17458->11044|17577->11135|17593->11141|17646->11171|17828->11325|17844->11331|17897->11361|18016->11452|18032->11458|18085->11488|19438->12813|19454->12819|19500->12843|20099->13414|20115->13420|20160->13443
                  LINES: 30->1|38->10|38->11|38->11|42->15|42->15|42->15|43->16|43->16|43->16|44->17|44->17|44->17|45->18|45->18|45->18|46->19|46->19|46->19|47->20|47->20|47->20|48->21|48->21|48->21|49->22|49->22|49->22|50->23|50->23|50->23|51->24|51->24|51->24|53->26|53->26|53->26|60->33|60->33|61->34|62->35|62->35|63->36|63->36|63->36|64->37|65->38|65->38|66->39|66->39|67->40|68->41|68->41|69->42|69->42|70->43|70->43|75->48|75->48|76->49|76->49|76->49|77->50|82->55|82->55|96->69|96->69|97->70|98->71|98->71|99->72|103->76|103->76|103->76|105->78|105->78|106->79|109->82|109->82|110->83|118->91|118->91|119->92|119->92|119->92|120->93|121->94|121->94|122->95|122->95|123->96|124->97|124->97|125->98|125->98|126->99|126->99|128->101|128->101|129->102|129->102|129->102|129->102|129->102|130->103|131->104|131->104|131->104|131->104|131->104|132->105|134->107|134->107|135->108|135->108|136->109|136->109|145->118|145->118|145->118|152->125|152->125|152->125|154->127|154->127|154->127|156->129|156->129|156->129|161->134|161->134|161->134|162->135|162->135|162->135|179->152|179->152|179->152|189->162|189->162|190->163|193->166|193->166|194->167|195->168|195->168|196->169|203->176|203->176|204->177|204->177|205->178|205->178|205->178|205->178|205->178|205->178|205->178|205->178|205->178|205->178|205->178|205->178|205->178|205->178|205->178|205->178|205->178|205->178|206->179|206->179|226->199|226->199|227->200|227->200|227->200|228->201|238->211|238->211|239->212|243->216|243->216|244->217|244->217|245->218|249->222|249->222|250->223|250->223|251->224|255->228|255->228|264->237|264->237|265->238|267->240|267->240|269->242|269->242|270->243|270->243|271->244|272->245|272->245|273->246|273->246|282->255|282->255|282->255|298->271|298->271|298->271|298->271|298->271|298->271|301->274|301->274|301->274|326->299|326->299|326->299|327->300|327->300|327->300|330->303|330->303|330->303|331->304|331->304|331->304|378->351|378->351|378->351|399->372|399->372|399->372
                  -- GENERATED --
              */
          