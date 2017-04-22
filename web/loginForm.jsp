<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Form</title>
</head>
<body>

<s:form action="loginForm">
    <s:textfield label="Login" key="user.name"/>
    <s:password label="Password" key="user.password"/>
    <s:submit/>
</s:form>

</body>
</html>
