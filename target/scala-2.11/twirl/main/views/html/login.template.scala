
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
object login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE HTML>
<!--
	PVT 15 - Grupp 11
	OBS: För att kunna se login-knappen behöver man ansluta från en URL som är specificerad i Facebooks
	egen apputvecklingsmiljö. Jag kör för tillfället på http://people.dsv.su.se/~axna8273/login.html som
	hemsida. På den syns knappen men inte CSS:en. Använder den för att testa funktionalitet.
-->
<html>
	<head>
			"""),_display_(/*10.5*/Templates/*10.14*/.head()),format.raw/*10.21*/("""
		"""),format.raw/*11.3*/("""<script  src=""""),_display_(/*11.18*/routes/*11.24*/.Assets.at("/javascripts/facebookSDK.js")),format.raw/*11.65*/(""""></script>
		<script>
		window.fbAsyncInit = function() """),format.raw/*13.35*/("""{"""),format.raw/*13.36*/("""
			"""),format.raw/*14.4*/("""FB.init("""),format.raw/*14.12*/("""{"""),format.raw/*14.13*/("""
				"""),format.raw/*15.5*/("""appId      : '909582695765355',
				cookie     : true,  // enable cookies to allow the server to access 
									// the session
				xfbml      : true,  // parse social plugins on this page
				version    : 'v2.2' // use version 2.2
			"""),format.raw/*20.4*/("""}"""),format.raw/*20.5*/(""");
	
			FB.Event.subscribe('auth.login', function()"""),format.raw/*22.47*/("""{"""),format.raw/*22.48*/("""
			"""),format.raw/*23.4*/("""window.location.href = """"),_display_(/*23.29*/routes/*23.35*/.Application.index()),format.raw/*23.55*/("""";
			"""),format.raw/*24.4*/("""}"""),format.raw/*24.5*/(""");
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

			FB.getLoginStatus(function(response) """),format.raw/*37.41*/("""{"""),format.raw/*37.42*/("""
				"""),format.raw/*38.5*/("""statusChangeCallback(response);
				if (response.status === 'connected') """),format.raw/*39.42*/("""{"""),format.raw/*39.43*/("""
					"""),format.raw/*40.6*/("""// Logged into your app and Facebook.
					console.log('Logged in!');
					window.location = """"),_display_(/*42.26*/routes/*42.32*/.Application.index()),format.raw/*42.52*/("""";
				"""),format.raw/*43.5*/("""}"""),format.raw/*43.6*/(""" """),format.raw/*43.7*/("""else if (response.status === 'not_authorized') """),format.raw/*43.54*/("""{"""),format.raw/*43.55*/("""
					"""),format.raw/*44.6*/("""// The person is logged into Facebook, but not your app.
				"""),format.raw/*45.5*/("""}"""),format.raw/*45.6*/(""" """),format.raw/*45.7*/("""else """),format.raw/*45.12*/("""{"""),format.raw/*45.13*/("""
					"""),format.raw/*46.6*/("""// The person is not logged into Facebook, so we're not sure if
					// they are logged into this app or not.
				"""),format.raw/*48.5*/("""}"""),format.raw/*48.6*/("""
			"""),format.raw/*49.4*/("""}"""),format.raw/*49.5*/(""");
		"""),format.raw/*50.3*/("""}"""),format.raw/*50.4*/(""";
	</script>
	</head>
	<body class="login-page">

		<!-- Header -->
			
			"""),_display_(/*57.5*/Templates/*57.14*/.header()),format.raw/*57.23*/("""
		
		"""),format.raw/*59.3*/("""<!-- Main -->
			<div id="main-wrapper">
				<div class="container">
					<div class="row 200%">
						<div class="8u">
							<div id="login">
								<!-- Content -->
									<article>
										
										<h2>Logga in</h2>
										<p>För att kunna delta i Festivalkampen behöver du logga in med ditt Facebook-konto</p>
										<fb:login-button scope="public_profile,email" onlogin="checkLoginState();">
										</fb:login-button>
										<p>Om du inte har ett Facebook-konto kan du skapa ett <a href="http://www.facebook.com">här</a>
									</article>
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
										<li><a href="#">Text alt. l�nk - rad1, kolumn 1</a></li>
										<li>Text alt. l�nk - rad2, kolumn 1</li>
										<li>Text alt. l�nk - rad3, kolumn 1</li>
									</ul>
								</section>
						
						</div>
						<div class="3u">
						
							<!-- Links -->
								<section class="widget links">
									<h3>Vad som helst2</h3>
									<ul class="style2">
										<li><a href="#">Text alt. l�nk - rad1, kolumn 2</a></li>
										<li>Text alt. l�nk - rad2, kolumn 2</li>
									</ul>
								</section>
						
						</div>
						<div class="3u">
						
							<!-- Links -->
								<section class="widget links">
									<h3>Vad som helst3</h3>
									<ul class="style2">
										<li><a href="#">Text alt. l�nk - rad1, kolumn 3</a></li>
									</ul>
								</section>
						
						</div>
						<div class="3u">
						
							<!-- Contact -->
								"""),_display_(/*123.10*/Templates/*123.19*/.kontakta()),format.raw/*123.30*/("""

	"""),format.raw/*125.2*/("""</body>
</html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 18 13:10:40 CEST 2015
                  SOURCE: C:/Users/Henrik/Desktop/activator-1.3.2-minimal/testApp/app/views/login.scala.html
                  HASH: ecaf9773b40c4c517f38e2180cb7ea7121af7e60
                  MATRIX: 798->0|1189->365|1207->374|1235->381|1266->385|1308->400|1323->406|1385->447|1472->506|1501->507|1533->512|1569->520|1598->521|1631->527|1899->768|1927->769|2008->822|2037->823|2069->828|2121->853|2136->859|2177->879|2211->886|2239->887|2850->1470|2879->1471|2912->1477|3014->1551|3043->1552|3077->1559|3201->1656|3216->1662|3257->1682|3292->1690|3320->1691|3348->1692|3423->1739|3452->1740|3486->1747|3575->1809|3603->1810|3631->1811|3664->1816|3693->1817|3727->1824|3870->1940|3898->1941|3930->1946|3958->1947|3991->1953|4019->1954|4128->2037|4146->2046|4176->2055|4211->2063|6081->3905|6100->3914|6133->3925|6166->3930
                  LINES: 29->1|38->10|38->10|38->10|39->11|39->11|39->11|39->11|41->13|41->13|42->14|42->14|42->14|43->15|48->20|48->20|50->22|50->22|51->23|51->23|51->23|51->23|52->24|52->24|65->37|65->37|66->38|67->39|67->39|68->40|70->42|70->42|70->42|71->43|71->43|71->43|71->43|71->43|72->44|73->45|73->45|73->45|73->45|73->45|74->46|76->48|76->48|77->49|77->49|78->50|78->50|85->57|85->57|85->57|87->59|151->123|151->123|151->123|153->125
                  -- GENERATED --
              */
          