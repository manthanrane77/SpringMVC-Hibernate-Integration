<html>
<body>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    response.sendRedirect(
        request.getContextPath() + "/customer/list"
    );
%>
</body>
</html>
