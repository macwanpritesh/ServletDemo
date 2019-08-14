package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.*;
/**
 * Servlet implementation class Information3
 */
@WebServlet("/Information3")
public class Information3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Information3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        HttpSession session = request.getSession(); 
		
		
		String firstname = (String)session.getAttribute("a");
		String lastname = (String)session.getAttribute("b");
		String address = (String)session.getAttribute("c");
		String city1 = (String)session.getAttribute("d");
		
		response.setContentType("text/html"); 	
		PrintWriter out = response.getWriter();
		out.println(
				
				"<html>"+
				"<head>"+
				"</head>"+
				"<body>"+
				"<form action='Information3' method='post'>"+
				"<table border='2'>"+
				   "<tr>"+
				   		"<td>"+
				   		    "<b>First Name</b>"+
				   		"</td>"+
				   		"<td>"+
			   		        "<input type='text' value="+firstname+" name='txtFname'/>"+
			   		    "</td>"+
			   		"</tr>"+
			   		"<tr>"+
				   		"<td>"+
				   			"<b>Last Name</b>"+
				   		"</td>"+
				   		"<td>"+
				   		"<input type='text' value="+lastname+" name='txtLname'/>"+
		   		        "</td>"+
		   		         
		   		    "</tr>"+
		   		     "<tr>"+		   		        
				   		"<td>"+
				   			"<b>Address</b>"+
				   		"</td>"+
				   		"<td>"+
				   		      "<input type='text' value="+address+" name='txtAdd'/>"+
		   		         "</td>"+
		   		   "</tr>"+
		   		    "<tr>"+				   		
				   		"<td>"+
				   			"<b>City</b>"+
				   		"</td>"+
				   		"<td>"+
				   		       "<input type='text' value="+city1+" name='txtCity'/>"+
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
HttpSession session = request.getSession(); 
		
		response.setContentType("text/html"); 	
		
		PrintWriter out = response.getWriter();
		
		
		
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
				"<form action='Information3' method='get'>"+
				"<table border='2'>"+
				   "<tr>"+
				   		"<td>"+
				   		    "<b>First Name</b>"+
				   		"</td>"+
				   		"<td>"+
			   		        firstname+
			   		    "</td>"+
			   		"</tr>"+
			   		"<tr>"+
				   		"<td>"+
				   			"<b>Last Name</b>"+
				   		"</td>"+
				   		"<td>"+
		   		              lastname+
		   		        "</td>"+
		   		         
		   		    "</tr>"+
		   		     "<tr>"+		   		        
				   		"<td>"+
				   			"<b>Address</b>"+
				   		"</td>"+
				   		"<td>"+
		   		             address+
		   		         "</td>"+
		   		   "</tr>"+
		   		    "<tr>"+				   		
				   		"<td>"+
				   			"<b>City</b>"+
				   		"</td>"+
				   		"<td>"+
		   		              city1+
		   		        "</td>"+
				   "</tr>"+
		   		   "<tr>"+
				       "<td colspan='2'>"+
		   		            "<input type='Submit' name='btnEdit' value='Edit'>"+
		   		       "</td>"+
		   		   "</tr>"+
				"</table>"+
		   		"</form>"+
				"</body>"+
				"</html>"
				
				
				
				);
	}

}
