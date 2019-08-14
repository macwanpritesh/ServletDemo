package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Information1
 */
@WebServlet("/Information1")
public class Information1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Information1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(); //Session
		response.setContentType("text/html"); // HTML	
		PrintWriter out = response.getWriter(); //OUT
		
//		<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
		
		String fn = request.getParameter("txtFname");
		session.setAttribute("a", fn);
		
		String ln = request.getParameter("txtLname");
		session.setAttribute("b", ln);
		String add = request.getParameter("txtAdd");
		session.setAttribute("c", add);
		String city = request.getParameter("txtCity");
		session.setAttribute("d", city);
		
		String firstname = (String)session.getAttribute("a");
		String lastname = (String)session.getAttribute("b");
		String address = (String)session.getAttribute("c");
		String city1 = (String)session.getAttribute("d");
		
out.println(
				
				"<html>"+
				"<head>"+
				"</head>"+
				"<body>"+
				"<form action='Edit' method='get'>"+
				"<table border='2'>"+
				   "<tr>"+
				   		"<td>"+
				   		    "<b>First Name</b>"+
				   		"</td>"+
				   		"<td>"+
			   			     "<b>Last Name</b>"+
			   		    "</td>"+
			   		    "<td>"+
			   			     "<b>Address</b>"+
			   		    "</td>"+
			   		    "<td>"+
			   			     "<b>City</b>"+
			   		    "</td>"+
			   		 "<td colspan='2'>"+
	   			          "<b>Action</b>"+
	   		         "</td>"+
				   	"</tr>"+
			   		    
				   	"<c:forEach begin='0' end='10' var='i'>"+
				   	
			   		
			   		"<tr>"+
			   				"<td>"+
			   		            firstname+
			   		        "</td>"+
			   		        "<td>"+
  		                         lastname+
  		                    "</td>"+
  		                    "<td>"+
	                              address+
	                        "</td>"+
	                        "<td>"+
	                              city1+
	                        "</td>"+
	                        "<td colspan='2'>"+
                                  "<a href='Edit.java'>Edit</a>"+
                            "</td>"+
//                            "<td>"+
//                                  "<b>123</b>"+
//                            "</td>"+
				   	"</tr>"+
				   		
"</c:forEach>"+
				   	
//		   		   "<tr>"+
//				       "<td colspan='2'>"+
//		   		            "<input type='Submit' name='btnEdit' value='Edit'>"+
//		   		       "</td>"+
//		   		   "</tr>"+
				"</table>"+
		   		"</form>"+
				"</body>"+
				"</html>"
				
				
				
				);
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
