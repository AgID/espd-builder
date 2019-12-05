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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BusinessClassificationEvidenceIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BusinessIdentityEvidenceIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EmployeeQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.OperatingYearsQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ParticipationPercentType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PersonalSituationType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TendererRoleCodeType;
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
 * <p>Classe Java per QualifyingPartyType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="QualifyingPartyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ParticipationPercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PersonalSituation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OperatingYearsQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EmployeeQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BusinessClassificationEvidenceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BusinessIdentityEvidenceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TendererRoleCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}BusinessClassificationScheme" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TechnicalCapability" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FinancialCapability" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CompletedTask" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Declaration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Party" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EconomicOperatorRole" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualifyingPartyType", propOrder = {
    "participationPercent",
    "personalSituation",
    "operatingYearsQuantity",
    "employeeQuantity",
    "businessClassificationEvidenceID",
    "businessIdentityEvidenceID",
    "tendererRoleCode",
    "businessClassificationScheme",
    "technicalCapability",
    "financialCapability",
    "completedTask",
    "declaration",
    "party",
    "economicOperatorRole"
})
public class QualifyingPartyType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ParticipationPercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ParticipationPercentType participationPercent;
    @XmlElement(name = "PersonalSituation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<PersonalSituationType> personalSituation;
    @XmlElement(name = "OperatingYearsQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OperatingYearsQuantityType operatingYearsQuantity;
    @XmlElement(name = "EmployeeQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EmployeeQuantityType employeeQuantity;
    @XmlElement(name = "BusinessClassificationEvidenceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BusinessClassificationEvidenceIDType businessClassificationEvidenceID;
    @XmlElement(name = "BusinessIdentityEvidenceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BusinessIdentityEvidenceIDType businessIdentityEvidenceID;
    @XmlElement(name = "TendererRoleCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TendererRoleCodeType tendererRoleCode;
    @XmlElement(name = "BusinessClassificationScheme")
    protected ClassificationSchemeType businessClassificationScheme;
    @XmlElement(name = "TechnicalCapability")
    protected List<CapabilityType> technicalCapability;
    @XmlElement(name = "FinancialCapability")
    protected List<CapabilityType> financialCapability;
    @XmlElement(name = "CompletedTask")
    protected List<CompletedTaskType> completedTask;
    @XmlElement(name = "Declaration")
    protected List<DeclarationType> declaration;
    @XmlElement(name = "Party")
    protected PartyType party;
    @XmlElement(name = "EconomicOperatorRole")
    protected EconomicOperatorRoleType economicOperatorRole;

    /**
     * Recupera il valore della proprietà participationPercent.
     * 
     * @return
     *     possible object is
     *     {@link ParticipationPercentType }
     *     
     */
    public ParticipationPercentType getParticipationPercent() {
        return participationPercent;
    }

    /**
     * Imposta il valore della proprietà participationPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipationPercentType }
     *     
     */
    public void setParticipationPercent(ParticipationPercentType value) {
        this.participationPercent = value;
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
     * Recupera il valore della proprietà businessClassificationEvidenceID.
     * 
     * @return
     *     possible object is
     *     {@link BusinessClassificationEvidenceIDType }
     *     
     */
    public BusinessClassificationEvidenceIDType getBusinessClassificationEvidenceID() {
        return businessClassificationEvidenceID;
    }

    /**
     * Imposta il valore della proprietà businessClassificationEvidenceID.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessClassificationEvidenceIDType }
     *     
     */
    public void setBusinessClassificationEvidenceID(BusinessClassificationEvidenceIDType value) {
        this.businessClassificationEvidenceID = value;
    }

    /**
     * Recupera il valore della proprietà businessIdentityEvidenceID.
     * 
     * @return
     *     possible object is
     *     {@link BusinessIdentityEvidenceIDType }
     *     
     */
    public BusinessIdentityEvidenceIDType getBusinessIdentityEvidenceID() {
        return businessIdentityEvidenceID;
    }

    /**
     * Imposta il valore della proprietà businessIdentityEvidenceID.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessIdentityEvidenceIDType }
     *     
     */
    public void setBusinessIdentityEvidenceID(BusinessIdentityEvidenceIDType value) {
        this.businessIdentityEvidenceID = value;
    }

    /**
     * Recupera il valore della proprietà tendererRoleCode.
     * 
     * @return
     *     possible object is
     *     {@link TendererRoleCodeType }
     *     
     */
    public TendererRoleCodeType getTendererRoleCode() {
        return tendererRoleCode;
    }

    /**
     * Imposta il valore della proprietà tendererRoleCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TendererRoleCodeType }
     *     
     */
    public void setTendererRoleCode(TendererRoleCodeType value) {
        this.tendererRoleCode = value;
    }

    /**
     * Recupera il valore della proprietà businessClassificationScheme.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationSchemeType }
     *     
     */
    public ClassificationSchemeType getBusinessClassificationScheme() {
        return businessClassificationScheme;
    }

    /**
     * Imposta il valore della proprietà businessClassificationScheme.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationSchemeType }
     *     
     */
    public void setBusinessClassificationScheme(ClassificationSchemeType value) {
        this.businessClassificationScheme = value;
    }

    /**
     * Gets the value of the technicalCapability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalCapability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalCapability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CapabilityType }
     * 
     * 
     */
    public List<CapabilityType> getTechnicalCapability() {
        if (technicalCapability == null) {
            technicalCapability = new ArrayList<CapabilityType>();
        }
        return this.technicalCapability;
    }

    /**
     * Gets the value of the financialCapability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialCapability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialCapability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CapabilityType }
     * 
     * 
     */
    public List<CapabilityType> getFinancialCapability() {
        if (financialCapability == null) {
            financialCapability = new ArrayList<CapabilityType>();
        }
        return this.financialCapability;
    }

    /**
     * Gets the value of the completedTask property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the completedTask property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompletedTask().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompletedTaskType }
     * 
     * 
     */
    public List<CompletedTaskType> getCompletedTask() {
        if (completedTask == null) {
            completedTask = new ArrayList<CompletedTaskType>();
        }
        return this.completedTask;
    }

    /**
     * Gets the value of the declaration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the declaration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeclaration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeclarationType }
     * 
     * 
     */
    public List<DeclarationType> getDeclaration() {
        if (declaration == null) {
            declaration = new ArrayList<DeclarationType>();
        }
        return this.declaration;
    }

    /**
     * Recupera il valore della proprietà party.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getParty() {
        return party;
    }

    /**
     * Imposta il valore della proprietà party.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setParty(PartyType value) {
        this.party = value;
    }

    /**
     * Recupera il valore della proprietà economicOperatorRole.
     * 
     * @return
     *     possible object is
     *     {@link EconomicOperatorRoleType }
     *     
     */
    public EconomicOperatorRoleType getEconomicOperatorRole() {
        return economicOperatorRole;
    }

    /**
     * Imposta il valore della proprietà economicOperatorRole.
     * 
     * @param value
     *     allowed object is
     *     {@link EconomicOperatorRoleType }
     *     
     */
    public void setEconomicOperatorRole(EconomicOperatorRoleType value) {
        this.economicOperatorRole = value;
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
            ParticipationPercentType theParticipationPercent;
            theParticipationPercent = this.getParticipationPercent();
            strategy.appendField(locator, this, "participationPercent", buffer, theParticipationPercent, (this.participationPercent!= null));
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
            BusinessClassificationEvidenceIDType theBusinessClassificationEvidenceID;
            theBusinessClassificationEvidenceID = this.getBusinessClassificationEvidenceID();
            strategy.appendField(locator, this, "businessClassificationEvidenceID", buffer, theBusinessClassificationEvidenceID, (this.businessClassificationEvidenceID!= null));
        }
        {
            BusinessIdentityEvidenceIDType theBusinessIdentityEvidenceID;
            theBusinessIdentityEvidenceID = this.getBusinessIdentityEvidenceID();
            strategy.appendField(locator, this, "businessIdentityEvidenceID", buffer, theBusinessIdentityEvidenceID, (this.businessIdentityEvidenceID!= null));
        }
        {
            TendererRoleCodeType theTendererRoleCode;
            theTendererRoleCode = this.getTendererRoleCode();
            strategy.appendField(locator, this, "tendererRoleCode", buffer, theTendererRoleCode, (this.tendererRoleCode!= null));
        }
        {
            ClassificationSchemeType theBusinessClassificationScheme;
            theBusinessClassificationScheme = this.getBusinessClassificationScheme();
            strategy.appendField(locator, this, "businessClassificationScheme", buffer, theBusinessClassificationScheme, (this.businessClassificationScheme!= null));
        }
        {
            List<CapabilityType> theTechnicalCapability;
            theTechnicalCapability = (((this.technicalCapability!= null)&&(!this.technicalCapability.isEmpty()))?this.getTechnicalCapability():null);
            strategy.appendField(locator, this, "technicalCapability", buffer, theTechnicalCapability, ((this.technicalCapability!= null)&&(!this.technicalCapability.isEmpty())));
        }
        {
            List<CapabilityType> theFinancialCapability;
            theFinancialCapability = (((this.financialCapability!= null)&&(!this.financialCapability.isEmpty()))?this.getFinancialCapability():null);
            strategy.appendField(locator, this, "financialCapability", buffer, theFinancialCapability, ((this.financialCapability!= null)&&(!this.financialCapability.isEmpty())));
        }
        {
            List<CompletedTaskType> theCompletedTask;
            theCompletedTask = (((this.completedTask!= null)&&(!this.completedTask.isEmpty()))?this.getCompletedTask():null);
            strategy.appendField(locator, this, "completedTask", buffer, theCompletedTask, ((this.completedTask!= null)&&(!this.completedTask.isEmpty())));
        }
        {
            List<DeclarationType> theDeclaration;
            theDeclaration = (((this.declaration!= null)&&(!this.declaration.isEmpty()))?this.getDeclaration():null);
            strategy.appendField(locator, this, "declaration", buffer, theDeclaration, ((this.declaration!= null)&&(!this.declaration.isEmpty())));
        }
        {
            PartyType theParty;
            theParty = this.getParty();
            strategy.appendField(locator, this, "party", buffer, theParty, (this.party!= null));
        }
        {
            EconomicOperatorRoleType theEconomicOperatorRole;
            theEconomicOperatorRole = this.getEconomicOperatorRole();
            strategy.appendField(locator, this, "economicOperatorRole", buffer, theEconomicOperatorRole, (this.economicOperatorRole!= null));
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
        final QualifyingPartyType that = ((QualifyingPartyType) object);
        {
            ParticipationPercentType lhsParticipationPercent;
            lhsParticipationPercent = this.getParticipationPercent();
            ParticipationPercentType rhsParticipationPercent;
            rhsParticipationPercent = that.getParticipationPercent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "participationPercent", lhsParticipationPercent), LocatorUtils.property(thatLocator, "participationPercent", rhsParticipationPercent), lhsParticipationPercent, rhsParticipationPercent, (this.participationPercent!= null), (that.participationPercent!= null))) {
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
            BusinessClassificationEvidenceIDType lhsBusinessClassificationEvidenceID;
            lhsBusinessClassificationEvidenceID = this.getBusinessClassificationEvidenceID();
            BusinessClassificationEvidenceIDType rhsBusinessClassificationEvidenceID;
            rhsBusinessClassificationEvidenceID = that.getBusinessClassificationEvidenceID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "businessClassificationEvidenceID", lhsBusinessClassificationEvidenceID), LocatorUtils.property(thatLocator, "businessClassificationEvidenceID", rhsBusinessClassificationEvidenceID), lhsBusinessClassificationEvidenceID, rhsBusinessClassificationEvidenceID, (this.businessClassificationEvidenceID!= null), (that.businessClassificationEvidenceID!= null))) {
                return false;
            }
        }
        {
            BusinessIdentityEvidenceIDType lhsBusinessIdentityEvidenceID;
            lhsBusinessIdentityEvidenceID = this.getBusinessIdentityEvidenceID();
            BusinessIdentityEvidenceIDType rhsBusinessIdentityEvidenceID;
            rhsBusinessIdentityEvidenceID = that.getBusinessIdentityEvidenceID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "businessIdentityEvidenceID", lhsBusinessIdentityEvidenceID), LocatorUtils.property(thatLocator, "businessIdentityEvidenceID", rhsBusinessIdentityEvidenceID), lhsBusinessIdentityEvidenceID, rhsBusinessIdentityEvidenceID, (this.businessIdentityEvidenceID!= null), (that.businessIdentityEvidenceID!= null))) {
                return false;
            }
        }
        {
            TendererRoleCodeType lhsTendererRoleCode;
            lhsTendererRoleCode = this.getTendererRoleCode();
            TendererRoleCodeType rhsTendererRoleCode;
            rhsTendererRoleCode = that.getTendererRoleCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tendererRoleCode", lhsTendererRoleCode), LocatorUtils.property(thatLocator, "tendererRoleCode", rhsTendererRoleCode), lhsTendererRoleCode, rhsTendererRoleCode, (this.tendererRoleCode!= null), (that.tendererRoleCode!= null))) {
                return false;
            }
        }
        {
            ClassificationSchemeType lhsBusinessClassificationScheme;
            lhsBusinessClassificationScheme = this.getBusinessClassificationScheme();
            ClassificationSchemeType rhsBusinessClassificationScheme;
            rhsBusinessClassificationScheme = that.getBusinessClassificationScheme();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "businessClassificationScheme", lhsBusinessClassificationScheme), LocatorUtils.property(thatLocator, "businessClassificationScheme", rhsBusinessClassificationScheme), lhsBusinessClassificationScheme, rhsBusinessClassificationScheme, (this.businessClassificationScheme!= null), (that.businessClassificationScheme!= null))) {
                return false;
            }
        }
        {
            List<CapabilityType> lhsTechnicalCapability;
            lhsTechnicalCapability = (((this.technicalCapability!= null)&&(!this.technicalCapability.isEmpty()))?this.getTechnicalCapability():null);
            List<CapabilityType> rhsTechnicalCapability;
            rhsTechnicalCapability = (((that.technicalCapability!= null)&&(!that.technicalCapability.isEmpty()))?that.getTechnicalCapability():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "technicalCapability", lhsTechnicalCapability), LocatorUtils.property(thatLocator, "technicalCapability", rhsTechnicalCapability), lhsTechnicalCapability, rhsTechnicalCapability, ((this.technicalCapability!= null)&&(!this.technicalCapability.isEmpty())), ((that.technicalCapability!= null)&&(!that.technicalCapability.isEmpty())))) {
                return false;
            }
        }
        {
            List<CapabilityType> lhsFinancialCapability;
            lhsFinancialCapability = (((this.financialCapability!= null)&&(!this.financialCapability.isEmpty()))?this.getFinancialCapability():null);
            List<CapabilityType> rhsFinancialCapability;
            rhsFinancialCapability = (((that.financialCapability!= null)&&(!that.financialCapability.isEmpty()))?that.getFinancialCapability():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "financialCapability", lhsFinancialCapability), LocatorUtils.property(thatLocator, "financialCapability", rhsFinancialCapability), lhsFinancialCapability, rhsFinancialCapability, ((this.financialCapability!= null)&&(!this.financialCapability.isEmpty())), ((that.financialCapability!= null)&&(!that.financialCapability.isEmpty())))) {
                return false;
            }
        }
        {
            List<CompletedTaskType> lhsCompletedTask;
            lhsCompletedTask = (((this.completedTask!= null)&&(!this.completedTask.isEmpty()))?this.getCompletedTask():null);
            List<CompletedTaskType> rhsCompletedTask;
            rhsCompletedTask = (((that.completedTask!= null)&&(!that.completedTask.isEmpty()))?that.getCompletedTask():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "completedTask", lhsCompletedTask), LocatorUtils.property(thatLocator, "completedTask", rhsCompletedTask), lhsCompletedTask, rhsCompletedTask, ((this.completedTask!= null)&&(!this.completedTask.isEmpty())), ((that.completedTask!= null)&&(!that.completedTask.isEmpty())))) {
                return false;
            }
        }
        {
            List<DeclarationType> lhsDeclaration;
            lhsDeclaration = (((this.declaration!= null)&&(!this.declaration.isEmpty()))?this.getDeclaration():null);
            List<DeclarationType> rhsDeclaration;
            rhsDeclaration = (((that.declaration!= null)&&(!that.declaration.isEmpty()))?that.getDeclaration():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "declaration", lhsDeclaration), LocatorUtils.property(thatLocator, "declaration", rhsDeclaration), lhsDeclaration, rhsDeclaration, ((this.declaration!= null)&&(!this.declaration.isEmpty())), ((that.declaration!= null)&&(!that.declaration.isEmpty())))) {
                return false;
            }
        }
        {
            PartyType lhsParty;
            lhsParty = this.getParty();
            PartyType rhsParty;
            rhsParty = that.getParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "party", lhsParty), LocatorUtils.property(thatLocator, "party", rhsParty), lhsParty, rhsParty, (this.party!= null), (that.party!= null))) {
                return false;
            }
        }
        {
            EconomicOperatorRoleType lhsEconomicOperatorRole;
            lhsEconomicOperatorRole = this.getEconomicOperatorRole();
            EconomicOperatorRoleType rhsEconomicOperatorRole;
            rhsEconomicOperatorRole = that.getEconomicOperatorRole();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "economicOperatorRole", lhsEconomicOperatorRole), LocatorUtils.property(thatLocator, "economicOperatorRole", rhsEconomicOperatorRole), lhsEconomicOperatorRole, rhsEconomicOperatorRole, (this.economicOperatorRole!= null), (that.economicOperatorRole!= null))) {
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
            ParticipationPercentType theParticipationPercent;
            theParticipationPercent = this.getParticipationPercent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "participationPercent", theParticipationPercent), currentHashCode, theParticipationPercent, (this.participationPercent!= null));
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
            BusinessClassificationEvidenceIDType theBusinessClassificationEvidenceID;
            theBusinessClassificationEvidenceID = this.getBusinessClassificationEvidenceID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "businessClassificationEvidenceID", theBusinessClassificationEvidenceID), currentHashCode, theBusinessClassificationEvidenceID, (this.businessClassificationEvidenceID!= null));
        }
        {
            BusinessIdentityEvidenceIDType theBusinessIdentityEvidenceID;
            theBusinessIdentityEvidenceID = this.getBusinessIdentityEvidenceID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "businessIdentityEvidenceID", theBusinessIdentityEvidenceID), currentHashCode, theBusinessIdentityEvidenceID, (this.businessIdentityEvidenceID!= null));
        }
        {
            TendererRoleCodeType theTendererRoleCode;
            theTendererRoleCode = this.getTendererRoleCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tendererRoleCode", theTendererRoleCode), currentHashCode, theTendererRoleCode, (this.tendererRoleCode!= null));
        }
        {
            ClassificationSchemeType theBusinessClassificationScheme;
            theBusinessClassificationScheme = this.getBusinessClassificationScheme();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "businessClassificationScheme", theBusinessClassificationScheme), currentHashCode, theBusinessClassificationScheme, (this.businessClassificationScheme!= null));
        }
        {
            List<CapabilityType> theTechnicalCapability;
            theTechnicalCapability = (((this.technicalCapability!= null)&&(!this.technicalCapability.isEmpty()))?this.getTechnicalCapability():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "technicalCapability", theTechnicalCapability), currentHashCode, theTechnicalCapability, ((this.technicalCapability!= null)&&(!this.technicalCapability.isEmpty())));
        }
        {
            List<CapabilityType> theFinancialCapability;
            theFinancialCapability = (((this.financialCapability!= null)&&(!this.financialCapability.isEmpty()))?this.getFinancialCapability():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "financialCapability", theFinancialCapability), currentHashCode, theFinancialCapability, ((this.financialCapability!= null)&&(!this.financialCapability.isEmpty())));
        }
        {
            List<CompletedTaskType> theCompletedTask;
            theCompletedTask = (((this.completedTask!= null)&&(!this.completedTask.isEmpty()))?this.getCompletedTask():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "completedTask", theCompletedTask), currentHashCode, theCompletedTask, ((this.completedTask!= null)&&(!this.completedTask.isEmpty())));
        }
        {
            List<DeclarationType> theDeclaration;
            theDeclaration = (((this.declaration!= null)&&(!this.declaration.isEmpty()))?this.getDeclaration():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "declaration", theDeclaration), currentHashCode, theDeclaration, ((this.declaration!= null)&&(!this.declaration.isEmpty())));
        }
        {
            PartyType theParty;
            theParty = this.getParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "party", theParty), currentHashCode, theParty, (this.party!= null));
        }
        {
            EconomicOperatorRoleType theEconomicOperatorRole;
            theEconomicOperatorRole = this.getEconomicOperatorRole();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "economicOperatorRole", theEconomicOperatorRole), currentHashCode, theEconomicOperatorRole, (this.economicOperatorRole!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
