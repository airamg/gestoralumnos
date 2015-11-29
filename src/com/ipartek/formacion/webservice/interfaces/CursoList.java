
package com.ipartek.formacion.webservice.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cursoList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cursoList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cursos" type="{http://interfaces.webservice.formacion.ipartek.com/}curso" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cursoList", propOrder = {
    "cursos"
})
public class CursoList {

    @XmlElement(nillable = true)
    protected List<Curso> cursos;

    /**
     * Gets the value of the cursos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cursos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCursos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Curso }
     * 
     * 
     */
    public List<Curso> getCursos() {
        if (cursos == null) {
            cursos = new ArrayList<Curso>();
        }
        return this.cursos;
    }

}
