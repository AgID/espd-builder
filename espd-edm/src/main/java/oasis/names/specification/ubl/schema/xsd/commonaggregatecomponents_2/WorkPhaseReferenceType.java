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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EndDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ProgressPercentType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.StartDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.WorkPhaseCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.WorkPhaseType;
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
 * <p>Classe Java per WorkPhaseReferenceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="WorkPhaseReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WorkPhaseCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WorkPhase" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProgressPercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}StartDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EndDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}WorkOrderDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkPhaseReferenceType", propOrder = {
    "id",
    "workPhaseCode",
    "workPhase",
    "progressPercent",
    "startDate",
    "endDate",
    "workOrderDocumentReference"
})
public class WorkPhaseReferenceType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "WorkPhaseCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected WorkPhaseCodeType workPhaseCode;
    @XmlElement(name = "WorkPhase", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<WorkPhaseType> workPhase;
    @XmlElement(name = "ProgressPercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ProgressPercentType progressPercent;
    @XmlElement(name = "StartDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected StartDateType startDate;
    @XmlElement(name = "EndDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EndDateType endDate;
    @XmlElement(name = "WorkOrderDocumentReference")
    protected List<DocumentReferenceType> workOrderDocumentReference;

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getID() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setID(IDType value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà workPhaseCode.
     * 
     * @return
     *     possible object is
     *     {@link WorkPhaseCodeType }
     *     
     */
    public WorkPhaseCodeType getWorkPhaseCode() {
        return workPhaseCode;
    }

    /**
     * Imposta il valore della proprietà workPhaseCode.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkPhaseCodeType }
     *     
     */
    public void setWorkPhaseCode(WorkPhaseCodeType value) {
        this.workPhaseCode = value;
    }

    /**
     * Gets the value of the workPhase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workPhase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkPhase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkPhaseType }
     * 
     * 
     */
    public List<WorkPhaseType> getWorkPhase() {
        if (workPhase == null) {
            workPhase = new ArrayList<WorkPhaseType>();
        }
        return this.workPhase;
    }

    /**
     * Recupera il valore della proprietà progressPercent.
     * 
     * @return
     *     possible object is
     *     {@link ProgressPercentType }
     *     
     */
    public ProgressPercentType getProgressPercent() {
        return progressPercent;
    }

    /**
     * Imposta il valore della proprietà progressPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgressPercentType }
     *     
     */
    public void setProgressPercent(ProgressPercentType value) {
        this.progressPercent = value;
    }

    /**
     * Recupera il valore della proprietà startDate.
     * 
     * @return
     *     possible object is
     *     {@link StartDateType }
     *     
     */
    public StartDateType getStartDate() {
        return startDate;
    }

    /**
     * Imposta il valore della proprietà startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link StartDateType }
     *     
     */
    public void setStartDate(StartDateType value) {
        this.startDate = value;
    }

    /**
     * Recupera il valore della proprietà endDate.
     * 
     * @return
     *     possible object is
     *     {@link EndDateType }
     *     
     */
    public EndDateType getEndDate() {
        return endDate;
    }

    /**
     * Imposta il valore della proprietà endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link EndDateType }
     *     
     */
    public void setEndDate(EndDateType value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the workOrderDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workOrderDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkOrderDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getWorkOrderDocumentReference() {
        if (workOrderDocumentReference == null) {
            workOrderDocumentReference = new ArrayList<DocumentReferenceType>();
        }
        return this.workOrderDocumentReference;
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
            IDType theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID, (this.id!= null));
        }
        {
            WorkPhaseCodeType theWorkPhaseCode;
            theWorkPhaseCode = this.getWorkPhaseCode();
            strategy.appendField(locator, this, "workPhaseCode", buffer, theWorkPhaseCode, (this.workPhaseCode!= null));
        }
        {
            List<WorkPhaseType> theWorkPhase;
            theWorkPhase = (((this.workPhase!= null)&&(!this.workPhase.isEmpty()))?this.getWorkPhase():null);
            strategy.appendField(locator, this, "workPhase", buffer, theWorkPhase, ((this.workPhase!= null)&&(!this.workPhase.isEmpty())));
        }
        {
            ProgressPercentType theProgressPercent;
            theProgressPercent = this.getProgressPercent();
            strategy.appendField(locator, this, "progressPercent", buffer, theProgressPercent, (this.progressPercent!= null));
        }
        {
            StartDateType theStartDate;
            theStartDate = this.getStartDate();
            strategy.appendField(locator, this, "startDate", buffer, theStartDate, (this.startDate!= null));
        }
        {
            EndDateType theEndDate;
            theEndDate = this.getEndDate();
            strategy.appendField(locator, this, "endDate", buffer, theEndDate, (this.endDate!= null));
        }
        {
            List<DocumentReferenceType> theWorkOrderDocumentReference;
            theWorkOrderDocumentReference = (((this.workOrderDocumentReference!= null)&&(!this.workOrderDocumentReference.isEmpty()))?this.getWorkOrderDocumentReference():null);
            strategy.appendField(locator, this, "workOrderDocumentReference", buffer, theWorkOrderDocumentReference, ((this.workOrderDocumentReference!= null)&&(!this.workOrderDocumentReference.isEmpty())));
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
        final WorkPhaseReferenceType that = ((WorkPhaseReferenceType) object);
        {
            IDType lhsID;
            lhsID = this.getID();
            IDType rhsID;
            rhsID = that.getID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsID), LocatorUtils.property(thatLocator, "id", rhsID), lhsID, rhsID, (this.id!= null), (that.id!= null))) {
                return false;
            }
        }
        {
            WorkPhaseCodeType lhsWorkPhaseCode;
            lhsWorkPhaseCode = this.getWorkPhaseCode();
            WorkPhaseCodeType rhsWorkPhaseCode;
            rhsWorkPhaseCode = that.getWorkPhaseCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "workPhaseCode", lhsWorkPhaseCode), LocatorUtils.property(thatLocator, "workPhaseCode", rhsWorkPhaseCode), lhsWorkPhaseCode, rhsWorkPhaseCode, (this.workPhaseCode!= null), (that.workPhaseCode!= null))) {
                return false;
            }
        }
        {
            List<WorkPhaseType> lhsWorkPhase;
            lhsWorkPhase = (((this.workPhase!= null)&&(!this.workPhase.isEmpty()))?this.getWorkPhase():null);
            List<WorkPhaseType> rhsWorkPhase;
            rhsWorkPhase = (((that.workPhase!= null)&&(!that.workPhase.isEmpty()))?that.getWorkPhase():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "workPhase", lhsWorkPhase), LocatorUtils.property(thatLocator, "workPhase", rhsWorkPhase), lhsWorkPhase, rhsWorkPhase, ((this.workPhase!= null)&&(!this.workPhase.isEmpty())), ((that.workPhase!= null)&&(!that.workPhase.isEmpty())))) {
                return false;
            }
        }
        {
            ProgressPercentType lhsProgressPercent;
            lhsProgressPercent = this.getProgressPercent();
            ProgressPercentType rhsProgressPercent;
            rhsProgressPercent = that.getProgressPercent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "progressPercent", lhsProgressPercent), LocatorUtils.property(thatLocator, "progressPercent", rhsProgressPercent), lhsProgressPercent, rhsProgressPercent, (this.progressPercent!= null), (that.progressPercent!= null))) {
                return false;
            }
        }
        {
            StartDateType lhsStartDate;
            lhsStartDate = this.getStartDate();
            StartDateType rhsStartDate;
            rhsStartDate = that.getStartDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startDate", lhsStartDate), LocatorUtils.property(thatLocator, "startDate", rhsStartDate), lhsStartDate, rhsStartDate, (this.startDate!= null), (that.startDate!= null))) {
                return false;
            }
        }
        {
            EndDateType lhsEndDate;
            lhsEndDate = this.getEndDate();
            EndDateType rhsEndDate;
            rhsEndDate = that.getEndDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endDate", lhsEndDate), LocatorUtils.property(thatLocator, "endDate", rhsEndDate), lhsEndDate, rhsEndDate, (this.endDate!= null), (that.endDate!= null))) {
                return false;
            }
        }
        {
            List<DocumentReferenceType> lhsWorkOrderDocumentReference;
            lhsWorkOrderDocumentReference = (((this.workOrderDocumentReference!= null)&&(!this.workOrderDocumentReference.isEmpty()))?this.getWorkOrderDocumentReference():null);
            List<DocumentReferenceType> rhsWorkOrderDocumentReference;
            rhsWorkOrderDocumentReference = (((that.workOrderDocumentReference!= null)&&(!that.workOrderDocumentReference.isEmpty()))?that.getWorkOrderDocumentReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "workOrderDocumentReference", lhsWorkOrderDocumentReference), LocatorUtils.property(thatLocator, "workOrderDocumentReference", rhsWorkOrderDocumentReference), lhsWorkOrderDocumentReference, rhsWorkOrderDocumentReference, ((this.workOrderDocumentReference!= null)&&(!this.workOrderDocumentReference.isEmpty())), ((that.workOrderDocumentReference!= null)&&(!that.workOrderDocumentReference.isEmpty())))) {
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
            IDType theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID, (this.id!= null));
        }
        {
            WorkPhaseCodeType theWorkPhaseCode;
            theWorkPhaseCode = this.getWorkPhaseCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "workPhaseCode", theWorkPhaseCode), currentHashCode, theWorkPhaseCode, (this.workPhaseCode!= null));
        }
        {
            List<WorkPhaseType> theWorkPhase;
            theWorkPhase = (((this.workPhase!= null)&&(!this.workPhase.isEmpty()))?this.getWorkPhase():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "workPhase", theWorkPhase), currentHashCode, theWorkPhase, ((this.workPhase!= null)&&(!this.workPhase.isEmpty())));
        }
        {
            ProgressPercentType theProgressPercent;
            theProgressPercent = this.getProgressPercent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "progressPercent", theProgressPercent), currentHashCode, theProgressPercent, (this.progressPercent!= null));
        }
        {
            StartDateType theStartDate;
            theStartDate = this.getStartDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startDate", theStartDate), currentHashCode, theStartDate, (this.startDate!= null));
        }
        {
            EndDateType theEndDate;
            theEndDate = this.getEndDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endDate", theEndDate), currentHashCode, theEndDate, (this.endDate!= null));
        }
        {
            List<DocumentReferenceType> theWorkOrderDocumentReference;
            theWorkOrderDocumentReference = (((this.workOrderDocumentReference!= null)&&(!this.workOrderDocumentReference.isEmpty()))?this.getWorkOrderDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "workOrderDocumentReference", theWorkOrderDocumentReference), currentHashCode, theWorkOrderDocumentReference, ((this.workOrderDocumentReference!= null)&&(!this.workOrderDocumentReference.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
