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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CandidateStatementType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ConfidentialityLevelCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EvidenceTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NameType;
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
 * <p>Classe Java per EvidenceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EvidenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EvidenceTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CandidateStatement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConfidentialityLevelCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EvidenceIssuingParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Language" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EvidenceType", propOrder = {
    "id",
    "evidenceTypeCode",
    "name",
    "description",
    "candidateStatement",
    "confidentialityLevelCode",
    "evidenceIssuingParty",
    "documentReference",
    "language"
})
public class EvidenceType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "EvidenceTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EvidenceTypeCodeType evidenceTypeCode;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NameType name;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "CandidateStatement", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<CandidateStatementType> candidateStatement;
    @XmlElement(name = "ConfidentialityLevelCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConfidentialityLevelCodeType confidentialityLevelCode;
    @XmlElement(name = "EvidenceIssuingParty")
    protected PartyType evidenceIssuingParty;
    @XmlElement(name = "DocumentReference")
    protected List<DocumentReferenceType> documentReference;
    @XmlElement(name = "Language")
    protected LanguageType language;

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
     * Recupera il valore della proprietà evidenceTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link EvidenceTypeCodeType }
     *     
     */
    public EvidenceTypeCodeType getEvidenceTypeCode() {
        return evidenceTypeCode;
    }

    /**
     * Imposta il valore della proprietà evidenceTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link EvidenceTypeCodeType }
     *     
     */
    public void setEvidenceTypeCode(EvidenceTypeCodeType value) {
        this.evidenceTypeCode = value;
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
     * Gets the value of the candidateStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the candidateStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCandidateStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CandidateStatementType }
     * 
     * 
     */
    public List<CandidateStatementType> getCandidateStatement() {
        if (candidateStatement == null) {
            candidateStatement = new ArrayList<CandidateStatementType>();
        }
        return this.candidateStatement;
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
     * Recupera il valore della proprietà evidenceIssuingParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getEvidenceIssuingParty() {
        return evidenceIssuingParty;
    }

    /**
     * Imposta il valore della proprietà evidenceIssuingParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setEvidenceIssuingParty(PartyType value) {
        this.evidenceIssuingParty = value;
    }

    /**
     * Gets the value of the documentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getDocumentReference() {
        if (documentReference == null) {
            documentReference = new ArrayList<DocumentReferenceType>();
        }
        return this.documentReference;
    }

    /**
     * Recupera il valore della proprietà language.
     * 
     * @return
     *     possible object is
     *     {@link LanguageType }
     *     
     */
    public LanguageType getLanguage() {
        return language;
    }

    /**
     * Imposta il valore della proprietà language.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageType }
     *     
     */
    public void setLanguage(LanguageType value) {
        this.language = value;
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
            EvidenceTypeCodeType theEvidenceTypeCode;
            theEvidenceTypeCode = this.getEvidenceTypeCode();
            strategy.appendField(locator, this, "evidenceTypeCode", buffer, theEvidenceTypeCode, (this.evidenceTypeCode!= null));
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
            List<CandidateStatementType> theCandidateStatement;
            theCandidateStatement = (((this.candidateStatement!= null)&&(!this.candidateStatement.isEmpty()))?this.getCandidateStatement():null);
            strategy.appendField(locator, this, "candidateStatement", buffer, theCandidateStatement, ((this.candidateStatement!= null)&&(!this.candidateStatement.isEmpty())));
        }
        {
            ConfidentialityLevelCodeType theConfidentialityLevelCode;
            theConfidentialityLevelCode = this.getConfidentialityLevelCode();
            strategy.appendField(locator, this, "confidentialityLevelCode", buffer, theConfidentialityLevelCode, (this.confidentialityLevelCode!= null));
        }
        {
            PartyType theEvidenceIssuingParty;
            theEvidenceIssuingParty = this.getEvidenceIssuingParty();
            strategy.appendField(locator, this, "evidenceIssuingParty", buffer, theEvidenceIssuingParty, (this.evidenceIssuingParty!= null));
        }
        {
            List<DocumentReferenceType> theDocumentReference;
            theDocumentReference = (((this.documentReference!= null)&&(!this.documentReference.isEmpty()))?this.getDocumentReference():null);
            strategy.appendField(locator, this, "documentReference", buffer, theDocumentReference, ((this.documentReference!= null)&&(!this.documentReference.isEmpty())));
        }
        {
            LanguageType theLanguage;
            theLanguage = this.getLanguage();
            strategy.appendField(locator, this, "language", buffer, theLanguage, (this.language!= null));
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
        final EvidenceType that = ((EvidenceType) object);
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
            EvidenceTypeCodeType lhsEvidenceTypeCode;
            lhsEvidenceTypeCode = this.getEvidenceTypeCode();
            EvidenceTypeCodeType rhsEvidenceTypeCode;
            rhsEvidenceTypeCode = that.getEvidenceTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "evidenceTypeCode", lhsEvidenceTypeCode), LocatorUtils.property(thatLocator, "evidenceTypeCode", rhsEvidenceTypeCode), lhsEvidenceTypeCode, rhsEvidenceTypeCode, (this.evidenceTypeCode!= null), (that.evidenceTypeCode!= null))) {
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
            List<CandidateStatementType> lhsCandidateStatement;
            lhsCandidateStatement = (((this.candidateStatement!= null)&&(!this.candidateStatement.isEmpty()))?this.getCandidateStatement():null);
            List<CandidateStatementType> rhsCandidateStatement;
            rhsCandidateStatement = (((that.candidateStatement!= null)&&(!that.candidateStatement.isEmpty()))?that.getCandidateStatement():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "candidateStatement", lhsCandidateStatement), LocatorUtils.property(thatLocator, "candidateStatement", rhsCandidateStatement), lhsCandidateStatement, rhsCandidateStatement, ((this.candidateStatement!= null)&&(!this.candidateStatement.isEmpty())), ((that.candidateStatement!= null)&&(!that.candidateStatement.isEmpty())))) {
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
            PartyType lhsEvidenceIssuingParty;
            lhsEvidenceIssuingParty = this.getEvidenceIssuingParty();
            PartyType rhsEvidenceIssuingParty;
            rhsEvidenceIssuingParty = that.getEvidenceIssuingParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "evidenceIssuingParty", lhsEvidenceIssuingParty), LocatorUtils.property(thatLocator, "evidenceIssuingParty", rhsEvidenceIssuingParty), lhsEvidenceIssuingParty, rhsEvidenceIssuingParty, (this.evidenceIssuingParty!= null), (that.evidenceIssuingParty!= null))) {
                return false;
            }
        }
        {
            List<DocumentReferenceType> lhsDocumentReference;
            lhsDocumentReference = (((this.documentReference!= null)&&(!this.documentReference.isEmpty()))?this.getDocumentReference():null);
            List<DocumentReferenceType> rhsDocumentReference;
            rhsDocumentReference = (((that.documentReference!= null)&&(!that.documentReference.isEmpty()))?that.getDocumentReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentReference", lhsDocumentReference), LocatorUtils.property(thatLocator, "documentReference", rhsDocumentReference), lhsDocumentReference, rhsDocumentReference, ((this.documentReference!= null)&&(!this.documentReference.isEmpty())), ((that.documentReference!= null)&&(!that.documentReference.isEmpty())))) {
                return false;
            }
        }
        {
            LanguageType lhsLanguage;
            lhsLanguage = this.getLanguage();
            LanguageType rhsLanguage;
            rhsLanguage = that.getLanguage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "language", lhsLanguage), LocatorUtils.property(thatLocator, "language", rhsLanguage), lhsLanguage, rhsLanguage, (this.language!= null), (that.language!= null))) {
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
            EvidenceTypeCodeType theEvidenceTypeCode;
            theEvidenceTypeCode = this.getEvidenceTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "evidenceTypeCode", theEvidenceTypeCode), currentHashCode, theEvidenceTypeCode, (this.evidenceTypeCode!= null));
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
            List<CandidateStatementType> theCandidateStatement;
            theCandidateStatement = (((this.candidateStatement!= null)&&(!this.candidateStatement.isEmpty()))?this.getCandidateStatement():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "candidateStatement", theCandidateStatement), currentHashCode, theCandidateStatement, ((this.candidateStatement!= null)&&(!this.candidateStatement.isEmpty())));
        }
        {
            ConfidentialityLevelCodeType theConfidentialityLevelCode;
            theConfidentialityLevelCode = this.getConfidentialityLevelCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "confidentialityLevelCode", theConfidentialityLevelCode), currentHashCode, theConfidentialityLevelCode, (this.confidentialityLevelCode!= null));
        }
        {
            PartyType theEvidenceIssuingParty;
            theEvidenceIssuingParty = this.getEvidenceIssuingParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "evidenceIssuingParty", theEvidenceIssuingParty), currentHashCode, theEvidenceIssuingParty, (this.evidenceIssuingParty!= null));
        }
        {
            List<DocumentReferenceType> theDocumentReference;
            theDocumentReference = (((this.documentReference!= null)&&(!this.documentReference.isEmpty()))?this.getDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentReference", theDocumentReference), currentHashCode, theDocumentReference, ((this.documentReference!= null)&&(!this.documentReference.isEmpty())));
        }
        {
            LanguageType theLanguage;
            theLanguage = this.getLanguage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "language", theLanguage), currentHashCode, theLanguage, (this.language!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
