<%@page import="com.ipartek.formacion.util.Constantes"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<c:set var="language" value="${not empty sessionScope.idioma ? sessionScope.idioma : 'es_ES'}" scope="session" />
<fmt:setLocale value="${language}" />
<fmt:setBundle basename="com.ipartek.formacion.i18n.i18nmessages" /> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="${idioma}">
<base href="JavaWeb">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel='stylesheet' href='http://codepen.io/assets/libs/fullpage/jquery-ui.css'>
<link rel="stylesheet" href="css/style.css" media="screen" type="text/css" />

<title>Login</title>

</head>
<body>
	<div class="login-card">
	<% 
	String mensaje = (String) request.getParameter("mensaje");
	if(mensaje!=null) { //porque la primera vez que se carga la pagina no existe este mensaje ya que nunca hemos metido datos
		out.print(mensaje);
	}
	%>
	<form action="<%=Constantes.SERVLET_LOGIN %>" method="post">
		<input placeholder="<fmt:message key="html.placeholder.login.nombre"/>" type="text" name="<%=Constantes.PAR_USUARIO %>">
		<input placeholder="<fmt:message key="html.placeholder.login.pass"/>" type="password" name="<%=Constantes.PAR_PASSWORD %>">
		<input type="submit" class="login login-submit" value="<fmt:message key="html.boton.enviar"/>">
	</form>
	</div>
	<script src='http://codepen.io/assets/libs/fullpage/jquery_and_jqueryui.js'></script>
</body>
</html>