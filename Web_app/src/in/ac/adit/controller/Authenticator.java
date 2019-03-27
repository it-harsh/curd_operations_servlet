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

public class Authenticator extends HttpServlet {

	private static final long serialVersionUID = 1L;

	String uname;
	String pass;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		RequestDispatcher rd1 = null;
		PrintWriter out = res.getWriter();
		uname = req.getParameter("uname");
		pass = req.getParameter("pass");
		User user = new User();
		user.setUname(uname);
		user.setPass(pass);
		UserDAOImpl userDAOImpl = new UserDAOImpl();

		if (uname == "" || pass == "") {
			req.setAttribute("msg", "Blank spaces aren't allowed");
			rd1 = req.getRequestDispatcher("index.jsp");
			rd1.forward(req, res);
		} else {
			if (userDAOImpl.isAuthenticate(user)) {
				req.setAttribute("msg", "Welcome to Nova's Fortunes, Mr. "+user.getUname());
				rd1 = req.getRequestDispatcher("index.jsp");
				rd1.forward(req, res);
			} else {
				req.setAttribute("msg", "Please enter correct username and password");
				rd1 = req.getRequestDispatcher("index.jsp");
				rd1.forward(req, res);
			}
		}

	}
}
