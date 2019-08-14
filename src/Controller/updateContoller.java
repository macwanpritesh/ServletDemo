package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.jmx.snmp.internal.SnmpSecuritySubSystem;

import DAO.RegDAO;
import VO.RegVO;

/**
 * Servlet implementation class updateContoller
 */
@WebServlet("/updateContoller")
public class updateContoller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateContoller() {
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
		
		String fname = request.getParameter("txtFname");
		String lname = request.getParameter("txtLname");
		
		v.setFn(fname);
		v.setLn(lname);
		
		
		RegDAO d = new RegDAO();
		
		List ls = d.update(v);
		List ls1 = d.search();
		
		HttpSession session = request.getSession();
		session.setAttribute("list",ls1);
		
		response.sendRedirect("search.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
