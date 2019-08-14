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
 * Servlet implementation class Edit
 */
@WebServlet("/Edit")
public class Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Edit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(); //Session
		
		
		String firstname = (String)session.getAttribute("a");
		String lastname = (String)session.getAttribute("b");
		String address = (String)session.getAttribute("c");
		String city1 = (String)session.getAttribute("d");
		
		response.setContentType("text/html"); // HTML	
		PrintWriter out = response.getWriter(); //OUT
		out.println(
				
				"<html>"+
				"<head>"+
				"</head>"+
				"<body>"+
				"<form action='Update' method='get'>"+
				"<table border='2'>"+
				   "<tr>"+
				   		"<td>"+
				   		    "<b>First Name</b>"+
				   		"</td>"+
				   		"<td>"+
			   		        "<input type='text' value="+firstname+" name='txtFn1'/>"+
			   		    "</td>"+
			   		"</tr>"+
			   		"<tr>"+
				   		"<td>"+
				   			"<b>Last Name</b>"+
				   		"</td>"+
				   		"<td>"+
				   		"<input type='text' value="+lastname+" name='txtLn1'/>"+
		   		        "</td>"+
		   		         
		   		    "</tr>"+
		   		     "<tr>"+		   		        
				   		"<td>"+
				   			"<b>Address</b>"+
				   		"</td>"+
				   		"<td>"+
				   		      "<input type='text' value="+address+" name='txtAdd1'/>"+
		   		         "</td>"+
		   		   "</tr>"+
		   		    "<tr>"+				   		
				   		"<td>"+
				   			"<b>City</b>"+
				   		"</td>"+
				   		"<td>"+
				   		       "<input type='text' value="+city1+" name='txtCity1'/>"+
		   		        "</td>"+
				   "</tr>"+
		   		   "<tr>"+
				       "<td colspan='2'>"+
		   		            "<input type='Submit' name='btnUpdate' value='Update'>"+
		   		       "</td>"+
		   		   "</tr>"+
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

	}

}
