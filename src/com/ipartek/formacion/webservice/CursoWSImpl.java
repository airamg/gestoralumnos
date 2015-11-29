package com.ipartek.formacion.webservice;

import java.util.List;

import javax.jws.WebService;

import com.ipartek.formacion.bean.Curso;
import com.ipartek.formacion.service.CursoService;
import com.ipartek.formacion.webservice.interfaces.CursoWS;
import com.ipartek.formacion.webservice.pojo.CursoList;

@WebService(endpointInterface = "com.ipartek.formacion.webservice.interfaces.CursoWS")
public class CursoWSImpl implements CursoWS {

  @Override
  public Curso[] getAll() {
    CursoService cs = new CursoService();
    List<Curso> cus = cs.getAll();
    Curso[] cursos = (Curso[]) cus.toArray();
    return cursos;
  }

  @Override
  public CursoList getAllLista() {
    CursoService cs = new CursoService();
    CursoList cursoss = new CursoList();
    cursoss.setCursos(cs.getAll());
    return cursoss;
  }

}
