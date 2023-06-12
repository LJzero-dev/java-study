<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../_inc/inc_head.jsp" %>
<%
request.setCharacterEncoding("utf-8");
String kind = request.getParameter("kind");
String caption = "등록";		// 버튼에 사용할 캡션 문자열
String action = "free_proc_in.jsp";	
String fl_writer = "", fl_date = "", fl_title = "", fl_content = "";

int idx = 0;	// 글번호를 저장할 변수로 '수정'일 경우에만 사용됨
int cpage = 1;	// 페이지번호를 저장할 변수로 '수정'일 경우에만 사용됨

String schtype = request.getParameter("schtype");	// 검색 조건
String keyword = request.getParameter("keyword");	// 검색어
String args = "";
if (schtype != null && !schtype.equals("") && keyword != null && !keyword.equals("")) {
	args = "&schtype=" + schtype + "&keyword=" + keyword;	// 링크에 검색 관련 값들을 쿼리스트링으로 연결해줌
}

String fl_ismem = request.getParameter("fl_ismem");		// 현재 수정상태이면서 해당 글이 비회원 글일 경우에만 'n'의 값이 있음
if (fl_ismem == null)	fl_ismem = "y";
String fl_pw = request.getParameter("fl_pw");
if (kind.equals("up")) {	// 게시글 수정 폼일 경우
	caption = "수정";
	action = "free_proc_up.jsp";

	idx = Integer.parseInt(request.getParameter("idx"));
	cpage = Integer.parseInt(request.getParameter("cpage"));
	
	String where = " where fl_isview = 'y' and fl_idx = " + idx + " and fl_ismem = '" + fl_ismem + "' ";
	if (fl_ismem.equals("n"))	// 비회원 글일 경우
		where += " and fl_pw = '" + fl_pw + "' ";
	else						// 회원 글일 경우
		where += " and fl_writer = '" + loginInfo.getMi_id() + "' ";
	sql = "select * from t_free_list " + where;
	
	try {
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		if (rs.next()) {	// 게시글이 있으면
			fl_writer = rs.getString("fl_writer");
			fl_title = rs.getString("fl_title");
			fl_content = rs.getString("fl_content");
			fl_date = rs.getString("fl_date");
		} else {			// 게시글이 없으면
			out.println("<script>");
			if (fl_ismem.equals("n"))
				out.println("alert('암호가 틀렸습니다.\\n다시 시도하세요.');");
			else
				out.println("alert('잘못된 경로로 들어오셨습니다.');");
			out.println("history.back();");
			out.println("</script>");	
			out.close();
		}
		
	} catch (Exception e) {
		out.println("게시글 수정 폼에서 문제가 발생했습니다.");
		e.printStackTrace();
	} finally {
		try {
			rs.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
%>

<script>
	function rl_reply_use_show (rl_reply_use) {
		if (rl_reply_use == "y") {
			document.getElementById("rl_reply_write").style.display="";
		} else {
			document.getElementById("rl_reply_write").style.display="none";
		}
	}
</script>
<div width="1100">
<input type="button" value="전체글">  게시판 요청<br /><br />
<form action="request_proc.jsp">
	<table width="1100" >
		<tr>
			<td width="20%">아이디</td><td width="30%">홍길동</td><td width="20%">작성일</td><td width="30%">2023-06-09</td>
		</tr>
		<tr>
			<td>제목</td>
			<td colspan="3"><textarea style="width:870px; height:20px" name="rl_title">홍길동 키우기 게임게시판 요청글 제목 입니다</textarea></td>
		</tr >
		<tr>
			<td>분류</td>
			<td>
				<select name="rl_ctgr" style="width:250px; height:25px; font-size:15px;">
					<option value="a" >게임</option>
					<option value="b" >연예</option>
					<option value="c" >스포츠</option>
				</select>
			</td>
			<td>게시글 작성 권한</td>
			<td>
				<label>회원<input type="radio" name="rl_write" value="y" /></label>
				<label>비회원<input type="radio" name="rl_write" value="n" /></label>
			</td>
		</tr>
		<tr>
			<td>댓글 사용 여부</td>
			<td colspan="3"><label>사용<input type="radio" name="rl_reply_use" value="y" onclick="rl_reply_use_show(this.value)" /></label><label>미사용<input type="radio" name="rl_reply_use" value="n" onclick="rl_reply_use_show(this.value)" /></label>
            </td>
		</tr>

		<tr id="rl_reply_write" style="display:none;">
			<td>댓글 작성 권한</td>
			<td colspan="3"><label>회원<input type="radio" name="rl_reply_write" value="y" /></label><label>비회원<input type="radio" name="rl_reply_write" value="n" /></label>
            </td>
		</tr>
		
		<tr>
			<td>게시판 이름</td>
			<td colspan="3"><textarea style="width:870px; height:20px" name="rl_name">홍길동 키우기 게임</textarea></td>
		</tr>
		<tr>
			<td>요청 내용</td>
			<td colspan="3"><textarea style="width:99%; height:100px">홍길동 키우기 게임게시판 요청글 내용 입니다</textarea></td>
		</tr>		
		<tr>
			<td colspan="4">※ 게시판 이름 및 분류와 맞지 않거나, 요청 내용이 부적절할 경우 반려될 수 있습니다..</td>
		</tr>
		<tr>			
			<td colspan="4">※ 개설 승인, 반려는 매우 많은 시간이 필요합니다.</td>
		</tr>
	</table><br />
	<input style="position: fixed;  top: 550px;  left: 1000px;" type="submit" value="등록">
	<input style="position: fixed;  top: 550px;  left: 1050px;" type="button" value="취소" onclick="history.back();">
</form>
</div>

<%@ include file="../_inc/inc_foot.jsp" %>