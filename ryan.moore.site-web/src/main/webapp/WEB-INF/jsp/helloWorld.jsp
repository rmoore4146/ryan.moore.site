<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello World Controller</title>
        <link type="text/css" href="site/css/smoothness/jquery-ui-1.8.21.custom.css" rel="Stylesheet" />
        <link type="text/css" href="site/css/helloWorld.css" rel="Stylesheet" />
        <script type="text/javascript" src="site/javascript/jquery-1.7.2.min.js"></script>
        <script type="text/javascript" src="site/javascript/helloWorld.js"></script>
        <script type="text/javascript" src="site/javascript/jquery-ui-1.8.21.custom.min.js"></script>
    </head>
    <body>
        <div id="accordion">
            <h3><a href="#">Make fun of you accordian</a></h3>
            <div id="section1AccordianContent">
                <span>${name} touched the baby</span>
                </br>
            </div>

            <h3><a href="#">Datepicker accordian</a></h3>
            <div id="section2AccordianContent">
                </br>
                <p>Date: <input id="datepicker" type="text" /> was the day that ${name} discovered they were pregnant
                </p>
            </div>

            <h3><a href="#">Baby punch picture accordian</a></h3>
            <div id="section3AccordianContent" stlye="height: 400px">
                <img src="site/img/baby_punch.jpg" alt="" name="baby_punch"id="" />
            </div>
        </div>
    </body>
</html>
