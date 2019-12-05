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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LossRiskResponsibilityCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LossRiskType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SpecialTermsType;
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
 * <p>Classe Java per DeliveryTermsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DeliveryTermsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SpecialTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LossRiskResponsibilityCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LossRisk" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Amount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DeliveryLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AllowanceCharge" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryTermsType", propOrder = {
    "id",
    "specialTerms",
    "lossRiskResponsibilityCode",
    "lossRisk",
    "amount",
    "deliveryLocation",
    "allowanceCharge"
})
public class DeliveryTermsType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "SpecialTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<SpecialTermsType> specialTerms;
    @XmlElement(name = "LossRiskResponsibilityCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LossRiskResponsibilityCodeType lossRiskResponsibilityCode;
    @XmlElement(name = "LossRisk", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<LossRiskType> lossRisk;
    @XmlElement(name = "Amount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AmountType amount;
    @XmlElement(name = "DeliveryLocation")
    protected LocationType deliveryLocation;
    @XmlElement(name = "AllowanceCharge")
    protected AllowanceChargeType allowanceCharge;

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
     * Gets the value of the specialTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialTermsType }
     * 
     * 
     */
    public List<SpecialTermsType> getSpecialTerms() {
        if (specialTerms == null) {
            specialTerms = new ArrayList<SpecialTermsType>();
        }
        return this.specialTerms;
    }

    /**
     * Recupera il valore della proprietà lossRiskResponsibilityCode.
     * 
     * @return
     *     possible object is
     *     {@link LossRiskResponsibilityCodeType }
     *     
     */
    public LossRiskResponsibilityCodeType getLossRiskResponsibilityCode() {
        return lossRiskResponsibilityCode;
    }

    /**
     * Imposta il valore della proprietà lossRiskResponsibilityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link LossRiskResponsibilityCodeType }
     *     
     */
    public void setLossRiskResponsibilityCode(LossRiskResponsibilityCodeType value) {
        this.lossRiskResponsibilityCode = value;
    }

    /**
     * Gets the value of the lossRisk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lossRisk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLossRisk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LossRiskType }
     * 
     * 
     */
    public List<LossRiskType> getLossRisk() {
        if (lossRisk == null) {
            lossRisk = new ArrayList<LossRiskType>();
        }
        return this.lossRisk;
    }

    /**
     * Recupera il valore della proprietà amount.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmount() {
        return amount;
    }

    /**
     * Imposta il valore della proprietà amount.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmount(AmountType value) {
        this.amount = value;
    }

    /**
     * Recupera il valore della proprietà deliveryLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getDeliveryLocation() {
        return deliveryLocation;
    }

    /**
     * Imposta il valore della proprietà deliveryLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setDeliveryLocation(LocationType value) {
        this.deliveryLocation = value;
    }

    /**
     * Recupera il valore della proprietà allowanceCharge.
     * 
     * @return
     *     possible object is
     *     {@link AllowanceChargeType }
     *     
     */
    public AllowanceChargeType getAllowanceCharge() {
        return allowanceCharge;
    }

    /**
     * Imposta il valore della proprietà allowanceCharge.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowanceChargeType }
     *     
     */
    public void setAllowanceCharge(AllowanceChargeType value) {
        this.allowanceCharge = value;
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
            List<SpecialTermsType> theSpecialTerms;
            theSpecialTerms = (((this.specialTerms!= null)&&(!this.specialTerms.isEmpty()))?this.getSpecialTerms():null);
            strategy.appendField(locator, this, "specialTerms", buffer, theSpecialTerms, ((this.specialTerms!= null)&&(!this.specialTerms.isEmpty())));
        }
        {
            LossRiskResponsibilityCodeType theLossRiskResponsibilityCode;
            theLossRiskResponsibilityCode = this.getLossRiskResponsibilityCode();
            strategy.appendField(locator, this, "lossRiskResponsibilityCode", buffer, theLossRiskResponsibilityCode, (this.lossRiskResponsibilityCode!= null));
        }
        {
            List<LossRiskType> theLossRisk;
            theLossRisk = (((this.lossRisk!= null)&&(!this.lossRisk.isEmpty()))?this.getLossRisk():null);
            strategy.appendField(locator, this, "lossRisk", buffer, theLossRisk, ((this.lossRisk!= null)&&(!this.lossRisk.isEmpty())));
        }
        {
            AmountType theAmount;
            theAmount = this.getAmount();
            strategy.appendField(locator, this, "amount", buffer, theAmount, (this.amount!= null));
        }
        {
            LocationType theDeliveryLocation;
            theDeliveryLocation = this.getDeliveryLocation();
            strategy.appendField(locator, this, "deliveryLocation", buffer, theDeliveryLocation, (this.deliveryLocation!= null));
        }
        {
            AllowanceChargeType theAllowanceCharge;
            theAllowanceCharge = this.getAllowanceCharge();
            strategy.appendField(locator, this, "allowanceCharge", buffer, theAllowanceCharge, (this.allowanceCharge!= null));
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
        final DeliveryTermsType that = ((DeliveryTermsType) object);
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
            List<SpecialTermsType> lhsSpecialTerms;
            lhsSpecialTerms = (((this.specialTerms!= null)&&(!this.specialTerms.isEmpty()))?this.getSpecialTerms():null);
            List<SpecialTermsType> rhsSpecialTerms;
            rhsSpecialTerms = (((that.specialTerms!= null)&&(!that.specialTerms.isEmpty()))?that.getSpecialTerms():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specialTerms", lhsSpecialTerms), LocatorUtils.property(thatLocator, "specialTerms", rhsSpecialTerms), lhsSpecialTerms, rhsSpecialTerms, ((this.specialTerms!= null)&&(!this.specialTerms.isEmpty())), ((that.specialTerms!= null)&&(!that.specialTerms.isEmpty())))) {
                return false;
            }
        }
        {
            LossRiskResponsibilityCodeType lhsLossRiskResponsibilityCode;
            lhsLossRiskResponsibilityCode = this.getLossRiskResponsibilityCode();
            LossRiskResponsibilityCodeType rhsLossRiskResponsibilityCode;
            rhsLossRiskResponsibilityCode = that.getLossRiskResponsibilityCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lossRiskResponsibilityCode", lhsLossRiskResponsibilityCode), LocatorUtils.property(thatLocator, "lossRiskResponsibilityCode", rhsLossRiskResponsibilityCode), lhsLossRiskResponsibilityCode, rhsLossRiskResponsibilityCode, (this.lossRiskResponsibilityCode!= null), (that.lossRiskResponsibilityCode!= null))) {
                return false;
            }
        }
        {
            List<LossRiskType> lhsLossRisk;
            lhsLossRisk = (((this.lossRisk!= null)&&(!this.lossRisk.isEmpty()))?this.getLossRisk():null);
            List<LossRiskType> rhsLossRisk;
            rhsLossRisk = (((that.lossRisk!= null)&&(!that.lossRisk.isEmpty()))?that.getLossRisk():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lossRisk", lhsLossRisk), LocatorUtils.property(thatLocator, "lossRisk", rhsLossRisk), lhsLossRisk, rhsLossRisk, ((this.lossRisk!= null)&&(!this.lossRisk.isEmpty())), ((that.lossRisk!= null)&&(!that.lossRisk.isEmpty())))) {
                return false;
            }
        }
        {
            AmountType lhsAmount;
            lhsAmount = this.getAmount();
            AmountType rhsAmount;
            rhsAmount = that.getAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "amount", lhsAmount), LocatorUtils.property(thatLocator, "amount", rhsAmount), lhsAmount, rhsAmount, (this.amount!= null), (that.amount!= null))) {
                return false;
            }
        }
        {
            LocationType lhsDeliveryLocation;
            lhsDeliveryLocation = this.getDeliveryLocation();
            LocationType rhsDeliveryLocation;
            rhsDeliveryLocation = that.getDeliveryLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deliveryLocation", lhsDeliveryLocation), LocatorUtils.property(thatLocator, "deliveryLocation", rhsDeliveryLocation), lhsDeliveryLocation, rhsDeliveryLocation, (this.deliveryLocation!= null), (that.deliveryLocation!= null))) {
                return false;
            }
        }
        {
            AllowanceChargeType lhsAllowanceCharge;
            lhsAllowanceCharge = this.getAllowanceCharge();
            AllowanceChargeType rhsAllowanceCharge;
            rhsAllowanceCharge = that.getAllowanceCharge();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "allowanceCharge", lhsAllowanceCharge), LocatorUtils.property(thatLocator, "allowanceCharge", rhsAllowanceCharge), lhsAllowanceCharge, rhsAllowanceCharge, (this.allowanceCharge!= null), (that.allowanceCharge!= null))) {
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
            List<SpecialTermsType> theSpecialTerms;
            theSpecialTerms = (((this.specialTerms!= null)&&(!this.specialTerms.isEmpty()))?this.getSpecialTerms():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialTerms", theSpecialTerms), currentHashCode, theSpecialTerms, ((this.specialTerms!= null)&&(!this.specialTerms.isEmpty())));
        }
        {
            LossRiskResponsibilityCodeType theLossRiskResponsibilityCode;
            theLossRiskResponsibilityCode = this.getLossRiskResponsibilityCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lossRiskResponsibilityCode", theLossRiskResponsibilityCode), currentHashCode, theLossRiskResponsibilityCode, (this.lossRiskResponsibilityCode!= null));
        }
        {
            List<LossRiskType> theLossRisk;
            theLossRisk = (((this.lossRisk!= null)&&(!this.lossRisk.isEmpty()))?this.getLossRisk():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lossRisk", theLossRisk), currentHashCode, theLossRisk, ((this.lossRisk!= null)&&(!this.lossRisk.isEmpty())));
        }
        {
            AmountType theAmount;
            theAmount = this.getAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "amount", theAmount), currentHashCode, theAmount, (this.amount!= null));
        }
        {
            LocationType theDeliveryLocation;
            theDeliveryLocation = this.getDeliveryLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deliveryLocation", theDeliveryLocation), currentHashCode, theDeliveryLocation, (this.deliveryLocation!= null));
        }
        {
            AllowanceChargeType theAllowanceCharge;
            theAllowanceCharge = this.getAllowanceCharge();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allowanceCharge", theAllowanceCharge), currentHashCode, theAllowanceCharge, (this.allowanceCharge!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
