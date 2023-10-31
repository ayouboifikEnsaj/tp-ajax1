package org.apache.jsp.template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("            <img src=\"images/Logo_Ensaj.png\" alt=\"Logo\" class=\"logo\">\n");
      out.write("        </a>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"header\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-12 col-md-6\">\n");
      out.write("                <span id=\"horloge\" style=\"font-family: Courier New; text-align: center; width:100%;\"></span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<script src=\"script/horloge.js\" type=\"text/javascript\"></script>\n");
      out.write("<script>\n");
      out.write("    function updateClock() {\n");
      out.write("        const now = new Date();\n");
      out.write("        const hours = now.getHours().toString().padStart(2, '0');\n");
      out.write("        const minutes = now.getMinutes().toString().padStart(2, '0');\n");
      out.write("        const seconds = now.getSeconds().toString().padStart(2, '0');\n");
      out.write("        document.getElementById('horloge').textContent = `");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hours}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(':');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${minutes}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(':');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${seconds}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("`;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    setInterval(updateClock, 1000);\n");
      out.write("    updateClock(); // Initialize the clock immediately\n");
      out.write("</script>\n");
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
