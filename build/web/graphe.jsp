<%@page import="ma.school.service.MarqueService"%>
<%@page import="ma.school.beans.Marque"%>
<%@page import="ma.school.service.MachineService"%>
<%@page import="java.util.List"%>
<%@page import="ma.school.beans.Machine"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Graphique de machines par marque</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
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

        select#chartType {
            display: block;
            margin: 20px auto;
        }

        canvas#machineChart {
            max-width: 100%;
        }
    </style>
</head>
<body>
<%@include file="template/header.jsp" %>
<%@include file="template/menu.jsp" %>
<div class="container">
    <h1>Graphique de machines par marque</h1>
    <canvas id="machineChart"></canvas>
    <label for="chartType">Sélectionnez la forme du graphique :</label>
    <select id="chartType" class="form-control">
        <option value="bar">Barre</option>
        <option value="pie">Camembert</option>
    </select>
</div>

<%
MachineService ms = new MachineService();
MarqueService mrs = new MarqueService();
List<Marque> marques = mrs.findAll();
%>
<script>
    var labels = [];
    var data = [];
    var backgroundColors = [];
    <%
        for (Marque marque : marques) {
    %>
    labels.push("<%= marque.getLibelle()%>");
    data.push(<%= ms.findByMarque(marque).size()%>);
    backgroundColors.push('rgba(' +
            Math.floor(Math.random() * 256) + ',' +
            Math.floor(Math.random() * 256) + ',' +
            Math.floor(Math.random() * 256) + ', 0.6)');
    <%
        }
    %>
    var selectedType = 'bar';
    var ctx = document.getElementById('machineChart').getContext('2d');
    var machineChart = new Chart(ctx, {
        type: selectedType,
        data: {
            labels: labels,
            datasets: [{
                label: 'Nombre de machines par marque',
                data: data,
                backgroundColor: backgroundColors, // Utilise des couleurs aléatoires pour chaque marque
                borderColor: 'rgba(75, 192, 192, 1)',
                borderWidth: 1
            }]
        },
        options: {
            scales: {
                y: {
                    beginAtZero: true,
                    suggestedMax: 10
                }
            }
        }
    });

    document.getElementById('chartType').addEventListener('change', function () {
        selectedType = this.value;
        updateChartType();
    });

    function updateChartType() {
        machineChart.destroy();
        var ctx = document.getElementById('machineChart').getContext('2d');
        machineChart = new Chart(ctx, {
            type: selectedType,
            data: {
                labels: labels,
                datasets: [{
                    label: 'Nombre de machines par marque',
                    data: data,
                    backgroundColor: backgroundColors,
                    borderColor: 'rgba(75, 192, 192, 1)',
                    borderWidth: 1
                }]
            },
            options: {
                scales: {
                    y: {
                        beginAtZero: true,
                        suggestedMax: 10
                    }
                }
            }
        });
    }
</script>
</body>
</html>
