<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<link href="<c:url value="/resources/css/header.css" />" rel="stylesheet">

<ul>
	<li class="active"><a href="#" accesskey="1" title=""><spring:message code="menu.home"/></a></li>
	<li><a href="#" accesskey="2" title=""><spring:message code="menu.about"/></a></li>
	<li><a href="#" accesskey="3" title=""><spring:message code="menu.bills"/></a></li>
	<li><a href="#" accesskey="4" title=""><spring:message code="menu.account"/></a></li>
	<li><a href="home.html" accesskey="5" title=""><spring:message code="menu.logout"/></a></li>
</ul>