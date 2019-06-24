package com.sdboy.github;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class AddCookieServlet
 * @date 2019/6/24 16:10
 * @Copyright
 */
public class AddCookieServlet extends HttpServlet {
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
    String data = request.getParameter("data");
    Cookie cookie = new Cookie("MyCookie", data);
    response.addCookie(cookie);
    response.setContentType("text/html");
    PrintWriter pw = response.getWriter();
    pw.println("<b>mycookie has been set to");
    pw.println(data);
    pw.close();
  }
}
