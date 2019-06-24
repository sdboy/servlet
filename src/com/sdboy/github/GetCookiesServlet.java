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
 * @class GetCookiesServlet
 * @date 2019/6/24 16:24
 * @Copyright
 */
public class GetCookiesServlet extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    Cookie cookies[] = request.getCookies();
    response.setContentType("text/html");
    PrintWriter pw = response.getWriter();
    pw.println("<b>");
    for(Cookie cookie : cookies) {
      String name = cookie.getName();
      String value = cookie.getValue();
      pw.println("name = " + name + "; value = " + value);
    }
    pw.close();
  }
}
