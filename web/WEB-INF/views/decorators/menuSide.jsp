
<%@page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>
    <sitemesh:write property ="head"/>



    <!-- Font Awesome icons (free version)-->
    <script src="https://use.fontawesome.com/releases/v5.15.1/js/all.js" crossorigin="anonymous"></script>
    <!-- Google fonts-->
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css" />
    <link href="https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic" rel="stylesheet" type="text/css" />
    <link href="https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700" rel="stylesheet" type="text/css" />
    <!-- Core theme CSS (includes Bootstrap)-->
    <link href="${pageContext.request.contextPath}/resources/css/main/styles.css" rel="stylesheet" />




    <%-- side매뉴--%>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <style>
        .fakeimg {
            height: 200px;
            background: #aaa;
        }

        .side-navigator{
            height: auto;
            padding: 6rem 30px;
            margin: 50px;
        }

    </style>

    <sitemesh:write property='head'/>
</head>

<body>

    <div class="container" >
        <div class ="side-navigator" style="float: left" > <%--사이드 네비게이터 : 왼쪽으로 띄움--%>
            <div class="container" >
                <ul class="nav nav-pills flex-column" style="padding-top:50px">
                    <li class="nav-item">
                        <a class="nav-link" href="/menu/coffee.do">COFFEE</a><%-- menu/coffee.do => 컨트롤러 매핑과 같아야 클라이언트 - 컨트롤러 연결 가능--%>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/menu/dessert.do">DESSERT</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/menu/tea.do">TEA</a>
                    </li>

                </ul>
                <hr class="d-sm-none">
            </div>
        </div>
    </div>
<sitemesh:write property ="body"/>
        <%--사이드 네비게이터 끝  --%>

</body>


<!-- Footer-->
<footer>
    <div>
        <sitemesh:write property ="footer"/>
    </div>
</footer>
</html>
