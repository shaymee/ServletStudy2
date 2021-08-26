<%@page import="java.util.ArrayList"%>
<%@ page import="com.shaymee.s1.bankbook.BankbookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>  <!-- 순서: back-end코드 먼저, front-end 후에 -->
	<h1><b>Bankbook Select Page</b></h1>
		
	<h3>BookNum : ${requestScope.dto.bookNumber}</h3> <!-- 마지막엔 멤버변수명 -->
	<h3>Name : ${dto.bookName}</h3> <!-- requestScope는 생략 가능 -->
	<h3>이자율 : ${requestScope.dto.bookRate}</h3>
	<h3>판매여부 : ${requestScope.dto.bookSale}</h3>
	
	<h3>Count : ${requestScope.count}</h3>
	<h3>연옌이름 : ${requestScope.name}</h3>
	<h3>SE : ${sessionScope.se}</h3>
	<h3>SE : ${se}</h3>  <!-- scope명은 생략가능 --> <!-- scope명이 다른데 속성명이 같을 땐 생명주기 짧은 녀석 먼저 -->
	
</body>
</html>