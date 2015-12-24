<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>郵便番号検索画面</title>
</head>
<body>
	<form action="/zip/search" method="get">
		<label>郵便番号</label> <input type="text" name="zipcode"> <br>
		<button id="zipsearch">検索</button>
		<div id="result"></div>
	</form>
</body>
</html>