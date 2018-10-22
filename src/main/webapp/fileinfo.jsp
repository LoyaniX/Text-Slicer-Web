<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>FileInfos</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <link rel="stylesheet" type="text/css" href="style.css" />
</head>
<body>

<div id="main_container">
    <div class="center_content">
        <div class="center_left">
            <div class="welcome_box">
                <p class="welcome">
                    <span class="orange">Task 2</span><br />
                    Implement web-interface for viewing collected statistic using Servlet/JSP + HTML/CSS/JS.
                </p>
            </div>
            <div class="features">
                <div class="title">File Info</div>
                <ul class="list">
                    <c:forEach items="${requestScope.fileInfo}" var="fileInfo">
                        <li><span>${fileInfo.id}</span>
                            <div class="example">
                                <table>
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
                                    </tbody>
                                </table>
                            </div>
                            <div class="example" id="container${fileInfo.id}">
                                <script>
                                    $('#load-result${fileInfo.id} a').on('click', function(){
                                        $('#container${fileInfo.id}').load('/lineinfo?id=${fileInfo.id}');
                                    });
                                </script>
                            </div>
                        </li>
                    </c:forEach>
                </ul>
            </div>
        </div>
        <div class="clear"></div>
    </div>
</div>
</body>
</html>
