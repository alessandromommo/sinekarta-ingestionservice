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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java per stringPlusLanguage complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="stringPlusLanguage"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attGroup ref="{http://www.loc.gov/mods/v3}languageAttributeGroup"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stringPlusLanguage", propOrder = {
    "value"
})
@XmlSeeAlso({
    AbstractDefinition.class,
    IdentifierDefinition.class,
    NoteDefinition.class,
    TableOfContentsDefinition.class,
    LanguageTermDefinition.class,
    org.sinekarta.ingestionservice.commons.mods.CopyInformationDefinition.Note.class,
    EnumerationAndChronologyDefinition.class,
    NamePartDefinition.class,
    PlaceTermDefinition.class,
    StringPlusLanguagePlusAuthority.class,
    RecordIdentifierDefinition.class,
    DateDefinition.class,
    GeographicCodeDefinition.class,
    PhysicalDescriptionNote.class,
    StringPlusLanguagePlusSupplied.class,
    Text.class
})
public class StringPlusLanguage {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "lang")
    protected String languageAttributeGroupLang;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "script")
    protected String script;
    @XmlAttribute(name = "transliteration")
    protected String transliteration;

    /**
     * Recupera il valore della proprietà value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Imposta il valore della proprietà value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
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
