package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class services_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <title>Services</title>\n");
      out.write("        <link rel=\"icon\" type=\"image/ico\" href=\"assets/images/about.ico\"> \n");
      out.write("\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link href=\"assets/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"assets/css/shop-homepage.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/animate.min.css\">\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("            <style>\n");
      out.write("\n");
      out.write("                body {\n");
      out.write("                    background:#000000 !important;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                /*\n");
      out.write("                \n");
      out.write("                */\n");
      out.write("\n");
      out.write("                h3 {\n");
      out.write("                    color: rgba(31,181,172,.9);\n");
      out.write("                }\n");
      out.write("                .text{\n");
      out.write("                    color: rgba(31,181,172,.9);\n");
      out.write("                    text-align: center;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("                .folded-corner:hover .text{\n");
      out.write("                    visibility: visible;\n");
      out.write("                    color: #000000;;\n");
      out.write("                }\n");
      out.write("                .Services-tab{\n");
      out.write("                    margin-top:20px;\n");
      out.write("\n");
      out.write("\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                /*\n");
      out.write("                  nav link items\n");
      out.write("                */\n");
      out.write("                .folded-corner{\n");
      out.write("                    padding: 25px 25px;\n");
      out.write("                    position: relative;\n");
      out.write("                    font-size: 90%;\n");
      out.write("                    text-decoration: none;\n");
      out.write("                    color: #999; \n");
      out.write("                    background: transparent;\n");
      out.write("                    transition: all ease .5s;\n");
      out.write("                    border: 1px solid rgba(31,181,172,.9);\n");
      out.write("                }\n");
      out.write("                .folded-corner:hover{\n");
      out.write("                    background-color: rgba(31,181,172,.9);\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                /*\n");
      out.write("                  paper fold corner\n");
      out.write("                */\n");
      out.write("\n");
      out.write("                .folded-corner:before {\n");
      out.write("                    content: \"\";\n");
      out.write("                    position: absolute;\n");
      out.write("                    top: 0;\n");
      out.write("                    right: 0;\n");
      out.write("                    border-style: solid;\n");
      out.write("                    border-width: 0 0px 0px 0;\n");
      out.write("                    border-color: #ddd #000;\n");
      out.write("                    transition: all ease .3s;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                /*\n");
      out.write("                  on li hover make paper fold larger\n");
      out.write("                */\n");
      out.write("                .folded-corner:hover:before {\n");
      out.write("                    background-color: #D00003;\n");
      out.write("                    border-width: 0 50px 50px 0;\n");
      out.write("                    border-color: #eee #000;\n");
      out.write("\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .service_tab_1{\n");
      out.write("                    background-color: #000;\n");
      out.write("                }\n");
      out.write("                .service_tab_1:hover .fa-icon-image{\n");
      out.write("                    color: #000;\n");
      out.write("                    transform: rotate(360deg) scale(1.5);\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("                .fa-icon-image{\n");
      out.write("                    color: rgba(31,181,172,.9);\n");
      out.write("                    display: inline-block;\n");
      out.write("                    font-style: normal;\n");
      out.write("                    font-variant: normal;\n");
      out.write("                    font-weight: normal;\n");
      out.write("                    line-height: 1;\n");
      out.write("                    font-size-adjust: none;\n");
      out.write("                    font-stretch: normal;\n");
      out.write("                    -moz-font-feature-settings: normal;\n");
      out.write("                    -moz-font-language-override: normal;\n");
      out.write("                    text-rendering: auto;\n");
      out.write("                    transition: all .65s linear 0s;\n");
      out.write("                    text-align: center;\n");
      out.write("                    transition: all 1s cubic-bezier(.99,.82,.11,1.41);\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("            </style>\n");
      out.write("        </head>\n");
      out.write("\n");
      out.write("        <body>\n");
      out.write("\n");
      out.write("             <div class=\"container\">\n");
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"row\" >\n");
      out.write("                    <ul>\n");
      out.write("                        <div class=\"col-lg-3 col-md-3 col-sm-12 col-xs-12 Services-tab  item\">\n");
      out.write("                            <div class=\"folded-corner service_tab_1\">\n");
      out.write("                                <div class=\"text\">\n");
      out.write("                                    <i class=\"fa fa-image fa-5x fa-icon-image\"></i>\n");
      out.write("                                    <p class=\"item-title\">\n");
      out.write("                                    <h3> Designing</h3>\n");
      out.write("                                    </p><!-- /.item-title -->\n");
      out.write("                                    <p>\n");
      out.write("                                        This is an amazing set of animated accordions based completely on CSS. They come oriented both vertically and horizontally in order to fit properly in your project. In order to see the slides, \n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-3 col-md-3 col-sm-12 col-xs-12 Services-tab item\">\n");
      out.write("                            <div class=\"folded-corner service_tab_1\">\n");
      out.write("                                <div class=\"text\">\n");
      out.write("                                    <i class=\"fa fa-lightbulb-o fa-5x fa-icon-image\" ></i>\n");
      out.write("                                    <p class=\"item-title\">\n");
      out.write("                                    <h3> Developing</h3>\n");
      out.write("                                    </p><!-- /.item-title -->\n");
      out.write("                                    <p>\n");
      out.write("                                        This is an amazing set of animated accordions based completely on CSS. They come oriented both vertically and horizontally in order to fit properly in your project. In order to see the slides, \n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-3 col-md-3 col-sm-12 col-xs-12 Services-tab item\">\n");
      out.write("                            <div class=\"folded-corner service_tab_1\">\n");
      out.write("                                <div class=\"text\">\n");
      out.write("                                    <i class=\"fa fa-truck fa-5x fa-icon-image\"></i>\n");
      out.write("                                    <p class=\"item-title\">\n");
      out.write("                                    <h3> Marketing</h3>\n");
      out.write("                                    </p><!-- /.item-title -->\n");
      out.write("                                    <p>\n");
      out.write("                                        This is an amazing set of animated accordions based completely on CSS. They come oriented both vertically and horizontally in order to fit properly in your project. In order to see the slides, \n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-3 col-md-3 col-sm-12 col-xs-12 Services-tab item\">\n");
      out.write("                            <div class=\"folded-corner service_tab_1\">\n");
      out.write("                                <div class=\"text\">\n");
      out.write("                                    <i class=\"fa fa-diamond fa-5x fa-icon-image\"></i>\n");
      out.write("                                    <p class=\"item-title\">\n");
      out.write("                                    <h3> Branding</h3>\n");
      out.write("                                    </p><!-- /.item-title -->\n");
      out.write("                                    <p>\n");
      out.write("                                        This is an amazing set of animated accordions based completely on CSS. They come oriented both vertically and horizontally in order to fit properly in your project. In order to see the slides, \n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-3 col-md-3 col-sm-12 col-xs-12 Services-tab item\">\n");
      out.write("                            <div class=\"folded-corner service_tab_1\">\n");
      out.write("                                <div class=\"text\">\n");
      out.write("                                    <i class=\"fa fa-line-chart fa-5x fa-icon-image\"></i>\n");
      out.write("                                    <p class=\"item-title\">\n");
      out.write("                                    <h3>Analytics</h3>\n");
      out.write("                                    </p><!-- /.item-title -->\n");
      out.write("                                    <p>\n");
      out.write("                                        This is an amazing set of animated accordions based completely on CSS. They come oriented both vertically and horizontally in order to fit properly in your project. In order to see the slides, \n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-3 col-md-3 col-sm-12 col-xs-12 Services-tab item\">\n");
      out.write("                            <div class=\"folded-corner service_tab_1\">\n");
      out.write("                                <div class=\"text\">\n");
      out.write("                                    <i class=\"fa fa-mobile fa-5x fa-icon-image\"></i>\n");
      out.write("                                    <p class=\"item-title\">\n");
      out.write("                                    <h3>Mobil Apps</h3>\n");
      out.write("                                    </p><!-- /.item-title -->\n");
      out.write("                                    <p>\n");
      out.write("                                        This is an amazing set of animated accordions based completely on CSS. They come oriented both vertically and horizontally in order to fit properly in your project. In order to see the slides, \n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-3 col-md-3 col-sm-12 col-xs-12 Services-tab item\">\n");
      out.write("                            <div class=\"folded-corner service_tab_1\">\n");
      out.write("                                <div class=\"text\">\n");
      out.write("                                    <i class=\"fa fa-money fa-5x fa-icon-image\"></i>\n");
      out.write("                                    <p class=\"item-title\">\n");
      out.write("                                    <h3> e-commerce</h3>\n");
      out.write("                                    </p><!-- /.item-title -->\n");
      out.write("                                    <p>\n");
      out.write("                                        This is an amazing set of animated accordions based completely on CSS. They come oriented both vertically and horizontally in order to fit properly in your project. In order to see the slides, \n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-3 col-md-3 col-sm-12 col-xs-12 Services-tab item\">\n");
      out.write("                            <div class=\"folded-corner service_tab_1\">\n");
      out.write("                                <div class=\"text\">\n");
      out.write("                                    <i class=\"fa fa-bullhorn fa-5x fa-icon-image\"></i>\n");
      out.write("                                    <p class=\"item-title\">\n");
      out.write("                                    <h3> Support</h3>\n");
      out.write("                                    </p><!-- /.item-title -->\n");
      out.write("                                    <p>\n");
      out.write("                                        This is an amazing set of animated accordions based completely on CSS. They come oriented both vertically and horizontally in order to fit properly in your project. In order to see the slides, \n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- /.container -->\n");
      out.write("\n");
      out.write("<!-- Footer -->\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("<!-- Bootstrap core JavaScript -->\n");
      out.write("<script src=\"assets/jquery/jquery.min.js\"></script>\n");
      out.write("<script src=\"assets/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
