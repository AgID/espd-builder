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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AverageSubsequentContractAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EstimatedOverallContractAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MaximumAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MinimumAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MonetaryScopeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TaxIncludedIndicatorType;
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
 * <p>Classe Java per RequestedTenderTotalType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RequestedTenderTotalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EstimatedOverallContractAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxIncludedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MonetaryScope" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AverageSubsequentContractAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ApplicableTaxCategory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestedTenderTotalType", propOrder = {
    "estimatedOverallContractAmount",
    "totalAmount",
    "taxIncludedIndicator",
    "minimumAmount",
    "maximumAmount",
    "monetaryScope",
    "averageSubsequentContractAmount",
    "applicableTaxCategory"
})
public class RequestedTenderTotalType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "EstimatedOverallContractAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EstimatedOverallContractAmountType estimatedOverallContractAmount;
    @XmlElement(name = "TotalAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TotalAmountType totalAmount;
    @XmlElement(name = "TaxIncludedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TaxIncludedIndicatorType taxIncludedIndicator;
    @XmlElement(name = "MinimumAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MinimumAmountType minimumAmount;
    @XmlElement(name = "MaximumAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MaximumAmountType maximumAmount;
    @XmlElement(name = "MonetaryScope", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<MonetaryScopeType> monetaryScope;
    @XmlElement(name = "AverageSubsequentContractAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AverageSubsequentContractAmountType averageSubsequentContractAmount;
    @XmlElement(name = "ApplicableTaxCategory")
    protected List<TaxCategoryType> applicableTaxCategory;

    /**
     * Recupera il valore della proprietà estimatedOverallContractAmount.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedOverallContractAmountType }
     *     
     */
    public EstimatedOverallContractAmountType getEstimatedOverallContractAmount() {
        return estimatedOverallContractAmount;
    }

    /**
     * Imposta il valore della proprietà estimatedOverallContractAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedOverallContractAmountType }
     *     
     */
    public void setEstimatedOverallContractAmount(EstimatedOverallContractAmountType value) {
        this.estimatedOverallContractAmount = value;
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
     * Recupera il valore della proprietà minimumAmount.
     * 
     * @return
     *     possible object is
     *     {@link MinimumAmountType }
     *     
     */
    public MinimumAmountType getMinimumAmount() {
        return minimumAmount;
    }

    /**
     * Imposta il valore della proprietà minimumAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumAmountType }
     *     
     */
    public void setMinimumAmount(MinimumAmountType value) {
        this.minimumAmount = value;
    }

    /**
     * Recupera il valore della proprietà maximumAmount.
     * 
     * @return
     *     possible object is
     *     {@link MaximumAmountType }
     *     
     */
    public MaximumAmountType getMaximumAmount() {
        return maximumAmount;
    }

    /**
     * Imposta il valore della proprietà maximumAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumAmountType }
     *     
     */
    public void setMaximumAmount(MaximumAmountType value) {
        this.maximumAmount = value;
    }

    /**
     * Gets the value of the monetaryScope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monetaryScope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonetaryScope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryScopeType }
     * 
     * 
     */
    public List<MonetaryScopeType> getMonetaryScope() {
        if (monetaryScope == null) {
            monetaryScope = new ArrayList<MonetaryScopeType>();
        }
        return this.monetaryScope;
    }

    /**
     * Recupera il valore della proprietà averageSubsequentContractAmount.
     * 
     * @return
     *     possible object is
     *     {@link AverageSubsequentContractAmountType }
     *     
     */
    public AverageSubsequentContractAmountType getAverageSubsequentContractAmount() {
        return averageSubsequentContractAmount;
    }

    /**
     * Imposta il valore della proprietà averageSubsequentContractAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AverageSubsequentContractAmountType }
     *     
     */
    public void setAverageSubsequentContractAmount(AverageSubsequentContractAmountType value) {
        this.averageSubsequentContractAmount = value;
    }

    /**
     * Gets the value of the applicableTaxCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableTaxCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableTaxCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxCategoryType }
     * 
     * 
     */
    public List<TaxCategoryType> getApplicableTaxCategory() {
        if (applicableTaxCategory == null) {
            applicableTaxCategory = new ArrayList<TaxCategoryType>();
        }
        return this.applicableTaxCategory;
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
            EstimatedOverallContractAmountType theEstimatedOverallContractAmount;
            theEstimatedOverallContractAmount = this.getEstimatedOverallContractAmount();
            strategy.appendField(locator, this, "estimatedOverallContractAmount", buffer, theEstimatedOverallContractAmount, (this.estimatedOverallContractAmount!= null));
        }
        {
            TotalAmountType theTotalAmount;
            theTotalAmount = this.getTotalAmount();
            strategy.appendField(locator, this, "totalAmount", buffer, theTotalAmount, (this.totalAmount!= null));
        }
        {
            TaxIncludedIndicatorType theTaxIncludedIndicator;
            theTaxIncludedIndicator = this.getTaxIncludedIndicator();
            strategy.appendField(locator, this, "taxIncludedIndicator", buffer, theTaxIncludedIndicator, (this.taxIncludedIndicator!= null));
        }
        {
            MinimumAmountType theMinimumAmount;
            theMinimumAmount = this.getMinimumAmount();
            strategy.appendField(locator, this, "minimumAmount", buffer, theMinimumAmount, (this.minimumAmount!= null));
        }
        {
            MaximumAmountType theMaximumAmount;
            theMaximumAmount = this.getMaximumAmount();
            strategy.appendField(locator, this, "maximumAmount", buffer, theMaximumAmount, (this.maximumAmount!= null));
        }
        {
            List<MonetaryScopeType> theMonetaryScope;
            theMonetaryScope = (((this.monetaryScope!= null)&&(!this.monetaryScope.isEmpty()))?this.getMonetaryScope():null);
            strategy.appendField(locator, this, "monetaryScope", buffer, theMonetaryScope, ((this.monetaryScope!= null)&&(!this.monetaryScope.isEmpty())));
        }
        {
            AverageSubsequentContractAmountType theAverageSubsequentContractAmount;
            theAverageSubsequentContractAmount = this.getAverageSubsequentContractAmount();
            strategy.appendField(locator, this, "averageSubsequentContractAmount", buffer, theAverageSubsequentContractAmount, (this.averageSubsequentContractAmount!= null));
        }
        {
            List<TaxCategoryType> theApplicableTaxCategory;
            theApplicableTaxCategory = (((this.applicableTaxCategory!= null)&&(!this.applicableTaxCategory.isEmpty()))?this.getApplicableTaxCategory():null);
            strategy.appendField(locator, this, "applicableTaxCategory", buffer, theApplicableTaxCategory, ((this.applicableTaxCategory!= null)&&(!this.applicableTaxCategory.isEmpty())));
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
        final RequestedTenderTotalType that = ((RequestedTenderTotalType) object);
        {
            EstimatedOverallContractAmountType lhsEstimatedOverallContractAmount;
            lhsEstimatedOverallContractAmount = this.getEstimatedOverallContractAmount();
            EstimatedOverallContractAmountType rhsEstimatedOverallContractAmount;
            rhsEstimatedOverallContractAmount = that.getEstimatedOverallContractAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "estimatedOverallContractAmount", lhsEstimatedOverallContractAmount), LocatorUtils.property(thatLocator, "estimatedOverallContractAmount", rhsEstimatedOverallContractAmount), lhsEstimatedOverallContractAmount, rhsEstimatedOverallContractAmount, (this.estimatedOverallContractAmount!= null), (that.estimatedOverallContractAmount!= null))) {
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
            TaxIncludedIndicatorType lhsTaxIncludedIndicator;
            lhsTaxIncludedIndicator = this.getTaxIncludedIndicator();
            TaxIncludedIndicatorType rhsTaxIncludedIndicator;
            rhsTaxIncludedIndicator = that.getTaxIncludedIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxIncludedIndicator", lhsTaxIncludedIndicator), LocatorUtils.property(thatLocator, "taxIncludedIndicator", rhsTaxIncludedIndicator), lhsTaxIncludedIndicator, rhsTaxIncludedIndicator, (this.taxIncludedIndicator!= null), (that.taxIncludedIndicator!= null))) {
                return false;
            }
        }
        {
            MinimumAmountType lhsMinimumAmount;
            lhsMinimumAmount = this.getMinimumAmount();
            MinimumAmountType rhsMinimumAmount;
            rhsMinimumAmount = that.getMinimumAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minimumAmount", lhsMinimumAmount), LocatorUtils.property(thatLocator, "minimumAmount", rhsMinimumAmount), lhsMinimumAmount, rhsMinimumAmount, (this.minimumAmount!= null), (that.minimumAmount!= null))) {
                return false;
            }
        }
        {
            MaximumAmountType lhsMaximumAmount;
            lhsMaximumAmount = this.getMaximumAmount();
            MaximumAmountType rhsMaximumAmount;
            rhsMaximumAmount = that.getMaximumAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumAmount", lhsMaximumAmount), LocatorUtils.property(thatLocator, "maximumAmount", rhsMaximumAmount), lhsMaximumAmount, rhsMaximumAmount, (this.maximumAmount!= null), (that.maximumAmount!= null))) {
                return false;
            }
        }
        {
            List<MonetaryScopeType> lhsMonetaryScope;
            lhsMonetaryScope = (((this.monetaryScope!= null)&&(!this.monetaryScope.isEmpty()))?this.getMonetaryScope():null);
            List<MonetaryScopeType> rhsMonetaryScope;
            rhsMonetaryScope = (((that.monetaryScope!= null)&&(!that.monetaryScope.isEmpty()))?that.getMonetaryScope():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "monetaryScope", lhsMonetaryScope), LocatorUtils.property(thatLocator, "monetaryScope", rhsMonetaryScope), lhsMonetaryScope, rhsMonetaryScope, ((this.monetaryScope!= null)&&(!this.monetaryScope.isEmpty())), ((that.monetaryScope!= null)&&(!that.monetaryScope.isEmpty())))) {
                return false;
            }
        }
        {
            AverageSubsequentContractAmountType lhsAverageSubsequentContractAmount;
            lhsAverageSubsequentContractAmount = this.getAverageSubsequentContractAmount();
            AverageSubsequentContractAmountType rhsAverageSubsequentContractAmount;
            rhsAverageSubsequentContractAmount = that.getAverageSubsequentContractAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "averageSubsequentContractAmount", lhsAverageSubsequentContractAmount), LocatorUtils.property(thatLocator, "averageSubsequentContractAmount", rhsAverageSubsequentContractAmount), lhsAverageSubsequentContractAmount, rhsAverageSubsequentContractAmount, (this.averageSubsequentContractAmount!= null), (that.averageSubsequentContractAmount!= null))) {
                return false;
            }
        }
        {
            List<TaxCategoryType> lhsApplicableTaxCategory;
            lhsApplicableTaxCategory = (((this.applicableTaxCategory!= null)&&(!this.applicableTaxCategory.isEmpty()))?this.getApplicableTaxCategory():null);
            List<TaxCategoryType> rhsApplicableTaxCategory;
            rhsApplicableTaxCategory = (((that.applicableTaxCategory!= null)&&(!that.applicableTaxCategory.isEmpty()))?that.getApplicableTaxCategory():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "applicableTaxCategory", lhsApplicableTaxCategory), LocatorUtils.property(thatLocator, "applicableTaxCategory", rhsApplicableTaxCategory), lhsApplicableTaxCategory, rhsApplicableTaxCategory, ((this.applicableTaxCategory!= null)&&(!this.applicableTaxCategory.isEmpty())), ((that.applicableTaxCategory!= null)&&(!that.applicableTaxCategory.isEmpty())))) {
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
            EstimatedOverallContractAmountType theEstimatedOverallContractAmount;
            theEstimatedOverallContractAmount = this.getEstimatedOverallContractAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "estimatedOverallContractAmount", theEstimatedOverallContractAmount), currentHashCode, theEstimatedOverallContractAmount, (this.estimatedOverallContractAmount!= null));
        }
        {
            TotalAmountType theTotalAmount;
            theTotalAmount = this.getTotalAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalAmount", theTotalAmount), currentHashCode, theTotalAmount, (this.totalAmount!= null));
        }
        {
            TaxIncludedIndicatorType theTaxIncludedIndicator;
            theTaxIncludedIndicator = this.getTaxIncludedIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxIncludedIndicator", theTaxIncludedIndicator), currentHashCode, theTaxIncludedIndicator, (this.taxIncludedIndicator!= null));
        }
        {
            MinimumAmountType theMinimumAmount;
            theMinimumAmount = this.getMinimumAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minimumAmount", theMinimumAmount), currentHashCode, theMinimumAmount, (this.minimumAmount!= null));
        }
        {
            MaximumAmountType theMaximumAmount;
            theMaximumAmount = this.getMaximumAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumAmount", theMaximumAmount), currentHashCode, theMaximumAmount, (this.maximumAmount!= null));
        }
        {
            List<MonetaryScopeType> theMonetaryScope;
            theMonetaryScope = (((this.monetaryScope!= null)&&(!this.monetaryScope.isEmpty()))?this.getMonetaryScope():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "monetaryScope", theMonetaryScope), currentHashCode, theMonetaryScope, ((this.monetaryScope!= null)&&(!this.monetaryScope.isEmpty())));
        }
        {
            AverageSubsequentContractAmountType theAverageSubsequentContractAmount;
            theAverageSubsequentContractAmount = this.getAverageSubsequentContractAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "averageSubsequentContractAmount", theAverageSubsequentContractAmount), currentHashCode, theAverageSubsequentContractAmount, (this.averageSubsequentContractAmount!= null));
        }
        {
            List<TaxCategoryType> theApplicableTaxCategory;
            theApplicableTaxCategory = (((this.applicableTaxCategory!= null)&&(!this.applicableTaxCategory.isEmpty()))?this.getApplicableTaxCategory():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "applicableTaxCategory", theApplicableTaxCategory), currentHashCode, theApplicableTaxCategory, ((this.applicableTaxCategory!= null)&&(!this.applicableTaxCategory.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
