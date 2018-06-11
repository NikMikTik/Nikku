<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String option=(String)request.getParameter("User");
System.out.println("user is"+option);
if(option.equals("Author"))
{	System.out.println("Author entered");
response.sendRedirect("AuthorLogin");}

else
	System.out.println("Reader Entered ");
if(option.equals("Reader"))
{	System.out.println("Reader entered");
response.sendRedirect("ShowBlog");}
%>
</body>
</html>