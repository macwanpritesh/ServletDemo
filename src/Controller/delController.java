package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.RegDAO;
import VO.RegVO;

/**
 * Servlet implementation class delController
 */
@WebServlet("/delController")
public class delController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public delController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		String id = request.getParameter("id"); 
		
		RegVO v = new RegVO();
		v.setId(Integer.parseInt(id));
		
		
		RegDAO d = new RegDAO();
		
		 d.delete(v);
		
		 List ls = d.search();
		 
		HttpSession session = request.getSession();
		session.setAttribute("list",ls);
				
		response.sendRedirect("search.jsp");
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter out = response.getWriter();
//		out.println("hello");
		
		
		
		
		
		
	}

}
