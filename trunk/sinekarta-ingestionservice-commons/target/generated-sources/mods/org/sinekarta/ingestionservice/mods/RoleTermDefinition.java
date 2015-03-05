//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.03.05 alle 04:57:48 PM CET 
//


package org.sinekarta.ingestionservice.mods;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per roleTermDefinition complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="roleTermDefinition"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.loc.gov/mods/v3&gt;stringPlusLanguagePlusAuthority"&gt;
 *       &lt;attribute name="type" type="{http://www.loc.gov/mods/v3}codeOrText" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "roleTermDefinition")
public class RoleTermDefinition
    extends StringPlusLanguagePlusAuthority
{

    @XmlAttribute(name = "type")
    protected CodeOrText roleTermDefinitionType;

    /**
     * Recupera il valore della proprietà roleTermDefinitionType.
     * 
     * @return
     *     possible object is
     *     {@link CodeOrText }
     *     
     */
    public CodeOrText getRoleTermDefinitionType() {
        return roleTermDefinitionType;
    }

    /**
     * Imposta il valore della proprietà roleTermDefinitionType.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeOrText }
     *     
     */
    public void setRoleTermDefinitionType(CodeOrText value) {
        this.roleTermDefinitionType = value;
    }

}
