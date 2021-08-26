<%@page import="java.util.ArrayList"%>
<%@page import="com.shaymee.s1.bankbook.BankbookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- tag명을 c라고 하겠다 -->
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><b>Bankbook List Page BY JSTL</b></h1>
	
	<table>
		<tr>
			<th>일련번호</th><th>제품명</th><th>이자율</th><th>Status</th>
		</tr>

		<c:forEach items="${dtos}" var="dto" varStatus="i">
			<tr>
				<td>${pageScope.dto.bookNumber}</td>
				<td><a href="./bankbookSelect.do?booknumber=${dto.bookNumber}">${pageScope.dto.bookName}</td>
				<td>${pageScope.dto.bookRate}</td>
				<td>
					<p>현재 아이템(dto) : ${i.current}</p>
					<p>인덱스 번호      : ${i.index}</p>
					<p>순서 번호        : ${i.count}</p>
					<p>반복횟수가 첫번째? : ${i.first}</p>
					<p>반복의 마지막?    : ${i.last }</p>
				</td>
			</tr>
		
		</c:forEach>
	
	</table>

	<div>
		<c:forEach begin="1" end="10" step="1" var="num" varStatus="i">
			<button>${num} : ${i.begin} : ${i.end} : ${i.step}</button>
		</c:forEach>
	</div>


	<a href="./bankbookInsert.do">WRITE</a>
	
</body>
</html>