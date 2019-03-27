package in.ac.adit.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.ac.adit.dao.UserDAOImpl;
import in.ac.adit.model.User;

public class getalluser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	RequestDispatcher rd = null;

	UserDAOImpl userDAOImpl = new UserDAOImpl();
	List<User> l = new ArrayList<User>();
	
	
	
		
	
}
