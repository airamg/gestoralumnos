package com.ipartek.formacion.webservice;

import com.ipartek.formacion.bean.Convocatoria;
import com.ipartek.formacion.service.ConvocatoriaService;
import com.ipartek.formacion.webservice.interfaces.ConvocatoriaWS;

public class ConvocatoriaWSImpl implements ConvocatoriaWS {

  @Override
  public Convocatoria getById(int codigo) {
    ConvocatoriaService cs = new ConvocatoriaService();
    Convocatoria conv = cs.getById(codigo);
    return conv;
  }

  @Override
  public String sayHello() {
    return "Hola mundo";
  }

}
