package com.ipartek.formacion.webservice.interfaces;

import com.ipartek.formacion.bean.Alumno;
import com.ipartek.formacion.webservice.pojo.AlumnoList;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface AlumnoWS {

  @WebMethod
  public Alumno[] getAll();

  @WebMethod
  public AlumnoList getAllLista();

}
