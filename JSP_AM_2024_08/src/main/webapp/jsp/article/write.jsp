<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
Map<String, Object> articleRow = (Map<String, Object>) request.getAttribute("articleRow");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 작성</title>
</head>
<body>
	
	<a href="../home/main"> 메인 페이지로 가기</a>
	<a href="list">리스트로 돌아가기</a>
	
	<h2>글쓰기</h2>
	
	<form method="POST" action="doWrite">
		<div>
			제목 : <input type="text" placeholder="제목을 입력해주세요" name="title"/>
		</div>
		<div>
			내용 : <textarea type = "text" placeholder="내용을 입력해주세요" name="body"></textarea>
		</div>
		<button type="submit">작성</button>
	</form>
	
	
</body>
</html>