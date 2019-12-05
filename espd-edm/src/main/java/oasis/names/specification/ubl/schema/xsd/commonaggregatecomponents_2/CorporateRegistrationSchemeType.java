//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CorporateRegistrationTypeCodeType;
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
 * <p>Classe Java per CorporateRegistrationSchemeType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CorporateRegistrationSchemeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CorporateRegistrationTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}JurisdictionRegionAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateRegistrationSchemeType", propOrder = {
    "id",
    "name",
    "corporateRegistrationTypeCode",
    "jurisdictionRegionAddress"
})
public class CorporateRegistrationSchemeType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NameType name;
    @XmlElement(name = "CorporateRegistrationTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CorporateRegistrationTypeCodeType corporateRegistrationTypeCode;
    @XmlElement(name = "JurisdictionRegionAddress")
    protected List<AddressType> jurisdictionRegionAddress;

    /**
     * Recupera il valore della proprietà id.
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
     * Recupera il valore della proprietà name.
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
     * Recupera il valore della proprietà corporateRegistrationTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link CorporateRegistrationTypeCodeType }
     *     
     */
    public CorporateRegistrationTypeCodeType getCorporateRegistrationTypeCode() {
        return corporateRegistrationTypeCode;
    }

    /**
     * Imposta il valore della proprietà corporateRegistrationTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateRegistrationTypeCodeType }
     *     
     */
    public void setCorporateRegistrationTypeCode(CorporateRegistrationTypeCodeType value) {
        this.corporateRegistrationTypeCode = value;
    }

    /**
     * Gets the value of the jurisdictionRegionAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jurisdictionRegionAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJurisdictionRegionAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressType }
     * 
     * 
     */
    public List<AddressType> getJurisdictionRegionAddress() {
        if (jurisdictionRegionAddress == null) {
            jurisdictionRegionAddress = new ArrayList<AddressType>();
        }
        return this.jurisdictionRegionAddress;
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
            CorporateRegistrationTypeCodeType theCorporateRegistrationTypeCode;
            theCorporateRegistrationTypeCode = this.getCorporateRegistrationTypeCode();
            strategy.appendField(locator, this, "corporateRegistrationTypeCode", buffer, theCorporateRegistrationTypeCode, (this.corporateRegistrationTypeCode!= null));
        }
        {
            List<AddressType> theJurisdictionRegionAddress;
            theJurisdictionRegionAddress = (((this.jurisdictionRegionAddress!= null)&&(!this.jurisdictionRegionAddress.isEmpty()))?this.getJurisdictionRegionAddress():null);
            strategy.appendField(locator, this, "jurisdictionRegionAddress", buffer, theJurisdictionRegionAddress, ((this.jurisdictionRegionAddress!= null)&&(!this.jurisdictionRegionAddress.isEmpty())));
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
        final CorporateRegistrationSchemeType that = ((CorporateRegistrationSchemeType) object);
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
            CorporateRegistrationTypeCodeType lhsCorporateRegistrationTypeCode;
            lhsCorporateRegistrationTypeCode = this.getCorporateRegistrationTypeCode();
            CorporateRegistrationTypeCodeType rhsCorporateRegistrationTypeCode;
            rhsCorporateRegistrationTypeCode = that.getCorporateRegistrationTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "corporateRegistrationTypeCode", lhsCorporateRegistrationTypeCode), LocatorUtils.property(thatLocator, "corporateRegistrationTypeCode", rhsCorporateRegistrationTypeCode), lhsCorporateRegistrationTypeCode, rhsCorporateRegistrationTypeCode, (this.corporateRegistrationTypeCode!= null), (that.corporateRegistrationTypeCode!= null))) {
                return false;
            }
        }
        {
            List<AddressType> lhsJurisdictionRegionAddress;
            lhsJurisdictionRegionAddress = (((this.jurisdictionRegionAddress!= null)&&(!this.jurisdictionRegionAddress.isEmpty()))?this.getJurisdictionRegionAddress():null);
            List<AddressType> rhsJurisdictionRegionAddress;
            rhsJurisdictionRegionAddress = (((that.jurisdictionRegionAddress!= null)&&(!that.jurisdictionRegionAddress.isEmpty()))?that.getJurisdictionRegionAddress():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "jurisdictionRegionAddress", lhsJurisdictionRegionAddress), LocatorUtils.property(thatLocator, "jurisdictionRegionAddress", rhsJurisdictionRegionAddress), lhsJurisdictionRegionAddress, rhsJurisdictionRegionAddress, ((this.jurisdictionRegionAddress!= null)&&(!this.jurisdictionRegionAddress.isEmpty())), ((that.jurisdictionRegionAddress!= null)&&(!that.jurisdictionRegionAddress.isEmpty())))) {
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
            CorporateRegistrationTypeCodeType theCorporateRegistrationTypeCode;
            theCorporateRegistrationTypeCode = this.getCorporateRegistrationTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "corporateRegistrationTypeCode", theCorporateRegistrationTypeCode), currentHashCode, theCorporateRegistrationTypeCode, (this.corporateRegistrationTypeCode!= null));
        }
        {
            List<AddressType> theJurisdictionRegionAddress;
            theJurisdictionRegionAddress = (((this.jurisdictionRegionAddress!= null)&&(!this.jurisdictionRegionAddress.isEmpty()))?this.getJurisdictionRegionAddress():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "jurisdictionRegionAddress", theJurisdictionRegionAddress), currentHashCode, theJurisdictionRegionAddress, ((this.jurisdictionRegionAddress!= null)&&(!this.jurisdictionRegionAddress.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
