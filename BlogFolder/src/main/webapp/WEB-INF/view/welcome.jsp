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
           <center> <h1></h1>
            <h2>Welcome..!</h2>
             <h3>Want to Enter as a:</h3><br><br>
          <form action="getOption" method="post">
          <input type="radio"  name="User" value="Author"><span>Author</span><br><br>
          <input type="radio"  name="User" value="Reader"><span>Reader</span><br><br>
          <input type="submit" value="Submit" name="submit"> 
          </form></center>
        </div>
    </div>
</body>
</html>