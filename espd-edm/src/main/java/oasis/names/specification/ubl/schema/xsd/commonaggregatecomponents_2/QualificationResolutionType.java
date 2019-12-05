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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AdmissionCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExclusionReasonType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResolutionDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResolutionTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResolutionType;
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
 * <p>Classe Java per QualificationResolutionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="QualificationResolutionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AdmissionCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExclusionReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Resolution" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResolutionDate"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResolutionTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ProcurementProjectLot" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualificationResolutionType", propOrder = {
    "admissionCode",
    "exclusionReason",
    "resolution",
    "resolutionDate",
    "resolutionTime",
    "procurementProjectLot"
})
public class QualificationResolutionType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "AdmissionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected AdmissionCodeType admissionCode;
    @XmlElement(name = "ExclusionReason", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ExclusionReasonType> exclusionReason;
    @XmlElement(name = "Resolution", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ResolutionType> resolution;
    @XmlElement(name = "ResolutionDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ResolutionDateType resolutionDate;
    @XmlElement(name = "ResolutionTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ResolutionTimeType resolutionTime;
    @XmlElement(name = "ProcurementProjectLot")
    protected ProcurementProjectLotType procurementProjectLot;

    /**
     * Recupera il valore della proprietà admissionCode.
     * 
     * @return
     *     possible object is
     *     {@link AdmissionCodeType }
     *     
     */
    public AdmissionCodeType getAdmissionCode() {
        return admissionCode;
    }

    /**
     * Imposta il valore della proprietà admissionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link AdmissionCodeType }
     *     
     */
    public void setAdmissionCode(AdmissionCodeType value) {
        this.admissionCode = value;
    }

    /**
     * Gets the value of the exclusionReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exclusionReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExclusionReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExclusionReasonType }
     * 
     * 
     */
    public List<ExclusionReasonType> getExclusionReason() {
        if (exclusionReason == null) {
            exclusionReason = new ArrayList<ExclusionReasonType>();
        }
        return this.exclusionReason;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resolution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResolution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResolutionType }
     * 
     * 
     */
    public List<ResolutionType> getResolution() {
        if (resolution == null) {
            resolution = new ArrayList<ResolutionType>();
        }
        return this.resolution;
    }

    /**
     * Recupera il valore della proprietà resolutionDate.
     * 
     * @return
     *     possible object is
     *     {@link ResolutionDateType }
     *     
     */
    public ResolutionDateType getResolutionDate() {
        return resolutionDate;
    }

    /**
     * Imposta il valore della proprietà resolutionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionDateType }
     *     
     */
    public void setResolutionDate(ResolutionDateType value) {
        this.resolutionDate = value;
    }

    /**
     * Recupera il valore della proprietà resolutionTime.
     * 
     * @return
     *     possible object is
     *     {@link ResolutionTimeType }
     *     
     */
    public ResolutionTimeType getResolutionTime() {
        return resolutionTime;
    }

    /**
     * Imposta il valore della proprietà resolutionTime.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionTimeType }
     *     
     */
    public void setResolutionTime(ResolutionTimeType value) {
        this.resolutionTime = value;
    }

    /**
     * Recupera il valore della proprietà procurementProjectLot.
     * 
     * @return
     *     possible object is
     *     {@link ProcurementProjectLotType }
     *     
     */
    public ProcurementProjectLotType getProcurementProjectLot() {
        return procurementProjectLot;
    }

    /**
     * Imposta il valore della proprietà procurementProjectLot.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcurementProjectLotType }
     *     
     */
    public void setProcurementProjectLot(ProcurementProjectLotType value) {
        this.procurementProjectLot = value;
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
            AdmissionCodeType theAdmissionCode;
            theAdmissionCode = this.getAdmissionCode();
            strategy.appendField(locator, this, "admissionCode", buffer, theAdmissionCode, (this.admissionCode!= null));
        }
        {
            List<ExclusionReasonType> theExclusionReason;
            theExclusionReason = (((this.exclusionReason!= null)&&(!this.exclusionReason.isEmpty()))?this.getExclusionReason():null);
            strategy.appendField(locator, this, "exclusionReason", buffer, theExclusionReason, ((this.exclusionReason!= null)&&(!this.exclusionReason.isEmpty())));
        }
        {
            List<ResolutionType> theResolution;
            theResolution = (((this.resolution!= null)&&(!this.resolution.isEmpty()))?this.getResolution():null);
            strategy.appendField(locator, this, "resolution", buffer, theResolution, ((this.resolution!= null)&&(!this.resolution.isEmpty())));
        }
        {
            ResolutionDateType theResolutionDate;
            theResolutionDate = this.getResolutionDate();
            strategy.appendField(locator, this, "resolutionDate", buffer, theResolutionDate, (this.resolutionDate!= null));
        }
        {
            ResolutionTimeType theResolutionTime;
            theResolutionTime = this.getResolutionTime();
            strategy.appendField(locator, this, "resolutionTime", buffer, theResolutionTime, (this.resolutionTime!= null));
        }
        {
            ProcurementProjectLotType theProcurementProjectLot;
            theProcurementProjectLot = this.getProcurementProjectLot();
            strategy.appendField(locator, this, "procurementProjectLot", buffer, theProcurementProjectLot, (this.procurementProjectLot!= null));
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
        final QualificationResolutionType that = ((QualificationResolutionType) object);
        {
            AdmissionCodeType lhsAdmissionCode;
            lhsAdmissionCode = this.getAdmissionCode();
            AdmissionCodeType rhsAdmissionCode;
            rhsAdmissionCode = that.getAdmissionCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "admissionCode", lhsAdmissionCode), LocatorUtils.property(thatLocator, "admissionCode", rhsAdmissionCode), lhsAdmissionCode, rhsAdmissionCode, (this.admissionCode!= null), (that.admissionCode!= null))) {
                return false;
            }
        }
        {
            List<ExclusionReasonType> lhsExclusionReason;
            lhsExclusionReason = (((this.exclusionReason!= null)&&(!this.exclusionReason.isEmpty()))?this.getExclusionReason():null);
            List<ExclusionReasonType> rhsExclusionReason;
            rhsExclusionReason = (((that.exclusionReason!= null)&&(!that.exclusionReason.isEmpty()))?that.getExclusionReason():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exclusionReason", lhsExclusionReason), LocatorUtils.property(thatLocator, "exclusionReason", rhsExclusionReason), lhsExclusionReason, rhsExclusionReason, ((this.exclusionReason!= null)&&(!this.exclusionReason.isEmpty())), ((that.exclusionReason!= null)&&(!that.exclusionReason.isEmpty())))) {
                return false;
            }
        }
        {
            List<ResolutionType> lhsResolution;
            lhsResolution = (((this.resolution!= null)&&(!this.resolution.isEmpty()))?this.getResolution():null);
            List<ResolutionType> rhsResolution;
            rhsResolution = (((that.resolution!= null)&&(!that.resolution.isEmpty()))?that.getResolution():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "resolution", lhsResolution), LocatorUtils.property(thatLocator, "resolution", rhsResolution), lhsResolution, rhsResolution, ((this.resolution!= null)&&(!this.resolution.isEmpty())), ((that.resolution!= null)&&(!that.resolution.isEmpty())))) {
                return false;
            }
        }
        {
            ResolutionDateType lhsResolutionDate;
            lhsResolutionDate = this.getResolutionDate();
            ResolutionDateType rhsResolutionDate;
            rhsResolutionDate = that.getResolutionDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "resolutionDate", lhsResolutionDate), LocatorUtils.property(thatLocator, "resolutionDate", rhsResolutionDate), lhsResolutionDate, rhsResolutionDate, (this.resolutionDate!= null), (that.resolutionDate!= null))) {
                return false;
            }
        }
        {
            ResolutionTimeType lhsResolutionTime;
            lhsResolutionTime = this.getResolutionTime();
            ResolutionTimeType rhsResolutionTime;
            rhsResolutionTime = that.getResolutionTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "resolutionTime", lhsResolutionTime), LocatorUtils.property(thatLocator, "resolutionTime", rhsResolutionTime), lhsResolutionTime, rhsResolutionTime, (this.resolutionTime!= null), (that.resolutionTime!= null))) {
                return false;
            }
        }
        {
            ProcurementProjectLotType lhsProcurementProjectLot;
            lhsProcurementProjectLot = this.getProcurementProjectLot();
            ProcurementProjectLotType rhsProcurementProjectLot;
            rhsProcurementProjectLot = that.getProcurementProjectLot();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "procurementProjectLot", lhsProcurementProjectLot), LocatorUtils.property(thatLocator, "procurementProjectLot", rhsProcurementProjectLot), lhsProcurementProjectLot, rhsProcurementProjectLot, (this.procurementProjectLot!= null), (that.procurementProjectLot!= null))) {
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
            AdmissionCodeType theAdmissionCode;
            theAdmissionCode = this.getAdmissionCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "admissionCode", theAdmissionCode), currentHashCode, theAdmissionCode, (this.admissionCode!= null));
        }
        {
            List<ExclusionReasonType> theExclusionReason;
            theExclusionReason = (((this.exclusionReason!= null)&&(!this.exclusionReason.isEmpty()))?this.getExclusionReason():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exclusionReason", theExclusionReason), currentHashCode, theExclusionReason, ((this.exclusionReason!= null)&&(!this.exclusionReason.isEmpty())));
        }
        {
            List<ResolutionType> theResolution;
            theResolution = (((this.resolution!= null)&&(!this.resolution.isEmpty()))?this.getResolution():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "resolution", theResolution), currentHashCode, theResolution, ((this.resolution!= null)&&(!this.resolution.isEmpty())));
        }
        {
            ResolutionDateType theResolutionDate;
            theResolutionDate = this.getResolutionDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "resolutionDate", theResolutionDate), currentHashCode, theResolutionDate, (this.resolutionDate!= null));
        }
        {
            ResolutionTimeType theResolutionTime;
            theResolutionTime = this.getResolutionTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "resolutionTime", theResolutionTime), currentHashCode, theResolutionTime, (this.resolutionTime!= null));
        }
        {
            ProcurementProjectLotType theProcurementProjectLot;
            theProcurementProjectLot = this.getProcurementProjectLot();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "procurementProjectLot", theProcurementProjectLot), currentHashCode, theProcurementProjectLot, (this.procurementProjectLot!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
