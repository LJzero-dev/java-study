/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.89
 * Generated at: 2023-06-12 10:45:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.bbs;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.sql.*;
import java.net.*;
import java.time.*;
import java.util.*;
import vo.*;

public final class free_005freply_005fproc_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_dependants.put("/bbs/../_inc/inc_foot.jsp", Long.valueOf(1685494431730L));
    _jspx_dependants.put("/bbs/../_inc/inc_head.jsp", Long.valueOf(1685952784006L));
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
String dbURL = "jdbc:mysql://localhost:3306/mall?useUnicode=true&characterEncoding=UTF8&verifyServerCertificate=false&useSSL=false&serverTimezone=UTC";

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

final String ROOT_URL = "/jspSite/"; 
boolean isLogin = false;
MemberInfo loginInfo = (MemberInfo)session.getAttribute("loginInfo");
if (loginInfo != null) isLogin = true;


String loginUrl = request.getRequestURI();
if (request.getQueryString() != null)
	loginUrl += "?" + URLEncoder.encode(request.getQueryString().replace('&', '~'), "UTF-8");	// 현재 화면의 url로 로그인 폼 등에서 사용할 값

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("a:link { color:black; text-decoration:none; }\r\n");
      out.write("a:visited { color:black; text-decoration:none; }\r\n");
      out.write("a:hover { color:black; text-decoration:underline; }\r\n");
      out.write("\r\n");
      out.write("#list th, #list td { padding:8px 3px; }\r\n");
      out.write("#list th { border-bottom:double black 3px; }\r\n");
      out.write("#list td { border-bottom:dotted black 1px; }\r\n");
      out.write("\r\n");
      out.write(".hand { cursor:pointer; }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<a href=\"");
      out.print(ROOT_URL );
      out.write("\">HOME</a>\r\n");
      out.write("<br /><hr />");
      out.write('\r');
      out.write('\n');

request.setCharacterEncoding("utf-8");
String kind = request.getParameter("kind");
int cpage = Integer.parseInt(request.getParameter("cpage"));
int fl_idx = Integer.parseInt(request.getParameter("fl_idx"));
String schtype = request.getParameter("schtype");	// 검색 조건
String keyword = request.getParameter("keyword");	// 검색어
String args = "?cpage=" + cpage + "&idx=" + fl_idx;
if (schtype != null && !schtype.equals("") && keyword != null && !keyword.equals("")) {
	args += "&schtype=" + schtype + "&keyword=" + keyword;	// 링크에 검색 관련 값들을 쿼리스트링으로 연결해줌
}
int fr_idx = 0;
String fr_content = request.getParameter("fr_content");
String mi_id = loginInfo.getMi_id(), fr_ip = request.getRemoteAddr();
if (!kind.equals("in")) fr_idx = Integer.parseInt(request.getParameter("fr_idx"));
try {
	stmt = conn.createStatement();		
	if (kind.equals("in")) {			// 댓글 등록일 경우
		sql = "update t_free_list set fl_reply = fl_reply + 1 where fl_idx = " + fl_idx;
		stmt.executeUpdate(sql);		// 게시글의 댓글 수 증가 쿼리 실행 
		sql = "insert into t_free_reply (fl_idx, mi_id, fr_content, fr_ip) values (" + fl_idx + ", '" + mi_id + "', '" + fr_content + "', '" + fr_ip +  "')";
	} else if (kind.equals("up")) {		// 댓글 수정일 경우
		sql = "update t_free_reply set fr_content = '" + fr_content + "' where fr_isview = 'y' and fl_idx = " + fl_idx + " and fr_idx = " + fr_idx + " and mi_id = '" + loginInfo.getMi_id() + "'";
	} else if (kind.equals("del")) {	// 댓글 삭제일 경우
		sql = "update t_free_list set fl_reply = fl_reply - 1 where fl_idx = " + fl_idx;
		stmt.executeUpdate(sql);		// 게시글의 댓글 수 감소 쿼리 실행 
		sql = "update t_free_reply set fr_isview = 'n' where fl_idx = " + fl_idx + " and fr_idx = " + fr_idx + " and mi_id = '" + loginInfo.getMi_id() + "' ";
	} else if (kind.equals("g") || kind.equals("b")) {		// 댓글 좋아요 및 싫어요일 경우
		sql = "update t_free_reply set fr_" + ((kind.equals("g")) ? "good" : "bad") + " = fr_" + ((kind.equals("g")) ? "good" : "bad") + " + 1 where fr_idx = " + fr_idx;
		// System.out.println(sql);
		stmt.executeUpdate(sql);		// 게시글의 댓글 수 증가 쿼리 실행 

		sql = "insert into t_free_reply_gnb (mi_id, fr_idx, frg_gnb) values ('" + mi_id + "', " + fr_idx + ", '" + kind + "')";
		// System.out.println(sql);
	} else {
		out.println("<script>");
		out.println("history.back();");
		out.println("</script>");
	}
	int result = stmt.executeUpdate(sql);
	out.println("<script>");
	if (result == 1) {
		out.println("location.replace('free_view.jsp" + args + "');");
	} else {		
		out.println("alert('댓글 관리에 실패했습니다.\\n다시시도하세요');");
		out.println("history.back();");		
	}
	out.println("</script>");
	
} catch (Exception e) {
	out.println("댓글 관련 문제가 발생했습니다.");
	e.printStackTrace();
} finally {
	try {
		stmt.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
}

      out.write('\r');
      out.write('\n');
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