package org.apache.jsp.reporter;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import daos.CategoryDao;
import beans.NewsCategory;
import beans.News;
import beans.Reporter;
import java.util.ArrayList;

public final class addNews_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Adding News</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("                function readURL(input,preview) {\n");
      out.write("                    if (input.files && input.files[0]) {\n");
      out.write("                        var reader = new FileReader();\n");
      out.write("\n");
      out.write("                        reader.onload = function (e) {\n");
      out.write("                            preview.src = e.target.result;\n");
      out.write("                        };\n");
      out.write("\n");
      out.write("                        reader.readAsDataURL(input.files[0]);\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                </script>\n");
      out.write(" \n");
      out.write("    <style>\n");
      out.write("      .bd-placeholder-img {\n");
      out.write("        font-size: 1.125rem;\n");
      out.write("        text-anchor: middle;\n");
      out.write("        -webkit-user-select: none;\n");
      out.write("        -moz-user-select: none;\n");
      out.write("        -ms-user-select: none;\n");
      out.write("        user-select: none;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      @media (min-width: 768px) {\n");
      out.write("        .bd-placeholder-img-lg {\n");
      out.write("          font-size: 3.5rem;\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("      \n");
      out.write("      ");

          if(session.getAttribute("reporter")==null){
              response.sendRedirect("../login.jsp");
              return;
          }
      
      out.write("\n");
      out.write("      \n");
      out.write("      \n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("  <div class=\"row\">\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write("\n");
      out.write("  \n");
      out.write("    <main role=\"main\" class=\"col-md-9 ml-sm-auto col-lg-10 px-4\">\n");
      out.write("      <div class=\"d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom\">\n");
      out.write("     \n");
      out.write("    \n");
      out.write("   ");
      beans.Reporter reporter = null;
      synchronized (session) {
        reporter = (beans.Reporter) _jspx_page_context.getAttribute("reporter", PageContext.SESSION_SCOPE);
        if (reporter == null){
          reporter = new beans.Reporter();
          _jspx_page_context.setAttribute("reporter", reporter, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("    ");
      beans.News news = null;
      synchronized (session) {
        news = (beans.News) _jspx_page_context.getAttribute("news", PageContext.SESSION_SCOPE);
        if (news == null){
          news = new beans.News();
          _jspx_page_context.setAttribute("news", news, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <div class=\"container\"><br><br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3\" style=\"position: fixed;right:0px;\">\n");
      out.write("                    ");

                        if (request.getParameter("submit")!=null){
                        String catids[]  = request.getParameterValues("category");
                        String cat="";
                        for(String c : catids)
                        {
                            cat += c + ",";
                        }
                        System.out.println("cat:"+cat);
                        session.setAttribute("catids", cat);
                    
      out.write("\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("news"), request);
      out.write("\n");
      out.write("                    <form action=\"../NewsController?op=add\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                    <img src=\"\" style=\"width:200px; height: 200px;\" id=\"preview\" class=\"form-control\"/> <br/>\n");
      out.write("                    <input type=\"file\" name=\"image\" onchange=\"readURL(this,preview);\" class=\"form-control btn btn-success\"/> <br/>\n");
      out.write("                    <input type=\"submit\" value=\"Save to Data base \" class=\"btn btn-primary\" name=\"submit\"/>\n");
      out.write("                    </form>\n");
      out.write("                    ");

                }
      out.write("\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <div class=\"col col-md-9\">\n");
      out.write("                    <form method=\"post\" class=\"form\">\n");
      out.write("                        <table class=\"table\">\n");
      out.write("                            <tr><th colspan=\"2\"><center><h2>Add News Here </h2></center></th></tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Enter News Title </td>\n");
      out.write("                                <td><input type=\"text\" name=\"title\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${news.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n");
      out.write("                            </tr> \n");
      out.write("                             <tr>\n");
      out.write("                                <td>Enter Description </td>\n");
      out.write("                                <td><textarea name=\"description\" rows=\"10\" cols=\"20\" class=\"form-control\">\n");
      out.write("                                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${news.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                                    </textarea> \n");
      out.write("                               </td>\n");
      out.write("                            </tr> \n");
      out.write("                             \n");
      out.write("                            <input type=\"hidden\" name=\"reporter_id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${reporter.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                            <input type=\"hidden\" name=\"status\" value=\"Pending\"/>\n");
      out.write("                            <input type=\"hidden\" name=\"status_text\" value=\"Pending for Approval By Admin\"/>\n");
      out.write("                       \n");
      out.write("                            <tr>\n");
      out.write("                                <td>Select Categories </td>\n");
      out.write("                                <td>\n");
      out.write("                                    ");

                                        CategoryDao cd = new CategoryDao();
                                        ArrayList<NewsCategory> categories =  cd.getAllNewsCategory();
                                        for(NewsCategory cat : categories){
      out.write(" \n");
      out.write("                                        <input type=\"checkbox\" name=\"category\" value=\"");
      out.print(cat.getId());
      out.write("\" /> ");
      out.print(cat.getName());
      out.write(" \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        \n");
      out.write("                        </table>\n");
      out.write("                            <input type=\"submit\" value=\"save and Next\" name=\"submit\" id =\"submit\" class=\"form-control btn btn-primary\"/>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                 \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </center>    \n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      \n");
      out.write("    </main>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("   </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
