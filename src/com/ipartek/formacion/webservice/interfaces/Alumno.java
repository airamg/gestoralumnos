
package com.ipartek.formacion.webservice.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para alumno complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="alumno">
 *   &lt;complexContent>
 *     &lt;extension base="{http://interfaces.webservice.formacion.ipartek.com/}persona">
 *       &lt;sequence>
 *         &lt;element name="apellidos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoAlumno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fNacimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="nHermanos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alumno", propOrder = {
    "apellidos",
    "codigoAlumno",
    "dni",
    "nombre",
    "fNacimiento",
    "nHermanos"
})
public class Alumno
    extends Persona
{

    protected String apellidos;
    protected int codigoAlumno;
    protected String dni;
    protected String nombre;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fNacimiento;
    protected int nHermanos;

    /**
     * Obtiene el valor de la propiedad apellidos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Define el valor de la propiedad apellidos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidos(String value) {
        this.apellidos = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoAlumno.
     * 
     */
    public int getCodigoAlumno() {
        return codigoAlumno;
    }

    /**
     * Define el valor de la propiedad codigoAlumno.
     * 
     */
    public void setCodigoAlumno(int value) {
        this.codigoAlumno = value;
    }

    /**
     * Obtiene el valor de la propiedad dni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDni() {
        return dni;
    }

    /**
     * Define el valor de la propiedad dni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDni(String value) {
        this.dni = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad fNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFNacimiento() {
        return fNacimiento;
    }

    /**
     * Define el valor de la propiedad fNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFNacimiento(XMLGregorianCalendar value) {
        this.fNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad nHermanos.
     * 
     */
    public int getNHermanos() {
        return nHermanos;
    }

    /**
     * Define el valor de la propiedad nHermanos.
     * 
     */
    public void setNHermanos(int value) {
        this.nHermanos = value;
    }

}
