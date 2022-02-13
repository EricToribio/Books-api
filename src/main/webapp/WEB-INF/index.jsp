<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css" />
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="p-4">
	<h1>
	Title :
	<c:out value="${book.title}"/>
	</h1>
	<p>
	Description:
	<c:out value="${book.description}"/>
	</p>
	<p>
	Language:
	<c:out value="${book.language}"/>
	</p>
	<p>
	Number of Pages:
	<c:out value="${book.numberOfPages}"/>
	</p>
</div>
</body>
</html>