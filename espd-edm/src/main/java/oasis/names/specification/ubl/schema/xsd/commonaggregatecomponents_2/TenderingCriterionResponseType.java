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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ConfidentialityLevelCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValidatedCriterionPropertyIDType;
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
 * <p>Classe Java per TenderingCriterionResponseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TenderingCriterionResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidatedCriterionPropertyID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConfidentialityLevelCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ResponseValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ApplicablePeriod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EvidenceSupplied" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenderingCriterionResponseType", propOrder = {
    "id",
    "name",
    "description",
    "validatedCriterionPropertyID",
    "confidentialityLevelCode",
    "responseValue",
    "applicablePeriod",
    "evidenceSupplied"
})
public class TenderingCriterionResponseType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NameType name;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "ValidatedCriterionPropertyID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValidatedCriterionPropertyIDType validatedCriterionPropertyID;
    @XmlElement(name = "ConfidentialityLevelCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConfidentialityLevelCodeType confidentialityLevelCode;
    @XmlElement(name = "ResponseValue")
    protected List<ResponseValueType> responseValue;
    @XmlElement(name = "ApplicablePeriod")
    protected List<PeriodType> applicablePeriod;
    @XmlElement(name = "EvidenceSupplied")
    protected List<EvidenceSuppliedType> evidenceSupplied;

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
     * Recupera il valore della proprietà validatedCriterionPropertyID.
     * 
     * @return
     *     possible object is
     *     {@link ValidatedCriterionPropertyIDType }
     *     
     */
    public ValidatedCriterionPropertyIDType getValidatedCriterionPropertyID() {
        return validatedCriterionPropertyID;
    }

    /**
     * Imposta il valore della proprietà validatedCriterionPropertyID.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidatedCriterionPropertyIDType }
     *     
     */
    public void setValidatedCriterionPropertyID(ValidatedCriterionPropertyIDType value) {
        this.validatedCriterionPropertyID = value;
    }

    /**
     * Recupera il valore della proprietà confidentialityLevelCode.
     * 
     * @return
     *     possible object is
     *     {@link ConfidentialityLevelCodeType }
     *     
     */
    public ConfidentialityLevelCodeType getConfidentialityLevelCode() {
        return confidentialityLevelCode;
    }

    /**
     * Imposta il valore della proprietà confidentialityLevelCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfidentialityLevelCodeType }
     *     
     */
    public void setConfidentialityLevelCode(ConfidentialityLevelCodeType value) {
        this.confidentialityLevelCode = value;
    }

    /**
     * Gets the value of the responseValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseValueType }
     * 
     * 
     */
    public List<ResponseValueType> getResponseValue() {
        if (responseValue == null) {
            responseValue = new ArrayList<ResponseValueType>();
        }
        return this.responseValue;
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
            ValidatedCriterionPropertyIDType theValidatedCriterionPropertyID;
            theValidatedCriterionPropertyID = this.getValidatedCriterionPropertyID();
            strategy.appendField(locator, this, "validatedCriterionPropertyID", buffer, theValidatedCriterionPropertyID, (this.validatedCriterionPropertyID!= null));
        }
        {
            ConfidentialityLevelCodeType theConfidentialityLevelCode;
            theConfidentialityLevelCode = this.getConfidentialityLevelCode();
            strategy.appendField(locator, this, "confidentialityLevelCode", buffer, theConfidentialityLevelCode, (this.confidentialityLevelCode!= null));
        }
        {
            List<ResponseValueType> theResponseValue;
            theResponseValue = (((this.responseValue!= null)&&(!this.responseValue.isEmpty()))?this.getResponseValue():null);
            strategy.appendField(locator, this, "responseValue", buffer, theResponseValue, ((this.responseValue!= null)&&(!this.responseValue.isEmpty())));
        }
        {
            List<PeriodType> theApplicablePeriod;
            theApplicablePeriod = (((this.applicablePeriod!= null)&&(!this.applicablePeriod.isEmpty()))?this.getApplicablePeriod():null);
            strategy.appendField(locator, this, "applicablePeriod", buffer, theApplicablePeriod, ((this.applicablePeriod!= null)&&(!this.applicablePeriod.isEmpty())));
        }
        {
            List<EvidenceSuppliedType> theEvidenceSupplied;
            theEvidenceSupplied = (((this.evidenceSupplied!= null)&&(!this.evidenceSupplied.isEmpty()))?this.getEvidenceSupplied():null);
            strategy.appendField(locator, this, "evidenceSupplied", buffer, theEvidenceSupplied, ((this.evidenceSupplied!= null)&&(!this.evidenceSupplied.isEmpty())));
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
        final TenderingCriterionResponseType that = ((TenderingCriterionResponseType) object);
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
            ValidatedCriterionPropertyIDType lhsValidatedCriterionPropertyID;
            lhsValidatedCriterionPropertyID = this.getValidatedCriterionPropertyID();
            ValidatedCriterionPropertyIDType rhsValidatedCriterionPropertyID;
            rhsValidatedCriterionPropertyID = that.getValidatedCriterionPropertyID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validatedCriterionPropertyID", lhsValidatedCriterionPropertyID), LocatorUtils.property(thatLocator, "validatedCriterionPropertyID", rhsValidatedCriterionPropertyID), lhsValidatedCriterionPropertyID, rhsValidatedCriterionPropertyID, (this.validatedCriterionPropertyID!= null), (that.validatedCriterionPropertyID!= null))) {
                return false;
            }
        }
        {
            ConfidentialityLevelCodeType lhsConfidentialityLevelCode;
            lhsConfidentialityLevelCode = this.getConfidentialityLevelCode();
            ConfidentialityLevelCodeType rhsConfidentialityLevelCode;
            rhsConfidentialityLevelCode = that.getConfidentialityLevelCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "confidentialityLevelCode", lhsConfidentialityLevelCode), LocatorUtils.property(thatLocator, "confidentialityLevelCode", rhsConfidentialityLevelCode), lhsConfidentialityLevelCode, rhsConfidentialityLevelCode, (this.confidentialityLevelCode!= null), (that.confidentialityLevelCode!= null))) {
                return false;
            }
        }
        {
            List<ResponseValueType> lhsResponseValue;
            lhsResponseValue = (((this.responseValue!= null)&&(!this.responseValue.isEmpty()))?this.getResponseValue():null);
            List<ResponseValueType> rhsResponseValue;
            rhsResponseValue = (((that.responseValue!= null)&&(!that.responseValue.isEmpty()))?that.getResponseValue():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "responseValue", lhsResponseValue), LocatorUtils.property(thatLocator, "responseValue", rhsResponseValue), lhsResponseValue, rhsResponseValue, ((this.responseValue!= null)&&(!this.responseValue.isEmpty())), ((that.responseValue!= null)&&(!that.responseValue.isEmpty())))) {
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
            List<EvidenceSuppliedType> lhsEvidenceSupplied;
            lhsEvidenceSupplied = (((this.evidenceSupplied!= null)&&(!this.evidenceSupplied.isEmpty()))?this.getEvidenceSupplied():null);
            List<EvidenceSuppliedType> rhsEvidenceSupplied;
            rhsEvidenceSupplied = (((that.evidenceSupplied!= null)&&(!that.evidenceSupplied.isEmpty()))?that.getEvidenceSupplied():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "evidenceSupplied", lhsEvidenceSupplied), LocatorUtils.property(thatLocator, "evidenceSupplied", rhsEvidenceSupplied), lhsEvidenceSupplied, rhsEvidenceSupplied, ((this.evidenceSupplied!= null)&&(!this.evidenceSupplied.isEmpty())), ((that.evidenceSupplied!= null)&&(!that.evidenceSupplied.isEmpty())))) {
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
            ValidatedCriterionPropertyIDType theValidatedCriterionPropertyID;
            theValidatedCriterionPropertyID = this.getValidatedCriterionPropertyID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validatedCriterionPropertyID", theValidatedCriterionPropertyID), currentHashCode, theValidatedCriterionPropertyID, (this.validatedCriterionPropertyID!= null));
        }
        {
            ConfidentialityLevelCodeType theConfidentialityLevelCode;
            theConfidentialityLevelCode = this.getConfidentialityLevelCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "confidentialityLevelCode", theConfidentialityLevelCode), currentHashCode, theConfidentialityLevelCode, (this.confidentialityLevelCode!= null));
        }
        {
            List<ResponseValueType> theResponseValue;
            theResponseValue = (((this.responseValue!= null)&&(!this.responseValue.isEmpty()))?this.getResponseValue():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responseValue", theResponseValue), currentHashCode, theResponseValue, ((this.responseValue!= null)&&(!this.responseValue.isEmpty())));
        }
        {
            List<PeriodType> theApplicablePeriod;
            theApplicablePeriod = (((this.applicablePeriod!= null)&&(!this.applicablePeriod.isEmpty()))?this.getApplicablePeriod():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "applicablePeriod", theApplicablePeriod), currentHashCode, theApplicablePeriod, ((this.applicablePeriod!= null)&&(!this.applicablePeriod.isEmpty())));
        }
        {
            List<EvidenceSuppliedType> theEvidenceSupplied;
            theEvidenceSupplied = (((this.evidenceSupplied!= null)&&(!this.evidenceSupplied.isEmpty()))?this.getEvidenceSupplied():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "evidenceSupplied", theEvidenceSupplied), currentHashCode, theEvidenceSupplied, ((this.evidenceSupplied!= null)&&(!this.evidenceSupplied.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
