package com.ipartek.formacion.filter;

import com.ipartek.formacion.util.Constantes;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

/**
 * Servlet Filter implementation class BackOffice
 */
public class BackOfficeFilter implements Filter {

  private static final Logger log = Logger.getLogger(BackOfficeFilter.class);

  /**
   * Default constructor.
   */
  public BackOfficeFilter() {
  }

  /**
   * @see Filter#destroy()
   */
  public void destroy() {
  }

  /**
   * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
   */
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    HttpServletRequest req = (HttpServletRequest) request;
    HttpServletResponse res = (HttpServletResponse) response;
    String urlPedida = req.getRequestURL().toString();
    // filtrando por peticion de url para evitar que alguien se meta donde no tiene acceso
    if (urlPedida.contains(Constantes.RUTA_BACKUP)) {
      // le pasas el caracter y te devuelve su posicion urlPedida.indexOf(".");

      // validar la sesion, si no existe que nos eche
      HttpSession sesion = req.getSession();
      if ((sesion == null) || (sesion.getAttribute(Constantes.ATT_USUARIO) == null)) {
        String ip = req.getHeader("X-FORWARDED-FOR");
        BackOfficeFilter.log.error("La IP: " + ip + " se ha intentado colar.");
        /*
         * BORRAR porque se han creado otros filtros res.sendRedirect(Constantes.LOGIN);
         */
      } else {
        // seguir con lo que estaba haciendo
        chain.doFilter(request, response);
      }
    }
  }

  /**
   * @see Filter#init(FilterConfig)
   */
  public void init(FilterConfig fConfig) throws ServletException {
  }

}
