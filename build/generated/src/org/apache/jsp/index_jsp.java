package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\" integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\" crossorigin=\"anonymous\"></link>\n");
      out.write("  <link rel=\"stylesheet\" href=\"CSS/index/index.css\"/>\n");
      out.write("  <link rel=\"stylesheet\" href=\"CSS/sepaFooter.css\"/>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\"/>\n");
      out.write("  <link href=\"CUIDADOR/inicioCuidador.jsp\">\n");
      out.write("  <title>REGISTRO CUIDADOR</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  <header>\n");
      out.write("    <nav class=\"navbar navbar-expand-lg\" style=\"padding-left: 40px;\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("            <img src=\"IMAGES/index/logo.png\" width=\"30\" height=\"30\" alt=\"\">\n");
      out.write("            <b>SEPA</b>\n");
      out.write("        </a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\"\n");
      out.write("            aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("            <ul class=\"nav navbar-nav navbar-nav-first\">\n");
      out.write("                <li class=\"nav-item active\">\n");
      out.write("                    <a class=\"nav-link\" href=\"Inicio.html\"\n");
      out.write("                        style=\"color: white; padding-left: 25px; padding-right: 25px;\">Home\n");
      out.write("                        <span class=\"sr-only\">(current)</span> </a>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("            <ul class=\"nav navbar-nav navbar-nav-first\">\n");
      out.write("              <li class=\"nav-item active\">\n");
      out.write("                  <a class=\"nav-link\" href=\"#\"\n");
      out.write("                      style=\"color: white; padding-left: 25px; padding-right: 25px;\">link\n");
      out.write("                      <span class=\"sr-only\">(current)</span> </a>\n");
      out.write("\n");
      out.write("\n");
      out.write("          </ul>\n");
      out.write("          <ul class=\"nav navbar-nav navbar-nav-first\">\n");
      out.write("            <li class=\"nav-item active\">\n");
      out.write("                <a class=\"nav-link\" href=\"#equipo\"\n");
      out.write("                    style=\"color: white; padding-left: 25px; padding-right: 25px;\">Nosotros\n");
      out.write("                    <span class=\"sr-only\">(current)</span> </a>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("        <ul class=\"nav navbar-nav navbar-nav-first\">\n");
      out.write("          <li class=\"nav-item active\">\n");
      out.write("              <a class=\"nav-link\" href=\"#Contacto\"\n");
      out.write("                  style=\"color: white; padding-left: 25px; padding-right: 25px;\">Contacto\n");
      out.write("                  <span class=\"sr-only\">(current)</span> </a>\n");
      out.write("\n");
      out.write("\n");
      out.write("      </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("           \n");
      out.write("\n");
      out.write("           \n");
      out.write("\n");
      out.write("            <form class=\"nav navbar-nav navbar-nav-first\" style=\"margin-right: 2%; margin-left: 15.5%;\" id=\"search\">\n");
      out.write("                <input type=\"hidden\" name=\"accion\" value=\"ingresar\"/>\n");
      out.write("                <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                <button class=\"btn btn-success my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            <ul class=\"nav navbar-nav navbar-nav-first\">\n");
      out.write("              <li style=\"padding-right: 11px; padding-left: 0px;\" class=\"nav-item dropdown\">\n");
      out.write("                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\"\n");
      out.write("                  aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                  Registrarse\n");
      out.write("                </a>\n");
      out.write("                <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                    <a class=\"dropdown-item\" href=\"RegistroCuidador.jsp\">Cuidador</a>\n");
      out.write("                  <a class=\"dropdown-item\" href=\"#\">Especialista</a>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("                </div>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("</header>\n");
      out.write("<!--INICIO-->\n");
      out.write("  <section id=\"contenido\">\n");
      out.write("\n");
      out.write("    <div style=\"padding-top: 115px;\" class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div style=\"margin-top: 25px;\" class=\"col-md-6\">\n");
      out.write("          <div class=\"about-info\">\n");
      out.write("            <div class=\"section-title\">\n");
      out.write("              <h2>DISEÑADO PARA PERSONAS CON TEA</H2>\n");
      out.write("              <h3>\n");
      out.write("                <p>PLATAFORMA PARA LA GESTIÓN DEL SEGUIMIENTO DE PACIENTES CON TEA</p>\n");
      out.write("                </h2>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!--INICIO SEGUNDA COLUMNA-->\n");
      out.write("        <div style=\"margin-top: 25px;\" id=\"formulario\" class=\"col-md-5\">\n");
      out.write("            <form action=\"ControllerLogin\" method=\"get\">\n");
      out.write("                 <div style=\" border-radius: 10px;\">\n");
      out.write("              <h1> INICIAR SESION</h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                 \n");
      out.write("                  <input id=\"inputlogueo\" type=\"text\" class=\"form-control\" placeholder=\"Usuario\" name=\"txtUsuario\" required=\"true\"\n");
      out.write("                             style=\"margin-top: 18px;margin-left: 41px;\">\n");
      out.write("                  <input type=\"password\" id=\"inputlogueo\" class=\"form-control\" placeholder=\"Contraseña\" name=\"txtContrasena\" required=\"true\"\n");
      out.write("                             style=\"margin-top: 18px;margin-left: 41px;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                  <button id=\"botonlogueo\" type=\"submit\" id=\"boton\" name=\"accion\" value=\"ingresar\"  class=\"btn btn-info\">Entrar</button>\n");
      out.write("                      \n");
      out.write("                  \n");
      out.write("                    \n");
      out.write("\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("             </form>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!--NOSOTROS-->\n");
      out.write(" \n");
      out.write("  \n");
      out.write("  <!--NOSOTROS SEGUNDO BLOQUE-->\n");
      out.write("  <section>\n");
      out.write("    <section id=equipo>\n");
      out.write("      <div class=\"tituloequipo\">\n");
      out.write("        <P>NUESTRO EQUIPO</P>\n");
      out.write("      </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("\n");
      out.write("      <div class=\"col-md-3 col-sm-6\">\n");
      out.write("        <div class=\"container-equipo\">\n");
      out.write("          <div class=\"pic\">\n");
      out.write("              <img src=\"IMAGES/index/niño3.jpg\" alt=\"\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"equipo-content\">\n");
      out.write("            <h3 class=\"tituloequipo\">Eduardo</h3>\n");
      out.write("            <span class=\"post\">Frontend Developer</span>\n");
      out.write("          </div>\n");
      out.write("          <ul class=\"social\">\n");
      out.write("            <li><a href=\"\" class=\"fa fa-facebook\"></a></li>\n");
      out.write("            <li><a href=\"\" class=\"fa fa-twitter\"></a></li>\n");
      out.write("            <li><a href=\"\" class=\"fa fa-google-plus\"></a></li>\n");
      out.write("            <li><a href=\"\" class=\"fa fa-linkedin\"></a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"col-md-3 col-sm-6\">\n");
      out.write("        <div class=\"container-equipo\">\n");
      out.write("          <div class=\"pic\">\n");
      out.write("              <img src=\"IMAGES/index/niño4.jpg\" alt=\"\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"equipo-content\">\n");
      out.write("            <h3 class=\"tituloequipo\">Juan Pablo</h3>\n");
      out.write("            <span class=\"post\">Full Stack Developer</span>\n");
      out.write("          </div>\n");
      out.write("          <ul class=\"social\">\n");
      out.write("            <li><a href=\"\" class=\"fa fa-facebook\"></a></li>\n");
      out.write("            <li><a href=\"\" class=\"fa fa-twitter\"></a></li>\n");
      out.write("            <li><a href=\"\" class=\"fa fa-google-plus\"></a></li>\n");
      out.write("            <li><a href=\"\" class=\"fa fa-linkedin\"></a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"col-md-3 col-sm-6\">\n");
      out.write("        <div class=\"container-equipo\">\n");
      out.write("          <div class=\"pic\">\n");
      out.write("              <img src=\"IMAGES/index/niño5.jpg\" alt=\"\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"equipo-content\">\n");
      out.write("            <h3 class=\"tituloequipo\">Javier</h3>\n");
      out.write("            <span class=\"post\">Analyst</span>\n");
      out.write("          </div>\n");
      out.write("          <ul class=\"social\">\n");
      out.write("            <li><a href=\"\" class=\"fa fa-facebook\"></a></li>\n");
      out.write("            <li><a href=\"\" class=\"fa fa-twitter\"></a></li>\n");
      out.write("            <li><a href=\"\" class=\"fa fa-google-plus\"></a></li>\n");
      out.write("            <li><a href=\"\" class=\"fa fa-linkedin\"></a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"col-md-3 col-sm-6\">\n");
      out.write("        <div class=\"container-equipo\">\n");
      out.write("          <div class=\"pic\">\n");
      out.write("              <img src=\"IMAGES/registroCuidador/niño6.jpg\" alt=\"\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"equipo-content\">\n");
      out.write("            <h3 class=\"tituloequipo\">Robert</h3>\n");
      out.write("            <span class=\"post\">Backend Developer</span>\n");
      out.write("          </div>\n");
      out.write("          <ul class=\"social\">\n");
      out.write("            <li><a href=\"\" class=\"fa fa-facebook\"></a></li>\n");
      out.write("            <li><a href=\"\" class=\"fa fa-twitter\"></a></li>\n");
      out.write("            <li><a href=\"\" class=\"fa fa-google-plus\"></a></li>\n");
      out.write("            <li><a href=\"\" class=\"fa fa-linkedin\"></a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" <!--CONTACTO-->\n");
      out.write(" <section id=\"Contacto\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    \n");
      out.write("     <div class=\"row\">\n");
      out.write("\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("           <div class=\"col-md-12\">\n");
      out.write("              <div class=\"section-title\">\n");
      out.write("                 <h5>Contáctenos</h5>\n");
      out.write("              </div>\n");
      out.write("           </div>\n");
      out.write("           <form action=\"#\">\n");
      out.write("             <div class=\"container\">\n");
      out.write("             <div class=\"row\">\n");
      out.write("              <div style=\"padding-top: 25px;\" class=\"col-md-6\">\n");
      out.write("                 <input type=\"text\" class=\"form-control\" name=\"busca_id\" id=\"cf-name\" placeholder=\"Nombre\">\n");
      out.write("              </div>\n");
      out.write("              <div style=\"padding-top: 25px;\" class=\"col-md-6\">\n");
      out.write("                <input type=\"email\" class=\"form-control\" name=\"email\" id=\"cf-email\"\n");
      out.write("                   placeholder=\"Correo Electrónico\">\n");
      out.write("             </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("              <div class=\"col-md-12\">\n");
      out.write("                 <input type=\"text\" class=\"form-control\" name=\"subject\" id=\"cf-subject\" placeholder=\"Asunto\">\n");
      out.write("                 <textarea class=\"form-control\" rows=\"6\" id=\"cf-message\" name=\"message\"\n");
      out.write("                    placeholder=\"Deja algún mensaje\"></textarea>\n");
      out.write("\n");
      out.write("                 <button\n");
      out.write("                    style=\"width: 100%;margin-top: 0px; background: #18894B; border-color: #18894B; font-size: 17px;\"\n");
      out.write("                    class=\"btn btn-info\"> Enviar</button>\n");
      out.write("              </div>\n");
      out.write("           </form>\n");
      out.write("        </div>\n");
      out.write("     </div>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<!--FOOTER/FIn-->\n");
      out.write("<section id=\"footer\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      <footer>\n");
      out.write("\n");
      out.write("        <div class=\"container-footer-all\">\n");
      out.write("\n");
      out.write("          <div class=\"container-body\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"colum2\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("              <div class=\"row-footer\">\n");
      out.write("                  <img style=\"width: 36px;\" src=\"IMAGES/icons/facebook.png\">\n");
      out.write("                <a href=\"#\" id=\"footerlabel\"><B>Siguenos en Facebook</B></a>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"row-footer\">\n");
      out.write("                  <img style=\"width: 36px;\" src=\"IMAGES/icons/twitter.png\">\n");
      out.write("                <a href=\"#\" id=\"footerlabel\"><b>Siguenos en Twitter</b></a>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"row-footer\">\n");
      out.write("                  <img style=\"width: 36px;\" src=\"IMAGES/icons/instagram.png\">\n");
      out.write("                <a href=\"#\" id=\"footerlabel\"><b>Siguenos en Instagram</b></a>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"row-footer\">\n");
      out.write("                  <img style=\"width: 36px;\" src=\"IMAGES/icons/google-plus.png\">\n");
      out.write("                <a href=\"#\" id=\"footerlabel\"><b>Siguenos en Google Plus</b></a>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"row-footer\">\n");
      out.write("                  <img style=\"width: 36px;\" src=\"IMAGES/icons/pinterest.png\">\n");
      out.write("                <a href=\"#\" id=\"footerlabel\"><b>Siguenos en Pinteres</b></a>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container-footer\">\n");
      out.write("          <div class=\"footer\">\n");
      out.write("            <div class=\"copyright\">\n");
      out.write("              © 2019 Todos los Derechos Reservados | <a href=\"\">SEPA</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"information\">\n");
      out.write("              <a href=\"\">Privacion y Politica</a> | <a href=\"\">Terminos y\n");
      out.write("                Condiciones</a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </footer>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <script src=\"http://code.jquery.com/jquery-latest.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"\n");
      out.write("    integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\"\n");
      out.write("    crossorigin=\"anonymous\"></script>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<!--Scripts-->\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\"\n");
      out.write("  integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"\n");
      out.write("  integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"\n");
      out.write("  integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
