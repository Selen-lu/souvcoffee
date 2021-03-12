<%@page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"  isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">

<head>


    <sitemesh:write property='head'/>

    <style>
/*
  .container{ padding: 6rem 0;}*/
    </style>

</head>


<body id="page-top">

<!-- header -  Masthead -->
<header class="masthead">
    <%-- 메인 화면에 보이는 큰 이미지 --%>
    <a class="navbar-brand js-scroll-trigger" href="#page-top"><img src="${pageContext.request.contextPath}/resources/BS/main/assets/img/navbar-logo.svg" alt=""   /></a>
    <div class="container">
        <div class="masthead-subheading" >Welcome To Our Studio!</div>
        <div class="masthead-heading text-uppercase">It's Nice To Meet You</div>
        <a class="btn btn-primary btn-xl text-uppercase js-scroll-trigger" href="/menu.do"/> 컨트롤러의 매핑과 연결되어있으면  menu로 간다</a>
    </div>
</header>



</body>

<footer>
    <sitemesh:write property='footer'/>
</footer>
</html>