package com.ipartek.formacion;

import java.util.List;

import com.ipartek.formacion.webservice.CursoWSImplService;
import com.ipartek.formacion.webservice.interfaces.Curso;
import com.ipartek.formacion.webservice.interfaces.CursoList;
import com.ipartek.formacion.webservice.CursoWS;

public class Main {

  public static void main(String[] args) {
    CursoWSImplService aservice = new CursoWSImplService();
    CursoWS aserviceInterface = aservice.getCursoWSImplPort();
    CursoList cursolist = aserviceInterface.getAllLista();
    List<Curso> cursos = cursolist.getCursos();
    System.out.println("LISTADO DE CURSOS");
    System.out.println("===============");
    for(int i=0; i<cursos.size(); i++) {
      System.out.println("Nombre: " +cursos.get(i).getNombre());
      System.out.println("Precio: " +cursos.get(i).getPrecio());
      System.out.println("Tipo: " +cursos.get(i).getTipoCurso());
      System.out.println();
    }    
  }

}
