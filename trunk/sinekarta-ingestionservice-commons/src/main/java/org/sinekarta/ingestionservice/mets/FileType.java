//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.03.03 alle 07:24:26 PM CET 
//


package org.sinekarta.ingestionservice.mets;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 * fileType: Complex Type for Files
 * 				The file element provides access to content files for a METS object.  A file element may contain one or more FLocat elements, which provide pointers to a content file, and/or an FContent element, which wraps an encoded version of the file. Note that ALL FLocat and FContent elements underneath a single file element should identify/contain identical copies of a single file.
 * 			
 * 
 * <p>Classe Java per fileType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="fileType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FLocat" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attGroup ref="{http://www.w3.org/1999/xlink}simpleLink"/&gt;
 *                 &lt;attGroup ref="{http://www.loc.gov/METS/}LOCATION"/&gt;
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *                 &lt;attribute name="USE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FContent" minOccurs="0"&gt;
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
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *                 &lt;attribute name="USE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="stream" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *                 &lt;attribute name="streamType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="OWNERID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ADMID" type="{http://www.w3.org/2001/XMLSchema}IDREFS" /&gt;
 *                 &lt;attribute name="DMDID" type="{http://www.w3.org/2001/XMLSchema}IDREFS" /&gt;
 *                 &lt;attribute name="BEGIN" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="END" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="BETYPE"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="BYTE"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="transformFile" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *                 &lt;attribute name="TRANSFORMTYPE" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="decompression"/&gt;
 *                       &lt;enumeration value="decryption"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="TRANSFORMALGORITHM" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="TRANSFORMKEY" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="TRANSFORMBEHAVIOR" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
 *                 &lt;attribute name="TRANSFORMORDER" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="file" type="{http://www.loc.gov/METS/}fileType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.loc.gov/METS/}FILECORE"/&gt;
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="SEQ" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="OWNERID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ADMID" type="{http://www.w3.org/2001/XMLSchema}IDREFS" /&gt;
 *       &lt;attribute name="DMDID" type="{http://www.w3.org/2001/XMLSchema}IDREFS" /&gt;
 *       &lt;attribute name="GROUPID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="USE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BEGIN" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="END" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BETYPE"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="BYTE"/&gt;
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
@XmlType(name = "fileType", propOrder = {
    "fLocat",
    "fContent",
    "stream",
    "transformFile",
    "file"
})
public class FileType {

