package com.ipartek.formacion.webservice.pojo;

import com.ipartek.formacion.bean.Alumno;

import java.util.List;

public class AlumnoList {

  List<Alumno> alumnos;

  public AlumnoList() {
    super();
  }

  public List<Alumno> getAlumnos() {
    return alumnos;
  }

  public void setAlumnos(List<Alumno> alumnos) {
    this.alumnos = alumnos;
  }

}
