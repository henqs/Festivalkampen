
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
object nosidebar extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.2*/("""<!DOCTYPE HTML>
 
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
          <!--[if lte IE 8]><script src="css/ie/html5shiv.js"></script><![endif]-->
          <script src="js/jquery.min.js"></script>
          <script src="js/jquery.dropotron.min.js"></script>
          <script src="js/skel.min.js"></script>
          <script src="js/skel-layers.min.js"></script>
          <script src="js/init.js"></script>
          <noscript>
              <link rel="stylesheet" href="css/skel.css" />
              <link rel="stylesheet" href="css/style.css" />
              <link rel="stylesheet" href="css/style-desktop.css" />
              <link rel="stylesheet" href="css/test/animate.css" />
              <link rel="stylesheet" href="css/test/bootstrap.css" />
              <link rel="stylesheet" href="css/test/component.css" />
              <link rel="stylesheet" href="css/test/style.css" />
          </noscript>
          <!--[if lte IE 8]><link rel="stylesheet" href="css/ie/v8.css" /><![endif]-->
      </head>
      <body class="no-sidebar">
  
          <!-- Header -->
              <div id="header-wrapper">
                  <header id="header" class="container">
                  
                      <!-- Logo -->
                          <div id="logo">
                              <h1><a href="index.html">Festivalkampen</a></h1>
                              <span>av Grupp 11</span>
                          </div>
                      
                      <!-- Nav -->
                          <nav id="nav">
                              <ul>
                                  <li><a href="index.html">Välkommen</a></li>
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
                                  <li class="current"><a href="no-sidebar.html">Kontakta oss</a></li>
                              </ul>
                          </nav>
                      
                  </header>
              </div>
          
          <!-- Main -->
              <div id="main-wrapper">
                  <div class="container">
                      <div id="content">
  
                          <!-- Content -->
                                  <h2>Kontakta oss</h2>
                                  <p>Här kan man alltid göra ett kontaktformulär som kopplas. </p>
                                      <!-- Fixa formula för inloggningsformuläret -->
                                      <!--<div class="sign-in-form">
                                            <div class="in-form Personal">-->
                  								<h3>Skapa nytt konto</h3>
                  								<ul>
                      								<li><a href="#" class="facebook">Facebook</a></li>
                      								<li><a href="#" class="twitter">Twitter</a></li>
                     								<li><a href="#" class="g-plus">Google</a></li>
                  								</ul>
                  								<h4>Personlig information</h4>
                  								<form>
                      								<input type="text" placeholder="Förnamn*" required>
                      								<input type="text" placeholder="Efternamn*" required>
                     								<input type="text" placeholder="Emailadress*" required>
                  								</form>
                  								<h5>Inloggningsinformation</h5>
                  								<form>
                      								<input type="password" placeholder="Lösenord*" required>
                      								<input type="password" placeholder="Bekräfta lösenord*" required>
                      								<input type="submit" value="Bekräfta">
                  								</form>
  
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
                  DATE: Mon May 18 13:10:40 CEST 2015
                  SOURCE: C:/Users/Henrik/Desktop/activator-1.3.2-minimal/testApp/app/views/nosidebar.scala.html
                  HASH: 9a300b1f25aff1955cdb304e76c8cbe9d0a1dc76
                  MATRIX: 802->1
                  LINES: 29->1
                  -- GENERATED --
              */
          