/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.89
 * Generated at: 2023-06-13 02:56:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.sql.*;
import java.net.*;
import java.time.*;
import java.util.*;
import vo.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

	// 공용으로 사용할 메소드 선언 및 정의 영역
public String getRequest(String req) {
	return req.trim().replace("<", "&lt");	
}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/_inc/inc_head.jsp", Long.valueOf(1686623569910L));
    _jspx_dependants.put("/_inc/inc_foot.jsp", Long.valueOf(1686618972902L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.time");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("java.net");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.sql");
    _jspx_imports_packages.add("vo");
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');

String driver = "com.mysql.cj.jdbc.Driver";
String dbURL = "jdbc:mysql://localhost:3306/ktbwos?useUnicode=true&characterEncoding=UTF8&verifyServerCertificate=false&useSSL=false&serverTimezone=UTC";

Connection conn = null;
Statement stmt = null;
ResultSet rs = null;
String sql = null;

try {
	Class.forName(driver);
	conn = DriverManager.getConnection(dbURL, "root", "1234");
} catch (Exception e) {
	out.println("DB연결에 문제가 발생했습니다.");
	e.printStackTrace();
}

final String ROOT_URL = "/ktbwos/index.jsp"; 
boolean isLogin = false;
MemberInfo loginInfo = (MemberInfo)session.getAttribute("loginInfo");
if (loginInfo != null) isLogin = true;


String loginUrl = request.getRequestURI();
if (request.getQueryString() != null)
	loginUrl += "?" + URLEncoder.encode(request.getQueryString().replace('&', '~'), "UTF-8");	// 현재 화면의 url로 로그인 폼 등에서 사용할 값

      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("	a:link { color:black; text-decoration:none; }\r\n");
      out.write("	a:visited { color:black; text-decoration:none; }\r\n");
      out.write("	a:hover { color:black; text-decoration:underline; }\r\n");
      out.write("	table, th, td {\r\n");
      out.write("	border:2px solid black;\r\n");
      out.write("	border-collapse : collapse;\r\n");
      out.write("	}\r\n");
      out.write("	tr { height:30px;}\r\n");
      out.write("	th { background-color:#5B9BD5; color:white;}\r\n");
      out.write("	td { text-align:center;}\r\n");
      out.write("</style>\r\n");
      out.write("<title>1석2조</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div style=\"width:1100px; margin:0 auto;\">\r\n");
      out.write("<a href=\"");
      out.print(ROOT_URL );
      out.write("\"><img style=\"width:200px\" src=\"/ktbwos/img/ktbwos.png\"></a>\r\n");
 if (isLogin) { 
      out.write("\r\n");
      out.write("<a style=\"display:inline-block; margin-top:50px; margin-left:700px;  position:fixed;\" href=\"/ktbwos/logout.jsp\">로그아웃 </a>\r\n");
      out.write("<a style=\"display:inline-block; margin-top:50px; margin-left:800px;  position:fixed;\" href=\"/ktbwos/member_info.jsp\">회원 정보</a>\r\n");
 } else { 
      out.write("\r\n");
      out.write("<a style=\"display:inline-block; margin-top:50px; margin-left:700px;  position:fixed;\" href=\"/ktbwos/login_form.jsp\">로그인 </a>\r\n");
 } 
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<br />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table width=\"1100\" align=\"center\">\r\n");
      out.write("	<tr>\r\n");
      out.write("		<th><a style=\"color:white;\" href=\"/ktbwos/bbs/notice_list.jsp\">공지사항</a></th>\r\n");
      out.write("		<th><a style=\"color:white;\" href=\"/ktbwos/bbs/free_list.jsp\">자유게시판</a></th>\r\n");
      out.write("		<th><a style=\"color:white;\" href=\"/ktbwos/bbs/pds_list.jsp\">자료실</a></th>\r\n");
      out.write("		<th><a style=\"color:white;\" href=\"/ktbwos/bbs/request_list.jsp\">게시판 요청</a></th>\r\n");
      out.write("		<th><a style=\"color:white;\" href=\"/ktbwos/bbs/ctgr_list.jsp\">카테고리 게시판</a></th>\r\n");
      out.write("		<th><a style=\"color:white;\" href=\"/ktbwos/bbs/qna_list.jsp\">QnA</a></th>\r\n");
      out.write("	</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<br />");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');

try {
	conn.close();
} catch (Exception e) {
	e.printStackTrace();
}

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
