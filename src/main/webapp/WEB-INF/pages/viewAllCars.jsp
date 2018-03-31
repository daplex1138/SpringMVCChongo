<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All Cars</title>
<style>
	th, td {
		min-width: 150px;
	}
	
	.center{
		text-align: center;
	}
	
	.right{
		text-align: right;
	}
</style>
</head>
<body>
	<table border="1">
		<tr>
			<th>Make</th>
			<th>Model</th>
			<th>Year</th>
			<th>Miles</th>
		</tr>
		<c:forEach items="${all}" var="item">
			<tr>
				<td>${item.make}</td>
				<td>${item.model}</td>
				<td class="center">${item.yearMade}</td>
				<td class="right">${item.miles}</td>
			</tr>
		</c:forEach>
	</table>
	<a href="form.mvc">Add a new car</a>
</body>
</html>