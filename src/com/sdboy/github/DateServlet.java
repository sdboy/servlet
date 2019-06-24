package com.sdboy.github;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class DateServlet
 * @date 2019/6/24 16:53
 * @Copyright
 */
public class DateServlet extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    HttpSession session = request.getSession(true);
    response.setContentType("text/html");
    PrintWriter pw = response.getWriter();
    pw.println("<b>");
    Date date = (Date) session.getAttribute("date");
    if(date != null) {
      pw.print("last access: " + date + "<br>");
    }
    date = new Date();
    session.setAttribute("date", date);
    pw.println("current date: " + date);
    pw.close();
  }
}
