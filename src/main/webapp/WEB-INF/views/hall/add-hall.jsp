<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<a href="/">Home</a> <br>

<form:form action="add-hall" method="POST" modelAttribute="hallModel">
	
	<form:input path="name"/> <br>
	<form:input path="numberOfSits"/> <br>
	<input type="submit" value="Add hall">


</form:form>