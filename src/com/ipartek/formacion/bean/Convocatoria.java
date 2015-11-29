package com.ipartek.formacion.bean;

import com.ipartek.formacion.exceptions.ConvocatoriaException;

import java.io.Serializable;

public class Convocatoria implements Serializable {

  private static final long serialVersionUID = 1L;

  public static final int CODIGOCONVOCATORIA = -1;

  private int codigo;
  private String nombre;
  private int codigoCurso;

  /**
   * Constructor vacío de la clase Convocatoria Inicializa los parámetros de la clase
   * 
   * @throws ConvocatoriaException
   */
  public Convocatoria() throws ConvocatoriaException {
    super();
    setCodigo(0);
    setNombre("");
    setCodigoCurso(codigoCurso);
  }

  /**
   * Constructor con parámetros de la clase Convocatoria
   * 
   * @param codigo
   *          - codigo de la convocatoria
   * @param nombre
   *          - nombre de la convocatoria
   * @param codigoCurso
   *          - codigo del curso al que pertenece la convocatoria
   * @throws ConvocatoriaException
   */
  public Convocatoria(int codigo, String nombre, int codigoCurso) throws ConvocatoriaException {
    super();
    setCodigo(codigo);
    setNombre(nombre);
    setCodigoCurso(codigoCurso);
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) throws ConvocatoriaException {
    if (codigo > CODIGOCONVOCATORIA) {
      this.codigo = codigo;
    } else {
      throw new ConvocatoriaException(ConvocatoriaException.MSG_CODIGO_NO_VALIDO,
          ConvocatoriaException.COD_CODIGO_NO_VALIDO);
    }
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getCodigoCurso() {
    return codigoCurso;
  }

  public void setCodigoCurso(int codigoCurso) {
    this.codigoCurso = codigoCurso;
  }

  @Override
  public boolean equals(final Object obj) {
    Convocatoria c = null;
    boolean igual = false;
    if (obj instanceof Convocatoria) {
      c = (Convocatoria) obj;
      if (c.getCodigo() == getCodigo()) {
        igual = true;
      }

    } else {
      throw new UnsupportedOperationException();
    }
    return igual;
  }

}
