<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Employee info</h2>

<form:form action="saveEmployee" modelAttribute="employee">

    Name <form:input path="name"/>
    <br>
    Surname<form:input path="surname"/>
    <br>
    Department<form:input path="department"/>
    <br>
    Salary<form:input path="salary"/>
    <br>
    <input type="submit" value="Ok">

</form:form>

</body>
</html>
