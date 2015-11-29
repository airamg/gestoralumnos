package com.ipartek.formacion.controller;

import com.ipartek.formacion.bean.Convocatoria;
import com.ipartek.formacion.service.ConvocatoriaService;
import com.ipartek.formacion.service.interfaces.IConvocatoriaService;
import com.ipartek.formacion.util.Constantes;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * Servlet implementation class ConvocatoriaServlet
 */
public class ConvocatoriaServlet extends HttpServlet {

  private static final long serialVersionUID = 1L;
  private int codigoConv = Convocatoria.CODIGOCONVOCATORIA;
  private ServletConfig config = null;
  private RequestDispatcher dispatcher = null;
  private static final Logger LOG = Logger.getLogger(ConvocatoriaServlet.class);

  /**
   * @see HttpServlet#HttpServlet()
   */
  public ConvocatoriaServlet() {
    super();
  }

  /**
   * @see Servlet#init(ServletConfig)
   */
  public void init(ServletConfig config) throws ServletException {
    this.config = config;
    super.init(config);
  }

  /**
   * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
   */
  protected void service(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    try {
      codigoConv = Integer.parseInt(request.getParameter(Constantes.PAR_CODIGOCONVOCATORIA));
    } catch (Exception e) {
      codigoConv = Convocatoria.CODIGOCONVOCATORIA;
    }
    super.service(request, response);
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    if (codigoConv == Convocatoria.CODIGOCONVOCATORIA) {
      listarTodos(request);
    } else {
      obtenerDatosConvocatoria(request);
    }
    dispatcher.forward(request, response);
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    int op = -1;
    try {
      op = Integer.parseInt((String) request.getAttribute(Constantes.OP_KEY));
    } catch (Exception e) {
      op = -1;
    }
    IConvocatoriaService cs = null;
    switch (op) {
    case Constantes.OP_DELETE:
      cs = new ConvocatoriaService();
      cs.delete(codigoConv);
      break;
    case Constantes.OP_UPDATE: {
      cs = new ConvocatoriaService();
      Convocatoria c = getParametrosConvocatoria(request);
      cs.update(c);
    }
      break;
    case Constantes.OP_CREATE: {
      cs = new ConvocatoriaService();
      Convocatoria c = getParametrosConvocatoria(request);
      cs.create(c);
    }
      break;
    case Constantes.OP_LIST: {
      cs = new ConvocatoriaService();
      cs.getAll();
    }
      break;
    default:
      break;
    }
    dispatcher = request.getRequestDispatcher(Constantes.JSP_BACK_LISTADO_CONVOCATORIA);
    dispatcher.forward(request, response);
  }

  /**
   * Método privado que saca la lista de todos los cursos que hay
   * 
   * @param request
   */
  private void listarTodos(HttpServletRequest request) {
    List<Convocatoria> convocatorias = null;
    IConvocatoriaService cs = new ConvocatoriaService();
    dispatcher = request.getRequestDispatcher(Constantes.JSP_BACK_LISTADO_CONVOCATORIA);
    convocatorias = cs.getAll();
    request.setAttribute(Constantes.ATT_LISTADO_CONVOCATORIAS, convocatorias);
  }

  /**
   * Método privado que obtiene los datos del curso correspondiente
   * 
   * @param request
   */
  private void obtenerDatosConvocatoria(final HttpServletRequest request) {
    Convocatoria c = null;
    IConvocatoriaService cs = new ConvocatoriaService();
    c = cs.getById(codigoConv);
    request.setAttribute(Constantes.ATT_CONVOCATORIA, c);
    dispatcher = request.getRequestDispatcher(Constantes.JSP_BACK_CONVOCATORIA_FORM);
  }

  /**
   * Método privado que recoge todos los parámetros de la convocatoria requerida y devuelve ese
   * nuevo objeto
   * 
   * @param request
   * @return Convocatoria
   */
  private Convocatoria getParametrosConvocatoria(final HttpServletRequest request) {
    Convocatoria c = null;
    try {
      c = new Convocatoria();
      c.setCodigo(codigoConv);
      c.setNombre(request.getParameter(Constantes.ATT_NOMBRE));
      c.setCodigoCurso(Integer.parseInt(request.getParameter(Constantes.ATT_CODCURSO)));
    } catch (Exception e) {
      e.printStackTrace();
    }
    return c;
  }

}
