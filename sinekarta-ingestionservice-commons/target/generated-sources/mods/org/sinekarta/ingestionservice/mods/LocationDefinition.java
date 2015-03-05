//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.03.05 alle 04:57:48 PM CET 
//


package org.sinekarta.ingestionservice.mods;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per locationDefinition complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="locationDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.loc.gov/mods/v3}physicalLocation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.loc.gov/mods/v3}shelfLocator" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.loc.gov/mods/v3}url" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.loc.gov/mods/v3}holdingSimple" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.loc.gov/mods/v3}holdingExternal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
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
@XmlType(name = "locationDefinition", propOrder = {
    "physicalLocation",
    "shelfLocator",
    "url",
    "holdingSimple",
    "holdingExternal"
})
public class LocationDefinition {

    protected List<PhysicalLocationDefinition> physicalLocation;
    protected List<StringPlusLanguage> shelfLocator;
    protected List<UrlDefinition> url;
    protected HoldingSimpleDefinition holdingSimple;
    protected ExtensionDefinition holdingExternal;
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
     * Gets the value of the physicalLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalLocationDefinition }
     * 
     * 
     */
    public List<PhysicalLocationDefinition> getPhysicalLocation() {
        if (physicalLocation == null) {
            physicalLocation = new ArrayList<PhysicalLocationDefinition>();
        }
        return this.physicalLocation;
    }

    /**
     * Gets the value of the shelfLocator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shelfLocator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShelfLocator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPlusLanguage }
     * 
     * 
     */
    public List<StringPlusLanguage> getShelfLocator() {
        if (shelfLocator == null) {
            shelfLocator = new ArrayList<StringPlusLanguage>();
        }
        return this.shelfLocator;
    }

    /**
     * Gets the value of the url property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the url property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UrlDefinition }
     * 
     * 
     */
    public List<UrlDefinition> getUrl() {
        if (url == null) {
            url = new ArrayList<UrlDefinition>();
        }
        return this.url;
    }

    /**
     * Recupera il valore della proprietà holdingSimple.
     * 
     * @return
     *     possible object is
     *     {@link HoldingSimpleDefinition }
     *     
     */
    public HoldingSimpleDefinition getHoldingSimple() {
        return holdingSimple;
    }

    /**
     * Imposta il valore della proprietà holdingSimple.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldingSimpleDefinition }
     *     
     */
    public void setHoldingSimple(HoldingSimpleDefinition value) {
        this.holdingSimple = value;
    }

    /**
     * Recupera il valore della proprietà holdingExternal.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionDefinition }
     *     
     */
    public ExtensionDefinition getHoldingExternal() {
        return holdingExternal;
    }

    /**
     * Imposta il valore della proprietà holdingExternal.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionDefinition }
     *     
     */
    public void setHoldingExternal(ExtensionDefinition value) {
        this.holdingExternal = value;
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
