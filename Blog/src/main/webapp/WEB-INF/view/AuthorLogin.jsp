<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
        <div>
            <h1></h1>
          <center>  <h2>Welcome..!</h2></center>
            <%  if( request.getParameter("check")!=null && request.getParameter("check").equals("true")){
			out.println("<center><h2>Congratulations... You are now a Registered Author...! <br><br>You can now sign in...</h2></center>");	
		}%>
      <center>    <form action="Validation" >
       <input name="username" id="text1" type="text" placeholder="Username" required><br><br>
       <input name="password" id="password" type="Password" placeholder="Password" required><br><br>
       <input id="saveForm" name="saveForm" type="submit" value="sign in" /><br>
       
       <br><br>
       If you have not Registered yet, <a href="RegisterAuthor" >Register</a> Here
          </form></center>
        </div>
    </div>
</body>
</html>