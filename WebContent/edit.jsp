<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>


<c:forEach items="${sessionScope.list}" var="i">

<form action="updateContoller" method="post">
<table>

   <tr>
   
     <td>
        <b>First Name</b>
     </td>
     <td>
     
        <input type="text" name="txtFname" value="${i.fn}" />
     </td>

   </tr>
   <tr>
     <td>
        <b>Last Name</b>
     </td>
     <td>
        <input type="text" name="txtLname" value="${i.ln}"/>
        
        <input type="hidden" name="id" value="${i.id}"/>
     </td>
   </tr>
   <tr>
      <td colspan="2">
         <input type="submit" name="btnUpdate" value="UPDATE"/>
      </td>
   </tr>

</table>
</form>

</c:forEach>
</body>
</html>