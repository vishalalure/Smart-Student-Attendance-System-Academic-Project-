package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Networks.QRMail;
import java.sql.ResultSet;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import DBconnection.SQLconnection;
import java.sql.Statement;
import java.sql.Connection;

public final class sapprove_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String id = request.getParameter("id");

    Connection con = null;
    Statement st = null;
    Statement st1 = null;
    Connection conn = SQLconnection.getconnection();
    Statement sto = conn.createStatement();
    st = conn.createStatement();

    try {
        int i = sto.executeUpdate("update student_reg set status='Approved' where id='" + id + "' ");
        System.out.println("test print==" + id);
        if (i != 0) {
            ResultSet rs = st.executeQuery(" SELECT * from student_reg where id = '" + id + "' ");
            if (rs.next()) {
                String mail = rs.getString("email");
                String name = rs.getString("name");
                String imagePath = "D:\\Authentication\\" + name + ".png";
                String msggg = "Hi, "+name+" Your Student Registration is Approved";
                QRMail ma = new QRMail();
                ma.secretMail(imagePath, "QRCode", mail, msggg, name);
                System.out.println("success");
                response.sendRedirect("student_details.jsp?Approved");
            } else {

                System.out.println("failed");
                response.sendRedirect("student_details.jsp?Failed");
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }

      out.write('\n');
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
