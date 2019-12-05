//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package org.w3._2001.xmlschema;

import java.time.LocalTime;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, LocalTime>
{


    public LocalTime unmarshal(String value) {
        return (eu.europa.ec.grow.espd.edm.xml.LocalTimeAdapter.unmarshal(value));
    }

    public String marshal(LocalTime value) {
        return (eu.europa.ec.grow.espd.edm.xml.LocalTimeAdapter.marshal(value));
    }

}
