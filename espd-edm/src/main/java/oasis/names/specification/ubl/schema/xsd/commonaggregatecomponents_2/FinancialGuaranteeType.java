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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AmountRateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.GuaranteeTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LiabilityAmountType;
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
 * <p>Classe Java per FinancialGuaranteeType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FinancialGuaranteeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GuaranteeTypeCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LiabilityAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AmountRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ConstitutionPeriod" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialGuaranteeType", propOrder = {
    "guaranteeTypeCode",
    "description",
    "liabilityAmount",
    "amountRate",
    "constitutionPeriod"
})
public class FinancialGuaranteeType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "GuaranteeTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected GuaranteeTypeCodeType guaranteeTypeCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "LiabilityAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LiabilityAmountType liabilityAmount;
    @XmlElement(name = "AmountRate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AmountRateType amountRate;
    @XmlElement(name = "ConstitutionPeriod")
    protected PeriodType constitutionPeriod;

    /**
     * Recupera il valore della proprietà guaranteeTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link GuaranteeTypeCodeType }
     *     
     */
    public GuaranteeTypeCodeType getGuaranteeTypeCode() {
        return guaranteeTypeCode;
    }

    /**
     * Imposta il valore della proprietà guaranteeTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link GuaranteeTypeCodeType }
     *     
     */
    public void setGuaranteeTypeCode(GuaranteeTypeCodeType value) {
        this.guaranteeTypeCode = value;
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
     * Recupera il valore della proprietà liabilityAmount.
     * 
     * @return
     *     possible object is
     *     {@link LiabilityAmountType }
     *     
     */
    public LiabilityAmountType getLiabilityAmount() {
        return liabilityAmount;
    }

    /**
     * Imposta il valore della proprietà liabilityAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link LiabilityAmountType }
     *     
     */
    public void setLiabilityAmount(LiabilityAmountType value) {
        this.liabilityAmount = value;
    }

    /**
     * Recupera il valore della proprietà amountRate.
     * 
     * @return
     *     possible object is
     *     {@link AmountRateType }
     *     
     */
    public AmountRateType getAmountRate() {
        return amountRate;
    }

    /**
     * Imposta il valore della proprietà amountRate.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountRateType }
     *     
     */
    public void setAmountRate(AmountRateType value) {
        this.amountRate = value;
    }

    /**
     * Recupera il valore della proprietà constitutionPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getConstitutionPeriod() {
        return constitutionPeriod;
    }

    /**
     * Imposta il valore della proprietà constitutionPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setConstitutionPeriod(PeriodType value) {
        this.constitutionPeriod = value;
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
            GuaranteeTypeCodeType theGuaranteeTypeCode;
            theGuaranteeTypeCode = this.getGuaranteeTypeCode();
            strategy.appendField(locator, this, "guaranteeTypeCode", buffer, theGuaranteeTypeCode, (this.guaranteeTypeCode!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            LiabilityAmountType theLiabilityAmount;
            theLiabilityAmount = this.getLiabilityAmount();
            strategy.appendField(locator, this, "liabilityAmount", buffer, theLiabilityAmount, (this.liabilityAmount!= null));
        }
        {
            AmountRateType theAmountRate;
            theAmountRate = this.getAmountRate();
            strategy.appendField(locator, this, "amountRate", buffer, theAmountRate, (this.amountRate!= null));
        }
        {
            PeriodType theConstitutionPeriod;
            theConstitutionPeriod = this.getConstitutionPeriod();
            strategy.appendField(locator, this, "constitutionPeriod", buffer, theConstitutionPeriod, (this.constitutionPeriod!= null));
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
        final FinancialGuaranteeType that = ((FinancialGuaranteeType) object);
        {
            GuaranteeTypeCodeType lhsGuaranteeTypeCode;
            lhsGuaranteeTypeCode = this.getGuaranteeTypeCode();
            GuaranteeTypeCodeType rhsGuaranteeTypeCode;
            rhsGuaranteeTypeCode = that.getGuaranteeTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "guaranteeTypeCode", lhsGuaranteeTypeCode), LocatorUtils.property(thatLocator, "guaranteeTypeCode", rhsGuaranteeTypeCode), lhsGuaranteeTypeCode, rhsGuaranteeTypeCode, (this.guaranteeTypeCode!= null), (that.guaranteeTypeCode!= null))) {
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
            LiabilityAmountType lhsLiabilityAmount;
            lhsLiabilityAmount = this.getLiabilityAmount();
            LiabilityAmountType rhsLiabilityAmount;
            rhsLiabilityAmount = that.getLiabilityAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "liabilityAmount", lhsLiabilityAmount), LocatorUtils.property(thatLocator, "liabilityAmount", rhsLiabilityAmount), lhsLiabilityAmount, rhsLiabilityAmount, (this.liabilityAmount!= null), (that.liabilityAmount!= null))) {
                return false;
            }
        }
        {
            AmountRateType lhsAmountRate;
            lhsAmountRate = this.getAmountRate();
            AmountRateType rhsAmountRate;
            rhsAmountRate = that.getAmountRate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "amountRate", lhsAmountRate), LocatorUtils.property(thatLocator, "amountRate", rhsAmountRate), lhsAmountRate, rhsAmountRate, (this.amountRate!= null), (that.amountRate!= null))) {
                return false;
            }
        }
        {
            PeriodType lhsConstitutionPeriod;
            lhsConstitutionPeriod = this.getConstitutionPeriod();
            PeriodType rhsConstitutionPeriod;
            rhsConstitutionPeriod = that.getConstitutionPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "constitutionPeriod", lhsConstitutionPeriod), LocatorUtils.property(thatLocator, "constitutionPeriod", rhsConstitutionPeriod), lhsConstitutionPeriod, rhsConstitutionPeriod, (this.constitutionPeriod!= null), (that.constitutionPeriod!= null))) {
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
            GuaranteeTypeCodeType theGuaranteeTypeCode;
            theGuaranteeTypeCode = this.getGuaranteeTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "guaranteeTypeCode", theGuaranteeTypeCode), currentHashCode, theGuaranteeTypeCode, (this.guaranteeTypeCode!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            LiabilityAmountType theLiabilityAmount;
            theLiabilityAmount = this.getLiabilityAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "liabilityAmount", theLiabilityAmount), currentHashCode, theLiabilityAmount, (this.liabilityAmount!= null));
        }
        {
            AmountRateType theAmountRate;
            theAmountRate = this.getAmountRate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "amountRate", theAmountRate), currentHashCode, theAmountRate, (this.amountRate!= null));
        }
        {
            PeriodType theConstitutionPeriod;
            theConstitutionPeriod = this.getConstitutionPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "constitutionPeriod", theConstitutionPeriod), currentHashCode, theConstitutionPeriod, (this.constitutionPeriod!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
