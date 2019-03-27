package in.ac.adit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.ac.adit.dao.UserDAOImpl;
import in.ac.adit.model.User;

/**
 * Servlet implementation class Signup
 */
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	String uname;
	String pass;
	
@Override
protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	PrintWriter out = res.getWriter();

	 uname = req.getParameter("suname");
	 pass = req.getParameter("spass");
	 RequestDispatcher rd = null;
	 
	 User user = new User();
	 user.setUname(uname);
	 user.setPass(pass);
	 UserDAOImpl userDAOImpl = new UserDAOImpl();
	 if (userDAOImpl.finduser(user)){
		 req.setAttribute("msg", "The username has already been taken");
		 rd = req.getRequestDispatcher("index.jsp");
		 rd.forward(req, res);
	 }else{
		 userDAOImpl.createuser(user);
		 req.setAttribute("msg", "Your account has been successfully created");
		 rd = req.getRequestDispatcher("index.jsp");
		 rd.forward(req, res);
		
	 }
	 
	
}

}
