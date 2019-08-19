package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Models.Users;

public class UsersDaoImpl implements UsersDao {

	private static String url = "jdbc:oracle:thin:@lukedb.cjhjtyllvpw0.us-east-2.rds.amazonaws.com:1521:ORCL";
	private static String username = "Lucnel954";
	private static String password = "Pompano954";
	
	
	@Override
	public Users getUsersByUsername(String userName) {
			Users user = new Users();
		
			try(Connection conn = DriverManager.getConnection(url, username, password)){
				
				PreparedStatement ps = conn.prepareStatement("SELECT * FROM USERS WHERE USERNAME = ?");
				
				ps.setString(1, userName);
				ResultSet rs = ps.executeQuery();
			
				while(rs.next()) {
					user = new Users(rs.getString(1), rs.getString(2), rs.getString(3));
					
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return user;
	}
				
			
	@Override
	public List<Users> getUsersByRole(String Role) {
		List<Users> getUsersByRole = new ArrayList<>();
				
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM USERS WHERE ROLE = ?");
			
			ps.setString(1, Role);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				getUsersByRole.add(new Users(rs.getString(1), rs.getString(2),rs.getString(3)));
				
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return getUsersByRole;
			}
		
		

	public List<Users> getAllUsers() {
		List<Users> getAllUsers = new ArrayList<>();
		
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM USERS");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				getAllUsers.add(new Users(rs.getString(1), rs.getString(2),rs.getString(3)));
				

				//getAllUsers.add(user);
			}

		} catch (SQLException e) {

		} 

		return getAllUsers;
	}
	
	
	
}
	
	
