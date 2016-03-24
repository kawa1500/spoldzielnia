<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<link href="<c:url value="/resources/css/header.css" />" rel="stylesheet">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<body> 
<div id="header-wrapper">
	<div id="header" class="container">
		<div id="logo">
        	<tiles:insertAttribute name="header" />
		</div>
		<div id="menu">
			<tiles:insertAttribute name="menu" />
		</div>
	</div>
</div>

<div class="wrapper">
	<div id="welcome" class="container">
		<tiles:insertAttribute name="body" />
	</div>
</div>
<div id="footer">
	<div class="container">
		<tiles:insertAttribute name="contact" />
	</div>
</div>
</body>
</html>