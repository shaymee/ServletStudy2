<%@page import="java.util.ArrayList"%>
<%@page import="com.shaymee.s1.bankbook.BankbookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><b>Bankbook List Page</b></h1>
	
	<table>
		<tr>
			<th>일련번호</th><th>제품명</th><th>이자율</th>
		</tr>
	<%
		Object obj2 = request.getAttribute("dtos");
		ArrayList<BankbookDTO> ar = (ArrayList<BankbookDTO>)obj2;
		for(BankbookDTO dto: ar){
	%>	
		<tr>
			<td><%=dto.getBookNumber() %></td>
			<td><a href="./bankbookSelect.do?booknumber=<%=dto.getBookNumber()%>"><%= dto.getBookName() %></a></td>
			<td><%=dto.getBookRate() %></td>		
		</tr>
	

		<h2>BookNumber : <%= dto.getBookNumber() %></h2>
		<%=request.getParameter("booknumber") %>
		
		<h2><a href="./bankbookSelect.do?booknumber=<%=dto.getBookNumber()%>"><%= dto.getBookName() %></a></h2>
		<h2>Rate : <%= dto.getBookRate() %></h2>
		<h2>=============================</h2>	
	<%}%>		
	</table>

	<a href="./bankbookInsert.do">WRITE</a>
	
</body>
</html>