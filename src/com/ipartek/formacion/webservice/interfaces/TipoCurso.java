
package com.ipartek.formacion.webservice.interfaces;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoCurso.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoCurso">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PROGRAMACION"/>
 *     &lt;enumeration value="OFIMATICA"/>
 *     &lt;enumeration value="DESIGN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoCurso")
@XmlEnum
public enum TipoCurso {

    PROGRAMACION,
    OFIMATICA,
    DESIGN;

    public String value() {
        return name();
    }

    public static TipoCurso fromValue(String v) {
        return valueOf(v);
    }

}
