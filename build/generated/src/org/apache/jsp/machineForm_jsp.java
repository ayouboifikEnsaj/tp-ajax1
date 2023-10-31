package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ma.school.beans.Machine;
import ma.school.service.MachineService;
import ma.school.beans.Marque;
import ma.school.service.MarqueService;
import java.util.Date;
import ma.school.beans.Etudiant;
import ma.school.service.EtudiantService;

public final class machineForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <script src=\"script/script.js\" type=\"text/javascript\"></script>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>JSP Page</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("    <link href=\"style/csslocal.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("      <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
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
      out.write("    ");
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
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"MachineByReference.jsp\">graphe machine par reference</a>\n");
      out.write("        </li>\n");
      out.write("    </ul>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("    \n");
      out.write("     <div class=\"modal fade\" id=\"confirmDeleteModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"confirmDeleteModalLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog modal-dialog-centered \"  role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header bg-danger text-white\">\n");
      out.write("                        <h5 class=\"modal-title\" id=\"confirmDeleteModalLabel\">Confirmation de la suppression</h5>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        Êtes-vous sûr de vouloir supprimer ce produit ?\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button type=\"button\" class=\"bg-red-500 hover:bg-red-700 text-dark font-bold py-2 px-4 rounded\" id=\"confirmDeleteBtn\">Confirmer la suppression</button>\n");
      out.write("                        <button type=\"button\" class=\"bg-blue-500 hover:bg-blue-700 text-dark font-bold py-2 px-4 rounded\" data-dismiss=\"modal\">Annuler</button>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div class=\"container\">\n");
      out.write("        <form method=\"GET\" action=\"MachineController\">\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Informations Machine</legend>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"ref\">Reference</label>\n");
      out.write("                    <input id=\"ref\" class=\"form-control\" type=\"text\" name=\"ref\" value=\"\" required=\"\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"prix\">Prix</label>\n");
      out.write("                    <input id=\"prix\" class=\"form-control\" type=\"text\" name=\"prix\" value=\"\" required=\"\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"marque\">Marque</label>\n");
      out.write("                    <select id=\"marque\" class=\"form-control\" name=\"marque\">\n");
      out.write("                        ");

                            MarqueService ms = new MarqueService();
                            for(Marque m : ms.findAll()){
                        
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(m.getId());
      out.write('"');
      out.write('>');
      out.print(m.getLibelle());
      out.write("</option>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"date\">Date Achat</label>\n");
      out.write("                    <input id=\"date\" class=\"form-control\" type=\"date\" name=\"dateAchat\" value=\"\" required=\"\" />\n");
      out.write("                </div>\n");
      out.write("                <td>\n");
      out.write("                                <input class=\"btn btn-primary\" name=\"op\" type=\"submit\" value=\"Envoyer\" />\n");
      out.write("                   </td>\n");
      out.write("            </fieldset>\n");
      out.write("        </form>\n");
      out.write("        ");

            MachineService mms = new MachineService();
        
      out.write("\n");
      out.write("        <fieldset>\n");
      out.write("            <legend>Liste des Machines</legend>\n");
      out.write("            <table class=\"table\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Id</th>\n");
      out.write("                        <th>Reference</th>\n");
      out.write("                        <th>Prix</th>\n");
      out.write("                        <th>Marque</th>\n");
      out.write("                        <th>Date d'achat</th>\n");
      out.write("                        <th >Supprimer</th>\n");
      out.write("                        <th>Modifier</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        for (Machine mm : mms.findAll()) {
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(mm.getId());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(mm.getReference());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(mm.getPrix());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(mm.getMarque().getLibelle());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(mm.getDateAchat());
      out.write("</td>\n");
      out.write("                            <td><button type=\"button\" class=\"btn btn-danger bg-blue-500 text-white\" class=\"btn btn-danger\" data-toggle=\"modal\" data-target=\"#confirmDeleteModal\" data-id=\"");
      out.print(mm.getId());
      out.write("\">Supprimer</button></td>\n");
      out.write("                        <td><a class=\"btn btn-primary\" href=\"#\">Modifier</a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </fieldset>\n");
      out.write("    </div>\n");
      out.write("                    <script>\n");
      out.write("            // Gestionnaire d'événements lorsque le bouton de suppression est cliqué\n");
      out.write("            $('button[data-toggle=\"modal\"][data-target=\"#confirmDeleteModal\"]').on('click', function () {\n");
      out.write("// Récupérer l'ID du produit à supprimer à partir de l'attribut data-id\n");
      out.write("                var productId = $(this).data('id');\n");
      out.write("\n");
      out.write("// Configurer le bouton \"Confirmer la suppression\" dans la modal pour rediriger vers la suppression réelle\n");
      out.write("                $('#confirmDeleteBtn').on('click', function () {\n");
      out.write("                    window.location.href = \"MachineController?op=delete&id=\" + productId;\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("</body>\n");
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
