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
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * <p>Classe Java per SignedDataObjectPropertiesType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SignedDataObjectPropertiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}DataObjectFormat" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}CommitmentTypeIndication" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}AllDataObjectsTimeStamp" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}IndividualDataObjectsTimeStamp" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignedDataObjectPropertiesType", propOrder = {
    "dataObjectFormat",
    "commitmentTypeIndication",
    "allDataObjectsTimeStamp",
    "individualDataObjectsTimeStamp",
    "any"
})
public class SignedDataObjectPropertiesType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "DataObjectFormat")
    protected List<DataObjectFormatType> dataObjectFormat;
    @XmlElement(name = "CommitmentTypeIndication")
    protected List<CommitmentTypeIndicationType> commitmentTypeIndication;
    @XmlElement(name = "AllDataObjectsTimeStamp")
    protected List<XAdESTimeStampType> allDataObjectsTimeStamp;
    @XmlElement(name = "IndividualDataObjectsTimeStamp")
    protected List<XAdESTimeStampType> individualDataObjectsTimeStamp;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the dataObjectFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataObjectFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataObjectFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataObjectFormatType }
     * 
     * 
     */
    public List<DataObjectFormatType> getDataObjectFormat() {
        if (dataObjectFormat == null) {
            dataObjectFormat = new ArrayList<DataObjectFormatType>();
        }
        return this.dataObjectFormat;
    }

    /**
     * Gets the value of the commitmentTypeIndication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commitmentTypeIndication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommitmentTypeIndication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommitmentTypeIndicationType }
     * 
     * 
     */
    public List<CommitmentTypeIndicationType> getCommitmentTypeIndication() {
        if (commitmentTypeIndication == null) {
            commitmentTypeIndication = new ArrayList<CommitmentTypeIndicationType>();
        }
        return this.commitmentTypeIndication;
    }

    /**
     * Gets the value of the allDataObjectsTimeStamp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allDataObjectsTimeStamp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllDataObjectsTimeStamp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XAdESTimeStampType }
     * 
     * 
     */
    public List<XAdESTimeStampType> getAllDataObjectsTimeStamp() {
        if (allDataObjectsTimeStamp == null) {
            allDataObjectsTimeStamp = new ArrayList<XAdESTimeStampType>();
        }
        return this.allDataObjectsTimeStamp;
    }

    /**
     * Gets the value of the individualDataObjectsTimeStamp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the individualDataObjectsTimeStamp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndividualDataObjectsTimeStamp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XAdESTimeStampType }
     * 
     * 
     */
    public List<XAdESTimeStampType> getIndividualDataObjectsTimeStamp() {
        if (individualDataObjectsTimeStamp == null) {
            individualDataObjectsTimeStamp = new ArrayList<XAdESTimeStampType>();
        }
        return this.individualDataObjectsTimeStamp;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
            List<DataObjectFormatType> theDataObjectFormat;
            theDataObjectFormat = (((this.dataObjectFormat!= null)&&(!this.dataObjectFormat.isEmpty()))?this.getDataObjectFormat():null);
            strategy.appendField(locator, this, "dataObjectFormat", buffer, theDataObjectFormat, ((this.dataObjectFormat!= null)&&(!this.dataObjectFormat.isEmpty())));
        }
        {
            List<CommitmentTypeIndicationType> theCommitmentTypeIndication;
            theCommitmentTypeIndication = (((this.commitmentTypeIndication!= null)&&(!this.commitmentTypeIndication.isEmpty()))?this.getCommitmentTypeIndication():null);
            strategy.appendField(locator, this, "commitmentTypeIndication", buffer, theCommitmentTypeIndication, ((this.commitmentTypeIndication!= null)&&(!this.commitmentTypeIndication.isEmpty())));
        }
        {
            List<XAdESTimeStampType> theAllDataObjectsTimeStamp;
            theAllDataObjectsTimeStamp = (((this.allDataObjectsTimeStamp!= null)&&(!this.allDataObjectsTimeStamp.isEmpty()))?this.getAllDataObjectsTimeStamp():null);
            strategy.appendField(locator, this, "allDataObjectsTimeStamp", buffer, theAllDataObjectsTimeStamp, ((this.allDataObjectsTimeStamp!= null)&&(!this.allDataObjectsTimeStamp.isEmpty())));
        }
        {
            List<XAdESTimeStampType> theIndividualDataObjectsTimeStamp;
            theIndividualDataObjectsTimeStamp = (((this.individualDataObjectsTimeStamp!= null)&&(!this.individualDataObjectsTimeStamp.isEmpty()))?this.getIndividualDataObjectsTimeStamp():null);
            strategy.appendField(locator, this, "individualDataObjectsTimeStamp", buffer, theIndividualDataObjectsTimeStamp, ((this.individualDataObjectsTimeStamp!= null)&&(!this.individualDataObjectsTimeStamp.isEmpty())));
        }
        {
            List<Object> theAny;
            theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
            strategy.appendField(locator, this, "any", buffer, theAny, ((this.any!= null)&&(!this.any.isEmpty())));
        }
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId, (this.id!= null));
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
        final SignedDataObjectPropertiesType that = ((SignedDataObjectPropertiesType) object);
        {
            List<DataObjectFormatType> lhsDataObjectFormat;
            lhsDataObjectFormat = (((this.dataObjectFormat!= null)&&(!this.dataObjectFormat.isEmpty()))?this.getDataObjectFormat():null);
            List<DataObjectFormatType> rhsDataObjectFormat;
            rhsDataObjectFormat = (((that.dataObjectFormat!= null)&&(!that.dataObjectFormat.isEmpty()))?that.getDataObjectFormat():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataObjectFormat", lhsDataObjectFormat), LocatorUtils.property(thatLocator, "dataObjectFormat", rhsDataObjectFormat), lhsDataObjectFormat, rhsDataObjectFormat, ((this.dataObjectFormat!= null)&&(!this.dataObjectFormat.isEmpty())), ((that.dataObjectFormat!= null)&&(!that.dataObjectFormat.isEmpty())))) {
                return false;
            }
        }
        {
            List<CommitmentTypeIndicationType> lhsCommitmentTypeIndication;
            lhsCommitmentTypeIndication = (((this.commitmentTypeIndication!= null)&&(!this.commitmentTypeIndication.isEmpty()))?this.getCommitmentTypeIndication():null);
            List<CommitmentTypeIndicationType> rhsCommitmentTypeIndication;
            rhsCommitmentTypeIndication = (((that.commitmentTypeIndication!= null)&&(!that.commitmentTypeIndication.isEmpty()))?that.getCommitmentTypeIndication():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "commitmentTypeIndication", lhsCommitmentTypeIndication), LocatorUtils.property(thatLocator, "commitmentTypeIndication", rhsCommitmentTypeIndication), lhsCommitmentTypeIndication, rhsCommitmentTypeIndication, ((this.commitmentTypeIndication!= null)&&(!this.commitmentTypeIndication.isEmpty())), ((that.commitmentTypeIndication!= null)&&(!that.commitmentTypeIndication.isEmpty())))) {
                return false;
            }
        }
        {
            List<XAdESTimeStampType> lhsAllDataObjectsTimeStamp;
            lhsAllDataObjectsTimeStamp = (((this.allDataObjectsTimeStamp!= null)&&(!this.allDataObjectsTimeStamp.isEmpty()))?this.getAllDataObjectsTimeStamp():null);
            List<XAdESTimeStampType> rhsAllDataObjectsTimeStamp;
            rhsAllDataObjectsTimeStamp = (((that.allDataObjectsTimeStamp!= null)&&(!that.allDataObjectsTimeStamp.isEmpty()))?that.getAllDataObjectsTimeStamp():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "allDataObjectsTimeStamp", lhsAllDataObjectsTimeStamp), LocatorUtils.property(thatLocator, "allDataObjectsTimeStamp", rhsAllDataObjectsTimeStamp), lhsAllDataObjectsTimeStamp, rhsAllDataObjectsTimeStamp, ((this.allDataObjectsTimeStamp!= null)&&(!this.allDataObjectsTimeStamp.isEmpty())), ((that.allDataObjectsTimeStamp!= null)&&(!that.allDataObjectsTimeStamp.isEmpty())))) {
                return false;
            }
        }
        {
            List<XAdESTimeStampType> lhsIndividualDataObjectsTimeStamp;
            lhsIndividualDataObjectsTimeStamp = (((this.individualDataObjectsTimeStamp!= null)&&(!this.individualDataObjectsTimeStamp.isEmpty()))?this.getIndividualDataObjectsTimeStamp():null);
            List<XAdESTimeStampType> rhsIndividualDataObjectsTimeStamp;
            rhsIndividualDataObjectsTimeStamp = (((that.individualDataObjectsTimeStamp!= null)&&(!that.individualDataObjectsTimeStamp.isEmpty()))?that.getIndividualDataObjectsTimeStamp():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "individualDataObjectsTimeStamp", lhsIndividualDataObjectsTimeStamp), LocatorUtils.property(thatLocator, "individualDataObjectsTimeStamp", rhsIndividualDataObjectsTimeStamp), lhsIndividualDataObjectsTimeStamp, rhsIndividualDataObjectsTimeStamp, ((this.individualDataObjectsTimeStamp!= null)&&(!this.individualDataObjectsTimeStamp.isEmpty())), ((that.individualDataObjectsTimeStamp!= null)&&(!that.individualDataObjectsTimeStamp.isEmpty())))) {
                return false;
            }
        }
        {
            List<Object> lhsAny;
            lhsAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
            List<Object> rhsAny;
            rhsAny = (((that.any!= null)&&(!that.any.isEmpty()))?that.getAny():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny, ((this.any!= null)&&(!this.any.isEmpty())), ((that.any!= null)&&(!that.any.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId, (this.id!= null), (that.id!= null))) {
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
            List<DataObjectFormatType> theDataObjectFormat;
            theDataObjectFormat = (((this.dataObjectFormat!= null)&&(!this.dataObjectFormat.isEmpty()))?this.getDataObjectFormat():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataObjectFormat", theDataObjectFormat), currentHashCode, theDataObjectFormat, ((this.dataObjectFormat!= null)&&(!this.dataObjectFormat.isEmpty())));
        }
        {
            List<CommitmentTypeIndicationType> theCommitmentTypeIndication;
            theCommitmentTypeIndication = (((this.commitmentTypeIndication!= null)&&(!this.commitmentTypeIndication.isEmpty()))?this.getCommitmentTypeIndication():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "commitmentTypeIndication", theCommitmentTypeIndication), currentHashCode, theCommitmentTypeIndication, ((this.commitmentTypeIndication!= null)&&(!this.commitmentTypeIndication.isEmpty())));
        }
        {
            List<XAdESTimeStampType> theAllDataObjectsTimeStamp;
            theAllDataObjectsTimeStamp = (((this.allDataObjectsTimeStamp!= null)&&(!this.allDataObjectsTimeStamp.isEmpty()))?this.getAllDataObjectsTimeStamp():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allDataObjectsTimeStamp", theAllDataObjectsTimeStamp), currentHashCode, theAllDataObjectsTimeStamp, ((this.allDataObjectsTimeStamp!= null)&&(!this.allDataObjectsTimeStamp.isEmpty())));
        }
        {
            List<XAdESTimeStampType> theIndividualDataObjectsTimeStamp;
            theIndividualDataObjectsTimeStamp = (((this.individualDataObjectsTimeStamp!= null)&&(!this.individualDataObjectsTimeStamp.isEmpty()))?this.getIndividualDataObjectsTimeStamp():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "individualDataObjectsTimeStamp", theIndividualDataObjectsTimeStamp), currentHashCode, theIndividualDataObjectsTimeStamp, ((this.individualDataObjectsTimeStamp!= null)&&(!this.individualDataObjectsTimeStamp.isEmpty())));
        }
        {
            List<Object> theAny;
            theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny, ((this.any!= null)&&(!this.any.isEmpty())));
        }
        {
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId, (this.id!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
