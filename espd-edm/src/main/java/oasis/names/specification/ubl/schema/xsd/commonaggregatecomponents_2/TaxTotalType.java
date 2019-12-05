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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RoundingAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TaxAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TaxEvidenceIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TaxIncludedIndicatorType;
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
 * <p>Classe Java per TaxTotalType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxTotalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxAmount"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RoundingAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxEvidenceIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxIncludedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxSubtotal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxTotalType", propOrder = {
    "taxAmount",
    "roundingAmount",
    "taxEvidenceIndicator",
    "taxIncludedIndicator",
    "taxSubtotal"
})
public class TaxTotalType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "TaxAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected TaxAmountType taxAmount;
    @XmlElement(name = "RoundingAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RoundingAmountType roundingAmount;
    @XmlElement(name = "TaxEvidenceIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TaxEvidenceIndicatorType taxEvidenceIndicator;
    @XmlElement(name = "TaxIncludedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TaxIncludedIndicatorType taxIncludedIndicator;
    @XmlElement(name = "TaxSubtotal")
    protected List<TaxSubtotalType> taxSubtotal;

    /**
     * Recupera il valore della proprietà taxAmount.
     * 
     * @return
     *     possible object is
     *     {@link TaxAmountType }
     *     
     */
    public TaxAmountType getTaxAmount() {
        return taxAmount;
    }

    /**
     * Imposta il valore della proprietà taxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAmountType }
     *     
     */
    public void setTaxAmount(TaxAmountType value) {
        this.taxAmount = value;
    }

    /**
     * Recupera il valore della proprietà roundingAmount.
     * 
     * @return
     *     possible object is
     *     {@link RoundingAmountType }
     *     
     */
    public RoundingAmountType getRoundingAmount() {
        return roundingAmount;
    }

    /**
     * Imposta il valore della proprietà roundingAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingAmountType }
     *     
     */
    public void setRoundingAmount(RoundingAmountType value) {
        this.roundingAmount = value;
    }

    /**
     * Recupera il valore della proprietà taxEvidenceIndicator.
     * 
     * @return
     *     possible object is
     *     {@link TaxEvidenceIndicatorType }
     *     
     */
    public TaxEvidenceIndicatorType getTaxEvidenceIndicator() {
        return taxEvidenceIndicator;
    }

    /**
     * Imposta il valore della proprietà taxEvidenceIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxEvidenceIndicatorType }
     *     
     */
    public void setTaxEvidenceIndicator(TaxEvidenceIndicatorType value) {
        this.taxEvidenceIndicator = value;
    }

    /**
     * Recupera il valore della proprietà taxIncludedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link TaxIncludedIndicatorType }
     *     
     */
    public TaxIncludedIndicatorType getTaxIncludedIndicator() {
        return taxIncludedIndicator;
    }

    /**
     * Imposta il valore della proprietà taxIncludedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIncludedIndicatorType }
     *     
     */
    public void setTaxIncludedIndicator(TaxIncludedIndicatorType value) {
        this.taxIncludedIndicator = value;
    }

    /**
     * Gets the value of the taxSubtotal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxSubtotal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxSubtotal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxSubtotalType }
     * 
     * 
     */
    public List<TaxSubtotalType> getTaxSubtotal() {
        if (taxSubtotal == null) {
            taxSubtotal = new ArrayList<TaxSubtotalType>();
        }
        return this.taxSubtotal;
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
            TaxAmountType theTaxAmount;
            theTaxAmount = this.getTaxAmount();
            strategy.appendField(locator, this, "taxAmount", buffer, theTaxAmount, (this.taxAmount!= null));
        }
        {
            RoundingAmountType theRoundingAmount;
            theRoundingAmount = this.getRoundingAmount();
            strategy.appendField(locator, this, "roundingAmount", buffer, theRoundingAmount, (this.roundingAmount!= null));
        }
        {
            TaxEvidenceIndicatorType theTaxEvidenceIndicator;
            theTaxEvidenceIndicator = this.getTaxEvidenceIndicator();
            strategy.appendField(locator, this, "taxEvidenceIndicator", buffer, theTaxEvidenceIndicator, (this.taxEvidenceIndicator!= null));
        }
        {
            TaxIncludedIndicatorType theTaxIncludedIndicator;
            theTaxIncludedIndicator = this.getTaxIncludedIndicator();
            strategy.appendField(locator, this, "taxIncludedIndicator", buffer, theTaxIncludedIndicator, (this.taxIncludedIndicator!= null));
        }
        {
            List<TaxSubtotalType> theTaxSubtotal;
            theTaxSubtotal = (((this.taxSubtotal!= null)&&(!this.taxSubtotal.isEmpty()))?this.getTaxSubtotal():null);
            strategy.appendField(locator, this, "taxSubtotal", buffer, theTaxSubtotal, ((this.taxSubtotal!= null)&&(!this.taxSubtotal.isEmpty())));
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
        final TaxTotalType that = ((TaxTotalType) object);
        {
            TaxAmountType lhsTaxAmount;
            lhsTaxAmount = this.getTaxAmount();
            TaxAmountType rhsTaxAmount;
            rhsTaxAmount = that.getTaxAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxAmount", lhsTaxAmount), LocatorUtils.property(thatLocator, "taxAmount", rhsTaxAmount), lhsTaxAmount, rhsTaxAmount, (this.taxAmount!= null), (that.taxAmount!= null))) {
                return false;
            }
        }
        {
            RoundingAmountType lhsRoundingAmount;
            lhsRoundingAmount = this.getRoundingAmount();
            RoundingAmountType rhsRoundingAmount;
            rhsRoundingAmount = that.getRoundingAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "roundingAmount", lhsRoundingAmount), LocatorUtils.property(thatLocator, "roundingAmount", rhsRoundingAmount), lhsRoundingAmount, rhsRoundingAmount, (this.roundingAmount!= null), (that.roundingAmount!= null))) {
                return false;
            }
        }
        {
            TaxEvidenceIndicatorType lhsTaxEvidenceIndicator;
            lhsTaxEvidenceIndicator = this.getTaxEvidenceIndicator();
            TaxEvidenceIndicatorType rhsTaxEvidenceIndicator;
            rhsTaxEvidenceIndicator = that.getTaxEvidenceIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxEvidenceIndicator", lhsTaxEvidenceIndicator), LocatorUtils.property(thatLocator, "taxEvidenceIndicator", rhsTaxEvidenceIndicator), lhsTaxEvidenceIndicator, rhsTaxEvidenceIndicator, (this.taxEvidenceIndicator!= null), (that.taxEvidenceIndicator!= null))) {
                return false;
            }
        }
        {
            TaxIncludedIndicatorType lhsTaxIncludedIndicator;
            lhsTaxIncludedIndicator = this.getTaxIncludedIndicator();
            TaxIncludedIndicatorType rhsTaxIncludedIndicator;
            rhsTaxIncludedIndicator = that.getTaxIncludedIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxIncludedIndicator", lhsTaxIncludedIndicator), LocatorUtils.property(thatLocator, "taxIncludedIndicator", rhsTaxIncludedIndicator), lhsTaxIncludedIndicator, rhsTaxIncludedIndicator, (this.taxIncludedIndicator!= null), (that.taxIncludedIndicator!= null))) {
                return false;
            }
        }
        {
            List<TaxSubtotalType> lhsTaxSubtotal;
            lhsTaxSubtotal = (((this.taxSubtotal!= null)&&(!this.taxSubtotal.isEmpty()))?this.getTaxSubtotal():null);
            List<TaxSubtotalType> rhsTaxSubtotal;
            rhsTaxSubtotal = (((that.taxSubtotal!= null)&&(!that.taxSubtotal.isEmpty()))?that.getTaxSubtotal():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxSubtotal", lhsTaxSubtotal), LocatorUtils.property(thatLocator, "taxSubtotal", rhsTaxSubtotal), lhsTaxSubtotal, rhsTaxSubtotal, ((this.taxSubtotal!= null)&&(!this.taxSubtotal.isEmpty())), ((that.taxSubtotal!= null)&&(!that.taxSubtotal.isEmpty())))) {
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
            TaxAmountType theTaxAmount;
            theTaxAmount = this.getTaxAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxAmount", theTaxAmount), currentHashCode, theTaxAmount, (this.taxAmount!= null));
        }
        {
            RoundingAmountType theRoundingAmount;
            theRoundingAmount = this.getRoundingAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "roundingAmount", theRoundingAmount), currentHashCode, theRoundingAmount, (this.roundingAmount!= null));
        }
        {
            TaxEvidenceIndicatorType theTaxEvidenceIndicator;
            theTaxEvidenceIndicator = this.getTaxEvidenceIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxEvidenceIndicator", theTaxEvidenceIndicator), currentHashCode, theTaxEvidenceIndicator, (this.taxEvidenceIndicator!= null));
        }
        {
            TaxIncludedIndicatorType theTaxIncludedIndicator;
            theTaxIncludedIndicator = this.getTaxIncludedIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxIncludedIndicator", theTaxIncludedIndicator), currentHashCode, theTaxIncludedIndicator, (this.taxIncludedIndicator!= null));
        }
        {
            List<TaxSubtotalType> theTaxSubtotal;
            theTaxSubtotal = (((this.taxSubtotal!= null)&&(!this.taxSubtotal.isEmpty()))?this.getTaxSubtotal():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxSubtotal", theTaxSubtotal), currentHashCode, theTaxSubtotal, ((this.taxSubtotal!= null)&&(!this.taxSubtotal.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
