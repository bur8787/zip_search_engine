<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>郵便番号検索画面</title>
</head>
<body>
	<form action="/zip/search" method="get">
		<label>郵便番号</label> <input type="text" name="zipcode" value="<%= request.getParameter("zipcode") %>"> <br>
		<button id="zipsearch">検索</button>
	</form>
	<table>
		<thead>
			<tr>
				<th>郵便番号</th>
				<th>都道府県</th>
				<th>市区町村</th>
				<th>町域</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="zip" items="${zipList.zipList}">
			<tr>
				<td><c:out value="${zip.zipCode}"></c:out></td>
				<td><c:out value="${zip.prefectureName}"></c:out></td>
				<td><c:out value="${zip.cityName}"></c:out></td>
				<td><c:out value="${zip.addressName}"></c:out></td>
			</tr>
			</c:forEach>
		</tbody>
		<tfoot>
		</tfoot>
	</table>
</body>
</html>