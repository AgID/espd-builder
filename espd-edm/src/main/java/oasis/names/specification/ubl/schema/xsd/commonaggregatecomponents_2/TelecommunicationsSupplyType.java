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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PrivacyCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TelecommunicationsSupplyTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TelecommunicationsSupplyTypeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TotalAmountType;
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
 * <p>Classe Java per TelecommunicationsSupplyType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TelecommunicationsSupplyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TelecommunicationsSupplyType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TelecommunicationsSupplyTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PrivacyCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TelecommunicationsSupplyLine" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelecommunicationsSupplyType", propOrder = {
    "telecommunicationsSupplyType",
    "telecommunicationsSupplyTypeCode",
    "privacyCode",
    "description",
    "totalAmount",
    "telecommunicationsSupplyLine"
})
public class TelecommunicationsSupplyType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "TelecommunicationsSupplyType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TelecommunicationsSupplyTypeType telecommunicationsSupplyType;
    @XmlElement(name = "TelecommunicationsSupplyTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TelecommunicationsSupplyTypeCodeType telecommunicationsSupplyTypeCode;
    @XmlElement(name = "PrivacyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected PrivacyCodeType privacyCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "TotalAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TotalAmountType totalAmount;
    @XmlElement(name = "TelecommunicationsSupplyLine", required = true)
    protected List<TelecommunicationsSupplyLineType> telecommunicationsSupplyLine;

    /**
     * Recupera il valore della proprietà telecommunicationsSupplyType.
     * 
     * @return
     *     possible object is
     *     {@link TelecommunicationsSupplyTypeType }
     *     
     */
    public TelecommunicationsSupplyTypeType getTelecommunicationsSupplyType() {
        return telecommunicationsSupplyType;
    }

    /**
     * Imposta il valore della proprietà telecommunicationsSupplyType.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecommunicationsSupplyTypeType }
     *     
     */
    public void setTelecommunicationsSupplyType(TelecommunicationsSupplyTypeType value) {
        this.telecommunicationsSupplyType = value;
    }

    /**
     * Recupera il valore della proprietà telecommunicationsSupplyTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link TelecommunicationsSupplyTypeCodeType }
     *     
     */
    public TelecommunicationsSupplyTypeCodeType getTelecommunicationsSupplyTypeCode() {
        return telecommunicationsSupplyTypeCode;
    }

    /**
     * Imposta il valore della proprietà telecommunicationsSupplyTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecommunicationsSupplyTypeCodeType }
     *     
     */
    public void setTelecommunicationsSupplyTypeCode(TelecommunicationsSupplyTypeCodeType value) {
        this.telecommunicationsSupplyTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà privacyCode.
     * 
     * @return
     *     possible object is
     *     {@link PrivacyCodeType }
     *     
     */
    public PrivacyCodeType getPrivacyCode() {
        return privacyCode;
    }

    /**
     * Imposta il valore della proprietà privacyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivacyCodeType }
     *     
     */
    public void setPrivacyCode(PrivacyCodeType value) {
        this.privacyCode = value;
    }

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
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Recupera il valore della proprietà totalAmount.
     * 
     * @return
     *     possible object is
     *     {@link TotalAmountType }
     *     
     */
    public TotalAmountType getTotalAmount() {
        return totalAmount;
    }

    /**
     * Imposta il valore della proprietà totalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalAmountType }
     *     
     */
    public void setTotalAmount(TotalAmountType value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the telecommunicationsSupplyLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telecommunicationsSupplyLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelecommunicationsSupplyLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TelecommunicationsSupplyLineType }
     * 
     * 
     */
    public List<TelecommunicationsSupplyLineType> getTelecommunicationsSupplyLine() {
        if (telecommunicationsSupplyLine == null) {
            telecommunicationsSupplyLine = new ArrayList<TelecommunicationsSupplyLineType>();
        }
        return this.telecommunicationsSupplyLine;
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
            TelecommunicationsSupplyTypeType theTelecommunicationsSupplyType;
            theTelecommunicationsSupplyType = this.getTelecommunicationsSupplyType();
            strategy.appendField(locator, this, "telecommunicationsSupplyType", buffer, theTelecommunicationsSupplyType, (this.telecommunicationsSupplyType!= null));
        }
        {
            TelecommunicationsSupplyTypeCodeType theTelecommunicationsSupplyTypeCode;
            theTelecommunicationsSupplyTypeCode = this.getTelecommunicationsSupplyTypeCode();
            strategy.appendField(locator, this, "telecommunicationsSupplyTypeCode", buffer, theTelecommunicationsSupplyTypeCode, (this.telecommunicationsSupplyTypeCode!= null));
        }
        {
            PrivacyCodeType thePrivacyCode;
            thePrivacyCode = this.getPrivacyCode();
            strategy.appendField(locator, this, "privacyCode", buffer, thePrivacyCode, (this.privacyCode!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            TotalAmountType theTotalAmount;
            theTotalAmount = this.getTotalAmount();
            strategy.appendField(locator, this, "totalAmount", buffer, theTotalAmount, (this.totalAmount!= null));
        }
        {
            List<TelecommunicationsSupplyLineType> theTelecommunicationsSupplyLine;
            theTelecommunicationsSupplyLine = (((this.telecommunicationsSupplyLine!= null)&&(!this.telecommunicationsSupplyLine.isEmpty()))?this.getTelecommunicationsSupplyLine():null);
            strategy.appendField(locator, this, "telecommunicationsSupplyLine", buffer, theTelecommunicationsSupplyLine, ((this.telecommunicationsSupplyLine!= null)&&(!this.telecommunicationsSupplyLine.isEmpty())));
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
        final TelecommunicationsSupplyType that = ((TelecommunicationsSupplyType) object);
        {
            TelecommunicationsSupplyTypeType lhsTelecommunicationsSupplyType;
            lhsTelecommunicationsSupplyType = this.getTelecommunicationsSupplyType();
            TelecommunicationsSupplyTypeType rhsTelecommunicationsSupplyType;
            rhsTelecommunicationsSupplyType = that.getTelecommunicationsSupplyType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telecommunicationsSupplyType", lhsTelecommunicationsSupplyType), LocatorUtils.property(thatLocator, "telecommunicationsSupplyType", rhsTelecommunicationsSupplyType), lhsTelecommunicationsSupplyType, rhsTelecommunicationsSupplyType, (this.telecommunicationsSupplyType!= null), (that.telecommunicationsSupplyType!= null))) {
                return false;
            }
        }
        {
            TelecommunicationsSupplyTypeCodeType lhsTelecommunicationsSupplyTypeCode;
            lhsTelecommunicationsSupplyTypeCode = this.getTelecommunicationsSupplyTypeCode();
            TelecommunicationsSupplyTypeCodeType rhsTelecommunicationsSupplyTypeCode;
            rhsTelecommunicationsSupplyTypeCode = that.getTelecommunicationsSupplyTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telecommunicationsSupplyTypeCode", lhsTelecommunicationsSupplyTypeCode), LocatorUtils.property(thatLocator, "telecommunicationsSupplyTypeCode", rhsTelecommunicationsSupplyTypeCode), lhsTelecommunicationsSupplyTypeCode, rhsTelecommunicationsSupplyTypeCode, (this.telecommunicationsSupplyTypeCode!= null), (that.telecommunicationsSupplyTypeCode!= null))) {
                return false;
            }
        }
        {
            PrivacyCodeType lhsPrivacyCode;
            lhsPrivacyCode = this.getPrivacyCode();
            PrivacyCodeType rhsPrivacyCode;
            rhsPrivacyCode = that.getPrivacyCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "privacyCode", lhsPrivacyCode), LocatorUtils.property(thatLocator, "privacyCode", rhsPrivacyCode), lhsPrivacyCode, rhsPrivacyCode, (this.privacyCode!= null), (that.privacyCode!= null))) {
                return false;
            }
        }
        {
            List<DescriptionType> lhsDescription;
            lhsDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            List<DescriptionType> rhsDescription;
            rhsDescription = (((that.description!= null)&&(!that.description.isEmpty()))?that.getDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, ((this.description!= null)&&(!this.description.isEmpty())), ((that.description!= null)&&(!that.description.isEmpty())))) {
                return false;
            }
        }
        {
            TotalAmountType lhsTotalAmount;
            lhsTotalAmount = this.getTotalAmount();
            TotalAmountType rhsTotalAmount;
            rhsTotalAmount = that.getTotalAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalAmount", lhsTotalAmount), LocatorUtils.property(thatLocator, "totalAmount", rhsTotalAmount), lhsTotalAmount, rhsTotalAmount, (this.totalAmount!= null), (that.totalAmount!= null))) {
                return false;
            }
        }
        {
            List<TelecommunicationsSupplyLineType> lhsTelecommunicationsSupplyLine;
            lhsTelecommunicationsSupplyLine = (((this.telecommunicationsSupplyLine!= null)&&(!this.telecommunicationsSupplyLine.isEmpty()))?this.getTelecommunicationsSupplyLine():null);
            List<TelecommunicationsSupplyLineType> rhsTelecommunicationsSupplyLine;
            rhsTelecommunicationsSupplyLine = (((that.telecommunicationsSupplyLine!= null)&&(!that.telecommunicationsSupplyLine.isEmpty()))?that.getTelecommunicationsSupplyLine():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telecommunicationsSupplyLine", lhsTelecommunicationsSupplyLine), LocatorUtils.property(thatLocator, "telecommunicationsSupplyLine", rhsTelecommunicationsSupplyLine), lhsTelecommunicationsSupplyLine, rhsTelecommunicationsSupplyLine, ((this.telecommunicationsSupplyLine!= null)&&(!this.telecommunicationsSupplyLine.isEmpty())), ((that.telecommunicationsSupplyLine!= null)&&(!that.telecommunicationsSupplyLine.isEmpty())))) {
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
            TelecommunicationsSupplyTypeType theTelecommunicationsSupplyType;
            theTelecommunicationsSupplyType = this.getTelecommunicationsSupplyType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "telecommunicationsSupplyType", theTelecommunicationsSupplyType), currentHashCode, theTelecommunicationsSupplyType, (this.telecommunicationsSupplyType!= null));
        }
        {
            TelecommunicationsSupplyTypeCodeType theTelecommunicationsSupplyTypeCode;
            theTelecommunicationsSupplyTypeCode = this.getTelecommunicationsSupplyTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "telecommunicationsSupplyTypeCode", theTelecommunicationsSupplyTypeCode), currentHashCode, theTelecommunicationsSupplyTypeCode, (this.telecommunicationsSupplyTypeCode!= null));
        }
        {
            PrivacyCodeType thePrivacyCode;
            thePrivacyCode = this.getPrivacyCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "privacyCode", thePrivacyCode), currentHashCode, thePrivacyCode, (this.privacyCode!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            TotalAmountType theTotalAmount;
            theTotalAmount = this.getTotalAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalAmount", theTotalAmount), currentHashCode, theTotalAmount, (this.totalAmount!= null));
        }
        {
            List<TelecommunicationsSupplyLineType> theTelecommunicationsSupplyLine;
            theTelecommunicationsSupplyLine = (((this.telecommunicationsSupplyLine!= null)&&(!this.telecommunicationsSupplyLine.isEmpty()))?this.getTelecommunicationsSupplyLine():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "telecommunicationsSupplyLine", theTelecommunicationsSupplyLine), currentHashCode, theTelecommunicationsSupplyLine, ((this.telecommunicationsSupplyLine!= null)&&(!this.telecommunicationsSupplyLine.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
