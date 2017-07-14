<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Car Home</title>
</head>
<body>
<!-- hello1 -->
<%--hey2 --%>
	<table>
		<tr>
			<form method='get' action='/carDealer/AddCarServlet'>
				<td>click here to add car:
				<td><button>ADD</button>
			</form>
		</tr>
		<tr>
			<form method='get' action='/carDealer/jsp/ViewCar.jsp'>
				<td>click here to view cars:
				<td><button >VIEW</button>
			</form>
		</tr>
	</table>
</body>
</html>