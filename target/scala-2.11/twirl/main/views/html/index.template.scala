
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
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE HTML>
<!--
	PVT 15 - Grupp 11
    Anledningen till varför det står på engelska är pga arbetsskada haha!!
    Har även mycket automatgenererad kod via Dreamweaver. 
-->
<html>
	<head>
		<title>Festivalkampen</title>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<!--[if lte IE 8]><script src=""""),_display_(/*13.35*/routes/*13.41*/.Assets.at("stylesheets/css/ie/html5shiv.js")),format.raw/*13.86*/(""""></script><![endif]-->
		<script  src=""""),_display_(/*14.18*/routes/*14.24*/.Assets.at("/javascripts/jquery.min.js")),format.raw/*14.64*/(""""></script>
		<script  src=""""),_display_(/*15.18*/routes/*15.24*/.Assets.at("/javascripts/jquery.dropotron.min.js")),format.raw/*15.74*/(""""></script>
		<script  src=""""),_display_(/*16.18*/routes/*16.24*/.Assets.at("/javascripts/skel.min.js")),format.raw/*16.62*/(""""></script>
		<script  src=""""),_display_(/*17.18*/routes/*17.24*/.Assets.at("/javascripts/skel-layers.min.js")),format.raw/*17.69*/(""""></script>
		<script  src=""""),_display_(/*18.18*/routes/*18.24*/.Assets.at("/javascripts/init.js")),format.raw/*18.58*/(""""></script>
		<script  src=""""),_display_(/*19.18*/routes/*19.24*/.Assets.at("/javascripts/facebookSDK.js")),format.raw/*19.65*/(""""></script>
		
		<!--[if lte IE 8]><link rel="stylesheet" href=""""),_display_(/*21.51*/routes/*21.57*/.Assets.at("stylesheets/css/ie/v8.css")),format.raw/*21.96*/("""" /><![endif]-->
	</head>
	<body class="homepage">
	<script>
	window.fbAsyncInit = function() """),format.raw/*25.34*/("""{"""),format.raw/*25.35*/("""
			"""),format.raw/*26.4*/("""FB.init("""),format.raw/*26.12*/("""{"""),format.raw/*26.13*/("""
				"""),format.raw/*27.5*/("""appId      : '909582695765355',
				cookie     : true,  // enable cookies to allow the server to access 
									// the session
				xfbml      : true,  // parse social plugins on this page
				version    : 'v2.2' // use version 2.2
			"""),format.raw/*32.4*/("""}"""),format.raw/*32.5*/(""");
	
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
			
			FB.getLoginStatus(function(response) """),format.raw/*46.41*/("""{"""),format.raw/*46.42*/("""
				"""),format.raw/*47.5*/("""statusChangeCallback(response);
				if (response.status === 'connected') """),format.raw/*48.42*/("""{"""),format.raw/*48.43*/("""
					"""),format.raw/*49.6*/("""// Logged into your app and Facebook.
					console.log('Logged in!');
					var login = document.getElementById("login");
					//login.style.display = 'none';
					login.innerHTML = '<li id="login"><a onclick="FB.logout(function(response) """),format.raw/*53.81*/("""{"""),format.raw/*53.82*/("""}"""),format.raw/*53.83*/(""");" class="button big icon fa-arrow-circle-right">Logga ut</a></li>';
					var welcomeText = document.getElementById("welcome-text");
					FB.api('/me', function(response) """),format.raw/*55.39*/("""{"""),format.raw/*55.40*/("""
						"""),format.raw/*56.7*/("""console.log(response);
						welcomeText.innerHTML = "Välkommen till Festivalkampen " + response.first_name + "!";
						"""),format.raw/*58.7*/("""}"""),format.raw/*58.8*/(""");
					
				"""),format.raw/*60.5*/("""}"""),format.raw/*60.6*/(""" """),format.raw/*60.7*/("""else if (response.status === 'not_authorized') """),format.raw/*60.54*/("""{"""),format.raw/*60.55*/("""
					"""),format.raw/*61.6*/("""// The person is logged into Facebook, but not your app.
				"""),format.raw/*62.5*/("""}"""),format.raw/*62.6*/(""" """),format.raw/*62.7*/("""else """),format.raw/*62.12*/("""{"""),format.raw/*62.13*/("""
					"""),format.raw/*63.6*/("""// The person is not logged into Facebook, so we're not sure if
					// they are logged into this app or not.
				"""),format.raw/*65.5*/("""}"""),format.raw/*65.6*/("""
			"""),format.raw/*66.4*/("""}"""),format.raw/*66.5*/(""");
		"""),format.raw/*67.3*/("""}"""),format.raw/*67.4*/(""";
		</script>
		<!-- Header -->
			<div id="header-wrapper">
				<header id="header" class="container">
				
					<!-- Logo -->
						<div id="logo">
							<h1><a href="index.scala.html">Festivalkampen</a></h1>
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
								<li id="login"><a href=""""),_display_(/*114.34*/routes/*114.40*/.Application.login()),format.raw/*114.60*/("""" class="button big icon fa-arrow-circle-right">Logga in</a></li>
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
									 <a href="#" class="image featured"><img src=""""),_display_(/*130.57*/routes/*130.63*/.Assets.at("images/pic01.jpg")),format.raw/*130.93*/("""">
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
									<a href="#" class="image featured"><img src=""""),_display_(/*145.56*/routes/*145.62*/.Assets.at("images/pic02.jpg")),format.raw/*145.92*/("""">
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
									<a href="#" class="image featured"><img src=""""),_display_(/*160.56*/routes/*160.62*/.Assets.at("images/pic03.jpg")),format.raw/*160.92*/(""""/>
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
												<div class="6u"><a href="#" class="image fit"><img src=""""),_display_(/*187.70*/routes/*187.76*/.Assets.at("images/pic04.jpg")),format.raw/*187.106*/("""" alt="" /></a></div>
												<div class="6u"><a href="#" class="image fit"><img src=""""),_display_(/*188.70*/routes/*188.76*/.Assets.at("images/pic05.jpg")),format.raw/*188.106*/("""" alt="" /></a></div>
											</div>
											<div class="row no-collapse 50%">
												<div class="6u"><a href="#" class="image fit"><img src=""""),_display_(/*191.70*/routes/*191.76*/.Assets.at("images/pic06.jpg")),format.raw/*191.106*/("""" alt="" /></a></div>
												<div class="6u"><a href="#" class="image fit"><img src=""""),_display_(/*192.70*/routes/*192.76*/.Assets.at("images/pic07.jpg")),format.raw/*192.106*/("""" alt="" /></a></div>
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
                  DATE: Tue May 05 08:35:12 CEST 2015
                  SOURCE: C:/Users/Henrik/Desktop/activator-1.3.2-minimal/testApp/app/views/index.scala.html
                  HASH: 32eebcb0b1baee34aad0275be21a9d32fa33eb91
                  MATRIX: 798->0|1247->422|1262->428|1328->473|1397->515|1412->521|1473->561|1530->591|1545->597|1616->647|1673->677|1688->683|1747->721|1804->751|1819->757|1885->802|1942->832|1957->838|2012->872|2069->902|2084->908|2146->949|2240->1016|2255->1022|2315->1061|2441->1159|2470->1160|2502->1165|2538->1173|2567->1174|2600->1180|2868->1421|2896->1422|3513->2011|3542->2012|3575->2018|3677->2092|3706->2093|3740->2100|4010->2342|4039->2343|4068->2344|4270->2518|4299->2519|4334->2527|4484->2650|4512->2651|4554->2666|4582->2667|4610->2668|4685->2715|4714->2716|4748->2723|4837->2785|4865->2786|4893->2787|4926->2792|4955->2793|4989->2800|5132->2916|5160->2917|5192->2922|5220->2923|5253->2929|5281->2930|6643->4264|6659->4270|6701->4290|7218->4779|7234->4785|7286->4815|7703->5204|7719->5210|7771->5240|8193->5634|8209->5640|8261->5670|8974->6355|8990->6361|9043->6391|9163->6483|9179->6489|9232->6519|9417->6676|9433->6682|9486->6712|9606->6804|9622->6810|9675->6840
                  LINES: 29->1|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|49->21|49->21|49->21|53->25|53->25|54->26|54->26|54->26|55->27|60->32|60->32|74->46|74->46|75->47|76->48|76->48|77->49|81->53|81->53|81->53|83->55|83->55|84->56|86->58|86->58|88->60|88->60|88->60|88->60|88->60|89->61|90->62|90->62|90->62|90->62|90->62|91->63|93->65|93->65|94->66|94->66|95->67|95->67|142->114|142->114|142->114|158->130|158->130|158->130|173->145|173->145|173->145|188->160|188->160|188->160|215->187|215->187|215->187|216->188|216->188|216->188|219->191|219->191|219->191|220->192|220->192|220->192
                  -- GENERATED --
              */
          