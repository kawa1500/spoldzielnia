<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<link href="<c:url value="/resources/css/login.css" />" rel="stylesheet">
    

  		<div class="card">
    		<form:form method="post" action="login.html">
      			<div class="input-container">
        			<form:input path="login"></form:input>
        			<form:label path="login">Login/Mail</form:label>
        			<div class="bar"></div>
      			</div>
      			<div class="input-container">
        			<form:input path="password" type="password"></form:input>
        			<form:label path="password">Password</form:label>
        			<div class="bar"></div>
      			</div>
      			<div class="button">
        			<input type="submit" value="submit"/>
      			</div>
    		</form:form>
  		</div>
