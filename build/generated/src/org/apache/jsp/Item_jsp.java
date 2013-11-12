package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.emart.SelectItemAction;

public final class Item_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \r\n");
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("  \r\n");
      out.write("    <body>\r\n");
      out.write("        <form action=\"purchase\">\r\n");
      out.write("        <div style=\"width: 400px;float:left;\">\r\n");
      out.write("            <table>\r\n");
      out.write("                <tr>\r\n");
      out.write("                   <td> <img src=\"images/hp.gif\" alt=\"image\" width=\"400\" height=\"400\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div style=\"width: 800px;float:left;\">\r\n");
      out.write("            <table >\r\n");
      out.write("                 <tr>\r\n");
      out.write("            <td style=\"font-size: 70px; width:450px ;height:300px; text-align: center\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("            <td style=\"font-size: 20px; width:450px ;height:300px; text-align: center\">\r\n");
      out.write("                <table>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td><label id=\"costLable\">Cost </label></td>      \r\n");
      out.write("                        <td><input readonly name=\"priceLabel\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cost}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>            \r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td><label id=\"quantityLable\">Quantity </label></td>\r\n");
      out.write("                       <td><input type=\"text\" name=\"quantity\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("            </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td style=\"width:200px ;height:250px; text-align: center\" >\r\n");
      out.write("                     <label style=\"font-size: 20px\">Product Description <br>1.");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productDescr}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label><br>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("           \r\n");
      out.write("            </table>\r\n");
      out.write("   </table>\r\n");
      out.write("        </div>\r\n");
      out.write("                <h2> <input type=\"submit\" value=\"Purchase\"/></h2>\r\n");
      out.write("        <div></div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
