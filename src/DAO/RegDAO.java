package DAO;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import VO.RegVO;
import java.sql.Statement;
import java.util.ArrayList;

public class RegDAO {

	       
	 public void insert(RegVO v1){
	 	
	    try{
	 
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ndb","root","root");
				Statement st = con.createStatement();
				st.executeUpdate("insert into tbl_new(First_name,Last_name) values('"+v1.getFn() +"','"+v1.getLn() +"')");	
	    }
	    
	    catch(Exception e){
	    	
	    }
				
	 }
	 
	 public List search(){
		 
		 List ls = new ArrayList();
		 
		 	try{
		    Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ndb","root","root");
			Statement st = con.createStatement();
		    ResultSet rs = st.executeQuery("select * from tbl_new");
		    
		    while(rs.next()){
		    	
		    	int id = rs.getInt("Id");
		    	String fn = rs.getString("First_name");
		    	String ln = rs.getString("Last_name");
		    	
		    	RegVO v = new RegVO();
		    	v.setFn(fn);
		    	v.setLn(ln);
		    	v.setId(id);
		    	
		    	ls.add(v);
		    }
		 	}
		 	catch(Exception e){
		 		
		 		
		 	}
		    return ls;
	 }
	 
	 public List delete(RegVO v1){
		List ls = new ArrayList();		 
		   try{			
		            Class.forName("com.mysql.jdbc.Driver");
					
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ndb","root","root");
					
					Statement st = con.createStatement();
									
					ResultSet rs = st.executeQuery("select * from tbl_new");
								
					while(rs.next()){
						
				    	st.executeUpdate("delete from tbl_new where Id = " + v1.getId());
     				}
												
		   }
			catch(Exception e){
						
			}
		 
		return ls;
			
	 }
	    
	 public List edit(RegVO v1){
		 
		 List ls = new ArrayList();
		 
		 try{ 
		 
			    Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ndb","root","root");
				Statement st = con.createStatement();
			    ResultSet rs = st.executeQuery("select * from tbl_new where Id="+v1.getId());
			    while(rs.next()){
			    	
			    	String fn = rs.getString("First_name");
			    	String ln = rs.getString("Last_name");
			 

				  	RegVO v = new RegVO();
					v.setFn(fn);
			    	v.setLn(ln);
			    	v.setId(v1.getId());
			    	
			    	ls.add(v);
			    }
			 		 
		 }
		 
		 catch(Exception e){
			 		e.printStackTrace();	 
		 }
		 
		 return ls;
	 }
	 
	 public List update(RegVO v1){
		 
		  List ls = new ArrayList();
		  
		  try{
			  
			  Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ndb","root","root");
				Statement st = con.createStatement();
				
				st.executeUpdate("update tbl_new set First_name = '"+v1.getFn()+"',Last_name = '"+v1.getLn()+"' where id = '"+v1.getId()+"' ");
			  
		  }
		 catch(Exception e){
			 
			 
			 
		 }
		 return ls;
	 }
	
	
}

