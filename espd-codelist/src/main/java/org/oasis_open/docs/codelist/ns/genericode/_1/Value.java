//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.12.28 alle 03:37:31 PM CET 
//


package org.oasis_open.docs.codelist.ns.genericode._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * An individual code list metadata value.
 * 
 * <p>Classe Java per Value complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Value"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Annotation" type="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}Annotation" minOccurs="0"/&gt;
 *         &lt;group ref="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}ValueChoice" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}ColumnReference"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Value", propOrder = {
    "annotation",
    "simpleValue",
    "complexValue"
})
public class Value {

    @XmlElement(name = "Annotation")
    protected Annotation annotation;
    @XmlElement(name = "SimpleValue")
    protected SimpleValue simpleValue;
    @XmlElement(name = "ComplexValue")
    protected AnyOtherContent complexValue;
    @XmlAttribute(name = "ColumnRef")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object columnRef;

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
     * Recupera il valore della proprietà simpleValue.
     * 
     * @return
     *     possible object is
     *     {@link SimpleValue }
     *     
     */
    public SimpleValue getSimpleValue() {
        return simpleValue;
    }

    /**
     * Imposta il valore della proprietà simpleValue.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleValue }
     *     
     */
    public void setSimpleValue(SimpleValue value) {
        this.simpleValue = value;
    }

    /**
     * Recupera il valore della proprietà complexValue.
     * 
     * @return
     *     possible object is
     *     {@link AnyOtherContent }
     *     
     */
    public AnyOtherContent getComplexValue() {
        return complexValue;
    }

    /**
     * Imposta il valore della proprietà complexValue.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyOtherContent }
     *     
     */
    public void setComplexValue(AnyOtherContent value) {
        this.complexValue = value;
    }

    /**
     * Recupera il valore della proprietà columnRef.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getColumnRef() {
        return columnRef;
    }

    /**
     * Imposta il valore della proprietà columnRef.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setColumnRef(Object value) {
        this.columnRef = value;
    }

}
