/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.56
 * Generated at: 2022-01-17 03:52:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bean_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      unit04.simple simple1 = null;
      simple1 = (unit04.simple) _jspx_page_context.getAttribute("simple1", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (simple1 == null){
        simple1 = new unit04.simple();
        _jspx_page_context.setAttribute("simple1", simple1, javax.servlet.jsp.PageContext.PAGE_SCOPE);
        out.write('\r');
        out.write('\n');
        out.write('	');
        org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("simple1"), "name", "Kim", null, null, false);
        out.write('\r');
        out.write('\n');
        out.write('	');
        org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("simple1"), "id", "papago", null, null, false);
        out.write('\r');
        out.write('\n');
        out.write('	');
        org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("simple1"), "pwd", "1234", null, null, false);
        out.write('\r');
        out.write('\n');
        out.write('	');
        org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("simple1"), "email", "test@test.com", null, null, false);
        out.write('\r');
        out.write('\n');
      }
      out.write("<br>\r\n");
      out.write("\r\n");
      unit04.Menu lunch = null;
      lunch = (unit04.Menu) _jspx_page_context.getAttribute("lunch", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (lunch == null){
        lunch = new unit04.Menu();
        _jspx_page_context.setAttribute("lunch", lunch, javax.servlet.jsp.PageContext.PAGE_SCOPE);
        out.write('\r');
        out.write('\n');
        out.write('	');
        org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("lunch"), "shopMenu", "BongRiceBugger", null, null, false);
        out.write('\r');
        out.write('\n');
        out.write('	');
        org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("lunch"), "name", "RiceBugger", null, null, false);
        out.write('\r');
        out.write('\n');
        out.write('	');
        org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("lunch"), "price", "3500", null, null, false);
        out.write('\r');
        out.write('\n');
      }
      out.write("<br>\r\n");
      out.write("\r\n");
      unit04.Menu dinner = null;
      dinner = (unit04.Menu) _jspx_page_context.getAttribute("dinner", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (dinner == null){
        dinner = new unit04.Menu();
        _jspx_page_context.setAttribute("dinner", dinner, javax.servlet.jsp.PageContext.PAGE_SCOPE);
        out.write('\r');
        out.write('\n');
        out.write('	');
        org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("dinner"), "shopMenu", "don'tKnowdoller", null, null, false);
        out.write('\r');
        out.write('\n');
        out.write('	');
        org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("dinner"), "name", "egg", null, null, false);
        out.write('\r');
        out.write('\n');
        out.write('	');
        org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("dinner"), "price", "500", null, null, false);
        out.write('\r');
        out.write('\n');
      }
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<h1>\r\n");
      out.write("	");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((unit04.simple)_jspx_page_context.findAttribute("simple1")).getName())));
      out.write("님 환영합니다.<br>\r\n");
      out.write("	");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((unit04.simple)_jspx_page_context.findAttribute("simple1")).getId())));
      out.write("<br>\r\n");
      out.write("	");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((unit04.simple)_jspx_page_context.findAttribute("simple1")).getPwd())));
      out.write("<br>\r\n");
      out.write("	");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((unit04.simple)_jspx_page_context.findAttribute("simple1")).getEmail())));
      out.write("<br>\r\n");
      out.write("	<br>오늘 먹을 점심은 아래와 같습니다.<br>\r\n");
      out.write("	");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((unit04.Menu)_jspx_page_context.findAttribute("lunch")).getShopMenu())));
      out.write("음식점<br>\r\n");
      out.write("	");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((unit04.Menu)_jspx_page_context.findAttribute("lunch")).getName())));
      out.write("<br>\r\n");
      out.write("	");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((unit04.Menu)_jspx_page_context.findAttribute("lunch")).getPrice())));
      out.write("원<br>\r\n");
      out.write("	<br>오늘 먹을 저녁은 아래와 같습니다.<br>\r\n");
      out.write("	");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((unit04.Menu)_jspx_page_context.findAttribute("dinner")).getShopMenu())));
      out.write("음식점<br>\r\n");
      out.write("	");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((unit04.Menu)_jspx_page_context.findAttribute("dinner")).getName())));
      out.write("<br>\r\n");
      out.write("	");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((unit04.Menu)_jspx_page_context.findAttribute("dinner")).getPrice())));
      out.write("원<br>\r\n");
      out.write("</h1>\r\n");
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
