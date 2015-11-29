package com.ipartek.formacion.util;

/**
 * Aquí se guardan las constantes a nivel de proyecto tanto de jsp como servlet
 * 
 * @author java
 *
 */
public class Constantes {

  // ATRIBUTOS
  /**
   * Atributo que sirve para guardar la operación general de alumnos
   */
  public static final String ATT_OPERACION_ALUMNOS = "operacion";
  public static final String ATT_NOMBRE = "nombre";
  public static final String ATT_APEDILLOS = "apellidos";
  public static final String ATT_NHERMANOS = "nhermanos";
  public static final String ATT_FNACIMIENTO = "fnacimiento";
  public static final String ATT_DNI = "dni";

  public static final String ATT_LISTADO_CURSOS = "listadocursos";
  public static final String ATT_LISTADO_CONVOCATORIAS = "listadoconvocatorias";
  public static final String ATT_LISTADO_ALUMNOS = "alumnos";

  public static final String ATT_MENSAJE = "mensaje";
  public static final String ATT_USUARIO = "usuario";
  public static final String ATT_ALUMNO = "alumno";
  public static final String ATT_CURSO = "curso";
  public static final String ATT_CONVOCATORIA = "convocatoria";
  public static final String ATT_CODCURSO = "codcurso";

  // PARAMETROS
  public static final String PAR_USUARIO = "user";
  public static final String PAR_PASSWORD = "password";
  public static final String PAR_CODIGOCURSO = "id";
  public static final String PAR_CODIGOCONVOCATORIA = "cod";

  // URLS O DIRECCIONES WEB
  public static final String LOGIN = "login.jsp";
  public static final String INDEX = "backup/index.jsp";
  public static final String RUTA_BACKUP = "backup/";
  public static final String RUTA_ALUMNOS = "alumno/";
  public static final String RUTA_CONVOCATORIAS = "convocatoria/";
  public static final String RUTA_CURSOS = "curso/";
  public static final String JSP_BACK_INDEX = RUTA_BACKUP + "index.jsp";
  public static final String JSP_BACK_ALUMNO_FORM = RUTA_BACKUP + "alumnos/form.jsp";
  public static final String JSP_BACK_INDEX_ALUMNO = RUTA_BACKUP + "alumnos/alumnos.jsp";
  public static final String JSP_BACK_CURSO_FORM = RUTA_BACKUP + "cursos/formulario.jsp";
  public static final String JSP_BACK_LISTADO_CURSO = RUTA_BACKUP + "cursos/listado.jsp";
  public static final String JSP_BACK_CONVOCATORIA_FORM = RUTA_BACKUP + "convocatorias/form.jsp";
  public static final String JSP_BACK_LISTADO_CONVOCATORIA = RUTA_BACKUP + "convocatorias/list.jsp";

  public static final String SERVLET_LOGIN = "login.do";
  public static final String SERVLET_LOGOUT = "logout.do";
  public static final String SERVLET_ALUMNOS = "alumno.do";
  public static final String SERVLET_CURSOS = "curso.do";
  public static final String SERVLET_CONVOCATORIAS = "convocatoria.do";

  // OPERACIONES
  public static final String OP_KEY = "operation";
  public static final int OP_UPDATE = 0;
  public static final int OP_DELETE = 1;
  public static final int OP_LIST = 2;
  public static final int OP_DETAIL = 3;
  public static final int OP_CREATE = 4;

}
