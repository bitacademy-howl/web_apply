<%@page import="org.springframework.web.servlet.ModelAndView"%>
<%@page import="java.util.List"%>
<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>


<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<link rel="shortcut icon" type="image/x-icon" href="./resources/common/favicon.ico">
	<link rel="stylesheet" type="text/css" href="./resources/css/main.css">
	<title>Music List</title>
</head>


<body>
	<%
	List list1 = (List) request.getAttribute("list");
	%>
	<div id="jb-container">
		<div id="jb-header">
			<div class="inner_wrap_v1">
				<ul>
					<li>sd</li>
					<li>asd</li>
					<li>asd</li>
				</ul>
			</div>
	     </div>
	     
	     <div id="jb-sidebar-left">
	       <h2>사이드 메뉴바</h2>
	       <ul>
	         <li>${name}</li>
	      <li><% out.print(list1.get(0)); %></li>
	          <li>리스트 3</li>
	        </ul>
	      </div>
	      <div id="jb-content">
	        <h2> contents 프레임 </h2>
	        <p> 이곳에 &lt;li&gt; 태그 리스트로 music list 를 표현하거나</p>
	        
	        <p>
	        	가사 보기 앨범 정보등을 표현 </br>
	        	혹은 곡의 통계 뷰 등등을 표현할 것!
	        </p>
	        
	      </div>
	      <div id="jb-sidebar-right">
	        <h2>오른쪽 사이드</h2>
	        <ul>
	<p> 리스트 형태로 마우스 오버된 음원 목록의 추천 리스트를 표현</p>
	<li>Lorem</li>
	<li>Ipsum</li>
	<li>Dolor</li>
	        </ul>
	      </div>
	      <div id="jb-footer">
	        <p>Copyright</p>
	      </div>
	      <div>
			<P>  The time on the server is ${serverTime}. </P>
	</div>
	  </div>
	
</body>
</html>