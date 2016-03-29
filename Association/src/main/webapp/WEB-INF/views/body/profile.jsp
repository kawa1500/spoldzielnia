<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<link href="<c:url value="/resources/css/login.css" />" rel="stylesheet">
    

  		<div class="card">
    		<form:form method="post" action="adminProfile.html">
      			<div class="input-container">
        			<form:input path="firstName"></form:input>
        			<form:label path="firstName"><spring:message code="profile.first"/></form:label>
        			<div class="bar"></div>
      			</div>
      			<div class="input-container">
        			<form:input path="lastName"></form:input>
        			<form:label path="lastName"><spring:message code="profile.last"/></form:label>
        			<div class="bar"></div>
      			</div>
      			<div class="input-container">
        			<form:input path="email"></form:input>
        			<form:label path="email"><spring:message code="profile.mail"/></form:label>
        			<div class="bar"></div>
      			</div>
      			<div class="input-container">
        			<form:input path="telephone"></form:input>
        			<form:label path="telephone"><spring:message code="profile.phone"/></form:label>
        			<div class="bar"></div>
      			</div>
      			<div class="button">
        			<input type="submit" value="submit"/>
      			</div>
    		</form:form>
  		</div>
