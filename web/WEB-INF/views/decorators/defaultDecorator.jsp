
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%-- html5--%>
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


<sitemesh:write property='head' />
</header>
<title>

    <sitemesh:write property='title' />

</title>


<body>
This is the default body in decorator: 디폴트 데코레이터
<sitemesh:write property='body'/>
</body>



<footer>
    <sitemesh:write property ="footer"/>
</footer>


</html>

<%-- 뷰단 지정이 문제인듯 서블릿.xml쪽 가서 지정하던가 아님 냅두던가 둘중하나..--%>


<!-- Bootstrap core JS-->
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"></script>
<!-- Third party plugin JS-->
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>
<!-- Contact form JS-->
<script src="${pageContext.request.contextPath}/resources/BS/main/assets/mail/jqBootstrapValidation.js"></script>
<script src="${pageContext.request.contextPath}/resources/BS/main/assets/mail/contact_me.js"></script>
<!-- Core theme JS-->
<script src="${pageContext.request.contextPath}/resources/BS/main/js/scripts.js"></script>

