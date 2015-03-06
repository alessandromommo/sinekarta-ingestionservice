//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.03.06 alle 07:09:59 PM CET 
//


package org.sinekarta.ingestionservice.commons.mods;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per reformattingQualityDefinition.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="reformattingQualityDefinition"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="access"/&gt;
 *     &lt;enumeration value="preservation"/&gt;
 *     &lt;enumeration value="replacement"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "reformattingQualityDefinition")
@XmlEnum
public enum ReformattingQualityDefinition {

    @XmlEnumValue("access")
    ACCESS("access"),
    @XmlEnumValue("preservation")
    PRESERVATION("preservation"),
    @XmlEnumValue("replacement")
    REPLACEMENT("replacement");
    private final String value;

    ReformattingQualityDefinition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReformattingQualityDefinition fromValue(String v) {
        for (ReformattingQualityDefinition c: ReformattingQualityDefinition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
