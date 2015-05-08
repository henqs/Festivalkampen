
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
		<script type="text/javascript" src=""""),_display_(/*22.40*/routes/*22.46*/.Application.javascriptRoutes),format.raw/*22.75*/(""""></script>
		
		<!--[if lte IE 8]><link rel="stylesheet" href=""""),_display_(/*24.51*/routes/*24.57*/.Assets.at("stylesheets/css/ie/v8.css")),format.raw/*24.96*/("""" /><![endif]-->
	</head>
	<body class="homepage">
	<!--DET HÄR ÄR POÄNGGIVARTESTER-->
	<input type='button' value='Ge Axel 10 poäng' id='givePointsBtn' />
	
	<script>
	    var givePoints = function() """),format.raw/*31.34*/("""{"""),format.raw/*31.35*/("""
		    """),format.raw/*32.7*/("""var userId = "628246407306132";
            jsRoutes.controllers.Application.givePoints(userId, "10").ajax("""),format.raw/*33.76*/("""{"""),format.raw/*33.77*/("""
                """),format.raw/*34.17*/("""success: function(data) """),format.raw/*34.41*/("""{"""),format.raw/*34.42*/("""
                    """),format.raw/*35.21*/("""$("#result").html(data);
                """),format.raw/*36.17*/("""}"""),format.raw/*36.18*/(""",
                error: function() """),format.raw/*37.35*/("""{"""),format.raw/*37.36*/("""
                    """),format.raw/*38.21*/("""alert("Problem med att ge poäng.")
                """),format.raw/*39.17*/("""}"""),format.raw/*39.18*/("""
            """),format.raw/*40.13*/("""}"""),format.raw/*40.14*/(""")
        """),format.raw/*41.9*/("""}"""),format.raw/*41.10*/(""";
        $('#givePointsBtn').click(givePoints);
	</script>
	<!--HÄR TAR POÄNGGIVARTESTET SLUT-->
	<script>
	window.fbAsyncInit = function() """),format.raw/*46.34*/("""{"""),format.raw/*46.35*/("""
			"""),format.raw/*47.4*/("""FB.init("""),format.raw/*47.12*/("""{"""),format.raw/*47.13*/("""
				"""),format.raw/*48.5*/("""appId      : '909582695765355',
				cookie     : true,  // enable cookies to allow the server to access 
									// the session
				xfbml      : true,  // parse social plugins on this page
				version    : 'v2.2' // use version 2.2
			"""),format.raw/*53.4*/("""}"""),format.raw/*53.5*/(""");
	
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
			
			FB.getLoginStatus(function(response) """),format.raw/*67.41*/("""{"""),format.raw/*67.42*/("""
				"""),format.raw/*68.5*/("""statusChangeCallback(response);
				if (response.status === 'connected') """),format.raw/*69.42*/("""{"""),format.raw/*69.43*/("""
					"""),format.raw/*70.6*/("""// Logged into your app and Facebook.
					console.log('Logged in!');
					var login = document.getElementById("login");
					//login.style.display = 'none';
					login.innerHTML = '<li id="login"><a onclick="FB.logout(function(response) """),format.raw/*74.81*/("""{"""),format.raw/*74.82*/("""}"""),format.raw/*74.83*/("""); location.reload();" class="button big icon fa-arrow-circle-right">Logga ut</a></li>';
					var welcomeText = document.getElementById("welcome-text");
					FB.api('/me', function(response) """),format.raw/*76.39*/("""{"""),format.raw/*76.40*/("""
						"""),format.raw/*77.7*/("""console.log(response);
						welcomeText.innerHTML = "Välkommen till Festivalkampen " + response.first_name + "!";
						//Här vill vi köra updateUserTable()
				        var updateDatabase = function() """),format.raw/*80.45*/("""{"""),format.raw/*80.46*/("""
				            """),format.raw/*81.17*/("""var userId = ""+response.id;
				            var userGender = ""+response.gender;
				            var userFullName = ""+response.first_name+" "+response.last_name;
				            var userEmail = ""+response.email;
				            console.log(userId);
				            console.log(userGender);
				            console.log(userFullName);
				            console.log(userEmail);
                            jsRoutes.controllers.Application.updateUserTable(userId, userGender, userFullName, userEmail).ajax("""),format.raw/*89.128*/("""{"""),format.raw/*89.129*/("""
                                """),format.raw/*90.33*/("""success: function(data) """),format.raw/*90.57*/("""{"""),format.raw/*90.58*/("""
                                    """),format.raw/*91.37*/("""$("#result").html(data);
                                """),format.raw/*92.33*/("""}"""),format.raw/*92.34*/(""",
                                error: function() """),format.raw/*93.51*/("""{"""),format.raw/*93.52*/("""
                                    """),format.raw/*94.37*/("""alert("Problem med anslutningen till Facebook.")
                                """),format.raw/*95.33*/("""}"""),format.raw/*95.34*/("""
                            """),format.raw/*96.29*/("""}"""),format.raw/*96.30*/(""")
                        """),format.raw/*97.25*/("""}"""),format.raw/*97.26*/(""";
						updateDatabase();
					"""),format.raw/*99.6*/("""}"""),format.raw/*99.7*/(""");
				"""),format.raw/*100.5*/("""}"""),format.raw/*100.6*/(""" """),format.raw/*100.7*/("""else if (response.status === 'not_authorized') """),format.raw/*100.54*/("""{"""),format.raw/*100.55*/("""
					"""),format.raw/*101.6*/("""// The person is logged into Facebook, but not your app.
				"""),format.raw/*102.5*/("""}"""),format.raw/*102.6*/(""" """),format.raw/*102.7*/("""else """),format.raw/*102.12*/("""{"""),format.raw/*102.13*/("""
					"""),format.raw/*103.6*/("""// The person is not logged into Facebook, so we're not sure if
					// they are logged into this app or not.
				"""),format.raw/*105.5*/("""}"""),format.raw/*105.6*/("""
			"""),format.raw/*106.4*/("""}"""),format.raw/*106.5*/(""");
		"""),format.raw/*107.3*/("""}"""),format.raw/*107.4*/(""";
	    
		</script>
		<!-- Header -->
			<div id="header-wrapper">
				<header id="header" class="container">
				
					<!-- Logo -->
						<div id="logo">
							<h1><a href=""""),_display_(/*116.22*/routes/*116.28*/.Application.index()),format.raw/*116.48*/("""">Festivalkampen</a></h1>
							<span>av Grupp 11</span>
						</div>
					
					<!-- Nav -->
						<nav id="nav">
							<ul>
								<li class="current"><a href="index.scala.html">Välkommen</a></li>
								<li>
									<a href="">Droppmeny</a>
									<ul>
										<li><a href="#">Meny steg 1.1</a></li>
										<li><a href="#">Meny steg 1.2</a></li>
										<li>
											<a href="">Undermeny steg2</a>
											<ul>
												<li><a href="#">Test3.1</a></li>
												<li><a href="#">Test3.2</a></li>
											</ul>
									</ul>
								</li>
								<li><a href="right-sidebar.html">Senaste nytt</a></li>
								<li><a href="no-sidebar.html">Kontakta oss</a></li>
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
								<li id="login"><a href=""""),_display_(/*155.34*/routes/*155.40*/.Application.login()),format.raw/*155.60*/("""" class="button big icon fa-arrow-circle-right">Logga in</a></li>
								<li id="info"><a href="#" class="button alt big icon fa-question-circle">Mer info</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		
		<!-- Features -->
			<div id="features-wrapper">
				<div class="container">
					<div class="row">
						<div class="4u">
						
							<!-- Box -->
								<section class="box feature">
									 <a href="#" class="image featured"><img src=""""),_display_(/*171.57*/routes/*171.63*/.Assets.at("images/pic01.jpg")),format.raw/*171.93*/("""">
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
								<section class="box feature">
									<a href="#" class="image featured"><img src=""""),_display_(/*186.56*/routes/*186.62*/.Assets.at("images/pic02.jpg")),format.raw/*186.92*/("""">
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
									<a href="#" class="image featured"><img src=""""),_display_(/*201.56*/routes/*201.62*/.Assets.at("images/pic03.jpg")),format.raw/*201.92*/(""""/>
									<div class="inner">
										<header>
											<h2>Plats för text</h2>
											<p>Även bild kan redigeras</p>
										</header>
										<p>Informativ text.</p>
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
												<div class="6u"><a href="#" class="image fit"><img src=""""),_display_(/*228.70*/routes/*228.76*/.Assets.at("images/pic04.jpg")),format.raw/*228.106*/("""" alt="" /></a></div>
												<div class="6u"><a href="#" class="image fit"><img src=""""),_display_(/*229.70*/routes/*229.76*/.Assets.at("images/pic05.jpg")),format.raw/*229.106*/("""" alt="" /></a></div>
											</div>
											<div class="row no-collapse 50%">
												<div class="6u"><a href="#" class="image fit"><img src=""""),_display_(/*232.70*/routes/*232.76*/.Assets.at("images/pic06.jpg")),format.raw/*232.106*/("""" alt="" /></a></div>
												<div class="6u"><a href="#" class="image fit"><img src=""""),_display_(/*233.70*/routes/*233.76*/.Assets.at("images/pic07.jpg")),format.raw/*233.106*/("""" alt="" /></a></div>
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
										<li><a href="#">Text alt. länk - rad1, kolumn 2</a></li>
										<li>Text alt. länk - rad2, kolumn 2</li>
									</ul>
								</section>
						
						</div>
						<div class="3u">
						
							<!-- Links -->
								<section class="widget links">
									<h3>Vad som helst3</h3>
									<ul class="style2">
										<li><a href="#">Text alt. länk - rad1, kolumn 3</a></li>
									</ul>
								</section>
						
						</div>
						<div class="3u">
						
							<!-- Contact -->
								<section class="widget contact last">
									<h3>Kontakta oss</h3>
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
                  DATE: Fri May 08 11:37:59 CEST 2015
                  SOURCE: C:/Users/svett_000/Documents/GitHub/testApp-master/app/views/index.scala.html
                  HASH: 13198b3dd405d8e1df25ce1b12ee80b2ff94eb74
                  MATRIX: 852->0|1077->215|1112->263|1141->265|1383->480|1398->486|1464->531|1532->572|1547->578|1608->618|1664->647|1679->653|1750->703|1806->732|1821->738|1880->776|1936->805|1951->811|2017->856|2073->885|2088->891|2143->925|2199->954|2214->960|2276->1001|2354->1052|2369->1058|2419->1087|2511->1152|2526->1158|2586->1197|2815->1398|2844->1399|2878->1406|3013->1513|3042->1514|3087->1531|3139->1555|3168->1556|3217->1577|3286->1618|3315->1619|3379->1655|3408->1656|3457->1677|3536->1728|3565->1729|3606->1742|3635->1743|3672->1753|3701->1754|3870->1895|3899->1896|3930->1900|3966->1908|3995->1909|4027->1914|4290->2150|4318->2151|4921->2726|4950->2727|4982->2732|5083->2805|5112->2806|5145->2812|5411->3050|5440->3051|5469->3052|5688->3243|5717->3244|5751->3251|5981->3453|6010->3454|6055->3471|6587->3974|6617->3975|6678->4008|6730->4032|6759->4033|6824->4070|6909->4127|6938->4128|7018->4180|7047->4181|7112->4218|7221->4299|7250->4300|7307->4329|7336->4330|7390->4356|7419->4357|7477->4388|7505->4389|7540->4396|7569->4397|7598->4398|7674->4445|7704->4446|7738->4452|7827->4513|7856->4514|7885->4515|7919->4520|7949->4521|7983->4527|8125->4641|8154->4642|8186->4646|8215->4647|8248->4652|8277->4653|8482->4830|8498->4836|8540->4856|9669->5957|9685->5963|9727->5983|10228->6456|10244->6462|10296->6492|10698->6866|10714->6872|10766->6902|11173->7281|11189->7287|11241->7317|11927->7975|11943->7981|11996->8011|12115->8102|12131->8108|12184->8138|12366->8292|12382->8298|12435->8328|12554->8419|12570->8425|12623->8455
                  LINES: 30->1|38->10|38->11|38->11|42->15|42->15|42->15|43->16|43->16|43->16|44->17|44->17|44->17|45->18|45->18|45->18|46->19|46->19|46->19|47->20|47->20|47->20|48->21|48->21|48->21|49->22|49->22|49->22|51->24|51->24|51->24|58->31|58->31|59->32|60->33|60->33|61->34|61->34|61->34|62->35|63->36|63->36|64->37|64->37|65->38|66->39|66->39|67->40|67->40|68->41|68->41|73->46|73->46|74->47|74->47|74->47|75->48|80->53|80->53|94->67|94->67|95->68|96->69|96->69|97->70|101->74|101->74|101->74|103->76|103->76|104->77|107->80|107->80|108->81|116->89|116->89|117->90|117->90|117->90|118->91|119->92|119->92|120->93|120->93|121->94|122->95|122->95|123->96|123->96|124->97|124->97|126->99|126->99|127->100|127->100|127->100|127->100|127->100|128->101|129->102|129->102|129->102|129->102|129->102|130->103|132->105|132->105|133->106|133->106|134->107|134->107|143->116|143->116|143->116|182->155|182->155|182->155|198->171|198->171|198->171|213->186|213->186|213->186|228->201|228->201|228->201|255->228|255->228|255->228|256->229|256->229|256->229|259->232|259->232|259->232|260->233|260->233|260->233
                  -- GENERATED --
              */
          