<%--@elvariable id="listFilms" type="java.util.List"--%>
<%--
  Created by IntelliJ IDEA.
  User: Rick Georges
  Date: 05/12/2023
  Time: 09:25
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="../../head.jsp"></jsp:include>
<%@include file="menu.jsp"%>
<body>
<div class="container">
    <h1>Liste de films</h1>
    <ul>

        <c:forEach items="${listFilms}" var="Film" varStatus="loop">
            <li>
                    ${Film.getTitre()} - ${Film.getRealisateur()} - ${Film.getGenre()} - ${Film.getAnnee() }
            </li>
        </c:forEach>
    </ul>
</div>
</body>
</html>
