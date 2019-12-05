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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ProfileIDType;
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
 * <p>Classe Java per DigitalProcessType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DigitalProcessType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProfileID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DigitalCollaboration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CertificationDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DigitalProcessType", propOrder = {
    "id",
    "description",
    "profileID",
    "digitalCollaboration",
    "certificationDocumentReference"
})
public class DigitalProcessType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "ProfileID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ProfileIDType profileID;
    @XmlElement(name = "DigitalCollaboration")
    protected List<DigitalCollaborationType> digitalCollaboration;
    @XmlElement(name = "CertificationDocumentReference")
    protected List<DocumentReferenceType> certificationDocumentReference;

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
     * Recupera il valore della proprietà profileID.
     * 
     * @return
     *     possible object is
     *     {@link ProfileIDType }
     *     
     */
    public ProfileIDType getProfileID() {
        return profileID;
    }

    /**
     * Imposta il valore della proprietà profileID.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileIDType }
     *     
     */
    public void setProfileID(ProfileIDType value) {
        this.profileID = value;
    }

    /**
     * Gets the value of the digitalCollaboration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the digitalCollaboration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDigitalCollaboration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DigitalCollaborationType }
     * 
     * 
     */
    public List<DigitalCollaborationType> getDigitalCollaboration() {
        if (digitalCollaboration == null) {
            digitalCollaboration = new ArrayList<DigitalCollaborationType>();
        }
        return this.digitalCollaboration;
    }

    /**
     * Gets the value of the certificationDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificationDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificationDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getCertificationDocumentReference() {
        if (certificationDocumentReference == null) {
            certificationDocumentReference = new ArrayList<DocumentReferenceType>();
        }
        return this.certificationDocumentReference;
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
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            ProfileIDType theProfileID;
            theProfileID = this.getProfileID();
            strategy.appendField(locator, this, "profileID", buffer, theProfileID, (this.profileID!= null));
        }
        {
            List<DigitalCollaborationType> theDigitalCollaboration;
            theDigitalCollaboration = (((this.digitalCollaboration!= null)&&(!this.digitalCollaboration.isEmpty()))?this.getDigitalCollaboration():null);
            strategy.appendField(locator, this, "digitalCollaboration", buffer, theDigitalCollaboration, ((this.digitalCollaboration!= null)&&(!this.digitalCollaboration.isEmpty())));
        }
        {
            List<DocumentReferenceType> theCertificationDocumentReference;
            theCertificationDocumentReference = (((this.certificationDocumentReference!= null)&&(!this.certificationDocumentReference.isEmpty()))?this.getCertificationDocumentReference():null);
            strategy.appendField(locator, this, "certificationDocumentReference", buffer, theCertificationDocumentReference, ((this.certificationDocumentReference!= null)&&(!this.certificationDocumentReference.isEmpty())));
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
        final DigitalProcessType that = ((DigitalProcessType) object);
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
            List<DescriptionType> lhsDescription;
            lhsDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            List<DescriptionType> rhsDescription;
            rhsDescription = (((that.description!= null)&&(!that.description.isEmpty()))?that.getDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, ((this.description!= null)&&(!this.description.isEmpty())), ((that.description!= null)&&(!that.description.isEmpty())))) {
                return false;
            }
        }
        {
            ProfileIDType lhsProfileID;
            lhsProfileID = this.getProfileID();
            ProfileIDType rhsProfileID;
            rhsProfileID = that.getProfileID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "profileID", lhsProfileID), LocatorUtils.property(thatLocator, "profileID", rhsProfileID), lhsProfileID, rhsProfileID, (this.profileID!= null), (that.profileID!= null))) {
                return false;
            }
        }
        {
            List<DigitalCollaborationType> lhsDigitalCollaboration;
            lhsDigitalCollaboration = (((this.digitalCollaboration!= null)&&(!this.digitalCollaboration.isEmpty()))?this.getDigitalCollaboration():null);
            List<DigitalCollaborationType> rhsDigitalCollaboration;
            rhsDigitalCollaboration = (((that.digitalCollaboration!= null)&&(!that.digitalCollaboration.isEmpty()))?that.getDigitalCollaboration():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "digitalCollaboration", lhsDigitalCollaboration), LocatorUtils.property(thatLocator, "digitalCollaboration", rhsDigitalCollaboration), lhsDigitalCollaboration, rhsDigitalCollaboration, ((this.digitalCollaboration!= null)&&(!this.digitalCollaboration.isEmpty())), ((that.digitalCollaboration!= null)&&(!that.digitalCollaboration.isEmpty())))) {
                return false;
            }
        }
        {
            List<DocumentReferenceType> lhsCertificationDocumentReference;
            lhsCertificationDocumentReference = (((this.certificationDocumentReference!= null)&&(!this.certificationDocumentReference.isEmpty()))?this.getCertificationDocumentReference():null);
            List<DocumentReferenceType> rhsCertificationDocumentReference;
            rhsCertificationDocumentReference = (((that.certificationDocumentReference!= null)&&(!that.certificationDocumentReference.isEmpty()))?that.getCertificationDocumentReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "certificationDocumentReference", lhsCertificationDocumentReference), LocatorUtils.property(thatLocator, "certificationDocumentReference", rhsCertificationDocumentReference), lhsCertificationDocumentReference, rhsCertificationDocumentReference, ((this.certificationDocumentReference!= null)&&(!this.certificationDocumentReference.isEmpty())), ((that.certificationDocumentReference!= null)&&(!that.certificationDocumentReference.isEmpty())))) {
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
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            ProfileIDType theProfileID;
            theProfileID = this.getProfileID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "profileID", theProfileID), currentHashCode, theProfileID, (this.profileID!= null));
        }
        {
            List<DigitalCollaborationType> theDigitalCollaboration;
            theDigitalCollaboration = (((this.digitalCollaboration!= null)&&(!this.digitalCollaboration.isEmpty()))?this.getDigitalCollaboration():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "digitalCollaboration", theDigitalCollaboration), currentHashCode, theDigitalCollaboration, ((this.digitalCollaboration!= null)&&(!this.digitalCollaboration.isEmpty())));
        }
        {
            List<DocumentReferenceType> theCertificationDocumentReference;
            theCertificationDocumentReference = (((this.certificationDocumentReference!= null)&&(!this.certificationDocumentReference.isEmpty()))?this.getCertificationDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "certificationDocumentReference", theCertificationDocumentReference), currentHashCode, theCertificationDocumentReference, ((this.certificationDocumentReference!= null)&&(!this.certificationDocumentReference.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
