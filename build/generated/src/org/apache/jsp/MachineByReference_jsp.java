package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ma.school.beans.Machine;
import ma.school.service.MachineService;

public final class MachineByReference_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/template/header.jsp");
    _jspx_dependants.add("/template/menu.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"style/css.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"style/csslocal.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"script/jquery-3.3.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"script/machineByReference.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
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
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("    <ul class=\"navbar-nav\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link active\" href=\"#home\">Home</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"etudiantForm.jsp\">Gestion des étudiants</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"marqueForm.jsp\">Gestion des marques</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"machineForm.jsp\">Gestion des machines</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"machineByMarqueForm.jsp\">Machines par marque</a>\n");
      out.write("        </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"graphe.jsp\">graphe machine par marque</a>\n");
      out.write("        </li>\n");
      out.write("    </ul>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <form method=\"GET\" action=\"MachineController\">\n");
      out.write("                <fieldset>\n");
      out.write("                    <legend>Selectionner Reference</legend>\n");
      out.write("                    <table border=\"0\">\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Reference</td>\n");
      out.write("                            <td>\n");
      out.write("                                <select id=\"reference\" name=\"reference\">\n");
      out.write("                                    <option value=\"0\">Choose a reference</option>\n");
      out.write("                                    ");

                                        MachineService mms = new MachineService();
                                        for (Machine m : mms.findAll()) {
                                    
      out.write("\n");
      out.write("                                    <option value=\"");
      out.print(m.getReference());
      out.write('"');
      out.write('>');
      out.print(m.getReference());
      out.write("</option>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </fieldset>\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Liste des Machines</legend>\n");
      out.write("\n");
      out.write("                <table border=\"1\" class=\"tab\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Id</th>\n");
      out.write("                            <th>Reference <br>\n");
      out.write("                            <th>Prix</th>\n");
      out.write("                            <th>Marque</th>\n");
      out.write("                            <th>Date d'achat</th>\n");
      out.write("                            <th>Supprimer</th>\n");
      out.write("                            <th>Modifier</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody  id='body'>\n");
      out.write("                        \n");
      out.write("                       \n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("            </fieldset>\n");
      out.write("        </form> \n");
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
