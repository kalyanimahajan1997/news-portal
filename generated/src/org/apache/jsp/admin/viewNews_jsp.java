package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import daos.NewsDao;
import beans.*;
import java.util.ArrayList;

public final class viewNews_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("  <meta name=\"description\" content=\"\">\n");
      out.write("  <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("  <title>admin dashboard</title>\n");
      out.write("\n");
      out.write("  <script>\n");
      out.write("\n");
      out.write("                function submitForm() {\n");
      out.write("                    document.getElementById(\"f1\").submit();\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("  <!-- Custom fonts for this template-->\n");
      out.write("  \n");
      out.write("  <!-- Custom styles for this template-->\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"page-top\">\n");
      out.write("\n");
      out.write("  <!-- Page Wrapper -->\n");
      out.write("  <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("    <!-- Sidebar -->\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write("\n");
      out.write("    <!-- End of Sidebar -->\n");
      out.write("\n");
      out.write("    <!-- Content Wrapper -->\n");
      out.write("    <div id=\"content-wrapper\" class=\"d-flex flex-column\">\n");
      out.write("\n");
      out.write("      <!-- Main Content -->\n");
      out.write("      <div id=\"content\">\n");
      out.write("\n");
      out.write("        <!-- Topbar -->\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("        <!-- End of Topbar -->\n");
      out.write("\n");
      out.write("        <!-- Begin Page Content -->\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("          <!-- Page Heading -->\n");
      out.write("          <div class=\"d-sm-flex align-items-center justify-content-between mb-4\">\n");
      out.write("            <h1 class=\"h3 mb-0 text-gray-800\">Dashboard</h1>\n");
      out.write("            <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm\"><i class=\"fas fa-download fa-sm text-white-50\"></i> Generate Report</a>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <!-- Content Row -->\n");
      out.write("          <div class=\"row\">\n");
      out.write("\n");
      out.write("             <form id=\"f1\" method=\"get\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("\n");
      out.write("                        <select onchange=\"submitForm();\" name=\"cat_id\" id=\"cat_id\" class=\"dropdown dropdown-header form-control\">\n");
      out.write("                            <option value=\"-1\" >select news category</option>\n");
      out.write("                            <option value=\"\">All News</option>\n");
      out.write("                        ");


                            NewsDao ndo = new NewsDao();
                            ArrayList<NewsCategory> category = new ArrayList();
                            category = ndo.getNewsCategory();
                            for (NewsCategory cat : category) {
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(cat.getId());
      out.write('"');
      out.write('>');
      out.print(cat.getName());
      out.write("<br/>\n");
      out.write("\n");
      out.write("                        ");
}


                        
      out.write("\n");
      out.write("                    </select>\n");
      out.write("\n");
      out.write("                    ");
                    
                        int start = request.getParameter("start") != null ? Integer.parseInt(request.getParameter("start")) : 0;
                        int end = 3;
                        int total = ndo.getRecordCount();
                        ArrayList<News> rows = new ArrayList();
                        String cat_id = request.getParameter("cat_id");
                        if (cat_id == null || cat_id.equals("")) {
                            rows = ndo.getNewsByLimit(start, end);
                        } else {
                            rows = ndo.getNewsByCategory(cat_id);
                        }

                        //  System.out.println("rows:"+rows);
                        for (News news : rows) {
      out.write("\n");
      out.write("                    <div class=\"card col col-md-4\">\n");
      out.write("                        <img src=\"../");
      out.print(news.getImage());
      out.write("\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h5 class=\"card-title\">");
      out.print(news.getTitle());
      out.write("</h5>\n");
      out.write("                            ");

                                String description = news.getDescription().trim();
                                if (description.length() > 100) {
                                    description = description.substring(0, 100);
                                }
                            
      out.write("\n");
      out.write("                            <p class=\"card-text\">");
      out.print(description);
      out.write("</p>\n");
      out.write("                            <a href=\"detailNews.jsp?id=");
      out.print(news.getId());
      out.write("\" class=\"btn btn-primary\">view more</a>\n");
      out.write("                            <a href=\"../NewsController?id=");
      out.print(news.getId());
      out.write("&op=delete\" class=\"btn btn-outline-danger\">Delete</a>\n");
      out.write("                            </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <center>\n");
      out.write("                ");

                    int pages = total / end + (total % end == 0 ? 0 : 1);
                    for (int i = 0; i < pages; i++) {
      out.write("\n");
      out.write("                <span style=\"text-decoration: none; align-content: center;  ");
 if (Math.floor(start / end) == i) {
               out.println("background-color: orange");
           }
      out.write("\" class=\"btn btn-dark\"><a href=\"viewNews.jsp?start=");
      out.print(end * i);
      out.write("\">Page ");
      out.print(i + 1);
      out.write("</a></span> \n");
      out.write("                ");
}
                
      out.write("\n");
      out.write("            </center>\n");
      out.write("            <span style=\"float:left\"><a href=\"viewNews.jsp?start=");
      out.print(start - end);
      out.write("\" class=\"btn btn-primary ");
 if (start == 0) {
              out.println(" disabled");
          }
      out.write(" \">PREVIOUS</a></span>\n");
      out.write("\n");
      out.write("            <span style=\"float:right\"><a href=\"viewNews.jsp?start=");
      out.print(start + end);
      out.write("\" class=\"btn btn-primary ");
 if (start + end >= total) {
                out.println(" disabled");
            }
      out.write(" \">NEXT</a></span>\n");
      out.write("          \n");
      out.write("        </form>\n");
      out.write("            <!-- Earnings (Monthly) Card Example -->\n");
      out.write("             <!-- Earnings (Monthly) Card Example -->\n");
      out.write("            \n");
      out.write("            <!-- Pending Requests Card Example -->\n");
      out.write("             \n");
      out.write("          <!-- Content Row -->\n");
      out.write("\n");
      out.write("          <div class=\"row\">\n");
      out.write("\n");
      out.write("            <!-- Area Chart -->\n");
      out.write("                 <!-- Card Body -->\n");
      out.write("              \n");
      out.write("            <!-- Pie Chart -->\n");
      out.write("                 <!-- Card Body -->\n");
      out.write("              \n");
      out.write("          <!-- Content Row -->\n");
      out.write("          <div class=\"row\">\n");
      out.write("\n");
      out.write("            <!-- Content Column -->\n");
      out.write("            <div class=\"col-lg-6 mb-4\">\n");
      out.write("\n");
      out.write("              <!-- Project Card Example -->\n");
      out.write("             \n");
      out.write("              <!-- Color System -->\n");
      out.write("               <!-- Illustrations -->\n");
      out.write("               \n");
      out.write("              <!-- Approach -->\n");
      out.write("               \n");
      out.write("        </div>\n");
      out.write("        <!-- /.container-fluid -->\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("      <!-- End of Main Content -->\n");
      out.write("\n");
      out.write("      <!-- Footer -->\n");
      out.write("      <footer class=\"sticky-footer bg-white\">\n");
      out.write("         \n");
      out.write("      </footer>\n");
      out.write("      <!-- End of Footer -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- End of Content Wrapper -->\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("  <!-- End of Page Wrapper -->\n");
      out.write("\n");
      out.write("  <!-- Scroll to Top Button-->\n");
      out.write("  <a class=\"scroll-to-top rounded\" href=\"#page-top\">\n");
      out.write("    <i class=\"fas fa-angle-up\"></i>\n");
      out.write("  </a>\n");
      out.write("\n");
      out.write("  <!-- Logout Modal-->\n");
      out.write("  <div class=\"modal fade\" id=\"logoutModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <h5 class=\"modal-title\" id=\"exampleModalLabel\">Ready to Leave?</h5>\n");
      out.write("          <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("            <span aria-hidden=\"true\">×</span>\n");
      out.write("          </button>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">Select \"Logout\" below if you are ready to end your current session.</div>\n");
      out.write("        <div class=\"modal-footer\">\n");
      out.write("          <button class=\"btn btn-secondary\" type=\"button\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("          <a class=\"btn btn-primary\" href=\"login.html\">Logout</a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  \n");
      out.write("</body>\n");
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
