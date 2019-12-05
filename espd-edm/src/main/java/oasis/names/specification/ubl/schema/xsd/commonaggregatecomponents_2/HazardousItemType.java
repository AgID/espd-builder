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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AdditionalInformationType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CategoryNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EmergencyProceduresCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.HazardClassIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.HazardousCategoryCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LowerOrangeHazardPlacardIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MarkingIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MedicalFirstAidGuideCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NetVolumeMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NetWeightMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PlacardEndorsementType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PlacardNotationType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.QuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TechnicalNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.UNDGCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.UpperOrangeHazardPlacardIDType;
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
 * <p>Classe Java per HazardousItemType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="HazardousItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PlacardNotation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PlacardEndorsement" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AdditionalInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UNDGCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EmergencyProceduresCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MedicalFirstAidGuideCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TechnicalName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CategoryName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HazardousCategoryCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UpperOrangeHazardPlacardID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LowerOrangeHazardPlacardID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MarkingID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HazardClassID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetWeightMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetVolumeMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Quantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContactParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SecondaryHazard" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}HazardousGoodsTransit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EmergencyTemperature" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FlashpointTemperature" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalTemperature" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HazardousItemType", propOrder = {
    "id",
    "placardNotation",
    "placardEndorsement",
    "additionalInformation",
    "undgCode",
    "emergencyProceduresCode",
    "medicalFirstAidGuideCode",
    "technicalName",
    "categoryName",
    "hazardousCategoryCode",
    "upperOrangeHazardPlacardID",
    "lowerOrangeHazardPlacardID",
    "markingID",
    "hazardClassID",
    "netWeightMeasure",
    "netVolumeMeasure",
    "quantity",
    "contactParty",
    "secondaryHazard",
    "hazardousGoodsTransit",
    "emergencyTemperature",
    "flashpointTemperature",
    "additionalTemperature"
})
public class HazardousItemType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "PlacardNotation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PlacardNotationType placardNotation;
    @XmlElement(name = "PlacardEndorsement", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PlacardEndorsementType placardEndorsement;
    @XmlElement(name = "AdditionalInformation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<AdditionalInformationType> additionalInformation;
    @XmlElement(name = "UNDGCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected UNDGCodeType undgCode;
    @XmlElement(name = "EmergencyProceduresCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EmergencyProceduresCodeType emergencyProceduresCode;
    @XmlElement(name = "MedicalFirstAidGuideCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MedicalFirstAidGuideCodeType medicalFirstAidGuideCode;
    @XmlElement(name = "TechnicalName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TechnicalNameType technicalName;
    @XmlElement(name = "CategoryName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CategoryNameType categoryName;
    @XmlElement(name = "HazardousCategoryCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HazardousCategoryCodeType hazardousCategoryCode;
    @XmlElement(name = "UpperOrangeHazardPlacardID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected UpperOrangeHazardPlacardIDType upperOrangeHazardPlacardID;
    @XmlElement(name = "LowerOrangeHazardPlacardID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LowerOrangeHazardPlacardIDType lowerOrangeHazardPlacardID;
    @XmlElement(name = "MarkingID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MarkingIDType markingID;
    @XmlElement(name = "HazardClassID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HazardClassIDType hazardClassID;
    @XmlElement(name = "NetWeightMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NetWeightMeasureType netWeightMeasure;
    @XmlElement(name = "NetVolumeMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NetVolumeMeasureType netVolumeMeasure;
    @XmlElement(name = "Quantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected QuantityType quantity;
    @XmlElement(name = "ContactParty")
    protected PartyType contactParty;
    @XmlElement(name = "SecondaryHazard")
    protected List<SecondaryHazardType> secondaryHazard;
    @XmlElement(name = "HazardousGoodsTransit")
    protected List<HazardousGoodsTransitType> hazardousGoodsTransit;
    @XmlElement(name = "EmergencyTemperature")
    protected TemperatureType emergencyTemperature;
    @XmlElement(name = "FlashpointTemperature")
    protected TemperatureType flashpointTemperature;
    @XmlElement(name = "AdditionalTemperature")
    protected List<TemperatureType> additionalTemperature;

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
     * Recupera il valore della proprietà placardNotation.
     * 
     * @return
     *     possible object is
     *     {@link PlacardNotationType }
     *     
     */
    public PlacardNotationType getPlacardNotation() {
        return placardNotation;
    }

    /**
     * Imposta il valore della proprietà placardNotation.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacardNotationType }
     *     
     */
    public void setPlacardNotation(PlacardNotationType value) {
        this.placardNotation = value;
    }

    /**
     * Recupera il valore della proprietà placardEndorsement.
     * 
     * @return
     *     possible object is
     *     {@link PlacardEndorsementType }
     *     
     */
    public PlacardEndorsementType getPlacardEndorsement() {
        return placardEndorsement;
    }

    /**
     * Imposta il valore della proprietà placardEndorsement.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacardEndorsementType }
     *     
     */
    public void setPlacardEndorsement(PlacardEndorsementType value) {
        this.placardEndorsement = value;
    }

    /**
     * Gets the value of the additionalInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformationType }
     * 
     * 
     */
    public List<AdditionalInformationType> getAdditionalInformation() {
        if (additionalInformation == null) {
            additionalInformation = new ArrayList<AdditionalInformationType>();
        }
        return this.additionalInformation;
    }

    /**
     * Recupera il valore della proprietà undgCode.
     * 
     * @return
     *     possible object is
     *     {@link UNDGCodeType }
     *     
     */
    public UNDGCodeType getUNDGCode() {
        return undgCode;
    }

    /**
     * Imposta il valore della proprietà undgCode.
     * 
     * @param value
     *     allowed object is
     *     {@link UNDGCodeType }
     *     
     */
    public void setUNDGCode(UNDGCodeType value) {
        this.undgCode = value;
    }

    /**
     * Recupera il valore della proprietà emergencyProceduresCode.
     * 
     * @return
     *     possible object is
     *     {@link EmergencyProceduresCodeType }
     *     
     */
    public EmergencyProceduresCodeType getEmergencyProceduresCode() {
        return emergencyProceduresCode;
    }

    /**
     * Imposta il valore della proprietà emergencyProceduresCode.
     * 
     * @param value
     *     allowed object is
     *     {@link EmergencyProceduresCodeType }
     *     
     */
    public void setEmergencyProceduresCode(EmergencyProceduresCodeType value) {
        this.emergencyProceduresCode = value;
    }

    /**
     * Recupera il valore della proprietà medicalFirstAidGuideCode.
     * 
     * @return
     *     possible object is
     *     {@link MedicalFirstAidGuideCodeType }
     *     
     */
    public MedicalFirstAidGuideCodeType getMedicalFirstAidGuideCode() {
        return medicalFirstAidGuideCode;
    }

    /**
     * Imposta il valore della proprietà medicalFirstAidGuideCode.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicalFirstAidGuideCodeType }
     *     
     */
    public void setMedicalFirstAidGuideCode(MedicalFirstAidGuideCodeType value) {
        this.medicalFirstAidGuideCode = value;
    }

    /**
     * Recupera il valore della proprietà technicalName.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalNameType }
     *     
     */
    public TechnicalNameType getTechnicalName() {
        return technicalName;
    }

    /**
     * Imposta il valore della proprietà technicalName.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalNameType }
     *     
     */
    public void setTechnicalName(TechnicalNameType value) {
        this.technicalName = value;
    }

    /**
     * Recupera il valore della proprietà categoryName.
     * 
     * @return
     *     possible object is
     *     {@link CategoryNameType }
     *     
     */
    public CategoryNameType getCategoryName() {
        return categoryName;
    }

    /**
     * Imposta il valore della proprietà categoryName.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryNameType }
     *     
     */
    public void setCategoryName(CategoryNameType value) {
        this.categoryName = value;
    }

    /**
     * Recupera il valore della proprietà hazardousCategoryCode.
     * 
     * @return
     *     possible object is
     *     {@link HazardousCategoryCodeType }
     *     
     */
    public HazardousCategoryCodeType getHazardousCategoryCode() {
        return hazardousCategoryCode;
    }

    /**
     * Imposta il valore della proprietà hazardousCategoryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousCategoryCodeType }
     *     
     */
    public void setHazardousCategoryCode(HazardousCategoryCodeType value) {
        this.hazardousCategoryCode = value;
    }

    /**
     * Recupera il valore della proprietà upperOrangeHazardPlacardID.
     * 
     * @return
     *     possible object is
     *     {@link UpperOrangeHazardPlacardIDType }
     *     
     */
    public UpperOrangeHazardPlacardIDType getUpperOrangeHazardPlacardID() {
        return upperOrangeHazardPlacardID;
    }

    /**
     * Imposta il valore della proprietà upperOrangeHazardPlacardID.
     * 
     * @param value
     *     allowed object is
     *     {@link UpperOrangeHazardPlacardIDType }
     *     
     */
    public void setUpperOrangeHazardPlacardID(UpperOrangeHazardPlacardIDType value) {
        this.upperOrangeHazardPlacardID = value;
    }

    /**
     * Recupera il valore della proprietà lowerOrangeHazardPlacardID.
     * 
     * @return
     *     possible object is
     *     {@link LowerOrangeHazardPlacardIDType }
     *     
     */
    public LowerOrangeHazardPlacardIDType getLowerOrangeHazardPlacardID() {
        return lowerOrangeHazardPlacardID;
    }

    /**
     * Imposta il valore della proprietà lowerOrangeHazardPlacardID.
     * 
     * @param value
     *     allowed object is
     *     {@link LowerOrangeHazardPlacardIDType }
     *     
     */
    public void setLowerOrangeHazardPlacardID(LowerOrangeHazardPlacardIDType value) {
        this.lowerOrangeHazardPlacardID = value;
    }

    /**
     * Recupera il valore della proprietà markingID.
     * 
     * @return
     *     possible object is
     *     {@link MarkingIDType }
     *     
     */
    public MarkingIDType getMarkingID() {
        return markingID;
    }

    /**
     * Imposta il valore della proprietà markingID.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkingIDType }
     *     
     */
    public void setMarkingID(MarkingIDType value) {
        this.markingID = value;
    }

    /**
     * Recupera il valore della proprietà hazardClassID.
     * 
     * @return
     *     possible object is
     *     {@link HazardClassIDType }
     *     
     */
    public HazardClassIDType getHazardClassID() {
        return hazardClassID;
    }

    /**
     * Imposta il valore della proprietà hazardClassID.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardClassIDType }
     *     
     */
    public void setHazardClassID(HazardClassIDType value) {
        this.hazardClassID = value;
    }

    /**
     * Recupera il valore della proprietà netWeightMeasure.
     * 
     * @return
     *     possible object is
     *     {@link NetWeightMeasureType }
     *     
     */
    public NetWeightMeasureType getNetWeightMeasure() {
        return netWeightMeasure;
    }

    /**
     * Imposta il valore della proprietà netWeightMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link NetWeightMeasureType }
     *     
     */
    public void setNetWeightMeasure(NetWeightMeasureType value) {
        this.netWeightMeasure = value;
    }

    /**
     * Recupera il valore della proprietà netVolumeMeasure.
     * 
     * @return
     *     possible object is
     *     {@link NetVolumeMeasureType }
     *     
     */
    public NetVolumeMeasureType getNetVolumeMeasure() {
        return netVolumeMeasure;
    }

    /**
     * Imposta il valore della proprietà netVolumeMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link NetVolumeMeasureType }
     *     
     */
    public void setNetVolumeMeasure(NetVolumeMeasureType value) {
        this.netVolumeMeasure = value;
    }

    /**
     * Recupera il valore della proprietà quantity.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getQuantity() {
        return quantity;
    }

    /**
     * Imposta il valore della proprietà quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setQuantity(QuantityType value) {
        this.quantity = value;
    }

    /**
     * Recupera il valore della proprietà contactParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getContactParty() {
        return contactParty;
    }

    /**
     * Imposta il valore della proprietà contactParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setContactParty(PartyType value) {
        this.contactParty = value;
    }

    /**
     * Gets the value of the secondaryHazard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondaryHazard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondaryHazard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecondaryHazardType }
     * 
     * 
     */
    public List<SecondaryHazardType> getSecondaryHazard() {
        if (secondaryHazard == null) {
            secondaryHazard = new ArrayList<SecondaryHazardType>();
        }
        return this.secondaryHazard;
    }

    /**
     * Gets the value of the hazardousGoodsTransit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazardousGoodsTransit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazardousGoodsTransit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HazardousGoodsTransitType }
     * 
     * 
     */
    public List<HazardousGoodsTransitType> getHazardousGoodsTransit() {
        if (hazardousGoodsTransit == null) {
            hazardousGoodsTransit = new ArrayList<HazardousGoodsTransitType>();
        }
        return this.hazardousGoodsTransit;
    }

    /**
     * Recupera il valore della proprietà emergencyTemperature.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureType }
     *     
     */
    public TemperatureType getEmergencyTemperature() {
        return emergencyTemperature;
    }

    /**
     * Imposta il valore della proprietà emergencyTemperature.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureType }
     *     
     */
    public void setEmergencyTemperature(TemperatureType value) {
        this.emergencyTemperature = value;
    }

    /**
     * Recupera il valore della proprietà flashpointTemperature.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureType }
     *     
     */
    public TemperatureType getFlashpointTemperature() {
        return flashpointTemperature;
    }

    /**
     * Imposta il valore della proprietà flashpointTemperature.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureType }
     *     
     */
    public void setFlashpointTemperature(TemperatureType value) {
        this.flashpointTemperature = value;
    }

    /**
     * Gets the value of the additionalTemperature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalTemperature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalTemperature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemperatureType }
     * 
     * 
     */
    public List<TemperatureType> getAdditionalTemperature() {
        if (additionalTemperature == null) {
            additionalTemperature = new ArrayList<TemperatureType>();
        }
        return this.additionalTemperature;
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
            PlacardNotationType thePlacardNotation;
            thePlacardNotation = this.getPlacardNotation();
            strategy.appendField(locator, this, "placardNotation", buffer, thePlacardNotation, (this.placardNotation!= null));
        }
        {
            PlacardEndorsementType thePlacardEndorsement;
            thePlacardEndorsement = this.getPlacardEndorsement();
            strategy.appendField(locator, this, "placardEndorsement", buffer, thePlacardEndorsement, (this.placardEndorsement!= null));
        }
        {
            List<AdditionalInformationType> theAdditionalInformation;
            theAdditionalInformation = (((this.additionalInformation!= null)&&(!this.additionalInformation.isEmpty()))?this.getAdditionalInformation():null);
            strategy.appendField(locator, this, "additionalInformation", buffer, theAdditionalInformation, ((this.additionalInformation!= null)&&(!this.additionalInformation.isEmpty())));
        }
        {
            UNDGCodeType theUNDGCode;
            theUNDGCode = this.getUNDGCode();
            strategy.appendField(locator, this, "undgCode", buffer, theUNDGCode, (this.undgCode!= null));
        }
        {
            EmergencyProceduresCodeType theEmergencyProceduresCode;
            theEmergencyProceduresCode = this.getEmergencyProceduresCode();
            strategy.appendField(locator, this, "emergencyProceduresCode", buffer, theEmergencyProceduresCode, (this.emergencyProceduresCode!= null));
        }
        {
            MedicalFirstAidGuideCodeType theMedicalFirstAidGuideCode;
            theMedicalFirstAidGuideCode = this.getMedicalFirstAidGuideCode();
            strategy.appendField(locator, this, "medicalFirstAidGuideCode", buffer, theMedicalFirstAidGuideCode, (this.medicalFirstAidGuideCode!= null));
        }
        {
            TechnicalNameType theTechnicalName;
            theTechnicalName = this.getTechnicalName();
            strategy.appendField(locator, this, "technicalName", buffer, theTechnicalName, (this.technicalName!= null));
        }
        {
            CategoryNameType theCategoryName;
            theCategoryName = this.getCategoryName();
            strategy.appendField(locator, this, "categoryName", buffer, theCategoryName, (this.categoryName!= null));
        }
        {
            HazardousCategoryCodeType theHazardousCategoryCode;
            theHazardousCategoryCode = this.getHazardousCategoryCode();
            strategy.appendField(locator, this, "hazardousCategoryCode", buffer, theHazardousCategoryCode, (this.hazardousCategoryCode!= null));
        }
        {
            UpperOrangeHazardPlacardIDType theUpperOrangeHazardPlacardID;
            theUpperOrangeHazardPlacardID = this.getUpperOrangeHazardPlacardID();
            strategy.appendField(locator, this, "upperOrangeHazardPlacardID", buffer, theUpperOrangeHazardPlacardID, (this.upperOrangeHazardPlacardID!= null));
        }
        {
            LowerOrangeHazardPlacardIDType theLowerOrangeHazardPlacardID;
            theLowerOrangeHazardPlacardID = this.getLowerOrangeHazardPlacardID();
            strategy.appendField(locator, this, "lowerOrangeHazardPlacardID", buffer, theLowerOrangeHazardPlacardID, (this.lowerOrangeHazardPlacardID!= null));
        }
        {
            MarkingIDType theMarkingID;
            theMarkingID = this.getMarkingID();
            strategy.appendField(locator, this, "markingID", buffer, theMarkingID, (this.markingID!= null));
        }
        {
            HazardClassIDType theHazardClassID;
            theHazardClassID = this.getHazardClassID();
            strategy.appendField(locator, this, "hazardClassID", buffer, theHazardClassID, (this.hazardClassID!= null));
        }
        {
            NetWeightMeasureType theNetWeightMeasure;
            theNetWeightMeasure = this.getNetWeightMeasure();
            strategy.appendField(locator, this, "netWeightMeasure", buffer, theNetWeightMeasure, (this.netWeightMeasure!= null));
        }
        {
            NetVolumeMeasureType theNetVolumeMeasure;
            theNetVolumeMeasure = this.getNetVolumeMeasure();
            strategy.appendField(locator, this, "netVolumeMeasure", buffer, theNetVolumeMeasure, (this.netVolumeMeasure!= null));
        }
        {
            QuantityType theQuantity;
            theQuantity = this.getQuantity();
            strategy.appendField(locator, this, "quantity", buffer, theQuantity, (this.quantity!= null));
        }
        {
            PartyType theContactParty;
            theContactParty = this.getContactParty();
            strategy.appendField(locator, this, "contactParty", buffer, theContactParty, (this.contactParty!= null));
        }
        {
            List<SecondaryHazardType> theSecondaryHazard;
            theSecondaryHazard = (((this.secondaryHazard!= null)&&(!this.secondaryHazard.isEmpty()))?this.getSecondaryHazard():null);
            strategy.appendField(locator, this, "secondaryHazard", buffer, theSecondaryHazard, ((this.secondaryHazard!= null)&&(!this.secondaryHazard.isEmpty())));
        }
        {
            List<HazardousGoodsTransitType> theHazardousGoodsTransit;
            theHazardousGoodsTransit = (((this.hazardousGoodsTransit!= null)&&(!this.hazardousGoodsTransit.isEmpty()))?this.getHazardousGoodsTransit():null);
            strategy.appendField(locator, this, "hazardousGoodsTransit", buffer, theHazardousGoodsTransit, ((this.hazardousGoodsTransit!= null)&&(!this.hazardousGoodsTransit.isEmpty())));
        }
        {
            TemperatureType theEmergencyTemperature;
            theEmergencyTemperature = this.getEmergencyTemperature();
            strategy.appendField(locator, this, "emergencyTemperature", buffer, theEmergencyTemperature, (this.emergencyTemperature!= null));
        }
        {
            TemperatureType theFlashpointTemperature;
            theFlashpointTemperature = this.getFlashpointTemperature();
            strategy.appendField(locator, this, "flashpointTemperature", buffer, theFlashpointTemperature, (this.flashpointTemperature!= null));
        }
        {
            List<TemperatureType> theAdditionalTemperature;
            theAdditionalTemperature = (((this.additionalTemperature!= null)&&(!this.additionalTemperature.isEmpty()))?this.getAdditionalTemperature():null);
            strategy.appendField(locator, this, "additionalTemperature", buffer, theAdditionalTemperature, ((this.additionalTemperature!= null)&&(!this.additionalTemperature.isEmpty())));
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
        final HazardousItemType that = ((HazardousItemType) object);
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
            PlacardNotationType lhsPlacardNotation;
            lhsPlacardNotation = this.getPlacardNotation();
            PlacardNotationType rhsPlacardNotation;
            rhsPlacardNotation = that.getPlacardNotation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "placardNotation", lhsPlacardNotation), LocatorUtils.property(thatLocator, "placardNotation", rhsPlacardNotation), lhsPlacardNotation, rhsPlacardNotation, (this.placardNotation!= null), (that.placardNotation!= null))) {
                return false;
            }
        }
        {
            PlacardEndorsementType lhsPlacardEndorsement;
            lhsPlacardEndorsement = this.getPlacardEndorsement();
            PlacardEndorsementType rhsPlacardEndorsement;
            rhsPlacardEndorsement = that.getPlacardEndorsement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "placardEndorsement", lhsPlacardEndorsement), LocatorUtils.property(thatLocator, "placardEndorsement", rhsPlacardEndorsement), lhsPlacardEndorsement, rhsPlacardEndorsement, (this.placardEndorsement!= null), (that.placardEndorsement!= null))) {
                return false;
            }
        }
        {
            List<AdditionalInformationType> lhsAdditionalInformation;
            lhsAdditionalInformation = (((this.additionalInformation!= null)&&(!this.additionalInformation.isEmpty()))?this.getAdditionalInformation():null);
            List<AdditionalInformationType> rhsAdditionalInformation;
            rhsAdditionalInformation = (((that.additionalInformation!= null)&&(!that.additionalInformation.isEmpty()))?that.getAdditionalInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "additionalInformation", lhsAdditionalInformation), LocatorUtils.property(thatLocator, "additionalInformation", rhsAdditionalInformation), lhsAdditionalInformation, rhsAdditionalInformation, ((this.additionalInformation!= null)&&(!this.additionalInformation.isEmpty())), ((that.additionalInformation!= null)&&(!that.additionalInformation.isEmpty())))) {
                return false;
            }
        }
        {
            UNDGCodeType lhsUNDGCode;
            lhsUNDGCode = this.getUNDGCode();
            UNDGCodeType rhsUNDGCode;
            rhsUNDGCode = that.getUNDGCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "undgCode", lhsUNDGCode), LocatorUtils.property(thatLocator, "undgCode", rhsUNDGCode), lhsUNDGCode, rhsUNDGCode, (this.undgCode!= null), (that.undgCode!= null))) {
                return false;
            }
        }
        {
            EmergencyProceduresCodeType lhsEmergencyProceduresCode;
            lhsEmergencyProceduresCode = this.getEmergencyProceduresCode();
            EmergencyProceduresCodeType rhsEmergencyProceduresCode;
            rhsEmergencyProceduresCode = that.getEmergencyProceduresCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "emergencyProceduresCode", lhsEmergencyProceduresCode), LocatorUtils.property(thatLocator, "emergencyProceduresCode", rhsEmergencyProceduresCode), lhsEmergencyProceduresCode, rhsEmergencyProceduresCode, (this.emergencyProceduresCode!= null), (that.emergencyProceduresCode!= null))) {
                return false;
            }
        }
        {
            MedicalFirstAidGuideCodeType lhsMedicalFirstAidGuideCode;
            lhsMedicalFirstAidGuideCode = this.getMedicalFirstAidGuideCode();
            MedicalFirstAidGuideCodeType rhsMedicalFirstAidGuideCode;
            rhsMedicalFirstAidGuideCode = that.getMedicalFirstAidGuideCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "medicalFirstAidGuideCode", lhsMedicalFirstAidGuideCode), LocatorUtils.property(thatLocator, "medicalFirstAidGuideCode", rhsMedicalFirstAidGuideCode), lhsMedicalFirstAidGuideCode, rhsMedicalFirstAidGuideCode, (this.medicalFirstAidGuideCode!= null), (that.medicalFirstAidGuideCode!= null))) {
                return false;
            }
        }
        {
            TechnicalNameType lhsTechnicalName;
            lhsTechnicalName = this.getTechnicalName();
            TechnicalNameType rhsTechnicalName;
            rhsTechnicalName = that.getTechnicalName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "technicalName", lhsTechnicalName), LocatorUtils.property(thatLocator, "technicalName", rhsTechnicalName), lhsTechnicalName, rhsTechnicalName, (this.technicalName!= null), (that.technicalName!= null))) {
                return false;
            }
        }
        {
            CategoryNameType lhsCategoryName;
            lhsCategoryName = this.getCategoryName();
            CategoryNameType rhsCategoryName;
            rhsCategoryName = that.getCategoryName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "categoryName", lhsCategoryName), LocatorUtils.property(thatLocator, "categoryName", rhsCategoryName), lhsCategoryName, rhsCategoryName, (this.categoryName!= null), (that.categoryName!= null))) {
                return false;
            }
        }
        {
            HazardousCategoryCodeType lhsHazardousCategoryCode;
            lhsHazardousCategoryCode = this.getHazardousCategoryCode();
            HazardousCategoryCodeType rhsHazardousCategoryCode;
            rhsHazardousCategoryCode = that.getHazardousCategoryCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hazardousCategoryCode", lhsHazardousCategoryCode), LocatorUtils.property(thatLocator, "hazardousCategoryCode", rhsHazardousCategoryCode), lhsHazardousCategoryCode, rhsHazardousCategoryCode, (this.hazardousCategoryCode!= null), (that.hazardousCategoryCode!= null))) {
                return false;
            }
        }
        {
            UpperOrangeHazardPlacardIDType lhsUpperOrangeHazardPlacardID;
            lhsUpperOrangeHazardPlacardID = this.getUpperOrangeHazardPlacardID();
            UpperOrangeHazardPlacardIDType rhsUpperOrangeHazardPlacardID;
            rhsUpperOrangeHazardPlacardID = that.getUpperOrangeHazardPlacardID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "upperOrangeHazardPlacardID", lhsUpperOrangeHazardPlacardID), LocatorUtils.property(thatLocator, "upperOrangeHazardPlacardID", rhsUpperOrangeHazardPlacardID), lhsUpperOrangeHazardPlacardID, rhsUpperOrangeHazardPlacardID, (this.upperOrangeHazardPlacardID!= null), (that.upperOrangeHazardPlacardID!= null))) {
                return false;
            }
        }
        {
            LowerOrangeHazardPlacardIDType lhsLowerOrangeHazardPlacardID;
            lhsLowerOrangeHazardPlacardID = this.getLowerOrangeHazardPlacardID();
            LowerOrangeHazardPlacardIDType rhsLowerOrangeHazardPlacardID;
            rhsLowerOrangeHazardPlacardID = that.getLowerOrangeHazardPlacardID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lowerOrangeHazardPlacardID", lhsLowerOrangeHazardPlacardID), LocatorUtils.property(thatLocator, "lowerOrangeHazardPlacardID", rhsLowerOrangeHazardPlacardID), lhsLowerOrangeHazardPlacardID, rhsLowerOrangeHazardPlacardID, (this.lowerOrangeHazardPlacardID!= null), (that.lowerOrangeHazardPlacardID!= null))) {
                return false;
            }
        }
        {
            MarkingIDType lhsMarkingID;
            lhsMarkingID = this.getMarkingID();
            MarkingIDType rhsMarkingID;
            rhsMarkingID = that.getMarkingID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "markingID", lhsMarkingID), LocatorUtils.property(thatLocator, "markingID", rhsMarkingID), lhsMarkingID, rhsMarkingID, (this.markingID!= null), (that.markingID!= null))) {
                return false;
            }
        }
        {
            HazardClassIDType lhsHazardClassID;
            lhsHazardClassID = this.getHazardClassID();
            HazardClassIDType rhsHazardClassID;
            rhsHazardClassID = that.getHazardClassID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hazardClassID", lhsHazardClassID), LocatorUtils.property(thatLocator, "hazardClassID", rhsHazardClassID), lhsHazardClassID, rhsHazardClassID, (this.hazardClassID!= null), (that.hazardClassID!= null))) {
                return false;
            }
        }
        {
            NetWeightMeasureType lhsNetWeightMeasure;
            lhsNetWeightMeasure = this.getNetWeightMeasure();
            NetWeightMeasureType rhsNetWeightMeasure;
            rhsNetWeightMeasure = that.getNetWeightMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "netWeightMeasure", lhsNetWeightMeasure), LocatorUtils.property(thatLocator, "netWeightMeasure", rhsNetWeightMeasure), lhsNetWeightMeasure, rhsNetWeightMeasure, (this.netWeightMeasure!= null), (that.netWeightMeasure!= null))) {
                return false;
            }
        }
        {
            NetVolumeMeasureType lhsNetVolumeMeasure;
            lhsNetVolumeMeasure = this.getNetVolumeMeasure();
            NetVolumeMeasureType rhsNetVolumeMeasure;
            rhsNetVolumeMeasure = that.getNetVolumeMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "netVolumeMeasure", lhsNetVolumeMeasure), LocatorUtils.property(thatLocator, "netVolumeMeasure", rhsNetVolumeMeasure), lhsNetVolumeMeasure, rhsNetVolumeMeasure, (this.netVolumeMeasure!= null), (that.netVolumeMeasure!= null))) {
                return false;
            }
        }
        {
            QuantityType lhsQuantity;
            lhsQuantity = this.getQuantity();
            QuantityType rhsQuantity;
            rhsQuantity = that.getQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantity", lhsQuantity), LocatorUtils.property(thatLocator, "quantity", rhsQuantity), lhsQuantity, rhsQuantity, (this.quantity!= null), (that.quantity!= null))) {
                return false;
            }
        }
        {
            PartyType lhsContactParty;
            lhsContactParty = this.getContactParty();
            PartyType rhsContactParty;
            rhsContactParty = that.getContactParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contactParty", lhsContactParty), LocatorUtils.property(thatLocator, "contactParty", rhsContactParty), lhsContactParty, rhsContactParty, (this.contactParty!= null), (that.contactParty!= null))) {
                return false;
            }
        }
        {
            List<SecondaryHazardType> lhsSecondaryHazard;
            lhsSecondaryHazard = (((this.secondaryHazard!= null)&&(!this.secondaryHazard.isEmpty()))?this.getSecondaryHazard():null);
            List<SecondaryHazardType> rhsSecondaryHazard;
            rhsSecondaryHazard = (((that.secondaryHazard!= null)&&(!that.secondaryHazard.isEmpty()))?that.getSecondaryHazard():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "secondaryHazard", lhsSecondaryHazard), LocatorUtils.property(thatLocator, "secondaryHazard", rhsSecondaryHazard), lhsSecondaryHazard, rhsSecondaryHazard, ((this.secondaryHazard!= null)&&(!this.secondaryHazard.isEmpty())), ((that.secondaryHazard!= null)&&(!that.secondaryHazard.isEmpty())))) {
                return false;
            }
        }
        {
            List<HazardousGoodsTransitType> lhsHazardousGoodsTransit;
            lhsHazardousGoodsTransit = (((this.hazardousGoodsTransit!= null)&&(!this.hazardousGoodsTransit.isEmpty()))?this.getHazardousGoodsTransit():null);
            List<HazardousGoodsTransitType> rhsHazardousGoodsTransit;
            rhsHazardousGoodsTransit = (((that.hazardousGoodsTransit!= null)&&(!that.hazardousGoodsTransit.isEmpty()))?that.getHazardousGoodsTransit():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hazardousGoodsTransit", lhsHazardousGoodsTransit), LocatorUtils.property(thatLocator, "hazardousGoodsTransit", rhsHazardousGoodsTransit), lhsHazardousGoodsTransit, rhsHazardousGoodsTransit, ((this.hazardousGoodsTransit!= null)&&(!this.hazardousGoodsTransit.isEmpty())), ((that.hazardousGoodsTransit!= null)&&(!that.hazardousGoodsTransit.isEmpty())))) {
                return false;
            }
        }
        {
            TemperatureType lhsEmergencyTemperature;
            lhsEmergencyTemperature = this.getEmergencyTemperature();
            TemperatureType rhsEmergencyTemperature;
            rhsEmergencyTemperature = that.getEmergencyTemperature();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "emergencyTemperature", lhsEmergencyTemperature), LocatorUtils.property(thatLocator, "emergencyTemperature", rhsEmergencyTemperature), lhsEmergencyTemperature, rhsEmergencyTemperature, (this.emergencyTemperature!= null), (that.emergencyTemperature!= null))) {
                return false;
            }
        }
        {
            TemperatureType lhsFlashpointTemperature;
            lhsFlashpointTemperature = this.getFlashpointTemperature();
            TemperatureType rhsFlashpointTemperature;
            rhsFlashpointTemperature = that.getFlashpointTemperature();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flashpointTemperature", lhsFlashpointTemperature), LocatorUtils.property(thatLocator, "flashpointTemperature", rhsFlashpointTemperature), lhsFlashpointTemperature, rhsFlashpointTemperature, (this.flashpointTemperature!= null), (that.flashpointTemperature!= null))) {
                return false;
            }
        }
        {
            List<TemperatureType> lhsAdditionalTemperature;
            lhsAdditionalTemperature = (((this.additionalTemperature!= null)&&(!this.additionalTemperature.isEmpty()))?this.getAdditionalTemperature():null);
            List<TemperatureType> rhsAdditionalTemperature;
            rhsAdditionalTemperature = (((that.additionalTemperature!= null)&&(!that.additionalTemperature.isEmpty()))?that.getAdditionalTemperature():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "additionalTemperature", lhsAdditionalTemperature), LocatorUtils.property(thatLocator, "additionalTemperature", rhsAdditionalTemperature), lhsAdditionalTemperature, rhsAdditionalTemperature, ((this.additionalTemperature!= null)&&(!this.additionalTemperature.isEmpty())), ((that.additionalTemperature!= null)&&(!that.additionalTemperature.isEmpty())))) {
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
            PlacardNotationType thePlacardNotation;
            thePlacardNotation = this.getPlacardNotation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "placardNotation", thePlacardNotation), currentHashCode, thePlacardNotation, (this.placardNotation!= null));
        }
        {
            PlacardEndorsementType thePlacardEndorsement;
            thePlacardEndorsement = this.getPlacardEndorsement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "placardEndorsement", thePlacardEndorsement), currentHashCode, thePlacardEndorsement, (this.placardEndorsement!= null));
        }
        {
            List<AdditionalInformationType> theAdditionalInformation;
            theAdditionalInformation = (((this.additionalInformation!= null)&&(!this.additionalInformation.isEmpty()))?this.getAdditionalInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "additionalInformation", theAdditionalInformation), currentHashCode, theAdditionalInformation, ((this.additionalInformation!= null)&&(!this.additionalInformation.isEmpty())));
        }
        {
            UNDGCodeType theUNDGCode;
            theUNDGCode = this.getUNDGCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "undgCode", theUNDGCode), currentHashCode, theUNDGCode, (this.undgCode!= null));
        }
        {
            EmergencyProceduresCodeType theEmergencyProceduresCode;
            theEmergencyProceduresCode = this.getEmergencyProceduresCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "emergencyProceduresCode", theEmergencyProceduresCode), currentHashCode, theEmergencyProceduresCode, (this.emergencyProceduresCode!= null));
        }
        {
            MedicalFirstAidGuideCodeType theMedicalFirstAidGuideCode;
            theMedicalFirstAidGuideCode = this.getMedicalFirstAidGuideCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "medicalFirstAidGuideCode", theMedicalFirstAidGuideCode), currentHashCode, theMedicalFirstAidGuideCode, (this.medicalFirstAidGuideCode!= null));
        }
        {
            TechnicalNameType theTechnicalName;
            theTechnicalName = this.getTechnicalName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "technicalName", theTechnicalName), currentHashCode, theTechnicalName, (this.technicalName!= null));
        }
        {
            CategoryNameType theCategoryName;
            theCategoryName = this.getCategoryName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "categoryName", theCategoryName), currentHashCode, theCategoryName, (this.categoryName!= null));
        }
        {
            HazardousCategoryCodeType theHazardousCategoryCode;
            theHazardousCategoryCode = this.getHazardousCategoryCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hazardousCategoryCode", theHazardousCategoryCode), currentHashCode, theHazardousCategoryCode, (this.hazardousCategoryCode!= null));
        }
        {
            UpperOrangeHazardPlacardIDType theUpperOrangeHazardPlacardID;
            theUpperOrangeHazardPlacardID = this.getUpperOrangeHazardPlacardID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "upperOrangeHazardPlacardID", theUpperOrangeHazardPlacardID), currentHashCode, theUpperOrangeHazardPlacardID, (this.upperOrangeHazardPlacardID!= null));
        }
        {
            LowerOrangeHazardPlacardIDType theLowerOrangeHazardPlacardID;
            theLowerOrangeHazardPlacardID = this.getLowerOrangeHazardPlacardID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lowerOrangeHazardPlacardID", theLowerOrangeHazardPlacardID), currentHashCode, theLowerOrangeHazardPlacardID, (this.lowerOrangeHazardPlacardID!= null));
        }
        {
            MarkingIDType theMarkingID;
            theMarkingID = this.getMarkingID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "markingID", theMarkingID), currentHashCode, theMarkingID, (this.markingID!= null));
        }
        {
            HazardClassIDType theHazardClassID;
            theHazardClassID = this.getHazardClassID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hazardClassID", theHazardClassID), currentHashCode, theHazardClassID, (this.hazardClassID!= null));
        }
        {
            NetWeightMeasureType theNetWeightMeasure;
            theNetWeightMeasure = this.getNetWeightMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "netWeightMeasure", theNetWeightMeasure), currentHashCode, theNetWeightMeasure, (this.netWeightMeasure!= null));
        }
        {
            NetVolumeMeasureType theNetVolumeMeasure;
            theNetVolumeMeasure = this.getNetVolumeMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "netVolumeMeasure", theNetVolumeMeasure), currentHashCode, theNetVolumeMeasure, (this.netVolumeMeasure!= null));
        }
        {
            QuantityType theQuantity;
            theQuantity = this.getQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantity", theQuantity), currentHashCode, theQuantity, (this.quantity!= null));
        }
        {
            PartyType theContactParty;
            theContactParty = this.getContactParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contactParty", theContactParty), currentHashCode, theContactParty, (this.contactParty!= null));
        }
        {
            List<SecondaryHazardType> theSecondaryHazard;
            theSecondaryHazard = (((this.secondaryHazard!= null)&&(!this.secondaryHazard.isEmpty()))?this.getSecondaryHazard():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "secondaryHazard", theSecondaryHazard), currentHashCode, theSecondaryHazard, ((this.secondaryHazard!= null)&&(!this.secondaryHazard.isEmpty())));
        }
        {
            List<HazardousGoodsTransitType> theHazardousGoodsTransit;
            theHazardousGoodsTransit = (((this.hazardousGoodsTransit!= null)&&(!this.hazardousGoodsTransit.isEmpty()))?this.getHazardousGoodsTransit():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hazardousGoodsTransit", theHazardousGoodsTransit), currentHashCode, theHazardousGoodsTransit, ((this.hazardousGoodsTransit!= null)&&(!this.hazardousGoodsTransit.isEmpty())));
        }
        {
            TemperatureType theEmergencyTemperature;
            theEmergencyTemperature = this.getEmergencyTemperature();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "emergencyTemperature", theEmergencyTemperature), currentHashCode, theEmergencyTemperature, (this.emergencyTemperature!= null));
        }
        {
            TemperatureType theFlashpointTemperature;
            theFlashpointTemperature = this.getFlashpointTemperature();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "flashpointTemperature", theFlashpointTemperature), currentHashCode, theFlashpointTemperature, (this.flashpointTemperature!= null));
        }
        {
            List<TemperatureType> theAdditionalTemperature;
            theAdditionalTemperature = (((this.additionalTemperature!= null)&&(!this.additionalTemperature.isEmpty()))?this.getAdditionalTemperature():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "additionalTemperature", theAdditionalTemperature), currentHashCode, theAdditionalTemperature, ((this.additionalTemperature!= null)&&(!this.additionalTemperature.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
