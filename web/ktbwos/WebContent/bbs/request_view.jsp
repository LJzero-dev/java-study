<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../_inc/inc_head.jsp" %>
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
			<td><label>회원<input type="radio" name="rl_write" value="y" /></label><label>비회원<input type="radio" name="rl_write" value="n" /></label></td>
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
	<input style="position: fixed;  top: 420px;  left: 1000px;" type="submit" value="등록"><input style="position: fixed;  top: 420px;  left: 1050px;" type="button" value="취소">
</form>
</div>
<%@ include file="../_inc/inc_foot.jsp" %>