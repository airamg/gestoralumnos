package com.ipartek.formacion.i18n;

import java.util.Locale;

/**
 * Clase con utilidades para los idiomas
 * 
 * @author java
 *
 */
public class I18n {

  /**
   * Para obtener el idioma del navegador y poder cargar el correspondiente
   * 
   * @param localeBrowser
   * @return String - locale del idioma
   */
  public static String getBrowserLocale(Locale localeBrowser) {
    String locale = Idioma.CASTELLANO.getLocale(); // idioma por defecto
    /* validamos que idioma es */
    if (localeBrowser != null) {
      if (localeBrowser.getLanguage().equalsIgnoreCase(Idioma.EUSKERA.getLenguaje())) {
        locale = Idioma.EUSKERA.getLocale();
      } else if (localeBrowser.getLanguage().equalsIgnoreCase(Idioma.INGLES.getLenguaje())) {
        locale = Idioma.INGLES.getLocale();
      }
    }
    return locale;
  }

}
