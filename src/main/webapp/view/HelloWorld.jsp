<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello Struts2 world!</title>
</head>
<body>
	Hello Struts2 world,
	<s:property value="name" />
	さん
	<br>
	<%-- 宣言 --%>
	<%!int dCnt = 10;%>
	<%-- スクリプトレット --%>
	<%
	int sCnt = 10;
	dCnt++;
	sCnt++;
	out.println("dCnt: " + dCnt + "<br>");
	out.println("sCnt: " + sCnt);
	%>
</body>
</html>