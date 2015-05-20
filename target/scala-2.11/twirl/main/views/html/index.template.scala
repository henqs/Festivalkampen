
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
							<section class="box feature">
								<h3 id="team-standings">Ställningarna just nu:</h3>
								<p id="red-points" style="color:red">Lag Röd:</p>
			                    <p id="blue-points" style="color:blue">Lag Blå:</p>
			                    <p id="black-points" style="color:black">Lag Svart:</p>
									<div id="canvas-holder">
			                <canvas id="chart-area" width="240" height="150"/>
            		    </div>
        <script>
        jsRoutes.controllers.Application.getTeamStandings().ajax("""),format.raw/*123.66*/("""{"""),format.raw/*123.67*/("""
            """),format.raw/*124.13*/("""success: function(data) """),format.raw/*124.37*/("""{"""),format.raw/*124.38*/("""
                """),format.raw/*125.17*/("""$("#result").html(data);
                console.log(data);
                var scalingRed = data.substring(0, data.indexOf('_'));
                var scalingBlue = data.substring((data.indexOf('_')+1), data.indexOf('-'));
                var scalingBlack = data.substring((data.indexOf('-')+1), data.indexOf('+'));
                var scalingRedInt = parseInt(scalingRed);
                var scalingBlueInt = parseInt(scalingBlue);
                var scalingBlackInt = parseInt(scalingBlack);
                console.log(scalingRedInt);
                	var pieData = [
				"""),format.raw/*135.5*/("""{"""),format.raw/*135.6*/("""
					"""),format.raw/*136.6*/("""value: scalingRedInt,
					color:"#FF0000",
					highlight: "#FF3333",
					label: "Röda laget!"
				"""),format.raw/*140.5*/("""}"""),format.raw/*140.6*/(""",
				"""),format.raw/*141.5*/("""{"""),format.raw/*141.6*/("""
					"""),format.raw/*142.6*/("""value: scalingBlueInt,
					color: "#0000FF",
					highlight: "#4D4DFF",
					label: "Blå laget!"
				"""),format.raw/*146.5*/("""}"""),format.raw/*146.6*/(""",
				"""),format.raw/*147.5*/("""{"""),format.raw/*147.6*/("""
					"""),format.raw/*148.6*/("""value: scalingBlackInt,
					color: "#191919",
					highlight: "#474747",
					label: "Svarta laget!"
				"""),format.raw/*152.5*/("""}"""),format.raw/*152.6*/(""",

			];
            var redPoints = document.getElementById("red-points");
            var bluePoints = document.getElementById("blue-points");
            var blackPoints = document.getElementById("black-points");
            redPoints.innerHTML = "Lag Röd: "+scalingRedInt+" poäng!";
            bluePoints.innerHTML = "Lag Blå: "+scalingBlueInt+" poäng!";
            blackPoints.innerHTML ="Lag Svart: "+scalingBlackInt+" poäng!";
			loadPieChart = function()"""),format.raw/*161.29*/("""{"""),format.raw/*161.30*/("""
				"""),format.raw/*162.5*/("""var ctx = document.getElementById("chart-area").getContext("2d");
				window.myPie = new Chart(ctx).Pie(pieData);
			"""),format.raw/*164.4*/("""}"""),format.raw/*164.5*/(""";
			loadPieChart();
            """),format.raw/*166.13*/("""}"""),format.raw/*166.14*/(""",
            error: function() """),format.raw/*167.31*/("""{"""),format.raw/*167.32*/("""
                """),format.raw/*168.17*/("""alert("Problem uppstod vid hämtning av lagställningarna")
            """),format.raw/*169.13*/("""}"""),format.raw/*169.14*/("""
        """),format.raw/*170.9*/("""}"""),format.raw/*170.10*/(""")
		
        </script>
						</div>
						<div class="5u">
							<ul>
								<li id="login"><a href=""""),_display_(/*176.34*/routes/*176.40*/.Application.login()),format.raw/*176.60*/("""" class="button big icon fa-arrow-circle-right">Logga in</a></li>
								<li id="info"><a href="#" class="button alt big icon fa-question-circle">Mer info</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		<center>
		    <div id="instafeedrubrik">
				<instafeedrubrik>Tagga din bild #pvtgrupp11 på Instagram!</instafeedrubrik>
		    </div>
	    </center>
		
		<center>
			"""),_display_(/*190.5*/Templates/*190.14*/.instafeed()),format.raw/*190.26*/("""
		"""),format.raw/*191.3*/("""</center>
		<!-- Features -->
			<div id="features-wrapper">
				<div class="container">
					<div class="row">
						<div class="4u">
						
							<!-- Box -->
								
			</section>
				</div>
						<div class="4u">
						
							<!-- Box -->
								<section class="box feature">
									<a href="#" class="image featured"><img src=""""),_display_(/*206.56*/routes/*206.62*/.Assets.at("images/pic02.jpg")),format.raw/*206.92*/("""">
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
									<a href=""""),_display_(/*222.20*/routes/*222.26*/.Application.gruppSida()),format.raw/*222.50*/("""" class="image featured"><img src=""""),_display_(/*222.86*/routes/*222.92*/.Assets.at("images/pic03.jpg")),format.raw/*222.122*/("""">
									<div class="inner">
										<header>
											<h2><a href=""""),_display_(/*225.26*/routes/*225.32*/.Application.gruppSida()),format.raw/*225.56*/("""">Klicka här för att komma till gruppsidan</a></h2>
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
												<div class="6u"><a href="#" class="image fit"><img src=""""),_display_(/*250.70*/routes/*250.76*/.Assets.at("images/pic04.jpg")),format.raw/*250.106*/("""" alt="" /></a></div>
												<div class="6u"><a href="#" class="image fit"><img src=""""),_display_(/*251.70*/routes/*251.76*/.Assets.at("images/pic05.jpg")),format.raw/*251.106*/("""" alt="" /></a></div>
											</div>
											<div class="row no-collapse 50%">
												<div class="6u"><a href="#" class="image fit"><img src=""""),_display_(/*254.70*/routes/*254.76*/.Assets.at("images/pic06.jpg")),format.raw/*254.106*/("""" alt="" /></a></div>
												<div class="6u"><a href="#" class="image fit"><img src=""""),_display_(/*255.70*/routes/*255.76*/.Assets.at("images/pic07.jpg")),format.raw/*255.106*/("""" alt="" /></a></div>
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
								"""),_display_(/*282.10*/Templates/*282.19*/.kontakta()),format.raw/*282.30*/("""
								
							"""),format.raw/*284.8*/("""</center>

	</body>
