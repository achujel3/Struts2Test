<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Search form</title>
</head>
<body>

<s:form action="tutorials/getTutorial.action">
    <s:textfield label="Enter language to search for: " key="language"/>
    <s:submit/>
</s:form>

</body>
</html>
