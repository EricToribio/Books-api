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
	<div class='mx-auto mt-3 '>
		<div class='mx-auto col-3'>
			<h1 class='text-info'>All Books</h1>
			<div class='mx-auto  border border-5 border-info '>
				<table class="table table-striped">
					<thead>
						<tr>
							<th>Title</th>
							<th>Description</th>
							<th>Language</th>
							<th>Number of pages</th>
							<th>Actions</th>
						</tr>
					</thead>

					<tbody>
						<c:forEach var="book" items="${books}">
							<tr>
								<td><c:out value="${book.title}"></c:out></td>
								<td><c:out value="${book.description}"></c:out></td>
								<td><c:out value="${book.language}"></c:out></td>
								<td><c:out value="${book.numberOfPages}"></c:out></td>
								<td><a href="/book/${book.id }">View Book</a></td>
							</tr>
						</c:forEach>
					</tbody>

				</table>
			</div>
		</div>
	</div>
</body>
</html>