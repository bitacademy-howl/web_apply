<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<% ArrayList list = (ArrayList)request.getAttribute("list"); %>

</head>
<body>

	<DIV>
	<c:forEach items="${list}" var="mvo">
		<ul class="Music_List">
		    <li>${mvo.musicID}</li>
		    <li>${mvo.musicTitle}</li>
		</ul>
	</c:forEach>
	</DIV>

</body>
</html>