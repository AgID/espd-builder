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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.UtilityStatementTypeCodeType;
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
 * <p>Classe Java per ConsumptionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ConsumptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UtilityStatementTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MainPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AllowanceCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxTotal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EnergyWaterSupply" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TelecommunicationsSupply" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LegalMonetaryTotal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumptionType", propOrder = {
    "utilityStatementTypeCode",
    "mainPeriod",
    "allowanceCharge",
    "taxTotal",
    "energyWaterSupply",
    "telecommunicationsSupply",
    "legalMonetaryTotal"
})
public class ConsumptionType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "UtilityStatementTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected UtilityStatementTypeCodeType utilityStatementTypeCode;
    @XmlElement(name = "MainPeriod")
    protected PeriodType mainPeriod;
    @XmlElement(name = "AllowanceCharge")
    protected List<AllowanceChargeType> allowanceCharge;
    @XmlElement(name = "TaxTotal")
    protected List<TaxTotalType> taxTotal;
    @XmlElement(name = "EnergyWaterSupply")
    protected EnergyWaterSupplyType energyWaterSupply;
    @XmlElement(name = "TelecommunicationsSupply")
    protected TelecommunicationsSupplyType telecommunicationsSupply;
    @XmlElement(name = "LegalMonetaryTotal", required = true)
    protected MonetaryTotalType legalMonetaryTotal;

    /**
     * Recupera il valore della proprietà utilityStatementTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link UtilityStatementTypeCodeType }
     *     
     */
    public UtilityStatementTypeCodeType getUtilityStatementTypeCode() {
        return utilityStatementTypeCode;
    }

    /**
     * Imposta il valore della proprietà utilityStatementTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link UtilityStatementTypeCodeType }
     *     
     */
    public void setUtilityStatementTypeCode(UtilityStatementTypeCodeType value) {
        this.utilityStatementTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà mainPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getMainPeriod() {
        return mainPeriod;
    }

    /**
     * Imposta il valore della proprietà mainPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setMainPeriod(PeriodType value) {
        this.mainPeriod = value;
    }

    /**
     * Gets the value of the allowanceCharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowanceCharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowanceCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowanceChargeType }
     * 
     * 
     */
    public List<AllowanceChargeType> getAllowanceCharge() {
        if (allowanceCharge == null) {
            allowanceCharge = new ArrayList<AllowanceChargeType>();
        }
        return this.allowanceCharge;
    }

    /**
     * Gets the value of the taxTotal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxTotal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxTotal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxTotalType }
     * 
     * 
     */
    public List<TaxTotalType> getTaxTotal() {
        if (taxTotal == null) {
            taxTotal = new ArrayList<TaxTotalType>();
        }
        return this.taxTotal;
    }

    /**
     * Recupera il valore della proprietà energyWaterSupply.
     * 
     * @return
     *     possible object is
     *     {@link EnergyWaterSupplyType }
     *     
     */
    public EnergyWaterSupplyType getEnergyWaterSupply() {
        return energyWaterSupply;
    }

    /**
     * Imposta il valore della proprietà energyWaterSupply.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyWaterSupplyType }
     *     
     */
    public void setEnergyWaterSupply(EnergyWaterSupplyType value) {
        this.energyWaterSupply = value;
    }

    /**
     * Recupera il valore della proprietà telecommunicationsSupply.
     * 
     * @return
     *     possible object is
     *     {@link TelecommunicationsSupplyType }
     *     
     */
    public TelecommunicationsSupplyType getTelecommunicationsSupply() {
        return telecommunicationsSupply;
    }

    /**
     * Imposta il valore della proprietà telecommunicationsSupply.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecommunicationsSupplyType }
     *     
     */
    public void setTelecommunicationsSupply(TelecommunicationsSupplyType value) {
        this.telecommunicationsSupply = value;
    }

    /**
     * Recupera il valore della proprietà legalMonetaryTotal.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryTotalType }
     *     
     */
    public MonetaryTotalType getLegalMonetaryTotal() {
        return legalMonetaryTotal;
    }

    /**
     * Imposta il valore della proprietà legalMonetaryTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryTotalType }
     *     
     */
    public void setLegalMonetaryTotal(MonetaryTotalType value) {
        this.legalMonetaryTotal = value;
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
            UtilityStatementTypeCodeType theUtilityStatementTypeCode;
            theUtilityStatementTypeCode = this.getUtilityStatementTypeCode();
            strategy.appendField(locator, this, "utilityStatementTypeCode", buffer, theUtilityStatementTypeCode, (this.utilityStatementTypeCode!= null));
        }
        {
            PeriodType theMainPeriod;
            theMainPeriod = this.getMainPeriod();
            strategy.appendField(locator, this, "mainPeriod", buffer, theMainPeriod, (this.mainPeriod!= null));
        }
        {
            List<AllowanceChargeType> theAllowanceCharge;
            theAllowanceCharge = (((this.allowanceCharge!= null)&&(!this.allowanceCharge.isEmpty()))?this.getAllowanceCharge():null);
            strategy.appendField(locator, this, "allowanceCharge", buffer, theAllowanceCharge, ((this.allowanceCharge!= null)&&(!this.allowanceCharge.isEmpty())));
        }
        {
            List<TaxTotalType> theTaxTotal;
            theTaxTotal = (((this.taxTotal!= null)&&(!this.taxTotal.isEmpty()))?this.getTaxTotal():null);
            strategy.appendField(locator, this, "taxTotal", buffer, theTaxTotal, ((this.taxTotal!= null)&&(!this.taxTotal.isEmpty())));
        }
        {
            EnergyWaterSupplyType theEnergyWaterSupply;
            theEnergyWaterSupply = this.getEnergyWaterSupply();
            strategy.appendField(locator, this, "energyWaterSupply", buffer, theEnergyWaterSupply, (this.energyWaterSupply!= null));
        }
        {
            TelecommunicationsSupplyType theTelecommunicationsSupply;
            theTelecommunicationsSupply = this.getTelecommunicationsSupply();
            strategy.appendField(locator, this, "telecommunicationsSupply", buffer, theTelecommunicationsSupply, (this.telecommunicationsSupply!= null));
        }
        {
            MonetaryTotalType theLegalMonetaryTotal;
            theLegalMonetaryTotal = this.getLegalMonetaryTotal();
            strategy.appendField(locator, this, "legalMonetaryTotal", buffer, theLegalMonetaryTotal, (this.legalMonetaryTotal!= null));
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
        final ConsumptionType that = ((ConsumptionType) object);
        {
            UtilityStatementTypeCodeType lhsUtilityStatementTypeCode;
            lhsUtilityStatementTypeCode = this.getUtilityStatementTypeCode();
            UtilityStatementTypeCodeType rhsUtilityStatementTypeCode;
            rhsUtilityStatementTypeCode = that.getUtilityStatementTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "utilityStatementTypeCode", lhsUtilityStatementTypeCode), LocatorUtils.property(thatLocator, "utilityStatementTypeCode", rhsUtilityStatementTypeCode), lhsUtilityStatementTypeCode, rhsUtilityStatementTypeCode, (this.utilityStatementTypeCode!= null), (that.utilityStatementTypeCode!= null))) {
                return false;
            }
        }
        {
            PeriodType lhsMainPeriod;
            lhsMainPeriod = this.getMainPeriod();
            PeriodType rhsMainPeriod;
            rhsMainPeriod = that.getMainPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mainPeriod", lhsMainPeriod), LocatorUtils.property(thatLocator, "mainPeriod", rhsMainPeriod), lhsMainPeriod, rhsMainPeriod, (this.mainPeriod!= null), (that.mainPeriod!= null))) {
                return false;
            }
        }
        {
            List<AllowanceChargeType> lhsAllowanceCharge;
            lhsAllowanceCharge = (((this.allowanceCharge!= null)&&(!this.allowanceCharge.isEmpty()))?this.getAllowanceCharge():null);
            List<AllowanceChargeType> rhsAllowanceCharge;
            rhsAllowanceCharge = (((that.allowanceCharge!= null)&&(!that.allowanceCharge.isEmpty()))?that.getAllowanceCharge():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "allowanceCharge", lhsAllowanceCharge), LocatorUtils.property(thatLocator, "allowanceCharge", rhsAllowanceCharge), lhsAllowanceCharge, rhsAllowanceCharge, ((this.allowanceCharge!= null)&&(!this.allowanceCharge.isEmpty())), ((that.allowanceCharge!= null)&&(!that.allowanceCharge.isEmpty())))) {
                return false;
            }
        }
        {
            List<TaxTotalType> lhsTaxTotal;
            lhsTaxTotal = (((this.taxTotal!= null)&&(!this.taxTotal.isEmpty()))?this.getTaxTotal():null);
            List<TaxTotalType> rhsTaxTotal;
            rhsTaxTotal = (((that.taxTotal!= null)&&(!that.taxTotal.isEmpty()))?that.getTaxTotal():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxTotal", lhsTaxTotal), LocatorUtils.property(thatLocator, "taxTotal", rhsTaxTotal), lhsTaxTotal, rhsTaxTotal, ((this.taxTotal!= null)&&(!this.taxTotal.isEmpty())), ((that.taxTotal!= null)&&(!that.taxTotal.isEmpty())))) {
                return false;
            }
        }
        {
            EnergyWaterSupplyType lhsEnergyWaterSupply;
            lhsEnergyWaterSupply = this.getEnergyWaterSupply();
            EnergyWaterSupplyType rhsEnergyWaterSupply;
            rhsEnergyWaterSupply = that.getEnergyWaterSupply();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energyWaterSupply", lhsEnergyWaterSupply), LocatorUtils.property(thatLocator, "energyWaterSupply", rhsEnergyWaterSupply), lhsEnergyWaterSupply, rhsEnergyWaterSupply, (this.energyWaterSupply!= null), (that.energyWaterSupply!= null))) {
                return false;
            }
        }
        {
            TelecommunicationsSupplyType lhsTelecommunicationsSupply;
            lhsTelecommunicationsSupply = this.getTelecommunicationsSupply();
            TelecommunicationsSupplyType rhsTelecommunicationsSupply;
            rhsTelecommunicationsSupply = that.getTelecommunicationsSupply();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telecommunicationsSupply", lhsTelecommunicationsSupply), LocatorUtils.property(thatLocator, "telecommunicationsSupply", rhsTelecommunicationsSupply), lhsTelecommunicationsSupply, rhsTelecommunicationsSupply, (this.telecommunicationsSupply!= null), (that.telecommunicationsSupply!= null))) {
                return false;
            }
        }
        {
            MonetaryTotalType lhsLegalMonetaryTotal;
            lhsLegalMonetaryTotal = this.getLegalMonetaryTotal();
            MonetaryTotalType rhsLegalMonetaryTotal;
            rhsLegalMonetaryTotal = that.getLegalMonetaryTotal();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "legalMonetaryTotal", lhsLegalMonetaryTotal), LocatorUtils.property(thatLocator, "legalMonetaryTotal", rhsLegalMonetaryTotal), lhsLegalMonetaryTotal, rhsLegalMonetaryTotal, (this.legalMonetaryTotal!= null), (that.legalMonetaryTotal!= null))) {
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
            UtilityStatementTypeCodeType theUtilityStatementTypeCode;
            theUtilityStatementTypeCode = this.getUtilityStatementTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "utilityStatementTypeCode", theUtilityStatementTypeCode), currentHashCode, theUtilityStatementTypeCode, (this.utilityStatementTypeCode!= null));
        }
        {
            PeriodType theMainPeriod;
            theMainPeriod = this.getMainPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mainPeriod", theMainPeriod), currentHashCode, theMainPeriod, (this.mainPeriod!= null));
        }
        {
            List<AllowanceChargeType> theAllowanceCharge;
            theAllowanceCharge = (((this.allowanceCharge!= null)&&(!this.allowanceCharge.isEmpty()))?this.getAllowanceCharge():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allowanceCharge", theAllowanceCharge), currentHashCode, theAllowanceCharge, ((this.allowanceCharge!= null)&&(!this.allowanceCharge.isEmpty())));
        }
        {
            List<TaxTotalType> theTaxTotal;
            theTaxTotal = (((this.taxTotal!= null)&&(!this.taxTotal.isEmpty()))?this.getTaxTotal():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxTotal", theTaxTotal), currentHashCode, theTaxTotal, ((this.taxTotal!= null)&&(!this.taxTotal.isEmpty())));
        }
        {
            EnergyWaterSupplyType theEnergyWaterSupply;
            theEnergyWaterSupply = this.getEnergyWaterSupply();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "energyWaterSupply", theEnergyWaterSupply), currentHashCode, theEnergyWaterSupply, (this.energyWaterSupply!= null));
        }
        {
            TelecommunicationsSupplyType theTelecommunicationsSupply;
            theTelecommunicationsSupply = this.getTelecommunicationsSupply();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "telecommunicationsSupply", theTelecommunicationsSupply), currentHashCode, theTelecommunicationsSupply, (this.telecommunicationsSupply!= null));
        }
        {
            MonetaryTotalType theLegalMonetaryTotal;
            theLegalMonetaryTotal = this.getLegalMonetaryTotal();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "legalMonetaryTotal", theLegalMonetaryTotal), currentHashCode, theLegalMonetaryTotal, (this.legalMonetaryTotal!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
