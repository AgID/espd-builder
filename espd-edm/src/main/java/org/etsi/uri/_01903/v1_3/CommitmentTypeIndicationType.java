//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package org.etsi.uri._01903.v1_3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
 * <p>Classe Java per CommitmentTypeIndicationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CommitmentTypeIndicationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CommitmentTypeId" type="{http://uri.etsi.org/01903/v1.3.2#}ObjectIdentifierType"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ObjectReference" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/&gt;
 *           &lt;element name="AllSignedDataObjects" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="CommitmentTypeQualifiers" type="{http://uri.etsi.org/01903/v1.3.2#}CommitmentTypeQualifiersListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommitmentTypeIndicationType", propOrder = {
    "commitmentTypeId",
    "objectReference",
    "allSignedDataObjects",
    "commitmentTypeQualifiers"
})
public class CommitmentTypeIndicationType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "CommitmentTypeId", required = true)
    protected ObjectIdentifierType commitmentTypeId;
    @XmlElement(name = "ObjectReference")
    @XmlSchemaType(name = "anyURI")
    protected List<String> objectReference;
    @XmlElement(name = "AllSignedDataObjects")
    protected Object allSignedDataObjects;
    @XmlElement(name = "CommitmentTypeQualifiers")
    protected CommitmentTypeQualifiersListType commitmentTypeQualifiers;

    /**
     * Recupera il valore della proprietà commitmentTypeId.
     * 
     * @return
     *     possible object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public ObjectIdentifierType getCommitmentTypeId() {
        return commitmentTypeId;
    }

    /**
     * Imposta il valore della proprietà commitmentTypeId.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public void setCommitmentTypeId(ObjectIdentifierType value) {
        this.commitmentTypeId = value;
    }

    /**
     * Gets the value of the objectReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getObjectReference() {
        if (objectReference == null) {
            objectReference = new ArrayList<String>();
        }
        return this.objectReference;
    }

    /**
     * Recupera il valore della proprietà allSignedDataObjects.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAllSignedDataObjects() {
        return allSignedDataObjects;
    }

    /**
     * Imposta il valore della proprietà allSignedDataObjects.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAllSignedDataObjects(Object value) {
        this.allSignedDataObjects = value;
    }

    /**
     * Recupera il valore della proprietà commitmentTypeQualifiers.
     * 
     * @return
     *     possible object is
     *     {@link CommitmentTypeQualifiersListType }
     *     
     */
    public CommitmentTypeQualifiersListType getCommitmentTypeQualifiers() {
        return commitmentTypeQualifiers;
    }

    /**
     * Imposta il valore della proprietà commitmentTypeQualifiers.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitmentTypeQualifiersListType }
     *     
     */
    public void setCommitmentTypeQualifiers(CommitmentTypeQualifiersListType value) {
        this.commitmentTypeQualifiers = value;
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
            ObjectIdentifierType theCommitmentTypeId;
            theCommitmentTypeId = this.getCommitmentTypeId();
            strategy.appendField(locator, this, "commitmentTypeId", buffer, theCommitmentTypeId, (this.commitmentTypeId!= null));
        }
        {
            List<String> theObjectReference;
            theObjectReference = (((this.objectReference!= null)&&(!this.objectReference.isEmpty()))?this.getObjectReference():null);
            strategy.appendField(locator, this, "objectReference", buffer, theObjectReference, ((this.objectReference!= null)&&(!this.objectReference.isEmpty())));
        }
        {
            Object theAllSignedDataObjects;
            theAllSignedDataObjects = this.getAllSignedDataObjects();
            strategy.appendField(locator, this, "allSignedDataObjects", buffer, theAllSignedDataObjects, (this.allSignedDataObjects!= null));
        }
        {
            CommitmentTypeQualifiersListType theCommitmentTypeQualifiers;
            theCommitmentTypeQualifiers = this.getCommitmentTypeQualifiers();
            strategy.appendField(locator, this, "commitmentTypeQualifiers", buffer, theCommitmentTypeQualifiers, (this.commitmentTypeQualifiers!= null));
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
        final CommitmentTypeIndicationType that = ((CommitmentTypeIndicationType) object);
        {
            ObjectIdentifierType lhsCommitmentTypeId;
            lhsCommitmentTypeId = this.getCommitmentTypeId();
            ObjectIdentifierType rhsCommitmentTypeId;
            rhsCommitmentTypeId = that.getCommitmentTypeId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "commitmentTypeId", lhsCommitmentTypeId), LocatorUtils.property(thatLocator, "commitmentTypeId", rhsCommitmentTypeId), lhsCommitmentTypeId, rhsCommitmentTypeId, (this.commitmentTypeId!= null), (that.commitmentTypeId!= null))) {
                return false;
            }
        }
        {
            List<String> lhsObjectReference;
            lhsObjectReference = (((this.objectReference!= null)&&(!this.objectReference.isEmpty()))?this.getObjectReference():null);
            List<String> rhsObjectReference;
            rhsObjectReference = (((that.objectReference!= null)&&(!that.objectReference.isEmpty()))?that.getObjectReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objectReference", lhsObjectReference), LocatorUtils.property(thatLocator, "objectReference", rhsObjectReference), lhsObjectReference, rhsObjectReference, ((this.objectReference!= null)&&(!this.objectReference.isEmpty())), ((that.objectReference!= null)&&(!that.objectReference.isEmpty())))) {
                return false;
            }
        }
        {
            Object lhsAllSignedDataObjects;
            lhsAllSignedDataObjects = this.getAllSignedDataObjects();
            Object rhsAllSignedDataObjects;
            rhsAllSignedDataObjects = that.getAllSignedDataObjects();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "allSignedDataObjects", lhsAllSignedDataObjects), LocatorUtils.property(thatLocator, "allSignedDataObjects", rhsAllSignedDataObjects), lhsAllSignedDataObjects, rhsAllSignedDataObjects, (this.allSignedDataObjects!= null), (that.allSignedDataObjects!= null))) {
                return false;
            }
        }
        {
            CommitmentTypeQualifiersListType lhsCommitmentTypeQualifiers;
            lhsCommitmentTypeQualifiers = this.getCommitmentTypeQualifiers();
            CommitmentTypeQualifiersListType rhsCommitmentTypeQualifiers;
            rhsCommitmentTypeQualifiers = that.getCommitmentTypeQualifiers();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "commitmentTypeQualifiers", lhsCommitmentTypeQualifiers), LocatorUtils.property(thatLocator, "commitmentTypeQualifiers", rhsCommitmentTypeQualifiers), lhsCommitmentTypeQualifiers, rhsCommitmentTypeQualifiers, (this.commitmentTypeQualifiers!= null), (that.commitmentTypeQualifiers!= null))) {
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
            ObjectIdentifierType theCommitmentTypeId;
            theCommitmentTypeId = this.getCommitmentTypeId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "commitmentTypeId", theCommitmentTypeId), currentHashCode, theCommitmentTypeId, (this.commitmentTypeId!= null));
        }
        {
            List<String> theObjectReference;
            theObjectReference = (((this.objectReference!= null)&&(!this.objectReference.isEmpty()))?this.getObjectReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "objectReference", theObjectReference), currentHashCode, theObjectReference, ((this.objectReference!= null)&&(!this.objectReference.isEmpty())));
        }
        {
            Object theAllSignedDataObjects;
            theAllSignedDataObjects = this.getAllSignedDataObjects();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allSignedDataObjects", theAllSignedDataObjects), currentHashCode, theAllSignedDataObjects, (this.allSignedDataObjects!= null));
        }
        {
            CommitmentTypeQualifiersListType theCommitmentTypeQualifiers;
            theCommitmentTypeQualifiers = this.getCommitmentTypeQualifiers();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "commitmentTypeQualifiers", theCommitmentTypeQualifiers), currentHashCode, theCommitmentTypeQualifiers, (this.commitmentTypeQualifiers!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
