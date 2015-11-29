package com.ipartek.formacion.bean;

import java.util.HashMap;
import java.util.Map;

import com.ipartek.formacion.exceptions.CursoException;
import com.ipartek.formacion.util.TipoCurso;

public class Curso {

	public static final int CODIGOCURSO = -1;
	public static final double PRECIO = 0.0;
	
	private int codigo;
	private String nombre;
	private Map<Integer,Alumno> listadoAlumnos;
	private TipoCurso tipoCurso;
	private double precio;
	
	public Curso() throws CursoException {
		super();
		setCodigo(0);
		setNombre("");
		setListadoAlumnos(new HashMap<Integer, Alumno>());
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) throws CursoException {
		if(codigo > CODIGOCURSO) {
			this.codigo = codigo;
		} else {
			throw new CursoException(CursoException.MSG_CODIGO_NO_VALIDO, CursoException.COD_CODIGO_NO_VALIDO);
		}
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Map<Integer, Alumno> getListadoAlumnos() {
		return listadoAlumnos;
	}
	public void setListadoAlumnos(Map<Integer, Alumno> listadoAlumnos) {
		this.listadoAlumnos = listadoAlumnos;
	}

	public TipoCurso getTipoCurso() {
		return tipoCurso;
	}

	public void setTipoCurso(TipoCurso tipoCurso) {
		this.tipoCurso = tipoCurso;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) throws CursoException {
		if(precio >= PRECIO) {
			this.precio = precio; 
		} else {
			throw new CursoException(CursoException.MSG_PRECIO_NO_VALIDO, CursoException.COD_PRECIO_NO_VALIDO);
		}
	}	
	
	

}
