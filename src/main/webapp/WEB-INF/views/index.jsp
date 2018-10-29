<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>


<!DOCTYPE html>
<html>
<head>

<link rel="shortcut icon" type="image/x-icon" href="./resources/common/favicon.ico">
<link rel="stylesheet" type="text/css" href="./resources/css/main.css">

<meta charset="utf-8">
<title>My start</title>

</head>


<body>
    <div id="jb-container">
      <div id="jb-header">
        <h1>Music List</h1>
      </div>
      <div id="jb-sidebar-left">
        <h2>사이드 바</h2>
        <ul>
        	<li></li>
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
			
			<%-- <c:forEach var="mvo" items="${mlist}">
				<ul class="Music_List">
				    <li>ID : ${mvo.music_ID}</li>
				    <li>Title : ${mvo.music_Title}</li>
				</ul>
			</c:forEach> --%>
			<!-- 여기에 포문 돌려서 music entity를 표현 -->
			<%-- <c:forEach items="${mlist}" var="mvo">
				<ul class="Music_List">
				    <li>${mvo}</li>
				</ul>
			</c:forEach> --%>
			
			<%-- <c:set var="i" value="0" />
			<c:set var="j" value="3" />
			<table border="1">
				<c:forEach items="${list }" var="list">
					<c:if test="${i%j == 0 }">
					<tr>
						</c:if>
						<td>${list }</td>
						<c:if test="${i%j == j-1 }">
					</tr>
					</c:if>
				<c:set var="i" value="${i+1 }" />
			</c:forEach> </table> --%>

        </div>
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