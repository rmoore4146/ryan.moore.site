<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <c:set var="contextPath" value="${pageContext.request.contextPath}"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>sports, phish, coding, life</title>
    <link type="text/css" href="${contextPath}/site/css/dotluv/jquery-ui-1.8.21.custom.css" rel="Stylesheet" />
    <link type="text/css" href="${contextPath}/site/css/common.css" rel="Stylesheet" />
    <link type="text/css" href="${contextPath}/site/css/home.css" rel="Stylesheet" />
    <script type="text/javascript" src="${contextPath}/site/javascript/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="${contextPath}/site/javascript/home.js"></script>
    <script type="text/javascript" src="${contextPath}/site/javascript/common.js"></script>
    <script type="text/javascript" src="${contextPath}/site/javascript/jquery-ui-1.8.21.custom.min.js"></script>
</head>
<body>
<div id="homeDiv" class="tabs">
    <ul>
        <li><a href="#readTab">read</a></li>
        <li><a href="#postTab">post</a></li>
        <li><a href="#aboutTab">about</a></li>
    </ul>
    <!-- need to make these divs separate for the jQuery styling to work-->
    <div id="readTab" class="accordion">
        <c:forEach var="post" items="${posts}">
            <fmt:formatDate value="${post.createDt}" pattern="MM/dd/yyyy" var="postCreateDt"/>
            <h3 class="postHeader"><a href="#">${post.postTitle}</a></h3>
            <div class="postContent">
                <p>${post.postText}</p>
                <div class="postFooter">
                    <label for="postNumberSpan">post#: </label>
                    <span id="postNumberSpan">${post.id} - </span>
                    <label for="dateSpan">date: </label>
                    <span id="dateSpan">${postCreateDt}</span>
                </div>
            </div>
        </c:forEach>
        <%--<h3><a href="#">Make fun of you accordian</a></h3>--%>
        <%--<div id="section1AccordianContent">--%>
            <%--<span>${name} touched the baby</span>--%>
            <%--</br>--%>
        <%--</div>--%>

        <%--<h3><a href="#">Datepicker accordian</a></h3>--%>
        <%--<div id="section2AccordianContent">--%>
            <%--<p>Date: <input id="datepicker" type="text" /> was the day that ${name} discovered they were pregnant--%>
            <%--</p>--%>
        <%--</div>--%>

        <%--<h3><a href="#">Baby punch picture accordian</a></h3>--%>
        <%--<div id="section3AccordianContent" stlye="height: 400px">--%>
            <%--<img src="${contextPath}/site/img/baby_punch.jpg" alt="" name="baby_punch"id="" />--%>
        <%--</div>--%>
    </div>
    <div id="postTab">
        </br>
        <p>Nothin' here yet...
        </p>
    </div>
    <div id="aboutTab">
        <label for="nameSpan">Name: </label>
        <span id="nameSpan">${name}</span>
        </br>
        <label for="citySpan">City: </label>
        <span id="citySpan">${city}</span>
    </div>
</div>
<div class="gaeButtonDiv">
    <img src="https://developers.google.com/appengine/images/appengine-silver-120x30.gif"
        alt="Powered by Google App Engine" />
</div>
</body>
</html>
