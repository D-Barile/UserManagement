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
 * Servlet implementation class AddUserServlet
 */
@WebServlet("/aggiungi-utente")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UserDao dao = new UserDao();
       
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User user = new User();
		
		user.setNome(req.getParameter("nome"));
		user.setUsername(req.getParameter("username"));
		user.setEmail(req.getParameter("email"));
		
		dao.saveUser(user);
		
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}

}
