<%@page import="ma.school.beans.Machine"%>
<%@page import="ma.school.service.MachineService"%>
<%@page import="ma.school.beans.Marque"%>
<%@page import="ma.school.service.MarqueService"%>
<%@page import="java.util.Date"%>
<%@page import="ma.school.beans.Etudiant"%>
<%@page import="ma.school.service.EtudiantService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <script src="script/script.js" type="text/javascript"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link href="style/csslocal.css" rel="stylesheet" type="text/css"/>
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <%@include file="template/header.jsp" %>
    <%@include file="template/menu.jsp" %>
    
     <div class="modal fade" id="confirmDeleteModal" tabindex="-1" role="dialog" aria-labelledby="confirmDeleteModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered "  role="document">
                <div class="modal-content">
                    <div class="modal-header bg-danger text-white">
                        <h5 class="modal-title" id="confirmDeleteModalLabel">Confirmation de la suppression</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        Êtes-vous sûr de vouloir supprimer ce produit ?
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="bg-red-500 hover:bg-red-700 text-dark font-bold py-2 px-4 rounded" id="confirmDeleteBtn">Confirmer la suppression</button>
                        <button type="button" class="bg-blue-500 hover:bg-blue-700 text-dark font-bold py-2 px-4 rounded" data-dismiss="modal">Annuler</button>

                    </div>
                </div>
            </div>
        </div>
    
    
    <div class="container">
        <form method="GET" action="MachineController">
            <fieldset>
                <legend>Informations Machine</legend>
                <div class="form-group">
                    <label for="ref">Reference</label>
                    <input id="ref" class="form-control" type="text" name="ref" value="" required=""/>
                </div>
                <div class="form-group">
                    <label for="prix">Prix</label>
                    <input id="prix" class="form-control" type="text" name="prix" value="" required="" />
                </div>
                <div class="form-group">
                    <label for="marque">Marque</label>
                    <select id="marque" class="form-control" name="marque">
                        <%
                            MarqueService ms = new MarqueService();
                            for(Marque m : ms.findAll()){
                        %>
                        <option value="<%=m.getId()%>"><%=m.getLibelle()%></option>
                        <%}%>
                    </select>
                </div>
                <div class="form-group">
                    <label for="date">Date Achat</label>
                    <input id="date" class="form-control" type="date" name="dateAchat" value="" required="" />
                </div>
                <td>
                                <input class="btn btn-primary" name="op" type="submit" value="Envoyer" />
                   </td>
            </fieldset>
        </form>
        <%
            MachineService mms = new MachineService();
        %>
        <fieldset>
            <legend>Liste des Machines</legend>
            <table class="table">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Reference</th>
                        <th>Prix</th>
                        <th>Marque</th>
                        <th>Date d'achat</th>
                        <th >Supprimer</th>
                        <th>Modifier</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        for (Machine mm : mms.findAll()) {
                    %>
                    <tr>
                        <td><%=mm.getId()%></td>
                        <td><%=mm.getReference()%></td>
                        <td><%=mm.getPrix()%></td>
                        <td><%=mm.getMarque().getLibelle()%></td>
                        <td><%=mm.getDateAchat()%></td>
                            <td><button type="button" class="btn btn-danger bg-blue-500 text-white" class="btn btn-danger" data-toggle="modal" data-target="#confirmDeleteModal" data-id="<%=mm.getId()%>">Supprimer</button></td>
                        <td><a class="btn btn-primary" href="#">Modifier</a></td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </fieldset>
    </div>
                    <script>
            // Gestionnaire d'événements lorsque le bouton de suppression est cliqué
            $('button[data-toggle="modal"][data-target="#confirmDeleteModal"]').on('click', function () {
// Récupérer l'ID du produit à supprimer à partir de l'attribut data-id
                var productId = $(this).data('id');

// Configurer le bouton "Confirmer la suppression" dans la modal pour rediriger vers la suppression réelle
                $('#confirmDeleteBtn').on('click', function () {
                    window.location.href = "MachineController?op=delete&id=" + productId;
                });
            });
        </script>
</body>
</html>