    @XmlElement(name = "FLocat")
    protected List<FileType.FLocat> fLocat;
    @XmlElement(name = "FContent")
    protected FileType.FContent fContent;
    protected List<FileType.Stream> stream;
    protected List<FileType.TransformFile> transformFile;
    protected List<FileType> file;
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "SEQ")
    protected Integer seq;
    @XmlAttribute(name = "OWNERID")
    protected String ownerid;
    @XmlAttribute(name = "ADMID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> admid;
    @XmlAttribute(name = "DMDID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> dmdid;
    @XmlAttribute(name = "GROUPID")
    protected String groupid;
    @XmlAttribute(name = "USE")
    protected String use;
    @XmlAttribute(name = "BEGIN")
    protected String begin;
    @XmlAttribute(name = "END")
    protected String end;
    @XmlAttribute(name = "BETYPE")
    protected String betype;
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
     * Gets the value of the fLocat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fLocat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFLocat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileType.FLocat }
     * 
     * 
     */
    public List<FileType.FLocat> getFLocat() {
        if (fLocat == null) {
            fLocat = new ArrayList<FileType.FLocat>();
        }
        return this.fLocat;
    }

    /**
     * Recupera il valore della proprietà fContent.
     * 
     * @return
     *     possible object is
     *     {@link FileType.FContent }
     *     
     */
    public FileType.FContent getFContent() {
        return fContent;
    }

    /**
     * Imposta il valore della proprietà fContent.
     * 
     * @param value
     *     allowed object is
     *     {@link FileType.FContent }
     *     
     */
    public void setFContent(FileType.FContent value) {
        this.fContent = value;
    }

    /**
     * Gets the value of the stream property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stream property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStream().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileType.Stream }
     * 
     * 
     */
    public List<FileType.Stream> getStream() {
        if (stream == null) {
            stream = new ArrayList<FileType.Stream>();
        }
        return this.stream;
    }

    /**
     * Gets the value of the transformFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transformFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransformFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileType.TransformFile }
     * 
     * 
     */
    public List<FileType.TransformFile> getTransformFile() {
        if (transformFile == null) {
            transformFile = new ArrayList<FileType.TransformFile>();
        }
        return this.transformFile;
    }

    /**
     * Gets the value of the file property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the file property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileType }
     * 
     * 
     */
    public List<FileType> getFile() {
        if (file == null) {
            file = new ArrayList<FileType>();
        }
        return this.file;
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
     * Recupera il valore della proprietà seq.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSEQ() {
        return seq;
    }

    /**
     * Imposta il valore della proprietà seq.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSEQ(Integer value) {
        this.seq = value;
    }

    /**
     * Recupera il valore della proprietà ownerid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOWNERID() {
        return ownerid;
    }

    /**
     * Imposta il valore della proprietà ownerid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOWNERID(String value) {
        this.ownerid = value;
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
     * Recupera il valore della proprietà use.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSE() {
        return use;
    }

    /**
     * Imposta il valore della proprietà use.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSE(String value) {
        this.use = value;
    }

    /**
     * Recupera il valore della proprietà begin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEGIN() {
        return begin;
    }

    /**
     * Imposta il valore della proprietà begin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEGIN(String value) {
        this.begin = value;
    }

    /**
     * Recupera il valore della proprietà end.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEND() {
        return end;
    }

    /**
     * Imposta il valore della proprietà end.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEND(String value) {
        this.end = value;
    }

    /**
     * Recupera il valore della proprietà betype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBETYPE() {
        return betype;
    }

    /**
     * Imposta il valore della proprietà betype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBETYPE(String value) {
        this.betype = value;
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
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
     *       &lt;attribute name="USE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    public static class FContent {

        protected byte[] binData;
        protected FileType.FContent.XmlData xmlData;
        @XmlAttribute(name = "ID")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;
        @XmlAttribute(name = "USE")
        protected String use;

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
         *     {@link FileType.FContent.XmlData }
         *     
         */
        public FileType.FContent.XmlData getXmlData() {
            return xmlData;
        }

        /**
         * Imposta il valore della proprietà xmlData.
         * 
         * @param value
         *     allowed object is
         *     {@link FileType.FContent.XmlData }
         *     
         */
        public void setXmlData(FileType.FContent.XmlData value) {
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
         * Recupera il valore della proprietà use.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUSE() {
            return use;
        }

        /**
         * Imposta il valore della proprietà use.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUSE(String value) {
            this.use = value;
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
     *       &lt;attribute name="USE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FLocat {

        @XmlAttribute(name = "ID")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;
        @XmlAttribute(name = "USE")
        protected String use;
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
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
         * Recupera il valore della proprietà use.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUSE() {
            return use;
        }

        /**
         * Imposta il valore della proprietà use.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUSE(String value) {
            this.use = value;
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
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
     *       &lt;attribute name="streamType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="OWNERID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ADMID" type="{http://www.w3.org/2001/XMLSchema}IDREFS" /&gt;
     *       &lt;attribute name="DMDID" type="{http://www.w3.org/2001/XMLSchema}IDREFS" /&gt;
     *       &lt;attribute name="BEGIN" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="END" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="BETYPE"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="BYTE"/&gt;
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
    @XmlType(name = "")
    public static class Stream {

        @XmlAttribute(name = "ID")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;
        @XmlAttribute(name = "streamType")
        protected String streamType;
        @XmlAttribute(name = "OWNERID")
        protected String ownerid;
        @XmlAttribute(name = "ADMID")
        @XmlIDREF
        @XmlSchemaType(name = "IDREFS")
        protected List<Object> admid;
        @XmlAttribute(name = "DMDID")
        @XmlIDREF
        @XmlSchemaType(name = "IDREFS")
        protected List<Object> dmdid;
        @XmlAttribute(name = "BEGIN")
        protected String begin;
        @XmlAttribute(name = "END")
        protected String end;
        @XmlAttribute(name = "BETYPE")
        protected String betype;

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
         * Recupera il valore della proprietà streamType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStreamType() {
            return streamType;
        }

        /**
         * Imposta il valore della proprietà streamType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStreamType(String value) {
            this.streamType = value;
        }

        /**
         * Recupera il valore della proprietà ownerid.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOWNERID() {
            return ownerid;
        }

        /**
         * Imposta il valore della proprietà ownerid.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOWNERID(String value) {
            this.ownerid = value;
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
         * Recupera il valore della proprietà begin.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBEGIN() {
            return begin;
        }

        /**
         * Imposta il valore della proprietà begin.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBEGIN(String value) {
            this.begin = value;
        }

        /**
         * Recupera il valore della proprietà end.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEND() {
            return end;
        }

        /**
         * Imposta il valore della proprietà end.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEND(String value) {
            this.end = value;
        }

        /**
         * Recupera il valore della proprietà betype.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBETYPE() {
            return betype;
        }

        /**
         * Imposta il valore della proprietà betype.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBETYPE(String value) {
            this.betype = value;
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
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
     *       &lt;attribute name="TRANSFORMTYPE" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="decompression"/&gt;
     *             &lt;enumeration value="decryption"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="TRANSFORMALGORITHM" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="TRANSFORMKEY" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="TRANSFORMBEHAVIOR" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
     *       &lt;attribute name="TRANSFORMORDER" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TransformFile {

        @XmlAttribute(name = "ID")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;
        @XmlAttribute(name = "TRANSFORMTYPE", required = true)
        protected String transformtype;
        @XmlAttribute(name = "TRANSFORMALGORITHM", required = true)
        protected String transformalgorithm;
        @XmlAttribute(name = "TRANSFORMKEY")
        protected String transformkey;
        @XmlAttribute(name = "TRANSFORMBEHAVIOR")
        @XmlIDREF
        @XmlSchemaType(name = "IDREF")
        protected Object transformbehavior;
        @XmlAttribute(name = "TRANSFORMORDER", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger transformorder;

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
         * Recupera il valore della proprietà transformtype.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRANSFORMTYPE() {
            return transformtype;
        }

        /**
         * Imposta il valore della proprietà transformtype.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRANSFORMTYPE(String value) {
            this.transformtype = value;
        }

        /**
         * Recupera il valore della proprietà transformalgorithm.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRANSFORMALGORITHM() {
            return transformalgorithm;
        }

        /**
         * Imposta il valore della proprietà transformalgorithm.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRANSFORMALGORITHM(String value) {
            this.transformalgorithm = value;
        }

        /**
         * Recupera il valore della proprietà transformkey.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRANSFORMKEY() {
            return transformkey;
        }

        /**
         * Imposta il valore della proprietà transformkey.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRANSFORMKEY(String value) {
            this.transformkey = value;
        }

        /**
         * Recupera il valore della proprietà transformbehavior.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getTRANSFORMBEHAVIOR() {
            return transformbehavior;
        }

        /**
         * Imposta il valore della proprietà transformbehavior.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setTRANSFORMBEHAVIOR(Object value) {
            this.transformbehavior = value;
        }

        /**
         * Recupera il valore della proprietà transformorder.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTRANSFORMORDER() {
            return transformorder;
        }

        /**
         * Imposta il valore della proprietà transformorder.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTRANSFORMORDER(BigInteger value) {
            this.transformorder = value;
        }

    }

}
