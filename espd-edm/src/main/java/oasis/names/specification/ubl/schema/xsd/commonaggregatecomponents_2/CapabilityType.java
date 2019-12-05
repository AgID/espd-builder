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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CapabilityTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValueAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValueQuantityType;
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
 * <p>Classe Java per CapabilityType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CapabilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CapabilityTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValueQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EvidenceSupplied" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ValidityPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}WebSite" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilityType", propOrder = {
    "capabilityTypeCode",
    "description",
    "valueAmount",
    "valueQuantity",
    "evidenceSupplied",
    "validityPeriod",
    "webSite"
})
public class CapabilityType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "CapabilityTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CapabilityTypeCodeType capabilityTypeCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "ValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValueAmountType valueAmount;
    @XmlElement(name = "ValueQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValueQuantityType valueQuantity;
    @XmlElement(name = "EvidenceSupplied")
    protected List<EvidenceSuppliedType> evidenceSupplied;
    @XmlElement(name = "ValidityPeriod")
    protected PeriodType validityPeriod;
    @XmlElement(name = "WebSite")
    protected WebSiteType webSite;

    /**
     * Recupera il valore della proprietà capabilityTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link CapabilityTypeCodeType }
     *     
     */
    public CapabilityTypeCodeType getCapabilityTypeCode() {
        return capabilityTypeCode;
    }

    /**
     * Imposta il valore della proprietà capabilityTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityTypeCodeType }
     *     
     */
    public void setCapabilityTypeCode(CapabilityTypeCodeType value) {
        this.capabilityTypeCode = value;
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
     * Recupera il valore della proprietà valueAmount.
     * 
     * @return
     *     possible object is
     *     {@link ValueAmountType }
     *     
     */
    public ValueAmountType getValueAmount() {
        return valueAmount;
    }

    /**
     * Imposta il valore della proprietà valueAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueAmountType }
     *     
     */
    public void setValueAmount(ValueAmountType value) {
        this.valueAmount = value;
    }

    /**
     * Recupera il valore della proprietà valueQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ValueQuantityType }
     *     
     */
    public ValueQuantityType getValueQuantity() {
        return valueQuantity;
    }

    /**
     * Imposta il valore della proprietà valueQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueQuantityType }
     *     
     */
    public void setValueQuantity(ValueQuantityType value) {
        this.valueQuantity = value;
    }

    /**
     * Gets the value of the evidenceSupplied property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evidenceSupplied property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvidenceSupplied().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EvidenceSuppliedType }
     * 
     * 
     */
    public List<EvidenceSuppliedType> getEvidenceSupplied() {
        if (evidenceSupplied == null) {
            evidenceSupplied = new ArrayList<EvidenceSuppliedType>();
        }
        return this.evidenceSupplied;
    }

    /**
     * Recupera il valore della proprietà validityPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Imposta il valore della proprietà validityPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setValidityPeriod(PeriodType value) {
        this.validityPeriod = value;
    }

    /**
     * Recupera il valore della proprietà webSite.
     * 
     * @return
     *     possible object is
     *     {@link WebSiteType }
     *     
     */
    public WebSiteType getWebSite() {
        return webSite;
    }

    /**
     * Imposta il valore della proprietà webSite.
     * 
     * @param value
     *     allowed object is
     *     {@link WebSiteType }
     *     
     */
    public void setWebSite(WebSiteType value) {
        this.webSite = value;
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
            CapabilityTypeCodeType theCapabilityTypeCode;
            theCapabilityTypeCode = this.getCapabilityTypeCode();
            strategy.appendField(locator, this, "capabilityTypeCode", buffer, theCapabilityTypeCode, (this.capabilityTypeCode!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            ValueAmountType theValueAmount;
            theValueAmount = this.getValueAmount();
            strategy.appendField(locator, this, "valueAmount", buffer, theValueAmount, (this.valueAmount!= null));
        }
        {
            ValueQuantityType theValueQuantity;
            theValueQuantity = this.getValueQuantity();
            strategy.appendField(locator, this, "valueQuantity", buffer, theValueQuantity, (this.valueQuantity!= null));
        }
        {
            List<EvidenceSuppliedType> theEvidenceSupplied;
            theEvidenceSupplied = (((this.evidenceSupplied!= null)&&(!this.evidenceSupplied.isEmpty()))?this.getEvidenceSupplied():null);
            strategy.appendField(locator, this, "evidenceSupplied", buffer, theEvidenceSupplied, ((this.evidenceSupplied!= null)&&(!this.evidenceSupplied.isEmpty())));
        }
        {
            PeriodType theValidityPeriod;
            theValidityPeriod = this.getValidityPeriod();
            strategy.appendField(locator, this, "validityPeriod", buffer, theValidityPeriod, (this.validityPeriod!= null));
        }
        {
            WebSiteType theWebSite;
            theWebSite = this.getWebSite();
            strategy.appendField(locator, this, "webSite", buffer, theWebSite, (this.webSite!= null));
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
        final CapabilityType that = ((CapabilityType) object);
        {
            CapabilityTypeCodeType lhsCapabilityTypeCode;
            lhsCapabilityTypeCode = this.getCapabilityTypeCode();
            CapabilityTypeCodeType rhsCapabilityTypeCode;
            rhsCapabilityTypeCode = that.getCapabilityTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "capabilityTypeCode", lhsCapabilityTypeCode), LocatorUtils.property(thatLocator, "capabilityTypeCode", rhsCapabilityTypeCode), lhsCapabilityTypeCode, rhsCapabilityTypeCode, (this.capabilityTypeCode!= null), (that.capabilityTypeCode!= null))) {
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
            ValueAmountType lhsValueAmount;
            lhsValueAmount = this.getValueAmount();
            ValueAmountType rhsValueAmount;
            rhsValueAmount = that.getValueAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "valueAmount", lhsValueAmount), LocatorUtils.property(thatLocator, "valueAmount", rhsValueAmount), lhsValueAmount, rhsValueAmount, (this.valueAmount!= null), (that.valueAmount!= null))) {
                return false;
            }
        }
        {
            ValueQuantityType lhsValueQuantity;
            lhsValueQuantity = this.getValueQuantity();
            ValueQuantityType rhsValueQuantity;
            rhsValueQuantity = that.getValueQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "valueQuantity", lhsValueQuantity), LocatorUtils.property(thatLocator, "valueQuantity", rhsValueQuantity), lhsValueQuantity, rhsValueQuantity, (this.valueQuantity!= null), (that.valueQuantity!= null))) {
                return false;
            }
        }
        {
            List<EvidenceSuppliedType> lhsEvidenceSupplied;
            lhsEvidenceSupplied = (((this.evidenceSupplied!= null)&&(!this.evidenceSupplied.isEmpty()))?this.getEvidenceSupplied():null);
            List<EvidenceSuppliedType> rhsEvidenceSupplied;
            rhsEvidenceSupplied = (((that.evidenceSupplied!= null)&&(!that.evidenceSupplied.isEmpty()))?that.getEvidenceSupplied():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "evidenceSupplied", lhsEvidenceSupplied), LocatorUtils.property(thatLocator, "evidenceSupplied", rhsEvidenceSupplied), lhsEvidenceSupplied, rhsEvidenceSupplied, ((this.evidenceSupplied!= null)&&(!this.evidenceSupplied.isEmpty())), ((that.evidenceSupplied!= null)&&(!that.evidenceSupplied.isEmpty())))) {
                return false;
            }
        }
        {
            PeriodType lhsValidityPeriod;
            lhsValidityPeriod = this.getValidityPeriod();
            PeriodType rhsValidityPeriod;
            rhsValidityPeriod = that.getValidityPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validityPeriod", lhsValidityPeriod), LocatorUtils.property(thatLocator, "validityPeriod", rhsValidityPeriod), lhsValidityPeriod, rhsValidityPeriod, (this.validityPeriod!= null), (that.validityPeriod!= null))) {
                return false;
            }
        }
        {
            WebSiteType lhsWebSite;
            lhsWebSite = this.getWebSite();
            WebSiteType rhsWebSite;
            rhsWebSite = that.getWebSite();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "webSite", lhsWebSite), LocatorUtils.property(thatLocator, "webSite", rhsWebSite), lhsWebSite, rhsWebSite, (this.webSite!= null), (that.webSite!= null))) {
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
            CapabilityTypeCodeType theCapabilityTypeCode;
            theCapabilityTypeCode = this.getCapabilityTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "capabilityTypeCode", theCapabilityTypeCode), currentHashCode, theCapabilityTypeCode, (this.capabilityTypeCode!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            ValueAmountType theValueAmount;
            theValueAmount = this.getValueAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "valueAmount", theValueAmount), currentHashCode, theValueAmount, (this.valueAmount!= null));
        }
        {
            ValueQuantityType theValueQuantity;
            theValueQuantity = this.getValueQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "valueQuantity", theValueQuantity), currentHashCode, theValueQuantity, (this.valueQuantity!= null));
        }
        {
            List<EvidenceSuppliedType> theEvidenceSupplied;
            theEvidenceSupplied = (((this.evidenceSupplied!= null)&&(!this.evidenceSupplied.isEmpty()))?this.getEvidenceSupplied():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "evidenceSupplied", theEvidenceSupplied), currentHashCode, theEvidenceSupplied, ((this.evidenceSupplied!= null)&&(!this.evidenceSupplied.isEmpty())));
        }
        {
            PeriodType theValidityPeriod;
            theValidityPeriod = this.getValidityPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validityPeriod", theValidityPeriod), currentHashCode, theValidityPeriod, (this.validityPeriod!= null));
        }
        {
            WebSiteType theWebSite;
            theWebSite = this.getWebSite();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "webSite", theWebSite), currentHashCode, theWebSite, (this.webSite!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
