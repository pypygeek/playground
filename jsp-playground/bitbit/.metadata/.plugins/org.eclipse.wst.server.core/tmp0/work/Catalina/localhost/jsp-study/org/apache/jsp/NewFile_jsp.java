/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.56
 * Generated at: 2022-01-14 03:37:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class NewFile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {


	String str = "안녕하세요!";
	int a = 10, b = -5;
	public int abs(int n){
		if(n<0) {
			n = -n;
		}
		return n;
	}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1642131006616L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script src=\"jstest.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1>서버로 전달하는 방법1</h1>\r\n");
      out.write("<form action=\"Servlet\" method = \"post\" name=\"form\">\r\n");
      out.write("	id: <input type  = \"text\" name = \"id\" /><br>\r\n");
      out.write("	age: <input type =\"text\" name = \"age\" ><br>\r\n");
      out.write("	좋아하는 과일입력:<input type = \"text\" name = \"fruit\"><br>\r\n");
      out.write("	pw: <input type  = \"password\" name = \"pw\" /><br>\r\n");
      out.write("	성별:<br>\r\n");
      out.write("	<input type = \"radio\" id = \"mail\" value = \"남성\" name = \"gender\"/>mail\r\n");
      out.write("	<input type = \"radio\" id = \"fmail\" value = \"여성\" name = \"gender\"/>fmail\r\n");
      out.write("	<br>\r\n");
      out.write("	인사 및 남기고 싶은말<br>\r\n");
      out.write("	<textarea rows=\"5\" cols=\"40\" name=\"ta\"></textarea><br>\r\n");
      out.write("	관심분야:<input type=\"checkbox\" name=\"check\" value=\"DB\">DB\r\n");
      out.write("	<input type=\"checkbox\" name=\"check\" value=\"movie\">movie\r\n");
      out.write("	<input type=\"checkbox\" name=\"check\" value=\"english\">english\r\n");
      out.write("	<input type=\"checkbox\" name=\"check\" value=\"game\">game<br>\r\n");
      out.write("	<select id = \"coffee\" name = \"bean\">\r\n");
      out.write("		<option value = \"americano\">americano</option>\r\n");
      out.write("		<option value = \"valina Latte\">valina Latte</option>\r\n");
      out.write("		<option value = \"moca\">moca</option>\r\n");
      out.write("	</select>\r\n");
      out.write("	<input type = \"submit\" value = \"submit\" onclick=\"return check()\">\r\n");
      out.write("	<input type = \"reset\" value = \"cansle\">\r\n");
      out.write("</form>\r\n");
      out.write('\r');
      out.write('\n');

	out.print(a+"의 절대값:" + abs(a)+"<BR>");

      out.write("\r\n");
      out.write("str=");
      out.print(str );
      out.write("<br>\r\n");
      out.write("a=");
      out.print(a );
      out.write("<br>\r\n");
      out.write("b=");
      out.print(b );
      out.write("<br>\r\n");

	a = a+b;
	b = b*3;
	out.print(a+"<BR>");
	out.print(b+"<BR>");

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<hr>\r\n");
      out.write("<div id=\"copyright\">\r\n");
      out.write("	All content Copyright 2022 JSP Inc. all rights reserved<br>\r\n");
      out.write("	Contact mail: jsp@jsp.com Tel: +82 000 000 000 Fax +82 00 00 0000\r\n");
      out.write("</div>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
