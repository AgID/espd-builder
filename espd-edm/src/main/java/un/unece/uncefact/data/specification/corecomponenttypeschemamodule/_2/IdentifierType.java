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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000011&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CCT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identifier. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A character string to identify and distinguish
 * 					uniquely, one instance of an object in an identification scheme
 * 					from all other objects in the same scheme together with relevant
 * 					supplementary information.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identifier&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java per IdentifierType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="IdentifierType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;normalizedString"&gt;
 *       &lt;attribute name="schemeID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" /&gt;
 *       &lt;attribute name="schemeName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="schemeAgencyID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" /&gt;
 *       &lt;attribute name="schemeAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="schemeVersionID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" /&gt;
 *       &lt;attribute name="schemeDataURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="schemeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentifierType", propOrder = {
    "value"
})
@XmlSeeAlso({
    oasis.names.specification.ubl.schema.xsd.unqualifieddatatypes_2.IdentifierType.class
})
public class IdentifierType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlValue
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String value;
    @XmlAttribute(name = "schemeID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String schemeID;
    @XmlAttribute(name = "schemeName")
    protected String schemeName;
    @XmlAttribute(name = "schemeAgencyID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String schemeAgencyID;
    @XmlAttribute(name = "schemeAgencyName")
    protected String schemeAgencyName;
    @XmlAttribute(name = "schemeVersionID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String schemeVersionID;
    @XmlAttribute(name = "schemeDataURI")
    @XmlSchemaType(name = "anyURI")
    protected String schemeDataURI;
    @XmlAttribute(name = "schemeURI")
    @XmlSchemaType(name = "anyURI")
    protected String schemeURI;

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
     * Recupera il valore della proprietà schemeID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeID() {
        return schemeID;
    }

    /**
     * Imposta il valore della proprietà schemeID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeID(String value) {
        this.schemeID = value;
    }

    /**
     * Recupera il valore della proprietà schemeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeName() {
        return schemeName;
    }

    /**
     * Imposta il valore della proprietà schemeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeName(String value) {
        this.schemeName = value;
    }

    /**
     * Recupera il valore della proprietà schemeAgencyID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeAgencyID() {
        return schemeAgencyID;
    }

    /**
     * Imposta il valore della proprietà schemeAgencyID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeAgencyID(String value) {
        this.schemeAgencyID = value;
    }

    /**
     * Recupera il valore della proprietà schemeAgencyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeAgencyName() {
        return schemeAgencyName;
    }

    /**
     * Imposta il valore della proprietà schemeAgencyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeAgencyName(String value) {
        this.schemeAgencyName = value;
    }

    /**
     * Recupera il valore della proprietà schemeVersionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeVersionID() {
        return schemeVersionID;
    }

    /**
     * Imposta il valore della proprietà schemeVersionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeVersionID(String value) {
        this.schemeVersionID = value;
    }

    /**
     * Recupera il valore della proprietà schemeDataURI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeDataURI() {
        return schemeDataURI;
    }

    /**
     * Imposta il valore della proprietà schemeDataURI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeDataURI(String value) {
        this.schemeDataURI = value;
    }

    /**
     * Recupera il valore della proprietà schemeURI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeURI() {
        return schemeURI;
    }

    /**
     * Imposta il valore della proprietà schemeURI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeURI(String value) {
        this.schemeURI = value;
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
            String theSchemeID;
            theSchemeID = this.getSchemeID();
            strategy.appendField(locator, this, "schemeID", buffer, theSchemeID, (this.schemeID!= null));
        }
        {
            String theSchemeName;
            theSchemeName = this.getSchemeName();
            strategy.appendField(locator, this, "schemeName", buffer, theSchemeName, (this.schemeName!= null));
        }
        {
            String theSchemeAgencyID;
            theSchemeAgencyID = this.getSchemeAgencyID();
            strategy.appendField(locator, this, "schemeAgencyID", buffer, theSchemeAgencyID, (this.schemeAgencyID!= null));
        }
        {
            String theSchemeAgencyName;
            theSchemeAgencyName = this.getSchemeAgencyName();
            strategy.appendField(locator, this, "schemeAgencyName", buffer, theSchemeAgencyName, (this.schemeAgencyName!= null));
        }
        {
            String theSchemeVersionID;
            theSchemeVersionID = this.getSchemeVersionID();
            strategy.appendField(locator, this, "schemeVersionID", buffer, theSchemeVersionID, (this.schemeVersionID!= null));
        }
        {
            String theSchemeDataURI;
            theSchemeDataURI = this.getSchemeDataURI();
            strategy.appendField(locator, this, "schemeDataURI", buffer, theSchemeDataURI, (this.schemeDataURI!= null));
        }
        {
            String theSchemeURI;
            theSchemeURI = this.getSchemeURI();
            strategy.appendField(locator, this, "schemeURI", buffer, theSchemeURI, (this.schemeURI!= null));
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
        final IdentifierType that = ((IdentifierType) object);
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
            String lhsSchemeID;
            lhsSchemeID = this.getSchemeID();
            String rhsSchemeID;
            rhsSchemeID = that.getSchemeID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schemeID", lhsSchemeID), LocatorUtils.property(thatLocator, "schemeID", rhsSchemeID), lhsSchemeID, rhsSchemeID, (this.schemeID!= null), (that.schemeID!= null))) {
                return false;
            }
        }
        {
            String lhsSchemeName;
            lhsSchemeName = this.getSchemeName();
            String rhsSchemeName;
            rhsSchemeName = that.getSchemeName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schemeName", lhsSchemeName), LocatorUtils.property(thatLocator, "schemeName", rhsSchemeName), lhsSchemeName, rhsSchemeName, (this.schemeName!= null), (that.schemeName!= null))) {
                return false;
            }
        }
        {
            String lhsSchemeAgencyID;
            lhsSchemeAgencyID = this.getSchemeAgencyID();
            String rhsSchemeAgencyID;
            rhsSchemeAgencyID = that.getSchemeAgencyID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schemeAgencyID", lhsSchemeAgencyID), LocatorUtils.property(thatLocator, "schemeAgencyID", rhsSchemeAgencyID), lhsSchemeAgencyID, rhsSchemeAgencyID, (this.schemeAgencyID!= null), (that.schemeAgencyID!= null))) {
                return false;
            }
        }
        {
            String lhsSchemeAgencyName;
            lhsSchemeAgencyName = this.getSchemeAgencyName();
            String rhsSchemeAgencyName;
            rhsSchemeAgencyName = that.getSchemeAgencyName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schemeAgencyName", lhsSchemeAgencyName), LocatorUtils.property(thatLocator, "schemeAgencyName", rhsSchemeAgencyName), lhsSchemeAgencyName, rhsSchemeAgencyName, (this.schemeAgencyName!= null), (that.schemeAgencyName!= null))) {
                return false;
            }
        }
        {
            String lhsSchemeVersionID;
            lhsSchemeVersionID = this.getSchemeVersionID();
            String rhsSchemeVersionID;
            rhsSchemeVersionID = that.getSchemeVersionID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schemeVersionID", lhsSchemeVersionID), LocatorUtils.property(thatLocator, "schemeVersionID", rhsSchemeVersionID), lhsSchemeVersionID, rhsSchemeVersionID, (this.schemeVersionID!= null), (that.schemeVersionID!= null))) {
                return false;
            }
        }
        {
            String lhsSchemeDataURI;
            lhsSchemeDataURI = this.getSchemeDataURI();
            String rhsSchemeDataURI;
            rhsSchemeDataURI = that.getSchemeDataURI();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schemeDataURI", lhsSchemeDataURI), LocatorUtils.property(thatLocator, "schemeDataURI", rhsSchemeDataURI), lhsSchemeDataURI, rhsSchemeDataURI, (this.schemeDataURI!= null), (that.schemeDataURI!= null))) {
                return false;
            }
        }
        {
            String lhsSchemeURI;
            lhsSchemeURI = this.getSchemeURI();
            String rhsSchemeURI;
            rhsSchemeURI = that.getSchemeURI();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schemeURI", lhsSchemeURI), LocatorUtils.property(thatLocator, "schemeURI", rhsSchemeURI), lhsSchemeURI, rhsSchemeURI, (this.schemeURI!= null), (that.schemeURI!= null))) {
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
            String theSchemeID;
            theSchemeID = this.getSchemeID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "schemeID", theSchemeID), currentHashCode, theSchemeID, (this.schemeID!= null));
        }
        {
            String theSchemeName;
            theSchemeName = this.getSchemeName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "schemeName", theSchemeName), currentHashCode, theSchemeName, (this.schemeName!= null));
        }
        {
            String theSchemeAgencyID;
            theSchemeAgencyID = this.getSchemeAgencyID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "schemeAgencyID", theSchemeAgencyID), currentHashCode, theSchemeAgencyID, (this.schemeAgencyID!= null));
        }
        {
            String theSchemeAgencyName;
            theSchemeAgencyName = this.getSchemeAgencyName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "schemeAgencyName", theSchemeAgencyName), currentHashCode, theSchemeAgencyName, (this.schemeAgencyName!= null));
        }
        {
            String theSchemeVersionID;
            theSchemeVersionID = this.getSchemeVersionID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "schemeVersionID", theSchemeVersionID), currentHashCode, theSchemeVersionID, (this.schemeVersionID!= null));
        }
        {
            String theSchemeDataURI;
            theSchemeDataURI = this.getSchemeDataURI();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "schemeDataURI", theSchemeDataURI), currentHashCode, theSchemeDataURI, (this.schemeDataURI!= null));
        }
        {
            String theSchemeURI;
            theSchemeURI = this.getSchemeURI();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "schemeURI", theSchemeURI), currentHashCode, theSchemeURI, (this.schemeURI!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
