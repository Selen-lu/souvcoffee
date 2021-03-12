<%@page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="decorator" uri="http://jakarta.apache.org/taglibs/standard/permittedTaglibs" %>

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





<head>

    <meta name="head" content="/WEB-INF/views/inc/head.jsp" />
    <meta name="footer" content="/WEB-INF/views/inc/footer.jsp"/>





    <sitemesh:write property='head' />

</head>

<title>
    <sitemesh:write property='title' />
</title>


<body>

    <div>
     <sitemesh:write property='body'/>
    </div>

</body>
<!-- Footer-->
<footer>

        <sitemesh:write property ="footer"/>

</footer>

</html>



<%-- main.jsp 에서 나는 경로 매핑 안되는건 여기서 해결됨--%>
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

