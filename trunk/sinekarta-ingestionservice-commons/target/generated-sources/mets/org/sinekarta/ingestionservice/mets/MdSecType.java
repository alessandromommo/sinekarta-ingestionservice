//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.03.05 alle 04:57:45 PM CET 
//


package org.sinekarta.ingestionservice.mets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * mdSecType: Complex Type for Metadata Sections
 * 			A generic framework for pointing to/including metadata within a METS document, a la Warwick Framework.
 * 			
 * 
 * <p>Classe Java per mdSecType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="mdSecType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="mdRef" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attGroup ref="{http://www.loc.gov/METS/}LOCATION"/&gt;
 *                 &lt;attGroup ref="{http://www.loc.gov/METS/}METADATA"/&gt;
 *                 &lt;attGroup ref="{http://www.w3.org/1999/xlink}simpleLink"/&gt;
 *                 &lt;attGroup ref="{http://www.loc.gov/METS/}FILECORE"/&gt;
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *                 &lt;attribute name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="XPTR" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="mdWrap" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="binData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *                   &lt;element name="xmlData" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;any processContents='lax' maxOccurs="unbounded"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/choice&gt;
 *                 &lt;attGroup ref="{http://www.loc.gov/METS/}FILECORE"/&gt;
 *                 &lt;attGroup ref="{http://www.loc.gov/METS/}METADATA"/&gt;
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *                 &lt;attribute name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="GROUPID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ADMID" type="{http://www.w3.org/2001/XMLSchema}IDREFS" /&gt;
 *       &lt;attribute name="CREATED" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mdSecType", propOrder = {

})
public class MdSecType {

