<%--
  Created by IntelliJ IDEA.
  User: Rick Georges
  Date: 08/12/2023
  Time: 19:53
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="../../head.jsp"></jsp:include>
<%@include file="menu.jsp"%>
<body>
<div class="container">
    <h1>Liste de livres</h1>
    <ul>
        <c:forEach items="${listLivres}" var="livre" varStatus="loop">
            <li>
                    ${livre.getTitre()} - ${livre.getAuteur()} - ${livre.getAnnee()} - ${livre.getGenre()}
            </li>
        </c:forEach>
    </ul>
</div>
</body>