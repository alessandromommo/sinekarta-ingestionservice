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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per relatedItemDefinition complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="relatedItemDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{http://www.loc.gov/mods/v3}modsGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}simpleLink"/&gt;
 *       &lt;attribute name="type"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="preceding"/&gt;
 *             &lt;enumeration value="succeeding"/&gt;
 *             &lt;enumeration value="original"/&gt;
 *             &lt;enumeration value="host"/&gt;
 *             &lt;enumeration value="constituent"/&gt;
 *             &lt;enumeration value="series"/&gt;
 *             &lt;enumeration value="otherVersion"/&gt;
 *             &lt;enumeration value="otherFormat"/&gt;
 *             &lt;enumeration value="isReferencedBy"/&gt;
 *             &lt;enumeration value="references"/&gt;
 *             &lt;enumeration value="reviewOf"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="displayLabel" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "relatedItemDefinition", propOrder = {
    "modsGroup"
})
public class RelatedItemDefinition {

    @XmlElements({
        @XmlElement(name = "abstract", type = AbstractDefinition.class),
        @XmlElement(name = "accessCondition", type = AccessConditionDefinition.class),
        @XmlElement(name = "classification", type = ClassificationDefinition.class),
        @XmlElement(name = "extension", type = ExtensionDefinition.class),
        @XmlElement(name = "genre", type = GenreDefinition.class),
        @XmlElement(name = "identifier", type = IdentifierDefinition.class),
        @XmlElement(name = "language", type = LanguageDefinition.class),
        @XmlElement(name = "location", type = LocationDefinition.class),
        @XmlElement(name = "name", type = NameDefinition.class),
        @XmlElement(name = "note", type = NoteDefinition.class),
        @XmlElement(name = "originInfo", type = OriginInfoDefinition.class),
        @XmlElement(name = "part", type = PartDefinition.class),
        @XmlElement(name = "physicalDescription", type = PhysicalDescriptionDefinition.class),
        @XmlElement(name = "recordInfo", type = RecordInfoDefinition.class),
        @XmlElement(name = "relatedItem", type = RelatedItemDefinition.class),
        @XmlElement(name = "subject", type = SubjectDefinition.class),
        @XmlElement(name = "tableOfContents", type = TableOfContentsDefinition.class),
        @XmlElement(name = "targetAudience", type = TargetAudienceDefinition.class),
        @XmlElement(name = "titleInfo", type = TitleInfoDefinition.class),
        @XmlElement(name = "typeOfResource", type = TypeOfResourceDefinition.class)
    })
    protected List<Object> modsGroup;
    @XmlAttribute(name = "type")
    protected String relatedItemDefinitionType;
    @XmlAttribute(name = "displayLabel")
    protected String displayLabel;
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
     * Gets the value of the modsGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modsGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModsGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractDefinition }
     * {@link AccessConditionDefinition }
     * {@link ClassificationDefinition }
     * {@link ExtensionDefinition }
     * {@link GenreDefinition }
     * {@link IdentifierDefinition }
     * {@link LanguageDefinition }
     * {@link LocationDefinition }
     * {@link NameDefinition }
     * {@link NoteDefinition }
     * {@link OriginInfoDefinition }
     * {@link PartDefinition }
     * {@link PhysicalDescriptionDefinition }
     * {@link RecordInfoDefinition }
     * {@link RelatedItemDefinition }
     * {@link SubjectDefinition }
     * {@link TableOfContentsDefinition }
     * {@link TargetAudienceDefinition }
     * {@link TitleInfoDefinition }
     * {@link TypeOfResourceDefinition }
     * 
     * 
     */
    public List<Object> getModsGroup() {
        if (modsGroup == null) {
            modsGroup = new ArrayList<Object>();
        }
        return this.modsGroup;
    }

    /**
     * Recupera il valore della proprietà relatedItemDefinitionType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedItemDefinitionType() {
        return relatedItemDefinitionType;
    }

    /**
     * Imposta il valore della proprietà relatedItemDefinitionType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedItemDefinitionType(String value) {
        this.relatedItemDefinitionType = value;
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
