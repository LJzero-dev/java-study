/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.89
 * Generated at: 2023-06-12 21:06:11 UTC
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

public final class request_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_dependants.put("/bbs/../_inc/inc_foot.jsp", Long.valueOf(1686553529110L));
    _jspx_dependants.put("/bbs/../_inc/inc_head.jsp", Long.valueOf(1686578951370L));
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
      out.write("<div width=\"1100\">\r\n");
      out.write("<a href=\"");
      out.print(ROOT_URL );
      out.write("\"><img style=\"width:200px\" src=\"/ktbwos/img/ktbwos.png\"></a>\r\n");
 if (isLogin) { 
      out.write("\r\n");
      out.write("<a style=\"display:inline-block; margin-top:50px; margin-left:660px;  position:fixed;\" href=\"/ktbwos/logout.jsp\">로그아웃 </a>\r\n");
      out.write("<a style=\"display:inline-block; margin-top:50px; margin-left:800px;  position:fixed;\" href=\"/ktbwos/member_info.jsp\">회원 정보</a>\r\n");
 } else { 
      out.write("\r\n");
      out.write("<a style=\"display:inline-block; margin-top:50px; margin-left:660px;  position:fixed;\" href=\"/ktbwos/login_form.jsp\">로그인 </a>\r\n");
 } 
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<br />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table width=\"1100\">\r\n");
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
      out.write('\r');
      out.write('\n');

request.setCharacterEncoding("utf-8");
int cpage = 1, psize = 3, bsize = 3, rcnt = 0, pcnt = 0;

if (request.getParameter("cpage") != null) cpage = Integer.parseInt(request.getParameter("cpage"));

String schtype = request.getParameter("schtype");
String keyword = request.getParameter("keyword");
String schargs = "";
String where =" where 1=1 ";

if (schtype == null || schtype.equals("") || keyword == null || keyword.equals("")) {			// 검색을 하지 않은 경우
	schtype = "";	keyword = "";
} else {
	keyword = getRequest(keyword);
	URLEncoder.encode(keyword, "UTF-8");	// 쿼리스트링으로 주고 받는 검색어가 한글일 경우 IE에서 문제가 발생할 수도 있으므로 유니코드로 변환
	

	if (schtype.equals("all")) {	// 검색조건이 '제목 + 내용'일 경우
		where += " and (rl_title like '%" + keyword + "%' " + " or rl_name like '%" + keyword + "%' " + " or rl_writer like '%" + keyword + "%') ";	
	} else if (schtype.equals("b")) {	// 검색조건이 '작성자'일 경우
		where += " and rl_writer = '" + keyword + "'";
	} else {					// 검색조건이 '제목'이거나 '내용'일경우
		where += " and rl_title like '%" + keyword + "%' ";
	}
	schargs = "&schtype=" + schtype + "&keyword=" + keyword;	//	검색조건이 있을 경우 링크의 url에 붙일 쿼리스트링 완성
}

try {
	stmt = conn.createStatement();
	sql = "select count(*) from t_request_list " + where;	// 자유게시판 레코드의 개수(검색조건 포함)를 받아 올 쿼리
	rs = stmt.executeQuery(sql);
	if (rs.next()) rcnt = rs.getInt(1);	
	
	pcnt = rcnt / psize;
	if (rcnt % psize > 0) pcnt++;
	
	int start = (cpage -1) * psize;
	sql = "select rl_idx, rl_ctgr, rl_title, rl_name, rl_writer, rl_status, if (date(rl_date) = curdate(), time(rl_date), replace(mid(rl_date, 3, 8), '-', '.')) rldate"
			+ " from t_request_list " + where + "  order by rl_idx desc limit " + start + " , " + psize;
	rs = stmt.executeQuery(sql);
	// System.out.println(sql);
} catch (Exception e) {
	out.println("자유게시판 목록에서 문제가 발생했습니다");
	e.printStackTrace();
}

      out.write("\r\n");
      out.write("<div width=\"1100\">\r\n");
      out.write("<input type=\"button\" value=\"전체글\">  게시판 요청\r\n");
      out.write("<form style=\"width:430px; background:#1E4B79; display:inline-block; margin-left: 523px;  position: fixed; \" name=\"frmSch\">\r\n");
      out.write("<fieldset>\r\n");
      out.write("		<select name=\"schtype\">\r\n");
      out.write("			<option value=\"all\" ");
 if (schtype.equals("all")) { 
      out.write("selected=\"selected\"");
 } 
      out.write(">전체</option>\r\n");
      out.write("			<option value=\"a\" ");
 if (schtype.equals("a")) { 
      out.write("selected=\"selected\"");
 } 
      out.write(">제목</option>\r\n");
      out.write("			<option value=\"b\" ");
 if (schtype.equals("b")) { 
      out.write("selected=\"selected\"");
 } 
      out.write(">요청자</option>\r\n");
      out.write("		</select>\r\n");
      out.write("		게시판 이름\r\n");
      out.write("		<input type=\"text\" name=\"keyword\" value=\"");
      out.print(keyword );
      out.write("\" />\r\n");
      out.write("		<input type=\"submit\" value=\"검색\" />\r\n");
      out.write("</fieldset>\r\n");
      out.write("</form>\r\n");
      out.write("<br /><br />\r\n");
      out.write("	<table width=\"1100\">\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th width=\"7%\">번호</th>\r\n");
      out.write("			<th width=\"7%\">분류</th>\r\n");
      out.write("			<th width=\"15%\">게시판 이름</th>\r\n");
      out.write("			<th width=\"*\">제목</th>\r\n");
      out.write("			<th width=\"12%\">요청자</th>\r\n");
      out.write("			<th width=\"12%\">요청일</th><th width=\"10%\">승인여부</th>\r\n");
      out.write("		</tr>\r\n");