    protected MdSecType.MdRef mdRef;
    protected MdSecType.MdWrap mdWrap;
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "GROUPID")
    protected String groupid;
    @XmlAttribute(name = "ADMID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> admid;
    @XmlAttribute(name = "CREATED")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlAttribute(name = "STATUS")
    protected String status;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà mdRef.
     * 
     * @return
     *     possible object is
     *     {@link MdSecType.MdRef }
     *     
     */
    public MdSecType.MdRef getMdRef() {
        return mdRef;
    }

    /**
     * Imposta il valore della proprietà mdRef.
     * 
     * @param value
     *     allowed object is
     *     {@link MdSecType.MdRef }
     *     
     */
    public void setMdRef(MdSecType.MdRef value) {
        this.mdRef = value;
    }

    /**
     * Recupera il valore della proprietà mdWrap.
     * 
     * @return
     *     possible object is
     *     {@link MdSecType.MdWrap }
     *     
     */
    public MdSecType.MdWrap getMdWrap() {
        return mdWrap;
    }

    /**
     * Imposta il valore della proprietà mdWrap.
     * 
     * @param value
     *     allowed object is
     *     {@link MdSecType.MdWrap }
     *     
     */
    public void setMdWrap(MdSecType.MdWrap value) {
        this.mdWrap = value;
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
     * Recupera il valore della proprietà groupid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGROUPID() {
        return groupid;
    }

    /**
     * Imposta il valore della proprietà groupid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGROUPID(String value) {
        this.groupid = value;
    }

    /**
     * Gets the value of the admid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the admid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getADMID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getADMID() {
        if (admid == null) {
            admid = new ArrayList<Object>();
        }
        return this.admid;
    }

    /**
     * Recupera il valore della proprietà created.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCREATED() {
        return created;
    }

    /**
     * Imposta il valore della proprietà created.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCREATED(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Recupera il valore della proprietà status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Imposta il valore della proprietà status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attGroup ref="{http://www.loc.gov/METS/}LOCATION"/&gt;
     *       &lt;attGroup ref="{http://www.loc.gov/METS/}METADATA"/&gt;
     *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}simpleLink"/&gt;
     *       &lt;attGroup ref="{http://www.loc.gov/METS/}FILECORE"/&gt;
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
     *       &lt;attribute name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="XPTR" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MdRef {

        @XmlAttribute(name = "ID")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;
        @XmlAttribute(name = "LABEL")
        protected String mdRefLabel;
        @XmlAttribute(name = "XPTR")
        protected String xptr;
        @XmlAttribute(name = "LOCTYPE", required = true)
        protected String loctype;
        @XmlAttribute(name = "OTHERLOCTYPE")
        protected String otherloctype;
        @XmlAttribute(name = "MDTYPE", required = true)
        protected String mdtype;
        @XmlAttribute(name = "OTHERMDTYPE")
        protected String othermdtype;
        @XmlAttribute(name = "MDTYPEVERSION")
        protected String mdtypeversion;
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
        @XmlAttribute(name = "MIMETYPE")
        protected String mimetype;
        @XmlAttribute(name = "SIZE")
        protected Long size;
        @XmlAttribute(name = "CREATED")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar created;
        @XmlAttribute(name = "CHECKSUM")
        protected String checksum;
        @XmlAttribute(name = "CHECKSUMTYPE")
        protected String checksumtype;

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
         * Recupera il valore della proprietà mdRefLabel.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMdRefLabel() {
            return mdRefLabel;
        }

        /**
         * Imposta il valore della proprietà mdRefLabel.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMdRefLabel(String value) {
            this.mdRefLabel = value;
        }

        /**
         * Recupera il valore della proprietà xptr.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXPTR() {
            return xptr;
        }

        /**
         * Imposta il valore della proprietà xptr.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXPTR(String value) {
            this.xptr = value;
        }

        /**
         * Recupera il valore della proprietà loctype.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLOCTYPE() {
            return loctype;
        }

        /**
         * Imposta il valore della proprietà loctype.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLOCTYPE(String value) {
            this.loctype = value;
        }

        /**
         * Recupera il valore della proprietà otherloctype.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOTHERLOCTYPE() {
            return otherloctype;
        }

        /**
         * Imposta il valore della proprietà otherloctype.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOTHERLOCTYPE(String value) {
            this.otherloctype = value;
        }

        /**
         * Recupera il valore della proprietà mdtype.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMDTYPE() {
            return mdtype;
        }

        /**
         * Imposta il valore della proprietà mdtype.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMDTYPE(String value) {
            this.mdtype = value;
        }

        /**
         * Recupera il valore della proprietà othermdtype.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOTHERMDTYPE() {
            return othermdtype;
        }

        /**
         * Imposta il valore della proprietà othermdtype.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOTHERMDTYPE(String value) {
            this.othermdtype = value;
        }

        /**
         * Recupera il valore della proprietà mdtypeversion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMDTYPEVERSION() {
            return mdtypeversion;
        }

        /**
         * Imposta il valore della proprietà mdtypeversion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMDTYPEVERSION(String value) {
            this.mdtypeversion = value;
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

        /**
         * Recupera il valore della proprietà mimetype.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMIMETYPE() {
            return mimetype;
        }

        /**
         * Imposta il valore della proprietà mimetype.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMIMETYPE(String value) {
            this.mimetype = value;
        }

        /**
         * Recupera il valore della proprietà size.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getSIZE() {
            return size;
        }

        /**
         * Imposta il valore della proprietà size.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setSIZE(Long value) {
            this.size = value;
        }

        /**
         * Recupera il valore della proprietà created.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCREATED() {
            return created;
        }

        /**
         * Imposta il valore della proprietà created.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCREATED(XMLGregorianCalendar value) {
            this.created = value;
        }

        /**
         * Recupera il valore della proprietà checksum.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHECKSUM() {
            return checksum;
        }

        /**
         * Imposta il valore della proprietà checksum.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHECKSUM(String value) {
            this.checksum = value;
        }

        /**
         * Recupera il valore della proprietà checksumtype.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHECKSUMTYPE() {
            return checksumtype;
        }

        /**
         * Imposta il valore della proprietà checksumtype.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHECKSUMTYPE(String value) {
            this.checksumtype = value;
        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice&gt;
     *         &lt;element name="binData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
     *         &lt;element name="xmlData" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;any processContents='lax' maxOccurs="unbounded"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/choice&gt;
     *       &lt;attGroup ref="{http://www.loc.gov/METS/}FILECORE"/&gt;
     *       &lt;attGroup ref="{http://www.loc.gov/METS/}METADATA"/&gt;
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
     *       &lt;attribute name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "binData",
        "xmlData"
    })
    public static class MdWrap {

        protected byte[] binData;
        protected MdSecType.MdWrap.XmlData xmlData;
        @XmlAttribute(name = "ID")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;
        @XmlAttribute(name = "LABEL")
        protected String mdWrapLabel;
        @XmlAttribute(name = "MIMETYPE")
        protected String mimetype;
        @XmlAttribute(name = "SIZE")
        protected Long size;
        @XmlAttribute(name = "CREATED")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar created;
        @XmlAttribute(name = "CHECKSUM")
        protected String checksum;
        @XmlAttribute(name = "CHECKSUMTYPE")
        protected String checksumtype;
        @XmlAttribute(name = "MDTYPE", required = true)
        protected String mdtype;
        @XmlAttribute(name = "OTHERMDTYPE")
        protected String othermdtype;
        @XmlAttribute(name = "MDTYPEVERSION")
        protected String mdtypeversion;

        /**
         * Recupera il valore della proprietà binData.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getBinData() {
            return binData;
        }

        /**
         * Imposta il valore della proprietà binData.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setBinData(byte[] value) {
            this.binData = value;
        }

        /**
         * Recupera il valore della proprietà xmlData.
         * 
         * @return
         *     possible object is
         *     {@link MdSecType.MdWrap.XmlData }
         *     
         */
        public MdSecType.MdWrap.XmlData getXmlData() {
            return xmlData;
        }

        /**
         * Imposta il valore della proprietà xmlData.
         * 
         * @param value
         *     allowed object is
         *     {@link MdSecType.MdWrap.XmlData }
         *     
         */
        public void setXmlData(MdSecType.MdWrap.XmlData value) {
            this.xmlData = value;
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
         * Recupera il valore della proprietà mdWrapLabel.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMdWrapLabel() {
            return mdWrapLabel;
        }

        /**
         * Imposta il valore della proprietà mdWrapLabel.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMdWrapLabel(String value) {
            this.mdWrapLabel = value;
        }

        /**
         * Recupera il valore della proprietà mimetype.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMIMETYPE() {
            return mimetype;
        }

        /**
         * Imposta il valore della proprietà mimetype.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMIMETYPE(String value) {
            this.mimetype = value;
        }

        /**
         * Recupera il valore della proprietà size.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getSIZE() {
            return size;
        }

        /**
         * Imposta il valore della proprietà size.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setSIZE(Long value) {
            this.size = value;
        }

        /**
         * Recupera il valore della proprietà created.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCREATED() {
            return created;
        }

        /**
         * Imposta il valore della proprietà created.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCREATED(XMLGregorianCalendar value) {
            this.created = value;
        }

        /**
         * Recupera il valore della proprietà checksum.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHECKSUM() {
            return checksum;
        }

        /**
         * Imposta il valore della proprietà checksum.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHECKSUM(String value) {
            this.checksum = value;
        }

        /**
         * Recupera il valore della proprietà checksumtype.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHECKSUMTYPE() {
            return checksumtype;
        }

        /**
         * Imposta il valore della proprietà checksumtype.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHECKSUMTYPE(String value) {
            this.checksumtype = value;
        }

        /**
         * Recupera il valore della proprietà mdtype.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMDTYPE() {
            return mdtype;
        }

        /**
         * Imposta il valore della proprietà mdtype.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMDTYPE(String value) {
            this.mdtype = value;
        }

        /**
         * Recupera il valore della proprietà othermdtype.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOTHERMDTYPE() {
            return othermdtype;
        }

        /**
         * Imposta il valore della proprietà othermdtype.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOTHERMDTYPE(String value) {
            this.othermdtype = value;
        }

        /**
         * Recupera il valore della proprietà mdtypeversion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMDTYPEVERSION() {
            return mdtypeversion;
        }

        /**
         * Imposta il valore della proprietà mdtypeversion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMDTYPEVERSION(String value) {
            this.mdtypeversion = value;
        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;any processContents='lax' maxOccurs="unbounded"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "any"
        })
        public static class XmlData {

            @XmlAnyElement(lax = true)
            protected List<Object> any;

            /**
             * Gets the value of the any property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the any property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAny().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * {@link Element }
             * 
             * 
             */
            public List<Object> getAny() {
                if (any == null) {
                    any = new ArrayList<Object>();
                }
                return this.any;
            }

        }

    }

}
