<%@page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="ko">
<meta name="viewport" content="width=device-width, initial-scale=1">

<head>
    <title><sitemesh:write property='title'/></title>
    <sitemesh:write property='head'/>
</head>

<body>
This is the decorator body in user: 유저 데코레이터
<sitemesh:write property='body'/>
</body>

<footer>
    <sitemesh:write property='footer'/>
</footer>
</html>