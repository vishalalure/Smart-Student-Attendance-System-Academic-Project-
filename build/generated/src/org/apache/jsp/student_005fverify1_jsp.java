package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Action.QRCodeExtract;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.security.SecureRandom;
import java.util.Random;
import Networks.Mail;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import DBconnection.SQLconnection;
import java.sql.Connection;
import com.oreilly.servlet.MultipartRequest;

public final class student_005fverify1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    try {
        String setvall;
        String status = null;
        final String filepath = "D:/Authentication/";
        MultipartRequest m = new MultipartRequest(request, filepath);
        String id = m.getParameter("id");
        File file = m.getFile("file");
        String path = file.toString();
        String filename = file.getName().toLowerCase();
        Connection con = SQLconnection.getconnection();
        Statement st = con.createStatement();
        Statement st1 = con.createStatement();
        Statement sto = con.createStatement();
        System.out.println("Check User ID : " + id);
        System.out.println("Check path : " + path);

        QRCodeExtract qrread = new QRCodeExtract();
        qrread.QRCodeReader(path);
        setvall = QRCodeExtract.getvall;

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String time = dateFormat.format(date);
        System.out.println("Date and Time : " + time);

        DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = new Date();
        System.out.println(dateFormat1.format(date1));
        String indate = dateFormat1.format(date1);
        //
        DateFormat TimeFormat = new SimpleDateFormat("HH:mm:ss");
        Date CurrentTime = new Date();
        System.out.println(TimeFormat.format(CurrentTime));
        String ctime = TimeFormat.format(CurrentTime);

        System.out.println("Check details : " + setvall);
        ResultSet rs = sto.executeQuery("SELECT * FROM student_reg where details ='" + setvall + "' AND id ='" + id + "' ");
        if (rs.next()) {
            String name = rs.getString("name");
            String email = rs.getString("email");
            String dept = rs.getString("dept");
            String year = rs.getString("year");
            int i = st1.executeUpdate("insert into attendance (sid, name, email, time , details, dept, year, date, ctime)values('" + id + "','" + name + "','" + email + "','" + time + "','" + setvall + "','" + dept + "','" + year + "','" + indate + "','" + ctime + "')");
            response.sendRedirect("Student_Home.jsp?Success");
        } else {
            response.sendRedirect("Student_login.jsp?Msg=Incorrect_QR-code");

        }

    } catch (Exception ex) {
        ex.printStackTrace();
        response.sendRedirect("Student_login.jsp?Msg=Incorrect_QR-code");
    }

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
