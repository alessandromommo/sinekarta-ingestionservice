//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.03.02 alle 05:23:20 PM CET 
//


package org.sinekarta.ingestion.beans;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * divType: Complex Type for Divisions
 * 					The METS standard represents a document structurally as a series of nested div elements, that is, as a hierarchy (e.g., a book, which is composed of chapters, which are composed of subchapters, which are composed of text).  Every div node in the structural map hierarchy may be connected (via subsidiary mptr or fptr elements) to content files which represent that div's portion of the whole document.
 * 
 * SPECIAL NOTE REGARDING DIV ATTRIBUTE VALUES:
 * to clarify the differences between the ORDER, ORDERLABEL, and LABEL attributes for the <div> element, imagine a text with 10 roman numbered pages followed by 10 arabic numbered pages. Page iii would have an ORDER of "3", an ORDERLABEL of "iii" and a LABEL of "Page iii", while page 3 would have an ORDER of "13", an ORDERLABEL of "3" and a LABEL of "Page 3".
 * 			
 * 
 * <p>Classe Java per divType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="divType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mptr" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attGroup ref="{http://www.w3.org/1999/xlink}simpleLink"/&gt;
 *                 &lt;attGroup ref="{http://www.loc.gov/METS/}LOCATION"/&gt;
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *                 &lt;attribute name="CONTENTIDS" type="{http://www.loc.gov/METS/}URIs" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fptr" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="par" type="{http://www.loc.gov/METS/}parType" minOccurs="0"/&gt;
 *                   &lt;element name="seq" type="{http://www.loc.gov/METS/}seqType" minOccurs="0"/&gt;
 *                   &lt;element name="area" type="{http://www.loc.gov/METS/}areaType" minOccurs="0"/&gt;
 *                 &lt;/choice&gt;
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *                 &lt;attribute name="FILEID" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
 *                 &lt;attribute name="CONTENTIDS" type="{http://www.loc.gov/METS/}URIs" /&gt;
 *                 &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="div" type="{http://www.loc.gov/METS/}divType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="ORDER" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="ORDERLABEL" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DMDID" type="{http://www.w3.org/2001/XMLSchema}IDREFS" /&gt;
 *       &lt;attribute name="ADMID" type="{http://www.w3.org/2001/XMLSchema}IDREFS" /&gt;
 *       &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CONTENTIDS" type="{http://www.loc.gov/METS/}URIs" /&gt;
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}label"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "divType", propOrder = {
    "mptr",
    "fptr",
    "div"
})
public class DivType {

