package in.ac.adit.dao;

import java.util.List;

import in.ac.adit.model.User;

public interface UserDAO {

	final String DRIVERNAME = "com.mysql.jdbc.Driver";
	final String USER = "root";
	final String PASSWORD = "";
	final String DATABASENAME = "db";
	final String CONSTRING = "jdbc:mysql://localhost:3306/user_db";

	public boolean isAuthenticate(User user);
	public boolean deleteuser(String uname);
	public User getuser(String uname);
	public List<User> getalluser();
	public boolean createuser(User user);
	public boolean updateuser(User user,String uname);
	public boolean finduser(User user);
}
