package com.ipartek.formacion.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.bean.Curso;
import com.ipartek.formacion.service.CursoService;
import com.ipartek.formacion.service.interfaces.ICursoService;
import com.ipartek.formacion.util.Constantes;

/**
 * Servlet implementation class CursoServlet
 */
public class CursoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    private int codigoCurso = Curso.CODIGOCURSO;  
    private ServletConfig config = null;
	private RequestDispatcher distpacher = null;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CursoServlet() {
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
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		try {
			codigoCurso = Integer.parseInt(request.getParameter(Constantes.PAR_CODIGOCURSO));
		} catch (Exception e) {
			codigoCurso = Curso.CODIGOCURSO;
		}
		super.service(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (codigoCurso == Curso.CODIGOCURSO) {
			listarTodos(request);
		} else {
			obtenerDatosCurso(request);
		}		
		//redireccion
		distpacher.forward(request, response);
		
	}

	private void listarTodos(HttpServletRequest request) {
		List<Curso> cursos = null;
		ICursoService cs = new CursoService();		
		distpacher = request.getRequestDispatcher(Constantes.JSP_BACK_LISTADO_CURSO);
		cursos =  cs.getAll();
		request.setAttribute(Constantes.ATT_LISTADO_CURSOS, cursos);
		
	}
	
	private void obtenerDatosCurso(final HttpServletRequest request) {		
		Curso c = null;
		ICursoService cs = new CursoService();
		c = cs.getById(codigoCurso);
		request.setAttribute(Constantes.ATT_CURSO, c);
		distpacher = request.getRequestDispatcher(Constantes.JSP_BACK_CURSO_FORM);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int op = -1;
		try{
			op = Integer.parseInt((String)request.getAttribute(Constantes.OP_KEY));
		}catch(Exception e){
			op = -1;
		}
		ICursoService cs = null;
		switch(op){
			case Constantes.OP_DELETE:
				cs = new CursoService();
				cs.delete(codigoCurso);
				break;
			case Constantes.OP_UPDATE:{
				cs = new CursoService();
				Curso c = getParametrosCurso(request); 
				cs.update(c);
				}break;
			case Constantes.OP_CREATE:{
				cs = new CursoService();
				Curso c = getParametrosCurso(request);
				cs.create(c);
				}break;
			default:
				
				break;
		}
		distpacher = request.getRequestDispatcher(Constantes.JSP_BACK_LISTADO_CURSO);
		distpacher.forward(request, response);
	}
	
	private Curso getParametrosCurso(final HttpServletRequest request){
		Curso c = null;
		try {
			c = new Curso();
			c.setCodigo(Integer.parseInt(request.getParameter(Constantes.PAR_CODIGOCURSO)));
			/* otra forma de poner el codigo 
			 * c.setCodigo(codigoCurso);
			 */			
			c.setNombre(request.getParameter(Constantes.ATT_NOMBRE));
			//recoger todos los demas	
		} catch (Exception e) {			
			e.printStackTrace();
		}	
		
		return c;
	}

}
