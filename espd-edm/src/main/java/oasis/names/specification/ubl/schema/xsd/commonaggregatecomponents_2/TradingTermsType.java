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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.InformationType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ReferenceType;
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
 * <p>Classe Java per TradingTermsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TradingTermsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Information" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Reference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ApplicableAddress" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradingTermsType", propOrder = {
    "information",
    "reference",
    "applicableAddress"
})
public class TradingTermsType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "Information", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<InformationType> information;
    @XmlElement(name = "Reference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ReferenceType reference;
    @XmlElement(name = "ApplicableAddress")
    protected AddressType applicableAddress;

    /**
     * Gets the value of the information property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the information property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InformationType }
     * 
     * 
     */
    public List<InformationType> getInformation() {
        if (information == null) {
            information = new ArrayList<InformationType>();
        }
        return this.information;
    }

    /**
     * Recupera il valore della proprietà reference.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getReference() {
        return reference;
    }

    /**
     * Imposta il valore della proprietà reference.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setReference(ReferenceType value) {
        this.reference = value;
    }

    /**
     * Recupera il valore della proprietà applicableAddress.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getApplicableAddress() {
        return applicableAddress;
    }

    /**
     * Imposta il valore della proprietà applicableAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setApplicableAddress(AddressType value) {
        this.applicableAddress = value;
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
            List<InformationType> theInformation;
            theInformation = (((this.information!= null)&&(!this.information.isEmpty()))?this.getInformation():null);
            strategy.appendField(locator, this, "information", buffer, theInformation, ((this.information!= null)&&(!this.information.isEmpty())));
        }
        {
            ReferenceType theReference;
            theReference = this.getReference();
            strategy.appendField(locator, this, "reference", buffer, theReference, (this.reference!= null));
        }
        {
            AddressType theApplicableAddress;
            theApplicableAddress = this.getApplicableAddress();
            strategy.appendField(locator, this, "applicableAddress", buffer, theApplicableAddress, (this.applicableAddress!= null));
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
        final TradingTermsType that = ((TradingTermsType) object);
        {
            List<InformationType> lhsInformation;
            lhsInformation = (((this.information!= null)&&(!this.information.isEmpty()))?this.getInformation():null);
            List<InformationType> rhsInformation;
            rhsInformation = (((that.information!= null)&&(!that.information.isEmpty()))?that.getInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "information", lhsInformation), LocatorUtils.property(thatLocator, "information", rhsInformation), lhsInformation, rhsInformation, ((this.information!= null)&&(!this.information.isEmpty())), ((that.information!= null)&&(!that.information.isEmpty())))) {
                return false;
            }
        }
        {
            ReferenceType lhsReference;
            lhsReference = this.getReference();
            ReferenceType rhsReference;
            rhsReference = that.getReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reference", lhsReference), LocatorUtils.property(thatLocator, "reference", rhsReference), lhsReference, rhsReference, (this.reference!= null), (that.reference!= null))) {
                return false;
            }
        }
        {
            AddressType lhsApplicableAddress;
            lhsApplicableAddress = this.getApplicableAddress();
            AddressType rhsApplicableAddress;
            rhsApplicableAddress = that.getApplicableAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "applicableAddress", lhsApplicableAddress), LocatorUtils.property(thatLocator, "applicableAddress", rhsApplicableAddress), lhsApplicableAddress, rhsApplicableAddress, (this.applicableAddress!= null), (that.applicableAddress!= null))) {
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
            List<InformationType> theInformation;
            theInformation = (((this.information!= null)&&(!this.information.isEmpty()))?this.getInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "information", theInformation), currentHashCode, theInformation, ((this.information!= null)&&(!this.information.isEmpty())));
        }
        {
            ReferenceType theReference;
            theReference = this.getReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reference", theReference), currentHashCode, theReference, (this.reference!= null));
        }
        {
            AddressType theApplicableAddress;
            theApplicableAddress = this.getApplicableAddress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "applicableAddress", theApplicableAddress), currentHashCode, theApplicableAddress, (this.applicableAddress!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
