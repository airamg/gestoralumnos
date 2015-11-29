package com.ipartek.formacion.webservice.pojo;

import java.util.List;

import com.ipartek.formacion.bean.Curso;

public class CursoList {
  
  List<Curso> cursos;
  
  public CursoList() {
    super();
  }

  public List<Curso> getCursos() {
    return cursos;
  }

  public void setCursos(List<Curso> cursos) {
    this.cursos = cursos;
  }

}
