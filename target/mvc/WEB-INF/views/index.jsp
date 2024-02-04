<%@ page import ="java.time.LocalDateTime" %> <%@ taglib prefix="c" uri =
"jakarta.tags.core" %> <%@page isELIgnored="false"%>
<%@ page import ="java.util.*"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>homepage</title>
  </head>
  <body>
    <h1>Its Is a H-o-m-e P-a-g-e </h1>

    <% String name=(String) request.getAttribute("name"); 
    
    int id=(int)
    request.getAttribute("id"); %> <%= name%> <%= id%>

    <% List<String> l1=  (List<String>) request.getAttribute("friends"); %>
 <c:forEach var="item" items="${friends}">
      <c:out value="${item}"></c:out>
    </c:forEach>
    <%= l1 %>



    
  </body>
</html>
