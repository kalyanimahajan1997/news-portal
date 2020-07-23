package org.apache.jsp.reporter;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sidebar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write(" <nav class=\"col-md-2 d-none d-md-block bg-light sidebar\">\n");
      out.write("      <div class=\"sidebar-sticky\"><br><br>\n");
      out.write("        <ul class=\"nav flex-column\">\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link active\" href=\"dashboard.jsp\">\n");
      out.write("                    <img src=\"../");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${reporter.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"width: 64px;height: 64px;border-radius: 50%;border-style: solid; \"><br><br>\n");
      out.write("              <span data-feather=\"home\"></span>\n");
      out.write("              Dashboard <span class=\"sr-only\">(current)</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"addNews.jsp\">\n");
      out.write("              <span data-feather=\"file\"></span>\n");
      out.write("              <i class=\"fa fa-plus-square\"></i> Add News\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"viewNews.jsp\">\n");
      out.write("              <span data-feather=\"shopping-cart\"></span>\n");
      out.write("              <i class=\"fa fa-pencil\"></i> Update News\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"editProfile.jsp\">\n");
      out.write("              <span data-feather=\"users\"></span>\n");
      out.write("             <i class=\"fa fa-user-md\"></i>   Update Profile\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link\" href=\"ForgetPassword.jsp\">\n");
      out.write("              <span data-feather=\"bar-chart-2\"></span>\n");
      out.write("              <i class=\"fa fa-key\"></i>  Change Profile\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("        <h6 class=\"sidebar-heading d-flex justify-content-between align-items-center px-3 mt-4 mb-1 text-muted\">\n");
      out.write("          <span>reports</span>\n");
      out.write("          <a class=\"d-flex align-items-center text-muted\" href=\"#\" aria-label=\"Add a new report\">\n");
      out.write("            <span data-feather=\"plus-circle\"></span>\n");
      out.write("          </a>\n");
      out.write("        </h6>\n");
      out.write("        <ul class=\"nav flex-column mb-2\">\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"viewPendingNews.jsp\">\n");
      out.write("              <span data-feather=\"file-text\"></span>\n");
      out.write("               <i class=\"fa fa-adjust\"></i> Pending News\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"viewApprovedNews.jsp\">\n");
      out.write("              <span data-feather=\"file-text\"></span>\n");
      out.write("               <i class=\"fa fa-check-square-o\"></i> Approved news\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"viewRejectedNews.jsp\">\n");
      out.write("              <span data-feather=\"file-text\"></span>\n");
      out.write("                <i class=\"fa fa-times-rectangle\"></i> Rejected News\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"updateNews.jsp\">\n");
      out.write("              <span data-feather=\"file-text\"></span>\n");
      out.write("                <i class=\"fa fa-times-rectangle\"></i> Rejected News\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
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
