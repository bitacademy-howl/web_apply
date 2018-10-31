<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="head.jsp"/>
<div id="index-content">
	<h1>UserList</h1>
	<table id="user_list_table">
		<tr id="user_list_table_head">
			<th>아이디</th>
			<th>패스워드</th>
			<th>이름</th>
			<th>이메일</th>
			<th>성별</th>
			<th>나이</th>
		</tr>
		<c:forEach var="user" items="${user_List}" varStatus="status">
			<tr id="user_list_table_body">
				<td><b>${status.index + 1}</b></td>
				<td>${user.id}</td>
				<td>${user.pw}</td>
				<td>${user.name}</td>
				<td>${user.eMail}</td>
				<td>${user.gender}</td>
				<td>${user.age}</td>
			</tr>
		</c:forEach>
	</table>
</div>
<jsp:include page="tail.jsp"/>