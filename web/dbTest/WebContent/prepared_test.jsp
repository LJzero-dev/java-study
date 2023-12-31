<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%
String driver = "com.mysql.cj.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/mall?useUnicode=true&characterEncoding=UTF8&verifyServerCertificate=false&useSSL=false&serverTimezone=UTC";
Connection conn = null;	// DB와의 연결을 시켜주는 객체 선언
PreparedStatement pstmt = null;

try {
	Class.forName(driver);
	conn = DriverManager.getConnection(url, "root", "1234");
	String sql = "insert into t_admin_info (ai_id, ai_pw, ai_name) values (?, ?, ?)";	// PreparedStatment를 사용하려면 PreparedStatment를 생성하기 전에 쿼리를 먼저 만들어 놔야 함
	pstmt = conn.prepareStatement(sql);													// 단, 쿼리에 사용할 값들은 ?로 채운 형태로 쿼리 생성하고, 값들은 후에 파라미터 형태로 전달하게 됨
	pstmt.setString(1, "admin2");		// 쿼리에 있는 ? 대신 들어갈 값들을 차례대로 파라미터 형태로 지정함
	pstmt.setString(2, "1111");
	pstmt.setString(3, "관리자2");
	int result = pstmt.executeUpdate();	// PreparedStatement는 쿼리 실행시 excute~() 메소드는 매기변수 없이 실행됨
	if (result == 1) {
		out.println("정상적으로 등록되었습니다.");
	} else {
		out.println("등록에 실패했습니다.");
	}
	
} catch (Exception e) {
	out.println("관리자 등록시 문제가 발생했습니다.");
	e.printStackTrace();
} finally {
	try {
		pstmt.close();
		conn.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
%>