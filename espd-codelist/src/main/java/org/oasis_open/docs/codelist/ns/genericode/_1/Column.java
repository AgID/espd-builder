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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Definition of a column. Each column of a code list defines a piece of
 *                 metadata that can be specified for each item in the code list.
 * 
 * <p>Classe Java per Column complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Column"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Annotation" type="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}Annotation" minOccurs="0"/&gt;
 *         &lt;group ref="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}NameSet"/&gt;
 *         &lt;group ref="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}IdentificationVersionUriSet" minOccurs="0"/&gt;
 *         &lt;element name="Data" type="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}Data"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}RequiredUseDefinition"/&gt;
 *       &lt;attGroup ref="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}IdDefinition"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Column", propOrder = {
    "annotation",
    "shortName",
    "longName",
    "canonicalUri",
    "canonicalVersionUri",
    "data"
})
public class Column {

    @XmlElement(name = "Annotation")
    protected Annotation annotation;
    @XmlElement(name = "ShortName", required = true)
    protected ShortName shortName;
    @XmlElement(name = "LongName")
    protected List<LongName> longName;
    @XmlElement(name = "CanonicalUri")
    @XmlSchemaType(name = "anyURI")
    protected String canonicalUri;
    @XmlElement(name = "CanonicalVersionUri")
    @XmlSchemaType(name = "anyURI")
    protected String canonicalVersionUri;
    @XmlElement(name = "Data", required = true)
    protected Data data;
    @XmlAttribute(name = "Use", required = true)
    protected UseType use;
    @XmlAttribute(name = "Id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

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
     * Recupera il valore della proprietà shortName.
     * 
     * @return
     *     possible object is
     *     {@link ShortName }
     *     
     */
    public ShortName getShortName() {
        return shortName;
    }

    /**
     * Imposta il valore della proprietà shortName.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortName }
     *     
     */
    public void setShortName(ShortName value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the longName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the longName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLongName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LongName }
     * 
     * 
     */
    public List<LongName> getLongName() {
        if (longName == null) {
            longName = new ArrayList<LongName>();
        }
        return this.longName;
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
     * Recupera il valore della proprietà data.
     * 
     * @return
     *     possible object is
     *     {@link Data }
     *     
     */
    public Data getData() {
        return data;
    }

    /**
     * Imposta il valore della proprietà data.
     * 
     * @param value
     *     allowed object is
     *     {@link Data }
     *     
     */
    public void setData(Data value) {
        this.data = value;
    }

    /**
     * Recupera il valore della proprietà use.
     * 
     * @return
     *     possible object is
     *     {@link UseType }
     *     
     */
    public UseType getUse() {
        return use;
    }

    /**
     * Imposta il valore della proprietà use.
     * 
     * @param value
     *     allowed object is
     *     {@link UseType }
     *     
     */
    public void setUse(UseType value) {
        this.use = value;
    }

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
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
    public void setId(String value) {
        this.id = value;
    }

}
