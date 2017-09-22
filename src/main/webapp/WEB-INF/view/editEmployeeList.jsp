<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Student details</title>
</head>
<body>
 
<h2>Output View:</h2>
 
<form:form method="post" action="add" commandName="employee">
    <table>
    <tr>
        <td><form:label path="name"><spring:message code="label.date"/></form:label></td>
        <td><form:input path="name" /></td>
         <td><form:label path="name"><spring:message code="label.class"/></form:label></td>
         <td><form:input path="name" /></td>
          <td><form:label path="name"><spring:message code="label.section"/></form:label></td>
         <td><form:input path="name" /></td>
    </tr>
   <tr>
   </br>
   </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="<spring:message code="label.add"/>"/>
        </td>
    </tr>
</table> 
</form:form>
 
     
<h3>Student Details</h3>
<c:if  test="${!empty employeeList}">
<table class="data"  width="100%" cellspacing="2" cellpadding="2" border="5" >
<tr>
    <th>Id</th>
    <th>Class-section-id</th>
    <th>Name</th>
    <th>Roll Number</th>
    <th>DOB</th>
    <th>Gender</th>
   
</tr>
<c:forEach items="${employeeList}" var="emp">
    <tr>
        <td>${emp.id} </td>
      <%--   <td>${emp.email}</td>
        <td>${emp.telephone}</td> --%>
         <td>${emp.classSectionID} </td>
         <td>${emp.name} </td>
         <td>${emp.rollNumber} </td>
         <td>${emp.dateOfBirth} </td>
          <td>${emp.gender} </td>
       <%--  <td><a href="delete/${emp.id}">delete</a></td> --%>
    </tr>
</c:forEach>
</table>
</c:if>
 
</body>
</html>