package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import DBconnection.SQLconnection;
import java.sql.Statement;
import java.sql.Connection;

public final class attendance_005fdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js\"></script>  \n");
      out.write("        <script src=\"table2excel.js\" type=\"text/javascript\"></script>    \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        div.ex1 {\n");
      out.write("            width: auto;\n");
      out.write("            height: auto;\n");
      out.write("            overflow: scroll;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <style>\n");
      out.write("\n");
      out.write("        .customers {\n");
      out.write("            font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n");
      out.write("            font-size: 20px;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .customers td, .customers th {\n");
      out.write("            border: 2px solid black;\n");
      out.write("            align:\"center\";  cellpadding:\"0\"; cellspacing:\"2\";\n");
      out.write("            padding: 15px;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        .customers th {\n");
      out.write("            padding-top: 12px;\n");
      out.write("            padding-bottom: 12px;\n");
      out.write("            text-align: left;\n");
      out.write("            background-color: #3399ff;\n");
      out.write("            color: black;\n");
      out.write("        }\n");
      out.write("    </style>\n");
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
      out.write("                        <li><a href=\"Staff_Home.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"student_details.jsp\">Students</a></li>\n");
      out.write("                        <li class=\"active\"><a href=\"attendance_details.jsp\">Attendance</a></li>\n");
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
      out.write("                        <h2 class=\"wow bounceIn\" data-wow-offset=\"50\">Attendance Details</h2>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <form action=\"attendance_details1.jsp\" method=\"post\">\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label>ATTENDANCE DATE</label>\n");
      out.write("                                    <input type=\"date\" name=\"adate\" class=\"form-control\" required=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-3\"><br>\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-success btn-lg\">Submit</button>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-12 wow fadeInLeft\" data-wow-offset=\"50\" ><br><br><br> \n");
      out.write("                        <button class=\"btn btn-primary\"  id=\"btnExporttoExcel\">Export To Excel</button>  \n");
      out.write("                        <div class=\"ex1\">\n");
      out.write("                            <br>\n");
      out.write("                            <table class=\"customers\" id=\"tblEmployee\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>                \n");
      out.write("                                        <th>ID</th>\n");
      out.write("                                        <th>Name</th>\n");
      out.write("                                        <th>Email</th>\n");
      out.write("                                        <th>Department</th>\n");
      out.write("                                        <th>Year</th>\n");
      out.write("                                        <th>Attendance Time</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                    ");

                                        Connection con = SQLconnection.getconnection();
                                        Statement st = con.createStatement();
                                        try {
                                            ResultSet rs = st.executeQuery("SELECT * FROM attendance ");
                                            while (rs.next()) {
                                    
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>");
      out.print(rs.getString("sid"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(rs.getString("name"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(rs.getString("email"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(rs.getString("dept"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(rs.getString("year"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(rs.getString("time"));
      out.write("</td>\n");
      out.write("                                        ");
                                        }
                                            } catch (Exception ex) {
                                                ex.printStackTrace();
                                            }

                                        
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>   \n");
      out.write("                            <script>\n");
      out.write("                                $(\"#yourHtmTable\").table2excel({\n");
      out.write("                                    exclude: \".excludeThisClass\",\n");
      out.write("                                    name: \"Worksheet Name\",\n");
      out.write("                                    filename: \"SomeFile\"\n");
      out.write("                                });\n");
      out.write("                            </script>\n");
      out.write("                            <script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js\"></script>  \n");
      out.write("                            <script src=\"table2excel.js\" type=\"text/javascript\"></script>  \n");
      out.write("                            <script type=\"text/javascript\">\n");
      out.write("                                $(function () {\n");
      out.write("                                    $(\"#btnExporttoExcel\").click(function () {\n");
      out.write("                                        $(\"#tblEmployee\").table2excel({\n");
      out.write("                                            filename: \"AttendanceDetails.xls\"\n");
      out.write("                                        });\n");
      out.write("                                    });\n");
      out.write("                                });\n");
      out.write("                            </script>\n");
      out.write("                        </div>\n");
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
      out.write("                            &copy; 2021</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <!-- end copyright -->\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js\"></script>  \n");
      out.write("        <script src=\"js/table2excel.js\" type=\"text/javascript\"></script>  \n");
      out.write("\n");
      out.write("        <script  src=\"Table/script.js\"></script>\n");
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
