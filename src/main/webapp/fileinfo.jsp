<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>FileInfos</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <!-- Bootstrap -->
    <link type="text/css" href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="css/style.css">
    <script src="js/script.js"></script>
</head>
<body>
<div id="main_container">
    <div class="popover-header">
        <h1>Web page with info about files</h1>
    </div>
    <div class="features" align="center">
        <div class="container-fluid align-content-center" align="center">
            <h3>File Info</h3>
        </div>
        <div class="example">
            <table class="table table-striped users-table col-md-10" style="margin: 10px">
                <thead class="thead-dark">
                <tr>
                    <th>Id File</th>
                    <th>File name</th>
                    <th>Longest word</th>
                    <th>Length of longest word</th>
                    <th>Shortest word</th>
                    <th>Length of shortest word</th>
                    <th>Average length of words</th>
                    <th>Average length of lines</th>
                    <th>Show lines</th>
                </tr>
                </thead>
                <c:forEach items="${fileinfo}" var="fileInfo">
                    <tbody>
                    <tr>
                        <td>${fileInfo.id}</td>
                        <td>${fileInfo.fileName}</td>
                        <td>${fileInfo.longestWord}</td>
                        <td>${fileInfo.lengthOfLongestWord}</td>
                        <td>${fileInfo.shortestWord}</td>
                        <td>${fileInfo.lengthOfShortestWord}</td>
                        <td>${fileInfo.avgLengthWord}</td>
                        <td>${fileInfo.avgLengthLine}</td>
                        <td id="load-result${fileInfo.id}"><a href="#">show line statistic</a></td>
                    </tr>
                    </tbody> </c:forEach>
            </table>
        </div>
        <c:forEach items="${requestScope.fileInfo}" var="fileInfo">
            <div class="example" id="container">
                <script>
                    $('#load-result${fileInfo.id} a').on('click', function(){
                        $('#container').load('/lineinfo?id=${fileInfo.id}');
                    });
                </script>
            </div>
        </c:forEach>
    </div>
</div>
</body>
</html>
