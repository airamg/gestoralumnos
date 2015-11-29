
<%@page import="com.ipartek.formacion.bean.Convocatoria"%>
<%@include file="../includes/head.jsp" %>
<%@include file="../includes/nav.jsp" %>
<%
	Convocatoria convocatoria = (Convocatoria)request.getAttribute(Constantes.ATT_CONVOCATORIA);
	int op = Constantes.OP_UPDATE;
	String buttonValue = "Crear";
	if(convocatoria == null) {
		convocatoria = new Convocatoria();
		op = Constantes.OP_CREATE;
	} else {
		buttonValue = "Modificar";
	}
%>   

<div class="col-xs-12 col-lg-6">
	<form action="<%=request.getContextPath()+"/"+Constantes.SERVLET_CURSOS%>" method="post" role="form">
	
		<div class="form-group">			
			<input type="hidden" name="<%=Constantes.PAR_CODIGOCONVOCATORIA %>" readonly value="<%=convocatoria.getCodigo()%>" class="form-control">
		</div>
		
		<div class="form-group">
			<label for=""><fmt:message key="html.form.convocatorias.nombre"/></label>	
			<input id="" type="text" name="name" value="<%=convocatoria.getNombre()%>" class="form-control">
		</div>			
		<div class="form-group">
			<label for=""><fmt:message key="html.form.convocatorias.cursoasociado"/></label>	
			<input id="" type="text" name="codcurso" value="<%=convocatoria.getCodigoCurso()%>" class="form-control">
		</div>
			
		<div class="form-group">		
			<input type="hidden" name="<%=Constantes.OP_KEY%>" value="<%=op%>" class="form-control">
		</div>		
		
		<div class="form-group">
			<input type="submit" value="<%=buttonValue%>" class="btn btn-outline btn-primary">
		</div>		
	
	</form>
</div>	

<%@include file="../includes/footer.jsp" %>