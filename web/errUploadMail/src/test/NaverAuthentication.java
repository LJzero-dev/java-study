package test;

import javax.mail.*;

public class NaverAuthentication extends Authenticator {
	PasswordAuthentication passAuth;
	
	public NaverAuthentication() {
		passAuth = new PasswordAuthentication("���̹� ID", "���̹� PW");
	}
	public PasswordAuthentication getPasswordAuthentication() {
		return passAuth;
	}
}
