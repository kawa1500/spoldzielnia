<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<link href="<c:url value="/resources/css/header.css" />" rel="stylesheet">

<div class="fbox1">
	<span>
	<spring:message code="contact.address"/>
	<br />
	Łódź, Wólczańska 235
	<br />
	91-413 Łódź</span>
</div>

<div class="fbox1">
	<span>
	<spring:message code="contact.phone"/>
	<br />
	+48 800 123 465
	</span>
</div>
		
<div class="fbox1">
	<span>
	E-Mail:
	<br />
	serwis@association.com
	</span>
</div>