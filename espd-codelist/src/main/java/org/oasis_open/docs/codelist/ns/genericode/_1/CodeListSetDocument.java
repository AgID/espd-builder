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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Document type for the definition of a set of code
 *                 lists.
 * 
 * <p>Classe Java per CodeListSetDocument complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CodeListSetDocument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}DocumentHeader"/&gt;
 *         &lt;group ref="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}CodeListSetChoice" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "CodeListSetDocument", propOrder = {
    "annotation",
    "identification",
    "codeListSetChoice"
})
public class CodeListSetDocument {

    @XmlElement(name = "Annotation")
    protected Annotation annotation;
    @XmlElement(name = "Identification", required = true)
    protected Identification identification;
    @XmlElements({
        @XmlElement(name = "CodeListRef", type = CodeListRef.class),
        @XmlElement(name = "CodeListSet", type = CodeListSetDocument.class),
        @XmlElement(name = "CodeListSetRef", type = CodeListSetRef.class)
    })
    protected List<Object> codeListSetChoice;
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
     * Contents of the code list set. If the code list set does not
     *                         have any contents, it is a CodeListSet Metadata
     *                         definition.Gets the value of the codeListSetChoice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codeListSetChoice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodeListSetChoice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeListRef }
     * {@link CodeListSetDocument }
     * {@link CodeListSetRef }
     * 
     * 
     */
    public List<Object> getCodeListSetChoice() {
        if (codeListSetChoice == null) {
            codeListSetChoice = new ArrayList<Object>();
        }
        return this.codeListSetChoice;
    }

    /**
     * 
     *                     
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;rule:text xmlns:rule="http://docs.oasis-open.org/codelist/ns/rule/1.0/" xmlns:gc="http://docs.oasis-open.org/codelist/ns/genericode/1.0/" xmlns:xsd="http://www.w3.org/2001/XMLSchema" category="application" id="R11"&gt;xml:base does not apply to canonical
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
