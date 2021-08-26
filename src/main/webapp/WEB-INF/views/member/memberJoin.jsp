<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>MemberJoin 회원가입 Page</h1>
	
	<form action="./memberJoin.do" method="post"> <!-- action : 요청받아주는 주소 -->
		ID : <input type="text" name="id"><br>
		PW : <input type="text" name="pw"><br>
		NAME : <input type="text" name="name"><br>
		PHONE : <input type="tel" name="phone"><br>
		Email :	<input type="email" name="email">
		<button type="submit">JOIN</button>
		
	</form> 
	
	
</body>
</html>