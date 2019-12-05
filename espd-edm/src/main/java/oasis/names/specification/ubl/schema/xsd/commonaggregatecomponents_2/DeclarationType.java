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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DeclarationTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
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
 * <p>Classe Java per DeclarationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DeclarationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DeclarationTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "DeclarationType", propOrder = {
    "name",
    "declarationTypeCode",
    "description",
    "evidenceSupplied"
})
public class DeclarationType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<NameType> name;
    @XmlElement(name = "DeclarationTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DeclarationTypeCodeType declarationTypeCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "EvidenceSupplied")
    protected List<EvidenceSuppliedType> evidenceSupplied;

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
     * Recupera il valore della proprietà declarationTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationTypeCodeType }
     *     
     */
    public DeclarationTypeCodeType getDeclarationTypeCode() {
        return declarationTypeCode;
    }

    /**
     * Imposta il valore della proprietà declarationTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationTypeCodeType }
     *     
     */
    public void setDeclarationTypeCode(DeclarationTypeCodeType value) {
        this.declarationTypeCode = value;
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
            List<NameType> theName;
            theName = (((this.name!= null)&&(!this.name.isEmpty()))?this.getName():null);
            strategy.appendField(locator, this, "name", buffer, theName, ((this.name!= null)&&(!this.name.isEmpty())));
        }
        {
            DeclarationTypeCodeType theDeclarationTypeCode;
            theDeclarationTypeCode = this.getDeclarationTypeCode();
            strategy.appendField(locator, this, "declarationTypeCode", buffer, theDeclarationTypeCode, (this.declarationTypeCode!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
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
        final DeclarationType that = ((DeclarationType) object);
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
            DeclarationTypeCodeType lhsDeclarationTypeCode;
            lhsDeclarationTypeCode = this.getDeclarationTypeCode();
            DeclarationTypeCodeType rhsDeclarationTypeCode;
            rhsDeclarationTypeCode = that.getDeclarationTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "declarationTypeCode", lhsDeclarationTypeCode), LocatorUtils.property(thatLocator, "declarationTypeCode", rhsDeclarationTypeCode), lhsDeclarationTypeCode, rhsDeclarationTypeCode, (this.declarationTypeCode!= null), (that.declarationTypeCode!= null))) {
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
            List<NameType> theName;
            theName = (((this.name!= null)&&(!this.name.isEmpty()))?this.getName():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, ((this.name!= null)&&(!this.name.isEmpty())));
        }
        {
            DeclarationTypeCodeType theDeclarationTypeCode;
            theDeclarationTypeCode = this.getDeclarationTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "declarationTypeCode", theDeclarationTypeCode), currentHashCode, theDeclarationTypeCode, (this.declarationTypeCode!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
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
