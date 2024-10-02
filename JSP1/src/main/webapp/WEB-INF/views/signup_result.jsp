<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 결과</title>
</head>
	<body>
		<h1>회원 가입 결과 페이지 입니다</h1>
	
		<h3> 입력되어 전달된 값들</h3>
		
		<ul>
			<li>ID : <%= request.getParameter("inputId") %></li>
			<li>PW : <%= request.getParameter("inputPw") %></li>
			<li>확인 : <%= request.getParameter("checkPw") %></li>
			<li>이름 : <%= request.getParameter("inputName") %></li>
			<li>나이 : <%= request.getParameter("inputAge") %></li>
		</ul>
		
		<% if(request.getParameter("inputPw").equals(request.getParameter("checkPw"))) { %>
			<h2 style="color: green;" >비밀번호 일치</h2>
		
		
		<% } else { %>
			<h2 style="color: red;" >비밀번호 불일치</h2>
		
		<% } %>
		
		
		<%-- 
		
		JSTL c:if문 사용시 
		<c:if test="${param.inputPw == param.checkPw}">
			<h2 style="color: green;" >비밀번호 일치</h2>
			
		<c:if test="${param.inputPw != param.checkPw}">
			<h2 style="color: red; > 비밀번호 불일치>
		
		 --%>
		
		
		
		
		
		
		
		
		
	</body>
</html>