</html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue May 19 12:21:29 CEST 2015
                  SOURCE: /Users/andersdahl/Documents/kod/pvt/testApp/app/views/index.scala.html
                  HASH: 3dd92b52d9dc3fe287ebbcd9bc591f24c2b5db62
                  MATRIX: 852->0|1077->215|1112->263|1141->266|1159->275|1187->282|1220->288|1262->303|1277->309|1339->350|1395->379|1410->385|1470->424|1526->453|1541->459|1597->494|1675->545|1690->551|1740->580|1832->645|1847->651|1907->690|2136->891|2165->892|2199->899|2334->1006|2363->1007|2408->1024|2460->1048|2489->1049|2538->1070|2607->1111|2636->1112|2700->1148|2729->1149|2778->1170|2857->1221|2886->1222|2927->1235|2956->1236|2993->1246|3022->1247|3191->1388|3220->1389|3251->1393|3287->1401|3316->1402|3348->1407|3611->1643|3639->1644|4242->2219|4271->2220|4303->2225|4404->2298|4433->2299|4466->2305|4732->2543|4761->2544|4790->2545|5009->2736|5038->2737|5072->2744|5302->2946|5331->2947|5376->2964|5908->3467|5938->3468|5999->3501|6051->3525|6080->3526|6145->3563|6230->3620|6259->3621|6339->3673|6368->3674|6433->3711|6542->3792|6571->3793|6628->3822|6657->3823|6711->3849|6740->3850|6798->3881|6826->3882|6860->3889|6888->3890|6916->3891|6991->3938|7020->3939|7053->3945|7141->4006|7169->4007|7197->4008|7230->4013|7259->4014|7292->4020|7433->4134|7461->4135|7493->4139|7522->4140|7555->4145|7584->4146|7653->4188|7672->4197|7703->4206|7737->4212|8486->4932|8516->4933|8558->4946|8611->4970|8641->4971|8687->4988|9292->5565|9321->5566|9355->5572|9484->5673|9513->5674|9547->5680|9576->5681|9610->5687|9740->5789|9769->5790|9803->5796|9832->5797|9866->5803|10000->5909|10029->5910|10522->6374|10552->6375|10585->6380|10730->6497|10759->6498|10821->6531|10851->6532|10912->6564|10942->6565|10988->6582|11087->6652|11117->6653|11154->6662|11184->6663|11316->6767|11332->6773|11374->6793|11795->7187|11814->7196|11848->7208|11879->7211|12246->7550|12262->7556|12314->7586|12688->7932|12704->7938|12750->7962|12814->7998|12830->8004|12883->8034|12987->8110|13003->8116|13049->8140|13732->8795|13748->8801|13801->8831|13920->8922|13936->8928|13989->8958|14171->9112|14187->9118|14240->9148|14359->9239|14375->9245|14428->9275|15171->9990|15190->9999|15223->10010|15268->10027
                  LINES: 30->1|38->10|38->11|38->11|38->11|38->11|40->13|40->13|40->13|40->13|41->14|41->14|41->14|42->15|42->15|42->15|43->16|43->16|43->16|45->18|45->18|45->18|52->25|52->25|53->26|54->27|54->27|55->28|55->28|55->28|56->29|57->30|57->30|58->31|58->31|59->32|60->33|60->33|61->34|61->34|62->35|62->35|67->40|67->40|68->41|68->41|68->41|69->42|74->47|74->47|88->61|88->61|89->62|90->63|90->63|91->64|95->68|95->68|95->68|97->70|97->70|98->71|101->74|101->74|102->75|110->83|110->83|111->84|111->84|111->84|112->85|113->86|113->86|114->87|114->87|115->88|116->89|116->89|117->90|117->90|118->91|118->91|120->93|120->93|121->94|121->94|121->94|121->94|121->94|122->95|123->96|123->96|123->96|123->96|123->96|124->97|126->99|126->99|127->100|127->100|128->101|128->101|133->106|133->106|133->106|135->108|150->123|150->123|151->124|151->124|151->124|152->125|162->135|162->135|163->136|167->140|167->140|168->141|168->141|169->142|173->146|173->146|174->147|174->147|175->148|179->152|179->152|188->161|188->161|189->162|191->164|191->164|193->166|193->166|194->167|194->167|195->168|196->169|196->169|197->170|197->170|203->176|203->176|203->176|217->190|217->190|217->190|218->191|233->206|233->206|233->206|249->222|249->222|249->222|249->222|249->222|249->222|252->225|252->225|252->225|277->250|277->250|277->250|278->251|278->251|278->251|281->254|281->254|281->254|282->255|282->255|282->255|309->282|309->282|309->282|311->284
                  -- GENERATED --
              */
          