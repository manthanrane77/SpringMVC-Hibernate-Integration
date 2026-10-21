<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Customers</title>
</head>
<body>

<h2>Customer Relationship Management</h2>

<p>
    <a href="${pageContext.request.contextPath}/customer/showForm">
        Add Customer
    </a>
</p>

<table border="1" cellpadding="8">
    <thead>
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Update</th>
            <th>Delete</th>
        </tr>
    </thead>

    <tbody>
        <c:forEach var="customer" items="${customers}">
            <tr>
                <td><c:out value="${customer.firstName}"/></td>
                <td><c:out value="${customer.lastName}"/></td>
                <td><c:out value="${customer.email}"/></td>

                <td>
                    <a href="${pageContext.request.contextPath}/customer/showFormForUpdate?customerId=${customer.id}">
                        Update
                    </a>
                </td>

                <td>
                    <a href="${pageContext.request.contextPath}/customer/delete?customerId=${customer.id}"
                       onclick="return confirm('Delete this customer?');">
                        Delete
                    </a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>

</body>
</html>