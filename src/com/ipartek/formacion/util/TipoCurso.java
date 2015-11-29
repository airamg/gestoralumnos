package com.ipartek.formacion.util;

public enum TipoCurso {
	
	PROGRAMACION("Cursos de programacion"), OFIMATICA("Curso de ofimatica"), DESIGN("Curso de diseño gráfico");
	
	private String descripcion;
	
	TipoCurso(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
