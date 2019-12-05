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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Identification and location information
 *                 (metadata).
 * 
 * <p>Classe Java per Identification complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Identification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}NameSet"/&gt;
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;element name="CanonicalUri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;group ref="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}VersionLocationUriSet"/&gt;
 *         &lt;element name="Agency" type="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}Agency" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Identification", propOrder = {
    "shortName",
    "longName",
    "version",
    "canonicalUri",
    "canonicalVersionUri",
    "locationUri",
    "alternateFormatLocationUri",
    "agency"
})
public class Identification {

    @XmlElement(name = "ShortName", required = true)
    protected ShortName shortName;
    @XmlElement(name = "LongName")
    protected List<LongName> longName;
    @XmlElement(name = "Version", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String version;
    @XmlElement(name = "CanonicalUri", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String canonicalUri;
    @XmlElement(name = "CanonicalVersionUri", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String canonicalVersionUri;
    @XmlElement(name = "LocationUri")
    @XmlSchemaType(name = "anyURI")
    protected List<String> locationUri;
    @XmlElement(name = "AlternateFormatLocationUri")
    protected List<MimeTypedUri> alternateFormatLocationUri;
    @XmlElement(name = "Agency")
    protected Agency agency;

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
     * Recupera il valore della proprietà version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Imposta il valore della proprietà version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
     * Gets the value of the alternateFormatLocationUri property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateFormatLocationUri property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateFormatLocationUri().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MimeTypedUri }
     * 
     * 
     */
    public List<MimeTypedUri> getAlternateFormatLocationUri() {
        if (alternateFormatLocationUri == null) {
            alternateFormatLocationUri = new ArrayList<MimeTypedUri>();
        }
        return this.alternateFormatLocationUri;
    }

    /**
     * Recupera il valore della proprietà agency.
     * 
     * @return
     *     possible object is
     *     {@link Agency }
     *     
     */
    public Agency getAgency() {
        return agency;
    }

    /**
     * Imposta il valore della proprietà agency.
     * 
     * @param value
     *     allowed object is
     *     {@link Agency }
     *     
     */
    public void setAgency(Agency value) {
        this.agency = value;
    }

}
