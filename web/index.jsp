<%--
  Created by IntelliJ IDEA.
  User: francoiscaillet
  Date: 25/11/2015
  Time: 09:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
/*get bean colis*/
fr.INFO921.TP3_4.entities.User user = (fr.INFO921.TP3_4.entities.User) request.getAttribute("user");

%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%=user.getFirst()%>
  </body>
</html>
