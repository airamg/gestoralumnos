<%@page import="com.ipartek.formacion.bean.Curso"%>
<%@page import="java.util.List"%>
<%@include file="../includes/head.jsp" %>
<%@include file="../includes/nav.jsp" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    		
	<p><a href='backup/cursos/formulario.jsp' class="btn btn-default" title="crear"><fmt:message key="html.boton.nuevocurso"/></a></p>
	
	<c:if test="${listadocursos != null}">
   		<table class="table table-striped">
			<thead>
		     	<tr>
		        	<th><fmt:message key="html.tabla.titulo.nombre"/></th>
		        	<th><fmt:message key="html.tabla.titulo.tipo"/></th>  
		        	<th><fmt:message key="html.tabla.titulo.precio"/></th>            
		    	</tr>
			</thead>
			
			<tbody>
			<c:forEach var="curso" items="${listadocursos}">			
				<tr>
		        	<td>${curso.nombre}</td>
		            <td>${curso.tipoCurso}</td>
		            <td>${curso.precio} &euro;</td>
		            <td>
		                <a href='curso.do?id=${curso.codigo}'>
		                	<button type="button" class="btn btn-primary"><fmt:message key="html.boton.editar"/></button>
		                </a>
		             </td>
		             <td>
		                <form action="curso.do" method="post">
		                	<input type="hidden" name="id" value="${curso.codigo}">
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