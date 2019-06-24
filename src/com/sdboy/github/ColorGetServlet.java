package com.sdboy.github;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class ColorGetServlet
 * @date 2019/6/24 15:51
 * @Copyright
 */
public class ColorGetServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    String color = request.getParameter("color");
    response.setContentType("text/html");
    PrintWriter pw = response.getWriter();
    pw.println("<b>the select color is: ");
    pw.println(color);
    pw.close();
  }
}
