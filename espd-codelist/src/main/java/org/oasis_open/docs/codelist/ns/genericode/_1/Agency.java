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
 * Details of an agency which produces code lists or related
 *                 artifacts.
 * 
 * <p>Classe Java per Agency complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Agency"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShortName" type="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}ShortName" minOccurs="0"/&gt;
 *         &lt;element name="LongName" type="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}LongName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}GeneralIdentifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agency", propOrder = {
    "shortName",
    "longName",
    "identifier"
})
public class Agency {

    @XmlElement(name = "ShortName")
    protected ShortName shortName;
    @XmlElement(name = "LongName")
    protected List<LongName> longName;
    @XmlElement(name = "Identifier")
    protected List<GeneralIdentifier> identifier;

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
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralIdentifier }
     * 
     * 
     */
    public List<GeneralIdentifier> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<GeneralIdentifier>();
        }
        return this.identifier;
    }

}
