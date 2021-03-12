
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html lang="ko">

<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />

<%--탭의 글자--%>
<title>Agency - Start Bootstrap Theme</title>

<%-- 탭의 아이콘 --%>
<link rel="icon" type="image/x-icon" href="${pageContext.request.contextPath}/resources/BS/main/assets/img/favicon.ico" />


<!-- Font Awesome icons (free version)-->
<script src="https://use.fontawesome.com/releases/v5.15.1/js/all.js" crossorigin="anonymous"></script>
<!-- Google fonts-->
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css" />
<link href="https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic" rel="stylesheet" type="text/css" />
<link href="https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700" rel="stylesheet" type="text/css" />
<!-- Core theme CSS (includes Bootstrap)-->
<link href="${pageContext.request.contextPath}/resources/css/main/styles.css" rel="stylesheet" />

<head>

    <!-- Font Awesome icons (free version)-->
    <script src="https://use.fontawesome.com/releases/v5.15.1/js/all.js" crossorigin="anonymous"></script>
    <!-- Google fonts-->
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css" />
    <link href="https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic" rel="stylesheet" type="text/css" />
    <link href="https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700" rel="stylesheet" type="text/css" />
    <!-- Core theme CSS (includes Bootstrap)-->
    <link href="${pageContext.request.contextPath}/resources/css/main/styles.css" rel="stylesheet" />
    <!-- 매인 Navigation-->


    <nav class="navbar navbar-expand-lg navbar-dark fixed-top" id="mainNav" style="float: left">
        <div class="container">
            <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                Menu
                <i class="fas fa-bars ml-1"></i>
            </button>
            <div class="collapse navbar-collapse" id="navbarResponsive">
                <ul class="navbar-nav text-uppercase ml-auto">
                    <%--  메뉴바 css에서 설정 변경 : 이미지 맨 위로 ,  매뉴바 글씨 크기 작게 --%>
                    <%--메인 이미지 넣을 공간--%>
                    <li style="float: top"><a href="/main.do"><img class="img-fluid" src="${pageContext.request.contextPath}/resources/BS/main/assets/img/favicon.ico" title="mainIcon" /></a></li>
                    <%--매뉴 --%>
                    <li class="nav-item"><a class="nav-link js-scroll-trigger" href="/about.do">About</a></li>
                    <li class="nav-item"><a class="nav-link js-scroll-trigger" href="/visit.do">Visit</a></li>
                    <li class="nav-item"><a class="nav-link js-scroll-trigger" href="/menu.do">Menu</a></li>
                    <li class="nav-item"><a class="nav-link js-scroll-trigger" href="/goods.do">goods</a></li>
                    <li class="nav-item"><a class="nav-link js-scroll-trigger" href="/contact.do">Contact</a></li>
                    <%-- 아직 페이지, 연결 안했음 --%>
                    <li class="nav-item"><a class="nav-link js-scroll-trigger" href="/contact.do">log in</a></li><%--모달창--%>
                    <li class="nav-item"><a class="nav-link js-scroll-trigger" href="/contact.do">장바구니</a></li><%-- 페이지 얀동--%>
                    <li class="nav-item"><a class="nav-link js-scroll-trigger" href="/contact.do">검색</a></li><%-- 페이지 연결--%>
                </ul>
            </div>
        </div>
    </nav>

    <sitemesh:write property ="head"/>
</head>



<body>
<sitemesh:write property ="body"/>
</body>

<footer>
    <sitemesh:write property ="footer"/>
</footer>
</html>