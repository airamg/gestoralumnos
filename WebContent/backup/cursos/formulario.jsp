<%@page import="com.ipartek.formacion.bean.Curso"%>
<%@include file="../includes/head.jsp" %>
<%@include file="../includes/nav.jsp" %>
<%

		Curso c = (Curso)request.getAttribute(Constantes.ATT_CURSO);
		String buttonValue = "Modificar";
		int op = Constantes.OP_UPDATE;
			
		if ( c == null ){
			c = new Curso();
			op = Constantes.OP_CREATE;
			buttonValue = "Crear";
		}
%>    
    

<div class="col-xs-12 col-lg-6">
	<form action="<%=request.getContextPath()+"/"+Constantes.SERVLET_CURSOS%>" method="post" role="form">
	
		<div class="form-group">			
			<input type="hidden" name="<%=Constantes.SERVLET_CURSOS%>" readonly value="<%=c.getCodigo()%>" class="form-control">
		</div>			
		<div class="form-group">
			<label><fmt:message key="html.form.cursos.nombre"/></label>	
			<input type="text" name="nombre" value="<%=c.getNombre()%>" class="form-control">
		</div>			
		<div class="form-group">
			<label><fmt:message key="html.form.cursos.tipo"/></label>	
			<input type="text" name="tipo" value="<%=c.getTipoCurso()%>" class="form-control">
		</div>			
		<div class="form-group">
			<label><fmt:message key="html.form.cursos.precio"/></label>	
			<input type="text" name="precio" value="<%=c.getPrecio()%>" class="form-control">
		</div>		
		
		<!-- ocultos -->			
		<div class="form-group">		
			<input type="hidden" name="<%=Constantes.OP_KEY%>" value="<%=op%>" class="form-control">
		</div>			
		<div class="form-group">
			<input type="submit" value="<%=buttonValue%>" class="btn btn-outline btn-primary">
		</div>		
	
	</form>
</div>

<%@include file="../includes/footer.jsp" %>