
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
	    """),format.raw/*10.1*/("""        """),format.raw/*11.1*/("""		"""),_display_(/*11.4*/Templates/*11.13*/.head()),format.raw/*11.20*/("""
		
		"""),format.raw/*13.3*/("""<script  src=""""),_display_(/*13.18*/routes/*13.24*/.Assets.at("/javascripts/facebookSDK.js")),format.raw/*13.65*/(""""></script>
		<script  src=""""),_display_(/*14.18*/routes/*14.24*/.Assets.at("/javascripts/instafeed.js")),format.raw/*14.63*/(""""></script>
		<script  src=""""),_display_(/*15.18*/routes/*15.24*/.Assets.at("/javascripts/chart.js")),format.raw/*15.59*/(""""></script>
		<script type="text/javascript" src=""""),_display_(/*16.40*/routes/*16.46*/.Application.javascriptRoutes),format.raw/*16.75*/(""""></script>
		
		<!--[if lte IE 8]><link rel="stylesheet" href=""""),_display_(/*18.51*/routes/*18.57*/.Assets.at("stylesheets/css/ie/v8.css")),format.raw/*18.96*/("""" /><![endif]-->
	</head>
	<body class="homepage">
	<!--DET HÄR ÄR POÄNGGIVARTESTER-->
	<input type='button' value='Ge Axel 10 poäng' id='givePointsBtn' />
	
	<script>
	    var givePoints = function() """),format.raw/*25.34*/("""{"""),format.raw/*25.35*/("""
		    """),format.raw/*26.7*/("""var userId = "628246407306132";
            jsRoutes.controllers.Application.givePoints(userId, "10").ajax("""),format.raw/*27.76*/("""{"""),format.raw/*27.77*/("""
                """),format.raw/*28.17*/("""success: function(data) """),format.raw/*28.41*/("""{"""),format.raw/*28.42*/("""
                    """),format.raw/*29.21*/("""$("#result").html(data);
                """),format.raw/*30.17*/("""}"""),format.raw/*30.18*/(""",
                error: function() """),format.raw/*31.35*/("""{"""),format.raw/*31.36*/("""
                    """),format.raw/*32.21*/("""alert("Problem med att ge poäng.")
                """),format.raw/*33.17*/("""}"""),format.raw/*33.18*/("""
            """),format.raw/*34.13*/("""}"""),format.raw/*34.14*/(""")
        """),format.raw/*35.9*/("""}"""),format.raw/*35.10*/(""";
        $('#givePointsBtn').click(givePoints);
	</script>
	<!--HÄR TAR POÄNGGIVARTESTET SLUT-->
	<script>
	window.fbAsyncInit = function() """),format.raw/*40.34*/("""{"""),format.raw/*40.35*/("""
			"""),format.raw/*41.4*/("""FB.init("""),format.raw/*41.12*/("""{"""),format.raw/*41.13*/("""
				"""),format.raw/*42.5*/("""appId      : '909582695765355',
				cookie     : true,  // enable cookies to allow the server to access 
									// the session
				xfbml      : true,  // parse social plugins on this page
				version    : 'v2.2' // use version 2.2
			"""),format.raw/*47.4*/("""}"""),format.raw/*47.5*/(""");
	
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
			
			FB.getLoginStatus(function(response) """),format.raw/*61.41*/("""{"""),format.raw/*61.42*/("""
				"""),format.raw/*62.5*/("""statusChangeCallback(response);
				if (response.status === 'connected') """),format.raw/*63.42*/("""{"""),format.raw/*63.43*/("""
					"""),format.raw/*64.6*/("""// Logged into your app and Facebook.
					console.log('Logged in!');
					var login = document.getElementById("login");
					//login.style.display = 'none';
					login.innerHTML = '<li id="login"><a onclick="FB.logout(function(response) """),format.raw/*68.81*/("""{"""),format.raw/*68.82*/("""}"""),format.raw/*68.83*/("""); location.reload();" class="button big icon fa-arrow-circle-right">Logga ut</a></li>';
					var welcomeText = document.getElementById("welcome-text");
					FB.api('/me', function(response) """),format.raw/*70.39*/("""{"""),format.raw/*70.40*/("""
						"""),format.raw/*71.7*/("""console.log(response);
						welcomeText.innerHTML = "Välkommen till Festivalkampen " + response.first_name + "!";
						//Här vill vi köra updateUserTable()
				        var updateDatabase = function() """),format.raw/*74.45*/("""{"""),format.raw/*74.46*/("""
				            """),format.raw/*75.17*/("""var userId = ""+response.id;
				            var userGender = ""+response.gender;
				            var userFullName = ""+response.first_name+" "+response.last_name;
				            var userEmail = ""+response.email;
				            console.log(userId);
				            console.log(userGender);
				            console.log(userFullName);
				            console.log(userEmail);
                            jsRoutes.controllers.Application.updateUserTable(userId, userGender, userFullName, userEmail).ajax("""),format.raw/*83.128*/("""{"""),format.raw/*83.129*/("""
                                """),format.raw/*84.33*/("""success: function(data) """),format.raw/*84.57*/("""{"""),format.raw/*84.58*/("""
                                    """),format.raw/*85.37*/("""$("#result").html(data);
                                """),format.raw/*86.33*/("""}"""),format.raw/*86.34*/(""",
                                error: function() """),format.raw/*87.51*/("""{"""),format.raw/*87.52*/("""
                                    """),format.raw/*88.37*/("""alert("Problem med anslutningen till Facebook.")
                                """),format.raw/*89.33*/("""}"""),format.raw/*89.34*/("""
                            """),format.raw/*90.29*/("""}"""),format.raw/*90.30*/(""")
                        """),format.raw/*91.25*/("""}"""),format.raw/*91.26*/(""";
						updateDatabase();
					"""),format.raw/*93.6*/("""}"""),format.raw/*93.7*/(""");
				"""),format.raw/*94.5*/("""}"""),format.raw/*94.6*/(""" """),format.raw/*94.7*/("""else if (response.status === 'not_authorized') """),format.raw/*94.54*/("""{"""),format.raw/*94.55*/("""
					"""),format.raw/*95.6*/("""// The person is logged into Facebook, but not your app.
				"""),format.raw/*96.5*/("""}"""),format.raw/*96.6*/(""" """),format.raw/*96.7*/("""else """),format.raw/*96.12*/("""{"""),format.raw/*96.13*/("""
					"""),format.raw/*97.6*/("""// The person is not logged into Facebook, so we're not sure if
					// they are logged into this app or not.
				"""),format.raw/*99.5*/("""}"""),format.raw/*99.6*/("""
			"""),format.raw/*100.4*/("""}"""),format.raw/*100.5*/(""");
		"""),format.raw/*101.3*/("""}"""),format.raw/*101.4*/(""";
	    
		</script>
		<!-- Header -->

		"""),_display_(/*106.4*/Templates/*106.13*/.header()),format.raw/*106.22*/("""
		
		"""),format.raw/*108.3*/("""<!-- Banner -->
			<div id="banner-wrapper">
				<div id="banner" class="box container">
					<div class="row">
						<div class="7u">
							<h2 id="welcome-text">Välkommen till Festivalkampen!</h2>
							<p>Detta är en app som förgyller din vistelse hos oss.</p>
						</div>
						<div class="5u">
							<ul>
								<li id="login"><a href=""""),_display_(/*118.34*/routes/*118.40*/.Application.login()),format.raw/*118.60*/("""" class="button big icon fa-arrow-circle-right">Logga in</a></li>
								<li id="info"><a href="#" class="button alt big icon fa-question-circle">Mer info</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		
		
		<center>
			"""),_display_(/*128.5*/Templates/*128.14*/.instafeed()),format.raw/*128.26*/("""
		"""),format.raw/*129.3*/("""</center>
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
        jsRoutes.controllers.Application.getTeamStandings().ajax("""),format.raw/*146.66*/("""{"""),format.raw/*146.67*/("""
            """),format.raw/*147.13*/("""success: function(data) """),format.raw/*147.37*/("""{"""),format.raw/*147.38*/("""
                """),format.raw/*148.17*/("""$("#result").html(data);
                console.log(data);
                var scalingRed = data.substring(0, data.indexOf('_'));
                var scalingBlue = data.substring((data.indexOf('_')+1), data.indexOf('-'));
                var scalingBlack = data.substring((data.indexOf('-')+1), data.indexOf('+'));
                var scalingRedInt = parseInt(scalingRed);
                var scalingBlueInt = parseInt(scalingBlue);
                var scalingBlackInt = parseInt(scalingBlack);
                console.log(scalingRedInt);
                	var pieData = [
				"""),format.raw/*158.5*/("""{"""),format.raw/*158.6*/("""
					"""),format.raw/*159.6*/("""value: scalingRedInt,
					color:"#FF0000",
					highlight: "#FF3333",
					label: "Röda laget!"
				"""),format.raw/*163.5*/("""}"""),format.raw/*163.6*/(""",
				"""),format.raw/*164.5*/("""{"""),format.raw/*164.6*/("""
					"""),format.raw/*165.6*/("""value: scalingBlueInt,
					color: "#0000FF",
					highlight: "#4D4DFF",
					label: "Blå laget!"
				"""),format.raw/*169.5*/("""}"""),format.raw/*169.6*/(""",
				"""),format.raw/*170.5*/("""{"""),format.raw/*170.6*/("""
					"""),format.raw/*171.6*/("""value: scalingBlackInt,
					color: "#191919",
					highlight: "#474747",
					label: "Svarta laget!"
				"""),format.raw/*175.5*/("""}"""),format.raw/*175.6*/(""",

			];
            var redPoints = document.getElementById("red-points");
            var bluePoints = document.getElementById("blue-points");
            var blackPoints = document.getElementById("black-points");
            redPoints.innerHTML = "Lag Röd: "+scalingRedInt+" poäng!";
            bluePoints.innerHTML = "Lag Blå: "+scalingBlueInt+" poäng!";
            blackPoints.innerHTML ="Lag Svart: "+scalingBlackInt+" poäng!";
			loadPieChart = function()"""),format.raw/*184.29*/("""{"""),format.raw/*184.30*/("""
				"""),format.raw/*185.5*/("""var ctx = document.getElementById("chart-area").getContext("2d");
				window.myPie = new Chart(ctx).Pie(pieData);
			"""),format.raw/*187.4*/("""}"""),format.raw/*187.5*/(""";
			loadPieChart();
            """),format.raw/*189.13*/("""}"""),format.raw/*189.14*/(""",
            error: function() """),format.raw/*190.31*/("""{"""),format.raw/*190.32*/("""
                """),format.raw/*191.17*/("""alert("Problem uppstod vid hämtning av lagställningarna")
            """),format.raw/*192.13*/("""}"""),format.raw/*192.14*/("""
        """),format.raw/*193.9*/("""}"""),format.raw/*193.10*/(""")
		
        </script>
			</section>
				</div>
						<div class="4u">
						
							<!-- Box -->
								<section class="box feature">
									<a href="#" class="image featured"><img src=""""),_display_(/*202.56*/routes/*202.62*/.Assets.at("images/pic02.jpg")),format.raw/*202.92*/("""">
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
									<a href=""""),_display_(/*218.20*/routes/*218.26*/.Application.gruppSida()),format.raw/*218.50*/("""" class="image featured"><img src=""""),_display_(/*218.86*/routes/*218.92*/.Assets.at("images/pic03.jpg")),format.raw/*218.122*/("""">
									<div class="inner">
										<header>
											<h2><a href=""""),_display_(/*221.26*/routes/*221.32*/.Application.gruppSida()),format.raw/*221.56*/("""">Klicka här för att komma till gruppsidan</a></h2>
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
												<div class="6u"><a href="#" class="image fit"><img src=""""),_display_(/*246.70*/routes/*246.76*/.Assets.at("images/pic04.jpg")),format.raw/*246.106*/("""" alt="" /></a></div>
												<div class="6u"><a href="#" class="image fit"><img src=""""),_display_(/*247.70*/routes/*247.76*/.Assets.at("images/pic05.jpg")),format.raw/*247.106*/("""" alt="" /></a></div>
											</div>
											<div class="row no-collapse 50%">
												<div class="6u"><a href="#" class="image fit"><img src=""""),_display_(/*250.70*/routes/*250.76*/.Assets.at("images/pic06.jpg")),format.raw/*250.106*/("""" alt="" /></a></div>
												<div class="6u"><a href="#" class="image fit"><img src=""""),_display_(/*251.70*/routes/*251.76*/.Assets.at("images/pic07.jpg")),format.raw/*251.106*/("""" alt="" /></a></div>
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
						

							<!-- Contact -->
							<center>
								"""),_display_(/*278.10*/Templates/*278.19*/.kontakta()),format.raw/*278.30*/("""
								
							"""),format.raw/*280.8*/("""</center>

	</body>
