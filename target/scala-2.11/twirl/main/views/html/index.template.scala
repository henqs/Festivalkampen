
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
								<li class="current"><a name="toppen" href=""""),_display_(/*123.53*/routes/*123.59*/.Application.index()),format.raw/*123.79*/("""">Välkommen</a></li>
								<li>
											<a href=""""),_display_(/*125.22*/routes/*125.28*/.Application.spelhub()),format.raw/*125.50*/("""">Spel</a>
											<ul>
												<li><a href=""""),_display_(/*127.27*/routes/*127.33*/.Application.quizStart()),format.raw/*127.57*/("""">Quiz</a></li>
												<li><a href="#">Skyrim</a></li>
											</ul>
									
								</li>
								<li><a href=""""),_display_(/*132.23*/routes/*132.29*/.Application.gruppSida()),format.raw/*132.53*/("""">Gruppsida</a></li>
								<li><a href=""""),_display_(/*133.23*/routes/*133.29*/.Application.kontakta()),format.raw/*133.52*/("""">Kontakta oss</a></li>
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
								<li id="login"><a href=""""),_display_(/*150.34*/routes/*150.40*/.Application.login()),format.raw/*150.60*/("""" class="button big icon fa-arrow-circle-right">Logga in</a></li>
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
								<section class="box feature">
									<a href="#" class="image featured"><img src=""""),_display_(/*181.56*/routes/*181.62*/.Assets.at("images/pic02.jpg")),format.raw/*181.92*/("""">
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
									<a href=""""),_display_(/*196.20*/routes/*196.26*/.Application.gruppSida()),format.raw/*196.50*/("""" class="image featured"><img src=""""),_display_(/*196.86*/routes/*196.92*/.Assets.at("images/pic03.jpg")),format.raw/*196.122*/("""">
									<div class="inner">
										<header>
											<h2><a href=""""),_display_(/*199.26*/routes/*199.32*/.Application.gruppSida()),format.raw/*199.56*/("""">Klicka här för att komma till gruppsidan</a></h2>
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
												<div class="6u"><a href="#" class="image fit"><img src=""""),_display_(/*224.70*/routes/*224.76*/.Assets.at("images/pic04.jpg")),format.raw/*224.106*/("""" alt="" /></a></div>
												<div class="6u"><a href="#" class="image fit"><img src=""""),_display_(/*225.70*/routes/*225.76*/.Assets.at("images/pic05.jpg")),format.raw/*225.106*/("""" alt="" /></a></div>
											</div>
											<div class="row no-collapse 50%">
												<div class="6u"><a href="#" class="image fit"><img src=""""),_display_(/*228.70*/routes/*228.76*/.Assets.at("images/pic06.jpg")),format.raw/*228.106*/("""" alt="" /></a></div>
												<div class="6u"><a href="#" class="image fit"><img src=""""),_display_(/*229.70*/routes/*229.76*/.Assets.at("images/pic07.jpg")),format.raw/*229.106*/("""" alt="" /></a></div>
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
										<li><a href=""""),_display_(/*276.25*/routes/*276.31*/.Application.gruppSida()),format.raw/*276.55*/("""">Klicka här för att komma till gruppsidan</a></li>
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
									<h3><a name=""""),_display_(/*297.24*/routes/*297.30*/.Application.kontakta()),format.raw/*297.53*/(""""> Kontakta oss</a></h3>
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
                  DATE: Fri May 08 15:37:24 CEST 2015
                  SOURCE: C:/Users/Henrik/Desktop/activator-1.3.2-minimal/testApp/app/views/index.scala.html
                  HASH: 807e616538504fbd7cd60a961f630bc6d28d567a
                  MATRIX: 852->0|1085->224|1120->273|1149->275|1395->494|1410->500|1476->545|1545->587|1560->593|1621->633|1678->663|1693->669|1764->719|1821->749|1836->755|1895->793|1952->823|1967->829|2033->874|2090->904|2105->910|2160->944|2217->974|2232->980|2294->1021|2373->1073|2388->1079|2438->1108|2532->1175|2547->1181|2607->1220|2843->1428|2872->1429|2907->1437|3043->1545|3072->1546|3118->1564|3170->1588|3199->1589|3249->1611|3319->1653|3348->1654|3413->1691|3442->1692|3492->1714|3572->1766|3601->1767|3643->1781|3672->1782|3710->1793|3739->1794|3913->1940|3942->1941|3974->1946|4010->1954|4039->1955|4072->1961|4340->2202|4368->2203|4985->2792|5014->2793|5047->2799|5149->2873|5178->2874|5212->2881|5482->3123|5511->3124|5540->3125|5761->3318|5790->3319|5825->3327|6058->3532|6087->3533|6133->3551|6673->4062|6703->4063|6765->4097|6817->4121|6846->4122|6912->4160|6998->4218|7027->4219|7108->4272|7137->4273|7203->4311|7313->4393|7342->4394|7400->4424|7429->4425|7484->4452|7513->4453|7573->4486|7601->4487|7637->4495|7666->4496|7695->4497|7771->4544|7801->4545|7836->4552|7926->4614|7955->4615|7984->4616|8018->4621|8048->4622|8083->4629|8227->4745|8256->4746|8289->4751|8318->4752|8352->4758|8381->4759|8595->4945|8611->4951|8653->4971|8868->5158|8884->5164|8926->5184|9011->5241|9027->5247|9071->5269|9154->5324|9170->5330|9216->5354|9372->5482|9388->5488|9434->5512|9506->5556|9522->5562|9567->5585|10044->6034|10060->6040|10102->6060|10618->6548|10634->6554|10686->6584|11103->6973|11119->6979|11171->7009|11557->7367|11573->7373|11619->7397|11683->7433|11699->7439|11752->7469|11859->7548|11875->7554|11921->7578|12629->8258|12645->8264|12698->8294|12818->8386|12834->8392|12887->8422|13072->8579|13088->8585|13141->8615|13261->8707|13277->8713|13330->8743|14730->10115|14746->10121|14792->10145|15412->10737|15428->10743|15473->10766
                  LINES: 30->1|38->10|38->11|38->11|42->15|42->15|42->15|43->16|43->16|43->16|44->17|44->17|44->17|45->18|45->18|45->18|46->19|46->19|46->19|47->20|47->20|47->20|48->21|48->21|48->21|49->22|49->22|49->22|51->24|51->24|51->24|58->31|58->31|59->32|60->33|60->33|61->34|61->34|61->34|62->35|63->36|63->36|64->37|64->37|65->38|66->39|66->39|67->40|67->40|68->41|68->41|73->46|73->46|74->47|74->47|74->47|75->48|80->53|80->53|94->67|94->67|95->68|96->69|96->69|97->70|101->74|101->74|101->74|103->76|103->76|104->77|107->80|107->80|108->81|116->89|116->89|117->90|117->90|117->90|118->91|119->92|119->92|120->93|120->93|121->94|122->95|122->95|123->96|123->96|124->97|124->97|126->99|126->99|127->100|127->100|127->100|127->100|127->100|128->101|129->102|129->102|129->102|129->102|129->102|130->103|132->105|132->105|133->106|133->106|134->107|134->107|143->116|143->116|143->116|150->123|150->123|150->123|152->125|152->125|152->125|154->127|154->127|154->127|159->132|159->132|159->132|160->133|160->133|160->133|177->150|177->150|177->150|193->166|193->166|193->166|208->181|208->181|208->181|223->196|223->196|223->196|223->196|223->196|223->196|226->199|226->199|226->199|251->224|251->224|251->224|252->225|252->225|252->225|255->228|255->228|255->228|256->229|256->229|256->229|303->276|303->276|303->276|324->297|324->297|324->297
                  -- GENERATED --
              */
          