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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TaxEnergyAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TaxEnergyBalanceAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TaxEnergyOnAccountAmountType;
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
 * <p>Classe Java per EnergyTaxReportType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EnergyTaxReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxEnergyAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxEnergyOnAccountAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxEnergyBalanceAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxScheme"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergyTaxReportType", propOrder = {
    "taxEnergyAmount",
    "taxEnergyOnAccountAmount",
    "taxEnergyBalanceAmount",
    "taxScheme"
})
public class EnergyTaxReportType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "TaxEnergyAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TaxEnergyAmountType taxEnergyAmount;
    @XmlElement(name = "TaxEnergyOnAccountAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TaxEnergyOnAccountAmountType taxEnergyOnAccountAmount;
    @XmlElement(name = "TaxEnergyBalanceAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TaxEnergyBalanceAmountType taxEnergyBalanceAmount;
    @XmlElement(name = "TaxScheme", required = true)
    protected TaxSchemeType taxScheme;

    /**
     * Recupera il valore della proprietà taxEnergyAmount.
     * 
     * @return
     *     possible object is
     *     {@link TaxEnergyAmountType }
     *     
     */
    public TaxEnergyAmountType getTaxEnergyAmount() {
        return taxEnergyAmount;
    }

    /**
     * Imposta il valore della proprietà taxEnergyAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxEnergyAmountType }
     *     
     */
    public void setTaxEnergyAmount(TaxEnergyAmountType value) {
        this.taxEnergyAmount = value;
    }

    /**
     * Recupera il valore della proprietà taxEnergyOnAccountAmount.
     * 
     * @return
     *     possible object is
     *     {@link TaxEnergyOnAccountAmountType }
     *     
     */
    public TaxEnergyOnAccountAmountType getTaxEnergyOnAccountAmount() {
        return taxEnergyOnAccountAmount;
    }

    /**
     * Imposta il valore della proprietà taxEnergyOnAccountAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxEnergyOnAccountAmountType }
     *     
     */
    public void setTaxEnergyOnAccountAmount(TaxEnergyOnAccountAmountType value) {
        this.taxEnergyOnAccountAmount = value;
    }

    /**
     * Recupera il valore della proprietà taxEnergyBalanceAmount.
     * 
     * @return
     *     possible object is
     *     {@link TaxEnergyBalanceAmountType }
     *     
     */
    public TaxEnergyBalanceAmountType getTaxEnergyBalanceAmount() {
        return taxEnergyBalanceAmount;
    }

    /**
     * Imposta il valore della proprietà taxEnergyBalanceAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxEnergyBalanceAmountType }
     *     
     */
    public void setTaxEnergyBalanceAmount(TaxEnergyBalanceAmountType value) {
        this.taxEnergyBalanceAmount = value;
    }

    /**
     * Recupera il valore della proprietà taxScheme.
     * 
     * @return
     *     possible object is
     *     {@link TaxSchemeType }
     *     
     */
    public TaxSchemeType getTaxScheme() {
        return taxScheme;
    }

    /**
     * Imposta il valore della proprietà taxScheme.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxSchemeType }
     *     
     */
    public void setTaxScheme(TaxSchemeType value) {
        this.taxScheme = value;
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
            TaxEnergyAmountType theTaxEnergyAmount;
            theTaxEnergyAmount = this.getTaxEnergyAmount();
            strategy.appendField(locator, this, "taxEnergyAmount", buffer, theTaxEnergyAmount, (this.taxEnergyAmount!= null));
        }
        {
            TaxEnergyOnAccountAmountType theTaxEnergyOnAccountAmount;
            theTaxEnergyOnAccountAmount = this.getTaxEnergyOnAccountAmount();
            strategy.appendField(locator, this, "taxEnergyOnAccountAmount", buffer, theTaxEnergyOnAccountAmount, (this.taxEnergyOnAccountAmount!= null));
        }
        {
            TaxEnergyBalanceAmountType theTaxEnergyBalanceAmount;
            theTaxEnergyBalanceAmount = this.getTaxEnergyBalanceAmount();
            strategy.appendField(locator, this, "taxEnergyBalanceAmount", buffer, theTaxEnergyBalanceAmount, (this.taxEnergyBalanceAmount!= null));
        }
        {
            TaxSchemeType theTaxScheme;
            theTaxScheme = this.getTaxScheme();
            strategy.appendField(locator, this, "taxScheme", buffer, theTaxScheme, (this.taxScheme!= null));
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
        final EnergyTaxReportType that = ((EnergyTaxReportType) object);
        {
            TaxEnergyAmountType lhsTaxEnergyAmount;
            lhsTaxEnergyAmount = this.getTaxEnergyAmount();
            TaxEnergyAmountType rhsTaxEnergyAmount;
            rhsTaxEnergyAmount = that.getTaxEnergyAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxEnergyAmount", lhsTaxEnergyAmount), LocatorUtils.property(thatLocator, "taxEnergyAmount", rhsTaxEnergyAmount), lhsTaxEnergyAmount, rhsTaxEnergyAmount, (this.taxEnergyAmount!= null), (that.taxEnergyAmount!= null))) {
                return false;
            }
        }
        {
            TaxEnergyOnAccountAmountType lhsTaxEnergyOnAccountAmount;
            lhsTaxEnergyOnAccountAmount = this.getTaxEnergyOnAccountAmount();
            TaxEnergyOnAccountAmountType rhsTaxEnergyOnAccountAmount;
            rhsTaxEnergyOnAccountAmount = that.getTaxEnergyOnAccountAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxEnergyOnAccountAmount", lhsTaxEnergyOnAccountAmount), LocatorUtils.property(thatLocator, "taxEnergyOnAccountAmount", rhsTaxEnergyOnAccountAmount), lhsTaxEnergyOnAccountAmount, rhsTaxEnergyOnAccountAmount, (this.taxEnergyOnAccountAmount!= null), (that.taxEnergyOnAccountAmount!= null))) {
                return false;
            }
        }
        {
            TaxEnergyBalanceAmountType lhsTaxEnergyBalanceAmount;
            lhsTaxEnergyBalanceAmount = this.getTaxEnergyBalanceAmount();
            TaxEnergyBalanceAmountType rhsTaxEnergyBalanceAmount;
            rhsTaxEnergyBalanceAmount = that.getTaxEnergyBalanceAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxEnergyBalanceAmount", lhsTaxEnergyBalanceAmount), LocatorUtils.property(thatLocator, "taxEnergyBalanceAmount", rhsTaxEnergyBalanceAmount), lhsTaxEnergyBalanceAmount, rhsTaxEnergyBalanceAmount, (this.taxEnergyBalanceAmount!= null), (that.taxEnergyBalanceAmount!= null))) {
                return false;
            }
        }
        {
            TaxSchemeType lhsTaxScheme;
            lhsTaxScheme = this.getTaxScheme();
            TaxSchemeType rhsTaxScheme;
            rhsTaxScheme = that.getTaxScheme();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxScheme", lhsTaxScheme), LocatorUtils.property(thatLocator, "taxScheme", rhsTaxScheme), lhsTaxScheme, rhsTaxScheme, (this.taxScheme!= null), (that.taxScheme!= null))) {
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
            TaxEnergyAmountType theTaxEnergyAmount;
            theTaxEnergyAmount = this.getTaxEnergyAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxEnergyAmount", theTaxEnergyAmount), currentHashCode, theTaxEnergyAmount, (this.taxEnergyAmount!= null));
        }
        {
            TaxEnergyOnAccountAmountType theTaxEnergyOnAccountAmount;
            theTaxEnergyOnAccountAmount = this.getTaxEnergyOnAccountAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxEnergyOnAccountAmount", theTaxEnergyOnAccountAmount), currentHashCode, theTaxEnergyOnAccountAmount, (this.taxEnergyOnAccountAmount!= null));
        }
        {
            TaxEnergyBalanceAmountType theTaxEnergyBalanceAmount;
            theTaxEnergyBalanceAmount = this.getTaxEnergyBalanceAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxEnergyBalanceAmount", theTaxEnergyBalanceAmount), currentHashCode, theTaxEnergyBalanceAmount, (this.taxEnergyBalanceAmount!= null));
        }
        {
            TaxSchemeType theTaxScheme;
            theTaxScheme = this.getTaxScheme();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxScheme", theTaxScheme), currentHashCode, theTaxScheme, (this.taxScheme!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
