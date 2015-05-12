
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
                  DATE: Tue May 12 12:14:12 CEST 2015
                  SOURCE: C:/Users/svett_000/Documents/GitHub/testApp/app/views/index.scala.html
                  HASH: fc66ea2e331f13f9bd7f17811c8485a38430af06
                  MATRIX: 852->0|1085->224|1120->273|1149->275|1395->494|1410->500|1476->545|1545->587|1560->593|1621->633|1678->663|1693->669|1764->719|1821->749|1836->755|1895->793|1952->823|1967->829|2033->874|2090->904|2105->910|2160->944|2217->974|2232->980|2294->1021|2351->1051|2366->1057|2426->1096|2483->1126|2498->1132|2554->1167|2633->1219|2648->1225|2698->1254|2792->1321|2807->1327|2867->1366|3103->1574|3132->1575|3167->1583|3303->1691|3332->1692|3378->1710|3430->1734|3459->1735|3509->1757|3579->1799|3608->1800|3673->1837|3702->1838|3752->1860|3832->1912|3861->1913|3903->1927|3932->1928|3970->1939|3999->1940|4173->2086|4202->2087|4234->2092|4270->2100|4299->2101|4332->2107|4600->2348|4628->2349|5245->2938|5274->2939|5307->2945|5409->3019|5438->3020|5472->3027|5742->3269|5771->3270|5800->3271|6021->3464|6050->3465|6085->3473|6318->3678|6347->3679|6393->3697|6933->4208|6963->4209|7025->4243|7077->4267|7106->4268|7172->4306|7258->4364|7287->4365|7368->4418|7397->4419|7463->4457|7573->4539|7602->4540|7660->4570|7689->4571|7744->4598|7773->4599|7834->4632|7863->4633|7899->4641|7928->4642|7957->4643|8033->4690|8063->4691|8098->4698|8188->4760|8217->4761|8246->4762|8280->4767|8310->4768|8345->4775|8489->4891|8518->4892|8551->4897|8580->4898|8614->4904|8643->4905|8857->5091|8873->5097|8915->5117|9130->5304|9146->5310|9188->5330|9273->5387|9289->5393|9333->5415|9416->5470|9432->5476|9478->5500|9634->5628|9650->5634|9696->5658|9768->5702|9784->5708|9829->5731|10306->6180|10322->6186|10364->6206|10745->6558|10775->6559|10815->6570|10968->6694|10998->6695|11035->6704|11151->6791|11181->6792|11218->6801|11600->7155|11630->7156|11668->7166|11697->7167|11756->7197|11786->7198|11816->7199|11849->7203|11879->7204|11909->7205|11966->7233|11996->7234|12026->7235|12060->7240|12090->7241|12120->7242|12182->7274|12213->7275|12244->7276|12279->7281|12310->7282|12341->7283|12387->7301|12416->7302|13182->8039|13212->8040|13255->8054|13308->8078|13338->8079|13385->8097|14000->8684|14029->8685|14064->8692|14197->8797|14226->8798|14261->8805|14290->8806|14325->8813|14459->8919|14488->8920|14523->8927|14552->8928|14587->8935|14725->9045|14754->9046|15256->9519|15286->9520|15320->9526|15467->9645|15496->9646|15560->9681|15590->9682|15652->9715|15682->9716|15729->9734|15829->9805|15859->9806|15897->9816|15927->9817|16155->10017|16171->10023|16223->10053|16613->10415|16629->10421|16675->10445|16739->10481|16755->10487|16808->10517|16915->10596|16931->10602|16977->10626|17685->11306|17701->11312|17754->11342|17874->11434|17890->11440|17943->11470|18128->11627|18144->11633|18197->11663|18317->11755|18333->11761|18386->11791|19786->13163|19802->13169|19848->13193|20468->13785|20484->13791|20529->13814
                  LINES: 30->1|38->10|38->11|38->11|42->15|42->15|42->15|43->16|43->16|43->16|44->17|44->17|44->17|45->18|45->18|45->18|46->19|46->19|46->19|47->20|47->20|47->20|48->21|48->21|48->21|49->22|49->22|49->22|50->23|50->23|50->23|51->24|51->24|51->24|53->26|53->26|53->26|60->33|60->33|61->34|62->35|62->35|63->36|63->36|63->36|64->37|65->38|65->38|66->39|66->39|67->40|68->41|68->41|69->42|69->42|70->43|70->43|75->48|75->48|76->49|76->49|76->49|77->50|82->55|82->55|96->69|96->69|97->70|98->71|98->71|99->72|103->76|103->76|103->76|105->78|105->78|106->79|109->82|109->82|110->83|118->91|118->91|119->92|119->92|119->92|120->93|121->94|121->94|122->95|122->95|123->96|124->97|124->97|125->98|125->98|126->99|126->99|128->101|128->101|129->102|129->102|129->102|129->102|129->102|130->103|131->104|131->104|131->104|131->104|131->104|132->105|134->107|134->107|135->108|135->108|136->109|136->109|145->118|145->118|145->118|152->125|152->125|152->125|154->127|154->127|154->127|156->129|156->129|156->129|161->134|161->134|161->134|162->135|162->135|162->135|179->152|179->152|179->152|189->162|189->162|190->163|193->166|193->166|194->167|195->168|195->168|196->169|203->176|203->176|204->177|204->177|205->178|205->178|205->178|205->178|205->178|205->178|205->178|205->178|205->178|205->178|205->178|205->178|205->178|205->178|205->178|205->178|205->178|205->178|206->179|206->179|226->199|226->199|227->200|227->200|227->200|228->201|238->211|238->211|239->212|243->216|243->216|244->217|244->217|245->218|249->222|249->222|250->223|250->223|251->224|255->228|255->228|264->237|264->237|265->238|267->240|267->240|269->242|269->242|270->243|270->243|271->244|272->245|272->245|273->246|273->246|282->255|282->255|282->255|298->271|298->271|298->271|298->271|298->271|298->271|301->274|301->274|301->274|326->299|326->299|326->299|327->300|327->300|327->300|330->303|330->303|330->303|331->304|331->304|331->304|378->351|378->351|378->351|399->372|399->372|399->372
                  -- GENERATED --
              */
          