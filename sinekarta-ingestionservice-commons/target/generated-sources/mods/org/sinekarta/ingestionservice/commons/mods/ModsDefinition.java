//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.03.13 alle 07:51:13 PM CET 
//


package org.sinekarta.ingestionservice.commons.mods;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per modsDefinition complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="modsDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{http://www.loc.gov/mods/v3}modsGroup" maxOccurs="unbounded"/&gt;
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="version"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="3.5"/&gt;
 *             &lt;enumeration value="3.4"/&gt;
 *             &lt;enumeration value="3.3"/&gt;
 *             &lt;enumeration value="3.2"/&gt;
 *             &lt;enumeration value="3.1"/&gt;
 *             &lt;enumeration value="3.0"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modsDefinition", propOrder = {
    "modsGroup"
})
@XmlSeeAlso({
    Mods.class
})
public class ModsDefinition {

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
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "version")
    protected String version;

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
     * Recupera il valore della proprietà version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Imposta il valore della proprietà version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
