<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>

<link rel="shortcut icon" type="image/x-icon" href="/resources/common/favicon.ico">
<link rel="stylesheet" type="text/css" href="/resources/css/fixed/top_menu.css">
<link rel="stylesheet" type="text/css" href="/resources/css/fixed/main.css">
<!--[if lt IE 9]>
<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->

<meta charset="utf-8">
<title>My start</title>

</head>

<body>
    <div id="fixed-container">
    
	   <div id="fixed-header">
	     <h1><a href="/">Flapper</h1>
	     <nav id="topMenu" >
			<ul>
				 <li><a class="menuLink" href="/">Home</a></li>
				 <li><a class="menuLink" href="music">Music_App</a></li>
				 <li><a class="menuLink" href="#">Community</a></li>
				 <li><a class="menuLink" href="#">Locations</a></li>
				 <li><a class="menuLink" href="#">About us</a></li>
			</ul>
		  </nav>
	   </div>
	      
		<div id="music-sidebar-left">
			<h2 id="side-menu-bar" align=center>메뉴</h2>
			<ul>
				<li><a href="music">음원</a></li>
				<li><a href="music">앨범</a></li>
				<li><a href="music">아티스트</a></li>
			</ul>
		</div>
		
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
			</div>
		</div>
			
		<div id="music-sidebar-right" class="music-sidebar-right">
			<h2>여기에 추천 리스트</h2>
			<ul>
				<li>Lorem</li>
				<li>Ipsum</li>
				<li>Dolor</li>
			</ul>
		</div>
		
		<div id="fixed-footer">
		  <p>Copyright</p>
		</div>
	</div>
	<%-- <P>  The time on the server is ${serverTime}. </P> --%>
	</body>
</html>

