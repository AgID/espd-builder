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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AvailabilityTimePercentType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FridayAvailabilityIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MaximumDataLossDurationMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MaximumIncidentNotificationDurationMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MeanTimeToRecoverDurationMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MinimumDownTimeScheduleDurationMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MinimumResponseTimeDurationMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MondayAvailabilityIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SaturdayAvailabilityIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ServiceTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ServiceTypeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SundayAvailabilityIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ThursdayAvailabilityIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TuesdayAvailabilityIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.WednesdayAvailabilityIndicatorType;
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
 * <p>Classe Java per ServiceLevelAgreementType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceLevelAgreementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ServiceTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ServiceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AvailabilityTimePercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MondayAvailabilityIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TuesdayAvailabilityIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WednesdayAvailabilityIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ThursdayAvailabilityIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FridayAvailabilityIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SaturdayAvailabilityIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SundayAvailabilityIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumResponseTimeDurationMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumDownTimeScheduleDurationMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumIncidentNotificationDurationMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumDataLossDurationMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MeanTimeToRecoverDurationMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ServiceAvailabilityPeriod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ServiceMaintenancePeriod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceLevelAgreementType", propOrder = {
    "id",
    "serviceTypeCode",
    "serviceType",
    "availabilityTimePercent",
    "mondayAvailabilityIndicator",
    "tuesdayAvailabilityIndicator",
    "wednesdayAvailabilityIndicator",
    "thursdayAvailabilityIndicator",
    "fridayAvailabilityIndicator",
    "saturdayAvailabilityIndicator",
    "sundayAvailabilityIndicator",
    "minimumResponseTimeDurationMeasure",
    "minimumDownTimeScheduleDurationMeasure",
    "maximumIncidentNotificationDurationMeasure",
    "maximumDataLossDurationMeasure",
    "meanTimeToRecoverDurationMeasure",
    "serviceAvailabilityPeriod",
    "serviceMaintenancePeriod"
})
public class ServiceLevelAgreementType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "ServiceTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ServiceTypeCodeType serviceTypeCode;
    @XmlElement(name = "ServiceType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ServiceTypeType> serviceType;
    @XmlElement(name = "AvailabilityTimePercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AvailabilityTimePercentType availabilityTimePercent;
    @XmlElement(name = "MondayAvailabilityIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MondayAvailabilityIndicatorType mondayAvailabilityIndicator;
    @XmlElement(name = "TuesdayAvailabilityIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TuesdayAvailabilityIndicatorType tuesdayAvailabilityIndicator;
    @XmlElement(name = "WednesdayAvailabilityIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected WednesdayAvailabilityIndicatorType wednesdayAvailabilityIndicator;
    @XmlElement(name = "ThursdayAvailabilityIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ThursdayAvailabilityIndicatorType thursdayAvailabilityIndicator;
    @XmlElement(name = "FridayAvailabilityIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FridayAvailabilityIndicatorType fridayAvailabilityIndicator;
    @XmlElement(name = "SaturdayAvailabilityIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SaturdayAvailabilityIndicatorType saturdayAvailabilityIndicator;
    @XmlElement(name = "SundayAvailabilityIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SundayAvailabilityIndicatorType sundayAvailabilityIndicator;
    @XmlElement(name = "MinimumResponseTimeDurationMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MinimumResponseTimeDurationMeasureType minimumResponseTimeDurationMeasure;
    @XmlElement(name = "MinimumDownTimeScheduleDurationMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MinimumDownTimeScheduleDurationMeasureType minimumDownTimeScheduleDurationMeasure;
    @XmlElement(name = "MaximumIncidentNotificationDurationMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MaximumIncidentNotificationDurationMeasureType maximumIncidentNotificationDurationMeasure;
    @XmlElement(name = "MaximumDataLossDurationMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MaximumDataLossDurationMeasureType maximumDataLossDurationMeasure;
    @XmlElement(name = "MeanTimeToRecoverDurationMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MeanTimeToRecoverDurationMeasureType meanTimeToRecoverDurationMeasure;
    @XmlElement(name = "ServiceAvailabilityPeriod")
    protected List<PeriodType> serviceAvailabilityPeriod;
    @XmlElement(name = "ServiceMaintenancePeriod")
    protected List<PeriodType> serviceMaintenancePeriod;

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
     * Recupera il valore della proprietà serviceTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link ServiceTypeCodeType }
     *     
     */
    public ServiceTypeCodeType getServiceTypeCode() {
        return serviceTypeCode;
    }

    /**
     * Imposta il valore della proprietà serviceTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceTypeCodeType }
     *     
     */
    public void setServiceTypeCode(ServiceTypeCodeType value) {
        this.serviceTypeCode = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceTypeType }
     * 
     * 
     */
    public List<ServiceTypeType> getServiceType() {
        if (serviceType == null) {
            serviceType = new ArrayList<ServiceTypeType>();
        }
        return this.serviceType;
    }

    /**
     * Recupera il valore della proprietà availabilityTimePercent.
     * 
     * @return
     *     possible object is
     *     {@link AvailabilityTimePercentType }
     *     
     */
    public AvailabilityTimePercentType getAvailabilityTimePercent() {
        return availabilityTimePercent;
    }

    /**
     * Imposta il valore della proprietà availabilityTimePercent.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailabilityTimePercentType }
     *     
     */
    public void setAvailabilityTimePercent(AvailabilityTimePercentType value) {
        this.availabilityTimePercent = value;
    }

    /**
     * Recupera il valore della proprietà mondayAvailabilityIndicator.
     * 
     * @return
     *     possible object is
     *     {@link MondayAvailabilityIndicatorType }
     *     
     */
    public MondayAvailabilityIndicatorType getMondayAvailabilityIndicator() {
        return mondayAvailabilityIndicator;
    }

    /**
     * Imposta il valore della proprietà mondayAvailabilityIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link MondayAvailabilityIndicatorType }
     *     
     */
    public void setMondayAvailabilityIndicator(MondayAvailabilityIndicatorType value) {
        this.mondayAvailabilityIndicator = value;
    }

    /**
     * Recupera il valore della proprietà tuesdayAvailabilityIndicator.
     * 
     * @return
     *     possible object is
     *     {@link TuesdayAvailabilityIndicatorType }
     *     
     */
    public TuesdayAvailabilityIndicatorType getTuesdayAvailabilityIndicator() {
        return tuesdayAvailabilityIndicator;
    }

    /**
     * Imposta il valore della proprietà tuesdayAvailabilityIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link TuesdayAvailabilityIndicatorType }
     *     
     */
    public void setTuesdayAvailabilityIndicator(TuesdayAvailabilityIndicatorType value) {
        this.tuesdayAvailabilityIndicator = value;
    }

    /**
     * Recupera il valore della proprietà wednesdayAvailabilityIndicator.
     * 
     * @return
     *     possible object is
     *     {@link WednesdayAvailabilityIndicatorType }
     *     
     */
    public WednesdayAvailabilityIndicatorType getWednesdayAvailabilityIndicator() {
        return wednesdayAvailabilityIndicator;
    }

    /**
     * Imposta il valore della proprietà wednesdayAvailabilityIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link WednesdayAvailabilityIndicatorType }
     *     
     */
    public void setWednesdayAvailabilityIndicator(WednesdayAvailabilityIndicatorType value) {
        this.wednesdayAvailabilityIndicator = value;
    }

    /**
     * Recupera il valore della proprietà thursdayAvailabilityIndicator.
     * 
     * @return
     *     possible object is
     *     {@link ThursdayAvailabilityIndicatorType }
     *     
     */
    public ThursdayAvailabilityIndicatorType getThursdayAvailabilityIndicator() {
        return thursdayAvailabilityIndicator;
    }

    /**
     * Imposta il valore della proprietà thursdayAvailabilityIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link ThursdayAvailabilityIndicatorType }
     *     
     */
    public void setThursdayAvailabilityIndicator(ThursdayAvailabilityIndicatorType value) {
        this.thursdayAvailabilityIndicator = value;
    }

    /**
     * Recupera il valore della proprietà fridayAvailabilityIndicator.
     * 
     * @return
     *     possible object is
     *     {@link FridayAvailabilityIndicatorType }
     *     
     */
    public FridayAvailabilityIndicatorType getFridayAvailabilityIndicator() {
        return fridayAvailabilityIndicator;
    }

    /**
     * Imposta il valore della proprietà fridayAvailabilityIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link FridayAvailabilityIndicatorType }
     *     
     */
    public void setFridayAvailabilityIndicator(FridayAvailabilityIndicatorType value) {
        this.fridayAvailabilityIndicator = value;
    }

    /**
     * Recupera il valore della proprietà saturdayAvailabilityIndicator.
     * 
     * @return
     *     possible object is
     *     {@link SaturdayAvailabilityIndicatorType }
     *     
     */
    public SaturdayAvailabilityIndicatorType getSaturdayAvailabilityIndicator() {
        return saturdayAvailabilityIndicator;
    }

    /**
     * Imposta il valore della proprietà saturdayAvailabilityIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link SaturdayAvailabilityIndicatorType }
     *     
     */
    public void setSaturdayAvailabilityIndicator(SaturdayAvailabilityIndicatorType value) {
        this.saturdayAvailabilityIndicator = value;
    }

    /**
     * Recupera il valore della proprietà sundayAvailabilityIndicator.
     * 
     * @return
     *     possible object is
     *     {@link SundayAvailabilityIndicatorType }
     *     
     */
    public SundayAvailabilityIndicatorType getSundayAvailabilityIndicator() {
        return sundayAvailabilityIndicator;
    }

    /**
     * Imposta il valore della proprietà sundayAvailabilityIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link SundayAvailabilityIndicatorType }
     *     
     */
    public void setSundayAvailabilityIndicator(SundayAvailabilityIndicatorType value) {
        this.sundayAvailabilityIndicator = value;
    }

    /**
     * Recupera il valore della proprietà minimumResponseTimeDurationMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MinimumResponseTimeDurationMeasureType }
     *     
     */
    public MinimumResponseTimeDurationMeasureType getMinimumResponseTimeDurationMeasure() {
        return minimumResponseTimeDurationMeasure;
    }

    /**
     * Imposta il valore della proprietà minimumResponseTimeDurationMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumResponseTimeDurationMeasureType }
     *     
     */
    public void setMinimumResponseTimeDurationMeasure(MinimumResponseTimeDurationMeasureType value) {
        this.minimumResponseTimeDurationMeasure = value;
    }

    /**
     * Recupera il valore della proprietà minimumDownTimeScheduleDurationMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MinimumDownTimeScheduleDurationMeasureType }
     *     
     */
    public MinimumDownTimeScheduleDurationMeasureType getMinimumDownTimeScheduleDurationMeasure() {
        return minimumDownTimeScheduleDurationMeasure;
    }

    /**
     * Imposta il valore della proprietà minimumDownTimeScheduleDurationMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumDownTimeScheduleDurationMeasureType }
     *     
     */
    public void setMinimumDownTimeScheduleDurationMeasure(MinimumDownTimeScheduleDurationMeasureType value) {
        this.minimumDownTimeScheduleDurationMeasure = value;
    }

    /**
     * Recupera il valore della proprietà maximumIncidentNotificationDurationMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MaximumIncidentNotificationDurationMeasureType }
     *     
     */
    public MaximumIncidentNotificationDurationMeasureType getMaximumIncidentNotificationDurationMeasure() {
        return maximumIncidentNotificationDurationMeasure;
    }

    /**
     * Imposta il valore della proprietà maximumIncidentNotificationDurationMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumIncidentNotificationDurationMeasureType }
     *     
     */
    public void setMaximumIncidentNotificationDurationMeasure(MaximumIncidentNotificationDurationMeasureType value) {
        this.maximumIncidentNotificationDurationMeasure = value;
    }

    /**
     * Recupera il valore della proprietà maximumDataLossDurationMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MaximumDataLossDurationMeasureType }
     *     
     */
    public MaximumDataLossDurationMeasureType getMaximumDataLossDurationMeasure() {
        return maximumDataLossDurationMeasure;
    }

    /**
     * Imposta il valore della proprietà maximumDataLossDurationMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumDataLossDurationMeasureType }
     *     
     */
    public void setMaximumDataLossDurationMeasure(MaximumDataLossDurationMeasureType value) {
        this.maximumDataLossDurationMeasure = value;
    }

    /**
     * Recupera il valore della proprietà meanTimeToRecoverDurationMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeanTimeToRecoverDurationMeasureType }
     *     
     */
    public MeanTimeToRecoverDurationMeasureType getMeanTimeToRecoverDurationMeasure() {
        return meanTimeToRecoverDurationMeasure;
    }

    /**
     * Imposta il valore della proprietà meanTimeToRecoverDurationMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeanTimeToRecoverDurationMeasureType }
     *     
     */
    public void setMeanTimeToRecoverDurationMeasure(MeanTimeToRecoverDurationMeasureType value) {
        this.meanTimeToRecoverDurationMeasure = value;
    }

    /**
     * Gets the value of the serviceAvailabilityPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceAvailabilityPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceAvailabilityPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodType }
     * 
     * 
     */
    public List<PeriodType> getServiceAvailabilityPeriod() {
        if (serviceAvailabilityPeriod == null) {
            serviceAvailabilityPeriod = new ArrayList<PeriodType>();
        }
        return this.serviceAvailabilityPeriod;
    }

    /**
     * Gets the value of the serviceMaintenancePeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceMaintenancePeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceMaintenancePeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodType }
     * 
     * 
     */
    public List<PeriodType> getServiceMaintenancePeriod() {
        if (serviceMaintenancePeriod == null) {
            serviceMaintenancePeriod = new ArrayList<PeriodType>();
        }
        return this.serviceMaintenancePeriod;
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
            ServiceTypeCodeType theServiceTypeCode;
            theServiceTypeCode = this.getServiceTypeCode();
            strategy.appendField(locator, this, "serviceTypeCode", buffer, theServiceTypeCode, (this.serviceTypeCode!= null));
        }
        {
            List<ServiceTypeType> theServiceType;
            theServiceType = (((this.serviceType!= null)&&(!this.serviceType.isEmpty()))?this.getServiceType():null);
            strategy.appendField(locator, this, "serviceType", buffer, theServiceType, ((this.serviceType!= null)&&(!this.serviceType.isEmpty())));
        }
        {
            AvailabilityTimePercentType theAvailabilityTimePercent;
            theAvailabilityTimePercent = this.getAvailabilityTimePercent();
            strategy.appendField(locator, this, "availabilityTimePercent", buffer, theAvailabilityTimePercent, (this.availabilityTimePercent!= null));
        }
        {
            MondayAvailabilityIndicatorType theMondayAvailabilityIndicator;
            theMondayAvailabilityIndicator = this.getMondayAvailabilityIndicator();
            strategy.appendField(locator, this, "mondayAvailabilityIndicator", buffer, theMondayAvailabilityIndicator, (this.mondayAvailabilityIndicator!= null));
        }
        {
            TuesdayAvailabilityIndicatorType theTuesdayAvailabilityIndicator;
            theTuesdayAvailabilityIndicator = this.getTuesdayAvailabilityIndicator();
            strategy.appendField(locator, this, "tuesdayAvailabilityIndicator", buffer, theTuesdayAvailabilityIndicator, (this.tuesdayAvailabilityIndicator!= null));
        }
        {
            WednesdayAvailabilityIndicatorType theWednesdayAvailabilityIndicator;
            theWednesdayAvailabilityIndicator = this.getWednesdayAvailabilityIndicator();
            strategy.appendField(locator, this, "wednesdayAvailabilityIndicator", buffer, theWednesdayAvailabilityIndicator, (this.wednesdayAvailabilityIndicator!= null));
        }
        {
            ThursdayAvailabilityIndicatorType theThursdayAvailabilityIndicator;
            theThursdayAvailabilityIndicator = this.getThursdayAvailabilityIndicator();
            strategy.appendField(locator, this, "thursdayAvailabilityIndicator", buffer, theThursdayAvailabilityIndicator, (this.thursdayAvailabilityIndicator!= null));
        }
        {
            FridayAvailabilityIndicatorType theFridayAvailabilityIndicator;
            theFridayAvailabilityIndicator = this.getFridayAvailabilityIndicator();
            strategy.appendField(locator, this, "fridayAvailabilityIndicator", buffer, theFridayAvailabilityIndicator, (this.fridayAvailabilityIndicator!= null));
        }
        {
            SaturdayAvailabilityIndicatorType theSaturdayAvailabilityIndicator;
            theSaturdayAvailabilityIndicator = this.getSaturdayAvailabilityIndicator();
            strategy.appendField(locator, this, "saturdayAvailabilityIndicator", buffer, theSaturdayAvailabilityIndicator, (this.saturdayAvailabilityIndicator!= null));
        }
        {
            SundayAvailabilityIndicatorType theSundayAvailabilityIndicator;
            theSundayAvailabilityIndicator = this.getSundayAvailabilityIndicator();
            strategy.appendField(locator, this, "sundayAvailabilityIndicator", buffer, theSundayAvailabilityIndicator, (this.sundayAvailabilityIndicator!= null));
        }
        {
            MinimumResponseTimeDurationMeasureType theMinimumResponseTimeDurationMeasure;
            theMinimumResponseTimeDurationMeasure = this.getMinimumResponseTimeDurationMeasure();
            strategy.appendField(locator, this, "minimumResponseTimeDurationMeasure", buffer, theMinimumResponseTimeDurationMeasure, (this.minimumResponseTimeDurationMeasure!= null));
        }
        {
            MinimumDownTimeScheduleDurationMeasureType theMinimumDownTimeScheduleDurationMeasure;
            theMinimumDownTimeScheduleDurationMeasure = this.getMinimumDownTimeScheduleDurationMeasure();
            strategy.appendField(locator, this, "minimumDownTimeScheduleDurationMeasure", buffer, theMinimumDownTimeScheduleDurationMeasure, (this.minimumDownTimeScheduleDurationMeasure!= null));
        }
        {
            MaximumIncidentNotificationDurationMeasureType theMaximumIncidentNotificationDurationMeasure;
            theMaximumIncidentNotificationDurationMeasure = this.getMaximumIncidentNotificationDurationMeasure();
            strategy.appendField(locator, this, "maximumIncidentNotificationDurationMeasure", buffer, theMaximumIncidentNotificationDurationMeasure, (this.maximumIncidentNotificationDurationMeasure!= null));
        }
        {
            MaximumDataLossDurationMeasureType theMaximumDataLossDurationMeasure;
            theMaximumDataLossDurationMeasure = this.getMaximumDataLossDurationMeasure();
            strategy.appendField(locator, this, "maximumDataLossDurationMeasure", buffer, theMaximumDataLossDurationMeasure, (this.maximumDataLossDurationMeasure!= null));
        }
        {
            MeanTimeToRecoverDurationMeasureType theMeanTimeToRecoverDurationMeasure;
            theMeanTimeToRecoverDurationMeasure = this.getMeanTimeToRecoverDurationMeasure();
            strategy.appendField(locator, this, "meanTimeToRecoverDurationMeasure", buffer, theMeanTimeToRecoverDurationMeasure, (this.meanTimeToRecoverDurationMeasure!= null));
        }
        {
            List<PeriodType> theServiceAvailabilityPeriod;
            theServiceAvailabilityPeriod = (((this.serviceAvailabilityPeriod!= null)&&(!this.serviceAvailabilityPeriod.isEmpty()))?this.getServiceAvailabilityPeriod():null);
            strategy.appendField(locator, this, "serviceAvailabilityPeriod", buffer, theServiceAvailabilityPeriod, ((this.serviceAvailabilityPeriod!= null)&&(!this.serviceAvailabilityPeriod.isEmpty())));
        }
        {
            List<PeriodType> theServiceMaintenancePeriod;
            theServiceMaintenancePeriod = (((this.serviceMaintenancePeriod!= null)&&(!this.serviceMaintenancePeriod.isEmpty()))?this.getServiceMaintenancePeriod():null);
            strategy.appendField(locator, this, "serviceMaintenancePeriod", buffer, theServiceMaintenancePeriod, ((this.serviceMaintenancePeriod!= null)&&(!this.serviceMaintenancePeriod.isEmpty())));
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
        final ServiceLevelAgreementType that = ((ServiceLevelAgreementType) object);
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
            ServiceTypeCodeType lhsServiceTypeCode;
            lhsServiceTypeCode = this.getServiceTypeCode();
            ServiceTypeCodeType rhsServiceTypeCode;
            rhsServiceTypeCode = that.getServiceTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceTypeCode", lhsServiceTypeCode), LocatorUtils.property(thatLocator, "serviceTypeCode", rhsServiceTypeCode), lhsServiceTypeCode, rhsServiceTypeCode, (this.serviceTypeCode!= null), (that.serviceTypeCode!= null))) {
                return false;
            }
        }
        {
            List<ServiceTypeType> lhsServiceType;
            lhsServiceType = (((this.serviceType!= null)&&(!this.serviceType.isEmpty()))?this.getServiceType():null);
            List<ServiceTypeType> rhsServiceType;
            rhsServiceType = (((that.serviceType!= null)&&(!that.serviceType.isEmpty()))?that.getServiceType():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceType", lhsServiceType), LocatorUtils.property(thatLocator, "serviceType", rhsServiceType), lhsServiceType, rhsServiceType, ((this.serviceType!= null)&&(!this.serviceType.isEmpty())), ((that.serviceType!= null)&&(!that.serviceType.isEmpty())))) {
                return false;
            }
        }
        {
            AvailabilityTimePercentType lhsAvailabilityTimePercent;
            lhsAvailabilityTimePercent = this.getAvailabilityTimePercent();
            AvailabilityTimePercentType rhsAvailabilityTimePercent;
            rhsAvailabilityTimePercent = that.getAvailabilityTimePercent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "availabilityTimePercent", lhsAvailabilityTimePercent), LocatorUtils.property(thatLocator, "availabilityTimePercent", rhsAvailabilityTimePercent), lhsAvailabilityTimePercent, rhsAvailabilityTimePercent, (this.availabilityTimePercent!= null), (that.availabilityTimePercent!= null))) {
                return false;
            }
        }
        {
            MondayAvailabilityIndicatorType lhsMondayAvailabilityIndicator;
            lhsMondayAvailabilityIndicator = this.getMondayAvailabilityIndicator();
            MondayAvailabilityIndicatorType rhsMondayAvailabilityIndicator;
            rhsMondayAvailabilityIndicator = that.getMondayAvailabilityIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mondayAvailabilityIndicator", lhsMondayAvailabilityIndicator), LocatorUtils.property(thatLocator, "mondayAvailabilityIndicator", rhsMondayAvailabilityIndicator), lhsMondayAvailabilityIndicator, rhsMondayAvailabilityIndicator, (this.mondayAvailabilityIndicator!= null), (that.mondayAvailabilityIndicator!= null))) {
                return false;
            }
        }
        {
            TuesdayAvailabilityIndicatorType lhsTuesdayAvailabilityIndicator;
            lhsTuesdayAvailabilityIndicator = this.getTuesdayAvailabilityIndicator();
            TuesdayAvailabilityIndicatorType rhsTuesdayAvailabilityIndicator;
            rhsTuesdayAvailabilityIndicator = that.getTuesdayAvailabilityIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tuesdayAvailabilityIndicator", lhsTuesdayAvailabilityIndicator), LocatorUtils.property(thatLocator, "tuesdayAvailabilityIndicator", rhsTuesdayAvailabilityIndicator), lhsTuesdayAvailabilityIndicator, rhsTuesdayAvailabilityIndicator, (this.tuesdayAvailabilityIndicator!= null), (that.tuesdayAvailabilityIndicator!= null))) {
                return false;
            }
        }
        {
            WednesdayAvailabilityIndicatorType lhsWednesdayAvailabilityIndicator;
            lhsWednesdayAvailabilityIndicator = this.getWednesdayAvailabilityIndicator();
            WednesdayAvailabilityIndicatorType rhsWednesdayAvailabilityIndicator;
            rhsWednesdayAvailabilityIndicator = that.getWednesdayAvailabilityIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wednesdayAvailabilityIndicator", lhsWednesdayAvailabilityIndicator), LocatorUtils.property(thatLocator, "wednesdayAvailabilityIndicator", rhsWednesdayAvailabilityIndicator), lhsWednesdayAvailabilityIndicator, rhsWednesdayAvailabilityIndicator, (this.wednesdayAvailabilityIndicator!= null), (that.wednesdayAvailabilityIndicator!= null))) {
                return false;
            }
        }
        {
            ThursdayAvailabilityIndicatorType lhsThursdayAvailabilityIndicator;
            lhsThursdayAvailabilityIndicator = this.getThursdayAvailabilityIndicator();
            ThursdayAvailabilityIndicatorType rhsThursdayAvailabilityIndicator;
            rhsThursdayAvailabilityIndicator = that.getThursdayAvailabilityIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "thursdayAvailabilityIndicator", lhsThursdayAvailabilityIndicator), LocatorUtils.property(thatLocator, "thursdayAvailabilityIndicator", rhsThursdayAvailabilityIndicator), lhsThursdayAvailabilityIndicator, rhsThursdayAvailabilityIndicator, (this.thursdayAvailabilityIndicator!= null), (that.thursdayAvailabilityIndicator!= null))) {
                return false;
            }
        }
        {
            FridayAvailabilityIndicatorType lhsFridayAvailabilityIndicator;
            lhsFridayAvailabilityIndicator = this.getFridayAvailabilityIndicator();
            FridayAvailabilityIndicatorType rhsFridayAvailabilityIndicator;
            rhsFridayAvailabilityIndicator = that.getFridayAvailabilityIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fridayAvailabilityIndicator", lhsFridayAvailabilityIndicator), LocatorUtils.property(thatLocator, "fridayAvailabilityIndicator", rhsFridayAvailabilityIndicator), lhsFridayAvailabilityIndicator, rhsFridayAvailabilityIndicator, (this.fridayAvailabilityIndicator!= null), (that.fridayAvailabilityIndicator!= null))) {
                return false;
            }
        }
        {
            SaturdayAvailabilityIndicatorType lhsSaturdayAvailabilityIndicator;
            lhsSaturdayAvailabilityIndicator = this.getSaturdayAvailabilityIndicator();
            SaturdayAvailabilityIndicatorType rhsSaturdayAvailabilityIndicator;
            rhsSaturdayAvailabilityIndicator = that.getSaturdayAvailabilityIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "saturdayAvailabilityIndicator", lhsSaturdayAvailabilityIndicator), LocatorUtils.property(thatLocator, "saturdayAvailabilityIndicator", rhsSaturdayAvailabilityIndicator), lhsSaturdayAvailabilityIndicator, rhsSaturdayAvailabilityIndicator, (this.saturdayAvailabilityIndicator!= null), (that.saturdayAvailabilityIndicator!= null))) {
                return false;
            }
        }
        {
            SundayAvailabilityIndicatorType lhsSundayAvailabilityIndicator;
            lhsSundayAvailabilityIndicator = this.getSundayAvailabilityIndicator();
            SundayAvailabilityIndicatorType rhsSundayAvailabilityIndicator;
            rhsSundayAvailabilityIndicator = that.getSundayAvailabilityIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sundayAvailabilityIndicator", lhsSundayAvailabilityIndicator), LocatorUtils.property(thatLocator, "sundayAvailabilityIndicator", rhsSundayAvailabilityIndicator), lhsSundayAvailabilityIndicator, rhsSundayAvailabilityIndicator, (this.sundayAvailabilityIndicator!= null), (that.sundayAvailabilityIndicator!= null))) {
                return false;
            }
        }
        {
            MinimumResponseTimeDurationMeasureType lhsMinimumResponseTimeDurationMeasure;
            lhsMinimumResponseTimeDurationMeasure = this.getMinimumResponseTimeDurationMeasure();
            MinimumResponseTimeDurationMeasureType rhsMinimumResponseTimeDurationMeasure;
            rhsMinimumResponseTimeDurationMeasure = that.getMinimumResponseTimeDurationMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minimumResponseTimeDurationMeasure", lhsMinimumResponseTimeDurationMeasure), LocatorUtils.property(thatLocator, "minimumResponseTimeDurationMeasure", rhsMinimumResponseTimeDurationMeasure), lhsMinimumResponseTimeDurationMeasure, rhsMinimumResponseTimeDurationMeasure, (this.minimumResponseTimeDurationMeasure!= null), (that.minimumResponseTimeDurationMeasure!= null))) {
                return false;
            }
        }
        {
            MinimumDownTimeScheduleDurationMeasureType lhsMinimumDownTimeScheduleDurationMeasure;
            lhsMinimumDownTimeScheduleDurationMeasure = this.getMinimumDownTimeScheduleDurationMeasure();
            MinimumDownTimeScheduleDurationMeasureType rhsMinimumDownTimeScheduleDurationMeasure;
            rhsMinimumDownTimeScheduleDurationMeasure = that.getMinimumDownTimeScheduleDurationMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minimumDownTimeScheduleDurationMeasure", lhsMinimumDownTimeScheduleDurationMeasure), LocatorUtils.property(thatLocator, "minimumDownTimeScheduleDurationMeasure", rhsMinimumDownTimeScheduleDurationMeasure), lhsMinimumDownTimeScheduleDurationMeasure, rhsMinimumDownTimeScheduleDurationMeasure, (this.minimumDownTimeScheduleDurationMeasure!= null), (that.minimumDownTimeScheduleDurationMeasure!= null))) {
                return false;
            }
        }
        {
            MaximumIncidentNotificationDurationMeasureType lhsMaximumIncidentNotificationDurationMeasure;
            lhsMaximumIncidentNotificationDurationMeasure = this.getMaximumIncidentNotificationDurationMeasure();
            MaximumIncidentNotificationDurationMeasureType rhsMaximumIncidentNotificationDurationMeasure;
            rhsMaximumIncidentNotificationDurationMeasure = that.getMaximumIncidentNotificationDurationMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumIncidentNotificationDurationMeasure", lhsMaximumIncidentNotificationDurationMeasure), LocatorUtils.property(thatLocator, "maximumIncidentNotificationDurationMeasure", rhsMaximumIncidentNotificationDurationMeasure), lhsMaximumIncidentNotificationDurationMeasure, rhsMaximumIncidentNotificationDurationMeasure, (this.maximumIncidentNotificationDurationMeasure!= null), (that.maximumIncidentNotificationDurationMeasure!= null))) {
                return false;
            }
        }
        {
            MaximumDataLossDurationMeasureType lhsMaximumDataLossDurationMeasure;
            lhsMaximumDataLossDurationMeasure = this.getMaximumDataLossDurationMeasure();
            MaximumDataLossDurationMeasureType rhsMaximumDataLossDurationMeasure;
            rhsMaximumDataLossDurationMeasure = that.getMaximumDataLossDurationMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumDataLossDurationMeasure", lhsMaximumDataLossDurationMeasure), LocatorUtils.property(thatLocator, "maximumDataLossDurationMeasure", rhsMaximumDataLossDurationMeasure), lhsMaximumDataLossDurationMeasure, rhsMaximumDataLossDurationMeasure, (this.maximumDataLossDurationMeasure!= null), (that.maximumDataLossDurationMeasure!= null))) {
                return false;
            }
        }
        {
            MeanTimeToRecoverDurationMeasureType lhsMeanTimeToRecoverDurationMeasure;
            lhsMeanTimeToRecoverDurationMeasure = this.getMeanTimeToRecoverDurationMeasure();
            MeanTimeToRecoverDurationMeasureType rhsMeanTimeToRecoverDurationMeasure;
            rhsMeanTimeToRecoverDurationMeasure = that.getMeanTimeToRecoverDurationMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "meanTimeToRecoverDurationMeasure", lhsMeanTimeToRecoverDurationMeasure), LocatorUtils.property(thatLocator, "meanTimeToRecoverDurationMeasure", rhsMeanTimeToRecoverDurationMeasure), lhsMeanTimeToRecoverDurationMeasure, rhsMeanTimeToRecoverDurationMeasure, (this.meanTimeToRecoverDurationMeasure!= null), (that.meanTimeToRecoverDurationMeasure!= null))) {
                return false;
            }
        }
        {
            List<PeriodType> lhsServiceAvailabilityPeriod;
            lhsServiceAvailabilityPeriod = (((this.serviceAvailabilityPeriod!= null)&&(!this.serviceAvailabilityPeriod.isEmpty()))?this.getServiceAvailabilityPeriod():null);
            List<PeriodType> rhsServiceAvailabilityPeriod;
            rhsServiceAvailabilityPeriod = (((that.serviceAvailabilityPeriod!= null)&&(!that.serviceAvailabilityPeriod.isEmpty()))?that.getServiceAvailabilityPeriod():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceAvailabilityPeriod", lhsServiceAvailabilityPeriod), LocatorUtils.property(thatLocator, "serviceAvailabilityPeriod", rhsServiceAvailabilityPeriod), lhsServiceAvailabilityPeriod, rhsServiceAvailabilityPeriod, ((this.serviceAvailabilityPeriod!= null)&&(!this.serviceAvailabilityPeriod.isEmpty())), ((that.serviceAvailabilityPeriod!= null)&&(!that.serviceAvailabilityPeriod.isEmpty())))) {
                return false;
            }
        }
        {
            List<PeriodType> lhsServiceMaintenancePeriod;
            lhsServiceMaintenancePeriod = (((this.serviceMaintenancePeriod!= null)&&(!this.serviceMaintenancePeriod.isEmpty()))?this.getServiceMaintenancePeriod():null);
            List<PeriodType> rhsServiceMaintenancePeriod;
            rhsServiceMaintenancePeriod = (((that.serviceMaintenancePeriod!= null)&&(!that.serviceMaintenancePeriod.isEmpty()))?that.getServiceMaintenancePeriod():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceMaintenancePeriod", lhsServiceMaintenancePeriod), LocatorUtils.property(thatLocator, "serviceMaintenancePeriod", rhsServiceMaintenancePeriod), lhsServiceMaintenancePeriod, rhsServiceMaintenancePeriod, ((this.serviceMaintenancePeriod!= null)&&(!this.serviceMaintenancePeriod.isEmpty())), ((that.serviceMaintenancePeriod!= null)&&(!that.serviceMaintenancePeriod.isEmpty())))) {
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
            ServiceTypeCodeType theServiceTypeCode;
            theServiceTypeCode = this.getServiceTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceTypeCode", theServiceTypeCode), currentHashCode, theServiceTypeCode, (this.serviceTypeCode!= null));
        }
        {
            List<ServiceTypeType> theServiceType;
            theServiceType = (((this.serviceType!= null)&&(!this.serviceType.isEmpty()))?this.getServiceType():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceType", theServiceType), currentHashCode, theServiceType, ((this.serviceType!= null)&&(!this.serviceType.isEmpty())));
        }
        {
            AvailabilityTimePercentType theAvailabilityTimePercent;
            theAvailabilityTimePercent = this.getAvailabilityTimePercent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "availabilityTimePercent", theAvailabilityTimePercent), currentHashCode, theAvailabilityTimePercent, (this.availabilityTimePercent!= null));
        }
        {
            MondayAvailabilityIndicatorType theMondayAvailabilityIndicator;
            theMondayAvailabilityIndicator = this.getMondayAvailabilityIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mondayAvailabilityIndicator", theMondayAvailabilityIndicator), currentHashCode, theMondayAvailabilityIndicator, (this.mondayAvailabilityIndicator!= null));
        }
        {
            TuesdayAvailabilityIndicatorType theTuesdayAvailabilityIndicator;
            theTuesdayAvailabilityIndicator = this.getTuesdayAvailabilityIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tuesdayAvailabilityIndicator", theTuesdayAvailabilityIndicator), currentHashCode, theTuesdayAvailabilityIndicator, (this.tuesdayAvailabilityIndicator!= null));
        }
        {
            WednesdayAvailabilityIndicatorType theWednesdayAvailabilityIndicator;
            theWednesdayAvailabilityIndicator = this.getWednesdayAvailabilityIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wednesdayAvailabilityIndicator", theWednesdayAvailabilityIndicator), currentHashCode, theWednesdayAvailabilityIndicator, (this.wednesdayAvailabilityIndicator!= null));
        }
        {
            ThursdayAvailabilityIndicatorType theThursdayAvailabilityIndicator;
            theThursdayAvailabilityIndicator = this.getThursdayAvailabilityIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "thursdayAvailabilityIndicator", theThursdayAvailabilityIndicator), currentHashCode, theThursdayAvailabilityIndicator, (this.thursdayAvailabilityIndicator!= null));
        }
        {
            FridayAvailabilityIndicatorType theFridayAvailabilityIndicator;
            theFridayAvailabilityIndicator = this.getFridayAvailabilityIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fridayAvailabilityIndicator", theFridayAvailabilityIndicator), currentHashCode, theFridayAvailabilityIndicator, (this.fridayAvailabilityIndicator!= null));
        }
        {
            SaturdayAvailabilityIndicatorType theSaturdayAvailabilityIndicator;
            theSaturdayAvailabilityIndicator = this.getSaturdayAvailabilityIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "saturdayAvailabilityIndicator", theSaturdayAvailabilityIndicator), currentHashCode, theSaturdayAvailabilityIndicator, (this.saturdayAvailabilityIndicator!= null));
        }
        {
            SundayAvailabilityIndicatorType theSundayAvailabilityIndicator;
            theSundayAvailabilityIndicator = this.getSundayAvailabilityIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sundayAvailabilityIndicator", theSundayAvailabilityIndicator), currentHashCode, theSundayAvailabilityIndicator, (this.sundayAvailabilityIndicator!= null));
        }
        {
            MinimumResponseTimeDurationMeasureType theMinimumResponseTimeDurationMeasure;
            theMinimumResponseTimeDurationMeasure = this.getMinimumResponseTimeDurationMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minimumResponseTimeDurationMeasure", theMinimumResponseTimeDurationMeasure), currentHashCode, theMinimumResponseTimeDurationMeasure, (this.minimumResponseTimeDurationMeasure!= null));
        }
        {
            MinimumDownTimeScheduleDurationMeasureType theMinimumDownTimeScheduleDurationMeasure;
            theMinimumDownTimeScheduleDurationMeasure = this.getMinimumDownTimeScheduleDurationMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minimumDownTimeScheduleDurationMeasure", theMinimumDownTimeScheduleDurationMeasure), currentHashCode, theMinimumDownTimeScheduleDurationMeasure, (this.minimumDownTimeScheduleDurationMeasure!= null));
        }
        {
            MaximumIncidentNotificationDurationMeasureType theMaximumIncidentNotificationDurationMeasure;
            theMaximumIncidentNotificationDurationMeasure = this.getMaximumIncidentNotificationDurationMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumIncidentNotificationDurationMeasure", theMaximumIncidentNotificationDurationMeasure), currentHashCode, theMaximumIncidentNotificationDurationMeasure, (this.maximumIncidentNotificationDurationMeasure!= null));
        }
        {
            MaximumDataLossDurationMeasureType theMaximumDataLossDurationMeasure;
            theMaximumDataLossDurationMeasure = this.getMaximumDataLossDurationMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumDataLossDurationMeasure", theMaximumDataLossDurationMeasure), currentHashCode, theMaximumDataLossDurationMeasure, (this.maximumDataLossDurationMeasure!= null));
        }
        {
            MeanTimeToRecoverDurationMeasureType theMeanTimeToRecoverDurationMeasure;
            theMeanTimeToRecoverDurationMeasure = this.getMeanTimeToRecoverDurationMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "meanTimeToRecoverDurationMeasure", theMeanTimeToRecoverDurationMeasure), currentHashCode, theMeanTimeToRecoverDurationMeasure, (this.meanTimeToRecoverDurationMeasure!= null));
        }
        {
            List<PeriodType> theServiceAvailabilityPeriod;
            theServiceAvailabilityPeriod = (((this.serviceAvailabilityPeriod!= null)&&(!this.serviceAvailabilityPeriod.isEmpty()))?this.getServiceAvailabilityPeriod():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceAvailabilityPeriod", theServiceAvailabilityPeriod), currentHashCode, theServiceAvailabilityPeriod, ((this.serviceAvailabilityPeriod!= null)&&(!this.serviceAvailabilityPeriod.isEmpty())));
        }
        {
            List<PeriodType> theServiceMaintenancePeriod;
            theServiceMaintenancePeriod = (((this.serviceMaintenancePeriod!= null)&&(!this.serviceMaintenancePeriod.isEmpty()))?this.getServiceMaintenancePeriod():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceMaintenancePeriod", theServiceMaintenancePeriod), currentHashCode, theServiceMaintenancePeriod, ((this.serviceMaintenancePeriod!= null)&&(!this.serviceMaintenancePeriod.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
