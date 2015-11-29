<%@page import="com.ipartek.formacion.bean.Alumno"%>
<%@include file="../includes/head.jsp" %>
<%@include file="../includes/nav.jsp" %>

<%
		//recoger attributo de Alumno		
		Alumno al = (Alumno)request.getAttribute(Constantes.ATT_ALUMNO);
		//inicializar variables para el formulario		
		int op = Constantes.OP_UPDATE;
		String buttonValue = "Crear";
		if(al == null) {
			al = new Alumno();
			op = Constantes.OP_CREATE;
		} else {
			buttonValue = "Modificar";
		}
%>    
    

<div class="col-xs-12 col-lg-6">
	<form action="<%=request.getContextPath()+"/"+Constantes.SERVLET_ALUMNOS%>" method="post" role="form">
	
		<div class="form-group">			
			<input type="hidden" name="id" readonly value="<%=al.getCodigoAlumno()%>" class="form-control">
		</div>		
		<div class="form-group">
			<label for=""><fmt:message key="html.form.alumnos.nombre"/></label>	
			<input id="" type="text" name="name" value="<%=al.getNombre()%>" class="form-control">
		</div>			
		<div class="form-group">			
			<label for=""><fmt:message key="html.form.alumnos.apellidos"/></label>
			<input id="" type="text" name="apellidos" value="<%=al.getApellidos()%>" class="form-control">
		</div>		
		<div class="form-group">			
			<label for=""><fmt:message key="html.form.alumnos.DNI"/></label>
			<input id="" type="text" name="dni" value="<%=al.getDni()%>" class="form-control">
		</div>
		<div class="form-group">			
			<label for=""><fmt:message key="html.form.alumnos.hermanos"/></label>
			<input id="" type="text" name="hermanos" value="<%=al.getnHermanos()%>" class="form-control">
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