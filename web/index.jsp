<%--
  Created by IntelliJ IDEA.
  User: jiaoguang
  Date: 2019/6/24
  Time: 13:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <center>
      <form method="post" action="servlet/PostParametersServlet">
        <table>
          <tr>
            <td><b>Employee</b></td>
            <td><input type="text" name="e" size="25" value="" /></td>
          </tr>
          <tr>
            <td><b>Phone</b></td>
            <td><input type="text" name="p" size="25" value="" /></td>
          </tr>
        </table>
        <input type="submit" value="submit">
      </form>
    </center>
  </body>
</html>
