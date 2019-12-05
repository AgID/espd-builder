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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;rule:text xmlns:rule="http://docs.oasis-open.org/codelist/ns/rule/1.0/" xmlns:gc="http://docs.oasis-open.org/codelist/ns/genericode/1.0/" xmlns:xsd="http://www.w3.org/2001/XMLSchema" category="document" id="R1"&gt;A code list must have at least one key,
 *                     unless it is a metadata-only definition without a 'SimpleCodeList'
 *                     element.&lt;/rule:text&gt;
 * </pre>
 * 
 *             
 * 
 * <p>Classe Java per CodeListDocument complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CodeListDocument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}DocumentHeader"/&gt;
 *         &lt;group ref="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}ColumnSetChoice"/&gt;
 *         &lt;group ref="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}OuterCodeListChoice" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}base"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeListDocument", propOrder = {
    "annotation",
    "identification",
    "columnSet",
    "columnSetRef",
    "simpleCodeList"
})
public class CodeListDocument {

    @XmlElement(name = "Annotation")
    protected Annotation annotation;
    @XmlElement(name = "Identification", required = true)
    protected Identification identification;
    @XmlElement(name = "ColumnSet")
    protected ColumnSet columnSet;
    @XmlElement(name = "ColumnSetRef")
    protected ColumnSetRef columnSetRef;
    @XmlElement(name = "SimpleCodeList")
    protected SimpleCodeList simpleCodeList;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected String base;

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
     * Recupera il valore della proprietà identification.
     * 
     * @return
     *     possible object is
     *     {@link Identification }
     *     
     */
    public Identification getIdentification() {
        return identification;
    }

    /**
     * Imposta il valore della proprietà identification.
     * 
     * @param value
     *     allowed object is
     *     {@link Identification }
     *     
     */
    public void setIdentification(Identification value) {
        this.identification = value;
    }

    /**
     * Recupera il valore della proprietà columnSet.
     * 
     * @return
     *     possible object is
     *     {@link ColumnSet }
     *     
     */
    public ColumnSet getColumnSet() {
        return columnSet;
    }

    /**
     * Imposta il valore della proprietà columnSet.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnSet }
     *     
     */
    public void setColumnSet(ColumnSet value) {
        this.columnSet = value;
    }

    /**
     * Recupera il valore della proprietà columnSetRef.
     * 
     * @return
     *     possible object is
     *     {@link ColumnSetRef }
     *     
     */
    public ColumnSetRef getColumnSetRef() {
        return columnSetRef;
    }

    /**
     * Imposta il valore della proprietà columnSetRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnSetRef }
     *     
     */
    public void setColumnSetRef(ColumnSetRef value) {
        this.columnSetRef = value;
    }

    /**
     * Recupera il valore della proprietà simpleCodeList.
     * 
     * @return
     *     possible object is
     *     {@link SimpleCodeList }
     *     
     */
    public SimpleCodeList getSimpleCodeList() {
        return simpleCodeList;
    }

    /**
     * Imposta il valore della proprietà simpleCodeList.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleCodeList }
     *     
     */
    public void setSimpleCodeList(SimpleCodeList value) {
        this.simpleCodeList = value;
    }

    /**
     * 
     *                     
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;rule:text xmlns:rule="http://docs.oasis-open.org/codelist/ns/rule/1.0/" xmlns:gc="http://docs.oasis-open.org/codelist/ns/genericode/1.0/" xmlns:xsd="http://www.w3.org/2001/XMLSchema" category="application" id="R2"&gt;xml:base does not apply to canonical
     *                         URIs.&lt;/rule:text&gt;
     * </pre>
     * 
     *                 
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase() {
        return base;
    }

    /**
     * Imposta il valore della proprietà base.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase(String value) {
        this.base = value;
    }

}
