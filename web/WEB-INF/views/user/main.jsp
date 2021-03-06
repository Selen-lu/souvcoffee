
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"  isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <%-- 메인 화면에 보이는 큰 이미지 --%>
    <a class="navbar-brand js-scroll-trigger" href="#page-top"><img src="${pageContext.request.contextPath}/resources/BS/main/assets/img/navbar-logo.svg" alt="" /></a>
</head>

<body id="page-top">
<!-- Navigation-->

<!-- Masthead-->
<header class="masthead">
    <div class="container">
        <div class="masthead-subheading">Welcome To Our Studio!</div>
        <div class="masthead-heading text-uppercase">It's Nice To Meet You</div>
        <a class="btn btn-primary btn-xl text-uppercase js-scroll-trigger" href="#services"> 링크가  서비스로 간다</a>
    </div>
</header>



<!-- Clients-->
<div class="py-5">
    <div class="container">
        <div class="row">
            <div class="col-md-3 col-sm-6 my-3">
                <a href="#"><img class="img-fluid d-block mx-auto" src="${pageContext.request.contextPath}/resources/BS/main/assets/img/logos/envato.jpg" alt="" /></a>
            </div>
            <div class="col-md-3 col-sm-6 my-3">
                <a href="#"><img class="img-fluid d-block mx-auto" src="${pageContext.request.contextPath}/resources/BS/main/assets/img/logos/designmodo.jpg" alt="" /></a>
            </div>
            <div class="col-md-3 col-sm-6 my-3">
                <a href="#"><img class="img-fluid d-block mx-auto" src="${pageContext.request.contextPath}/resources/BS/main/assets/img/logos/themeforest.jpg" alt="" /></a>
            </div>
            <div class="col-md-3 col-sm-6 my-3">
                <a href="#"><img class="img-fluid d-block mx-auto" src="${pageContext.request.contextPath}/resources/BS/main/assets/img/logos/creative-market.jpg" alt="" /></a>
            </div>
        </div>
    </div>
</div>



</body>
</html>