
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
		<script type="text/javascript" src=""""),_display_(/*23.40*/routes/*23.46*/.Application.javascriptRoutes),format.raw/*23.75*/(""""></script>
		
		<!--[if lte IE 8]><link rel="stylesheet" href=""""),_display_(/*25.51*/routes/*25.57*/.Assets.at("stylesheets/css/ie/v8.css")),format.raw/*25.96*/("""" /><![endif]-->
	</head>
	<body class="homepage">
	<!--DET HÄR ÄR POÄNGGIVARTESTER-->
	<input type='button' value='Ge Axel 10 poäng' id='givePointsBtn' />
	
	<script>
	    var givePoints = function() """),format.raw/*32.34*/("""{"""),format.raw/*32.35*/("""
		    """),format.raw/*33.7*/("""var userId = "628246407306132";
            jsRoutes.controllers.Application.givePoints(userId, "10").ajax("""),format.raw/*34.76*/("""{"""),format.raw/*34.77*/("""
                """),format.raw/*35.17*/("""success: function(data) """),format.raw/*35.41*/("""{"""),format.raw/*35.42*/("""
                    """),format.raw/*36.21*/("""$("#result").html(data);
                """),format.raw/*37.17*/("""}"""),format.raw/*37.18*/(""",
                error: function() """),format.raw/*38.35*/("""{"""),format.raw/*38.36*/("""
                    """),format.raw/*39.21*/("""alert("Problem med att ge poäng.")
                """),format.raw/*40.17*/("""}"""),format.raw/*40.18*/("""
            """),format.raw/*41.13*/("""}"""),format.raw/*41.14*/(""")
        """),format.raw/*42.9*/("""}"""),format.raw/*42.10*/(""";
        $('#givePointsBtn').click(givePoints);
	</script>
	<!--HÄR TAR POÄNGGIVARTESTET SLUT-->
	<script>
	window.fbAsyncInit = function() """),format.raw/*47.34*/("""{"""),format.raw/*47.35*/("""
			"""),format.raw/*48.4*/("""FB.init("""),format.raw/*48.12*/("""{"""),format.raw/*48.13*/("""
				"""),format.raw/*49.5*/("""appId      : '909582695765355',
				cookie     : true,  // enable cookies to allow the server to access 
									// the session
				xfbml      : true,  // parse social plugins on this page
				version    : 'v2.2' // use version 2.2
			"""),format.raw/*54.4*/("""}"""),format.raw/*54.5*/(""");
	
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
			
			FB.getLoginStatus(function(response) """),format.raw/*68.41*/("""{"""),format.raw/*68.42*/("""
				"""),format.raw/*69.5*/("""statusChangeCallback(response);
				if (response.status === 'connected') """),format.raw/*70.42*/("""{"""),format.raw/*70.43*/("""
					"""),format.raw/*71.6*/("""// Logged into your app and Facebook.
					console.log('Logged in!');
					var login = document.getElementById("login");
					//login.style.display = 'none';
					login.innerHTML = '<li id="login"><a onclick="FB.logout(function(response) """),format.raw/*75.81*/("""{"""),format.raw/*75.82*/("""}"""),format.raw/*75.83*/("""); location.reload();" class="button big icon fa-arrow-circle-right">Logga ut</a></li>';
					var welcomeText = document.getElementById("welcome-text");
					FB.api('/me', function(response) """),format.raw/*77.39*/("""{"""),format.raw/*77.40*/("""
						"""),format.raw/*78.7*/("""console.log(response);
						welcomeText.innerHTML = "Välkommen till Festivalkampen " + response.first_name + "!";
						//Här vill vi köra updateUserTable()
				        var updateDatabase = function() """),format.raw/*81.45*/("""{"""),format.raw/*81.46*/("""
				            """),format.raw/*82.17*/("""var userId = ""+response.id;
				            var userGender = ""+response.gender;
				            var userFullName = ""+response.first_name+" "+response.last_name;
				            var userEmail = ""+response.email;
				            console.log(userId);
				            console.log(userGender);
				            console.log(userFullName);
				            console.log(userEmail);
                            jsRoutes.controllers.Application.updateUserTable(userId, userGender, userFullName, userEmail).ajax("""),format.raw/*90.128*/("""{"""),format.raw/*90.129*/("""
                                """),format.raw/*91.33*/("""success: function(data) """),format.raw/*91.57*/("""{"""),format.raw/*91.58*/("""
                                    """),format.raw/*92.37*/("""$("#result").html(data);
                                """),format.raw/*93.33*/("""}"""),format.raw/*93.34*/(""",
                                error: function() """),format.raw/*94.51*/("""{"""),format.raw/*94.52*/("""
                                    """),format.raw/*95.37*/("""alert("Problem med anslutningen till Facebook.")
                                """),format.raw/*96.33*/("""}"""),format.raw/*96.34*/("""
                            """),format.raw/*97.29*/("""}"""),format.raw/*97.30*/(""")
                        """),format.raw/*98.25*/("""}"""),format.raw/*98.26*/(""";
						updateDatabase();
					"""),format.raw/*100.6*/("""}"""),format.raw/*100.7*/(""");
				"""),format.raw/*101.5*/("""}"""),format.raw/*101.6*/(""" """),format.raw/*101.7*/("""else if (response.status === 'not_authorized') """),format.raw/*101.54*/("""{"""),format.raw/*101.55*/("""
					"""),format.raw/*102.6*/("""// The person is logged into Facebook, but not your app.
				"""),format.raw/*103.5*/("""}"""),format.raw/*103.6*/(""" """),format.raw/*103.7*/("""else """),format.raw/*103.12*/("""{"""),format.raw/*103.13*/("""
					"""),format.raw/*104.6*/("""// The person is not logged into Facebook, so we're not sure if
					// they are logged into this app or not.
				"""),format.raw/*106.5*/("""}"""),format.raw/*106.6*/("""
			"""),format.raw/*107.4*/("""}"""),format.raw/*107.5*/(""");
		"""),format.raw/*108.3*/("""}"""),format.raw/*108.4*/(""";
	    
		</script>
		<!-- Header -->
			<div id="header-wrapper">
				<header id="header" class="container">
				
					<!-- Logo -->
						<div id="logo">
							<h1><a href=""""),_display_(/*117.22*/routes/*117.28*/.Application.index()),format.raw/*117.48*/("""">Festivalkampen</a></h1>
							<span>av Grupp 11</span>
						</div>
					
					<!-- Nav -->
						<nav id="nav">
							<ul>
								<li class="current"><a name="toppen" href=""""),_display_(/*124.53*/routes/*124.59*/.Application.index()),format.raw/*124.79*/("""">Välkommen</a></li>
								<li>
											<a href=""""),_display_(/*126.22*/routes/*126.28*/.Application.spelhub()),format.raw/*126.50*/("""">Spel</a>
											<ul>
												<li><a href=""""),_display_(/*128.27*/routes/*128.33*/.Application.quizStart()),format.raw/*128.57*/("""">Quiz</a></li>
												<li><a href="#">Skyrim</a></li>
											</ul>
									
								</li>
								<li><a href=""""),_display_(/*133.23*/routes/*133.29*/.Application.gruppSida()),format.raw/*133.53*/("""">Gruppsida</a></li>
								<li><a href=""""),_display_(/*134.23*/routes/*134.29*/.Application.kontakta()),format.raw/*134.52*/("""">Kontakta oss</a></li>
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
								<li id="login"><a href=""""),_display_(/*151.34*/routes/*151.40*/.Application.login()),format.raw/*151.60*/("""" class="button big icon fa-arrow-circle-right">Logga in</a></li>
								<li id="info"><a href="#" class="button alt big icon fa-question-circle">Mer info</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		
		<div id="instafeed" class="box container">
	    	<script type="text/javascript">
							var feed = new Instafeed("""),format.raw/*161.33*/("""{"""),format.raw/*161.34*/("""
							  """),format.raw/*162.10*/("""clientId: '6d41d581bf5542f583a285e8d4d9be0e',
								limit: 2,
								sortBy: 'most-liked',
								after: function () """),format.raw/*165.28*/("""{"""),format.raw/*165.29*/("""
							"""),format.raw/*166.8*/("""var images = $("#instafeed").find('a');
								$.each(images, function(index, image) """),format.raw/*167.47*/("""{"""),format.raw/*167.48*/("""
							"""),format.raw/*168.8*/("""var delay = (index * 5) + 'ms';
								$(image).css('-webkit-animation-delay', delay);
								$(image).css('-moz-animation-delay', delay);
								$(image).css('-ms-animation-delay', delay);
								$(image).css('-o-animation-delay', delay);
								$(image).css('animation-delay', delay);
								$(image).addClass('animated flipInX');
								"""),format.raw/*175.9*/("""}"""),format.raw/*175.10*/(""");
						"""),format.raw/*176.7*/("""}"""),format.raw/*176.8*/(""",
							template: '<a href=""""),format.raw/*177.28*/("""{"""),format.raw/*177.29*/("""{"""),format.raw/*177.30*/("""link"""),format.raw/*177.34*/("""}"""),format.raw/*177.35*/("""}"""),format.raw/*177.36*/("""" target="_blank"><img src=""""),format.raw/*177.64*/("""{"""),format.raw/*177.65*/("""{"""),format.raw/*177.66*/("""image"""),format.raw/*177.71*/("""}"""),format.raw/*177.72*/("""}"""),format.raw/*177.73*/("""" /><div class="likes">&hearts; """),format.raw/*177.105*/("""{"""),format.raw/*177.106*/("""{"""),format.raw/*177.107*/("""likes"""),format.raw/*177.112*/("""}"""),format.raw/*177.113*/("""}"""),format.raw/*177.114*/("""</div></a>'
					"""),format.raw/*178.6*/("""}"""),format.raw/*178.7*/(""");
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
									<a href="#" class="image featured"><img src=""""),_display_(/*190.56*/routes/*190.62*/.Assets.at("images/pic02.jpg")),format.raw/*190.92*/("""">
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
									<a href="#" class="image featured"><img src=""""),_display_(/*205.56*/routes/*205.62*/.Assets.at("images/pic02.jpg")),format.raw/*205.92*/("""">
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
									<a href=""""),_display_(/*221.20*/routes/*221.26*/.Application.gruppSida()),format.raw/*221.50*/("""" class="image featured"><img src=""""),_display_(/*221.86*/routes/*221.92*/.Assets.at("images/pic03.jpg")),format.raw/*221.122*/("""">
									<div class="inner">
										<header>
											<h2><a href=""""),_display_(/*224.26*/routes/*224.32*/.Application.gruppSida()),format.raw/*224.56*/("""">Klicka här för att komma till gruppsidan</a></h2>
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
												<div class="6u"><a href="#" class="image fit"><img src=""""),_display_(/*249.70*/routes/*249.76*/.Assets.at("images/pic04.jpg")),format.raw/*249.106*/("""" alt="" /></a></div>
												<div class="6u"><a href="#" class="image fit"><img src=""""),_display_(/*250.70*/routes/*250.76*/.Assets.at("images/pic05.jpg")),format.raw/*250.106*/("""" alt="" /></a></div>
											</div>
											<div class="row no-collapse 50%">
												<div class="6u"><a href="#" class="image fit"><img src=""""),_display_(/*253.70*/routes/*253.76*/.Assets.at("images/pic06.jpg")),format.raw/*253.106*/("""" alt="" /></a></div>
												<div class="6u"><a href="#" class="image fit"><img src=""""),_display_(/*254.70*/routes/*254.76*/.Assets.at("images/pic07.jpg")),format.raw/*254.106*/("""" alt="" /></a></div>
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
										<li><a href=""""),_display_(/*301.25*/routes/*301.31*/.Application.gruppSida()),format.raw/*301.55*/("""">Klicka här för att komma till gruppsidan</a></li>
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
									<h3><a name=""""),_display_(/*322.24*/routes/*322.30*/.Application.kontakta()),format.raw/*322.53*/(""""> Kontakta oss</a></h3>
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
                  DATE: Fri May 08 16:12:23 CEST 2015
                  SOURCE: C:/Users/Henrik/Desktop/activator-1.3.2-minimal/testApp/app/views/index.scala.html
                  HASH: 2d76735c162586f0d7ab743b660bd0ffb32e2949
                  MATRIX: 852->0|1085->224|1120->273|1149->275|1395->494|1410->500|1476->545|1545->587|1560->593|1621->633|1678->663|1693->669|1764->719|1821->749|1836->755|1895->793|1952->823|1967->829|2033->874|2090->904|2105->910|2160->944|2217->974|2232->980|2294->1021|2351->1051|2366->1057|2426->1096|2505->1148|2520->1154|2570->1183|2664->1250|2679->1256|2739->1295|2975->1503|3004->1504|3039->1512|3175->1620|3204->1621|3250->1639|3302->1663|3331->1664|3381->1686|3451->1728|3480->1729|3545->1766|3574->1767|3624->1789|3704->1841|3733->1842|3775->1856|3804->1857|3842->1868|3871->1869|4045->2015|4074->2016|4106->2021|4142->2029|4171->2030|4204->2036|4472->2277|4500->2278|5117->2867|5146->2868|5179->2874|5281->2948|5310->2949|5344->2956|5614->3198|5643->3199|5672->3200|5893->3393|5922->3394|5957->3402|6190->3607|6219->3608|6265->3626|6805->4137|6835->4138|6897->4172|6949->4196|6978->4197|7044->4235|7130->4293|7159->4294|7240->4347|7269->4348|7335->4386|7445->4468|7474->4469|7532->4499|7561->4500|7616->4527|7645->4528|7706->4561|7735->4562|7771->4570|7800->4571|7829->4572|7905->4619|7935->4620|7970->4627|8060->4689|8089->4690|8118->4691|8152->4696|8182->4697|8217->4704|8361->4820|8390->4821|8423->4826|8452->4827|8486->4833|8515->4834|8729->5020|8745->5026|8787->5046|9002->5233|9018->5239|9060->5259|9145->5316|9161->5322|9205->5344|9288->5399|9304->5405|9350->5429|9506->5557|9522->5563|9568->5587|9640->5631|9656->5637|9701->5660|10178->6109|10194->6115|10236->6135|10617->6487|10647->6488|10687->6499|10840->6623|10870->6624|10907->6633|11023->6720|11053->6721|11090->6730|11472->7084|11502->7085|11540->7095|11569->7096|11628->7126|11658->7127|11688->7128|11721->7132|11751->7133|11781->7134|11838->7162|11868->7163|11898->7164|11932->7169|11962->7170|11992->7171|12054->7203|12085->7204|12116->7205|12151->7210|12182->7211|12213->7212|12259->7230|12288->7231|12617->7532|12633->7538|12685->7568|13102->7957|13118->7963|13170->7993|13560->8355|13576->8361|13622->8385|13686->8421|13702->8427|13755->8457|13862->8536|13878->8542|13924->8566|14632->9246|14648->9252|14701->9282|14821->9374|14837->9380|14890->9410|15075->9567|15091->9573|15144->9603|15264->9695|15280->9701|15333->9731|16733->11103|16749->11109|16795->11133|17415->11725|17431->11731|17476->11754
                  LINES: 30->1|38->10|38->11|38->11|42->15|42->15|42->15|43->16|43->16|43->16|44->17|44->17|44->17|45->18|45->18|45->18|46->19|46->19|46->19|47->20|47->20|47->20|48->21|48->21|48->21|49->22|49->22|49->22|50->23|50->23|50->23|52->25|52->25|52->25|59->32|59->32|60->33|61->34|61->34|62->35|62->35|62->35|63->36|64->37|64->37|65->38|65->38|66->39|67->40|67->40|68->41|68->41|69->42|69->42|74->47|74->47|75->48|75->48|75->48|76->49|81->54|81->54|95->68|95->68|96->69|97->70|97->70|98->71|102->75|102->75|102->75|104->77|104->77|105->78|108->81|108->81|109->82|117->90|117->90|118->91|118->91|118->91|119->92|120->93|120->93|121->94|121->94|122->95|123->96|123->96|124->97|124->97|125->98|125->98|127->100|127->100|128->101|128->101|128->101|128->101|128->101|129->102|130->103|130->103|130->103|130->103|130->103|131->104|133->106|133->106|134->107|134->107|135->108|135->108|144->117|144->117|144->117|151->124|151->124|151->124|153->126|153->126|153->126|155->128|155->128|155->128|160->133|160->133|160->133|161->134|161->134|161->134|178->151|178->151|178->151|188->161|188->161|189->162|192->165|192->165|193->166|194->167|194->167|195->168|202->175|202->175|203->176|203->176|204->177|204->177|204->177|204->177|204->177|204->177|204->177|204->177|204->177|204->177|204->177|204->177|204->177|204->177|204->177|204->177|204->177|204->177|205->178|205->178|217->190|217->190|217->190|232->205|232->205|232->205|248->221|248->221|248->221|248->221|248->221|248->221|251->224|251->224|251->224|276->249|276->249|276->249|277->250|277->250|277->250|280->253|280->253|280->253|281->254|281->254|281->254|328->301|328->301|328->301|349->322|349->322|349->322
                  -- GENERATED --
              */
          