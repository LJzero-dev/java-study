package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UserDAO {
	
	
	String driver = "com.mysql.jdbc.Driver";
	String dbURL = "jdbc:mysql://localhost:3306/ajax";

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public UserDAO() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(dbURL, "root", "1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<User> search(String userName) {
		String SQL = "SELECT * FROM USER WHERE userName like ?";
		ArrayList<User> userList = new ArrayList<User>();
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, userName);
			rs = pstmt.executeQuery();
			User user = new User();
			while (rs.next()) {
				user.setUserName(rs.getString(1));
				user.setUserAge(rs.getInt(2));
				user.setUserGender(rs.getString(3));
				user.setUserEmail(rs.getString(4));
				userList.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userList;
	}
}
