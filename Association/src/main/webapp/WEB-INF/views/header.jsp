<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<link href="<c:url value="/resources/css/header.css" />" rel="stylesheet">

<span style="float: right">
    	<a href="?lang=pl">pl</a> | <a href="?lang=en">en</a> | <a href="?lang=de">de</a>
	</span>
<h1><spring:message code="label.title"/></h1>
