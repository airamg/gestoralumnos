<%@page import="com.ipartek.formacion.util.Constantes"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<c:set var="language" value="${not empty sessionScope.idioma ? sessionScope.idioma : 'es_ES'}" scope="session" />
<fmt:setLocale value="${language}" />
<fmt:setBundle basename="com.ipartek.formacion.i18n.i18nmessages" /> 

<!DOCTYPE html>

<html lang="${idioma}">

<head>

	<!-- Ruta Base para todas nuestras url relativas -->
	<base href="<%=request.getContextPath()+"/"%>">
	
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Java Web Office</title>

    <!-- Bootstrap Core CSS -->
    <link href="<%=Constantes.RUTA_BACKUP%>/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="<%=Constantes.RUTA_BACKUP%>/css/sb-admin-2.css" rel="stylesheet">
   
    <!-- Custom Fonts -->
    <link href="<%=Constantes.RUTA_BACKUP%>/font-awesome-4.1.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    
    <!-- DataTable -->
    <link href="<%=Constantes.RUTA_BACKUP%>css/plugins/dataTables.bootstrap.css" rel="stylesheet" type="text/css">

</head>
<body>
    <div id="wrapper">