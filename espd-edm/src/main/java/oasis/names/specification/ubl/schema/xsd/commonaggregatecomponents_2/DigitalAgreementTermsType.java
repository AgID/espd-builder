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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
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
 * <p>Classe Java per DigitalAgreementTermsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DigitalAgreementTermsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ValidityPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdoptionPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ServiceLevelAgreement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DigitalAgreementTermsType", propOrder = {
    "description",
    "validityPeriod",
    "adoptionPeriod",
    "serviceLevelAgreement"
})
public class DigitalAgreementTermsType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected List<DescriptionType> description;
    @XmlElement(name = "ValidityPeriod")
    protected PeriodType validityPeriod;
    @XmlElement(name = "AdoptionPeriod")
    protected PeriodType adoptionPeriod;
    @XmlElement(name = "ServiceLevelAgreement")
    protected List<ServiceLevelAgreementType> serviceLevelAgreement;

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
     * Recupera il valore della proprietà adoptionPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getAdoptionPeriod() {
        return adoptionPeriod;
    }

    /**
     * Imposta il valore della proprietà adoptionPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setAdoptionPeriod(PeriodType value) {
        this.adoptionPeriod = value;
    }

    /**
     * Gets the value of the serviceLevelAgreement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceLevelAgreement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceLevelAgreement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceLevelAgreementType }
     * 
     * 
     */
    public List<ServiceLevelAgreementType> getServiceLevelAgreement() {
        if (serviceLevelAgreement == null) {
            serviceLevelAgreement = new ArrayList<ServiceLevelAgreementType>();
        }
        return this.serviceLevelAgreement;
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
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            PeriodType theValidityPeriod;
            theValidityPeriod = this.getValidityPeriod();
            strategy.appendField(locator, this, "validityPeriod", buffer, theValidityPeriod, (this.validityPeriod!= null));
        }
        {
            PeriodType theAdoptionPeriod;
            theAdoptionPeriod = this.getAdoptionPeriod();
            strategy.appendField(locator, this, "adoptionPeriod", buffer, theAdoptionPeriod, (this.adoptionPeriod!= null));
        }
        {
            List<ServiceLevelAgreementType> theServiceLevelAgreement;
            theServiceLevelAgreement = (((this.serviceLevelAgreement!= null)&&(!this.serviceLevelAgreement.isEmpty()))?this.getServiceLevelAgreement():null);
            strategy.appendField(locator, this, "serviceLevelAgreement", buffer, theServiceLevelAgreement, ((this.serviceLevelAgreement!= null)&&(!this.serviceLevelAgreement.isEmpty())));
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
        final DigitalAgreementTermsType that = ((DigitalAgreementTermsType) object);
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
            PeriodType lhsValidityPeriod;
            lhsValidityPeriod = this.getValidityPeriod();
            PeriodType rhsValidityPeriod;
            rhsValidityPeriod = that.getValidityPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validityPeriod", lhsValidityPeriod), LocatorUtils.property(thatLocator, "validityPeriod", rhsValidityPeriod), lhsValidityPeriod, rhsValidityPeriod, (this.validityPeriod!= null), (that.validityPeriod!= null))) {
                return false;
            }
        }
        {
            PeriodType lhsAdoptionPeriod;
            lhsAdoptionPeriod = this.getAdoptionPeriod();
            PeriodType rhsAdoptionPeriod;
            rhsAdoptionPeriod = that.getAdoptionPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adoptionPeriod", lhsAdoptionPeriod), LocatorUtils.property(thatLocator, "adoptionPeriod", rhsAdoptionPeriod), lhsAdoptionPeriod, rhsAdoptionPeriod, (this.adoptionPeriod!= null), (that.adoptionPeriod!= null))) {
                return false;
            }
        }
        {
            List<ServiceLevelAgreementType> lhsServiceLevelAgreement;
            lhsServiceLevelAgreement = (((this.serviceLevelAgreement!= null)&&(!this.serviceLevelAgreement.isEmpty()))?this.getServiceLevelAgreement():null);
            List<ServiceLevelAgreementType> rhsServiceLevelAgreement;
            rhsServiceLevelAgreement = (((that.serviceLevelAgreement!= null)&&(!that.serviceLevelAgreement.isEmpty()))?that.getServiceLevelAgreement():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceLevelAgreement", lhsServiceLevelAgreement), LocatorUtils.property(thatLocator, "serviceLevelAgreement", rhsServiceLevelAgreement), lhsServiceLevelAgreement, rhsServiceLevelAgreement, ((this.serviceLevelAgreement!= null)&&(!this.serviceLevelAgreement.isEmpty())), ((that.serviceLevelAgreement!= null)&&(!that.serviceLevelAgreement.isEmpty())))) {
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
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            PeriodType theValidityPeriod;
            theValidityPeriod = this.getValidityPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validityPeriod", theValidityPeriod), currentHashCode, theValidityPeriod, (this.validityPeriod!= null));
        }
        {
            PeriodType theAdoptionPeriod;
            theAdoptionPeriod = this.getAdoptionPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "adoptionPeriod", theAdoptionPeriod), currentHashCode, theAdoptionPeriod, (this.adoptionPeriod!= null));
        }
        {
            List<ServiceLevelAgreementType> theServiceLevelAgreement;
            theServiceLevelAgreement = (((this.serviceLevelAgreement!= null)&&(!this.serviceLevelAgreement.isEmpty()))?this.getServiceLevelAgreement():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceLevelAgreement", theServiceLevelAgreement), currentHashCode, theServiceLevelAgreement, ((this.serviceLevelAgreement!= null)&&(!this.serviceLevelAgreement.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
