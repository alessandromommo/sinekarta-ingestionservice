//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.03.13 alle 07:51:13 PM CET 
//


package org.sinekarta.ingestionservice.commons.mods;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per partDefinition complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="partDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{http://www.loc.gov/mods/v3}detail"/&gt;
 *         &lt;element name="extent" type="{http://www.loc.gov/mods/v3}extentDefinition"/&gt;
 *         &lt;element ref="{http://www.loc.gov/mods/v3}date"/&gt;
 *         &lt;element ref="{http://www.loc.gov/mods/v3}text"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{http://www.loc.gov/mods/v3}languageAttributeGroup"/&gt;
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="order" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="displayLabel" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="altRepGroup" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partDefinition", propOrder = {
    "detailOrExtentOrDate"
})
public class PartDefinition {

    @XmlElements({
        @XmlElement(name = "detail", type = DetailDefinition.class),
        @XmlElement(name = "extent", type = ExtentDefinition.class),
        @XmlElement(name = "date", type = DateDefinition.class),
        @XmlElement(name = "text", type = Text.class)
    })
    protected List<Object> detailOrExtentOrDate;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "type")
    protected String partDefinitionType;
    @XmlAttribute(name = "order")
    protected BigInteger order;
    @XmlAttribute(name = "displayLabel")
    protected String displayLabel;
    @XmlAttribute(name = "altRepGroup")
    protected String altRepGroup;
    @XmlAttribute(name = "lang")
    protected String languageAttributeGroupLang;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "script")
    protected String script;
    @XmlAttribute(name = "transliteration")
    protected String transliteration;

    /**
     * Gets the value of the detailOrExtentOrDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailOrExtentOrDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailOrExtentOrDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailDefinition }
     * {@link ExtentDefinition }
     * {@link DateDefinition }
     * {@link Text }
     * 
     * 
     */
    public List<Object> getDetailOrExtentOrDate() {
        if (detailOrExtentOrDate == null) {
            detailOrExtentOrDate = new ArrayList<Object>();
        }
        return this.detailOrExtentOrDate;
    }

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà partDefinitionType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartDefinitionType() {
        return partDefinitionType;
    }

    /**
     * Imposta il valore della proprietà partDefinitionType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartDefinitionType(String value) {
        this.partDefinitionType = value;
    }

    /**
     * Recupera il valore della proprietà order.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Imposta il valore della proprietà order.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

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

    /**
     * Recupera il valore della proprietà languageAttributeGroupLang.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageAttributeGroupLang() {
        return languageAttributeGroupLang;
    }

    /**
     * Imposta il valore della proprietà languageAttributeGroupLang.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageAttributeGroupLang(String value) {
        this.languageAttributeGroupLang = value;
    }

    /**
     * Recupera il valore della proprietà lang.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Imposta il valore della proprietà lang.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Recupera il valore della proprietà script.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScript() {
        return script;
    }

    /**
     * Imposta il valore della proprietà script.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScript(String value) {
        this.script = value;
    }

    /**
     * Recupera il valore della proprietà transliteration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransliteration() {
        return transliteration;
    }

    /**
     * Imposta il valore della proprietà transliteration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransliteration(String value) {
        this.transliteration = value;
    }

}