if (rs.next()) {
	int num = rcnt - (cpage - 1) * psize;
	do { 
		int titleCnt = 24;
		String  title = rs.getString("rl_title"), writer = rs.getString("rl_writer"), ctgr = rs.getString("rl_ctgr").equals("a") ? "게임" : rs.getString("rl_ctgr").equals("b") ? "연예" : "스포츠";					
		String date = rs.getString("rldate"), status = rs.getString("rl_status").equals("a") ? "[승인대기중]" : rs.getString("rl_status").equals("y") ? "[승인]" : "[미승인]";
		if (title.length() > titleCnt) 
			title = title.substring(0,titleCnt-3) + "...";
		title = "<a href='request_view.jsp?idx=" + rs.getInt("rl_idx") + "&cpage=" + cpage + schargs+ "'>" + title + "</a>";
		

      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td>");
      out.print(num );
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(ctgr );
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(writer );
      out.write("</td>\r\n");
      out.write("<td align=\"left\">");
      out.print(title );
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(writer );
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(date );
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(status );
      out.write("</td>\r\n");
      out.write("</tr>	\r\n");
 
	num--;
	} while(rs.next());
}else {
		out.print("<tr height='30'><td colspan='7'>검색결과가 없습니다.</td></tr>");
} 
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<br />	\r\n");
      out.write("</div>\r\n");
      out.write("<br />\r\n");
      out.write("<table width=\"1100\">\r\n");
      out.write("<tr>\r\n");
      out.write("<td width=\"900\">\r\n");

if (rcnt > 0) {	// 게시글이 있으면
	String link = "request_list.jsp?cpage=";
	if (cpage == 1) {
		out.println("[처음]&nbsp;&nbsp;&nbsp;[이전]&nbsp;&nbsp;");
	} else {
		out.println("<a href='" + link + "1" + schargs + "'>[처음]</a>&nbsp;&nbsp;&nbsp;");
		out.println("<a href='" + link + (cpage-1) + schargs + "'>[이전]</a>&nbsp;&nbsp;");
	}
	
	int spage = (cpage -1) / bsize * bsize +1;	// 블록 시작 페이지 번호
	for (int i = 1, j = spage; i <= bsize && j <= pcnt; i++, j++) {	// i : 블록에서 보여줄 페이지의 개수만큼 루프를 돌릴 조건으로 사용되는 변수 j : 실제 출력할 페이지 번호로 전체 페이지 개수(마지막 페이지 번호)를 넘지 않게 할 변수
		if (j == cpage) {
			out.println("&nbsp;<strong>" + j + "</strong>&nbsp;");
		} else {
			out.println("&nbsp;<a href='" + link + j + schargs + "'>" + j + "</a>&nbsp;");
		}
	}
	
	if (cpage == pcnt) {
		out.println("&nbsp;&nbsp;[다음]&nbsp;&nbsp;&nbsp;[마지막]");
	} else {
		out.println("<a href='" + link + (cpage+1) + schargs + "'>[다음]</a>&nbsp;&nbsp;");
		out.println("<a href='" + link + pcnt + schargs + "'>[마지막]</a>&nbsp;&nbsp;&nbsp;");
	}
}

      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("<td width=\"*\" align=\"right\">\r\n");
      out.write("	<input type=\"button\" value=\"글등록\" onclick=\"location.href='request_form.jsp?kind=in';\" />\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
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
