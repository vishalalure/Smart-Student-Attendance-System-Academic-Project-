package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Staff_005fHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Student Attendance System</title>\n");
      out.write("        <meta name=\"keywords\" content=\"\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700' rel='stylesheet' type='text/css'>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/templatemo-style.css\">\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.singlePageNav.min.js\"></script>\n");
      out.write("        <script src=\"js/typed.js\"></script>\n");
      out.write("        <script src=\"js/wow.min.js\"></script>\n");
      out.write("        <script src=\"js/custom.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    ");

        if (request.getParameter("Success") != null) {
    
      out.write("\n");
      out.write("    <script>alert('Login Success');</script>\n");
      out.write("    ");
            }
    
      out.write("\n");
      out.write("    <body id=\"top\">\n");
      out.write("\n");
      out.write("        <!-- start preloader -->\n");
      out.write("        <div class=\"preloader\">\n");
      out.write("            <div class=\"sk-spinner sk-spinner-wave\">\n");
      out.write("                <div class=\"sk-rect1\"></div>\n");
      out.write("                <div class=\"sk-rect2\"></div>\n");
      out.write("                <div class=\"sk-rect3\"></div>\n");
      out.write("                <div class=\"sk-rect4\"></div>\n");
      out.write("                <div class=\"sk-rect5\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- end preloader -->\n");
      out.write("\n");
      out.write("        <!-- start header -->\n");
      out.write("        <header>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(\"#bs-example-navbar-collapse-1\").find(\"a:not(.dropdown-toggle)\").off(\"click\").off(\"mousedown\");\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!-- end header -->\n");
      out.write("\n");
      out.write("        <!-- start navigation -->\n");
      out.write("        <nav class=\"navbar navbar-default templatemo-nav\" role=\"navigation\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                        <span class=\"icon icon-bar\"></span>\n");
      out.write("                        <span class=\"icon icon-bar\"></span>\n");
      out.write("                        <span class=\"icon icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a href=\"#\" class=\"navbar-brand\"><i class=\"fa fa-bars fa-2x\"></i></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id='bs-example-navbar-collapse-1'>\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li class=\"active\"><a href=\"Staff_Home.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"student_details.jsp\">Students</a></li>\n");
      out.write("                        <li><a href=\"attendance_details.jsp\">Attendance</a></li>\n");
      out.write("                        <li><a href=\"index.jsp\">Logout</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <!-- end navigation -->\n");
      out.write("\n");
      out.write("        <!-- start home -->\n");
      out.write("        <section id=\"home\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <h1 class=\"wow fadeIn\" data-wow-offset=\"50\" data-wow-delay=\"0.9s\">\n");
      out.write("                            <span>Student Attendance System Using QR-Code</span></h1>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- end home -->\n");
      out.write("\n");
      out.write("        <!-- start about -->\n");
      out.write("        <section id=\"about\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <h2 class=\"wow bounceIn\" data-wow-offset=\"50\">Welcome Staff!</h2>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-12 wow fadeInLeft\" data-wow-offset=\"50\" >\n");
      out.write("                        <img src=\"images/main.jpg\" width=\"1100\" height=\"500\" />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- end about -->\n");
      out.write("\n");
      out.write("        <!-- end contact -->\n");
      out.write("\n");
      out.write("        <!-- start copyright -->\n");
      out.write("        <footer id=\"copyright\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12 text-center\">\n");
      out.write("                        <p class=\"wow bounceIn\" data-wow-offset=\"50\" data-wow-delay=\"0.3s\">\n");
      out.write("                            &copy; SoftTech Support..</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <!-- end copyright --> \n");
      out.write("\n");
      out.write("    </body>\n");
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
