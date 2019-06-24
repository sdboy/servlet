package com.sdboy.github;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class PostParametersServlet
 * @date 2019/6/24 14:37
 * @Copyright
 */
public class PostParametersServlet extends GenericServlet {
  @Override
  public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws IOException {
    PrintWriter pw = servletResponse.getWriter();
    Enumeration<String> enumeration = servletRequest.getParameterNames();
    while (enumeration.hasMoreElements()) {
      String pname = enumeration.nextElement();
      pw.print(pname + " = ");
      String pvalue = servletRequest.getParameter(pname);
      pw.println(pvalue);
    }
    pw.close();
  }
}
