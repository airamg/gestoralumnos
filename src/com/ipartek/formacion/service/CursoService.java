package com.ipartek.formacion.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ipartek.formacion.bean.Alumno;
import com.ipartek.formacion.bean.Curso;
import com.ipartek.formacion.exceptions.CursoException;
import com.ipartek.formacion.service.interfaces.ICursoService;
import com.ipartek.formacion.util.TipoCurso;

public class CursoService implements ICursoService {

	private List<Curso> cursos = null;
	
	public CursoService() {
		init();
	}
	
	public Curso getById(int codigo) {
		Curso curso = null;
		int posicion = Curso.CODIGOCURSO;
		posicion = encontrarCurso(codigo);
		//controlar en el caso de que la posición devuelta sea -1
		curso = cursos.get(posicion);
		return curso;
	}
	
	public int update(Curso curso) {
		int posicion = -1, codigo = Curso.CODIGOCURSO;
		// TODO controlar en el caso de que la posición devuelta sea -1
		posicion = encontrarCurso(curso.getCodigo());
		cursos.add(posicion, curso);
		return codigo;
	}
	
	private int encontrarCurso(int codigoCurso) {
		int i = 0, longitud = cursos.size(), posicion = -1;
		boolean encontrado = false;
		do {
			if (cursos.get(i).getCodigo() == codigoCurso) {
				encontrado = true;
				posicion = i;
			}
			i++;
		} while (i < longitud && encontrado == false);
		return posicion;
	}
	

	public List<Curso> getAll() {		
		return cursos;
	}

	public boolean delete(int codigo) {
		boolean exito = false;
		int posicion = encontrarCurso(codigo);

		if (posicion != Curso.CODIGOCURSO) {
			cursos.remove(posicion);
			exito = true;
		}
		return exito;
	}

	public int create(Curso c) {
		int posicion = Curso.CODIGOCURSO;
		cursos.add(c);
		posicion = encontrarCurso(c.getCodigo());
		return posicion;
	}
	
	
	public void addAlumno(Alumno alum) {
		Curso c = cursos.get(0); //si hay mas de 1, llamar al getbyid para saber cual es
		Map<Integer, Alumno> listado = c.getListadoAlumnos();
		listado.put(alum.getCodigoAlumno(), alum);
	}
	
	//recorrer un hashmap para mostrar sus valores
	public Map<Integer, Alumno> readAlumnos(int codigoCurso) {
		Curso c = getById(codigoCurso);
		Map<Integer, Alumno> listado = c.getListadoAlumnos();
		
		for(Map.Entry<Integer, Alumno> entry: listado.entrySet()) {
			Integer codigo = entry.getKey();
			Alumno alum = entry.getValue();			
		}
		return listado;
	}
	
	
	public void incrementarPrecio() {
		//recorrer el arraylist porque es a todos los cursos
		for(int i=0; i<cursos.size(); i++) {
			Curso c = cursos.get(i);
			switch(c.getTipoCurso()) {
				case PROGRAMACION: 
				try {
					c.setPrecio(c.getPrecio()+50.0);
				} catch (CursoException e) {
					e.printStackTrace();
				}
				break;
				case DESIGN:
				try {
					c.setPrecio(c.getPrecio()+70.0);
				} catch (CursoException e) {
					e.printStackTrace();
				}
				break;
				case OFIMATICA:
				try {
					c.setPrecio(c.getPrecio()+150.0);
				} catch (CursoException e) {
					e.printStackTrace();
				}
				break;	
				default: 
					
				break;
			}
		}
	}
	
	private void init() {
		//creamos el objeto de listado de cursos
		cursos = new ArrayList<Curso>();
		//creamos un curso
		Curso c = null;
		try {
			c = new Curso();
			c.setCodigo(1);
			c.setPrecio(100.0);
			c.setNombre("Java");
			c.setTipoCurso(TipoCurso.PROGRAMACION);
			cursos.add(c);
		} catch (CursoException e) {
			e.printStackTrace();
		}		
		//creamos el listado de alumnos
		Map<Integer, Alumno> listadoAlumnos = null;		
		//necesitamos coger la lista de alumnos que teniamos ya creada en alumnoservice
		//creamos el listado de tipo servicio que nos carga la lista completa de alumnos
		AlumnoService as = new AlumnoService();
		ArrayList<Alumno> alumnos = as.getAll();
		//recorrer esta lista para implementarla luego en el hashmap
		listadoAlumnos = new HashMap<Integer, Alumno>();
		//anadir los alumnos al hashmap creado
		for(Alumno al: alumnos) {
			listadoAlumnos.put(al.getCodigoAlumno(), al);
		}
	}
	

}
