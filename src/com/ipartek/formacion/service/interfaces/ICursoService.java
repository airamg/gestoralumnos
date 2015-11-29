package com.ipartek.formacion.service.interfaces;

import java.util.List;

import com.ipartek.formacion.bean.Curso;

public interface ICursoService {
	
	public Curso getById(final int codigo);
	public List<Curso> getAll();
	public int update(final Curso c);
	public boolean delete(final int codigo);
	public int create(final Curso c);

}
