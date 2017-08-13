<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Welcome!</title>
	</head>
	<body>
		<%
			String messages[] = (String[]) request.getAttribute("myWelcomeMessage");
			String welcomeMessage = ""; 
			for(String msg : messages){
				welcomeMessage += msg + " "; 
			}
			out.print(welcomeMessage); 
		%>
		
	</body>
</html>

<!-- JSTL is JavaServerPages Standard Tag Library is a collection of useful JSP Tags -->
<!-- similar to html tags and used in jsp files 
help implement lots of core functionality such as itteration and 
conditional tags for manipulating XML documents -->

<!-- Library indicates that it is a collection of java classes packed into .jar (java archive file) that 
we can download into our project -->

<!-- Groups based on required fuctionality. Start by using <c:out/> for outputting data 
and <c:forEach/> for iterating over collections -->

  
 