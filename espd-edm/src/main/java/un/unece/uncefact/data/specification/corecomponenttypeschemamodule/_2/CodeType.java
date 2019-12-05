//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package un.unece.uncefact.data.specification.corecomponenttypeschemamodule._2;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000007&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CCT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A character string (letters, figures, or symbols)
 * 					that for brevity and/or languange independence may be used to
 * 					represent or replace a definitive value or text of an attribute
 * 					together with relevant supplementary information.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UsageRule xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Should not be used if the character string
 * 					identifies an instance of an object class or an object in the real
 * 					world, in which case the Identifier. Type should be used.&lt;/ccts:UsageRule&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java per CodeType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CodeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;normalizedString"&gt;
 *       &lt;attribute name="listID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" /&gt;
 *       &lt;attribute name="listAgencyID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" /&gt;
 *       &lt;attribute name="listAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="listName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="listVersionID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="languageID" type="{http://www.w3.org/2001/XMLSchema}language" /&gt;
 *       &lt;attribute name="listURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="listSchemeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeType", propOrder = {
    "value"
})
@XmlSeeAlso({
    oasis.names.specification.ubl.schema.xsd.unqualifieddatatypes_2.CodeType.class
})
public class CodeType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlValue
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String value;
    @XmlAttribute(name = "listID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String listID;
    @XmlAttribute(name = "listAgencyID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String listAgencyID;
    @XmlAttribute(name = "listAgencyName")
    protected String listAgencyName;
    @XmlAttribute(name = "listName")
    protected String listName;
    @XmlAttribute(name = "listVersionID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String listVersionID;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "languageID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String languageID;
    @XmlAttribute(name = "listURI")
    @XmlSchemaType(name = "anyURI")
    protected String listURI;
    @XmlAttribute(name = "listSchemeURI")
    @XmlSchemaType(name = "anyURI")
    protected String listSchemeURI;

    /**
     * Recupera il valore della proprietà value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Imposta il valore della proprietà value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Recupera il valore della proprietà listID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListID() {
        return listID;
    }

    /**
     * Imposta il valore della proprietà listID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListID(String value) {
        this.listID = value;
    }

    /**
     * Recupera il valore della proprietà listAgencyID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListAgencyID() {
        return listAgencyID;
    }

    /**
     * Imposta il valore della proprietà listAgencyID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListAgencyID(String value) {
        this.listAgencyID = value;
    }

    /**
     * Recupera il valore della proprietà listAgencyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListAgencyName() {
        return listAgencyName;
    }

    /**
     * Imposta il valore della proprietà listAgencyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListAgencyName(String value) {
        this.listAgencyName = value;
    }

    /**
     * Recupera il valore della proprietà listName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListName() {
        return listName;
    }

    /**
     * Imposta il valore della proprietà listName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListName(String value) {
        this.listName = value;
    }

    /**
     * Recupera il valore della proprietà listVersionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListVersionID() {
        return listVersionID;
    }

    /**
     * Imposta il valore della proprietà listVersionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListVersionID(String value) {
        this.listVersionID = value;
    }

    /**
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietà languageID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageID() {
        return languageID;
    }

    /**
     * Imposta il valore della proprietà languageID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageID(String value) {
        this.languageID = value;
    }

    /**
     * Recupera il valore della proprietà listURI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListURI() {
        return listURI;
    }

    /**
     * Imposta il valore della proprietà listURI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListURI(String value) {
        this.listURI = value;
    }

    /**
     * Recupera il valore della proprietà listSchemeURI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListSchemeURI() {
        return listSchemeURI;
    }

    /**
     * Imposta il valore della proprietà listSchemeURI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListSchemeURI(String value) {
        this.listSchemeURI = value;
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            String theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
        }
        {
            String theListID;
            theListID = this.getListID();
            strategy.appendField(locator, this, "listID", buffer, theListID, (this.listID!= null));
        }
        {
            String theListAgencyID;
            theListAgencyID = this.getListAgencyID();
            strategy.appendField(locator, this, "listAgencyID", buffer, theListAgencyID, (this.listAgencyID!= null));
        }
        {
            String theListAgencyName;
            theListAgencyName = this.getListAgencyName();
            strategy.appendField(locator, this, "listAgencyName", buffer, theListAgencyName, (this.listAgencyName!= null));
        }
        {
            String theListName;
            theListName = this.getListName();
            strategy.appendField(locator, this, "listName", buffer, theListName, (this.listName!= null));
        }
        {
            String theListVersionID;
            theListVersionID = this.getListVersionID();
            strategy.appendField(locator, this, "listVersionID", buffer, theListVersionID, (this.listVersionID!= null));
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
        }
        {
            String theLanguageID;
            theLanguageID = this.getLanguageID();
            strategy.appendField(locator, this, "languageID", buffer, theLanguageID, (this.languageID!= null));
        }
        {
            String theListURI;
            theListURI = this.getListURI();
            strategy.appendField(locator, this, "listURI", buffer, theListURI, (this.listURI!= null));
        }
        {
            String theListSchemeURI;
            theListSchemeURI = this.getListSchemeURI();
            strategy.appendField(locator, this, "listSchemeURI", buffer, theListSchemeURI, (this.listSchemeURI!= null));
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CodeType that = ((CodeType) object);
        {
            String lhsValue;
            lhsValue = this.getValue();
            String rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue, (this.value!= null), (that.value!= null))) {
                return false;
            }
        }
        {
            String lhsListID;
            lhsListID = this.getListID();
            String rhsListID;
            rhsListID = that.getListID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "listID", lhsListID), LocatorUtils.property(thatLocator, "listID", rhsListID), lhsListID, rhsListID, (this.listID!= null), (that.listID!= null))) {
                return false;
            }
        }
        {
            String lhsListAgencyID;
            lhsListAgencyID = this.getListAgencyID();
            String rhsListAgencyID;
            rhsListAgencyID = that.getListAgencyID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "listAgencyID", lhsListAgencyID), LocatorUtils.property(thatLocator, "listAgencyID", rhsListAgencyID), lhsListAgencyID, rhsListAgencyID, (this.listAgencyID!= null), (that.listAgencyID!= null))) {
                return false;
            }
        }
        {
            String lhsListAgencyName;
            lhsListAgencyName = this.getListAgencyName();
            String rhsListAgencyName;
            rhsListAgencyName = that.getListAgencyName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "listAgencyName", lhsListAgencyName), LocatorUtils.property(thatLocator, "listAgencyName", rhsListAgencyName), lhsListAgencyName, rhsListAgencyName, (this.listAgencyName!= null), (that.listAgencyName!= null))) {
                return false;
            }
        }
        {
            String lhsListName;
            lhsListName = this.getListName();
            String rhsListName;
            rhsListName = that.getListName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "listName", lhsListName), LocatorUtils.property(thatLocator, "listName", rhsListName), lhsListName, rhsListName, (this.listName!= null), (that.listName!= null))) {
                return false;
            }
        }
        {
            String lhsListVersionID;
            lhsListVersionID = this.getListVersionID();
            String rhsListVersionID;
            rhsListVersionID = that.getListVersionID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "listVersionID", lhsListVersionID), LocatorUtils.property(thatLocator, "listVersionID", rhsListVersionID), lhsListVersionID, rhsListVersionID, (this.listVersionID!= null), (that.listVersionID!= null))) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
                return false;
            }
        }
        {
            String lhsLanguageID;
            lhsLanguageID = this.getLanguageID();
            String rhsLanguageID;
            rhsLanguageID = that.getLanguageID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "languageID", lhsLanguageID), LocatorUtils.property(thatLocator, "languageID", rhsLanguageID), lhsLanguageID, rhsLanguageID, (this.languageID!= null), (that.languageID!= null))) {
                return false;
            }
        }
        {
            String lhsListURI;
            lhsListURI = this.getListURI();
            String rhsListURI;
            rhsListURI = that.getListURI();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "listURI", lhsListURI), LocatorUtils.property(thatLocator, "listURI", rhsListURI), lhsListURI, rhsListURI, (this.listURI!= null), (that.listURI!= null))) {
                return false;
            }
        }
        {
            String lhsListSchemeURI;
            lhsListSchemeURI = this.getListSchemeURI();
            String rhsListSchemeURI;
            rhsListSchemeURI = that.getListSchemeURI();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "listSchemeURI", lhsListSchemeURI), LocatorUtils.property(thatLocator, "listSchemeURI", rhsListSchemeURI), lhsListSchemeURI, rhsListSchemeURI, (this.listSchemeURI!= null), (that.listSchemeURI!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            String theValue;
            theValue = this.getValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue, (this.value!= null));
        }
        {
            String theListID;
            theListID = this.getListID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "listID", theListID), currentHashCode, theListID, (this.listID!= null));
        }
        {
            String theListAgencyID;
            theListAgencyID = this.getListAgencyID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "listAgencyID", theListAgencyID), currentHashCode, theListAgencyID, (this.listAgencyID!= null));
        }
        {
            String theListAgencyName;
            theListAgencyName = this.getListAgencyName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "listAgencyName", theListAgencyName), currentHashCode, theListAgencyName, (this.listAgencyName!= null));
        }
        {
            String theListName;
            theListName = this.getListName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "listName", theListName), currentHashCode, theListName, (this.listName!= null));
        }
        {
            String theListVersionID;
            theListVersionID = this.getListVersionID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "listVersionID", theListVersionID), currentHashCode, theListVersionID, (this.listVersionID!= null));
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            String theLanguageID;
            theLanguageID = this.getLanguageID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "languageID", theLanguageID), currentHashCode, theLanguageID, (this.languageID!= null));
        }
        {
            String theListURI;
            theListURI = this.getListURI();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "listURI", theListURI), currentHashCode, theListURI, (this.listURI!= null));
        }
        {
            String theListSchemeURI;
            theListSchemeURI = this.getListSchemeURI();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "listSchemeURI", theListSchemeURI), currentHashCode, theListSchemeURI, (this.listSchemeURI!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