</html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 18 13:10:40 CEST 2015
                  SOURCE: C:/Users/Henrik/Desktop/activator-1.3.2-minimal/testApp/app/views/index.scala.html
                  HASH: beafb761b32e272b0ca07efc8576feac21928829
                  MATRIX: 852->0|1085->224|1120->273|1149->276|1167->285|1195->292|1230->300|1272->315|1287->321|1349->362|1406->392|1421->398|1481->437|1538->467|1553->473|1609->508|1688->560|1703->566|1753->595|1847->662|1862->668|1922->707|2158->915|2187->916|2222->924|2358->1032|2387->1033|2433->1051|2485->1075|2514->1076|2564->1098|2634->1140|2663->1141|2728->1178|2757->1179|2807->1201|2887->1253|2916->1254|2958->1268|2987->1269|3025->1280|3054->1281|3228->1427|3257->1428|3289->1433|3325->1441|3354->1442|3387->1448|3655->1689|3683->1690|4300->2279|4329->2280|4362->2286|4464->2360|4493->2361|4527->2368|4797->2610|4826->2611|4855->2612|5076->2805|5105->2806|5140->2814|5373->3019|5402->3020|5448->3038|5988->3549|6018->3550|6080->3584|6132->3608|6161->3609|6227->3647|6313->3705|6342->3706|6423->3759|6452->3760|6518->3798|6628->3880|6657->3881|6715->3911|6744->3912|6799->3939|6828->3940|6888->3973|6916->3974|6951->3982|6979->3983|7007->3984|7082->4031|7111->4032|7145->4039|7234->4101|7262->4102|7290->4103|7323->4108|7352->4109|7386->4116|7529->4232|7557->4233|7590->4238|7619->4239|7653->4245|7682->4246|7756->4293|7775->4302|7806->4311|7842->4319|8227->4676|8243->4682|8285->4702|8567->4957|8586->4966|8620->4978|8652->4982|9381->5682|9411->5683|9454->5697|9507->5721|9537->5722|9584->5740|10199->6327|10228->6328|10263->6335|10396->6440|10425->6441|10460->6448|10489->6449|10524->6456|10658->6562|10687->6563|10722->6570|10751->6571|10786->6578|10924->6688|10953->6689|11455->7162|11485->7163|11519->7169|11666->7288|11695->7289|11759->7324|11789->7325|11851->7358|11881->7359|11928->7377|12028->7448|12058->7449|12096->7459|12126->7460|12354->7660|12370->7666|12422->7696|12812->8058|12828->8064|12874->8088|12938->8124|12954->8130|13007->8160|13114->8239|13130->8245|13176->8269|13884->8949|13900->8955|13953->8985|14073->9077|14089->9083|14142->9113|14327->9270|14343->9276|14396->9306|14516->9398|14532->9404|14585->9434|15355->10176|15374->10185|15407->10196|15454->10215
                  LINES: 30->1|38->10|38->11|38->11|38->11|38->11|40->13|40->13|40->13|40->13|41->14|41->14|41->14|42->15|42->15|42->15|43->16|43->16|43->16|45->18|45->18|45->18|52->25|52->25|53->26|54->27|54->27|55->28|55->28|55->28|56->29|57->30|57->30|58->31|58->31|59->32|60->33|60->33|61->34|61->34|62->35|62->35|67->40|67->40|68->41|68->41|68->41|69->42|74->47|74->47|88->61|88->61|89->62|90->63|90->63|91->64|95->68|95->68|95->68|97->70|97->70|98->71|101->74|101->74|102->75|110->83|110->83|111->84|111->84|111->84|112->85|113->86|113->86|114->87|114->87|115->88|116->89|116->89|117->90|117->90|118->91|118->91|120->93|120->93|121->94|121->94|121->94|121->94|121->94|122->95|123->96|123->96|123->96|123->96|123->96|124->97|126->99|126->99|127->100|127->100|128->101|128->101|133->106|133->106|133->106|135->108|145->118|145->118|145->118|155->128|155->128|155->128|156->129|173->146|173->146|174->147|174->147|174->147|175->148|185->158|185->158|186->159|190->163|190->163|191->164|191->164|192->165|196->169|196->169|197->170|197->170|198->171|202->175|202->175|211->184|211->184|212->185|214->187|214->187|216->189|216->189|217->190|217->190|218->191|219->192|219->192|220->193|220->193|229->202|229->202|229->202|245->218|245->218|245->218|245->218|245->218|245->218|248->221|248->221|248->221|273->246|273->246|273->246|274->247|274->247|274->247|277->250|277->250|277->250|278->251|278->251|278->251|305->278|305->278|305->278|307->280
                  -- GENERATED --
              */
          