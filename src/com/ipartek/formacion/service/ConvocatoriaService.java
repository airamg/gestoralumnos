package com.ipartek.formacion.service;

import com.ipartek.formacion.bean.Convocatoria;
import com.ipartek.formacion.service.interfaces.IConvocatoriaService;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ConvocatoriaService implements Serializable, IConvocatoriaService {

  private static final long serialVersionUID = 1L;
  private List<Convocatoria> convocatorias = null;

  /**
   * Constructor vacío de la clase ConvocatoriaService Se crean objetos
   */
  public ConvocatoriaService() {
    init();
  }

  /**
   * Método que devuelve la lista completa de convocatorias
   * 
   * @return List<Convocatoria>
   */
  public List<Convocatoria> getAll() {
    return convocatorias;
  }

  /**
   * Método que crea un nuevo objeto de tipo Convocatoria
   * 
   * @return int
   */
  public int create(Convocatoria convocatoria) {
    int i = Convocatoria.CODIGOCONVOCATORIA;
    convocatorias.add(convocatoria);
    i = encontrarConv(convocatoria.getCodigo());
    return i;
  }

  /**
   * Método que busca la convocatoria correspondiente a su código
   * 
   * @return Convocatoria
   */
  public Convocatoria getById(int codigo) {
    Convocatoria conv = null;
    int posicion = Convocatoria.CODIGOCONVOCATORIA;
    posicion = encontrarConv(codigo);
    if (posicion > -1 && posicion < convocatorias.size()) {
      conv = convocatorias.get(posicion);
    }

    return conv;
  }

  /**
   * Método que modifica los datos de la convocatoria y se actualizan todos
   * 
   * @return int
   */
  public int update(Convocatoria convocatoria) {
    int posicion = -1, codigo = Convocatoria.CODIGOCONVOCATORIA;
    posicion = encontrarConv(convocatoria.getCodigo());
    // delete(posicion);
    if (posicion > -1 && posicion < convocatorias.size()) {
      convocatorias.add(posicion, convocatoria);
    }
    return codigo;
  }

  /**
   * Método que borra la convocatoria correspondiente al código
   * 
   * @return boolean
   */
  public boolean delete(int codigo) {
    boolean enc = false;
    int posicion = encontrarConv(codigo);
    if (posicion != Convocatoria.CODIGOCONVOCATORIA) {
      convocatorias.remove(posicion);
      enc = true;
    }
    return enc;
  }

  /**
   * Método privado que busca la convocatoria por el código y devuelve su posición en la lista
   * 
   * @param codigo
   * @return int
   */
  private int encontrarConv(int codigo) {
    int i = 0, longitud = convocatorias.size(), posicion = -1;
    boolean encontrado = false;
    do {
      if (convocatorias.get(i).getCodigo() == codigo) {
        encontrado = true;
        posicion = i;
      }
      i++;
    } while (i < longitud && encontrado == false);
    return posicion;
  }

  /**
   * Método privado para inicializar el constructor con nuevos objetos de tipo Convocatoria
   */
  private void init() {
    convocatorias = new ArrayList<Convocatoria>();
    Convocatoria conv = null;

    try {
      conv = new Convocatoria();
      conv.setCodigo(0);
      conv.setNombre("Primera");
      convocatorias.add(conv);
    } catch (Exception e) {
      e.printStackTrace();
    }
    try {
      conv = new Convocatoria();
      conv.setCodigo(1);
      conv.setNombre("Segunda");
      convocatorias.add(conv);
    } catch (Exception e) {
      e.printStackTrace();
    }
    try {
      conv = new Convocatoria();
      conv.setCodigo(2);
      conv.setNombre("Tercera");
      convocatorias.add(conv);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
