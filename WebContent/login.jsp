<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="Verify" method="get">
   <table>
   
   <tr>
           <td>
               <b>User Name</b>
           </td>
           <td>
              <input type="text" name="txtUname1"/>
           </td>
        </tr>
        <tr>
           <td>
               <b>Password</b>
           </td>
           <td>
              <input type="password" name="txtPassword1"/>
           </td>
        </tr>
        <tr colspan="2">
           <td>
               <input type="submit" name="btnLogin" onclick="login()" value="Login"/>
           </td>
        </tr>
    </table>
</form>


</body>
</html>