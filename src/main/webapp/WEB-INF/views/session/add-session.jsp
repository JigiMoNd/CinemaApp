<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<a href="/">Home</a> <br>

<form:form action="add-session" method="POST" modelAttribute="sessionModel">
	
	enter date of the session:  <form:input path="dateAndTime"/> <br> <!-- як коректно задавати дату? -->
	select the movie of the session:  <form:select path="movie" items="${movies}" itemLabel="name" itemValue="id"></form:select> <br>
	select the hall of the session:  <form:select path="hall" items="${halls}" itemLabel="name" itemValue="id"></form:select> <br>
	
<!-- 	List<Ticket> ticket що робити з полем тікетс? 
як його заповнити автоматично взявши дані з hall? через форматтер?
чи треба його заповнювати? 
те ж питання з Movie і List<Session> session-->	

	<input type="submit" value="Add session">
</form:form>