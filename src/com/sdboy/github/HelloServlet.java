package com.sdboy.github;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class HelloServlet
 * @date 2019/6/24 13:40
 * @Copyright
 */
public class HelloServlet extends GenericServlet {
  @Override
  public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws IOException {
    servletResponse.setContentType("text/html");
    PrintWriter pw = servletResponse.getWriter();
    pw.println("<b>Hello!");
    pw.close();
  }
}
