<%@ taglib prefix="c" uri ="jakarta.tags.core" %> <%@page isELIgnored="false"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
  </head>
  <body>
    <h1>${Header}</h1>
    <h1>${Desc}</h1>
    <h1>${Message}</h1>

    <h1>welcoome ,${u1.user_name}</h1>
    <h1>email is ,${u1.user_email}</h1>
    <h1>password is ,${u1.user_password}</h1>
  </body>
</html>
