//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.03.06 alle 07:09:59 PM CET 
//


package org.sinekarta.ingestionservice.commons.mods;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per placeDefinition complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="placeDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.loc.gov/mods/v3}placeTerm" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="supplied" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="yes" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "placeDefinition", propOrder = {
    "placeTerm"
})
public class PlaceDefinition {

    @XmlElement(required = true)
    protected List<PlaceTermDefinition> placeTerm;
    @XmlAttribute(name = "supplied")
    @XmlSchemaType(name = "anySimpleType")
    protected String supplied;

    /**
     * Gets the value of the placeTerm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the placeTerm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlaceTerm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlaceTermDefinition }
     * 
     * 
     */
    public List<PlaceTermDefinition> getPlaceTerm() {
        if (placeTerm == null) {
            placeTerm = new ArrayList<PlaceTermDefinition>();
        }
        return this.placeTerm;
    }

    /**
     * Recupera il valore della proprietà supplied.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplied() {
        if (supplied == null) {
            return "yes";
        } else {
            return supplied;
        }
    }

    /**
     * Imposta il valore della proprietà supplied.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplied(String value) {
        this.supplied = value;
    }

}
