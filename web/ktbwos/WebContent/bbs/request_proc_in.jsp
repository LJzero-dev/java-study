<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../_inc/inc_head.jsp" %>
<%
request.setCharacterEncoding("utf-8");






String rl_ctgr = getRequest("rl_ctgr");
String rl_title = getRequest(request.getParameter("rl_title"));
String rl_name = request.getParameter("rl_name");
String rl_writer = request.getParameter("rl_writer");
String rl_write = request.getParameter("rl_write");
String rl_reply_use = request.getParameter("rl_reply_use");
String rl_reply_write = request.getParameter("rl_reply_write");
String rl_content = getRequest(request.getParameter("rl_content"));

try {
	stmt = conn.createStatement();
	int idx = 1;
	sql = "select max(fl_idx) + 1 from t_free_list";
	rs = stmt.executeQuery(sql);
	if (rs.next()) idx = rs.getInt(1);	
	
	// sql = "insert into t_free_list values (" + idx + ", '" + fl_ismem + "', '" + fl_writer + "', '" + fl_pw + "', '" + fl_title + "', '" + fl_content + "',  0, 0, '" + fl_ip + "',  'y', now())";
	sql = "insert into t_request_list (rl_ctgr, rl_title, rl_name, rl_writer, rl_write, rl_reply_use, rl_reply_write, rl_content) values (?, ?, ?, ?, ?, ?, ?, ?)";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	// System.out.println(sql);
	// stmt.executeQuery(sql);
	pstmt.setString(1, rl_ctgr);
	pstmt.setString(2, rl_title);
	pstmt.setString(3, rl_name);
	pstmt.setString(4, rl_writer);
	pstmt.setString(5, rl_write);
	pstmt.setString(6, rl_reply_use);
	pstmt.setString(7, rl_reply_write);
	pstmt.setString(8, rl_content);
	
	int result = pstmt.executeUpdate();
	if (result == 1 ) {
		response.sendRedirect("request_view.jsp?cpage=1&idx=" + idx);
	} else {
		out.println("<script>");
		out.println("alert('자유게시판 글 등록에 실패했습니다.\n다시 시도하세요');");
		out.println("history.back();");
		out.println("</script>");	
		out.close();
	}	
} catch (Exception e) {
	out.println("자유게시판 등록시 문제가 발생했습니다.");
	e.printStackTrace();
}
%>
<%@ include file="../_inc/inc_foot.jsp" %>