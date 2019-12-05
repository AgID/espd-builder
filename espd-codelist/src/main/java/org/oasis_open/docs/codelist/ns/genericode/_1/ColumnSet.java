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
 * Definition of a column set (columns and keys for a code
 *                 list).
 * 
 * <p>Classe Java per ColumnSet complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ColumnSet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}ColumnSetContent"/&gt;
 *       &lt;attGroup ref="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}DefaultDatatypeLibrary"/&gt;
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}base"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColumnSet", propOrder = {
    "columnChoice",
    "keyChoice"
})
public class ColumnSet {

    @XmlElements({
        @XmlElement(name = "Column", type = Column.class),
        @XmlElement(name = "ColumnRef", type = ColumnRef.class)
    })
    protected List<Object> columnChoice;
    @XmlElements({
        @XmlElement(name = "Key", type = Key.class),
        @XmlElement(name = "KeyRef", type = KeyRef.class)
    })
    protected List<Object> keyChoice;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected String base;
    @XmlAttribute(name = "DatatypeLibrary")
    @XmlSchemaType(name = "anyURI")
    protected String datatypeLibrary;

    /**
     * A choice between a column definition and a column
     *                         reference.Gets the value of the columnChoice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columnChoice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumnChoice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Column }
     * {@link ColumnRef }
     * 
     * 
     */
    public List<Object> getColumnChoice() {
        if (columnChoice == null) {
            columnChoice = new ArrayList<Object>();
        }
        return this.columnChoice;
    }

    /**
     * A choice between a key definition and a key
     *                         reference.Gets the value of the keyChoice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyChoice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyChoice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Key }
     * {@link KeyRef }
     * 
     * 
     */
    public List<Object> getKeyChoice() {
        if (keyChoice == null) {
            keyChoice = new ArrayList<Object>();
        }
        return this.keyChoice;
    }

    /**
     * 
     *                     
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;rule:text xmlns:rule="http://docs.oasis-open.org/codelist/ns/rule/1.0/" xmlns:gc="http://docs.oasis-open.org/codelist/ns/genericode/1.0/" xmlns:xsd="http://www.w3.org/2001/XMLSchema" category="application" id="R15"&gt;xml:base does not apply to canonical
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

    /**
     * Recupera il valore della proprietà datatypeLibrary.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatatypeLibrary() {
        if (datatypeLibrary == null) {
            return "http://www.w3.org/2001/XMLSchema-datatypes";
        } else {
            return datatypeLibrary;
        }
    }

    /**
     * Imposta il valore della proprietà datatypeLibrary.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatatypeLibrary(String value) {
        this.datatypeLibrary = value;
    }

}
