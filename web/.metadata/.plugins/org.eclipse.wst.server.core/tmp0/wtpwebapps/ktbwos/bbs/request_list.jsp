<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../_inc/inc_head.jsp" %>
<%
request.setCharacterEncoding("utf-8");
int cpage = 1, psize = 3, bsize = 3, rcnt = 0, pcnt = 0;

if (request.getParameter("cpage") != null) cpage = Integer.parseInt(request.getParameter("cpage"));

String schtype = request.getParameter("schtype");
String keyword = request.getParameter("keyword");
String schargs = "";
String where =" where rl_isview = 'y' ";

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
	sql = "select rl_idx, rl_ctgr, rl_title, rl_name, rl_writer, rl_status, rl_isview, if (date(rl_date) = curdate(), time(rl_date), replace(mid(rl_date, 3, 8), '-', '.')) rldate"
			+ " from t_request_list " + where + "  order by rl_idx desc limit " + start + " , " + psize;
	rs = stmt.executeQuery(sql);
	// System.out.println(sql);
} catch (Exception e) {
	out.println("자유게시판 목록에서 문제가 발생했습니다");
	e.printStackTrace();
}
%>
<div width="1100">
<input type="button" value="전체글">  게시판 요청
<form style="width:430px; background:#1E4B79; display:inline-block; margin-left: 523px;  position: fixed; " name="frmSch">
<fieldset>
		<select name="schtype">
			<option value="all" <% if (schtype.equals("all")) { %>selected="selected"<% } %>>전체</option>
			<option value="a" <% if (schtype.equals("a")) { %>selected="selected"<% } %>>제목</option>
			<option value="b" <% if (schtype.equals("b")) { %>selected="selected"<% } %>>요청자</option>
		</select>
		게시판 이름
		<input type="text" name="keyword" value="<%=keyword %>" />
		<input type="submit" value="검색" />
</fieldset>
</form>
<br /><br />
	<table width="1100">
		<tr>
			<th width="7%">번호</th>
			<th width="7%">분류</th>
			<th width="15%">게시판 이름</th>
			<th width="*">제목</th>
			<th width="12%">요청자</th>
			<th width="12%">요청일</th><th width="10%">승인여부</th>
		</tr>
<%
if (rs.next()) {
	int num = rcnt - (cpage - 1) * psize;
	do { 
		int titleCnt = 24;
		String  title = rs.getString("rl_title"), writer = rs.getString("rl_writer"), ctgr = rs.getString("rl_ctgr").equals("a") ? "게임" : rs.getString("rl_ctgr").equals("b") ? "연예" : "스포츠";					
		String date = rs.getString("rldate"), status = rs.getString("rl_status").equals("a") ? "[승인대기중]" : rs.getString("rl_status").equals("y") ? "[승인]" : "[미승인]";
		if (title.length() > titleCnt) 
			title = title.substring(0,titleCnt-3) + "...";
		title = "<a href='request_view.jsp?idx=" + rs.getInt("rl_idx") + "&cpage=" + cpage + schargs+ "'>" + title + "</a>";
		
%>
<tr>
<td><%=num %></td>
<td><%=ctgr %></td>
<td><%=writer %></td>
<td align="left"><%=title %></td>
<td><%=writer %></td>
<td><%=date %></td>
<td><%=status %></td>
</tr>	
<% 
	num--;
	} while(rs.next());
}else {
		out.print("<tr height='30'><td colspan='7'>검색결과가 없습니다.</td></tr>");
} %>
</table>
<br />	
</div>
<br />
<table width="1100">
<tr>
<td width="900">
<%
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
%>
</td>
<td width="*" align="right">
	<input type="button" value="글등록" onclick="location.href='request_form.jsp?kind=in';" />
</td>
</tr>
</table>
<%@ include file="../_inc/inc_foot.jsp" %>