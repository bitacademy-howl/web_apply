<%@page import="com.flapper.stark.model.MusicVO"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>

<link rel="shortcut icon" type="image/x-icon" href="./resources/common/favicon.ico">
<link rel="stylesheet" type="text/css" href="./resources/css/main.css">

<meta charset="utf-8">
<title>My start</title>

<% MusicVO mvo = (MusicVO) request.getAttribute("mvo"); %>

</head>
<body>
    <div id="jb-container">
      <div id="jb-header">
        <h1>Music List</h1>
      </div>
      <div id="jb-sidebar-left">
        <h2>사이드 바</h2>
        <ul>
          <li><%= mvo.getMusicID() %></li>
          <li><%= mvo.getLyrics() %></li>
          <li>리스트 3</li>
        </ul>
      </div>
      <div id="jb-content">
        <h2> <!-- <a href="/music_list">music_list </a> --></h2>
        <div>
        	<p>제목</p>
        	<ul class="Music_List_Title">
			    <li>제목</li>
			    <li>가수</li>
			    <li>장르</li>
			    <li>앨범</li>
			    <li>유통사</li>
			</ul>
			<!-- 여기에 포문 돌려서 music entity를 표현 -->
			<ul class="Music_List">
			    <li><%= mvo.getMusicTitle() %></li>
			    <li>기획사랑 가수명은 parent 인 AlbumTable에서 얻어올 것!</li>
			    <li><%= mvo.getGenre() %></li>
			    <li><%= mvo.getAlbumID() %></li>
			    <li>기획사랑 가수명은 parent 인 AlbumTable에서 얻어올 것!</li>
			    <li>가수</li>
			    <li>앨범</li>
			    <li>유통사</li>
			</ul>
        </div>
        
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean nec mollis nulla. Phasellus lacinia tempus mauris eu laoreet. Proin gravida velit dictum dui consequat malesuada. Aenean et nibh eu purus scelerisque aliquet nec non justo. Aliquam vitae aliquet ipsum. Etiam condimentum varius purus ut ultricies. Mauris id odio pretium, sollicitudin sapien eget, adipiscing risus.</p>
      </div>
      <div id="jb-sidebar-right">
        <h2>Sidebar</h2>
        <ul>
          <li>Lorem</li>
          <li>Ipsum</li>
          <li>Dolor</li>
        </ul>
      </div>
      <div id="jb-footer">
        <p>Copyright</p>
      </div>
    </div>
	<P>  The time on the server is ${serverTime}. </P>
	</body>
</html>