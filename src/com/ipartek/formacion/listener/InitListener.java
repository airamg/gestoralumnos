package com.ipartek.formacion.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Application Lifecycle Listener implementation class InitListener
 *
 */
public class InitListener implements ServletContextListener, ServletContextAttributeListener {

  private static final String PATH_LOG4J = "WEB-INF/conf/log4j.properties";
  private static final Logger LOG = Logger.getLogger(InitListener.class);

  /**
   * Default constructor.
   */
  public InitListener() {
    // TODO Auto-generated constructor stub
  }

  /**
   * @see ServletContextListener#contextInitialized(ServletContextEvent)
   */
  public void contextInitialized(ServletContextEvent arg0) {
    cargalog4j(arg0);
  }

  /**
   * Cargar las propiedades del archivo properties al contexto de nuestro aplicacion. Rutas
   * absolutas siempre
   * 
   * @param sce
   */
  private void cargalog4j(ServletContextEvent sce) {
    try {
      // con la / conseguimos la carpeta anterior a la de nuestro proyecto
      String pathReal = sce.getServletContext().getRealPath("/");
      PropertyConfigurator.configure(pathReal + InitListener.PATH_LOG4J);

      InitListener.LOG.trace("LOG cargado");
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  /**
   * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
   */
  public void attributeAdded(ServletContextAttributeEvent arg0) {
    // TODO Auto-generated method stub
  }

  /**
   * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
   */
  public void attributeReplaced(ServletContextAttributeEvent arg0) {
    // TODO Auto-generated method stub
  }

  /**
   * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
   */
  public void attributeRemoved(ServletContextAttributeEvent arg0) {
    // TODO Auto-generated method stub
  }

  /**
   * @see ServletContextListener#contextDestroyed(ServletContextEvent)
   */
  public void contextDestroyed(ServletContextEvent arg0) {
    // TODO Auto-generated method stub
  }

}
