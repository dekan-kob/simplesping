<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spizza</title>
</head>
<body>
<h2>Welcome to Pizza!!!</h2>
<form:form>
    <input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}">
    <input type="text" name="phoneNumber"><br/>
    <input type="submit" name="_eventId_phoneEntered" value="Lookup Customer">
</form:form>
</body>
</html>
