<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Spring Mobile | Lite Device Delegating View Resolver</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
	</head>
	<body>
		<header>
			<h1>Home (Mobile Site)</h1>
		</header>
		<footer>
			An Apache-licensed technology showcase by SpringSource.
		</footer>
		<aside id="site-preference">
			<p>Site: 
			<c:if test="${currentSitePreference.mobile}"><a href="?site_preference=normal">Normal</a> | Mobile | <a href="?site_preference=tablet">Tablet</a></c:if>
			<c:if test="${currentSitePreference.tablet}"><a href="?site_preference=normal">Normal</a> | <a href="?site_preference=mobile">Mobile</a> | Tablet</c:if>
			<c:if test="${currentSitePreference.normal}">Normal | <a href="?site_preference=mobile">Mobile</a> | <a href="?site_preference=tablet">Tablet</a></c:if>
		</aside>
	</body>
</html>
