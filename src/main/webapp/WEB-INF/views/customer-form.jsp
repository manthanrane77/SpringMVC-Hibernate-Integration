<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Customer Form</title>
</head>
<body>

<h2>Customer Form</h2>

<form:form action="${pageContext.request.contextPath}/customer/saveCustomer"
           modelAttribute="customer"
           method="POST">

    <!-- Hidden ID: 0 for a new customer; existing ID for update -->
    <form:hidden path="id"/>

    <p>
        First Name:
        <form:input path="firstName" required="required"/>
    </p>

    <p>
        Last Name:
        <form:input path="lastName" required="required"/>
    </p>

    <p>
        Email:
        <form:input path="email" type="email" required="required"/>
    </p>

    <button type="submit">Save</button>
</form:form>

<p>
    <a href="${pageContext.request.contextPath}/customer/list">
        Back to customer list
    </a>
</p>

</body>
</html>