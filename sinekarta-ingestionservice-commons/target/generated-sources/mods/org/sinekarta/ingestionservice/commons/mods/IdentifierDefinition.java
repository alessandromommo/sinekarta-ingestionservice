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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per identifierDefinition complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="identifierDefinition"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.loc.gov/mods/v3&gt;stringPlusLanguage"&gt;
 *       &lt;attribute name="displayLabel" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="typeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="invalid" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="yes" /&gt;
 *       &lt;attribute name="altRepGroup" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identifierDefinition")
public class IdentifierDefinition
    extends StringPlusLanguage
{

    @XmlAttribute(name = "displayLabel")
    protected String displayLabel;
    @XmlAttribute(name = "type")
    protected String identifierDefinitionType;
    @XmlAttribute(name = "typeURI")
    @XmlSchemaType(name = "anyURI")
    protected String typeURI;
    @XmlAttribute(name = "invalid")
    @XmlSchemaType(name = "anySimpleType")
    protected String invalid;
    @XmlAttribute(name = "altRepGroup")
    protected String altRepGroup;

    /**
     * Recupera il valore della proprietà displayLabel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayLabel() {
        return displayLabel;
    }

    /**
     * Imposta il valore della proprietà displayLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayLabel(String value) {
        this.displayLabel = value;
    }

    /**
     * Recupera il valore della proprietà identifierDefinitionType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifierDefinitionType() {
        return identifierDefinitionType;
    }

    /**
     * Imposta il valore della proprietà identifierDefinitionType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifierDefinitionType(String value) {
        this.identifierDefinitionType = value;
    }

    /**
     * Recupera il valore della proprietà typeURI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeURI() {
        return typeURI;
    }

    /**
     * Imposta il valore della proprietà typeURI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeURI(String value) {
        this.typeURI = value;
    }

    /**
     * Recupera il valore della proprietà invalid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvalid() {
        if (invalid == null) {
            return "yes";
        } else {
            return invalid;
        }
    }

    /**
     * Imposta il valore della proprietà invalid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvalid(String value) {
        this.invalid = value;
    }

    /**
     * Recupera il valore della proprietà altRepGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltRepGroup() {
        return altRepGroup;
    }

    /**
     * Imposta il valore della proprietà altRepGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltRepGroup(String value) {
        this.altRepGroup = value;
    }

}
