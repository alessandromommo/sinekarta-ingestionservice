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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per copyInformationDefinition complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="copyInformationDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.loc.gov/mods/v3}form" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.loc.gov/mods/v3}subLocation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.loc.gov/mods/v3}shelfLocator" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.loc.gov/mods/v3}electronicLocator" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="note" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.loc.gov/mods/v3&gt;stringPlusLanguage"&gt;
 *                 &lt;attGroup ref="{http://www.w3.org/1999/xlink}simpleLink"/&gt;
 *                 &lt;attribute name="displayLabel" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.loc.gov/mods/v3}enumerationAndChronology" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "copyInformationDefinition", propOrder = {
    "form",
    "subLocation",
    "shelfLocator",
    "electronicLocator",
    "note",
    "enumerationAndChronology"
})
public class CopyInformationDefinition {

    protected FormDefinition form;
    protected List<StringPlusLanguage> subLocation;
    protected List<StringPlusLanguage> shelfLocator;
    protected List<StringPlusLanguage> electronicLocator;
    protected List<CopyInformationDefinition.Note> note;
    protected List<EnumerationAndChronologyDefinition> enumerationAndChronology;

    /**
     * Recupera il valore della proprietà form.
     * 
     * @return
     *     possible object is
     *     {@link FormDefinition }
     *     
     */
    public FormDefinition getForm() {
        return form;
    }

    /**
     * Imposta il valore della proprietà form.
     * 
     * @param value
     *     allowed object is
     *     {@link FormDefinition }
     *     
     */
    public void setForm(FormDefinition value) {
        this.form = value;
    }

    /**
     * Gets the value of the subLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPlusLanguage }
     * 
     * 
     */
    public List<StringPlusLanguage> getSubLocation() {
        if (subLocation == null) {
            subLocation = new ArrayList<StringPlusLanguage>();
        }
        return this.subLocation;
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
     * Gets the value of the electronicLocator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electronicLocator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectronicLocator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPlusLanguage }
     * 
     * 
     */
    public List<StringPlusLanguage> getElectronicLocator() {
        if (electronicLocator == null) {
            electronicLocator = new ArrayList<StringPlusLanguage>();
        }
        return this.electronicLocator;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CopyInformationDefinition.Note }
     * 
     * 
     */
    public List<CopyInformationDefinition.Note> getNote() {
        if (note == null) {
            note = new ArrayList<CopyInformationDefinition.Note>();
        }
        return this.note;
    }

    /**
     * Gets the value of the enumerationAndChronology property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enumerationAndChronology property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnumerationAndChronology().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumerationAndChronologyDefinition }
     * 
     * 
     */
    public List<EnumerationAndChronologyDefinition> getEnumerationAndChronology() {
        if (enumerationAndChronology == null) {
            enumerationAndChronology = new ArrayList<EnumerationAndChronologyDefinition>();
        }
        return this.enumerationAndChronology;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.loc.gov/mods/v3&gt;stringPlusLanguage"&gt;
     *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}simpleLink"/&gt;
     *       &lt;attribute name="displayLabel" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Note
        extends StringPlusLanguage
    {

        @XmlAttribute(name = "displayLabel")
        protected String displayLabel;
        @XmlAttribute(name = "type")
        protected String copyInformationDefinitionType;
        @XmlAttribute(name = "ID")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;
        @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
        protected String type;
        @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
        @XmlSchemaType(name = "anyURI")
        protected String href;
        @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
        protected String role;
        @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
        protected String arcrole;
        @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
        protected String title;
        @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
        protected String show;
        @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
        protected String actuate;

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
         * Recupera il valore della proprietà copyInformationDefinitionType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCopyInformationDefinitionType() {
            return copyInformationDefinitionType;
        }

        /**
         * Imposta il valore della proprietà copyInformationDefinitionType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCopyInformationDefinitionType(String value) {
            this.copyInformationDefinitionType = value;
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
         * Recupera il valore della proprietà type.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            if (type == null) {
                return "simple";
            } else {
                return type;
            }
        }

        /**
         * Imposta il valore della proprietà type.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Recupera il valore della proprietà href.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHref() {
            return href;
        }

        /**
         * Imposta il valore della proprietà href.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHref(String value) {
            this.href = value;
        }

        /**
         * Recupera il valore della proprietà role.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRole() {
            return role;
        }

        /**
         * Imposta il valore della proprietà role.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRole(String value) {
            this.role = value;
        }

        /**
         * Recupera il valore della proprietà arcrole.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getArcrole() {
            return arcrole;
        }

        /**
         * Imposta il valore della proprietà arcrole.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setArcrole(String value) {
            this.arcrole = value;
        }

        /**
         * Recupera il valore della proprietà title.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitle() {
            return title;
        }

        /**
         * Imposta il valore della proprietà title.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitle(String value) {
            this.title = value;
        }

        /**
         * Recupera il valore della proprietà show.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShow() {
            return show;
        }

        /**
         * Imposta il valore della proprietà show.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShow(String value) {
            this.show = value;
        }

        /**
         * Recupera il valore della proprietà actuate.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActuate() {
            return actuate;
        }

        /**
         * Imposta il valore della proprietà actuate.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActuate(String value) {
            this.actuate = value;
        }

    }

}
