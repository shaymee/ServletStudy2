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
	<% 
		//session	
		//application
		//page
		//pageContext-모든 정보를 여기서 다 꺼낼 수 있지만 굳이 여기서 꺼낼 필욘 없음.
		
		String num = request.getParameter("booknumber");
		Object obj = request.getAttribute("dto"); // bankbookcontroller에서 설정한 이름 "dto
		BankbookDTO bankbookDTO = (BankbookDTO)obj;  // 다형성: 부모타입을-->자식타입으로
		
	%>
		
	<h3>BookNum : <%= num%></h3>
	<h3>Name : <%= bankbookDTO.getBookName() %></h3>
	<h3>이자율 : <%= bankbookDTO.getBookRate() %></h3>
	<h3>판매여부 : <%= bankbookDTO.getBookSale() %></h3>
	
</body>
</html>