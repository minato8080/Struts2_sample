<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts2でHelloWorld</title>
</head>
<body>
	<s:form action="hello">
		<s:textfield name="name" />
		<s:submit value="HelloWorldページへ行く" />
	</s:form>
	<s:form action="list">
		<s:submit value="listページへ行く" />
	</s:form>
</body>
</html>
