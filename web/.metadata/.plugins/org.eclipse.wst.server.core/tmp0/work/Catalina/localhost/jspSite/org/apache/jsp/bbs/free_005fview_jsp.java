/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.89
 * Generated at: 2023-06-12 10:45:01 UTC
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

public final class free_005fview_jsp extends org.apache.jasper.runtime.HttpJspBase
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
int cpage = Integer.parseInt(request.getParameter("cpage"));
int idx = Integer.parseInt(request.getParameter("idx"));
String schtype = request.getParameter("schtype");	// 검색 조건
String keyword = request.getParameter("keyword");	// 검색어
String args = "?cpage=" + cpage;
if (schtype != null && !schtype.equals("") && keyword != null && !keyword.equals("")) {
	args += "&schtype=" + schtype + "&keyword=" + keyword;	// 링크에 검색 관련 값들을 쿼리스트링으로 연결해줌
}

// view 화면에서 보여줄 게시글의 정보들을 저장할 변수들
String fl_ismem = "", fl_writer = "", fl_title = "",fl_content = "", fl_ip = "", fl_date = "";
int fl_read = 0, fl_reply = 0;

try {
	stmt = conn.createStatement();
	sql = "update t_free_list set fl_read = fl_read + 1 where fl_idx = " + idx;
	stmt.executeUpdate(sql);	// 조회수 증가 쿼리 실행
	
	sql = "select * from t_free_list where fl_isview = 'y' and fl_idx = " + idx;
	rs = stmt.executeQuery(sql);
	if (rs.next()) {
		fl_ismem = rs.getString("fl_ismem");
		fl_writer = rs.getString("fl_writer");
		fl_title = rs.getString("fl_title");
		fl_content = rs.getString("fl_content").replace("\r\n", "<br />");
		fl_ip = rs.getString("fl_ip");
		fl_date = rs.getString("fl_date");
		fl_read = rs.getInt("fl_read");
		fl_reply = rs.getInt("fl_reply");
	} else {
		out.println("<script>");
		out.println("alert('존재하지 않는 게시물 입니다.');");
		out.println("history.back();");
		out.println("</script>");
	}	
} catch (Exception e) {
	out.println("게시글 보기 시 문제가 발생했습니다.");
	e.printStackTrace();
} 

      out.write("\r\n");
      out.write("<h2>자유게시판 글 보기</h2>\r\n");
      out.write("<table width=\"700\" cellpadding=\"5\">\r\n");
      out.write("<tr>\r\n");
      out.write("<th width=\"12%\">작성자</th>\r\n");
      out.write("<td width=\"15%\">");
      out.print((fl_ismem.equals("y")) ? fl_writer.substring(0, 5) + "***" : fl_writer );
      out.write("</td>\r\n");
      out.write("<th width=\"12%\">작성일</th><td width=\"*\">");
      out.print(fl_date );
      out.write("</td>\r\n");
      out.write("<th width=\"12%\">조회수</th><td width=\"10%\">");
      out.print(fl_read );
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr><th>제목</th><td colspan=\"5\">");
      out.print(fl_title );
      out.write("</td></tr>\r\n");
      out.write("<tr><th>내용</th><td colspan=\"5\">");
      out.print(fl_content );
      out.write("</td></tr>\r\n");
      out.write("<tr><td colspan=\"6\" align=\"center\">\r\n");

boolean isPms = false;	// 수정과 삭제 버튼을 현 사용자에게 보여줄지 여부를 저장할 변수
String upLink = "", delLink = "";
if (fl_reply == 0) {	// 댓글이 없을 경우에만 수정과 삭제를 허용
	if (fl_ismem.equals("n")) {	// 현재 글이 비회원 글일 경우
		isPms = true;
		upLink = "free_form_pw.jsp" + args + "&kind=up&idx=" + idx;
		delLink = "free_form_pw.jsp" + args + "&kind=del&idx=" + idx;
	} else {	// 현재 글이 회원 글일 경우
		if (isLogin && loginInfo.getMi_id().equals(fl_writer)){ // 현재 로그인이 되어있는 상태에서 현 로그인 사용자가 현 게시글을 입력한 회원일 경우
			isPms = true;
			upLink = "free_form.jsp" + args + "&kind=up&idx=" + idx;
			delLink = "free_proc_del.jsp?idx=" + idx;
		}
	}
}

