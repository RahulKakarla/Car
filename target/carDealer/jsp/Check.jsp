<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="mychk" class="car.kr.entity.Check" scope="session"></jsp:useBean>
<jsp:useBean id="mychk1" class="car.kr.entity.Check" scope="request"></jsp:useBean>
<jsp:setProperty property="*" name="mychk1"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Session:<%=mychk.naem %> </h1>
<h2>Request:<%=mychk1.naem %> </h2>
</body>
</html>