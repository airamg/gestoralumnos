
package com.ipartek.formacion.webservice.interfaces;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ipartek.formacion.webservice.interfaces package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ipartek.formacion.webservice.interfaces
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Curso }
     * 
     */
    public Curso createCurso() {
        return new Curso();
    }

    /**
     * Create an instance of {@link Curso.ListadoAlumnos }
     * 
     */
    public Curso.ListadoAlumnos createCursoListadoAlumnos() {
        return new Curso.ListadoAlumnos();
    }

    /**
     * Create an instance of {@link Alumno }
     * 
     */
    public Alumno createAlumno() {
        return new Alumno();
    }

    /**
     * Create an instance of {@link CursoList }
     * 
     */
    public CursoList createCursoList() {
        return new CursoList();
    }

    /**
     * Create an instance of {@link CursoArray }
     * 
     */
    public CursoArray createCursoArray() {
        return new CursoArray();
    }

    /**
     * Create an instance of {@link Curso.ListadoAlumnos.Entry }
     * 
     */
    public Curso.ListadoAlumnos.Entry createCursoListadoAlumnosEntry() {
        return new Curso.ListadoAlumnos.Entry();
    }

}
