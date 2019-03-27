package in.ac.adit.dao;

import java.util.ArrayList;
import java.sql.*;
import in.ac.adit.model.User;

public class UserDAOImpl implements UserDAO {

	private Connection con = null;
	private PreparedStatement st = null;
	private ResultSet rs = null;
	//private String query = null;

	public UserDAOImpl() {
		try {
			Class.forName(DRIVERNAME);
			con =  DriverManager.getConnection(CONSTRING, USER, PASSWORD);
		} catch (Exception e) {
			System.out.println("Exception caught while making connection!!");
		}
	}

	public boolean isAuthenticate(User user) {
		try {
			st = con.prepareStatement("select * from user_tb where uname =? and pass =?");

			st.setString(1, user.getUname());
			st.setString(2, user.getPass());
			rs = st.executeQuery();
			while (rs.next()) {
				System.out.println("isAuthenticate is success.");
				return true;
			}
		} catch (Exception e) {
			System.out.println("Exception in isAuthenticate");
			//e.printStackTrace();
			return false;

		}
		return false;

	}

	public boolean deleteuser(String uname) {

		try {
			st = con.prepareStatement("delete from user_tb where uname =?");
			st.setString(1, uname);
			return st.execute();		
		} catch (SQLException e) {
			System.out.println("Error in delete");
			//e.printStackTrace();
		}
		return false;

	}

	public User getuser(String uname) {
		User user = new User();
		try {
			st = con.prepareStatement("select * from user_tb where uname =?");
			st.setString(1, uname);
			rs = st.executeQuery();
			while (rs.next()) {
				user.setUname(rs.getString("uname"));
				user.setPass(rs.getString("pass"));
			}
		} catch (SQLException e) {
			System.out.println("Excetion in getuser");
			//e.printStackTrace();
			return null;
		}
		System.out.println("getuser success!!");
		return user;
	}

	public ArrayList<User> getalluser() {
		ArrayList<User> l = new ArrayList<User>();
		User user = new User();
		try {
			st = con.prepareStatement("select * from user_tb");
			rs = st.executeQuery();

			while (rs.next()) {
				user.setUname(rs.getString("uname"));
				user.setPass(rs.getString("pass"));
				l.add(user);
			}
		} catch (SQLException e) {
			System.out.println("SQLException caught");
			//e.printStackTrace();
			return null;
		}
		System.out.println("getalluser successful");
		return l;
	}

	public boolean createuser(User user) {

		try {
			st = con.prepareStatement("insert into user_tb values(?,?)");
			
			st.setString(1, user.getUname());
			st.setString(2, user.getPass());
			
			st.execute();
			
		} catch (SQLException e) {
			System.out.println("Exception in createuser");
		    //e.printStackTrace();
		    return false;
		}
		
		System.out.println("createuser succesful!!");
		return true;
	}

	public boolean updateuser(User user, String uname) {
		try {
			st = con.prepareStatement("update user_tb set uname=?,pass=? where uname=?");

			st.setString(1, user.getUname());
			st.setString(2, user.getPass());
			st.setString(3, uname);
			st.executeQuery();
			System.out.println("updateuser successful");
			return true;

		} catch (SQLException e) {
			System.out.println("Exception in updateuser");
			//e.printStackTrace();
			return false;
		}
	}

	public boolean finduser(User user) {
		try {
			st = con.prepareStatement("select * from user_tb where uname =?");
			st.setString(1, user.getUname());
			rs = st.executeQuery();
			while (rs.next()) {
				System.out.println("findeuser success");
				return true;
			}
		} catch (Exception e) {
			System.out.println("Exception in finduser");
			//e.printStackTrace();
			return false;

		}
		return false;

	}

}
