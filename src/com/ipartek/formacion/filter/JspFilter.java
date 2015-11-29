package com.ipartek.formacion.filter;

import com.ipartek.formacion.util.Constantes;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

/**
 * Servlet Filter implementation class JspFilter
 */
public class JspFilter implements Filter {

  private static final Logger logger = Logger.getLogger(JspFilter.class);

  /**
   * Default constructor.
   */
  public JspFilter() {

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

    if (request instanceof HttpServletRequest) {
      HttpServletRequest req = (HttpServletRequest) request;
      RequestDispatcher dispatch = req.getRequestDispatcher(Constantes.LOGIN);
      // mirar cual es el jsp de login (o la pagina de inicio nombre proyecto) para no filtrar ese,
      // porque es al que queremos redirigir
      if (!Constantes.LOGIN.equalsIgnoreCase(req.getRequestURI())
          || !"/JavaWeb/".equalsIgnoreCase(req.getRequestURI())) {
        HttpSession sesion = req.getSession();
        if ((sesion == null) || (sesion.getAttribute(Constantes.ATT_USUARIO) == null)) {
          String ip = req.getHeader("X-FORWARDED-FOR");
          JspFilter.logger.error(req.getRequestURI() + "La IP: " + ip
              + " se ha intentado colar. IP remota: " + req.getRemoteAddr());
          dispatch.forward(req, response);
        } else {
          chain.doFilter(request, response);
        }
      } else {
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
