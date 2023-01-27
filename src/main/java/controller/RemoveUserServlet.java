package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;

/**
 * Servlet implementation class RemoveUserServlet
 */
@WebServlet("/rimuovi")
public class RemoveUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private UserDao dao = new UserDao();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		dao.deleteUser(Integer.parseInt(req.getParameter("id")));
		resp.sendRedirect("home");
	}
	
}
