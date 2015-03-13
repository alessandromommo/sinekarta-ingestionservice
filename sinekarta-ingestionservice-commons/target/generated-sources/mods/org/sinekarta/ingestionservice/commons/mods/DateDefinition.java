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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per dateDefinition complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="dateDefinition"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.loc.gov/mods/v3&gt;stringPlusLanguage"&gt;
 *       &lt;attribute name="encoding"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="w3cdtf"/&gt;
 *             &lt;enumeration value="iso8601"/&gt;
 *             &lt;enumeration value="marc"/&gt;
 *             &lt;enumeration value="temper"/&gt;
 *             &lt;enumeration value="edtf"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="qualifier"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="approximate"/&gt;
 *             &lt;enumeration value="inferred"/&gt;
 *             &lt;enumeration value="questionable"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="point"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="start"/&gt;
 *             &lt;enumeration value="end"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="keyDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="yes" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dateDefinition")
@XmlSeeAlso({
    DateOtherDefinition.class,
    TemporalDefinition.class
})
public class DateDefinition
    extends StringPlusLanguage
{

    @XmlAttribute(name = "encoding")
    protected String encoding;
    @XmlAttribute(name = "qualifier")
    protected String qualifier;
    @XmlAttribute(name = "point")
    protected String point;
    @XmlAttribute(name = "keyDate")
    @XmlSchemaType(name = "anySimpleType")
    protected String keyDate;

    /**
     * Recupera il valore della proprietà encoding.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Imposta il valore della proprietà encoding.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

    /**
     * Recupera il valore della proprietà qualifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifier() {
        return qualifier;
    }

    /**
     * Imposta il valore della proprietà qualifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifier(String value) {
        this.qualifier = value;
    }

    /**
     * Recupera il valore della proprietà point.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoint() {
        return point;
    }

    /**
     * Imposta il valore della proprietà point.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoint(String value) {
        this.point = value;
    }

    /**
     * Recupera il valore della proprietà keyDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyDate() {
        if (keyDate == null) {
            return "yes";
        } else {
            return keyDate;
        }
    }

    /**
     * Imposta il valore della proprietà keyDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyDate(String value) {
        this.keyDate = value;
    }

}
