package com.ipartek.formacion.controller;

import com.ipartek.formacion.bean.Alumno;
import com.ipartek.formacion.bean.Usuario;
import com.ipartek.formacion.i18n.I18n;
import com.ipartek.formacion.service.AlumnoService;
import com.ipartek.formacion.service.interfaces.IAlumnoService;
import com.ipartek.formacion.util.Constantes;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  private ServletConfig config;
  String user = null;
  String password = null;
  
  /**
   * @see HttpServlet#HttpServlet()
   */
  public LoginServlet() {
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
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    Locale locale = request.getLocale(); // sabiendo gracias al navegador el idioma que tiene
    HttpSession sesion = request.getSession(true);

    ResourceBundle messages = ResourceBundle.getBundle("com.ipartek.formacion.i18n.i18nmessages",
        locale);
    String local = I18n.getBrowserLocale(locale);
    sesion.setAttribute("idioma", local); // idioma es la variable que referencia (lang) login.jsp
    response.sendRedirect(Constantes.LOGIN);
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // operacion de login (a la que nos lleva el formulario de login.jsp)

    // cargar usuario y contrasena
    String user = null;
    String password = null;

    // recogemos parametros (HACER CON TRY Y CATCH)
    user = request.getParameter(Constantes.PAR_USUARIO);
    password = request.getParameter(Constantes.PAR_PASSWORD);

    // validar parametros
    if (validarUsuarios(user, password)) {
      // crear sesion
      HttpSession sesion = request.getSession(true);

      // guardar atributos en sesion (un objeto de tipo usuario)
      Usuario usuario = new Usuario();
      usuario.setUserName(user);
      usuario.setPassword(password);
      sesion.setAttribute(Constantes.ATT_USUARIO, usuario);
      // mostrar el total de alumnos
      IAlumnoService as = new AlumnoService();
      List<Alumno> alumnos = as.getAll();
      RequestDispatcher dispatcher = null;
      dispatcher = request.getRequestDispatcher(Constantes.INDEX);
      request.setAttribute(Constantes.ATT_LISTADO_ALUMNOS, alumnos);
      // redirigir a la pagina correspondiente
      dispatcher.forward(request, response);
      // otra forma: response.sendRedirect(Constantes.INDEX);

    } else {
      RequestDispatcher dispatcher = null;
      dispatcher = request.getRequestDispatcher(Constantes.LOGIN);
      request.setAttribute(Constantes.ATT_MENSAJE, "usuario o contraseña incorrectos");
      // redirigir a la pagina de error o pantalla de inicio
      dispatcher.forward(request, response);
    }
  }

  private boolean validarUsuarios(String user, String password) {
    boolean valido = false;
    // otra forma: user!=null&&password!=null&&user.equals("maria")&&password.equals("algo")
    if ("maria".equals(user) && "algo".equals(password)) {
      valido = true;
    }
    return valido;
  }
  
  private void generateCookie(HttpServletRequest request, HttpServletResponse response)
  {
    // las cookies sirven para mantener tu informacion (como el recordar pass o dejar sesion iniciada)
    
    Cookie cookieUser = new Cookie("nUsuario", user);
    Cookie cookiePass = new Cookie("nPassword", password);
    cookiePass.setMaxAge(24*60*60); //poner el tiempo que dura la cookie en segundos
    response.addCookie(cookieUser);
    response.addCookie(cookiePass);    
  }
  
  private void readCookie(HttpServletRequest request, HttpServletResponse response) 
  {
    String userName;
    Cookie[] cookies = request.getCookies();
    //recorro todas las cookies, no solo las mias
    for(Cookie cookie: cookies) {
      if("nUsuario".equals(cookie.getName())) {
        userName = cookie.getValue();
      }
    }
  }
  
  private void deleteCookie(HttpServletRequest request, HttpServletResponse response)
  {
    String userName;
    Cookie cookie = null;
    Cookie[] cookies = request.getCookies();
    //recorro todas las cookies y añado la nueva a la cookie creada 
    for(int i=0; i<cookies.length; i++) {
      if("nUsuario".equals(cookies[i].getName())) {
        cookie = cookies[i];
      }
    }
    cookie.setMaxAge(0); //si dura 0 es que se borra
    response.addCookie(cookie);
  }

}
