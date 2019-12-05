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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DutyCodeType;
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
 * <p>Classe Java per DutyType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DutyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Amount"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Duty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DutyCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxCategory" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutyType", propOrder = {
    "amount",
    "duty",
    "dutyCode",
    "taxCategory"
})
public class DutyType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "Amount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected AmountType amount;
    @XmlElement(name = "Duty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DutyType duty;
    @XmlElement(name = "DutyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DutyCodeType dutyCode;
    @XmlElement(name = "TaxCategory")
    protected TaxCategoryType taxCategory;

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
     * Recupera il valore della proprietà duty.
     * 
     * @return
     *     possible object is
     *     {@link oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DutyType }
     *     
     */
    public oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DutyType getDuty() {
        return duty;
    }

    /**
     * Imposta il valore della proprietà duty.
     * 
     * @param value
     *     allowed object is
     *     {@link oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DutyType }
     *     
     */
    public void setDuty(oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DutyType value) {
        this.duty = value;
    }

    /**
     * Recupera il valore della proprietà dutyCode.
     * 
     * @return
     *     possible object is
     *     {@link DutyCodeType }
     *     
     */
    public DutyCodeType getDutyCode() {
        return dutyCode;
    }

    /**
     * Imposta il valore della proprietà dutyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link DutyCodeType }
     *     
     */
    public void setDutyCode(DutyCodeType value) {
        this.dutyCode = value;
    }

    /**
     * Recupera il valore della proprietà taxCategory.
     * 
     * @return
     *     possible object is
     *     {@link TaxCategoryType }
     *     
     */
    public TaxCategoryType getTaxCategory() {
        return taxCategory;
    }

    /**
     * Imposta il valore della proprietà taxCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCategoryType }
     *     
     */
    public void setTaxCategory(TaxCategoryType value) {
        this.taxCategory = value;
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
            AmountType theAmount;
            theAmount = this.getAmount();
            strategy.appendField(locator, this, "amount", buffer, theAmount, (this.amount!= null));
        }
        {
            oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DutyType theDuty;
            theDuty = this.getDuty();
            strategy.appendField(locator, this, "duty", buffer, theDuty, (this.duty!= null));
        }
        {
            DutyCodeType theDutyCode;
            theDutyCode = this.getDutyCode();
            strategy.appendField(locator, this, "dutyCode", buffer, theDutyCode, (this.dutyCode!= null));
        }
        {
            TaxCategoryType theTaxCategory;
            theTaxCategory = this.getTaxCategory();
            strategy.appendField(locator, this, "taxCategory", buffer, theTaxCategory, (this.taxCategory!= null));
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
        final DutyType that = ((DutyType) object);
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
            oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DutyType lhsDuty;
            lhsDuty = this.getDuty();
            oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DutyType rhsDuty;
            rhsDuty = that.getDuty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "duty", lhsDuty), LocatorUtils.property(thatLocator, "duty", rhsDuty), lhsDuty, rhsDuty, (this.duty!= null), (that.duty!= null))) {
                return false;
            }
        }
        {
            DutyCodeType lhsDutyCode;
            lhsDutyCode = this.getDutyCode();
            DutyCodeType rhsDutyCode;
            rhsDutyCode = that.getDutyCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dutyCode", lhsDutyCode), LocatorUtils.property(thatLocator, "dutyCode", rhsDutyCode), lhsDutyCode, rhsDutyCode, (this.dutyCode!= null), (that.dutyCode!= null))) {
                return false;
            }
        }
        {
            TaxCategoryType lhsTaxCategory;
            lhsTaxCategory = this.getTaxCategory();
            TaxCategoryType rhsTaxCategory;
            rhsTaxCategory = that.getTaxCategory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxCategory", lhsTaxCategory), LocatorUtils.property(thatLocator, "taxCategory", rhsTaxCategory), lhsTaxCategory, rhsTaxCategory, (this.taxCategory!= null), (that.taxCategory!= null))) {
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
            AmountType theAmount;
            theAmount = this.getAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "amount", theAmount), currentHashCode, theAmount, (this.amount!= null));
        }
        {
            oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DutyType theDuty;
            theDuty = this.getDuty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "duty", theDuty), currentHashCode, theDuty, (this.duty!= null));
        }
        {
            DutyCodeType theDutyCode;
            theDutyCode = this.getDutyCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dutyCode", theDutyCode), currentHashCode, theDutyCode, (this.dutyCode!= null));
        }
        {
            TaxCategoryType theTaxCategory;
            theTaxCategory = this.getTaxCategory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxCategory", theTaxCategory), currentHashCode, theTaxCategory, (this.taxCategory!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
