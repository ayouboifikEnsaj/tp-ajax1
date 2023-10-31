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
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link href="style/csslocal.css" rel="stylesheet" type="text/css"/>
</head>
<body>
    <%@include file="template/header.jsp" %>
    <%@include file="template/menu.jsp" %>
    <div class="container mt-4">
        <form method="GET" action="MarqueController">
            <fieldset>
                <legend>Informations Marque</legend>
                <div class="form-group">
                    <label for="code">Code</label>
                    <input id="code" class="form-control" type="text" name="code" value="" required=""/>
                </div>
                <div class="form-group">
                    <label for="libelle">Libelle</label>
                    <input id="libelle" class="form-control" type="text" name="libelle" value="" required="" />
                </div>
                 <tr>
                            <td></td>
                            <td>
                                <input class="btn btn-primary" name="op" type="submit" value="Envoyer" />
                            </td>
                        </tr>
            </fieldset>
        </form>
        <%
            MarqueService ms = new MarqueService();
        %>
        <fieldset>
            <legend>Liste des marques</legend>

            <table class="table">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Code</th>
                        <th>Libelle</th>
                        <th>Supprimer</th>
                        <th>Modifier</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        for (Marque m : ms.findAll()) {
                    %>
                    <tr>
                        <td><%=m.getId()%></td>
                        <td><%=m.getCode()%></td>
                        <td><%=m.getLibelle()%></td>
                        <td><a class="btn btn-danger" href="MarqueController?op=delete&id=<%=m.getId()%>">Supprimer</a></td>
                        <td><a class="btn btn-primary" href="#">Modifier</a></td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </fieldset>
    </form>
</div>
</body>
</html>
