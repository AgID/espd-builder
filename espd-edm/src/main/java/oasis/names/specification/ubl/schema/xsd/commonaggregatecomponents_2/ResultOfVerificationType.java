//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValidateProcessType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValidateToolType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValidateToolVersionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValidationDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValidationResultCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValidationTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValidatorIDType;
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
 * <p>Classe Java per ResultOfVerificationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ResultOfVerificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidatorID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidationResultCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidationDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidationTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidateProcess" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidateTool" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidateToolVersion" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SignatoryParty" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultOfVerificationType", propOrder = {
    "validatorID",
    "validationResultCode",
    "validationDate",
    "validationTime",
    "validateProcess",
    "validateTool",
    "validateToolVersion",
    "signatoryParty"
})
public class ResultOfVerificationType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ValidatorID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValidatorIDType validatorID;
    @XmlElement(name = "ValidationResultCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValidationResultCodeType validationResultCode;
    @XmlElement(name = "ValidationDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValidationDateType validationDate;
    @XmlElement(name = "ValidationTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValidationTimeType validationTime;
    @XmlElement(name = "ValidateProcess", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValidateProcessType validateProcess;
    @XmlElement(name = "ValidateTool", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValidateToolType validateTool;
    @XmlElement(name = "ValidateToolVersion", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValidateToolVersionType validateToolVersion;
    @XmlElement(name = "SignatoryParty")
    protected PartyType signatoryParty;

    /**
     * Recupera il valore della proprietà validatorID.
     * 
     * @return
     *     possible object is
     *     {@link ValidatorIDType }
     *     
     */
    public ValidatorIDType getValidatorID() {
        return validatorID;
    }

    /**
     * Imposta il valore della proprietà validatorID.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidatorIDType }
     *     
     */
    public void setValidatorID(ValidatorIDType value) {
        this.validatorID = value;
    }

    /**
     * Recupera il valore della proprietà validationResultCode.
     * 
     * @return
     *     possible object is
     *     {@link ValidationResultCodeType }
     *     
     */
    public ValidationResultCodeType getValidationResultCode() {
        return validationResultCode;
    }

    /**
     * Imposta il valore della proprietà validationResultCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationResultCodeType }
     *     
     */
    public void setValidationResultCode(ValidationResultCodeType value) {
        this.validationResultCode = value;
    }

    /**
     * Recupera il valore della proprietà validationDate.
     * 
     * @return
     *     possible object is
     *     {@link ValidationDateType }
     *     
     */
    public ValidationDateType getValidationDate() {
        return validationDate;
    }

    /**
     * Imposta il valore della proprietà validationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationDateType }
     *     
     */
    public void setValidationDate(ValidationDateType value) {
        this.validationDate = value;
    }

    /**
     * Recupera il valore della proprietà validationTime.
     * 
     * @return
     *     possible object is
     *     {@link ValidationTimeType }
     *     
     */
    public ValidationTimeType getValidationTime() {
        return validationTime;
    }

    /**
     * Imposta il valore della proprietà validationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationTimeType }
     *     
     */
    public void setValidationTime(ValidationTimeType value) {
        this.validationTime = value;
    }

    /**
     * Recupera il valore della proprietà validateProcess.
     * 
     * @return
     *     possible object is
     *     {@link ValidateProcessType }
     *     
     */
    public ValidateProcessType getValidateProcess() {
        return validateProcess;
    }

    /**
     * Imposta il valore della proprietà validateProcess.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateProcessType }
     *     
     */
    public void setValidateProcess(ValidateProcessType value) {
        this.validateProcess = value;
    }

    /**
     * Recupera il valore della proprietà validateTool.
     * 
     * @return
     *     possible object is
     *     {@link ValidateToolType }
     *     
     */
    public ValidateToolType getValidateTool() {
        return validateTool;
    }

    /**
     * Imposta il valore della proprietà validateTool.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateToolType }
     *     
     */
    public void setValidateTool(ValidateToolType value) {
        this.validateTool = value;
    }

    /**
     * Recupera il valore della proprietà validateToolVersion.
     * 
     * @return
     *     possible object is
     *     {@link ValidateToolVersionType }
     *     
     */
    public ValidateToolVersionType getValidateToolVersion() {
        return validateToolVersion;
    }

    /**
     * Imposta il valore della proprietà validateToolVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateToolVersionType }
     *     
     */
    public void setValidateToolVersion(ValidateToolVersionType value) {
        this.validateToolVersion = value;
    }

    /**
     * Recupera il valore della proprietà signatoryParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getSignatoryParty() {
        return signatoryParty;
    }

    /**
     * Imposta il valore della proprietà signatoryParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setSignatoryParty(PartyType value) {
        this.signatoryParty = value;
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
            ValidatorIDType theValidatorID;
            theValidatorID = this.getValidatorID();
            strategy.appendField(locator, this, "validatorID", buffer, theValidatorID, (this.validatorID!= null));
        }
        {
            ValidationResultCodeType theValidationResultCode;
            theValidationResultCode = this.getValidationResultCode();
            strategy.appendField(locator, this, "validationResultCode", buffer, theValidationResultCode, (this.validationResultCode!= null));
        }
        {
            ValidationDateType theValidationDate;
            theValidationDate = this.getValidationDate();
            strategy.appendField(locator, this, "validationDate", buffer, theValidationDate, (this.validationDate!= null));
        }
        {
            ValidationTimeType theValidationTime;
            theValidationTime = this.getValidationTime();
            strategy.appendField(locator, this, "validationTime", buffer, theValidationTime, (this.validationTime!= null));
        }
        {
            ValidateProcessType theValidateProcess;
            theValidateProcess = this.getValidateProcess();
            strategy.appendField(locator, this, "validateProcess", buffer, theValidateProcess, (this.validateProcess!= null));
        }
        {
            ValidateToolType theValidateTool;
            theValidateTool = this.getValidateTool();
            strategy.appendField(locator, this, "validateTool", buffer, theValidateTool, (this.validateTool!= null));
        }
        {
            ValidateToolVersionType theValidateToolVersion;
            theValidateToolVersion = this.getValidateToolVersion();
            strategy.appendField(locator, this, "validateToolVersion", buffer, theValidateToolVersion, (this.validateToolVersion!= null));
        }
        {
            PartyType theSignatoryParty;
            theSignatoryParty = this.getSignatoryParty();
            strategy.appendField(locator, this, "signatoryParty", buffer, theSignatoryParty, (this.signatoryParty!= null));
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
        final ResultOfVerificationType that = ((ResultOfVerificationType) object);
        {
            ValidatorIDType lhsValidatorID;
            lhsValidatorID = this.getValidatorID();
            ValidatorIDType rhsValidatorID;
            rhsValidatorID = that.getValidatorID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validatorID", lhsValidatorID), LocatorUtils.property(thatLocator, "validatorID", rhsValidatorID), lhsValidatorID, rhsValidatorID, (this.validatorID!= null), (that.validatorID!= null))) {
                return false;
            }
        }
        {
            ValidationResultCodeType lhsValidationResultCode;
            lhsValidationResultCode = this.getValidationResultCode();
            ValidationResultCodeType rhsValidationResultCode;
            rhsValidationResultCode = that.getValidationResultCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validationResultCode", lhsValidationResultCode), LocatorUtils.property(thatLocator, "validationResultCode", rhsValidationResultCode), lhsValidationResultCode, rhsValidationResultCode, (this.validationResultCode!= null), (that.validationResultCode!= null))) {
                return false;
            }
        }
        {
            ValidationDateType lhsValidationDate;
            lhsValidationDate = this.getValidationDate();
            ValidationDateType rhsValidationDate;
            rhsValidationDate = that.getValidationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validationDate", lhsValidationDate), LocatorUtils.property(thatLocator, "validationDate", rhsValidationDate), lhsValidationDate, rhsValidationDate, (this.validationDate!= null), (that.validationDate!= null))) {
                return false;
            }
        }
        {
            ValidationTimeType lhsValidationTime;
            lhsValidationTime = this.getValidationTime();
            ValidationTimeType rhsValidationTime;
            rhsValidationTime = that.getValidationTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validationTime", lhsValidationTime), LocatorUtils.property(thatLocator, "validationTime", rhsValidationTime), lhsValidationTime, rhsValidationTime, (this.validationTime!= null), (that.validationTime!= null))) {
                return false;
            }
        }
        {
            ValidateProcessType lhsValidateProcess;
            lhsValidateProcess = this.getValidateProcess();
            ValidateProcessType rhsValidateProcess;
            rhsValidateProcess = that.getValidateProcess();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validateProcess", lhsValidateProcess), LocatorUtils.property(thatLocator, "validateProcess", rhsValidateProcess), lhsValidateProcess, rhsValidateProcess, (this.validateProcess!= null), (that.validateProcess!= null))) {
                return false;
            }
        }
        {
            ValidateToolType lhsValidateTool;
            lhsValidateTool = this.getValidateTool();
            ValidateToolType rhsValidateTool;
            rhsValidateTool = that.getValidateTool();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validateTool", lhsValidateTool), LocatorUtils.property(thatLocator, "validateTool", rhsValidateTool), lhsValidateTool, rhsValidateTool, (this.validateTool!= null), (that.validateTool!= null))) {
                return false;
            }
        }
        {
            ValidateToolVersionType lhsValidateToolVersion;
            lhsValidateToolVersion = this.getValidateToolVersion();
            ValidateToolVersionType rhsValidateToolVersion;
            rhsValidateToolVersion = that.getValidateToolVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validateToolVersion", lhsValidateToolVersion), LocatorUtils.property(thatLocator, "validateToolVersion", rhsValidateToolVersion), lhsValidateToolVersion, rhsValidateToolVersion, (this.validateToolVersion!= null), (that.validateToolVersion!= null))) {
                return false;
            }
        }
        {
            PartyType lhsSignatoryParty;
            lhsSignatoryParty = this.getSignatoryParty();
            PartyType rhsSignatoryParty;
            rhsSignatoryParty = that.getSignatoryParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "signatoryParty", lhsSignatoryParty), LocatorUtils.property(thatLocator, "signatoryParty", rhsSignatoryParty), lhsSignatoryParty, rhsSignatoryParty, (this.signatoryParty!= null), (that.signatoryParty!= null))) {
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
            ValidatorIDType theValidatorID;
            theValidatorID = this.getValidatorID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validatorID", theValidatorID), currentHashCode, theValidatorID, (this.validatorID!= null));
        }
        {
            ValidationResultCodeType theValidationResultCode;
            theValidationResultCode = this.getValidationResultCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validationResultCode", theValidationResultCode), currentHashCode, theValidationResultCode, (this.validationResultCode!= null));
        }
        {
            ValidationDateType theValidationDate;
            theValidationDate = this.getValidationDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validationDate", theValidationDate), currentHashCode, theValidationDate, (this.validationDate!= null));
        }
        {
            ValidationTimeType theValidationTime;
            theValidationTime = this.getValidationTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validationTime", theValidationTime), currentHashCode, theValidationTime, (this.validationTime!= null));
        }
        {
            ValidateProcessType theValidateProcess;
            theValidateProcess = this.getValidateProcess();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validateProcess", theValidateProcess), currentHashCode, theValidateProcess, (this.validateProcess!= null));
        }
        {
            ValidateToolType theValidateTool;
            theValidateTool = this.getValidateTool();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validateTool", theValidateTool), currentHashCode, theValidateTool, (this.validateTool!= null));
        }
        {
            ValidateToolVersionType theValidateToolVersion;
            theValidateToolVersion = this.getValidateToolVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validateToolVersion", theValidateToolVersion), currentHashCode, theValidateToolVersion, (this.validateToolVersion!= null));
        }
        {
            PartyType theSignatoryParty;
            theSignatoryParty = this.getSignatoryParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "signatoryParty", theSignatoryParty), currentHashCode, theSignatoryParty, (this.signatoryParty!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
