package com.sdboy.github;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class ColorPostServlet
 * @date 2019/6/24 16:02
 * @Copyright
 */
public class ColorPostServlet extends HttpServlet {
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
    String color = request.getParameter("color");
    response.setContentType("text/html");
    PrintWriter pw = response.getWriter();
    pw.println("<b>the select color is: ");
    pw.println(color);
    pw.close();
  }
}
