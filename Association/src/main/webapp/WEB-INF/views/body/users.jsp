<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<link href="<c:url value="/resources/css/user.css" />" rel="stylesheet">
    

  		<div class="card">
  			<div class="buttonAdd" style="padding: 15px">
        			<a href="#"><spring:message code="users.add"/></a>
      		</div>
    		<c:forEach items="${users}" var="user">
				<div class="input-container" style="padding-bottom: 15px">
					<div class="user">
						<h2><a>${user.firstName}  ${user.lastName}</a></h2>
						<span>${user.telephone}</span>
						<p>${user.email}</p>
						<div class="button">
        					<a href=" <spring:url value="/adminRenters/user?id=${user.id}" /> "><spring:message code="users.more"/></a>
      					</div>
					</div>
				</div>
			</c:forEach>
  		</div>
