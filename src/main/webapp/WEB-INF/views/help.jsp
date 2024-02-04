<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page import ="java.time.LocalDateTime" %>
<%@ taglib prefix="c" uri =
"jakarta.tags.core" %> <%@page isELIgnored="false"%>
 <% List l1=new ArrayList(); %>
 
 



<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
  </head>
  <body>
    <h1>in help page</h1>

    <c:out value="${date}" />
    <c:forEach var="it" items="${frnds}">
      <c:out value="${it}" />
      
      
    </c:forEach>
  </body>
</html>
