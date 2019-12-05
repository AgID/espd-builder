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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ElectronicCatalogueUsageIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ElectronicInvoiceAcceptedIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ElectronicOrderUsageIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ElectronicPaymentUsageIndicatorType;
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
 * <p>Classe Java per PostAwardProcessType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PostAwardProcessType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ElectronicCatalogueUsageIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ElectronicInvoiceAcceptedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ElectronicOrderUsageIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ElectronicPaymentUsageIndicator" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostAwardProcessType", propOrder = {
    "electronicCatalogueUsageIndicator",
    "electronicInvoiceAcceptedIndicator",
    "electronicOrderUsageIndicator",
    "electronicPaymentUsageIndicator"
})
public class PostAwardProcessType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ElectronicCatalogueUsageIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ElectronicCatalogueUsageIndicatorType electronicCatalogueUsageIndicator;
    @XmlElement(name = "ElectronicInvoiceAcceptedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ElectronicInvoiceAcceptedIndicatorType electronicInvoiceAcceptedIndicator;
    @XmlElement(name = "ElectronicOrderUsageIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ElectronicOrderUsageIndicatorType electronicOrderUsageIndicator;
    @XmlElement(name = "ElectronicPaymentUsageIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ElectronicPaymentUsageIndicatorType> electronicPaymentUsageIndicator;

    /**
     * Recupera il valore della proprietà electronicCatalogueUsageIndicator.
     * 
     * @return
     *     possible object is
     *     {@link ElectronicCatalogueUsageIndicatorType }
     *     
     */
    public ElectronicCatalogueUsageIndicatorType getElectronicCatalogueUsageIndicator() {
        return electronicCatalogueUsageIndicator;
    }

    /**
     * Imposta il valore della proprietà electronicCatalogueUsageIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicCatalogueUsageIndicatorType }
     *     
     */
    public void setElectronicCatalogueUsageIndicator(ElectronicCatalogueUsageIndicatorType value) {
        this.electronicCatalogueUsageIndicator = value;
    }

    /**
     * Recupera il valore della proprietà electronicInvoiceAcceptedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link ElectronicInvoiceAcceptedIndicatorType }
     *     
     */
    public ElectronicInvoiceAcceptedIndicatorType getElectronicInvoiceAcceptedIndicator() {
        return electronicInvoiceAcceptedIndicator;
    }

    /**
     * Imposta il valore della proprietà electronicInvoiceAcceptedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicInvoiceAcceptedIndicatorType }
     *     
     */
    public void setElectronicInvoiceAcceptedIndicator(ElectronicInvoiceAcceptedIndicatorType value) {
        this.electronicInvoiceAcceptedIndicator = value;
    }

    /**
     * Recupera il valore della proprietà electronicOrderUsageIndicator.
     * 
     * @return
     *     possible object is
     *     {@link ElectronicOrderUsageIndicatorType }
     *     
     */
    public ElectronicOrderUsageIndicatorType getElectronicOrderUsageIndicator() {
        return electronicOrderUsageIndicator;
    }

    /**
     * Imposta il valore della proprietà electronicOrderUsageIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicOrderUsageIndicatorType }
     *     
     */
    public void setElectronicOrderUsageIndicator(ElectronicOrderUsageIndicatorType value) {
        this.electronicOrderUsageIndicator = value;
    }

    /**
     * Gets the value of the electronicPaymentUsageIndicator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electronicPaymentUsageIndicator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectronicPaymentUsageIndicator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectronicPaymentUsageIndicatorType }
     * 
     * 
     */
    public List<ElectronicPaymentUsageIndicatorType> getElectronicPaymentUsageIndicator() {
        if (electronicPaymentUsageIndicator == null) {
            electronicPaymentUsageIndicator = new ArrayList<ElectronicPaymentUsageIndicatorType>();
        }
        return this.electronicPaymentUsageIndicator;
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
            ElectronicCatalogueUsageIndicatorType theElectronicCatalogueUsageIndicator;
            theElectronicCatalogueUsageIndicator = this.getElectronicCatalogueUsageIndicator();
            strategy.appendField(locator, this, "electronicCatalogueUsageIndicator", buffer, theElectronicCatalogueUsageIndicator, (this.electronicCatalogueUsageIndicator!= null));
        }
        {
            ElectronicInvoiceAcceptedIndicatorType theElectronicInvoiceAcceptedIndicator;
            theElectronicInvoiceAcceptedIndicator = this.getElectronicInvoiceAcceptedIndicator();
            strategy.appendField(locator, this, "electronicInvoiceAcceptedIndicator", buffer, theElectronicInvoiceAcceptedIndicator, (this.electronicInvoiceAcceptedIndicator!= null));
        }
        {
            ElectronicOrderUsageIndicatorType theElectronicOrderUsageIndicator;
            theElectronicOrderUsageIndicator = this.getElectronicOrderUsageIndicator();
            strategy.appendField(locator, this, "electronicOrderUsageIndicator", buffer, theElectronicOrderUsageIndicator, (this.electronicOrderUsageIndicator!= null));
        }
        {
            List<ElectronicPaymentUsageIndicatorType> theElectronicPaymentUsageIndicator;
            theElectronicPaymentUsageIndicator = (((this.electronicPaymentUsageIndicator!= null)&&(!this.electronicPaymentUsageIndicator.isEmpty()))?this.getElectronicPaymentUsageIndicator():null);
            strategy.appendField(locator, this, "electronicPaymentUsageIndicator", buffer, theElectronicPaymentUsageIndicator, ((this.electronicPaymentUsageIndicator!= null)&&(!this.electronicPaymentUsageIndicator.isEmpty())));
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
        final PostAwardProcessType that = ((PostAwardProcessType) object);
        {
            ElectronicCatalogueUsageIndicatorType lhsElectronicCatalogueUsageIndicator;
            lhsElectronicCatalogueUsageIndicator = this.getElectronicCatalogueUsageIndicator();
            ElectronicCatalogueUsageIndicatorType rhsElectronicCatalogueUsageIndicator;
            rhsElectronicCatalogueUsageIndicator = that.getElectronicCatalogueUsageIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "electronicCatalogueUsageIndicator", lhsElectronicCatalogueUsageIndicator), LocatorUtils.property(thatLocator, "electronicCatalogueUsageIndicator", rhsElectronicCatalogueUsageIndicator), lhsElectronicCatalogueUsageIndicator, rhsElectronicCatalogueUsageIndicator, (this.electronicCatalogueUsageIndicator!= null), (that.electronicCatalogueUsageIndicator!= null))) {
                return false;
            }
        }
        {
            ElectronicInvoiceAcceptedIndicatorType lhsElectronicInvoiceAcceptedIndicator;
            lhsElectronicInvoiceAcceptedIndicator = this.getElectronicInvoiceAcceptedIndicator();
            ElectronicInvoiceAcceptedIndicatorType rhsElectronicInvoiceAcceptedIndicator;
            rhsElectronicInvoiceAcceptedIndicator = that.getElectronicInvoiceAcceptedIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "electronicInvoiceAcceptedIndicator", lhsElectronicInvoiceAcceptedIndicator), LocatorUtils.property(thatLocator, "electronicInvoiceAcceptedIndicator", rhsElectronicInvoiceAcceptedIndicator), lhsElectronicInvoiceAcceptedIndicator, rhsElectronicInvoiceAcceptedIndicator, (this.electronicInvoiceAcceptedIndicator!= null), (that.electronicInvoiceAcceptedIndicator!= null))) {
                return false;
            }
        }
        {
            ElectronicOrderUsageIndicatorType lhsElectronicOrderUsageIndicator;
            lhsElectronicOrderUsageIndicator = this.getElectronicOrderUsageIndicator();
            ElectronicOrderUsageIndicatorType rhsElectronicOrderUsageIndicator;
            rhsElectronicOrderUsageIndicator = that.getElectronicOrderUsageIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "electronicOrderUsageIndicator", lhsElectronicOrderUsageIndicator), LocatorUtils.property(thatLocator, "electronicOrderUsageIndicator", rhsElectronicOrderUsageIndicator), lhsElectronicOrderUsageIndicator, rhsElectronicOrderUsageIndicator, (this.electronicOrderUsageIndicator!= null), (that.electronicOrderUsageIndicator!= null))) {
                return false;
            }
        }
        {
            List<ElectronicPaymentUsageIndicatorType> lhsElectronicPaymentUsageIndicator;
            lhsElectronicPaymentUsageIndicator = (((this.electronicPaymentUsageIndicator!= null)&&(!this.electronicPaymentUsageIndicator.isEmpty()))?this.getElectronicPaymentUsageIndicator():null);
            List<ElectronicPaymentUsageIndicatorType> rhsElectronicPaymentUsageIndicator;
            rhsElectronicPaymentUsageIndicator = (((that.electronicPaymentUsageIndicator!= null)&&(!that.electronicPaymentUsageIndicator.isEmpty()))?that.getElectronicPaymentUsageIndicator():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "electronicPaymentUsageIndicator", lhsElectronicPaymentUsageIndicator), LocatorUtils.property(thatLocator, "electronicPaymentUsageIndicator", rhsElectronicPaymentUsageIndicator), lhsElectronicPaymentUsageIndicator, rhsElectronicPaymentUsageIndicator, ((this.electronicPaymentUsageIndicator!= null)&&(!this.electronicPaymentUsageIndicator.isEmpty())), ((that.electronicPaymentUsageIndicator!= null)&&(!that.electronicPaymentUsageIndicator.isEmpty())))) {
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
            ElectronicCatalogueUsageIndicatorType theElectronicCatalogueUsageIndicator;
            theElectronicCatalogueUsageIndicator = this.getElectronicCatalogueUsageIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "electronicCatalogueUsageIndicator", theElectronicCatalogueUsageIndicator), currentHashCode, theElectronicCatalogueUsageIndicator, (this.electronicCatalogueUsageIndicator!= null));
        }
        {
            ElectronicInvoiceAcceptedIndicatorType theElectronicInvoiceAcceptedIndicator;
            theElectronicInvoiceAcceptedIndicator = this.getElectronicInvoiceAcceptedIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "electronicInvoiceAcceptedIndicator", theElectronicInvoiceAcceptedIndicator), currentHashCode, theElectronicInvoiceAcceptedIndicator, (this.electronicInvoiceAcceptedIndicator!= null));
        }
        {
            ElectronicOrderUsageIndicatorType theElectronicOrderUsageIndicator;
            theElectronicOrderUsageIndicator = this.getElectronicOrderUsageIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "electronicOrderUsageIndicator", theElectronicOrderUsageIndicator), currentHashCode, theElectronicOrderUsageIndicator, (this.electronicOrderUsageIndicator!= null));
        }
        {
            List<ElectronicPaymentUsageIndicatorType> theElectronicPaymentUsageIndicator;
            theElectronicPaymentUsageIndicator = (((this.electronicPaymentUsageIndicator!= null)&&(!this.electronicPaymentUsageIndicator.isEmpty()))?this.getElectronicPaymentUsageIndicator():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "electronicPaymentUsageIndicator", theElectronicPaymentUsageIndicator), currentHashCode, theElectronicPaymentUsageIndicator, ((this.electronicPaymentUsageIndicator!= null)&&(!this.electronicPaymentUsageIndicator.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
