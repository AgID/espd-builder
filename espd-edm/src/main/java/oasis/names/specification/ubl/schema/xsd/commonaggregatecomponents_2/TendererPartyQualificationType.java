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
 * <p>Classe Java per TendererPartyQualificationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TendererPartyQualificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}InterestedProcurementProjectLot" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MainQualifyingParty"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalQualifyingParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TendererPartyQualificationType", propOrder = {
    "interestedProcurementProjectLot",
    "mainQualifyingParty",
    "additionalQualifyingParty"
})
public class TendererPartyQualificationType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "InterestedProcurementProjectLot")
    protected List<ProcurementProjectLotType> interestedProcurementProjectLot;
    @XmlElement(name = "MainQualifyingParty", required = true)
    protected QualifyingPartyType mainQualifyingParty;
    @XmlElement(name = "AdditionalQualifyingParty")
    protected List<QualifyingPartyType> additionalQualifyingParty;

    /**
     * Gets the value of the interestedProcurementProjectLot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interestedProcurementProjectLot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterestedProcurementProjectLot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcurementProjectLotType }
     * 
     * 
     */
    public List<ProcurementProjectLotType> getInterestedProcurementProjectLot() {
        if (interestedProcurementProjectLot == null) {
            interestedProcurementProjectLot = new ArrayList<ProcurementProjectLotType>();
        }
        return this.interestedProcurementProjectLot;
    }

    /**
     * Recupera il valore della proprietà mainQualifyingParty.
     * 
     * @return
     *     possible object is
     *     {@link QualifyingPartyType }
     *     
     */
    public QualifyingPartyType getMainQualifyingParty() {
        return mainQualifyingParty;
    }

    /**
     * Imposta il valore della proprietà mainQualifyingParty.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifyingPartyType }
     *     
     */
    public void setMainQualifyingParty(QualifyingPartyType value) {
        this.mainQualifyingParty = value;
    }

    /**
     * Gets the value of the additionalQualifyingParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalQualifyingParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalQualifyingParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifyingPartyType }
     * 
     * 
     */
    public List<QualifyingPartyType> getAdditionalQualifyingParty() {
        if (additionalQualifyingParty == null) {
            additionalQualifyingParty = new ArrayList<QualifyingPartyType>();
        }
        return this.additionalQualifyingParty;
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
            List<ProcurementProjectLotType> theInterestedProcurementProjectLot;
            theInterestedProcurementProjectLot = (((this.interestedProcurementProjectLot!= null)&&(!this.interestedProcurementProjectLot.isEmpty()))?this.getInterestedProcurementProjectLot():null);
            strategy.appendField(locator, this, "interestedProcurementProjectLot", buffer, theInterestedProcurementProjectLot, ((this.interestedProcurementProjectLot!= null)&&(!this.interestedProcurementProjectLot.isEmpty())));
        }
        {
            QualifyingPartyType theMainQualifyingParty;
            theMainQualifyingParty = this.getMainQualifyingParty();
            strategy.appendField(locator, this, "mainQualifyingParty", buffer, theMainQualifyingParty, (this.mainQualifyingParty!= null));
        }
        {
            List<QualifyingPartyType> theAdditionalQualifyingParty;
            theAdditionalQualifyingParty = (((this.additionalQualifyingParty!= null)&&(!this.additionalQualifyingParty.isEmpty()))?this.getAdditionalQualifyingParty():null);
            strategy.appendField(locator, this, "additionalQualifyingParty", buffer, theAdditionalQualifyingParty, ((this.additionalQualifyingParty!= null)&&(!this.additionalQualifyingParty.isEmpty())));
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
        final TendererPartyQualificationType that = ((TendererPartyQualificationType) object);
        {
            List<ProcurementProjectLotType> lhsInterestedProcurementProjectLot;
            lhsInterestedProcurementProjectLot = (((this.interestedProcurementProjectLot!= null)&&(!this.interestedProcurementProjectLot.isEmpty()))?this.getInterestedProcurementProjectLot():null);
            List<ProcurementProjectLotType> rhsInterestedProcurementProjectLot;
            rhsInterestedProcurementProjectLot = (((that.interestedProcurementProjectLot!= null)&&(!that.interestedProcurementProjectLot.isEmpty()))?that.getInterestedProcurementProjectLot():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "interestedProcurementProjectLot", lhsInterestedProcurementProjectLot), LocatorUtils.property(thatLocator, "interestedProcurementProjectLot", rhsInterestedProcurementProjectLot), lhsInterestedProcurementProjectLot, rhsInterestedProcurementProjectLot, ((this.interestedProcurementProjectLot!= null)&&(!this.interestedProcurementProjectLot.isEmpty())), ((that.interestedProcurementProjectLot!= null)&&(!that.interestedProcurementProjectLot.isEmpty())))) {
                return false;
            }
        }
        {
            QualifyingPartyType lhsMainQualifyingParty;
            lhsMainQualifyingParty = this.getMainQualifyingParty();
            QualifyingPartyType rhsMainQualifyingParty;
            rhsMainQualifyingParty = that.getMainQualifyingParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mainQualifyingParty", lhsMainQualifyingParty), LocatorUtils.property(thatLocator, "mainQualifyingParty", rhsMainQualifyingParty), lhsMainQualifyingParty, rhsMainQualifyingParty, (this.mainQualifyingParty!= null), (that.mainQualifyingParty!= null))) {
                return false;
            }
        }
        {
            List<QualifyingPartyType> lhsAdditionalQualifyingParty;
            lhsAdditionalQualifyingParty = (((this.additionalQualifyingParty!= null)&&(!this.additionalQualifyingParty.isEmpty()))?this.getAdditionalQualifyingParty():null);
            List<QualifyingPartyType> rhsAdditionalQualifyingParty;
            rhsAdditionalQualifyingParty = (((that.additionalQualifyingParty!= null)&&(!that.additionalQualifyingParty.isEmpty()))?that.getAdditionalQualifyingParty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "additionalQualifyingParty", lhsAdditionalQualifyingParty), LocatorUtils.property(thatLocator, "additionalQualifyingParty", rhsAdditionalQualifyingParty), lhsAdditionalQualifyingParty, rhsAdditionalQualifyingParty, ((this.additionalQualifyingParty!= null)&&(!this.additionalQualifyingParty.isEmpty())), ((that.additionalQualifyingParty!= null)&&(!that.additionalQualifyingParty.isEmpty())))) {
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
            List<ProcurementProjectLotType> theInterestedProcurementProjectLot;
            theInterestedProcurementProjectLot = (((this.interestedProcurementProjectLot!= null)&&(!this.interestedProcurementProjectLot.isEmpty()))?this.getInterestedProcurementProjectLot():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "interestedProcurementProjectLot", theInterestedProcurementProjectLot), currentHashCode, theInterestedProcurementProjectLot, ((this.interestedProcurementProjectLot!= null)&&(!this.interestedProcurementProjectLot.isEmpty())));
        }
        {
            QualifyingPartyType theMainQualifyingParty;
            theMainQualifyingParty = this.getMainQualifyingParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mainQualifyingParty", theMainQualifyingParty), currentHashCode, theMainQualifyingParty, (this.mainQualifyingParty!= null));
        }
        {
            List<QualifyingPartyType> theAdditionalQualifyingParty;
            theAdditionalQualifyingParty = (((this.additionalQualifyingParty!= null)&&(!this.additionalQualifyingParty.isEmpty()))?this.getAdditionalQualifyingParty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "additionalQualifyingParty", theAdditionalQualifyingParty), currentHashCode, theAdditionalQualifyingParty, ((this.additionalQualifyingParty!= null)&&(!this.additionalQualifyingParty.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
