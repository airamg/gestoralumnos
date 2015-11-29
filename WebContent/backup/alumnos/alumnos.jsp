<%@page import="com.ipartek.formacion.bean.Alumno"%>
<%@page import="java.util.List"%>
<%@include file="../includes/head.jsp" %>
<%@include file="../includes/nav.jsp" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    		
	<p><a href='backup/alumnos/form.jsp' class="btn btn-default" title="crear"><fmt:message key="html.boton.nuevoalumno"/></a></p>
	
	<c:if test="${alumnos != null}">
		<!-- <h2><fmt:message key="html.tabla.mensaje.alumno"/></h2> -->
   		<table class="table table-striped">
			<thead>
		     	<tr>
		        	<th><fmt:message key="html.tabla.titulo.nombre"/></th>
		        	<th><fmt:message key="html.tabla.titulo.apellido"/></th>             
		    	</tr>
			</thead>
			
			<tbody>
			<c:forEach var="alumno" items="${alumnos}">			
				<tr>
		        	<td>${alumno.nombre}</td>
		            <td>${alumno.apellidos}</td>
		            <td>
		                <a href='alumno.do?id=${alumno.codigoAlumno}'>
		                	<button type="button" class="btn btn-primary"><fmt:message key="html.boton.editar"/></button>
		                </a>
		             </td>
		             <td>
		                <form action="alumno.do" method="post">
		                	<input type="hidden" name="id" value="${alumno.codigoAlumno}">
		                	<input type="hidden" name="operation" value="1">
		                	<input type="submit" class="btn btn-danger" value="<fmt:message key="html.boton.eliminar"/>">
		                </form>	                	
		            </td>               
		        </tr>  
		    </c:forEach>
		    </tbody>
		 </table> 
	</c:if>
	
<%@include file="../includes/footer.jsp" %> 