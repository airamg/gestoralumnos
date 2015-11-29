package com.ipartek.formacion.webservice.interfaces;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.apache.axis.constants.Use;

import com.ipartek.formacion.bean.Curso;
import com.ipartek.formacion.webservice.pojo.CursoList;

@WebService
@SOAPBinding(style = Style.RPC)
public interface CursoWS {
  
  @WebMethod
  public Curso[] getAll();

  @WebMethod
  public CursoList getAllLista();

}
