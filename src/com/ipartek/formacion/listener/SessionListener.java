package com.ipartek.formacion.listener;

import com.ipartek.formacion.bean.Usuario;
import com.ipartek.formacion.util.Constantes;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.log4j.Logger;

/**
 * Application Lifecycle Listener implementation class SessionListener
 *
 */
public class SessionListener implements HttpSessionListener, HttpSessionAttributeListener {

  private final static Logger LOG = Logger.getLogger("ACCESOS");

  /**
   * Default constructor.
   */
  public SessionListener() {
  }

  /**
   * @see HttpSessionListener#sessionCreated(HttpSessionEvent).
   */
  @Override
  public void sessionCreated(HttpSessionEvent arg0) {
    HttpSession sesion = arg0.getSession();
    // fijamos el tiempo maximo de sesion (pasarselo en segundos)
    // si ponemos un 0: no caduca la sesion
    sesion.setMaxInactiveInterval(60 * 30);
    SessionListener.LOG.trace("La sesion es: " + sesion.getId());
  }

  /**
   * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent).
   */
  @Override
  public void sessionDestroyed(HttpSessionEvent arg0) {
  }

  /**
   * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent).
   */
  @Override
  public void attributeAdded(HttpSessionBindingEvent arg0) {
    HttpSession sesion = arg0.getSession();
    Usuario user = (Usuario) sesion.getAttribute(Constantes.ATT_USUARIO);
    SessionListener.LOG.trace("Usuario: " + user.getUserName());
  }

  /**
   * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent).
   */
  @Override
  public void attributeRemoved(HttpSessionBindingEvent arg0) {
  }

  /**
   * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent).
   */
  @Override
  public void attributeReplaced(HttpSessionBindingEvent arg0) {
  }

}
