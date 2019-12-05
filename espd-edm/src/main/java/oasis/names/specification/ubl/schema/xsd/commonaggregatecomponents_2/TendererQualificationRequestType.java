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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CompanyLegalFormCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CompanyLegalFormType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EmployeeQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.OperatingYearsQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PersonalSituationType;
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
 * <p>Classe Java per TendererQualificationRequestType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TendererQualificationRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CompanyLegalFormCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CompanyLegalForm" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PersonalSituation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OperatingYearsQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EmployeeQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequiredBusinessClassificationScheme" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TechnicalEvaluationCriterion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FinancialEvaluationCriterion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SpecificTendererRequirement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EconomicOperatorRole" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TendererQualificationRequestType", propOrder = {
    "companyLegalFormCode",
    "companyLegalForm",
    "personalSituation",
    "operatingYearsQuantity",
    "employeeQuantity",
    "description",
    "requiredBusinessClassificationScheme",
    "technicalEvaluationCriterion",
    "financialEvaluationCriterion",
    "specificTendererRequirement",
    "economicOperatorRole"
})
public class TendererQualificationRequestType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "CompanyLegalFormCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CompanyLegalFormCodeType companyLegalFormCode;
    @XmlElement(name = "CompanyLegalForm", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CompanyLegalFormType companyLegalForm;
    @XmlElement(name = "PersonalSituation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<PersonalSituationType> personalSituation;
    @XmlElement(name = "OperatingYearsQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OperatingYearsQuantityType operatingYearsQuantity;
    @XmlElement(name = "EmployeeQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EmployeeQuantityType employeeQuantity;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "RequiredBusinessClassificationScheme")
    protected List<ClassificationSchemeType> requiredBusinessClassificationScheme;
    @XmlElement(name = "TechnicalEvaluationCriterion")
    protected List<EvaluationCriterionType> technicalEvaluationCriterion;
    @XmlElement(name = "FinancialEvaluationCriterion")
    protected List<EvaluationCriterionType> financialEvaluationCriterion;
    @XmlElement(name = "SpecificTendererRequirement")
    protected List<TendererRequirementType> specificTendererRequirement;
    @XmlElement(name = "EconomicOperatorRole")
    protected List<EconomicOperatorRoleType> economicOperatorRole;

    /**
     * Recupera il valore della proprietà companyLegalFormCode.
     * 
     * @return
     *     possible object is
     *     {@link CompanyLegalFormCodeType }
     *     
     */
    public CompanyLegalFormCodeType getCompanyLegalFormCode() {
        return companyLegalFormCode;
    }

    /**
     * Imposta il valore della proprietà companyLegalFormCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyLegalFormCodeType }
     *     
     */
    public void setCompanyLegalFormCode(CompanyLegalFormCodeType value) {
        this.companyLegalFormCode = value;
    }

    /**
     * Recupera il valore della proprietà companyLegalForm.
     * 
     * @return
     *     possible object is
     *     {@link CompanyLegalFormType }
     *     
     */
    public CompanyLegalFormType getCompanyLegalForm() {
        return companyLegalForm;
    }

    /**
     * Imposta il valore della proprietà companyLegalForm.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyLegalFormType }
     *     
     */
    public void setCompanyLegalForm(CompanyLegalFormType value) {
        this.companyLegalForm = value;
    }

    /**
     * Gets the value of the personalSituation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personalSituation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonalSituation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonalSituationType }
     * 
     * 
     */
    public List<PersonalSituationType> getPersonalSituation() {
        if (personalSituation == null) {
            personalSituation = new ArrayList<PersonalSituationType>();
        }
        return this.personalSituation;
    }

    /**
     * Recupera il valore della proprietà operatingYearsQuantity.
     * 
     * @return
     *     possible object is
     *     {@link OperatingYearsQuantityType }
     *     
     */
    public OperatingYearsQuantityType getOperatingYearsQuantity() {
        return operatingYearsQuantity;
    }

    /**
     * Imposta il valore della proprietà operatingYearsQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingYearsQuantityType }
     *     
     */
    public void setOperatingYearsQuantity(OperatingYearsQuantityType value) {
        this.operatingYearsQuantity = value;
    }

    /**
     * Recupera il valore della proprietà employeeQuantity.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeQuantityType }
     *     
     */
    public EmployeeQuantityType getEmployeeQuantity() {
        return employeeQuantity;
    }

    /**
     * Imposta il valore della proprietà employeeQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeQuantityType }
     *     
     */
    public void setEmployeeQuantity(EmployeeQuantityType value) {
        this.employeeQuantity = value;
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
     * Gets the value of the requiredBusinessClassificationScheme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiredBusinessClassificationScheme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiredBusinessClassificationScheme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationSchemeType }
     * 
     * 
     */
    public List<ClassificationSchemeType> getRequiredBusinessClassificationScheme() {
        if (requiredBusinessClassificationScheme == null) {
            requiredBusinessClassificationScheme = new ArrayList<ClassificationSchemeType>();
        }
        return this.requiredBusinessClassificationScheme;
    }

    /**
     * Gets the value of the technicalEvaluationCriterion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalEvaluationCriterion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalEvaluationCriterion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EvaluationCriterionType }
     * 
     * 
     */
    public List<EvaluationCriterionType> getTechnicalEvaluationCriterion() {
        if (technicalEvaluationCriterion == null) {
            technicalEvaluationCriterion = new ArrayList<EvaluationCriterionType>();
        }
        return this.technicalEvaluationCriterion;
    }

    /**
     * Gets the value of the financialEvaluationCriterion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialEvaluationCriterion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialEvaluationCriterion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EvaluationCriterionType }
     * 
     * 
     */
    public List<EvaluationCriterionType> getFinancialEvaluationCriterion() {
        if (financialEvaluationCriterion == null) {
            financialEvaluationCriterion = new ArrayList<EvaluationCriterionType>();
        }
        return this.financialEvaluationCriterion;
    }

    /**
     * Gets the value of the specificTendererRequirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specificTendererRequirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecificTendererRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TendererRequirementType }
     * 
     * 
     */
    public List<TendererRequirementType> getSpecificTendererRequirement() {
        if (specificTendererRequirement == null) {
            specificTendererRequirement = new ArrayList<TendererRequirementType>();
        }
        return this.specificTendererRequirement;
    }

    /**
     * Gets the value of the economicOperatorRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the economicOperatorRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEconomicOperatorRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EconomicOperatorRoleType }
     * 
     * 
     */
    public List<EconomicOperatorRoleType> getEconomicOperatorRole() {
        if (economicOperatorRole == null) {
            economicOperatorRole = new ArrayList<EconomicOperatorRoleType>();
        }
        return this.economicOperatorRole;
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
            CompanyLegalFormCodeType theCompanyLegalFormCode;
            theCompanyLegalFormCode = this.getCompanyLegalFormCode();
            strategy.appendField(locator, this, "companyLegalFormCode", buffer, theCompanyLegalFormCode, (this.companyLegalFormCode!= null));
        }
        {
            CompanyLegalFormType theCompanyLegalForm;
            theCompanyLegalForm = this.getCompanyLegalForm();
            strategy.appendField(locator, this, "companyLegalForm", buffer, theCompanyLegalForm, (this.companyLegalForm!= null));
        }
        {
            List<PersonalSituationType> thePersonalSituation;
            thePersonalSituation = (((this.personalSituation!= null)&&(!this.personalSituation.isEmpty()))?this.getPersonalSituation():null);
            strategy.appendField(locator, this, "personalSituation", buffer, thePersonalSituation, ((this.personalSituation!= null)&&(!this.personalSituation.isEmpty())));
        }
        {
            OperatingYearsQuantityType theOperatingYearsQuantity;
            theOperatingYearsQuantity = this.getOperatingYearsQuantity();
            strategy.appendField(locator, this, "operatingYearsQuantity", buffer, theOperatingYearsQuantity, (this.operatingYearsQuantity!= null));
        }
        {
            EmployeeQuantityType theEmployeeQuantity;
            theEmployeeQuantity = this.getEmployeeQuantity();
            strategy.appendField(locator, this, "employeeQuantity", buffer, theEmployeeQuantity, (this.employeeQuantity!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            List<ClassificationSchemeType> theRequiredBusinessClassificationScheme;
            theRequiredBusinessClassificationScheme = (((this.requiredBusinessClassificationScheme!= null)&&(!this.requiredBusinessClassificationScheme.isEmpty()))?this.getRequiredBusinessClassificationScheme():null);
            strategy.appendField(locator, this, "requiredBusinessClassificationScheme", buffer, theRequiredBusinessClassificationScheme, ((this.requiredBusinessClassificationScheme!= null)&&(!this.requiredBusinessClassificationScheme.isEmpty())));
        }
        {
            List<EvaluationCriterionType> theTechnicalEvaluationCriterion;
            theTechnicalEvaluationCriterion = (((this.technicalEvaluationCriterion!= null)&&(!this.technicalEvaluationCriterion.isEmpty()))?this.getTechnicalEvaluationCriterion():null);
            strategy.appendField(locator, this, "technicalEvaluationCriterion", buffer, theTechnicalEvaluationCriterion, ((this.technicalEvaluationCriterion!= null)&&(!this.technicalEvaluationCriterion.isEmpty())));
        }
        {
            List<EvaluationCriterionType> theFinancialEvaluationCriterion;
            theFinancialEvaluationCriterion = (((this.financialEvaluationCriterion!= null)&&(!this.financialEvaluationCriterion.isEmpty()))?this.getFinancialEvaluationCriterion():null);
            strategy.appendField(locator, this, "financialEvaluationCriterion", buffer, theFinancialEvaluationCriterion, ((this.financialEvaluationCriterion!= null)&&(!this.financialEvaluationCriterion.isEmpty())));
        }
        {
            List<TendererRequirementType> theSpecificTendererRequirement;
            theSpecificTendererRequirement = (((this.specificTendererRequirement!= null)&&(!this.specificTendererRequirement.isEmpty()))?this.getSpecificTendererRequirement():null);
            strategy.appendField(locator, this, "specificTendererRequirement", buffer, theSpecificTendererRequirement, ((this.specificTendererRequirement!= null)&&(!this.specificTendererRequirement.isEmpty())));
        }
        {
            List<EconomicOperatorRoleType> theEconomicOperatorRole;
            theEconomicOperatorRole = (((this.economicOperatorRole!= null)&&(!this.economicOperatorRole.isEmpty()))?this.getEconomicOperatorRole():null);
            strategy.appendField(locator, this, "economicOperatorRole", buffer, theEconomicOperatorRole, ((this.economicOperatorRole!= null)&&(!this.economicOperatorRole.isEmpty())));
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
        final TendererQualificationRequestType that = ((TendererQualificationRequestType) object);
        {
            CompanyLegalFormCodeType lhsCompanyLegalFormCode;
            lhsCompanyLegalFormCode = this.getCompanyLegalFormCode();
            CompanyLegalFormCodeType rhsCompanyLegalFormCode;
            rhsCompanyLegalFormCode = that.getCompanyLegalFormCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "companyLegalFormCode", lhsCompanyLegalFormCode), LocatorUtils.property(thatLocator, "companyLegalFormCode", rhsCompanyLegalFormCode), lhsCompanyLegalFormCode, rhsCompanyLegalFormCode, (this.companyLegalFormCode!= null), (that.companyLegalFormCode!= null))) {
                return false;
            }
        }
        {
            CompanyLegalFormType lhsCompanyLegalForm;
            lhsCompanyLegalForm = this.getCompanyLegalForm();
            CompanyLegalFormType rhsCompanyLegalForm;
            rhsCompanyLegalForm = that.getCompanyLegalForm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "companyLegalForm", lhsCompanyLegalForm), LocatorUtils.property(thatLocator, "companyLegalForm", rhsCompanyLegalForm), lhsCompanyLegalForm, rhsCompanyLegalForm, (this.companyLegalForm!= null), (that.companyLegalForm!= null))) {
                return false;
            }
        }
        {
            List<PersonalSituationType> lhsPersonalSituation;
            lhsPersonalSituation = (((this.personalSituation!= null)&&(!this.personalSituation.isEmpty()))?this.getPersonalSituation():null);
            List<PersonalSituationType> rhsPersonalSituation;
            rhsPersonalSituation = (((that.personalSituation!= null)&&(!that.personalSituation.isEmpty()))?that.getPersonalSituation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "personalSituation", lhsPersonalSituation), LocatorUtils.property(thatLocator, "personalSituation", rhsPersonalSituation), lhsPersonalSituation, rhsPersonalSituation, ((this.personalSituation!= null)&&(!this.personalSituation.isEmpty())), ((that.personalSituation!= null)&&(!that.personalSituation.isEmpty())))) {
                return false;
            }
        }
        {
            OperatingYearsQuantityType lhsOperatingYearsQuantity;
            lhsOperatingYearsQuantity = this.getOperatingYearsQuantity();
            OperatingYearsQuantityType rhsOperatingYearsQuantity;
            rhsOperatingYearsQuantity = that.getOperatingYearsQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "operatingYearsQuantity", lhsOperatingYearsQuantity), LocatorUtils.property(thatLocator, "operatingYearsQuantity", rhsOperatingYearsQuantity), lhsOperatingYearsQuantity, rhsOperatingYearsQuantity, (this.operatingYearsQuantity!= null), (that.operatingYearsQuantity!= null))) {
                return false;
            }
        }
        {
            EmployeeQuantityType lhsEmployeeQuantity;
            lhsEmployeeQuantity = this.getEmployeeQuantity();
            EmployeeQuantityType rhsEmployeeQuantity;
            rhsEmployeeQuantity = that.getEmployeeQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "employeeQuantity", lhsEmployeeQuantity), LocatorUtils.property(thatLocator, "employeeQuantity", rhsEmployeeQuantity), lhsEmployeeQuantity, rhsEmployeeQuantity, (this.employeeQuantity!= null), (that.employeeQuantity!= null))) {
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
            List<ClassificationSchemeType> lhsRequiredBusinessClassificationScheme;
            lhsRequiredBusinessClassificationScheme = (((this.requiredBusinessClassificationScheme!= null)&&(!this.requiredBusinessClassificationScheme.isEmpty()))?this.getRequiredBusinessClassificationScheme():null);
            List<ClassificationSchemeType> rhsRequiredBusinessClassificationScheme;
            rhsRequiredBusinessClassificationScheme = (((that.requiredBusinessClassificationScheme!= null)&&(!that.requiredBusinessClassificationScheme.isEmpty()))?that.getRequiredBusinessClassificationScheme():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requiredBusinessClassificationScheme", lhsRequiredBusinessClassificationScheme), LocatorUtils.property(thatLocator, "requiredBusinessClassificationScheme", rhsRequiredBusinessClassificationScheme), lhsRequiredBusinessClassificationScheme, rhsRequiredBusinessClassificationScheme, ((this.requiredBusinessClassificationScheme!= null)&&(!this.requiredBusinessClassificationScheme.isEmpty())), ((that.requiredBusinessClassificationScheme!= null)&&(!that.requiredBusinessClassificationScheme.isEmpty())))) {
                return false;
            }
        }
        {
            List<EvaluationCriterionType> lhsTechnicalEvaluationCriterion;
            lhsTechnicalEvaluationCriterion = (((this.technicalEvaluationCriterion!= null)&&(!this.technicalEvaluationCriterion.isEmpty()))?this.getTechnicalEvaluationCriterion():null);
            List<EvaluationCriterionType> rhsTechnicalEvaluationCriterion;
            rhsTechnicalEvaluationCriterion = (((that.technicalEvaluationCriterion!= null)&&(!that.technicalEvaluationCriterion.isEmpty()))?that.getTechnicalEvaluationCriterion():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "technicalEvaluationCriterion", lhsTechnicalEvaluationCriterion), LocatorUtils.property(thatLocator, "technicalEvaluationCriterion", rhsTechnicalEvaluationCriterion), lhsTechnicalEvaluationCriterion, rhsTechnicalEvaluationCriterion, ((this.technicalEvaluationCriterion!= null)&&(!this.technicalEvaluationCriterion.isEmpty())), ((that.technicalEvaluationCriterion!= null)&&(!that.technicalEvaluationCriterion.isEmpty())))) {
                return false;
            }
        }
        {
            List<EvaluationCriterionType> lhsFinancialEvaluationCriterion;
            lhsFinancialEvaluationCriterion = (((this.financialEvaluationCriterion!= null)&&(!this.financialEvaluationCriterion.isEmpty()))?this.getFinancialEvaluationCriterion():null);
            List<EvaluationCriterionType> rhsFinancialEvaluationCriterion;
            rhsFinancialEvaluationCriterion = (((that.financialEvaluationCriterion!= null)&&(!that.financialEvaluationCriterion.isEmpty()))?that.getFinancialEvaluationCriterion():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "financialEvaluationCriterion", lhsFinancialEvaluationCriterion), LocatorUtils.property(thatLocator, "financialEvaluationCriterion", rhsFinancialEvaluationCriterion), lhsFinancialEvaluationCriterion, rhsFinancialEvaluationCriterion, ((this.financialEvaluationCriterion!= null)&&(!this.financialEvaluationCriterion.isEmpty())), ((that.financialEvaluationCriterion!= null)&&(!that.financialEvaluationCriterion.isEmpty())))) {
                return false;
            }
        }
        {
            List<TendererRequirementType> lhsSpecificTendererRequirement;
            lhsSpecificTendererRequirement = (((this.specificTendererRequirement!= null)&&(!this.specificTendererRequirement.isEmpty()))?this.getSpecificTendererRequirement():null);
            List<TendererRequirementType> rhsSpecificTendererRequirement;
            rhsSpecificTendererRequirement = (((that.specificTendererRequirement!= null)&&(!that.specificTendererRequirement.isEmpty()))?that.getSpecificTendererRequirement():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specificTendererRequirement", lhsSpecificTendererRequirement), LocatorUtils.property(thatLocator, "specificTendererRequirement", rhsSpecificTendererRequirement), lhsSpecificTendererRequirement, rhsSpecificTendererRequirement, ((this.specificTendererRequirement!= null)&&(!this.specificTendererRequirement.isEmpty())), ((that.specificTendererRequirement!= null)&&(!that.specificTendererRequirement.isEmpty())))) {
                return false;
            }
        }
        {
            List<EconomicOperatorRoleType> lhsEconomicOperatorRole;
            lhsEconomicOperatorRole = (((this.economicOperatorRole!= null)&&(!this.economicOperatorRole.isEmpty()))?this.getEconomicOperatorRole():null);
            List<EconomicOperatorRoleType> rhsEconomicOperatorRole;
            rhsEconomicOperatorRole = (((that.economicOperatorRole!= null)&&(!that.economicOperatorRole.isEmpty()))?that.getEconomicOperatorRole():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "economicOperatorRole", lhsEconomicOperatorRole), LocatorUtils.property(thatLocator, "economicOperatorRole", rhsEconomicOperatorRole), lhsEconomicOperatorRole, rhsEconomicOperatorRole, ((this.economicOperatorRole!= null)&&(!this.economicOperatorRole.isEmpty())), ((that.economicOperatorRole!= null)&&(!that.economicOperatorRole.isEmpty())))) {
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
            CompanyLegalFormCodeType theCompanyLegalFormCode;
            theCompanyLegalFormCode = this.getCompanyLegalFormCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "companyLegalFormCode", theCompanyLegalFormCode), currentHashCode, theCompanyLegalFormCode, (this.companyLegalFormCode!= null));
        }
        {
            CompanyLegalFormType theCompanyLegalForm;
            theCompanyLegalForm = this.getCompanyLegalForm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "companyLegalForm", theCompanyLegalForm), currentHashCode, theCompanyLegalForm, (this.companyLegalForm!= null));
        }
        {
            List<PersonalSituationType> thePersonalSituation;
            thePersonalSituation = (((this.personalSituation!= null)&&(!this.personalSituation.isEmpty()))?this.getPersonalSituation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "personalSituation", thePersonalSituation), currentHashCode, thePersonalSituation, ((this.personalSituation!= null)&&(!this.personalSituation.isEmpty())));
        }
        {
            OperatingYearsQuantityType theOperatingYearsQuantity;
            theOperatingYearsQuantity = this.getOperatingYearsQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "operatingYearsQuantity", theOperatingYearsQuantity), currentHashCode, theOperatingYearsQuantity, (this.operatingYearsQuantity!= null));
        }
        {
            EmployeeQuantityType theEmployeeQuantity;
            theEmployeeQuantity = this.getEmployeeQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "employeeQuantity", theEmployeeQuantity), currentHashCode, theEmployeeQuantity, (this.employeeQuantity!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            List<ClassificationSchemeType> theRequiredBusinessClassificationScheme;
            theRequiredBusinessClassificationScheme = (((this.requiredBusinessClassificationScheme!= null)&&(!this.requiredBusinessClassificationScheme.isEmpty()))?this.getRequiredBusinessClassificationScheme():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requiredBusinessClassificationScheme", theRequiredBusinessClassificationScheme), currentHashCode, theRequiredBusinessClassificationScheme, ((this.requiredBusinessClassificationScheme!= null)&&(!this.requiredBusinessClassificationScheme.isEmpty())));
        }
        {
            List<EvaluationCriterionType> theTechnicalEvaluationCriterion;
            theTechnicalEvaluationCriterion = (((this.technicalEvaluationCriterion!= null)&&(!this.technicalEvaluationCriterion.isEmpty()))?this.getTechnicalEvaluationCriterion():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "technicalEvaluationCriterion", theTechnicalEvaluationCriterion), currentHashCode, theTechnicalEvaluationCriterion, ((this.technicalEvaluationCriterion!= null)&&(!this.technicalEvaluationCriterion.isEmpty())));
        }
        {
            List<EvaluationCriterionType> theFinancialEvaluationCriterion;
            theFinancialEvaluationCriterion = (((this.financialEvaluationCriterion!= null)&&(!this.financialEvaluationCriterion.isEmpty()))?this.getFinancialEvaluationCriterion():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "financialEvaluationCriterion", theFinancialEvaluationCriterion), currentHashCode, theFinancialEvaluationCriterion, ((this.financialEvaluationCriterion!= null)&&(!this.financialEvaluationCriterion.isEmpty())));
        }
        {
            List<TendererRequirementType> theSpecificTendererRequirement;
            theSpecificTendererRequirement = (((this.specificTendererRequirement!= null)&&(!this.specificTendererRequirement.isEmpty()))?this.getSpecificTendererRequirement():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specificTendererRequirement", theSpecificTendererRequirement), currentHashCode, theSpecificTendererRequirement, ((this.specificTendererRequirement!= null)&&(!this.specificTendererRequirement.isEmpty())));
        }
        {
            List<EconomicOperatorRoleType> theEconomicOperatorRole;
            theEconomicOperatorRole = (((this.economicOperatorRole!= null)&&(!this.economicOperatorRole.isEmpty()))?this.getEconomicOperatorRole():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "economicOperatorRole", theEconomicOperatorRole), currentHashCode, theEconomicOperatorRole, ((this.economicOperatorRole!= null)&&(!this.economicOperatorRole.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
