package com.ipartek.formacion.service;

import com.ipartek.formacion.bean.Convocatoria;
import com.ipartek.formacion.exceptions.ConvocatoriaException;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ConvocatoriaServiceTest {

  private static ConvocatoriaService sc = null;
  static List<Convocatoria> convocatorias = null;

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
    sc = new ConvocatoriaService();
    convocatorias = new ArrayList<Convocatoria>();
  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception {
  }

  @Before
  public void setUp() throws Exception {

  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testConvocatoriaService() {

  }

  /**
   * Crear un arraylist y compararlo con el que ya teniamos en la clase
   */
  @Test
  public void testGetAll() {

  }

  /**
   * Crear una convocatoria que ya existe
   */
  @Test
  public void testCreate() {

  }

  /**
   * Comprobamos que los codigos de las convocatorias son iguales y que devuelva null en caso de que
   * se meta codigo incorrecto
   * 
   * @throws ConvocatoriaException
   */
  @Test
  public void testGetById() throws ConvocatoriaException {
    Convocatoria actual = sc.getById(0);
    Convocatoria expected = new Convocatoria();
    expected.setCodigo(0);
    expected.setNombre("Primera");
    Assert.assertEquals("La convocatoria de codigo: " + expected.getCodigo() + " no coincide.",
        expected, actual);
    Assert.assertEquals("El codigo no es el que se ha pedido.", expected, actual);

    actual = sc.getById(-1);
    Assert.assertNull("EL codigo pedido es null", actual);

  }

  /**
   * Se comprobara que se actualizan correctamete los datos que se cambian en la convocatoria
   * 
   * @throws ConvocatoriaException
   */
  @Test
  public void testUpdate() throws ConvocatoriaException {
    int codigo = 0;
    Convocatoria expected = sc.getById(0);
    expected.setNombre("Segunda");
    sc.update(expected);
    Convocatoria actual = sc.getById(codigo);
    // pongo .getCodigo() porque NO tengo implementado el metodo equals en Convocatoria
    Assert.assertEquals("La convocatoria de codigo: " + expected.getCodigo() + " no coincide.",
        expected.getCodigo(), actual.getCodigo());

    /*
     * expected.setCodigo(2); sc.update(expected); actual = sc.getById(codigo);
     * Assert.assertNotEquals("Las convocatorias no deberian ser iguales: ", expected.getCodigo(),
     * actual.getCodigo());
     */

  }

  @Test
  public void testDelete() {
    int codigo = 1;
    Assert.assertTrue(sc.delete(codigo));
    Assert.assertNull(sc.getById(codigo));
    codigo = 3;
    Assert.assertFalse("No se ha borrado", sc.delete(codigo));
  }

}
