//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CalculationRateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExchangeMarketIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MathematicOperatorCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SourceCurrencyBaseRateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SourceCurrencyCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TargetCurrencyBaseRateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TargetCurrencyCodeType;
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
 * <p>Classe Java per ExchangeRateType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ExchangeRateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SourceCurrencyCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SourceCurrencyBaseRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TargetCurrencyCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TargetCurrencyBaseRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExchangeMarketID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CalculationRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MathematicOperatorCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Date" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ForeignExchangeContract" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeRateType", propOrder = {
    "sourceCurrencyCode",
    "sourceCurrencyBaseRate",
    "targetCurrencyCode",
    "targetCurrencyBaseRate",
    "exchangeMarketID",
    "calculationRate",
    "mathematicOperatorCode",
    "date",
    "foreignExchangeContract"
})
public class ExchangeRateType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "SourceCurrencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected SourceCurrencyCodeType sourceCurrencyCode;
    @XmlElement(name = "SourceCurrencyBaseRate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SourceCurrencyBaseRateType sourceCurrencyBaseRate;
    @XmlElement(name = "TargetCurrencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected TargetCurrencyCodeType targetCurrencyCode;
    @XmlElement(name = "TargetCurrencyBaseRate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TargetCurrencyBaseRateType targetCurrencyBaseRate;
    @XmlElement(name = "ExchangeMarketID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ExchangeMarketIDType exchangeMarketID;
    @XmlElement(name = "CalculationRate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CalculationRateType calculationRate;
    @XmlElement(name = "MathematicOperatorCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MathematicOperatorCodeType mathematicOperatorCode;
    @XmlElement(name = "Date", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DateType date;
    @XmlElement(name = "ForeignExchangeContract")
    protected ContractType foreignExchangeContract;

    /**
     * Recupera il valore della proprietà sourceCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link SourceCurrencyCodeType }
     *     
     */
    public SourceCurrencyCodeType getSourceCurrencyCode() {
        return sourceCurrencyCode;
    }

    /**
     * Imposta il valore della proprietà sourceCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceCurrencyCodeType }
     *     
     */
    public void setSourceCurrencyCode(SourceCurrencyCodeType value) {
        this.sourceCurrencyCode = value;
    }

    /**
     * Recupera il valore della proprietà sourceCurrencyBaseRate.
     * 
     * @return
     *     possible object is
     *     {@link SourceCurrencyBaseRateType }
     *     
     */
    public SourceCurrencyBaseRateType getSourceCurrencyBaseRate() {
        return sourceCurrencyBaseRate;
    }

    /**
     * Imposta il valore della proprietà sourceCurrencyBaseRate.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceCurrencyBaseRateType }
     *     
     */
    public void setSourceCurrencyBaseRate(SourceCurrencyBaseRateType value) {
        this.sourceCurrencyBaseRate = value;
    }

    /**
     * Recupera il valore della proprietà targetCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link TargetCurrencyCodeType }
     *     
     */
    public TargetCurrencyCodeType getTargetCurrencyCode() {
        return targetCurrencyCode;
    }

    /**
     * Imposta il valore della proprietà targetCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetCurrencyCodeType }
     *     
     */
    public void setTargetCurrencyCode(TargetCurrencyCodeType value) {
        this.targetCurrencyCode = value;
    }

    /**
     * Recupera il valore della proprietà targetCurrencyBaseRate.
     * 
     * @return
     *     possible object is
     *     {@link TargetCurrencyBaseRateType }
     *     
     */
    public TargetCurrencyBaseRateType getTargetCurrencyBaseRate() {
        return targetCurrencyBaseRate;
    }

    /**
     * Imposta il valore della proprietà targetCurrencyBaseRate.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetCurrencyBaseRateType }
     *     
     */
    public void setTargetCurrencyBaseRate(TargetCurrencyBaseRateType value) {
        this.targetCurrencyBaseRate = value;
    }

    /**
     * Recupera il valore della proprietà exchangeMarketID.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeMarketIDType }
     *     
     */
    public ExchangeMarketIDType getExchangeMarketID() {
        return exchangeMarketID;
    }

    /**
     * Imposta il valore della proprietà exchangeMarketID.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeMarketIDType }
     *     
     */
    public void setExchangeMarketID(ExchangeMarketIDType value) {
        this.exchangeMarketID = value;
    }

    /**
     * Recupera il valore della proprietà calculationRate.
     * 
     * @return
     *     possible object is
     *     {@link CalculationRateType }
     *     
     */
    public CalculationRateType getCalculationRate() {
        return calculationRate;
    }

    /**
     * Imposta il valore della proprietà calculationRate.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationRateType }
     *     
     */
    public void setCalculationRate(CalculationRateType value) {
        this.calculationRate = value;
    }

    /**
     * Recupera il valore della proprietà mathematicOperatorCode.
     * 
     * @return
     *     possible object is
     *     {@link MathematicOperatorCodeType }
     *     
     */
    public MathematicOperatorCodeType getMathematicOperatorCode() {
        return mathematicOperatorCode;
    }

    /**
     * Imposta il valore della proprietà mathematicOperatorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link MathematicOperatorCodeType }
     *     
     */
    public void setMathematicOperatorCode(MathematicOperatorCodeType value) {
        this.mathematicOperatorCode = value;
    }

    /**
     * Recupera il valore della proprietà date.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getDate() {
        return date;
    }

    /**
     * Imposta il valore della proprietà date.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setDate(DateType value) {
        this.date = value;
    }

    /**
     * Recupera il valore della proprietà foreignExchangeContract.
     * 
     * @return
     *     possible object is
     *     {@link ContractType }
     *     
     */
    public ContractType getForeignExchangeContract() {
        return foreignExchangeContract;
    }

    /**
     * Imposta il valore della proprietà foreignExchangeContract.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractType }
     *     
     */
    public void setForeignExchangeContract(ContractType value) {
        this.foreignExchangeContract = value;
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
            SourceCurrencyCodeType theSourceCurrencyCode;
            theSourceCurrencyCode = this.getSourceCurrencyCode();
            strategy.appendField(locator, this, "sourceCurrencyCode", buffer, theSourceCurrencyCode, (this.sourceCurrencyCode!= null));
        }
        {
            SourceCurrencyBaseRateType theSourceCurrencyBaseRate;
            theSourceCurrencyBaseRate = this.getSourceCurrencyBaseRate();
            strategy.appendField(locator, this, "sourceCurrencyBaseRate", buffer, theSourceCurrencyBaseRate, (this.sourceCurrencyBaseRate!= null));
        }
        {
            TargetCurrencyCodeType theTargetCurrencyCode;
            theTargetCurrencyCode = this.getTargetCurrencyCode();
            strategy.appendField(locator, this, "targetCurrencyCode", buffer, theTargetCurrencyCode, (this.targetCurrencyCode!= null));
        }
        {
            TargetCurrencyBaseRateType theTargetCurrencyBaseRate;
            theTargetCurrencyBaseRate = this.getTargetCurrencyBaseRate();
            strategy.appendField(locator, this, "targetCurrencyBaseRate", buffer, theTargetCurrencyBaseRate, (this.targetCurrencyBaseRate!= null));
        }
        {
            ExchangeMarketIDType theExchangeMarketID;
            theExchangeMarketID = this.getExchangeMarketID();
            strategy.appendField(locator, this, "exchangeMarketID", buffer, theExchangeMarketID, (this.exchangeMarketID!= null));
        }
        {
            CalculationRateType theCalculationRate;
            theCalculationRate = this.getCalculationRate();
            strategy.appendField(locator, this, "calculationRate", buffer, theCalculationRate, (this.calculationRate!= null));
        }
        {
            MathematicOperatorCodeType theMathematicOperatorCode;
            theMathematicOperatorCode = this.getMathematicOperatorCode();
            strategy.appendField(locator, this, "mathematicOperatorCode", buffer, theMathematicOperatorCode, (this.mathematicOperatorCode!= null));
        }
        {
            DateType theDate;
            theDate = this.getDate();
            strategy.appendField(locator, this, "date", buffer, theDate, (this.date!= null));
        }
        {
            ContractType theForeignExchangeContract;
            theForeignExchangeContract = this.getForeignExchangeContract();
            strategy.appendField(locator, this, "foreignExchangeContract", buffer, theForeignExchangeContract, (this.foreignExchangeContract!= null));
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
        final ExchangeRateType that = ((ExchangeRateType) object);
        {
            SourceCurrencyCodeType lhsSourceCurrencyCode;
            lhsSourceCurrencyCode = this.getSourceCurrencyCode();
            SourceCurrencyCodeType rhsSourceCurrencyCode;
            rhsSourceCurrencyCode = that.getSourceCurrencyCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sourceCurrencyCode", lhsSourceCurrencyCode), LocatorUtils.property(thatLocator, "sourceCurrencyCode", rhsSourceCurrencyCode), lhsSourceCurrencyCode, rhsSourceCurrencyCode, (this.sourceCurrencyCode!= null), (that.sourceCurrencyCode!= null))) {
                return false;
            }
        }
        {
            SourceCurrencyBaseRateType lhsSourceCurrencyBaseRate;
            lhsSourceCurrencyBaseRate = this.getSourceCurrencyBaseRate();
            SourceCurrencyBaseRateType rhsSourceCurrencyBaseRate;
            rhsSourceCurrencyBaseRate = that.getSourceCurrencyBaseRate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sourceCurrencyBaseRate", lhsSourceCurrencyBaseRate), LocatorUtils.property(thatLocator, "sourceCurrencyBaseRate", rhsSourceCurrencyBaseRate), lhsSourceCurrencyBaseRate, rhsSourceCurrencyBaseRate, (this.sourceCurrencyBaseRate!= null), (that.sourceCurrencyBaseRate!= null))) {
                return false;
            }
        }
        {
            TargetCurrencyCodeType lhsTargetCurrencyCode;
            lhsTargetCurrencyCode = this.getTargetCurrencyCode();
            TargetCurrencyCodeType rhsTargetCurrencyCode;
            rhsTargetCurrencyCode = that.getTargetCurrencyCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "targetCurrencyCode", lhsTargetCurrencyCode), LocatorUtils.property(thatLocator, "targetCurrencyCode", rhsTargetCurrencyCode), lhsTargetCurrencyCode, rhsTargetCurrencyCode, (this.targetCurrencyCode!= null), (that.targetCurrencyCode!= null))) {
                return false;
            }
        }
        {
            TargetCurrencyBaseRateType lhsTargetCurrencyBaseRate;
            lhsTargetCurrencyBaseRate = this.getTargetCurrencyBaseRate();
            TargetCurrencyBaseRateType rhsTargetCurrencyBaseRate;
            rhsTargetCurrencyBaseRate = that.getTargetCurrencyBaseRate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "targetCurrencyBaseRate", lhsTargetCurrencyBaseRate), LocatorUtils.property(thatLocator, "targetCurrencyBaseRate", rhsTargetCurrencyBaseRate), lhsTargetCurrencyBaseRate, rhsTargetCurrencyBaseRate, (this.targetCurrencyBaseRate!= null), (that.targetCurrencyBaseRate!= null))) {
                return false;
            }
        }
        {
            ExchangeMarketIDType lhsExchangeMarketID;
            lhsExchangeMarketID = this.getExchangeMarketID();
            ExchangeMarketIDType rhsExchangeMarketID;
            rhsExchangeMarketID = that.getExchangeMarketID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exchangeMarketID", lhsExchangeMarketID), LocatorUtils.property(thatLocator, "exchangeMarketID", rhsExchangeMarketID), lhsExchangeMarketID, rhsExchangeMarketID, (this.exchangeMarketID!= null), (that.exchangeMarketID!= null))) {
                return false;
            }
        }
        {
            CalculationRateType lhsCalculationRate;
            lhsCalculationRate = this.getCalculationRate();
            CalculationRateType rhsCalculationRate;
            rhsCalculationRate = that.getCalculationRate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "calculationRate", lhsCalculationRate), LocatorUtils.property(thatLocator, "calculationRate", rhsCalculationRate), lhsCalculationRate, rhsCalculationRate, (this.calculationRate!= null), (that.calculationRate!= null))) {
                return false;
            }
        }
        {
            MathematicOperatorCodeType lhsMathematicOperatorCode;
            lhsMathematicOperatorCode = this.getMathematicOperatorCode();
            MathematicOperatorCodeType rhsMathematicOperatorCode;
            rhsMathematicOperatorCode = that.getMathematicOperatorCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mathematicOperatorCode", lhsMathematicOperatorCode), LocatorUtils.property(thatLocator, "mathematicOperatorCode", rhsMathematicOperatorCode), lhsMathematicOperatorCode, rhsMathematicOperatorCode, (this.mathematicOperatorCode!= null), (that.mathematicOperatorCode!= null))) {
                return false;
            }
        }
        {
            DateType lhsDate;
            lhsDate = this.getDate();
            DateType rhsDate;
            rhsDate = that.getDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "date", lhsDate), LocatorUtils.property(thatLocator, "date", rhsDate), lhsDate, rhsDate, (this.date!= null), (that.date!= null))) {
                return false;
            }
        }
        {
            ContractType lhsForeignExchangeContract;
            lhsForeignExchangeContract = this.getForeignExchangeContract();
            ContractType rhsForeignExchangeContract;
            rhsForeignExchangeContract = that.getForeignExchangeContract();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "foreignExchangeContract", lhsForeignExchangeContract), LocatorUtils.property(thatLocator, "foreignExchangeContract", rhsForeignExchangeContract), lhsForeignExchangeContract, rhsForeignExchangeContract, (this.foreignExchangeContract!= null), (that.foreignExchangeContract!= null))) {
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
            SourceCurrencyCodeType theSourceCurrencyCode;
            theSourceCurrencyCode = this.getSourceCurrencyCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sourceCurrencyCode", theSourceCurrencyCode), currentHashCode, theSourceCurrencyCode, (this.sourceCurrencyCode!= null));
        }
        {
            SourceCurrencyBaseRateType theSourceCurrencyBaseRate;
            theSourceCurrencyBaseRate = this.getSourceCurrencyBaseRate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sourceCurrencyBaseRate", theSourceCurrencyBaseRate), currentHashCode, theSourceCurrencyBaseRate, (this.sourceCurrencyBaseRate!= null));
        }
        {
            TargetCurrencyCodeType theTargetCurrencyCode;
            theTargetCurrencyCode = this.getTargetCurrencyCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "targetCurrencyCode", theTargetCurrencyCode), currentHashCode, theTargetCurrencyCode, (this.targetCurrencyCode!= null));
        }
        {
            TargetCurrencyBaseRateType theTargetCurrencyBaseRate;
            theTargetCurrencyBaseRate = this.getTargetCurrencyBaseRate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "targetCurrencyBaseRate", theTargetCurrencyBaseRate), currentHashCode, theTargetCurrencyBaseRate, (this.targetCurrencyBaseRate!= null));
        }
        {
            ExchangeMarketIDType theExchangeMarketID;
            theExchangeMarketID = this.getExchangeMarketID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exchangeMarketID", theExchangeMarketID), currentHashCode, theExchangeMarketID, (this.exchangeMarketID!= null));
        }
        {
            CalculationRateType theCalculationRate;
            theCalculationRate = this.getCalculationRate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "calculationRate", theCalculationRate), currentHashCode, theCalculationRate, (this.calculationRate!= null));
        }
        {
            MathematicOperatorCodeType theMathematicOperatorCode;
            theMathematicOperatorCode = this.getMathematicOperatorCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mathematicOperatorCode", theMathematicOperatorCode), currentHashCode, theMathematicOperatorCode, (this.mathematicOperatorCode!= null));
        }
        {
            DateType theDate;
            theDate = this.getDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "date", theDate), currentHashCode, theDate, (this.date!= null));
        }
        {
            ContractType theForeignExchangeContract;
            theForeignExchangeContract = this.getForeignExchangeContract();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "foreignExchangeContract", theForeignExchangeContract), currentHashCode, theForeignExchangeContract, (this.foreignExchangeContract!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
