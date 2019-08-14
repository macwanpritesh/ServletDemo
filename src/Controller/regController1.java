package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import DAO.reg1DAO;
import VO.reg1VO;

/**
 * Servlet implementation class regController1
 */
@WebServlet("/regController1")
public class regController1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public regController1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//String action = request.getParameter("btnAction");
		
		String f = request.getParameter("flag");
		
		if(f.equals("delete")){
			
			
			String id = request.getParameter("id"); 
			
			reg1VO v = new reg1VO();
			v.setId(Integer.parseInt(id));
			
			
			reg1DAO d = new reg1DAO();
			
			 d.delete(v);
			
			 List ls = d.search();
			 
			HttpSession session = request.getSession();
			session.setAttribute("list",ls);
					
			response.sendRedirect("search1.jsp");
			
			
		}
		
	 if (f.equals("edit")){
			
			
			String id = request.getParameter("id");
			
			reg1VO v = new reg1VO();
			v.setId(Integer.parseInt(id));
		
			
			reg1DAO d = new reg1DAO();
			
			List ls = d.edit(v);
			
			System.out.println("List Size :: "+ls.size());
			
			HttpSession session = request.getSession();
			session.setAttribute("list",ls);
			
			response.sendRedirect("edit1.jsp");
			
			
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String f = request.getParameter("flag");
		
		if(f.equals("insert")){
		
		String fn = request.getParameter("txtFname");
		String ln = request.getParameter("txtLname");
	
		int id;
			
			reg1VO v = new reg1VO();
			
		
			v.setFn(fn);
			v.setLn(ln);
			
			
			reg1DAO d = new reg1DAO();
			d.insert(v);
				
			
			List ls = d.search();
			
			HttpSession session = request.getSession();
			session.setAttribute("list",ls);
			
			response.sendRedirect("search1.jsp");
		}
		
		if(f.equals("update")){
			
			
			String id = request.getParameter("id");
			
			reg1VO v = new reg1VO();
			v.setId(Integer.parseInt(id));
			
			String fname = request.getParameter("txtFname");
			String lname = request.getParameter("txtLname");
			
			v.setFn(fname);
			v.setLn(lname);
			
			
			reg1DAO d = new reg1DAO();
			
			List ls = d.update(v);
			List ls1 = d.search();
			
			HttpSession session = request.getSession();
			session.setAttribute("list",ls1);
			
			response.sendRedirect("search1.jsp");
			
			
		}
		
	}

}
