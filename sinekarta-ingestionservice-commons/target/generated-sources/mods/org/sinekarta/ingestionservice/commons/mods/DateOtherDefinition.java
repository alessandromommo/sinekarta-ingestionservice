//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.03.13 alle 07:51:13 PM CET 
//


package org.sinekarta.ingestionservice.commons.mods;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per dateOtherDefinition complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="dateOtherDefinition"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.loc.gov/mods/v3&gt;dateDefinition"&gt;
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dateOtherDefinition")
public class DateOtherDefinition
    extends DateDefinition
{

    @XmlAttribute(name = "type")
    protected String dateOtherDefinitionType;

    /**
     * Recupera il valore della proprietà dateOtherDefinitionType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOtherDefinitionType() {
        return dateOtherDefinitionType;
    }

    /**
     * Imposta il valore della proprietà dateOtherDefinitionType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOtherDefinitionType(String value) {
        this.dateOtherDefinitionType = value;
    }

}