if (isPms) {

      out.write("<hr />\r\n");
      out.write("	<input type=\"button\" value=\"글수정\" onclick=\"location.href='");
      out.print(upLink );
      out.write("';\" />\r\n");
      out.write("	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("<script>\r\n");
      out.write("function isDel() {\r\n");
      out.write("	if (confirm(\"정말 삭제하시겠습니까?\\n삭제된 글은 복구 불가합니다.\")) {\r\n");
      out.write("		location.href = \"");
      out.print(delLink );
      out.write("\";\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("	<input type=\"button\" value=\"글삭제\" onclick=\"isDel();\" />\r\n");
      out.write("	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
 } 
      out.write("\r\n");
      out.write("	<input type=\"button\" value=\"글목록\" onclick=\"location.href='free_list.jsp");
      out.print(args );
      out.write("';\" />\r\n");
      out.write("</td></tr>\r\n");

String msg = " placeholder='로그인 후에 사용하실 수 있습니다.' ";
String dis = " disabled='disabled' ";
String login = " onclick='goLogin(\"댓글 등록\");' ";
if (isLogin) {
	msg = "";	dis = "";	login = "";
}

      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".txt { width:530px; height:60px; }\r\n");
      out.write(".btn { width:120px; height:60px; }\r\n");
      out.write(".frmUp { display:none;}\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("function goLogin(msg) {\r\n");
      out.write("	if (confirm(msg + \" 로그인이 필요합니다.\\n로그인 화면으로 이동하시겠습니까?\")) {\r\n");
      out.write("		location.href = \"../login_form.jsp?url=");
      out.print(loginUrl );
      out.write("\";\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("function setCharCount(con, fr_idx) {\r\n");
      out.write("	var cnt = con.value.length;\r\n");
      out.write("	var obj = document.getElementById(\"charCnt\" + fr_idx);\r\n");
      out.write("	obj.innerHTML = cnt;\r\n");
      out.write("	if (cnt > 200) {\r\n");
      out.write("		alert(\"댓글은 200자 까지만 입력가능합니다.\");\r\n");
      out.write("		con.value = con.value.substring(0, 200);\r\n");
      out.write("		obj.innerHTML = 200;\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function replyDel(fr_idx) {\r\n");
      out.write("	if (confirm(\"정말 삭제하시겠습니까?\")) {\r\n");
      out.write("		location.href = \"free_reply_proc.jsp");
      out.print(args );
      out.write("&kind=del&fl_idx=");
      out.print(idx );
      out.write("&fr_idx=\" + fr_idx;\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("function replyUp (fr_idx) {\r\n");
      out.write("	var frm = document.getElementById(\"frm\" + fr_idx);\r\n");
      out.write("	if (frm.style.display == \"block\")\r\n");
      out.write("		frm.style.display = \"none\";\r\n");
      out.write("	else\r\n");
      out.write("		frm.style.display = \"block\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function goGnB (gnb, fr_idx) {	// 로그인한 회원이 '좋아요' 또는 '싫어요'를 클릭할 경우 이동시키는 함수\r\n");
      out.write("	var frm = document.frmGnB;\r\n");
      out.write("	frm.kind.value = gnb;\r\n");
      out.write("	frm.fr_idx.value = fr_idx;\r\n");
      out.write("	frm.submit();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</table>\r\n");
      out.write("<hr width=\"700\" align=\"left\" />\r\n");
      out.write("\r\n");
      out.write("<!--  댓글 목록 영역 시작 -->\r\n");
      out.write("<div id=\"replyBox\" style=\"width:700px; text-align:center;\">\r\n");
      out.write("	<form name=\"frmReply\" action=\"free_reply_proc.jsp");
      out.print(args );
      out.write("\" method=\"post\" >\r\n");
      out.write("	<input type=\"hidden\" name=\"kind\" value=\"in\" />\r\n");
      out.write("	<input type=\"hidden\" name=\"fl_idx\" value=\"");
      out.print(idx );
      out.write("\" />\r\n");
      out.write("		<table width=\"100%\" cellpadding=\"5\">\r\n");
      out.write("		<tr>\r\n");
      out.write("		<td width=\"550\" align=\"right\">\r\n");
      out.write("			<textarea name=\"fr_content\" class=\"txt\" ");
      out.print(msg + login );
      out.write(" onkeyup=\"setCharCount(this, '');\"  ></textarea>\r\n");
      out.write("			<br />200자 이내로 입력하세요. (<span id=\"charCnt\">0</span> / 200)\r\n");
      out.write("		</td>\r\n");
      out.write("		<td width=\"*\" valign=\"top\">\r\n");
      out.write("			<input type=\"submit\" value=\"댓글 등록\" class=\"btn\" ");
      out.print(dis );
      out.write("/>\r\n");
      out.write("		</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		</table>	\r\n");
      out.write("	</form>	\r\n");
      out.write("	<hr width=\"700\" align=\"left\" />\r\n");
      out.write("	<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" boder=\"0\" id=\"list\" >\r\n");
      out.write("	<tr><th colspan=\"5\" align=\"left\">댓글 개수 : ");
      out.print(fl_reply );
      out.write("개</th></tr>\r\n");

sql = "select * from t_free_reply where fr_isview = 'y' and fl_idx = " + idx;
try {
	rs = stmt.executeQuery(sql);
	if (rs.next()) {	// 해당 게시글에 댓글이 있을 경우
		do {
			String date = rs.getString("fr_date").substring(2, 10) + "<br />" + rs.getString("fr_date").substring(11);
	
			String gLink = "goLogin('좋아요는');";
			String bLink = "goLogin('싫어요는');";
			if (isLogin) {
				sql = "select 1 from t_free_reply_gnb where mi_id = '" + loginInfo.getMi_id() + "' and fr_idx = " + rs.getInt("fr_idx");
				Statement stmt2 = conn.createStatement();
				ResultSet rs2 = stmt2.executeQuery(sql);
				if (rs2.next()) {	// 이미 현 댓글에 대해 좋아요 또는 싫어요를 했을 경우
					gLink = "alert('이미 참여했습니다.')";	bLink = gLink;
				} else {			// 아직 좋아요 또는 싫어요를 안했을 경우
					gLink = "goGnB('g', " + rs.getInt("fr_idx") + ");";
					bLink = "goGnB('b', " + rs.getInt("fr_idx") + ");";
				}
				try {
					rs2.close();
					stmt2.close();
				} catch (Exception e) {
					e.printStackTrace();
					}
			}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr align=\"left\" valign=\"top\">\r\n");
      out.write("	<td width=\"70\">");
      out.print(rs.getString("mi_id").substring(0, 5) );
      out.write("***</td>\r\n");
      out.write("	<td width=\"*\">");
      out.print(rs.getString("fr_content").replace("\r\n", "<br />") );
      out.write("</td>\r\n");
      out.write("	<td width=\"70\">");
      out.print(date );
      out.write("</td>\r\n");
      out.write("	<td width=\"70\" align=\"right\">\r\n");
      out.write("	<img src=\"../img/G.png\" width=\"20\" title=\"좋아요\" class=\"hand\" onclick=\"");
      out.print(gLink );
      out.write("\" />");
      out.print(rs.getInt("fr_good") );
      out.write("<br />\r\n");
      out.write("	<img src=\"../img/B.png\" width=\"20\" title=\"싫어요\" class=\"hand\" onclick=\"");
      out.print(bLink );
      out.write("\" />");
      out.print(rs.getInt("fr_bad") );
      out.write("\r\n");
      out.write("	</td>\r\n");
      out.write("	<td width=\"22\" align=\"right\">\r\n");
 if(isLogin && loginInfo.getMi_id().equals(rs.getString("mi_id"))) { 
      out.write("\r\n");
      out.write("	<img src=\"../img/delete.png\" width=\"20\" title=\"댓글 삭제\" class=\"hand\" onclick=\"replyDel(");
      out.print(rs.getInt("fr_idx") );
      out.write(");\" /><br />\r\n");
      out.write("	<img src=\"../img/update.png\" width=\"20\" title=\"댓글 수정\" class=\"hand\" onclick=\"replyUp(");
      out.print(rs.getInt("fr_idx") );
      out.write(");\"/>\r\n");
 } 
      out.write("\r\n");
      out.write("	</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr><td colspan=\"4\" >\r\n");
 if(isLogin && loginInfo.getMi_id().equals(rs.getString("mi_id"))) { 
      out.write("\r\n");
      out.write("	<form action=\"free_reply_proc.jsp");
      out.print(args );
      out.write("\" method=\"post\" class=\"frmUp\" id=\"frm");
      out.print(rs.getInt("fr_idx") );
      out.write("\">\r\n");
      out.write("		<input type=\"hidden\" name=\"kind\" value=\"up\" />\r\n");
      out.write("		<input type=\"hidden\" name=\"fl_idx\" value=\"");
      out.print(idx );
      out.write("\" />\r\n");
      out.write("		<input type=\"hidden\" name=\"fr_idx\" value=\"");
      out.print(rs.getInt("fr_idx") );
      out.write("\" />\r\n");
      out.write("		<table width=\"100%\" cellpadding=\"5\">\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td width=\"550\" align=\"right\">\r\n");
      out.write("					<textarea name=\"fr_content\" class=\"txt\" ");
      out.print(msg + login );
      out.write(" onkeyup=\"setCharCount(this, '");
      out.print(rs.getInt("fr_idx") );
      out.write("');\"  >");
      out.print(rs.getString("fr_content") );
      out.write("</textarea>\r\n");
      out.write("					<br />200자 이내로 입력하세요. (<span id=\"charCnt");
      out.print(rs.getInt("fr_idx") );
      out.write('"');
      out.write('>');
      out.print(rs.getString("fr_content").length() );
      out.write("</span> / 200)\r\n");
      out.write("				</td>\r\n");
      out.write("				<td width=\"*\" valign=\"top\">\r\n");
      out.write("					<input type=\"submit\" value=\"댓글 수정\" class=\"btn\"/>\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("	</form>\r\n");
 } 
      out.write("\r\n");
      out.write("</td></tr>\r\n");

		} while(rs.next());
	} else {			// 해당 게시글에 댓글이 있을 경우
		out.println("<tr><td align='center'>댓글이 없습니다.</td></tr>");
	}
	
} catch (Exception e) {
	out.println("댓글 목록에서 문제가 생겼습니다.");
	e.printStackTrace();
} finally {
	try {
		rs.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
}

      out.write("\r\n");
      out.write("	</table>\r\n");
      out.write("</div>\r\n");
      out.write("<form name=\"frmGnB\" action=\"free_reply_proc.jsp");
      out.print(args );
      out.write("\" method=\"post\" >\r\n");
      out.write("<input type=\"hidden\" name=\"kind\" value=\"\" />\r\n");
      out.write("<input type=\"hidden\" name=\"fl_idx\" value=\"");
      out.print(idx );
      out.write("\" />\r\n");
      out.write("<input type=\"hidden\" name=\"fr_idx\" value=\"\" />\r\n");
      out.write("</form>\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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