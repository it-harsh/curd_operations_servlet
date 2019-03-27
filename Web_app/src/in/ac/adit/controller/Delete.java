package in.ac.adit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.ac.adit.dao.UserDAOImpl;
import in.ac.adit.model.User;

/**
 * Servlet implementation class Delete
 */
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
		String uname;
		String pass;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();

		 uname = req.getParameter("uname");
		 pass = req.getParameter("pass");
		 RequestDispatcher rd = null;
		 
		 User user = new User();
		 user.setUname(uname);
		 user.setPass(pass);
		 UserDAOImpl userDAOImpl = new UserDAOImpl();
		 
		 if (userDAOImpl.isAuthenticate(user)){
			 String temp = user.getUname();
			 userDAOImpl.deleteuser(temp);
			 req.setAttribute("msg", "The user is successfully deleted");
			 rd = req.getRequestDispatcher("index.jsp");
			 rd.forward(req, res);
		 }else{
			 req.setAttribute("msg", "Enter correct username and password to delete the user.");
			 rd = req.getRequestDispatcher("index.jsp");
			 rd.forward(req, res);
			
		 }
		 
	}

}
