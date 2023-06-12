<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../_inc/inc_head.jsp" %>
<%
request.setCharacterEncoding("utf-8");
String kind = request.getParameter("kind");
String caption = "등록";		// 버튼에 사용할 캡션 문자열
String action = "request_proc_in.jsp";	
String rl_ctgr = "",rl_title = "",rl_name = "",rl_writer = "",rl_write = "",rl_reply_use = "",rl_reply_write = "", rl_content = "";

int idx = 0;	// 글번호를 저장할 변수로 '수정'일 경우에만 사용됨
int cpage = 1;	// 페이지번호를 저장할 변수로 '수정'일 경우에만 사용됨

String schtype = request.getParameter("schtype");	// 검색 조건
String keyword = request.getParameter("keyword");	// 검색어
String args = "";
if (schtype != null && !schtype.equals("") && keyword != null && !keyword.equals("")) {
	args = "&schtype=" + schtype + "&keyword=" + keyword;	// 링크에 검색 관련 값들을 쿼리스트링으로 연결해줌
}
	idx = Integer.parseInt(request.getParameter("idx"));
	cpage = Integer.parseInt(request.getParameter("cpage"));
	
	String where = " where rl_idx = " + idx;
	sql = "select * from t_request_list " + where;
	
	try {
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		if (rs.next()) {
			rl_ctgr = rs.getString("rl_ctgr");
			rl_title = rs.getString("rl_title");
			rl_name = rs.getString("rl_name");
			rl_writer = rs.getString("rl_writer");
			rl_write = rs.getString("rl_write");
			rl_reply_use = rs.getString("rl_reply_use");
			rl_reply_write = rs.getString("rl_reply_write");
			rl_content = rs.getString("rl_content");
		} else {
			out.println("<script>");
			out.println("alert('잘못된 경로로 들어오셨습니다.');");
			out.println("history.back();");
			out.println("</script>");	
			out.close();
		}		
	} catch (Exception e) {
		out.println("게시글 보기 폼에서 문제가 발생했습니다.");
		e.printStackTrace();
	} finally {
		try {
			rs.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
%>

<script>
	function rl_reply_use_show (rl_reply_use) {
		if (rl_reply_use == "y") {
			document.getElementById("rl_reply_write").style.display="";
			document.getElementById("rl_reply_write2").style.display="";
		} else {
			document.getElementById("rl_reply_write").style.display="none";
			document.getElementById("rl_reply_write2").style.display="none";
		}
	}
</script>
<div width="1100">
<input type="button" value="전체글">  게시판 요청<br /><br />
<form action="request_form.jsp?kind=up">
	<table width="1100" >	
		<tr>
			<td>제목</td>
			<td colspan="3"><input id="rl_title" type="text" placeholder="제목을 입력하세요" style="width:850px;" value="<%=rl_title %>"></td>
		</tr >
		<tr>
			<td width="20%">요청자</td><td width="30%"><%=rl_writer %></td><td width="20%">작성 글번호</td><td width="30%"><%=idx %></td>
		</tr>
		<tr>
			<td>분류</td>
			<td>
				<select name="rl_ctgr" style="width:250px; height:25px; font-size:15px;">
					<option value="a" <% if (rl_ctgr.equals("a")) { %>selected="selected"<% } %>>게임</option>
					<option value="b" <% if (rl_ctgr.equals("b")) { %>selected="selected"<% } %>>연예</option>
					<option value="c" <% if (rl_ctgr.equals("c")) { %>selected="selected"<% } %>>스포츠</option>
				</select>
			</td>
			<td>게시글 작성 권한</td>
			<td>
				<label>회원<input type="radio" name="rl_write" value="y" <% if (rl_write.equals("y")) { %>checked="checked"<% } %>/></label>
				<label>비회원<input type="radio" name="rl_write" value="n" <% if (rl_write.equals("n")) { %>checked="checked"<% } %>/></label>
			</td>
		</tr>
		<tr>
			<td>댓글 사용 여부</td>
			<td>
				<label>사용<input type="radio" name="rl_reply_use" value="y" <% if (rl_reply_use.equals("y")) { %>checked="checked"<% } %> onclick="rl_reply_use_show(this.value)" /></label>
				<label>미사용<input type="radio" name="rl_reply_use" value="n" <% if (rl_reply_use.equals("y")) { %>checked="checked"<% } %> onclick="rl_reply_use_show(this.value)" /></label>
            </td>
            <td id="rl_reply_write" style="display:none;" >댓글 작성 권한</td>
			<td id="rl_reply_write2" style="display:none;" >
				<label>회원<input type="radio" name="rl_reply_write" value="y" <% if (rl_reply_write.equals("y")) { %>checked="checked"<% } %> /></label>
				<label>비회원<input type="radio" name="rl_reply_write" value="n" <% if (rl_reply_write.equals("n")) { %>checked="checked"<% } %> /></label>
            </td>
		</tr>		
		<tr>
			<td>게시판 이름</td>
			<td colspan="3"><input id="rl_title" type="text" placeholder="게시판 이름을 입력하세요" style="width:850px;" value="<%=rl_name %>"></textarea></td>
		</tr>
		<tr>
			<td>요청 내용</td>
			<td colspan="3"><textarea id="rl_content" style="width:99%; height:100px" placeholder="요청 내용을 상세히 입력하세요" ><%=rl_content %></textarea></td>
		</tr>		
		<tr>
			<td colspan="4">※ 게시판 이름 및 분류와 맞지 않거나, 요청 내용이 부적절할 경우 반려될 수 있습니다..</td>
		</tr>
		<tr>			
			<td colspan="4">※ 개설 승인, 반려는 매우 많은 시간이 필요합니다.</td>
		</tr>
	</table><br />
	<input  style="position: fixed;  top: 550px;  left: 1000px;" type="submit" value="수정">
	<input style="position: fixed;  top: 550px;  left: 1050px;" type="button" value="취소" onclick="history.back();">
</form>
</div>

<%@ include file="../_inc/inc_foot.jsp" %>