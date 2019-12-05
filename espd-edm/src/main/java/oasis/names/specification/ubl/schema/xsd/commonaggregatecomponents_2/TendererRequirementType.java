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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LegalReferenceType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TendererRequirementTypeCodeType;
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
 * <p>Classe Java per TendererRequirementType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TendererRequirementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TendererRequirementTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LegalReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SuggestedEvidence" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TendererRequirementType", propOrder = {
    "name",
    "tendererRequirementTypeCode",
    "description",
    "legalReference",
    "suggestedEvidence"
})
public class TendererRequirementType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<NameType> name;
    @XmlElement(name = "TendererRequirementTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TendererRequirementTypeCodeType tendererRequirementTypeCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "LegalReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LegalReferenceType legalReference;
    @XmlElement(name = "SuggestedEvidence")
    protected List<EvidenceType> suggestedEvidence;

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getName() {
        if (name == null) {
            name = new ArrayList<NameType>();
        }
        return this.name;
    }

    /**
     * Recupera il valore della proprietà tendererRequirementTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link TendererRequirementTypeCodeType }
     *     
     */
    public TendererRequirementTypeCodeType getTendererRequirementTypeCode() {
        return tendererRequirementTypeCode;
    }

    /**
     * Imposta il valore della proprietà tendererRequirementTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TendererRequirementTypeCodeType }
     *     
     */
    public void setTendererRequirementTypeCode(TendererRequirementTypeCodeType value) {
        this.tendererRequirementTypeCode = value;
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
     * Recupera il valore della proprietà legalReference.
     * 
     * @return
     *     possible object is
     *     {@link LegalReferenceType }
     *     
     */
    public LegalReferenceType getLegalReference() {
        return legalReference;
    }

    /**
     * Imposta il valore della proprietà legalReference.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalReferenceType }
     *     
     */
    public void setLegalReference(LegalReferenceType value) {
        this.legalReference = value;
    }

    /**
     * Gets the value of the suggestedEvidence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suggestedEvidence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuggestedEvidence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EvidenceType }
     * 
     * 
     */
    public List<EvidenceType> getSuggestedEvidence() {
        if (suggestedEvidence == null) {
            suggestedEvidence = new ArrayList<EvidenceType>();
        }
        return this.suggestedEvidence;
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
            List<NameType> theName;
            theName = (((this.name!= null)&&(!this.name.isEmpty()))?this.getName():null);
            strategy.appendField(locator, this, "name", buffer, theName, ((this.name!= null)&&(!this.name.isEmpty())));
        }
        {
            TendererRequirementTypeCodeType theTendererRequirementTypeCode;
            theTendererRequirementTypeCode = this.getTendererRequirementTypeCode();
            strategy.appendField(locator, this, "tendererRequirementTypeCode", buffer, theTendererRequirementTypeCode, (this.tendererRequirementTypeCode!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            LegalReferenceType theLegalReference;
            theLegalReference = this.getLegalReference();
            strategy.appendField(locator, this, "legalReference", buffer, theLegalReference, (this.legalReference!= null));
        }
        {
            List<EvidenceType> theSuggestedEvidence;
            theSuggestedEvidence = (((this.suggestedEvidence!= null)&&(!this.suggestedEvidence.isEmpty()))?this.getSuggestedEvidence():null);
            strategy.appendField(locator, this, "suggestedEvidence", buffer, theSuggestedEvidence, ((this.suggestedEvidence!= null)&&(!this.suggestedEvidence.isEmpty())));
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
        final TendererRequirementType that = ((TendererRequirementType) object);
        {
            List<NameType> lhsName;
            lhsName = (((this.name!= null)&&(!this.name.isEmpty()))?this.getName():null);
            List<NameType> rhsName;
            rhsName = (((that.name!= null)&&(!that.name.isEmpty()))?that.getName():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, ((this.name!= null)&&(!this.name.isEmpty())), ((that.name!= null)&&(!that.name.isEmpty())))) {
                return false;
            }
        }
        {
            TendererRequirementTypeCodeType lhsTendererRequirementTypeCode;
            lhsTendererRequirementTypeCode = this.getTendererRequirementTypeCode();
            TendererRequirementTypeCodeType rhsTendererRequirementTypeCode;
            rhsTendererRequirementTypeCode = that.getTendererRequirementTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tendererRequirementTypeCode", lhsTendererRequirementTypeCode), LocatorUtils.property(thatLocator, "tendererRequirementTypeCode", rhsTendererRequirementTypeCode), lhsTendererRequirementTypeCode, rhsTendererRequirementTypeCode, (this.tendererRequirementTypeCode!= null), (that.tendererRequirementTypeCode!= null))) {
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
            LegalReferenceType lhsLegalReference;
            lhsLegalReference = this.getLegalReference();
            LegalReferenceType rhsLegalReference;
            rhsLegalReference = that.getLegalReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "legalReference", lhsLegalReference), LocatorUtils.property(thatLocator, "legalReference", rhsLegalReference), lhsLegalReference, rhsLegalReference, (this.legalReference!= null), (that.legalReference!= null))) {
                return false;
            }
        }
        {
            List<EvidenceType> lhsSuggestedEvidence;
            lhsSuggestedEvidence = (((this.suggestedEvidence!= null)&&(!this.suggestedEvidence.isEmpty()))?this.getSuggestedEvidence():null);
            List<EvidenceType> rhsSuggestedEvidence;
            rhsSuggestedEvidence = (((that.suggestedEvidence!= null)&&(!that.suggestedEvidence.isEmpty()))?that.getSuggestedEvidence():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "suggestedEvidence", lhsSuggestedEvidence), LocatorUtils.property(thatLocator, "suggestedEvidence", rhsSuggestedEvidence), lhsSuggestedEvidence, rhsSuggestedEvidence, ((this.suggestedEvidence!= null)&&(!this.suggestedEvidence.isEmpty())), ((that.suggestedEvidence!= null)&&(!that.suggestedEvidence.isEmpty())))) {
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
            List<NameType> theName;
            theName = (((this.name!= null)&&(!this.name.isEmpty()))?this.getName():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, ((this.name!= null)&&(!this.name.isEmpty())));
        }
        {
            TendererRequirementTypeCodeType theTendererRequirementTypeCode;
            theTendererRequirementTypeCode = this.getTendererRequirementTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tendererRequirementTypeCode", theTendererRequirementTypeCode), currentHashCode, theTendererRequirementTypeCode, (this.tendererRequirementTypeCode!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            LegalReferenceType theLegalReference;
            theLegalReference = this.getLegalReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "legalReference", theLegalReference), currentHashCode, theLegalReference, (this.legalReference!= null));
        }
        {
            List<EvidenceType> theSuggestedEvidence;
            theSuggestedEvidence = (((this.suggestedEvidence!= null)&&(!this.suggestedEvidence.isEmpty()))?this.getSuggestedEvidence():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "suggestedEvidence", theSuggestedEvidence), currentHashCode, theSuggestedEvidence, ((this.suggestedEvidence!= null)&&(!this.suggestedEvidence.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
