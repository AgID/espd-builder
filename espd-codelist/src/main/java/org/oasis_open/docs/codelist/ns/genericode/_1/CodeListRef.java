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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;rule:text xmlns:rule="http://docs.oasis-open.org/codelist/ns/rule/1.0/" xmlns:gc="http://docs.oasis-open.org/codelist/ns/genericode/1.0/" xmlns:xsd="http://www.w3.org/2001/XMLSchema" category="application" id="R3"&gt;The code list reference must be valid. An
 *                     application may use the CanonicalVersionUri to select a local copy of the code
 *                     list. If there is no CanonicalVersionUri, the CanonicalUri may be used to select
 *                     a local copy of the code list. Otherwise the LocationUri value(s) may be tried
 *                     in order, until a valid code list document is retrieved. An application must
 *                     signal an error to the user if it is not able to retrieve a code list document
 *                     to match the code list reference.&lt;/rule:text&gt;
 * </pre>
 * 
 *             
 * 
 * <p>Classe Java per CodeListRef complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CodeListRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Annotation" type="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}Annotation" minOccurs="0"/&gt;
 *         &lt;element name="CanonicalUri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="CanonicalVersionUri" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="LocationUri" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "CodeListRef", propOrder = {
    "annotation",
    "canonicalUri",
    "canonicalVersionUri",
    "locationUri"
})
public class CodeListRef {

    @XmlElement(name = "Annotation")
    protected Annotation annotation;
    @XmlElement(name = "CanonicalUri", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String canonicalUri;
    @XmlElement(name = "CanonicalVersionUri")
    @XmlSchemaType(name = "anyURI")
    protected String canonicalVersionUri;
    @XmlElement(name = "LocationUri")
    @XmlSchemaType(name = "anyURI")
    protected List<String> locationUri;
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
     * Recupera il valore della proprietà canonicalUri.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanonicalUri() {
        return canonicalUri;
    }

    /**
     * Imposta il valore della proprietà canonicalUri.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanonicalUri(String value) {
        this.canonicalUri = value;
    }

    /**
     * Recupera il valore della proprietà canonicalVersionUri.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanonicalVersionUri() {
        return canonicalVersionUri;
    }

    /**
     * Imposta il valore della proprietà canonicalVersionUri.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanonicalVersionUri(String value) {
        this.canonicalVersionUri = value;
    }

    /**
     * Gets the value of the locationUri property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationUri property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationUri().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLocationUri() {
        if (locationUri == null) {
            locationUri = new ArrayList<String>();
        }
        return this.locationUri;
    }

    /**
     * 
     *                     
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;rule:text xmlns:rule="http://docs.oasis-open.org/codelist/ns/rule/1.0/" xmlns:gc="http://docs.oasis-open.org/codelist/ns/genericode/1.0/" xmlns:xsd="http://www.w3.org/2001/XMLSchema" category="application" id="R10"&gt;xml:base does not apply to canonical
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
