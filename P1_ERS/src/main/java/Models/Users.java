package Models;

import java.util.ArrayList;

public class Users {

	private String userName;
	private String passWord;
	private String Role;

	public Users() {
		super();
	}

	public Users(String username, String password, String role, ArrayList<Integer> tickets) {
		super();
		this.userName = username;
		this.passWord = password;
		this.Role = role;
	}
	
	public Users(String username, String password, String role) {
		super();
		this.userName = username;
		this.passWord = password;
		this.Role = role;
	}
	
	public String getUsername() {
		return userName;
	}

	public void setUsername(String username) {
		userName = username;
	}

	public String getPassword() {
		return passWord;
	}

	public void setPassword(String password) {
		passWord = password;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	@Override
	public String toString() {
		return "Users [userName= " + userName + ", passWord= " + passWord + ", Role= " + Role + "]";
	}

	
	

}
