
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
	<input type='button' value='+' id='testBtn' />
	<script type="text/javascript" charset="utf-8">
	  var test = function() """),format.raw/*29.26*/("""{"""),format.raw/*29.27*/("""
      """),format.raw/*30.7*/("""var s = "TEST";
      console.log(s);
      jsRoutes.controllers.Application.testMethod("Hejhejehej!!!").ajax("""),format.raw/*32.73*/("""{"""),format.raw/*32.74*/("""
        """),format.raw/*33.9*/("""success: function(data) """),format.raw/*33.33*/("""{"""),format.raw/*33.34*/("""
          """),format.raw/*34.11*/("""$("#result").html(data);
        """),format.raw/*35.9*/("""}"""),format.raw/*35.10*/(""",
        error: function() """),format.raw/*36.27*/("""{"""),format.raw/*36.28*/("""
          """),format.raw/*37.11*/("""alert("Error!")
        """),format.raw/*38.9*/("""}"""),format.raw/*38.10*/("""
      """),format.raw/*39.7*/("""}"""),format.raw/*39.8*/(""")
    """),format.raw/*40.5*/("""}"""),format.raw/*40.6*/(""";
    
    $('#testBtn').click(test);
	</script>
	<script>
	window.fbAsyncInit = function() """),format.raw/*45.34*/("""{"""),format.raw/*45.35*/("""
			"""),format.raw/*46.4*/("""FB.init("""),format.raw/*46.12*/("""{"""),format.raw/*46.13*/("""
				"""),format.raw/*47.5*/("""appId      : '909582695765355',
				cookie     : true,  // enable cookies to allow the server to access 
									// the session
				xfbml      : true,  // parse social plugins on this page
				version    : 'v2.2' // use version 2.2
			"""),format.raw/*52.4*/("""}"""),format.raw/*52.5*/(""");
	
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
			
			FB.getLoginStatus(function(response) """),format.raw/*66.41*/("""{"""),format.raw/*66.42*/("""
				"""),format.raw/*67.5*/("""statusChangeCallback(response);
				if (response.status === 'connected') """),format.raw/*68.42*/("""{"""),format.raw/*68.43*/("""
					"""),format.raw/*69.6*/("""// Logged into your app and Facebook.
					console.log('Logged in!');
					//Här vill vi köra updateUserTable()
					var login = document.getElementById("login");
					//login.style.display = 'none';
					login.innerHTML = '<li id="login"><a onclick="FB.logout(function(response) """),format.raw/*74.81*/("""{"""),format.raw/*74.82*/("""}"""),format.raw/*74.83*/("""); location.reload();" class="button big icon fa-arrow-circle-right">Logga ut</a></li>';
					var welcomeText = document.getElementById("welcome-text");
					FB.api('/me', function(response) """),format.raw/*76.39*/("""{"""),format.raw/*76.40*/("""
						"""),format.raw/*77.7*/("""console.log(response);
						welcomeText.innerHTML = "Välkommen till Festivalkampen " + response.first_name + "!";
						"""),format.raw/*79.7*/("""}"""),format.raw/*79.8*/(""");
				"""),format.raw/*80.5*/("""}"""),format.raw/*80.6*/(""" """),format.raw/*80.7*/("""else if (response.status === 'not_authorized') """),format.raw/*80.54*/("""{"""),format.raw/*80.55*/("""
					"""),format.raw/*81.6*/("""// The person is logged into Facebook, but not your app.
				"""),format.raw/*82.5*/("""}"""),format.raw/*82.6*/(""" """),format.raw/*82.7*/("""else """),format.raw/*82.12*/("""{"""),format.raw/*82.13*/("""
					"""),format.raw/*83.6*/("""// The person is not logged into Facebook, so we're not sure if
					// they are logged into this app or not.
				"""),format.raw/*85.5*/("""}"""),format.raw/*85.6*/("""
			"""),format.raw/*86.4*/("""}"""),format.raw/*86.5*/(""");
		"""),format.raw/*87.3*/("""}"""),format.raw/*87.4*/(""";
	    
		</script>
		<!-- Header -->
			<div id="header-wrapper">
				<header id="header" class="container">
				
					<!-- Logo -->
						<div id="logo">
							<h1><a href=""""),_display_(/*96.22*/routes/*96.28*/.Application.index()),format.raw/*96.48*/("""">Festivalkampen</a></h1>
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
								<li id="login"><a href=""""),_display_(/*135.34*/routes/*135.40*/.Application.login()),format.raw/*135.60*/("""" class="button big icon fa-arrow-circle-right">Logga in</a></li>
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
									 <a href="#" class="image featured"><img src=""""),_display_(/*151.57*/routes/*151.63*/.Assets.at("images/pic01.jpg")),format.raw/*151.93*/("""">
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
									<a href="#" class="image featured"><img src=""""),_display_(/*166.56*/routes/*166.62*/.Assets.at("images/pic02.jpg")),format.raw/*166.92*/("""">
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
									<a href="#" class="image featured"><img src=""""),_display_(/*181.56*/routes/*181.62*/.Assets.at("images/pic03.jpg")),format.raw/*181.92*/(""""/>
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
												<div class="6u"><a href="#" class="image fit"><img src=""""),_display_(/*208.70*/routes/*208.76*/.Assets.at("images/pic04.jpg")),format.raw/*208.106*/("""" alt="" /></a></div>
												<div class="6u"><a href="#" class="image fit"><img src=""""),_display_(/*209.70*/routes/*209.76*/.Assets.at("images/pic05.jpg")),format.raw/*209.106*/("""" alt="" /></a></div>
											</div>
											<div class="row no-collapse 50%">
												<div class="6u"><a href="#" class="image fit"><img src=""""),_display_(/*212.70*/routes/*212.76*/.Assets.at("images/pic06.jpg")),format.raw/*212.106*/("""" alt="" /></a></div>
												<div class="6u"><a href="#" class="image fit"><img src=""""),_display_(/*213.70*/routes/*213.76*/.Assets.at("images/pic07.jpg")),format.raw/*213.106*/("""" alt="" /></a></div>
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
                  DATE: Wed May 06 19:33:40 CEST 2015
                  SOURCE: C:/Users/svett_000/Documents/GitHub/testApp/app/views/index.scala.html
                  HASH: f36ae204e7677cf38bd877da52b823aeb5d6b269
                  MATRIX: 852->0|1085->224|1120->273|1149->275|1395->494|1410->500|1476->545|1545->587|1560->593|1621->633|1678->663|1693->669|1764->719|1821->749|1836->755|1895->793|1952->823|1967->829|2033->874|2090->904|2105->910|2160->944|2217->974|2232->980|2294->1021|2373->1073|2388->1079|2438->1108|2532->1175|2547->1181|2607->1220|2813->1398|2842->1399|2877->1407|3017->1519|3046->1520|3083->1530|3135->1554|3164->1555|3204->1567|3265->1601|3294->1602|3351->1631|3380->1632|3420->1644|3472->1669|3501->1670|3536->1678|3564->1679|3598->1686|3626->1687|3751->1784|3780->1785|3812->1790|3848->1798|3877->1799|3910->1805|4178->2046|4206->2047|4823->2636|4852->2637|4885->2643|4987->2717|5016->2718|5050->2725|5363->3010|5392->3011|5421->3012|5642->3205|5671->3206|5706->3214|5856->3337|5884->3338|5919->3346|5947->3347|5975->3348|6050->3395|6079->3396|6113->3403|6202->3465|6230->3466|6258->3467|6291->3472|6320->3473|6354->3480|6497->3596|6525->3597|6557->3602|6585->3603|6618->3609|6646->3610|6859->3796|6874->3802|6915->3822|8083->4962|8099->4968|8141->4988|8658->5477|8674->5483|8726->5513|9143->5902|9159->5908|9211->5938|9633->6332|9649->6338|9701->6368|10414->7053|10430->7059|10483->7089|10603->7181|10619->7187|10672->7217|10857->7374|10873->7380|10926->7410|11046->7502|11062->7508|11115->7538
                  LINES: 30->1|38->10|38->11|38->11|42->15|42->15|42->15|43->16|43->16|43->16|44->17|44->17|44->17|45->18|45->18|45->18|46->19|46->19|46->19|47->20|47->20|47->20|48->21|48->21|48->21|49->22|49->22|49->22|51->24|51->24|51->24|56->29|56->29|57->30|59->32|59->32|60->33|60->33|60->33|61->34|62->35|62->35|63->36|63->36|64->37|65->38|65->38|66->39|66->39|67->40|67->40|72->45|72->45|73->46|73->46|73->46|74->47|79->52|79->52|93->66|93->66|94->67|95->68|95->68|96->69|101->74|101->74|101->74|103->76|103->76|104->77|106->79|106->79|107->80|107->80|107->80|107->80|107->80|108->81|109->82|109->82|109->82|109->82|109->82|110->83|112->85|112->85|113->86|113->86|114->87|114->87|123->96|123->96|123->96|162->135|162->135|162->135|178->151|178->151|178->151|193->166|193->166|193->166|208->181|208->181|208->181|235->208|235->208|235->208|236->209|236->209|236->209|239->212|239->212|239->212|240->213|240->213|240->213
                  -- GENERATED --
              */
          