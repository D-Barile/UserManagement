package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import model.User;

/**
 * Servlet implementation class UpdateUserServlet
 */
@WebServlet("/aggiorna")
public class UpdateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UserDao dao = new UserDao();
       
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User user = dao.getUserById(Integer.parseInt(req.getParameter("id")));
		req.setAttribute("user", user);
		req.getRequestDispatcher("update-user.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User u = new User();
		u.setId(Integer.parseInt(req.getParameter("id")));
		u.setNome(req.getParameter("nome"));
		u.setUsername(req.getParameter("username"));
		u.setEmail(req.getParameter("email"));
		
		dao.updateUser(u);
		
		resp.sendRedirect("home");
	}
	
}
