<%--
  Created by IntelliJ IDEA.
  User: jiaoguang
  Date: 2019/6/24
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
  <center>
    <form name="form1" action="servlet/ColorGetServlet">
      <b>color:</b>
      <select name="color" size="1">
        <option value="red">red</option>
        <option value="green">green</option>
        <option value="blue">blue</option>
      </select>
      <br><br>
      <input type="submit" value="submit">
    </form>
  </center>
</body>
</html>
