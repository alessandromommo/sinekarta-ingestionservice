//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.03.06 alle 07:09:59 PM CET 
//


package org.sinekarta.ingestionservice.commons.mods;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per recordInfoDefinition complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="recordInfoDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{http://www.loc.gov/mods/v3}recordContentSource"/&gt;
 *         &lt;element ref="{http://www.loc.gov/mods/v3}recordCreationDate"/&gt;
 *         &lt;element ref="{http://www.loc.gov/mods/v3}recordChangeDate"/&gt;
 *         &lt;element ref="{http://www.loc.gov/mods/v3}recordIdentifier"/&gt;
 *         &lt;element ref="{http://www.loc.gov/mods/v3}languageOfCataloging"/&gt;
 *         &lt;element ref="{http://www.loc.gov/mods/v3}recordOrigin"/&gt;
 *         &lt;element ref="{http://www.loc.gov/mods/v3}descriptionStandard"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{http://www.loc.gov/mods/v3}languageAttributeGroup"/&gt;
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
@XmlType(name = "recordInfoDefinition", propOrder = {
    "recordContentSourceOrRecordCreationDateOrRecordChangeDate"
})
public class RecordInfoDefinition {

    @XmlElementRefs({
        @XmlElementRef(name = "recordChangeDate", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "descriptionStandard", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "recordContentSource", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "recordOrigin", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "recordCreationDate", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "recordIdentifier", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "languageOfCataloging", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> recordContentSourceOrRecordCreationDateOrRecordChangeDate;
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
     * Gets the value of the recordContentSourceOrRecordCreationDateOrRecordChangeDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordContentSourceOrRecordCreationDateOrRecordChangeDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordContentSourceOrRecordCreationDateOrRecordChangeDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DateDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link StringPlusLanguagePlusAuthority }{@code >}
     * {@link JAXBElement }{@code <}{@link StringPlusLanguagePlusAuthority }{@code >}
     * {@link JAXBElement }{@code <}{@link StringPlusLanguage }{@code >}
     * {@link JAXBElement }{@code <}{@link DateDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link RecordIdentifierDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link LanguageDefinition }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRecordContentSourceOrRecordCreationDateOrRecordChangeDate() {
        if (recordContentSourceOrRecordCreationDateOrRecordChangeDate == null) {
            recordContentSourceOrRecordCreationDateOrRecordChangeDate = new ArrayList<JAXBElement<?>>();
        }
        return this.recordContentSourceOrRecordCreationDateOrRecordChangeDate;
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
