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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PreviousCancellationReasonCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ProcessReasonCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ProcessReasonType;
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
 * <p>Classe Java per ProcessJustificationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ProcessJustificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PreviousCancellationReasonCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProcessReasonCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProcessReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessJustificationType", propOrder = {
    "previousCancellationReasonCode",
    "processReasonCode",
    "processReason",
    "description"
})
public class ProcessJustificationType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "PreviousCancellationReasonCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PreviousCancellationReasonCodeType previousCancellationReasonCode;
    @XmlElement(name = "ProcessReasonCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ProcessReasonCodeType processReasonCode;
    @XmlElement(name = "ProcessReason", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ProcessReasonType> processReason;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;

    /**
     * Recupera il valore della proprietà previousCancellationReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link PreviousCancellationReasonCodeType }
     *     
     */
    public PreviousCancellationReasonCodeType getPreviousCancellationReasonCode() {
        return previousCancellationReasonCode;
    }

    /**
     * Imposta il valore della proprietà previousCancellationReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousCancellationReasonCodeType }
     *     
     */
    public void setPreviousCancellationReasonCode(PreviousCancellationReasonCodeType value) {
        this.previousCancellationReasonCode = value;
    }

    /**
     * Recupera il valore della proprietà processReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link ProcessReasonCodeType }
     *     
     */
    public ProcessReasonCodeType getProcessReasonCode() {
        return processReasonCode;
    }

    /**
     * Imposta il valore della proprietà processReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessReasonCodeType }
     *     
     */
    public void setProcessReasonCode(ProcessReasonCodeType value) {
        this.processReasonCode = value;
    }

    /**
     * Gets the value of the processReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessReasonType }
     * 
     * 
     */
    public List<ProcessReasonType> getProcessReason() {
        if (processReason == null) {
            processReason = new ArrayList<ProcessReasonType>();
        }
        return this.processReason;
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
            PreviousCancellationReasonCodeType thePreviousCancellationReasonCode;
            thePreviousCancellationReasonCode = this.getPreviousCancellationReasonCode();
            strategy.appendField(locator, this, "previousCancellationReasonCode", buffer, thePreviousCancellationReasonCode, (this.previousCancellationReasonCode!= null));
        }
        {
            ProcessReasonCodeType theProcessReasonCode;
            theProcessReasonCode = this.getProcessReasonCode();
            strategy.appendField(locator, this, "processReasonCode", buffer, theProcessReasonCode, (this.processReasonCode!= null));
        }
        {
            List<ProcessReasonType> theProcessReason;
            theProcessReason = (((this.processReason!= null)&&(!this.processReason.isEmpty()))?this.getProcessReason():null);
            strategy.appendField(locator, this, "processReason", buffer, theProcessReason, ((this.processReason!= null)&&(!this.processReason.isEmpty())));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
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
        final ProcessJustificationType that = ((ProcessJustificationType) object);
        {
            PreviousCancellationReasonCodeType lhsPreviousCancellationReasonCode;
            lhsPreviousCancellationReasonCode = this.getPreviousCancellationReasonCode();
            PreviousCancellationReasonCodeType rhsPreviousCancellationReasonCode;
            rhsPreviousCancellationReasonCode = that.getPreviousCancellationReasonCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "previousCancellationReasonCode", lhsPreviousCancellationReasonCode), LocatorUtils.property(thatLocator, "previousCancellationReasonCode", rhsPreviousCancellationReasonCode), lhsPreviousCancellationReasonCode, rhsPreviousCancellationReasonCode, (this.previousCancellationReasonCode!= null), (that.previousCancellationReasonCode!= null))) {
                return false;
            }
        }
        {
            ProcessReasonCodeType lhsProcessReasonCode;
            lhsProcessReasonCode = this.getProcessReasonCode();
            ProcessReasonCodeType rhsProcessReasonCode;
            rhsProcessReasonCode = that.getProcessReasonCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processReasonCode", lhsProcessReasonCode), LocatorUtils.property(thatLocator, "processReasonCode", rhsProcessReasonCode), lhsProcessReasonCode, rhsProcessReasonCode, (this.processReasonCode!= null), (that.processReasonCode!= null))) {
                return false;
            }
        }
        {
            List<ProcessReasonType> lhsProcessReason;
            lhsProcessReason = (((this.processReason!= null)&&(!this.processReason.isEmpty()))?this.getProcessReason():null);
            List<ProcessReasonType> rhsProcessReason;
            rhsProcessReason = (((that.processReason!= null)&&(!that.processReason.isEmpty()))?that.getProcessReason():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processReason", lhsProcessReason), LocatorUtils.property(thatLocator, "processReason", rhsProcessReason), lhsProcessReason, rhsProcessReason, ((this.processReason!= null)&&(!this.processReason.isEmpty())), ((that.processReason!= null)&&(!that.processReason.isEmpty())))) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            PreviousCancellationReasonCodeType thePreviousCancellationReasonCode;
            thePreviousCancellationReasonCode = this.getPreviousCancellationReasonCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "previousCancellationReasonCode", thePreviousCancellationReasonCode), currentHashCode, thePreviousCancellationReasonCode, (this.previousCancellationReasonCode!= null));
        }
        {
            ProcessReasonCodeType theProcessReasonCode;
            theProcessReasonCode = this.getProcessReasonCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processReasonCode", theProcessReasonCode), currentHashCode, theProcessReasonCode, (this.processReasonCode!= null));
        }
        {
            List<ProcessReasonType> theProcessReason;
            theProcessReason = (((this.processReason!= null)&&(!this.processReason.isEmpty()))?this.getProcessReason():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processReason", theProcessReason), currentHashCode, theProcessReason, ((this.processReason!= null)&&(!this.processReason.isEmpty())));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
