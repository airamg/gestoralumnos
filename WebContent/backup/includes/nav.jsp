 
 <!-- Navigation -->      
<%@page import="com.ipartek.formacion.util.Constantes"%>
<nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">${sessionScope.user_session.nombre } <i class="fa fa-home fa-fw"></i> ${sessionScope.user_session.rol }</a>
            </div>
            <!-- /.navbar-header -->

            <ul class="nav navbar-top-links navbar-right">
                <li>
                    <a href="<%=Constantes.SERVLET_LOGOUT %>">
                    	<i class="fa fa-sign-out fa-fw"></i> <fmt:message key="html.boton.salir"/>
                    </a>
                </li>
                <!-- /.dropdown -->
            </ul>
            <!-- /.navbar-top-links -->

            <div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">   
                    	<!--   <li>
                            <a class="desactive" href="<%=Constantes.INDEX%>" title="Index"><i class="fa fa-archive fa-fw"></i> Inicio</a>
                        </li> -->                    
                        <li>
                            <a class="active" href="<%=Constantes.SERVLET_ALUMNOS%>" title="Gestionar Alumnos"><i class="fa fa-user fa-fw"></i> <fmt:message key="html.menu.alumnos"/></a>
                        </li>
                        <li>
                            <a class="active" href="<%= Constantes.SERVLET_CURSOS %>" title="Gestionar Cursos"><i class="fa fa-dashboard fa-fw"></i> <fmt:message key="html.menu.cursos"/></a>
                        </li>  
                        <li>
                            <a class="active" href="<%= Constantes.SERVLET_CONVOCATORIAS %>" title="Gestionar convocatorias"><i class="fa fa-certificate fa-fw"></i> <fmt:message key="html.menu.convocatorias"/></a>
                        </li>                      
                    </ul>
                </div>               
            </div>
        </nav>
        
       <div id="page-wrapper">
       
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header"><fmt:message key="html.titulo"/></h1>
                </div>
            </div>
            
            
            <!--  Mensajes para el Usuario -->
       		<div class="row">       			
				<%@include file="alerts.jsp" %>
       		</div>
                        
            <!-- /.row -->
            <div class="row">