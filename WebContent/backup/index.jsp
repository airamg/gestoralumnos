<%@page import="com.ipartek.formacion.bean.Usuario"%>
<%@page import="com.ipartek.formacion.bean.Alumno"%>
<%@page import="java.util.List"%>
<%@page import="com.ipartek.formacion.util.Constantes"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<%@include file="includes/head.jsp" %>
<%@include file="includes/nav.jsp" %>

<div class="row">
	<div class="col-md-12">
		<table class="table table-striped">
			<thead>
			  <tr>
				<th><fmt:message key="html.tabla.titulo.codigo"/></th>
				<th><fmt:message key="html.tabla.titulo.nombre"/></th>
				<th><fmt:message key="html.tabla.titulo.apellido"/></th>
			  </tr>
			</thead>
			<%List<Alumno> alumnos = (List<Alumno>)request.getAttribute(Constantes.ATT_LISTADO_ALUMNOS); %>
			<%if(alumnos != null){%>	
			<tbody>
				<% for(int i=0; i <alumnos.size(); i++) {
					Alumno a = alumnos.get(i); %>
		  		<tr>
					<td><% out.println(a.getCodigoAlumno()); %></td>
					<td><% out.println(a.getNombre()); %></td>
					<td><% out.println(a.getApellidos()); %></td>	
				</tr>
		  		<%} %>
		  		</tbody>
		  </table>
	</div>
</div>
		  	<%} else { %>
		  		<h2><fmt:message key="html.tabla.mensaje.sindatos"/></h2>
		  	<%}%>		

<%@include file="includes/footer.jsp" %>   	
</body>
</html>