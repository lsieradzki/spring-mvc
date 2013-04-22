package servlets;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

@WebServlet("/hello")
public class TestServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		HttpSession session = req.getSession();
		
		ClassPathXmlApplicationContext ctx;
		
		try {
			Context initContext = new InitialContext();
            DataSource ds = (DataSource) initContext.lookup("java:/comp/env/jdbc/h2");

            System.out.println(ds);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
