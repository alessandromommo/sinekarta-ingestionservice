//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.03.05 alle 04:57:48 PM CET 
//


package org.sinekarta.ingestionservice.mods;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per issuanceDefinition.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="issuanceDefinition"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="continuing"/&gt;
 *     &lt;enumeration value="monographic"/&gt;
 *     &lt;enumeration value="single unit"/&gt;
 *     &lt;enumeration value="multipart monograph"/&gt;
 *     &lt;enumeration value="serial"/&gt;
 *     &lt;enumeration value="integrating resource"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "issuanceDefinition")
@XmlEnum
public enum IssuanceDefinition {

    @XmlEnumValue("continuing")
    CONTINUING("continuing"),
    @XmlEnumValue("monographic")
    MONOGRAPHIC("monographic"),
    @XmlEnumValue("single unit")
    SINGLE_UNIT("single unit"),
    @XmlEnumValue("multipart monograph")
    MULTIPART_MONOGRAPH("multipart monograph"),
    @XmlEnumValue("serial")
    SERIAL("serial"),
    @XmlEnumValue("integrating resource")
    INTEGRATING_RESOURCE("integrating resource");
    private final String value;

    IssuanceDefinition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IssuanceDefinition fromValue(String v) {
        for (IssuanceDefinition c: IssuanceDefinition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
