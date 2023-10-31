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
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="script/jquery-3.3.1.min.js" type="text/javascript"></script>
    <script src="script/machineByMarque.js" type="text/javascript"></script>
    <style>
        body {
            background-color: #f7f7f7;
            padding: 20px;
        }

        .container {
            background-color: #fff;
            border: 1px solid #ddd;
            padding: 20px;
            max-width: 800px;
            margin: 0 auto;
            margin-top: 20px;
            border-radius: 5px;
        }

        h1 {
            text-align: center;
            font-size: 24px;
        }

        select#marque {
            width: 100%;
        }

        table.tab {
            width: 100%;
        }

    </style>
</head>
<body>
<%@include file="template/header.jsp" %>
<%@include file="template/menu.jsp" %>
<div class="container">
    <h1>Machines par Marque</h1>
    <form method="GET" action="MachineController">
        <fieldset>
            <legend>Sélectionnez une Marque</legend>
            <table border="0">
                <tr>
                    <td>Marque</td>
                    <td>
                        <select id="marque" name="marque" class="form-control">
                            <option value="0">Choisissez une marque</option>
                            <%
                                MarqueService ms = new MarqueService();
                                for (Marque m : ms.findAll()) {
                            %>
                            <option value="<%=m.getId()%>"><%=m.getLibelle()%></option>
                            <%
                                }
                            %>
                        </select>
                    </td>
                </tr>
            </table>
        </fieldset>
    </form>
    <%
        MachineService mms = new MachineService();
    %>
    <fieldset>
        <legend>Liste des Machines</legend>
        <table class="table tab">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Reference</th>
                    <th>Prix</th>
                    <th>Marque</th>
                    <th>Date d'achat</th>
                    <th>Supprimer</th>
                    <th>Modifier</th>
                </tr>
            </thead>
            <tbody id='body'></tbody>
        </table>
    </fieldset>
</div>
</body>
</html>
