package DAO;

import java.sql.SQLException;
import java.util.List;

import Models.Users;


public interface UsersDao {
	
	public Users getUsersByUsername(String userName);
	public List<Users> getUsersByRole(String Role);
	public List<Users> getAllUsers();

}
