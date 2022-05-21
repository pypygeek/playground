/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.56
 * Generated at: 2022-01-21 02:31:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class find_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
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
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" ");

 	// 입력값을 얻어오기
 	String name = request.getParameter("name");
 	// 유효성 체크
 	if(name == null || name.trim().equals("")){
 		response.sendRedirect("01_allMember.jsp");
 		return;
 	}
 	//데이터베이스 연결
 	request.setCharacterEncoding("UTF-8");
 	Class.forName("oracle.jdbc.driver.OracleDriver");
 	String url = "jdbc:oracle:thin:@localhost:1521:XE";
 	String uid = "system", pwd = "1234";
 	
 	Connection conn = DriverManager.getConnection(url, uid, pwd);
 	
 	out.println("데이터베이스 연결 완료 : "+ conn);
 	
 	String sql = "select count(*) from student where name=?";
 	String sql2 = "select * from student where name=?";
 	
 	PreparedStatement ps = conn.prepareStatement(sql);
 	ps.setString(1, name);
 	ResultSet rs = ps.executeQuery();
 	rs.next();
 	
 	int cnt = rs.getInt(1); // 1은 필드의 순서를 의미
 	
 	rs.close();
 	ps.close();
 	
 	out.println("<br/>"+cnt+"명");
 	
 
      out.write("\r\n");
      out.write(" \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<table width = 500 border=1>\r\n");
      out.write("	<tr>\r\n");
      out.write("		<th width=25%>학번</th>\r\n");
      out.write("		<th width=25%>비밀번호</th>\r\n");
      out.write("		<th width=25%>이름</th>\r\n");
      out.write("		<th width=25%>전화번호</th>\r\n");
      out.write("	</tr>\r\n");
      out.write("	");

		if(cnt>0) {
			ps=conn.prepareStatement(sql2);
			ps.setString(1, name);
			rs = ps.executeQuery();
			while(rs.next()){
				String no = rs.getString(1);
				String pw = rs.getString(2);
				String name2 = rs.getString(3);
				String hp = rs.getString(4);
	
      out.write("\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td>");
      out.print(no );
      out.write("</td>\r\n");
      out.write("		<td>");
      out.print(pw );
      out.write("</td>\r\n");
      out.write("		<td>");
      out.print(name2 );
      out.write("</td>\r\n");
      out.write("		<td>");
      out.print(hp );
      out.write("</td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	");

			} //while End
		out.println("<tr><td colspan=4>");
		out.println(name+"님 은 전체"+cnt+"명 입니다.");
		out.println("</td></tr>");
		}
	
      out.write("\r\n");
      out.write("</table>\r\n");
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