    protected List<DivType.Mptr> mptr;
    protected List<DivType.Fptr> fptr;
    protected List<DivType> div;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "ORDER")
    protected BigInteger order;
    @XmlAttribute(name = "ORDERLABEL")
    protected String orderlabel;
    @XmlAttribute(name = "LABEL")
    protected String divTypeLabel;
    @XmlAttribute(name = "DMDID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> dmdid;
    @XmlAttribute(name = "ADMID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> admid;
    @XmlAttribute(name = "TYPE")
    protected String type;
    @XmlAttribute(name = "CONTENTIDS")
    protected List<String> contentids;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    protected String label;

    /**
     * Gets the value of the mptr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mptr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMptr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DivType.Mptr }
     * 
     * 
     */
    public List<DivType.Mptr> getMptr() {
        if (mptr == null) {
            mptr = new ArrayList<DivType.Mptr>();
        }
        return this.mptr;
    }

    /**
     * Gets the value of the fptr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fptr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFptr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DivType.Fptr }
     * 
     * 
     */
    public List<DivType.Fptr> getFptr() {
        if (fptr == null) {
            fptr = new ArrayList<DivType.Fptr>();
        }
        return this.fptr;
    }

    /**
     * Gets the value of the div property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the div property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiv().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DivType }
     * 
     * 
     */
    public List<DivType> getDiv() {
        if (div == null) {
            div = new ArrayList<DivType>();
        }
        return this.div;
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
     * Recupera il valore della proprietà order.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getORDER() {
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
    public void setORDER(BigInteger value) {
        this.order = value;
    }

    /**
     * Recupera il valore della proprietà orderlabel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDERLABEL() {
        return orderlabel;
    }

    /**
     * Imposta il valore della proprietà orderlabel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDERLABEL(String value) {
        this.orderlabel = value;
    }

    /**
     * Recupera il valore della proprietà divTypeLabel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivTypeLabel() {
        return divTypeLabel;
    }

    /**
     * Imposta il valore della proprietà divTypeLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivTypeLabel(String value) {
        this.divTypeLabel = value;
    }

    /**
     * Gets the value of the dmdid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dmdid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDMDID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getDMDID() {
        if (dmdid == null) {
            dmdid = new ArrayList<Object>();
        }
        return this.dmdid;
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
     * Recupera il valore della proprietà type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPE() {
        return type;
    }

    /**
     * Imposta il valore della proprietà type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPE(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the contentids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCONTENTIDS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCONTENTIDS() {
        if (contentids == null) {
            contentids = new ArrayList<String>();
        }
        return this.contentids;
    }

    /**
     * xlink:label - an xlink label to be referred to by an smLink element
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Imposta il valore della proprietà label.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
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
     *         &lt;element name="par" type="{http://www.loc.gov/METS/}parType" minOccurs="0"/&gt;
     *         &lt;element name="seq" type="{http://www.loc.gov/METS/}seqType" minOccurs="0"/&gt;
     *         &lt;element name="area" type="{http://www.loc.gov/METS/}areaType" minOccurs="0"/&gt;
     *       &lt;/choice&gt;
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
     *       &lt;attribute name="FILEID" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
     *       &lt;attribute name="CONTENTIDS" type="{http://www.loc.gov/METS/}URIs" /&gt;
     *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "par",
        "seq",
        "area"
    })
    public static class Fptr {

        protected ParType par;
        protected SeqType seq;
        protected AreaType area;
        @XmlAttribute(name = "ID")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;
        @XmlAttribute(name = "FILEID")
        @XmlIDREF
        @XmlSchemaType(name = "IDREF")
        protected Object fileid;
        @XmlAttribute(name = "CONTENTIDS")
        protected List<String> contentids;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Recupera il valore della proprietà par.
         * 
         * @return
         *     possible object is
         *     {@link ParType }
         *     
         */
        public ParType getPar() {
            return par;
        }

        /**
         * Imposta il valore della proprietà par.
         * 
         * @param value
         *     allowed object is
         *     {@link ParType }
         *     
         */
        public void setPar(ParType value) {
            this.par = value;
        }

        /**
         * Recupera il valore della proprietà seq.
         * 
         * @return
         *     possible object is
         *     {@link SeqType }
         *     
         */
        public SeqType getSeq() {
            return seq;
        }

        /**
         * Imposta il valore della proprietà seq.
         * 
         * @param value
         *     allowed object is
         *     {@link SeqType }
         *     
         */
        public void setSeq(SeqType value) {
            this.seq = value;
        }

        /**
         * Recupera il valore della proprietà area.
         * 
         * @return
         *     possible object is
         *     {@link AreaType }
         *     
         */
        public AreaType getArea() {
            return area;
        }

        /**
         * Imposta il valore della proprietà area.
         * 
         * @param value
         *     allowed object is
         *     {@link AreaType }
         *     
         */
        public void setArea(AreaType value) {
            this.area = value;
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
         * Recupera il valore della proprietà fileid.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getFILEID() {
            return fileid;
        }

        /**
         * Imposta il valore della proprietà fileid.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setFILEID(Object value) {
            this.fileid = value;
        }

        /**
         * Gets the value of the contentids property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contentids property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCONTENTIDS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCONTENTIDS() {
            if (contentids == null) {
                contentids = new ArrayList<String>();
            }
            return this.contentids;
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
     *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}simpleLink"/&gt;
     *       &lt;attGroup ref="{http://www.loc.gov/METS/}LOCATION"/&gt;
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
     *       &lt;attribute name="CONTENTIDS" type="{http://www.loc.gov/METS/}URIs" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Mptr {

        @XmlAttribute(name = "ID")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;
        @XmlAttribute(name = "CONTENTIDS")
        protected List<String> contentids;
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
        @XmlAttribute(name = "LOCTYPE", required = true)
        protected String loctype;
        @XmlAttribute(name = "OTHERLOCTYPE")
        protected String otherloctype;

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
         * Gets the value of the contentids property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contentids property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCONTENTIDS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCONTENTIDS() {
            if (contentids == null) {
                contentids = new ArrayList<String>();
            }
            return this.contentids;
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

    }

}
