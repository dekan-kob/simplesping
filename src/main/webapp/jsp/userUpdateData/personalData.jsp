<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title></title>
</head>
<body>
<h1>Personal Data</h1>

<div class="content">
    <fieldset>
        <legend>Become Member</legend>
        <!-- for triggering webflow events using links,
                 the eventId to be triggered is given in "href" attribute as:
             -->
        <a href="${flowExecutionUrl}&_eventId_home">Home</a>
        <sf:form modelAttribute="userForm">
            <br/>
            <sf:label path="userId">UserName:</sf:label>
            <sf:input path="userId"/>
            <br/>
            <!-- to display validation messages -->
            <c:forEach
                    items="${flowRequestContext.messageContext.getMessagesBySource('userId')}"
                    var="err">
                <div>
                    <span>${err.text}</span>
                </div>
            </c:forEach>
            <br/>
            <sf:label path="email">Email Id: </sf:label>
            <sf:input path="email"/>
            <br/>
            <c:forEach
                    items="${flowRequestContext.messageContext.getMessagesBySource('email')}"
                    var="err">
                <div>
                    <span>${err.text}</span>
                </div>
            </c:forEach>
            <br/>
            <sf:label path="age">Age: </sf:label>
            <sf:input path="age"/>
            <br/>
            <c:forEach
                    items="${flowRequestContext.messageContext.getMessagesBySource('age')}"
                    var="err">
                <div>
                    <span>${err.text}</span>
                </div>
            </c:forEach>
            <br/>
            <!-- for triggering webflow events using form submission,
            the eventId to be triggered is given in "name" attribute as:
            -->
            <input name="_eventId_submit" type="submit" value="Submit"/>
            <br/>
        </sf:form>
    </fieldset>
</div>
</body>
</html>
