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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CardinalityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CertificationLevelDescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CopyQualityTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExpectedAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExpectedCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExpectedDescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExpectedIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExpectedValueNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MaximumAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MaximumValueNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MinimumAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MinimumValueNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TranslationTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValueCurrencyCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValueDataTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValueUnitCodeType;
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
 * <p>Classe Java per TenderingCriterionPropertyType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TenderingCriterionPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Cardinality" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValueDataTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValueUnitCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValueCurrencyCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResponseCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExpectedAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExpectedID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExpectedCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExpectedValueNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExpectedDescription" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumValueNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumValueNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TranslationTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CertificationLevelDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CopyQualityTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ApplicablePeriod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TemplateEvidence" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenderingCriterionPropertyType", propOrder = {
    "id",
    "name",
    "description",
    "cardinality",
    "typeCode",
    "valueDataTypeCode",
    "valueUnitCode",
    "valueCurrencyCode",
    "responseCode",
    "expectedAmount",
    "expectedID",
    "expectedCode",
    "expectedValueNumeric",
    "expectedDescription",
    "maximumAmount",
    "minimumAmount",
    "maximumValueNumeric",
    "minimumValueNumeric",
    "translationTypeCode",
    "certificationLevelDescription",
    "copyQualityTypeCode",
    "applicablePeriod",
    "templateEvidence"
})
public class TenderingCriterionPropertyType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NameType name;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "Cardinality", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CardinalityType cardinality;
    @XmlElement(name = "TypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TypeCodeType typeCode;
    @XmlElement(name = "ValueDataTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValueDataTypeCodeType valueDataTypeCode;
    @XmlElement(name = "ValueUnitCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValueUnitCodeType valueUnitCode;
    @XmlElement(name = "ValueCurrencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValueCurrencyCodeType valueCurrencyCode;
    @XmlElement(name = "ResponseCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ResponseCodeType responseCode;
    @XmlElement(name = "ExpectedAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ExpectedAmountType expectedAmount;
    @XmlElement(name = "ExpectedID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ExpectedIDType expectedID;
    @XmlElement(name = "ExpectedCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ExpectedCodeType expectedCode;
    @XmlElement(name = "ExpectedValueNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ExpectedValueNumericType expectedValueNumeric;
    @XmlElement(name = "ExpectedDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ExpectedDescriptionType expectedDescription;
    @XmlElement(name = "MaximumAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MaximumAmountType maximumAmount;
    @XmlElement(name = "MinimumAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MinimumAmountType minimumAmount;
    @XmlElement(name = "MaximumValueNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MaximumValueNumericType maximumValueNumeric;
    @XmlElement(name = "MinimumValueNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MinimumValueNumericType minimumValueNumeric;
    @XmlElement(name = "TranslationTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TranslationTypeCodeType translationTypeCode;
    @XmlElement(name = "CertificationLevelDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<CertificationLevelDescriptionType> certificationLevelDescription;
    @XmlElement(name = "CopyQualityTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CopyQualityTypeCodeType copyQualityTypeCode;
    @XmlElement(name = "ApplicablePeriod")
    protected List<PeriodType> applicablePeriod;
    @XmlElement(name = "TemplateEvidence")
    protected List<EvidenceType> templateEvidence;

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
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setName(NameType value) {
        this.name = value;
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
     * Recupera il valore della proprietà cardinality.
     * 
     * @return
     *     possible object is
     *     {@link CardinalityType }
     *     
     */
    public CardinalityType getCardinality() {
        return cardinality;
    }

    /**
     * Imposta il valore della proprietà cardinality.
     * 
     * @param value
     *     allowed object is
     *     {@link CardinalityType }
     *     
     */
    public void setCardinality(CardinalityType value) {
        this.cardinality = value;
    }

    /**
     * Recupera il valore della proprietà typeCode.
     * 
     * @return
     *     possible object is
     *     {@link TypeCodeType }
     *     
     */
    public TypeCodeType getTypeCode() {
        return typeCode;
    }

    /**
     * Imposta il valore della proprietà typeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCodeType }
     *     
     */
    public void setTypeCode(TypeCodeType value) {
        this.typeCode = value;
    }

    /**
     * Recupera il valore della proprietà valueDataTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link ValueDataTypeCodeType }
     *     
     */
    public ValueDataTypeCodeType getValueDataTypeCode() {
        return valueDataTypeCode;
    }

    /**
     * Imposta il valore della proprietà valueDataTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueDataTypeCodeType }
     *     
     */
    public void setValueDataTypeCode(ValueDataTypeCodeType value) {
        this.valueDataTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà valueUnitCode.
     * 
     * @return
     *     possible object is
     *     {@link ValueUnitCodeType }
     *     
     */
    public ValueUnitCodeType getValueUnitCode() {
        return valueUnitCode;
    }

    /**
     * Imposta il valore della proprietà valueUnitCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueUnitCodeType }
     *     
     */
    public void setValueUnitCode(ValueUnitCodeType value) {
        this.valueUnitCode = value;
    }

    /**
     * Recupera il valore della proprietà valueCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link ValueCurrencyCodeType }
     *     
     */
    public ValueCurrencyCodeType getValueCurrencyCode() {
        return valueCurrencyCode;
    }

    /**
     * Imposta il valore della proprietà valueCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueCurrencyCodeType }
     *     
     */
    public void setValueCurrencyCode(ValueCurrencyCodeType value) {
        this.valueCurrencyCode = value;
    }

    /**
     * Recupera il valore della proprietà responseCode.
     * 
     * @return
     *     possible object is
     *     {@link ResponseCodeType }
     *     
     */
    public ResponseCodeType getResponseCode() {
        return responseCode;
    }

    /**
     * Imposta il valore della proprietà responseCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseCodeType }
     *     
     */
    public void setResponseCode(ResponseCodeType value) {
        this.responseCode = value;
    }

    /**
     * Recupera il valore della proprietà expectedAmount.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedAmountType }
     *     
     */
    public ExpectedAmountType getExpectedAmount() {
        return expectedAmount;
    }

    /**
     * Imposta il valore della proprietà expectedAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedAmountType }
     *     
     */
    public void setExpectedAmount(ExpectedAmountType value) {
        this.expectedAmount = value;
    }

    /**
     * Recupera il valore della proprietà expectedID.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedIDType }
     *     
     */
    public ExpectedIDType getExpectedID() {
        return expectedID;
    }

    /**
     * Imposta il valore della proprietà expectedID.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedIDType }
     *     
     */
    public void setExpectedID(ExpectedIDType value) {
        this.expectedID = value;
    }

    /**
     * Recupera il valore della proprietà expectedCode.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedCodeType }
     *     
     */
    public ExpectedCodeType getExpectedCode() {
        return expectedCode;
    }

    /**
     * Imposta il valore della proprietà expectedCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedCodeType }
     *     
     */
    public void setExpectedCode(ExpectedCodeType value) {
        this.expectedCode = value;
    }

    /**
     * Recupera il valore della proprietà expectedValueNumeric.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedValueNumericType }
     *     
     */
    public ExpectedValueNumericType getExpectedValueNumeric() {
        return expectedValueNumeric;
    }

    /**
     * Imposta il valore della proprietà expectedValueNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedValueNumericType }
     *     
     */
    public void setExpectedValueNumeric(ExpectedValueNumericType value) {
        this.expectedValueNumeric = value;
    }

    /**
     * Recupera il valore della proprietà expectedDescription.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedDescriptionType }
     *     
     */
    public ExpectedDescriptionType getExpectedDescription() {
        return expectedDescription;
    }

    /**
     * Imposta il valore della proprietà expectedDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedDescriptionType }
     *     
     */
    public void setExpectedDescription(ExpectedDescriptionType value) {
        this.expectedDescription = value;
    }

    /**
     * Recupera il valore della proprietà maximumAmount.
     * 
     * @return
     *     possible object is
     *     {@link MaximumAmountType }
     *     
     */
    public MaximumAmountType getMaximumAmount() {
        return maximumAmount;
    }

    /**
     * Imposta il valore della proprietà maximumAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumAmountType }
     *     
     */
    public void setMaximumAmount(MaximumAmountType value) {
        this.maximumAmount = value;
    }

    /**
     * Recupera il valore della proprietà minimumAmount.
     * 
     * @return
     *     possible object is
     *     {@link MinimumAmountType }
     *     
     */
    public MinimumAmountType getMinimumAmount() {
        return minimumAmount;
    }

    /**
     * Imposta il valore della proprietà minimumAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumAmountType }
     *     
     */
    public void setMinimumAmount(MinimumAmountType value) {
        this.minimumAmount = value;
    }

    /**
     * Recupera il valore della proprietà maximumValueNumeric.
     * 
     * @return
     *     possible object is
     *     {@link MaximumValueNumericType }
     *     
     */
    public MaximumValueNumericType getMaximumValueNumeric() {
        return maximumValueNumeric;
    }

    /**
     * Imposta il valore della proprietà maximumValueNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumValueNumericType }
     *     
     */
    public void setMaximumValueNumeric(MaximumValueNumericType value) {
        this.maximumValueNumeric = value;
    }

    /**
     * Recupera il valore della proprietà minimumValueNumeric.
     * 
     * @return
     *     possible object is
     *     {@link MinimumValueNumericType }
     *     
     */
    public MinimumValueNumericType getMinimumValueNumeric() {
        return minimumValueNumeric;
    }

    /**
     * Imposta il valore della proprietà minimumValueNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumValueNumericType }
     *     
     */
    public void setMinimumValueNumeric(MinimumValueNumericType value) {
        this.minimumValueNumeric = value;
    }

    /**
     * Recupera il valore della proprietà translationTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link TranslationTypeCodeType }
     *     
     */
    public TranslationTypeCodeType getTranslationTypeCode() {
        return translationTypeCode;
    }

    /**
     * Imposta il valore della proprietà translationTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TranslationTypeCodeType }
     *     
     */
    public void setTranslationTypeCode(TranslationTypeCodeType value) {
        this.translationTypeCode = value;
    }

    /**
     * Gets the value of the certificationLevelDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificationLevelDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificationLevelDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertificationLevelDescriptionType }
     * 
     * 
     */
    public List<CertificationLevelDescriptionType> getCertificationLevelDescription() {
        if (certificationLevelDescription == null) {
            certificationLevelDescription = new ArrayList<CertificationLevelDescriptionType>();
        }
        return this.certificationLevelDescription;
    }

    /**
     * Recupera il valore della proprietà copyQualityTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link CopyQualityTypeCodeType }
     *     
     */
    public CopyQualityTypeCodeType getCopyQualityTypeCode() {
        return copyQualityTypeCode;
    }

    /**
     * Imposta il valore della proprietà copyQualityTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyQualityTypeCodeType }
     *     
     */
    public void setCopyQualityTypeCode(CopyQualityTypeCodeType value) {
        this.copyQualityTypeCode = value;
    }

    /**
     * Gets the value of the applicablePeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicablePeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicablePeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodType }
     * 
     * 
     */
    public List<PeriodType> getApplicablePeriod() {
        if (applicablePeriod == null) {
            applicablePeriod = new ArrayList<PeriodType>();
        }
        return this.applicablePeriod;
    }

    /**
     * Gets the value of the templateEvidence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateEvidence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateEvidence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EvidenceType }
     * 
     * 
     */
    public List<EvidenceType> getTemplateEvidence() {
        if (templateEvidence == null) {
            templateEvidence = new ArrayList<EvidenceType>();
        }
        return this.templateEvidence;
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
            NameType theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            CardinalityType theCardinality;
            theCardinality = this.getCardinality();
            strategy.appendField(locator, this, "cardinality", buffer, theCardinality, (this.cardinality!= null));
        }
        {
            TypeCodeType theTypeCode;
            theTypeCode = this.getTypeCode();
            strategy.appendField(locator, this, "typeCode", buffer, theTypeCode, (this.typeCode!= null));
        }
        {
            ValueDataTypeCodeType theValueDataTypeCode;
            theValueDataTypeCode = this.getValueDataTypeCode();
            strategy.appendField(locator, this, "valueDataTypeCode", buffer, theValueDataTypeCode, (this.valueDataTypeCode!= null));
        }
        {
            ValueUnitCodeType theValueUnitCode;
            theValueUnitCode = this.getValueUnitCode();
            strategy.appendField(locator, this, "valueUnitCode", buffer, theValueUnitCode, (this.valueUnitCode!= null));
        }
        {
            ValueCurrencyCodeType theValueCurrencyCode;
            theValueCurrencyCode = this.getValueCurrencyCode();
            strategy.appendField(locator, this, "valueCurrencyCode", buffer, theValueCurrencyCode, (this.valueCurrencyCode!= null));
        }
        {
            ResponseCodeType theResponseCode;
            theResponseCode = this.getResponseCode();
            strategy.appendField(locator, this, "responseCode", buffer, theResponseCode, (this.responseCode!= null));
        }
        {
            ExpectedAmountType theExpectedAmount;
            theExpectedAmount = this.getExpectedAmount();
            strategy.appendField(locator, this, "expectedAmount", buffer, theExpectedAmount, (this.expectedAmount!= null));
        }
        {
            ExpectedIDType theExpectedID;
            theExpectedID = this.getExpectedID();
            strategy.appendField(locator, this, "expectedID", buffer, theExpectedID, (this.expectedID!= null));
        }
        {
            ExpectedCodeType theExpectedCode;
            theExpectedCode = this.getExpectedCode();
            strategy.appendField(locator, this, "expectedCode", buffer, theExpectedCode, (this.expectedCode!= null));
        }
        {
            ExpectedValueNumericType theExpectedValueNumeric;
            theExpectedValueNumeric = this.getExpectedValueNumeric();
            strategy.appendField(locator, this, "expectedValueNumeric", buffer, theExpectedValueNumeric, (this.expectedValueNumeric!= null));
        }
        {
            ExpectedDescriptionType theExpectedDescription;
            theExpectedDescription = this.getExpectedDescription();
            strategy.appendField(locator, this, "expectedDescription", buffer, theExpectedDescription, (this.expectedDescription!= null));
        }
        {
            MaximumAmountType theMaximumAmount;
            theMaximumAmount = this.getMaximumAmount();
            strategy.appendField(locator, this, "maximumAmount", buffer, theMaximumAmount, (this.maximumAmount!= null));
        }
        {
            MinimumAmountType theMinimumAmount;
            theMinimumAmount = this.getMinimumAmount();
            strategy.appendField(locator, this, "minimumAmount", buffer, theMinimumAmount, (this.minimumAmount!= null));
        }
        {
            MaximumValueNumericType theMaximumValueNumeric;
            theMaximumValueNumeric = this.getMaximumValueNumeric();
            strategy.appendField(locator, this, "maximumValueNumeric", buffer, theMaximumValueNumeric, (this.maximumValueNumeric!= null));
        }
        {
            MinimumValueNumericType theMinimumValueNumeric;
            theMinimumValueNumeric = this.getMinimumValueNumeric();
            strategy.appendField(locator, this, "minimumValueNumeric", buffer, theMinimumValueNumeric, (this.minimumValueNumeric!= null));
        }
        {
            TranslationTypeCodeType theTranslationTypeCode;
            theTranslationTypeCode = this.getTranslationTypeCode();
            strategy.appendField(locator, this, "translationTypeCode", buffer, theTranslationTypeCode, (this.translationTypeCode!= null));
        }
        {
            List<CertificationLevelDescriptionType> theCertificationLevelDescription;
            theCertificationLevelDescription = (((this.certificationLevelDescription!= null)&&(!this.certificationLevelDescription.isEmpty()))?this.getCertificationLevelDescription():null);
            strategy.appendField(locator, this, "certificationLevelDescription", buffer, theCertificationLevelDescription, ((this.certificationLevelDescription!= null)&&(!this.certificationLevelDescription.isEmpty())));
        }
        {
            CopyQualityTypeCodeType theCopyQualityTypeCode;
            theCopyQualityTypeCode = this.getCopyQualityTypeCode();
            strategy.appendField(locator, this, "copyQualityTypeCode", buffer, theCopyQualityTypeCode, (this.copyQualityTypeCode!= null));
        }
        {
            List<PeriodType> theApplicablePeriod;
            theApplicablePeriod = (((this.applicablePeriod!= null)&&(!this.applicablePeriod.isEmpty()))?this.getApplicablePeriod():null);
            strategy.appendField(locator, this, "applicablePeriod", buffer, theApplicablePeriod, ((this.applicablePeriod!= null)&&(!this.applicablePeriod.isEmpty())));
        }
        {
            List<EvidenceType> theTemplateEvidence;
            theTemplateEvidence = (((this.templateEvidence!= null)&&(!this.templateEvidence.isEmpty()))?this.getTemplateEvidence():null);
            strategy.appendField(locator, this, "templateEvidence", buffer, theTemplateEvidence, ((this.templateEvidence!= null)&&(!this.templateEvidence.isEmpty())));
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
        final TenderingCriterionPropertyType that = ((TenderingCriterionPropertyType) object);
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
            NameType lhsName;
            lhsName = this.getName();
            NameType rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
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
            CardinalityType lhsCardinality;
            lhsCardinality = this.getCardinality();
            CardinalityType rhsCardinality;
            rhsCardinality = that.getCardinality();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cardinality", lhsCardinality), LocatorUtils.property(thatLocator, "cardinality", rhsCardinality), lhsCardinality, rhsCardinality, (this.cardinality!= null), (that.cardinality!= null))) {
                return false;
            }
        }
        {
            TypeCodeType lhsTypeCode;
            lhsTypeCode = this.getTypeCode();
            TypeCodeType rhsTypeCode;
            rhsTypeCode = that.getTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "typeCode", lhsTypeCode), LocatorUtils.property(thatLocator, "typeCode", rhsTypeCode), lhsTypeCode, rhsTypeCode, (this.typeCode!= null), (that.typeCode!= null))) {
                return false;
            }
        }
        {
            ValueDataTypeCodeType lhsValueDataTypeCode;
            lhsValueDataTypeCode = this.getValueDataTypeCode();
            ValueDataTypeCodeType rhsValueDataTypeCode;
            rhsValueDataTypeCode = that.getValueDataTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "valueDataTypeCode", lhsValueDataTypeCode), LocatorUtils.property(thatLocator, "valueDataTypeCode", rhsValueDataTypeCode), lhsValueDataTypeCode, rhsValueDataTypeCode, (this.valueDataTypeCode!= null), (that.valueDataTypeCode!= null))) {
                return false;
            }
        }
        {
            ValueUnitCodeType lhsValueUnitCode;
            lhsValueUnitCode = this.getValueUnitCode();
            ValueUnitCodeType rhsValueUnitCode;
            rhsValueUnitCode = that.getValueUnitCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "valueUnitCode", lhsValueUnitCode), LocatorUtils.property(thatLocator, "valueUnitCode", rhsValueUnitCode), lhsValueUnitCode, rhsValueUnitCode, (this.valueUnitCode!= null), (that.valueUnitCode!= null))) {
                return false;
            }
        }
        {
            ValueCurrencyCodeType lhsValueCurrencyCode;
            lhsValueCurrencyCode = this.getValueCurrencyCode();
            ValueCurrencyCodeType rhsValueCurrencyCode;
            rhsValueCurrencyCode = that.getValueCurrencyCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "valueCurrencyCode", lhsValueCurrencyCode), LocatorUtils.property(thatLocator, "valueCurrencyCode", rhsValueCurrencyCode), lhsValueCurrencyCode, rhsValueCurrencyCode, (this.valueCurrencyCode!= null), (that.valueCurrencyCode!= null))) {
                return false;
            }
        }
        {
            ResponseCodeType lhsResponseCode;
            lhsResponseCode = this.getResponseCode();
            ResponseCodeType rhsResponseCode;
            rhsResponseCode = that.getResponseCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "responseCode", lhsResponseCode), LocatorUtils.property(thatLocator, "responseCode", rhsResponseCode), lhsResponseCode, rhsResponseCode, (this.responseCode!= null), (that.responseCode!= null))) {
                return false;
            }
        }
        {
            ExpectedAmountType lhsExpectedAmount;
            lhsExpectedAmount = this.getExpectedAmount();
            ExpectedAmountType rhsExpectedAmount;
            rhsExpectedAmount = that.getExpectedAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expectedAmount", lhsExpectedAmount), LocatorUtils.property(thatLocator, "expectedAmount", rhsExpectedAmount), lhsExpectedAmount, rhsExpectedAmount, (this.expectedAmount!= null), (that.expectedAmount!= null))) {
                return false;
            }
        }
        {
            ExpectedIDType lhsExpectedID;
            lhsExpectedID = this.getExpectedID();
            ExpectedIDType rhsExpectedID;
            rhsExpectedID = that.getExpectedID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expectedID", lhsExpectedID), LocatorUtils.property(thatLocator, "expectedID", rhsExpectedID), lhsExpectedID, rhsExpectedID, (this.expectedID!= null), (that.expectedID!= null))) {
                return false;
            }
        }
        {
            ExpectedCodeType lhsExpectedCode;
            lhsExpectedCode = this.getExpectedCode();
            ExpectedCodeType rhsExpectedCode;
            rhsExpectedCode = that.getExpectedCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expectedCode", lhsExpectedCode), LocatorUtils.property(thatLocator, "expectedCode", rhsExpectedCode), lhsExpectedCode, rhsExpectedCode, (this.expectedCode!= null), (that.expectedCode!= null))) {
                return false;
            }
        }
        {
            ExpectedValueNumericType lhsExpectedValueNumeric;
            lhsExpectedValueNumeric = this.getExpectedValueNumeric();
            ExpectedValueNumericType rhsExpectedValueNumeric;
            rhsExpectedValueNumeric = that.getExpectedValueNumeric();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expectedValueNumeric", lhsExpectedValueNumeric), LocatorUtils.property(thatLocator, "expectedValueNumeric", rhsExpectedValueNumeric), lhsExpectedValueNumeric, rhsExpectedValueNumeric, (this.expectedValueNumeric!= null), (that.expectedValueNumeric!= null))) {
                return false;
            }
        }
        {
            ExpectedDescriptionType lhsExpectedDescription;
            lhsExpectedDescription = this.getExpectedDescription();
            ExpectedDescriptionType rhsExpectedDescription;
            rhsExpectedDescription = that.getExpectedDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expectedDescription", lhsExpectedDescription), LocatorUtils.property(thatLocator, "expectedDescription", rhsExpectedDescription), lhsExpectedDescription, rhsExpectedDescription, (this.expectedDescription!= null), (that.expectedDescription!= null))) {
                return false;
            }
        }
        {
            MaximumAmountType lhsMaximumAmount;
            lhsMaximumAmount = this.getMaximumAmount();
            MaximumAmountType rhsMaximumAmount;
            rhsMaximumAmount = that.getMaximumAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumAmount", lhsMaximumAmount), LocatorUtils.property(thatLocator, "maximumAmount", rhsMaximumAmount), lhsMaximumAmount, rhsMaximumAmount, (this.maximumAmount!= null), (that.maximumAmount!= null))) {
                return false;
            }
        }
        {
            MinimumAmountType lhsMinimumAmount;
            lhsMinimumAmount = this.getMinimumAmount();
            MinimumAmountType rhsMinimumAmount;
            rhsMinimumAmount = that.getMinimumAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minimumAmount", lhsMinimumAmount), LocatorUtils.property(thatLocator, "minimumAmount", rhsMinimumAmount), lhsMinimumAmount, rhsMinimumAmount, (this.minimumAmount!= null), (that.minimumAmount!= null))) {
                return false;
            }
        }
        {
            MaximumValueNumericType lhsMaximumValueNumeric;
            lhsMaximumValueNumeric = this.getMaximumValueNumeric();
            MaximumValueNumericType rhsMaximumValueNumeric;
            rhsMaximumValueNumeric = that.getMaximumValueNumeric();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumValueNumeric", lhsMaximumValueNumeric), LocatorUtils.property(thatLocator, "maximumValueNumeric", rhsMaximumValueNumeric), lhsMaximumValueNumeric, rhsMaximumValueNumeric, (this.maximumValueNumeric!= null), (that.maximumValueNumeric!= null))) {
                return false;
            }
        }
        {
            MinimumValueNumericType lhsMinimumValueNumeric;
            lhsMinimumValueNumeric = this.getMinimumValueNumeric();
            MinimumValueNumericType rhsMinimumValueNumeric;
            rhsMinimumValueNumeric = that.getMinimumValueNumeric();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minimumValueNumeric", lhsMinimumValueNumeric), LocatorUtils.property(thatLocator, "minimumValueNumeric", rhsMinimumValueNumeric), lhsMinimumValueNumeric, rhsMinimumValueNumeric, (this.minimumValueNumeric!= null), (that.minimumValueNumeric!= null))) {
                return false;
            }
        }
        {
            TranslationTypeCodeType lhsTranslationTypeCode;
            lhsTranslationTypeCode = this.getTranslationTypeCode();
            TranslationTypeCodeType rhsTranslationTypeCode;
            rhsTranslationTypeCode = that.getTranslationTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "translationTypeCode", lhsTranslationTypeCode), LocatorUtils.property(thatLocator, "translationTypeCode", rhsTranslationTypeCode), lhsTranslationTypeCode, rhsTranslationTypeCode, (this.translationTypeCode!= null), (that.translationTypeCode!= null))) {
                return false;
            }
        }
        {
            List<CertificationLevelDescriptionType> lhsCertificationLevelDescription;
            lhsCertificationLevelDescription = (((this.certificationLevelDescription!= null)&&(!this.certificationLevelDescription.isEmpty()))?this.getCertificationLevelDescription():null);
            List<CertificationLevelDescriptionType> rhsCertificationLevelDescription;
            rhsCertificationLevelDescription = (((that.certificationLevelDescription!= null)&&(!that.certificationLevelDescription.isEmpty()))?that.getCertificationLevelDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "certificationLevelDescription", lhsCertificationLevelDescription), LocatorUtils.property(thatLocator, "certificationLevelDescription", rhsCertificationLevelDescription), lhsCertificationLevelDescription, rhsCertificationLevelDescription, ((this.certificationLevelDescription!= null)&&(!this.certificationLevelDescription.isEmpty())), ((that.certificationLevelDescription!= null)&&(!that.certificationLevelDescription.isEmpty())))) {
                return false;
            }
        }
        {
            CopyQualityTypeCodeType lhsCopyQualityTypeCode;
            lhsCopyQualityTypeCode = this.getCopyQualityTypeCode();
            CopyQualityTypeCodeType rhsCopyQualityTypeCode;
            rhsCopyQualityTypeCode = that.getCopyQualityTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "copyQualityTypeCode", lhsCopyQualityTypeCode), LocatorUtils.property(thatLocator, "copyQualityTypeCode", rhsCopyQualityTypeCode), lhsCopyQualityTypeCode, rhsCopyQualityTypeCode, (this.copyQualityTypeCode!= null), (that.copyQualityTypeCode!= null))) {
                return false;
            }
        }
        {
            List<PeriodType> lhsApplicablePeriod;
            lhsApplicablePeriod = (((this.applicablePeriod!= null)&&(!this.applicablePeriod.isEmpty()))?this.getApplicablePeriod():null);
            List<PeriodType> rhsApplicablePeriod;
            rhsApplicablePeriod = (((that.applicablePeriod!= null)&&(!that.applicablePeriod.isEmpty()))?that.getApplicablePeriod():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "applicablePeriod", lhsApplicablePeriod), LocatorUtils.property(thatLocator, "applicablePeriod", rhsApplicablePeriod), lhsApplicablePeriod, rhsApplicablePeriod, ((this.applicablePeriod!= null)&&(!this.applicablePeriod.isEmpty())), ((that.applicablePeriod!= null)&&(!that.applicablePeriod.isEmpty())))) {
                return false;
            }
        }
        {
            List<EvidenceType> lhsTemplateEvidence;
            lhsTemplateEvidence = (((this.templateEvidence!= null)&&(!this.templateEvidence.isEmpty()))?this.getTemplateEvidence():null);
            List<EvidenceType> rhsTemplateEvidence;
            rhsTemplateEvidence = (((that.templateEvidence!= null)&&(!that.templateEvidence.isEmpty()))?that.getTemplateEvidence():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "templateEvidence", lhsTemplateEvidence), LocatorUtils.property(thatLocator, "templateEvidence", rhsTemplateEvidence), lhsTemplateEvidence, rhsTemplateEvidence, ((this.templateEvidence!= null)&&(!this.templateEvidence.isEmpty())), ((that.templateEvidence!= null)&&(!that.templateEvidence.isEmpty())))) {
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
            NameType theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            CardinalityType theCardinality;
            theCardinality = this.getCardinality();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cardinality", theCardinality), currentHashCode, theCardinality, (this.cardinality!= null));
        }
        {
            TypeCodeType theTypeCode;
            theTypeCode = this.getTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "typeCode", theTypeCode), currentHashCode, theTypeCode, (this.typeCode!= null));
        }
        {
            ValueDataTypeCodeType theValueDataTypeCode;
            theValueDataTypeCode = this.getValueDataTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "valueDataTypeCode", theValueDataTypeCode), currentHashCode, theValueDataTypeCode, (this.valueDataTypeCode!= null));
        }
        {
            ValueUnitCodeType theValueUnitCode;
            theValueUnitCode = this.getValueUnitCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "valueUnitCode", theValueUnitCode), currentHashCode, theValueUnitCode, (this.valueUnitCode!= null));
        }
        {
            ValueCurrencyCodeType theValueCurrencyCode;
            theValueCurrencyCode = this.getValueCurrencyCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "valueCurrencyCode", theValueCurrencyCode), currentHashCode, theValueCurrencyCode, (this.valueCurrencyCode!= null));
        }
        {
            ResponseCodeType theResponseCode;
            theResponseCode = this.getResponseCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responseCode", theResponseCode), currentHashCode, theResponseCode, (this.responseCode!= null));
        }
        {
            ExpectedAmountType theExpectedAmount;
            theExpectedAmount = this.getExpectedAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expectedAmount", theExpectedAmount), currentHashCode, theExpectedAmount, (this.expectedAmount!= null));
        }
        {
            ExpectedIDType theExpectedID;
            theExpectedID = this.getExpectedID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expectedID", theExpectedID), currentHashCode, theExpectedID, (this.expectedID!= null));
        }
        {
            ExpectedCodeType theExpectedCode;
            theExpectedCode = this.getExpectedCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expectedCode", theExpectedCode), currentHashCode, theExpectedCode, (this.expectedCode!= null));
        }
        {
            ExpectedValueNumericType theExpectedValueNumeric;
            theExpectedValueNumeric = this.getExpectedValueNumeric();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expectedValueNumeric", theExpectedValueNumeric), currentHashCode, theExpectedValueNumeric, (this.expectedValueNumeric!= null));
        }
        {
            ExpectedDescriptionType theExpectedDescription;
            theExpectedDescription = this.getExpectedDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expectedDescription", theExpectedDescription), currentHashCode, theExpectedDescription, (this.expectedDescription!= null));
        }
        {
            MaximumAmountType theMaximumAmount;
            theMaximumAmount = this.getMaximumAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumAmount", theMaximumAmount), currentHashCode, theMaximumAmount, (this.maximumAmount!= null));
        }
        {
            MinimumAmountType theMinimumAmount;
            theMinimumAmount = this.getMinimumAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minimumAmount", theMinimumAmount), currentHashCode, theMinimumAmount, (this.minimumAmount!= null));
        }
        {
            MaximumValueNumericType theMaximumValueNumeric;
            theMaximumValueNumeric = this.getMaximumValueNumeric();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumValueNumeric", theMaximumValueNumeric), currentHashCode, theMaximumValueNumeric, (this.maximumValueNumeric!= null));
        }
        {
            MinimumValueNumericType theMinimumValueNumeric;
            theMinimumValueNumeric = this.getMinimumValueNumeric();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minimumValueNumeric", theMinimumValueNumeric), currentHashCode, theMinimumValueNumeric, (this.minimumValueNumeric!= null));
        }
        {
            TranslationTypeCodeType theTranslationTypeCode;
            theTranslationTypeCode = this.getTranslationTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "translationTypeCode", theTranslationTypeCode), currentHashCode, theTranslationTypeCode, (this.translationTypeCode!= null));
        }
        {
            List<CertificationLevelDescriptionType> theCertificationLevelDescription;
            theCertificationLevelDescription = (((this.certificationLevelDescription!= null)&&(!this.certificationLevelDescription.isEmpty()))?this.getCertificationLevelDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "certificationLevelDescription", theCertificationLevelDescription), currentHashCode, theCertificationLevelDescription, ((this.certificationLevelDescription!= null)&&(!this.certificationLevelDescription.isEmpty())));
        }
        {
            CopyQualityTypeCodeType theCopyQualityTypeCode;
            theCopyQualityTypeCode = this.getCopyQualityTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "copyQualityTypeCode", theCopyQualityTypeCode), currentHashCode, theCopyQualityTypeCode, (this.copyQualityTypeCode!= null));
        }
        {
            List<PeriodType> theApplicablePeriod;
            theApplicablePeriod = (((this.applicablePeriod!= null)&&(!this.applicablePeriod.isEmpty()))?this.getApplicablePeriod():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "applicablePeriod", theApplicablePeriod), currentHashCode, theApplicablePeriod, ((this.applicablePeriod!= null)&&(!this.applicablePeriod.isEmpty())));
        }
        {
            List<EvidenceType> theTemplateEvidence;
            theTemplateEvidence = (((this.templateEvidence!= null)&&(!this.templateEvidence.isEmpty()))?this.getTemplateEvidence():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "templateEvidence", theTemplateEvidence), currentHashCode, theTemplateEvidence, ((this.templateEvidence!= null)&&(!this.templateEvidence.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
