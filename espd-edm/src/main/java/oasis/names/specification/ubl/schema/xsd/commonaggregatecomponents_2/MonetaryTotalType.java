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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AllowanceTotalAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ChargeTotalAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LineExtensionAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PayableAlternativeAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PayableAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PayableRoundingAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PrepaidAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TaxExclusiveAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TaxInclusiveAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.WithholdingTaxTotalAmountType;
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
 * <p>Classe Java per MonetaryTotalType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MonetaryTotalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LineExtensionAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxExclusiveAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxInclusiveAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AllowanceTotalAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ChargeTotalAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WithholdingTaxTotalAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PrepaidAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PayableRoundingAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PayableAmount"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PayableAlternativeAmount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryTotalType", propOrder = {
    "lineExtensionAmount",
    "taxExclusiveAmount",
    "taxInclusiveAmount",
    "allowanceTotalAmount",
    "chargeTotalAmount",
    "withholdingTaxTotalAmount",
    "prepaidAmount",
    "payableRoundingAmount",
    "payableAmount",
    "payableAlternativeAmount"
})
public class MonetaryTotalType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "LineExtensionAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LineExtensionAmountType lineExtensionAmount;
    @XmlElement(name = "TaxExclusiveAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TaxExclusiveAmountType taxExclusiveAmount;
    @XmlElement(name = "TaxInclusiveAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TaxInclusiveAmountType taxInclusiveAmount;
    @XmlElement(name = "AllowanceTotalAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AllowanceTotalAmountType allowanceTotalAmount;
    @XmlElement(name = "ChargeTotalAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ChargeTotalAmountType chargeTotalAmount;
    @XmlElement(name = "WithholdingTaxTotalAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected WithholdingTaxTotalAmountType withholdingTaxTotalAmount;
    @XmlElement(name = "PrepaidAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PrepaidAmountType prepaidAmount;
    @XmlElement(name = "PayableRoundingAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PayableRoundingAmountType payableRoundingAmount;
    @XmlElement(name = "PayableAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected PayableAmountType payableAmount;
    @XmlElement(name = "PayableAlternativeAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PayableAlternativeAmountType payableAlternativeAmount;

    /**
     * Recupera il valore della proprietà lineExtensionAmount.
     * 
     * @return
     *     possible object is
     *     {@link LineExtensionAmountType }
     *     
     */
    public LineExtensionAmountType getLineExtensionAmount() {
        return lineExtensionAmount;
    }

    /**
     * Imposta il valore della proprietà lineExtensionAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link LineExtensionAmountType }
     *     
     */
    public void setLineExtensionAmount(LineExtensionAmountType value) {
        this.lineExtensionAmount = value;
    }

    /**
     * Recupera il valore della proprietà taxExclusiveAmount.
     * 
     * @return
     *     possible object is
     *     {@link TaxExclusiveAmountType }
     *     
     */
    public TaxExclusiveAmountType getTaxExclusiveAmount() {
        return taxExclusiveAmount;
    }

    /**
     * Imposta il valore della proprietà taxExclusiveAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExclusiveAmountType }
     *     
     */
    public void setTaxExclusiveAmount(TaxExclusiveAmountType value) {
        this.taxExclusiveAmount = value;
    }

    /**
     * Recupera il valore della proprietà taxInclusiveAmount.
     * 
     * @return
     *     possible object is
     *     {@link TaxInclusiveAmountType }
     *     
     */
    public TaxInclusiveAmountType getTaxInclusiveAmount() {
        return taxInclusiveAmount;
    }

    /**
     * Imposta il valore della proprietà taxInclusiveAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxInclusiveAmountType }
     *     
     */
    public void setTaxInclusiveAmount(TaxInclusiveAmountType value) {
        this.taxInclusiveAmount = value;
    }

    /**
     * Recupera il valore della proprietà allowanceTotalAmount.
     * 
     * @return
     *     possible object is
     *     {@link AllowanceTotalAmountType }
     *     
     */
    public AllowanceTotalAmountType getAllowanceTotalAmount() {
        return allowanceTotalAmount;
    }

    /**
     * Imposta il valore della proprietà allowanceTotalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowanceTotalAmountType }
     *     
     */
    public void setAllowanceTotalAmount(AllowanceTotalAmountType value) {
        this.allowanceTotalAmount = value;
    }

    /**
     * Recupera il valore della proprietà chargeTotalAmount.
     * 
     * @return
     *     possible object is
     *     {@link ChargeTotalAmountType }
     *     
     */
    public ChargeTotalAmountType getChargeTotalAmount() {
        return chargeTotalAmount;
    }

    /**
     * Imposta il valore della proprietà chargeTotalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeTotalAmountType }
     *     
     */
    public void setChargeTotalAmount(ChargeTotalAmountType value) {
        this.chargeTotalAmount = value;
    }

    /**
     * Recupera il valore della proprietà withholdingTaxTotalAmount.
     * 
     * @return
     *     possible object is
     *     {@link WithholdingTaxTotalAmountType }
     *     
     */
    public WithholdingTaxTotalAmountType getWithholdingTaxTotalAmount() {
        return withholdingTaxTotalAmount;
    }

    /**
     * Imposta il valore della proprietà withholdingTaxTotalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link WithholdingTaxTotalAmountType }
     *     
     */
    public void setWithholdingTaxTotalAmount(WithholdingTaxTotalAmountType value) {
        this.withholdingTaxTotalAmount = value;
    }

    /**
     * Recupera il valore della proprietà prepaidAmount.
     * 
     * @return
     *     possible object is
     *     {@link PrepaidAmountType }
     *     
     */
    public PrepaidAmountType getPrepaidAmount() {
        return prepaidAmount;
    }

    /**
     * Imposta il valore della proprietà prepaidAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepaidAmountType }
     *     
     */
    public void setPrepaidAmount(PrepaidAmountType value) {
        this.prepaidAmount = value;
    }

    /**
     * Recupera il valore della proprietà payableRoundingAmount.
     * 
     * @return
     *     possible object is
     *     {@link PayableRoundingAmountType }
     *     
     */
    public PayableRoundingAmountType getPayableRoundingAmount() {
        return payableRoundingAmount;
    }

    /**
     * Imposta il valore della proprietà payableRoundingAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link PayableRoundingAmountType }
     *     
     */
    public void setPayableRoundingAmount(PayableRoundingAmountType value) {
        this.payableRoundingAmount = value;
    }

    /**
     * Recupera il valore della proprietà payableAmount.
     * 
     * @return
     *     possible object is
     *     {@link PayableAmountType }
     *     
     */
    public PayableAmountType getPayableAmount() {
        return payableAmount;
    }

    /**
     * Imposta il valore della proprietà payableAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link PayableAmountType }
     *     
     */
    public void setPayableAmount(PayableAmountType value) {
        this.payableAmount = value;
    }

    /**
     * Recupera il valore della proprietà payableAlternativeAmount.
     * 
     * @return
     *     possible object is
     *     {@link PayableAlternativeAmountType }
     *     
     */
    public PayableAlternativeAmountType getPayableAlternativeAmount() {
        return payableAlternativeAmount;
    }

    /**
     * Imposta il valore della proprietà payableAlternativeAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link PayableAlternativeAmountType }
     *     
     */
    public void setPayableAlternativeAmount(PayableAlternativeAmountType value) {
        this.payableAlternativeAmount = value;
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
            LineExtensionAmountType theLineExtensionAmount;
            theLineExtensionAmount = this.getLineExtensionAmount();
            strategy.appendField(locator, this, "lineExtensionAmount", buffer, theLineExtensionAmount, (this.lineExtensionAmount!= null));
        }
        {
            TaxExclusiveAmountType theTaxExclusiveAmount;
            theTaxExclusiveAmount = this.getTaxExclusiveAmount();
            strategy.appendField(locator, this, "taxExclusiveAmount", buffer, theTaxExclusiveAmount, (this.taxExclusiveAmount!= null));
        }
        {
            TaxInclusiveAmountType theTaxInclusiveAmount;
            theTaxInclusiveAmount = this.getTaxInclusiveAmount();
            strategy.appendField(locator, this, "taxInclusiveAmount", buffer, theTaxInclusiveAmount, (this.taxInclusiveAmount!= null));
        }
        {
            AllowanceTotalAmountType theAllowanceTotalAmount;
            theAllowanceTotalAmount = this.getAllowanceTotalAmount();
            strategy.appendField(locator, this, "allowanceTotalAmount", buffer, theAllowanceTotalAmount, (this.allowanceTotalAmount!= null));
        }
        {
            ChargeTotalAmountType theChargeTotalAmount;
            theChargeTotalAmount = this.getChargeTotalAmount();
            strategy.appendField(locator, this, "chargeTotalAmount", buffer, theChargeTotalAmount, (this.chargeTotalAmount!= null));
        }
        {
            WithholdingTaxTotalAmountType theWithholdingTaxTotalAmount;
            theWithholdingTaxTotalAmount = this.getWithholdingTaxTotalAmount();
            strategy.appendField(locator, this, "withholdingTaxTotalAmount", buffer, theWithholdingTaxTotalAmount, (this.withholdingTaxTotalAmount!= null));
        }
        {
            PrepaidAmountType thePrepaidAmount;
            thePrepaidAmount = this.getPrepaidAmount();
            strategy.appendField(locator, this, "prepaidAmount", buffer, thePrepaidAmount, (this.prepaidAmount!= null));
        }
        {
            PayableRoundingAmountType thePayableRoundingAmount;
            thePayableRoundingAmount = this.getPayableRoundingAmount();
            strategy.appendField(locator, this, "payableRoundingAmount", buffer, thePayableRoundingAmount, (this.payableRoundingAmount!= null));
        }
        {
            PayableAmountType thePayableAmount;
            thePayableAmount = this.getPayableAmount();
            strategy.appendField(locator, this, "payableAmount", buffer, thePayableAmount, (this.payableAmount!= null));
        }
        {
            PayableAlternativeAmountType thePayableAlternativeAmount;
            thePayableAlternativeAmount = this.getPayableAlternativeAmount();
            strategy.appendField(locator, this, "payableAlternativeAmount", buffer, thePayableAlternativeAmount, (this.payableAlternativeAmount!= null));
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
        final MonetaryTotalType that = ((MonetaryTotalType) object);
        {
            LineExtensionAmountType lhsLineExtensionAmount;
            lhsLineExtensionAmount = this.getLineExtensionAmount();
            LineExtensionAmountType rhsLineExtensionAmount;
            rhsLineExtensionAmount = that.getLineExtensionAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lineExtensionAmount", lhsLineExtensionAmount), LocatorUtils.property(thatLocator, "lineExtensionAmount", rhsLineExtensionAmount), lhsLineExtensionAmount, rhsLineExtensionAmount, (this.lineExtensionAmount!= null), (that.lineExtensionAmount!= null))) {
                return false;
            }
        }
        {
            TaxExclusiveAmountType lhsTaxExclusiveAmount;
            lhsTaxExclusiveAmount = this.getTaxExclusiveAmount();
            TaxExclusiveAmountType rhsTaxExclusiveAmount;
            rhsTaxExclusiveAmount = that.getTaxExclusiveAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxExclusiveAmount", lhsTaxExclusiveAmount), LocatorUtils.property(thatLocator, "taxExclusiveAmount", rhsTaxExclusiveAmount), lhsTaxExclusiveAmount, rhsTaxExclusiveAmount, (this.taxExclusiveAmount!= null), (that.taxExclusiveAmount!= null))) {
                return false;
            }
        }
        {
            TaxInclusiveAmountType lhsTaxInclusiveAmount;
            lhsTaxInclusiveAmount = this.getTaxInclusiveAmount();
            TaxInclusiveAmountType rhsTaxInclusiveAmount;
            rhsTaxInclusiveAmount = that.getTaxInclusiveAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxInclusiveAmount", lhsTaxInclusiveAmount), LocatorUtils.property(thatLocator, "taxInclusiveAmount", rhsTaxInclusiveAmount), lhsTaxInclusiveAmount, rhsTaxInclusiveAmount, (this.taxInclusiveAmount!= null), (that.taxInclusiveAmount!= null))) {
                return false;
            }
        }
        {
            AllowanceTotalAmountType lhsAllowanceTotalAmount;
            lhsAllowanceTotalAmount = this.getAllowanceTotalAmount();
            AllowanceTotalAmountType rhsAllowanceTotalAmount;
            rhsAllowanceTotalAmount = that.getAllowanceTotalAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "allowanceTotalAmount", lhsAllowanceTotalAmount), LocatorUtils.property(thatLocator, "allowanceTotalAmount", rhsAllowanceTotalAmount), lhsAllowanceTotalAmount, rhsAllowanceTotalAmount, (this.allowanceTotalAmount!= null), (that.allowanceTotalAmount!= null))) {
                return false;
            }
        }
        {
            ChargeTotalAmountType lhsChargeTotalAmount;
            lhsChargeTotalAmount = this.getChargeTotalAmount();
            ChargeTotalAmountType rhsChargeTotalAmount;
            rhsChargeTotalAmount = that.getChargeTotalAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "chargeTotalAmount", lhsChargeTotalAmount), LocatorUtils.property(thatLocator, "chargeTotalAmount", rhsChargeTotalAmount), lhsChargeTotalAmount, rhsChargeTotalAmount, (this.chargeTotalAmount!= null), (that.chargeTotalAmount!= null))) {
                return false;
            }
        }
        {
            WithholdingTaxTotalAmountType lhsWithholdingTaxTotalAmount;
            lhsWithholdingTaxTotalAmount = this.getWithholdingTaxTotalAmount();
            WithholdingTaxTotalAmountType rhsWithholdingTaxTotalAmount;
            rhsWithholdingTaxTotalAmount = that.getWithholdingTaxTotalAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "withholdingTaxTotalAmount", lhsWithholdingTaxTotalAmount), LocatorUtils.property(thatLocator, "withholdingTaxTotalAmount", rhsWithholdingTaxTotalAmount), lhsWithholdingTaxTotalAmount, rhsWithholdingTaxTotalAmount, (this.withholdingTaxTotalAmount!= null), (that.withholdingTaxTotalAmount!= null))) {
                return false;
            }
        }
        {
            PrepaidAmountType lhsPrepaidAmount;
            lhsPrepaidAmount = this.getPrepaidAmount();
            PrepaidAmountType rhsPrepaidAmount;
            rhsPrepaidAmount = that.getPrepaidAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "prepaidAmount", lhsPrepaidAmount), LocatorUtils.property(thatLocator, "prepaidAmount", rhsPrepaidAmount), lhsPrepaidAmount, rhsPrepaidAmount, (this.prepaidAmount!= null), (that.prepaidAmount!= null))) {
                return false;
            }
        }
        {
            PayableRoundingAmountType lhsPayableRoundingAmount;
            lhsPayableRoundingAmount = this.getPayableRoundingAmount();
            PayableRoundingAmountType rhsPayableRoundingAmount;
            rhsPayableRoundingAmount = that.getPayableRoundingAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "payableRoundingAmount", lhsPayableRoundingAmount), LocatorUtils.property(thatLocator, "payableRoundingAmount", rhsPayableRoundingAmount), lhsPayableRoundingAmount, rhsPayableRoundingAmount, (this.payableRoundingAmount!= null), (that.payableRoundingAmount!= null))) {
                return false;
            }
        }
        {
            PayableAmountType lhsPayableAmount;
            lhsPayableAmount = this.getPayableAmount();
            PayableAmountType rhsPayableAmount;
            rhsPayableAmount = that.getPayableAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "payableAmount", lhsPayableAmount), LocatorUtils.property(thatLocator, "payableAmount", rhsPayableAmount), lhsPayableAmount, rhsPayableAmount, (this.payableAmount!= null), (that.payableAmount!= null))) {
                return false;
            }
        }
        {
            PayableAlternativeAmountType lhsPayableAlternativeAmount;
            lhsPayableAlternativeAmount = this.getPayableAlternativeAmount();
            PayableAlternativeAmountType rhsPayableAlternativeAmount;
            rhsPayableAlternativeAmount = that.getPayableAlternativeAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "payableAlternativeAmount", lhsPayableAlternativeAmount), LocatorUtils.property(thatLocator, "payableAlternativeAmount", rhsPayableAlternativeAmount), lhsPayableAlternativeAmount, rhsPayableAlternativeAmount, (this.payableAlternativeAmount!= null), (that.payableAlternativeAmount!= null))) {
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
            LineExtensionAmountType theLineExtensionAmount;
            theLineExtensionAmount = this.getLineExtensionAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineExtensionAmount", theLineExtensionAmount), currentHashCode, theLineExtensionAmount, (this.lineExtensionAmount!= null));
        }
        {
            TaxExclusiveAmountType theTaxExclusiveAmount;
            theTaxExclusiveAmount = this.getTaxExclusiveAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxExclusiveAmount", theTaxExclusiveAmount), currentHashCode, theTaxExclusiveAmount, (this.taxExclusiveAmount!= null));
        }
        {
            TaxInclusiveAmountType theTaxInclusiveAmount;
            theTaxInclusiveAmount = this.getTaxInclusiveAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxInclusiveAmount", theTaxInclusiveAmount), currentHashCode, theTaxInclusiveAmount, (this.taxInclusiveAmount!= null));
        }
        {
            AllowanceTotalAmountType theAllowanceTotalAmount;
            theAllowanceTotalAmount = this.getAllowanceTotalAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allowanceTotalAmount", theAllowanceTotalAmount), currentHashCode, theAllowanceTotalAmount, (this.allowanceTotalAmount!= null));
        }
        {
            ChargeTotalAmountType theChargeTotalAmount;
            theChargeTotalAmount = this.getChargeTotalAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "chargeTotalAmount", theChargeTotalAmount), currentHashCode, theChargeTotalAmount, (this.chargeTotalAmount!= null));
        }
        {
            WithholdingTaxTotalAmountType theWithholdingTaxTotalAmount;
            theWithholdingTaxTotalAmount = this.getWithholdingTaxTotalAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "withholdingTaxTotalAmount", theWithholdingTaxTotalAmount), currentHashCode, theWithholdingTaxTotalAmount, (this.withholdingTaxTotalAmount!= null));
        }
        {
            PrepaidAmountType thePrepaidAmount;
            thePrepaidAmount = this.getPrepaidAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prepaidAmount", thePrepaidAmount), currentHashCode, thePrepaidAmount, (this.prepaidAmount!= null));
        }
        {
            PayableRoundingAmountType thePayableRoundingAmount;
            thePayableRoundingAmount = this.getPayableRoundingAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "payableRoundingAmount", thePayableRoundingAmount), currentHashCode, thePayableRoundingAmount, (this.payableRoundingAmount!= null));
        }
        {
            PayableAmountType thePayableAmount;
            thePayableAmount = this.getPayableAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "payableAmount", thePayableAmount), currentHashCode, thePayableAmount, (this.payableAmount!= null));
        }
        {
            PayableAlternativeAmountType thePayableAlternativeAmount;
            thePayableAlternativeAmount = this.getPayableAlternativeAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "payableAlternativeAmount", thePayableAlternativeAmount), currentHashCode, thePayableAlternativeAmount, (this.payableAlternativeAmount!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
