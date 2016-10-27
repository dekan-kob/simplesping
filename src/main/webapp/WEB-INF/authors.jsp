<%@ page language="java" pageEncoding="UTF-8" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<html>
<body>
<h1>${message}</h1>
<c:forEach items="${authors}" var="author">
    <s:url value="/author/{authorId}" var="author_id">
        <s:param name="authorId" value="${author.id}"/>
    </s:url>
    <a href="/authornew/${author.id}">${author.fio}</a> <br>
</c:forEach>

</body>
</html>