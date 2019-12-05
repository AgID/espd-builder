//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.12.28 alle 03:37:31 PM CET 
//


package org.oasis_open.docs.codelist.ns.genericode._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;rule:text xmlns:rule="http://docs.oasis-open.org/codelist/ns/rule/1.0/" xmlns:gc="http://docs.oasis-open.org/codelist/ns/genericode/1.0/" xmlns:xsd="http://www.w3.org/2001/XMLSchema" category="application" id="R40"&gt;Applications must not have any dependency
 *                     on the ordering of the rows.&lt;/rule:text&gt;
 * </pre>
 * 
 *             
 * 
 * <p>Classe Java per SimpleCodeList complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SimpleCodeList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Annotation" type="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}Annotation" minOccurs="0"/&gt;
 *         &lt;element name="Row" type="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}Row" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleCodeList", propOrder = {
    "annotation",
    "row"
})
public class SimpleCodeList {

    @XmlElement(name = "Annotation")
    protected Annotation annotation;
    @XmlElement(name = "Row")
    protected List<Row> row;

    /**
     * Recupera il valore della proprietà annotation.
     * 
     * @return
     *     possible object is
     *     {@link Annotation }
     *     
     */
    public Annotation getAnnotation() {
        return annotation;
    }

    /**
     * Imposta il valore della proprietà annotation.
     * 
     * @param value
     *     allowed object is
     *     {@link Annotation }
     *     
     */
    public void setAnnotation(Annotation value) {
        this.annotation = value;
    }

    /**
     * Gets the value of the row property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the row property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Row }
     * 
     * 
     */
    public List<Row> getRow() {
        if (row == null) {
            row = new ArrayList<Row>();
        }
        return this.row;
    }

}
