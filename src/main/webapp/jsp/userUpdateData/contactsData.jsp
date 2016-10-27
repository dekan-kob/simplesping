<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title></title>
</head>
<body>
<h1>Contacts Data</h1>
<div class="content">
  <fieldset>
    <legend>Become Member</legend>
    <!-- for triggering webflow events using links,
             the eventId to be triggered is given in "href" attribute as:
         -->
    <a href="${flowExecutionUrl}&_eventId_home">Home</a>
    <sf:form modelAttribute="userForm">
      <br/>
      <sf:label path="phone">Phone Number:</sf:label>
      <sf:input path="phone"/>
      <br/>
      <!-- to display validation messages -->
      <c:forEach
              items="${flowRequestContext.messageContext.getMessagesBySource('phone')}"
              var="err">
        <div>
          <span>${err.text}</span>
        </div>
      </c:forEach>
      <br/>
      <sf:label path="address">Address: </sf:label>
      <sf:input path="address"/>
      <br/>
      <c:forEach
              items="${flowRequestContext.messageContext.getMessagesBySource('address')}"
              var="err">
        <div>
          <span>${err.text}</span>
        </div>
      </c:forEach>
      <br/>
      <!-- for triggering webflow events using form submission,
      the eventId to be triggered is given in "name" attribute as:
      -->
      <input name="_eventId_edit" type="submit" value="Edit" />
      <input name="_eventId_submit" type="submit" value="Submit"/>
      <br/>
    </sf:form>
  </fieldset>
</div>
</body>
</html>
