package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Update
 */
@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fn = request.getParameter("txtFn1");
		String ln = request.getParameter("txtLn1");
		String add = request.getParameter("txtAdd1");
		String city2 = request.getParameter("txtCity1");
		
		response.setContentType("text/html"); // HTML	
		PrintWriter out = response.getWriter(); //OUT
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
			   		        fn+
			   		    "</td>"+
			   		"</tr>"+
			   		"<tr>"+
				   		"<td>"+
				   			"<b>Last Name</b>"+
				   		"</td>"+
				   		"<td>"+
		   		              ln+
		   		        "</td>"+
		   		         
		   		    "</tr>"+
		   		     "<tr>"+		   		        
				   		"<td>"+
				   			"<b>Address</b>"+
				   		"</td>"+
				   		"<td>"+
		   		             add+
		   		         "</td>"+
		   		   "</tr>"+
		   		    "<tr>"+				   		
				   		"<td>"+
				   			"<b>City</b>"+
				   		"</td>"+
				   		"<td>"+
		   		              city2+
		   		        "</td>"+
				   "</tr>"+
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
