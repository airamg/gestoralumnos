<%@page import="com.ipartek.formacion.service.interfaces.ICursoService"%>
<%@page import="com.ipartek.formacion.service.CursoService"%>
<%@page import="com.ipartek.formacion.bean.Curso"%>
<%@page import="com.ipartek.formacion.bean.Convocatoria"%>
<%@page import="java.util.List"%>
<%@include file="../includes/head.jsp" %>
<%@include file="../includes/nav.jsp" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    		
	<p><a href='backup/convocatorias/form.jsp' class="btn btn-default" title="crear"><fmt:message key="html.boton.nuevaconvocatoria"/></a></p>
	
	<c:if test="${listadoconvocatorias != null}">
   		<table class="table table-striped">
			<thead>
		     	<tr>
		        	<th><fmt:message key="html.tabla.titulo.codigo"/></th>
		        	<th><fmt:message key="html.tabla.titulo.nombre"/></th>             
		    	</tr>
			</thead>
			
			<tbody>
			<c:forEach var="conv" items="${listadoconvocatorias}">			
				<tr>
		        	<td>${conv.codigo}</td>
		            <td>${conv.nombre}</td>
		            <td>
		                <a href='convocatoria.do?cod=${conv.codigo}'>
		                	<button type="button" class="btn btn-primary"><fmt:message key="html.boton.editar"/></button>
		                </a>
		             </td>
		             <td>
		                <form action="convocatoria.do" method="post">
		                	<input type="hidden" name="cod" value="${conv.codigo}">
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