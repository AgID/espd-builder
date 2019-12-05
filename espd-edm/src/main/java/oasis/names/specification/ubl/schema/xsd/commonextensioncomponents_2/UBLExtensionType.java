//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package oasis.names.specification.ubl.schema.xsd.commonextensioncomponents_2;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NameType;
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
 * 				A single extension for private use.
 * 			
 * 
 * <p>Classe Java per UBLExtensionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UBLExtensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}ExtensionAgencyID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}ExtensionAgencyName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}ExtensionVersionID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}ExtensionAgencyURI" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}ExtensionURI" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}ExtensionReasonCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}ExtensionReason" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}ExtensionContent"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UBLExtensionType", propOrder = {
    "id",
    "name",
    "extensionAgencyID",
    "extensionAgencyName",
    "extensionVersionID",
    "extensionAgencyURI",
    "extensionURI",
    "extensionReasonCode",
    "extensionReason",
    "extensionContent"
})
public class UBLExtensionType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NameType name;
    @XmlElement(name = "ExtensionAgencyID")
    protected ExtensionAgencyIDType extensionAgencyID;
    @XmlElement(name = "ExtensionAgencyName")
    protected ExtensionAgencyNameType extensionAgencyName;
    @XmlElement(name = "ExtensionVersionID")
    protected ExtensionVersionIDType extensionVersionID;
    @XmlElement(name = "ExtensionAgencyURI")
    protected ExtensionAgencyURIType extensionAgencyURI;
    @XmlElement(name = "ExtensionURI")
    protected ExtensionURIType extensionURI;
    @XmlElement(name = "ExtensionReasonCode")
    protected ExtensionReasonCodeType extensionReasonCode;
    @XmlElement(name = "ExtensionReason")
    protected ExtensionReasonType extensionReason;
    @XmlElement(name = "ExtensionContent", required = true)
    protected ExtensionContentType extensionContent;

    /**
     * 
     * 						An identifier for the Extension assigned by the creator of the
     * 						extension.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getID() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setID(IDType value) {
        this.id = value;
    }

    /**
     * 
     * 						A name for the Extension assigned by the creator of the extension.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setName(NameType value) {
        this.name = value;
    }

    /**
     * 
     * 						An agency that maintains one or more Extensions.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link ExtensionAgencyIDType }
     *     
     */
    public ExtensionAgencyIDType getExtensionAgencyID() {
        return extensionAgencyID;
    }

    /**
     * Imposta il valore della proprietà extensionAgencyID.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionAgencyIDType }
     *     
     */
    public void setExtensionAgencyID(ExtensionAgencyIDType value) {
        this.extensionAgencyID = value;
    }

    /**
     * 
     * 						The name of the agency that maintains the Extension.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link ExtensionAgencyNameType }
     *     
     */
    public ExtensionAgencyNameType getExtensionAgencyName() {
        return extensionAgencyName;
    }

    /**
     * Imposta il valore della proprietà extensionAgencyName.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionAgencyNameType }
     *     
     */
    public void setExtensionAgencyName(ExtensionAgencyNameType value) {
        this.extensionAgencyName = value;
    }

    /**
     * 
     * 						The version of the Extension.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link ExtensionVersionIDType }
     *     
     */
    public ExtensionVersionIDType getExtensionVersionID() {
        return extensionVersionID;
    }

    /**
     * Imposta il valore della proprietà extensionVersionID.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionVersionIDType }
     *     
     */
    public void setExtensionVersionID(ExtensionVersionIDType value) {
        this.extensionVersionID = value;
    }

    /**
     * 
     * 						A URI for the Agency that maintains the Extension.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link ExtensionAgencyURIType }
     *     
     */
    public ExtensionAgencyURIType getExtensionAgencyURI() {
        return extensionAgencyURI;
    }

    /**
     * Imposta il valore della proprietà extensionAgencyURI.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionAgencyURIType }
     *     
     */
    public void setExtensionAgencyURI(ExtensionAgencyURIType value) {
        this.extensionAgencyURI = value;
    }

    /**
     * 
     * 						A URI for the Extension.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link ExtensionURIType }
     *     
     */
    public ExtensionURIType getExtensionURI() {
        return extensionURI;
    }

    /**
     * Imposta il valore della proprietà extensionURI.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionURIType }
     *     
     */
    public void setExtensionURI(ExtensionURIType value) {
        this.extensionURI = value;
    }

    /**
     * 
     * 						A code for reason the Extension is being included.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link ExtensionReasonCodeType }
     *     
     */
    public ExtensionReasonCodeType getExtensionReasonCode() {
        return extensionReasonCode;
    }

    /**
     * Imposta il valore della proprietà extensionReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionReasonCodeType }
     *     
     */
    public void setExtensionReasonCode(ExtensionReasonCodeType value) {
        this.extensionReasonCode = value;
    }

    /**
     * 
     * 						A description of the reason for the Extension.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link ExtensionReasonType }
     *     
     */
    public ExtensionReasonType getExtensionReason() {
        return extensionReason;
    }

    /**
     * Imposta il valore della proprietà extensionReason.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionReasonType }
     *     
     */
    public void setExtensionReason(ExtensionReasonType value) {
        this.extensionReason = value;
    }

    /**
     * 
     * 						The definition of the extension content.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link ExtensionContentType }
     *     
     */
    public ExtensionContentType getExtensionContent() {
        return extensionContent;
    }

    /**
     * Imposta il valore della proprietà extensionContent.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionContentType }
     *     
     */
    public void setExtensionContent(ExtensionContentType value) {
        this.extensionContent = value;
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
            IDType theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID, (this.id!= null));
        }
        {
            NameType theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
        }
        {
            ExtensionAgencyIDType theExtensionAgencyID;
            theExtensionAgencyID = this.getExtensionAgencyID();
            strategy.appendField(locator, this, "extensionAgencyID", buffer, theExtensionAgencyID, (this.extensionAgencyID!= null));
        }
        {
            ExtensionAgencyNameType theExtensionAgencyName;
            theExtensionAgencyName = this.getExtensionAgencyName();
            strategy.appendField(locator, this, "extensionAgencyName", buffer, theExtensionAgencyName, (this.extensionAgencyName!= null));
        }
        {
            ExtensionVersionIDType theExtensionVersionID;
            theExtensionVersionID = this.getExtensionVersionID();
            strategy.appendField(locator, this, "extensionVersionID", buffer, theExtensionVersionID, (this.extensionVersionID!= null));
        }
        {
            ExtensionAgencyURIType theExtensionAgencyURI;
            theExtensionAgencyURI = this.getExtensionAgencyURI();
            strategy.appendField(locator, this, "extensionAgencyURI", buffer, theExtensionAgencyURI, (this.extensionAgencyURI!= null));
        }
        {
            ExtensionURIType theExtensionURI;
            theExtensionURI = this.getExtensionURI();
            strategy.appendField(locator, this, "extensionURI", buffer, theExtensionURI, (this.extensionURI!= null));
        }
        {
            ExtensionReasonCodeType theExtensionReasonCode;
            theExtensionReasonCode = this.getExtensionReasonCode();
            strategy.appendField(locator, this, "extensionReasonCode", buffer, theExtensionReasonCode, (this.extensionReasonCode!= null));
        }
        {
            ExtensionReasonType theExtensionReason;
            theExtensionReason = this.getExtensionReason();
            strategy.appendField(locator, this, "extensionReason", buffer, theExtensionReason, (this.extensionReason!= null));
        }
        {
            ExtensionContentType theExtensionContent;
            theExtensionContent = this.getExtensionContent();
            strategy.appendField(locator, this, "extensionContent", buffer, theExtensionContent, (this.extensionContent!= null));
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
        final UBLExtensionType that = ((UBLExtensionType) object);
        {
            IDType lhsID;
            lhsID = this.getID();
            IDType rhsID;
            rhsID = that.getID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsID), LocatorUtils.property(thatLocator, "id", rhsID), lhsID, rhsID, (this.id!= null), (that.id!= null))) {
                return false;
            }
        }
        {
            NameType lhsName;
            lhsName = this.getName();
            NameType rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
                return false;
            }
        }
        {
            ExtensionAgencyIDType lhsExtensionAgencyID;
            lhsExtensionAgencyID = this.getExtensionAgencyID();
            ExtensionAgencyIDType rhsExtensionAgencyID;
            rhsExtensionAgencyID = that.getExtensionAgencyID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "extensionAgencyID", lhsExtensionAgencyID), LocatorUtils.property(thatLocator, "extensionAgencyID", rhsExtensionAgencyID), lhsExtensionAgencyID, rhsExtensionAgencyID, (this.extensionAgencyID!= null), (that.extensionAgencyID!= null))) {
                return false;
            }
        }
        {
            ExtensionAgencyNameType lhsExtensionAgencyName;
            lhsExtensionAgencyName = this.getExtensionAgencyName();
            ExtensionAgencyNameType rhsExtensionAgencyName;
            rhsExtensionAgencyName = that.getExtensionAgencyName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "extensionAgencyName", lhsExtensionAgencyName), LocatorUtils.property(thatLocator, "extensionAgencyName", rhsExtensionAgencyName), lhsExtensionAgencyName, rhsExtensionAgencyName, (this.extensionAgencyName!= null), (that.extensionAgencyName!= null))) {
                return false;
            }
        }
        {
            ExtensionVersionIDType lhsExtensionVersionID;
            lhsExtensionVersionID = this.getExtensionVersionID();
            ExtensionVersionIDType rhsExtensionVersionID;
            rhsExtensionVersionID = that.getExtensionVersionID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "extensionVersionID", lhsExtensionVersionID), LocatorUtils.property(thatLocator, "extensionVersionID", rhsExtensionVersionID), lhsExtensionVersionID, rhsExtensionVersionID, (this.extensionVersionID!= null), (that.extensionVersionID!= null))) {
                return false;
            }
        }
        {
            ExtensionAgencyURIType lhsExtensionAgencyURI;
            lhsExtensionAgencyURI = this.getExtensionAgencyURI();
            ExtensionAgencyURIType rhsExtensionAgencyURI;
            rhsExtensionAgencyURI = that.getExtensionAgencyURI();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "extensionAgencyURI", lhsExtensionAgencyURI), LocatorUtils.property(thatLocator, "extensionAgencyURI", rhsExtensionAgencyURI), lhsExtensionAgencyURI, rhsExtensionAgencyURI, (this.extensionAgencyURI!= null), (that.extensionAgencyURI!= null))) {
                return false;
            }
        }
        {
            ExtensionURIType lhsExtensionURI;
            lhsExtensionURI = this.getExtensionURI();
            ExtensionURIType rhsExtensionURI;
            rhsExtensionURI = that.getExtensionURI();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "extensionURI", lhsExtensionURI), LocatorUtils.property(thatLocator, "extensionURI", rhsExtensionURI), lhsExtensionURI, rhsExtensionURI, (this.extensionURI!= null), (that.extensionURI!= null))) {
                return false;
            }
        }
        {
            ExtensionReasonCodeType lhsExtensionReasonCode;
            lhsExtensionReasonCode = this.getExtensionReasonCode();
            ExtensionReasonCodeType rhsExtensionReasonCode;
            rhsExtensionReasonCode = that.getExtensionReasonCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "extensionReasonCode", lhsExtensionReasonCode), LocatorUtils.property(thatLocator, "extensionReasonCode", rhsExtensionReasonCode), lhsExtensionReasonCode, rhsExtensionReasonCode, (this.extensionReasonCode!= null), (that.extensionReasonCode!= null))) {
                return false;
            }
        }
        {
            ExtensionReasonType lhsExtensionReason;
            lhsExtensionReason = this.getExtensionReason();
            ExtensionReasonType rhsExtensionReason;
            rhsExtensionReason = that.getExtensionReason();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "extensionReason", lhsExtensionReason), LocatorUtils.property(thatLocator, "extensionReason", rhsExtensionReason), lhsExtensionReason, rhsExtensionReason, (this.extensionReason!= null), (that.extensionReason!= null))) {
                return false;
            }
        }
        {
            ExtensionContentType lhsExtensionContent;
            lhsExtensionContent = this.getExtensionContent();
            ExtensionContentType rhsExtensionContent;
            rhsExtensionContent = that.getExtensionContent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "extensionContent", lhsExtensionContent), LocatorUtils.property(thatLocator, "extensionContent", rhsExtensionContent), lhsExtensionContent, rhsExtensionContent, (this.extensionContent!= null), (that.extensionContent!= null))) {
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
            IDType theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID, (this.id!= null));
        }
        {
            NameType theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            ExtensionAgencyIDType theExtensionAgencyID;
            theExtensionAgencyID = this.getExtensionAgencyID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "extensionAgencyID", theExtensionAgencyID), currentHashCode, theExtensionAgencyID, (this.extensionAgencyID!= null));
        }
        {
            ExtensionAgencyNameType theExtensionAgencyName;
            theExtensionAgencyName = this.getExtensionAgencyName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "extensionAgencyName", theExtensionAgencyName), currentHashCode, theExtensionAgencyName, (this.extensionAgencyName!= null));
        }
        {
            ExtensionVersionIDType theExtensionVersionID;
            theExtensionVersionID = this.getExtensionVersionID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "extensionVersionID", theExtensionVersionID), currentHashCode, theExtensionVersionID, (this.extensionVersionID!= null));
        }
        {
            ExtensionAgencyURIType theExtensionAgencyURI;
            theExtensionAgencyURI = this.getExtensionAgencyURI();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "extensionAgencyURI", theExtensionAgencyURI), currentHashCode, theExtensionAgencyURI, (this.extensionAgencyURI!= null));
        }
        {
            ExtensionURIType theExtensionURI;
            theExtensionURI = this.getExtensionURI();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "extensionURI", theExtensionURI), currentHashCode, theExtensionURI, (this.extensionURI!= null));
        }
        {
            ExtensionReasonCodeType theExtensionReasonCode;
            theExtensionReasonCode = this.getExtensionReasonCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "extensionReasonCode", theExtensionReasonCode), currentHashCode, theExtensionReasonCode, (this.extensionReasonCode!= null));
        }
        {
            ExtensionReasonType theExtensionReason;
            theExtensionReason = this.getExtensionReason();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "extensionReason", theExtensionReason), currentHashCode, theExtensionReason, (this.extensionReason!= null));
        }
        {
            ExtensionContentType theExtensionContent;
            theExtensionContent = this.getExtensionContent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "extensionContent", theExtensionContent), currentHashCode, theExtensionContent, (this.extensionContent!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
