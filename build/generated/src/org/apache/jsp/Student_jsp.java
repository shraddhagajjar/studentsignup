package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Student_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>:: Student Portal ::</title>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            .c{\n");
      out.write("                font-family:Georgia, \"Times New Roman\", Times, serif;\n");
      out.write("                font-size:16px;\n");
      out.write("            }\n");
      out.write("            #container{\n");
      out.write("                width:80%;\n");
      out.write("                margin:0px auto;\n");
      out.write("            }\n");
      out.write("            #header{\n");
      out.write("                top:30px;\n");
      out.write("                width:100%;\n");
      out.write("                margin:0px auto;\n");
      out.write("                margin-top:100px;\n");
      out.write("                font-family: Verdana, Arial, Helvetica, sans-serif;\n");
      out.write("                border-top-left-radius: 40px;\n");
      out.write("                border-top-right-radius: 40px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            body {\n");
      out.write("                font-size: 11.5pt;\n");
      out.write("                line-height: 1.75em;\n");
      out.write("                background-image:url(../..//css/bg.JPG);\n");
      out.write("                background-attachment:fixed;\n");
      out.write("                background-position:center;\n");
      out.write("                letter-spacing: -0.02em;\n");
      out.write("            }\n");
      out.write("            ul {\n");
      out.write("                width:100%;\n");
      out.write("                list-style-type: none;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                overflow: hidden;\n");
      out.write("                background-color: #333;\n");
      out.write("            }\n");
      out.write("            #left{\n");
      out.write("                width:20%;\n");
      out.write("                margin:0px auto;\n");
      out.write("                float:left;\n");
      out.write("                height:500px;\n");
      out.write("                padding:0px;\n");
      out.write("\n");
      out.write("                background-color:#9c9;\n");
      out.write("            }\n");
      out.write("            #center{\n");
      out.write("                width:100%;\n");
      out.write("                margin:0px auto;\n");
      out.write("                float:left;\n");
      out.write("                min-height: 600px;\n");
      out.write("                background:#F2F2F2;\n");
      out.write("                border-bottom-left-radius: 40px;\n");
      out.write("                border-bottom-right-radius: 40px;\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            li {\n");
      out.write("                float: left;\n");
      out.write("\n");
      out.write("                margin: 0px auto;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            li a {\n");
      out.write("                display: block;\n");
      out.write("                color: white;\n");
      out.write("                font-size:20px;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 14px 16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            li a:hover:not(.active) {\n");
      out.write("                background-color: #111;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .active {\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("            }\n");
      out.write("            #footer {\n");
      out.write("                width:100%;\n");
      out.write("                height:100px;\n");
      out.write("                clear:both;\n");
      out.write("                top:40px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div id = \"header\" style=\"background-color: #F2F2F2;\">\n");
      out.write("            \n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                <li><a href=\"Student.jsp\">Student</a></li>\n");
      out.write("                <li><a href=\"Admin.jsp\">Admin</a></li>\n");
      out.write("                \n");
      out.write("            </ul>\n");
      out.write("            <h1></h1>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    <center> <h1>New Student</h1>\n");
      out.write("        <form method=\"post\" name=\"form1\" action=\"LoginServlet\">\n");
      out.write("            <table cellspacing = \"5\" cellpadding = \"5\" class=\"c\">\n");
      out.write("            <tr>\n");
      out.write("                <td>User Name</td>\n");
      out.write("                <td><input type=\"text\" name=\"userName\" /> </td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td>Password</td>\n");
      out.write("                <td><input type=\"password\" name=\"password\" /></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"2\">\n");
      out.write("                    ");
      out.print((request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage"));
      out.write("\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><a  href=\"StudentSignUp.jsp\" style=\"color: black; text-decoration: none; font-size: 20px;\" title=\"New Student Click Here\" > SignUp!! </a></td>\n");
      out.write("                <td><input type=\"submit\"  style=\"font-size: 20px;\" value=\"Login\" name=\"Login\" /></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("    </center>\n");
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
