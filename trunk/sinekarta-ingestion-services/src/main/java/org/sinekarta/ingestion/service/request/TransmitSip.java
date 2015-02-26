
package org.sinekarta.ingestion.service.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.sinekarta.ingestion.beans.Mets;


@XmlRootElement(name = "transmitSip", namespace = "http://ws.service.sinekarta.org/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transmitSip", namespace = "http://ws.service.sinekarta.org/", propOrder = {"arg0", "arg1"})

public class TransmitSip {

    @XmlElement(name = "arg0")
    private java.lang.String arg0;
    @XmlElement(name = "arg1")
    private Mets arg1;

    public java.lang.String getArg0() {
        return this.arg0;
    }

    public void setArg0(java.lang.String newArg0)  {
        this.arg0 = newArg0;
    }

    public Mets getArg1() {
        return this.arg1;
    }

    public void setArg1(Mets newArg1)  {
        this.arg1 = newArg1;
    }

}

