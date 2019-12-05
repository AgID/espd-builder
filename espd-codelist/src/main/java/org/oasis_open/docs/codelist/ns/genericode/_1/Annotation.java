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
 * User annotation information.
 * 
 * <p>Classe Java per Annotation complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Annotation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}AnyOtherLanguageContent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AppInfo" type="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}AnyOtherContent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Annotation", propOrder = {
    "description",
    "appInfo"
})
public class Annotation {

    @XmlElement(name = "Description")
    protected List<AnyOtherLanguageContent> description;
    @XmlElement(name = "AppInfo")
    protected AnyOtherContent appInfo;

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnyOtherLanguageContent }
     * 
     * 
     */
    public List<AnyOtherLanguageContent> getDescription() {
        if (description == null) {
            description = new ArrayList<AnyOtherLanguageContent>();
        }
        return this.description;
    }

    /**
     * Recupera il valore della proprietà appInfo.
     * 
     * @return
     *     possible object is
     *     {@link AnyOtherContent }
     *     
     */
    public AnyOtherContent getAppInfo() {
        return appInfo;
    }

    /**
     * Imposta il valore della proprietà appInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyOtherContent }
     *     
     */
    public void setAppInfo(AnyOtherContent value) {
        this.appInfo = value;
    }

}
