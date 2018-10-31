<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<%@page import="com.flapper.stark.model.MusicVO"%>
<%@page import="com.flapper.stark.back_end.TestBeanC"%>
<%@page import="java.util.ArrayList"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<% TestBeanC testc = (TestBeanC)request.getAttribute("testc"); %>
<% ArrayList<MusicVO> list = (ArrayList<MusicVO>)request.getAttribute("list"); %>

<jsp:include page="head_music.jsp" />

<div id="music-content">
	<div>
		<p>제목</p>
		<ul class="Music_List_Title">
			<li>제목</li>
			<li>가수</li>
			<li>장르</li>
			<li>앨범</li>
			<li>유통사</li>
		</ul>
		<c:forEach items="${list}" var="mvo">
			<ul class="Music_List">
				<li>${mvo.musicID}</li>
				<li>${mvo.musicTitle}</li>
			</ul>
		</c:forEach>
	</div>
</div>

<jsp:include page="tail_music.jsp" />