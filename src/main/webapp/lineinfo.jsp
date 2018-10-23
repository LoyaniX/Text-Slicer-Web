<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div align="center">
<h4>Line's info of file</h4>
<table class="table table-striped users-table col-md-8" style="margin: 10px">
    <thead class="thead-dark">
    <tr>
        <th>Id Line</th>
        <th>Id File</th>
        <th>Longest word</th>
        <th>Length of longest word</th>
        <th>Shortest word</th>
        <th>Length of shortest word</th>
        <th>Average length of words</th>
        <th>Length of line</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${requestScope.lineInfo}" var="lineInfo">
        <tr>
            <td>${lineInfo.lineId}</td>
            <td>${lineInfo.fileId}</td>
            <td>${lineInfo.longestWord}</td>
            <td>${lineInfo.lengthOfLongestWord}</td>
            <td>${lineInfo.shortestWord}</td>
            <td>${lineInfo.lengthOfShortestWord}</td>
            <td>${lineInfo.avgLengthWord}</td>
            <td>${lineInfo.lengthLine}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</div>
