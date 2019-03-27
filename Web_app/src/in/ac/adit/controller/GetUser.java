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

public class GetUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	String uname;
	String pass;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		PrintWriter out = res.getWriter();
		uname = req.getParameter("uname");
		RequestDispatcher rd = null;

		UserDAOImpl userDAOImpl = new UserDAOImpl();
		User user = new User();
		user = userDAOImpl.getuser(uname);

		if(userDAOImpl.finduser(user)){
		req.setAttribute("msg", "    Username : "+user.getUname()+"    Password : "+user.getPass());
		rd = req.getRequestDispatcher("getuser.jsp");
		rd.forward(req,res);
		}
		else{
			req.setAttribute("msg","The username doesn't exist !!!");
			rd = req.getRequestDispatcher("getuser.jsp");
			rd.forward(req,res);
		}
	}

}
