package com.ipartek.formacion.webservice;

import com.ipartek.formacion.bean.Alumno;
import com.ipartek.formacion.service.AlumnoService;
import com.ipartek.formacion.webservice.interfaces.AlumnoWS;
import com.ipartek.formacion.webservice.pojo.AlumnoList;

import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface = "com.ipartek.formacion.webservice.interfaces.AlumnoWS")
public class AlumnoWSImpl implements AlumnoWS {

  @Override
  public Alumno[] getAll() {
    AlumnoService as = new AlumnoService();
    List<Alumno> als = as.getAll();
    Alumno[] alumnos = (Alumno[]) als.toArray();
    return alumnos;
  }

  @Override
  public AlumnoList getAllLista() {
    AlumnoService as = new AlumnoService();
    AlumnoList alumnoss = new AlumnoList();
    alumnoss.setAlumnos(as.getAll());
    return alumnoss;
  }

}
