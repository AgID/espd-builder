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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.OpenTenderIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TenderEnvelopeIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TenderEnvelopeTypeCodeType;
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
 * <p>Classe Java per TenderPreparationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TenderPreparationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TenderEnvelopeID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TenderEnvelopeTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OpenTenderID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ProcurementProjectLot" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentTenderRequirement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TenderEncryptionData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenderPreparationType", propOrder = {
    "tenderEnvelopeID",
    "tenderEnvelopeTypeCode",
    "description",
    "openTenderID",
    "procurementProjectLot",
    "documentTenderRequirement",
    "tenderEncryptionData"
})
public class TenderPreparationType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "TenderEnvelopeID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected TenderEnvelopeIDType tenderEnvelopeID;
    @XmlElement(name = "TenderEnvelopeTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TenderEnvelopeTypeCodeType tenderEnvelopeTypeCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "OpenTenderID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OpenTenderIDType openTenderID;
    @XmlElement(name = "ProcurementProjectLot")
    protected List<ProcurementProjectLotType> procurementProjectLot;
    @XmlElement(name = "DocumentTenderRequirement")
    protected List<TenderRequirementType> documentTenderRequirement;
    @XmlElement(name = "TenderEncryptionData")
    protected List<EncryptionDataType> tenderEncryptionData;

    /**
     * Recupera il valore della proprietà tenderEnvelopeID.
     * 
     * @return
     *     possible object is
     *     {@link TenderEnvelopeIDType }
     *     
     */
    public TenderEnvelopeIDType getTenderEnvelopeID() {
        return tenderEnvelopeID;
    }

    /**
     * Imposta il valore della proprietà tenderEnvelopeID.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderEnvelopeIDType }
     *     
     */
    public void setTenderEnvelopeID(TenderEnvelopeIDType value) {
        this.tenderEnvelopeID = value;
    }

    /**
     * Recupera il valore della proprietà tenderEnvelopeTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link TenderEnvelopeTypeCodeType }
     *     
     */
    public TenderEnvelopeTypeCodeType getTenderEnvelopeTypeCode() {
        return tenderEnvelopeTypeCode;
    }

    /**
     * Imposta il valore della proprietà tenderEnvelopeTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderEnvelopeTypeCodeType }
     *     
     */
    public void setTenderEnvelopeTypeCode(TenderEnvelopeTypeCodeType value) {
        this.tenderEnvelopeTypeCode = value;
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
     * Recupera il valore della proprietà openTenderID.
     * 
     * @return
     *     possible object is
     *     {@link OpenTenderIDType }
     *     
     */
    public OpenTenderIDType getOpenTenderID() {
        return openTenderID;
    }

    /**
     * Imposta il valore della proprietà openTenderID.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenTenderIDType }
     *     
     */
    public void setOpenTenderID(OpenTenderIDType value) {
        this.openTenderID = value;
    }

    /**
     * Gets the value of the procurementProjectLot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the procurementProjectLot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcurementProjectLot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcurementProjectLotType }
     * 
     * 
     */
    public List<ProcurementProjectLotType> getProcurementProjectLot() {
        if (procurementProjectLot == null) {
            procurementProjectLot = new ArrayList<ProcurementProjectLotType>();
        }
        return this.procurementProjectLot;
    }

    /**
     * Gets the value of the documentTenderRequirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentTenderRequirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentTenderRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TenderRequirementType }
     * 
     * 
     */
    public List<TenderRequirementType> getDocumentTenderRequirement() {
        if (documentTenderRequirement == null) {
            documentTenderRequirement = new ArrayList<TenderRequirementType>();
        }
        return this.documentTenderRequirement;
    }

    /**
     * Gets the value of the tenderEncryptionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tenderEncryptionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTenderEncryptionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncryptionDataType }
     * 
     * 
     */
    public List<EncryptionDataType> getTenderEncryptionData() {
        if (tenderEncryptionData == null) {
            tenderEncryptionData = new ArrayList<EncryptionDataType>();
        }
        return this.tenderEncryptionData;
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
            TenderEnvelopeIDType theTenderEnvelopeID;
            theTenderEnvelopeID = this.getTenderEnvelopeID();
            strategy.appendField(locator, this, "tenderEnvelopeID", buffer, theTenderEnvelopeID, (this.tenderEnvelopeID!= null));
        }
        {
            TenderEnvelopeTypeCodeType theTenderEnvelopeTypeCode;
            theTenderEnvelopeTypeCode = this.getTenderEnvelopeTypeCode();
            strategy.appendField(locator, this, "tenderEnvelopeTypeCode", buffer, theTenderEnvelopeTypeCode, (this.tenderEnvelopeTypeCode!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            OpenTenderIDType theOpenTenderID;
            theOpenTenderID = this.getOpenTenderID();
            strategy.appendField(locator, this, "openTenderID", buffer, theOpenTenderID, (this.openTenderID!= null));
        }
        {
            List<ProcurementProjectLotType> theProcurementProjectLot;
            theProcurementProjectLot = (((this.procurementProjectLot!= null)&&(!this.procurementProjectLot.isEmpty()))?this.getProcurementProjectLot():null);
            strategy.appendField(locator, this, "procurementProjectLot", buffer, theProcurementProjectLot, ((this.procurementProjectLot!= null)&&(!this.procurementProjectLot.isEmpty())));
        }
        {
            List<TenderRequirementType> theDocumentTenderRequirement;
            theDocumentTenderRequirement = (((this.documentTenderRequirement!= null)&&(!this.documentTenderRequirement.isEmpty()))?this.getDocumentTenderRequirement():null);
            strategy.appendField(locator, this, "documentTenderRequirement", buffer, theDocumentTenderRequirement, ((this.documentTenderRequirement!= null)&&(!this.documentTenderRequirement.isEmpty())));
        }
        {
            List<EncryptionDataType> theTenderEncryptionData;
            theTenderEncryptionData = (((this.tenderEncryptionData!= null)&&(!this.tenderEncryptionData.isEmpty()))?this.getTenderEncryptionData():null);
            strategy.appendField(locator, this, "tenderEncryptionData", buffer, theTenderEncryptionData, ((this.tenderEncryptionData!= null)&&(!this.tenderEncryptionData.isEmpty())));
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
        final TenderPreparationType that = ((TenderPreparationType) object);
        {
            TenderEnvelopeIDType lhsTenderEnvelopeID;
            lhsTenderEnvelopeID = this.getTenderEnvelopeID();
            TenderEnvelopeIDType rhsTenderEnvelopeID;
            rhsTenderEnvelopeID = that.getTenderEnvelopeID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tenderEnvelopeID", lhsTenderEnvelopeID), LocatorUtils.property(thatLocator, "tenderEnvelopeID", rhsTenderEnvelopeID), lhsTenderEnvelopeID, rhsTenderEnvelopeID, (this.tenderEnvelopeID!= null), (that.tenderEnvelopeID!= null))) {
                return false;
            }
        }
        {
            TenderEnvelopeTypeCodeType lhsTenderEnvelopeTypeCode;
            lhsTenderEnvelopeTypeCode = this.getTenderEnvelopeTypeCode();
            TenderEnvelopeTypeCodeType rhsTenderEnvelopeTypeCode;
            rhsTenderEnvelopeTypeCode = that.getTenderEnvelopeTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tenderEnvelopeTypeCode", lhsTenderEnvelopeTypeCode), LocatorUtils.property(thatLocator, "tenderEnvelopeTypeCode", rhsTenderEnvelopeTypeCode), lhsTenderEnvelopeTypeCode, rhsTenderEnvelopeTypeCode, (this.tenderEnvelopeTypeCode!= null), (that.tenderEnvelopeTypeCode!= null))) {
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
            OpenTenderIDType lhsOpenTenderID;
            lhsOpenTenderID = this.getOpenTenderID();
            OpenTenderIDType rhsOpenTenderID;
            rhsOpenTenderID = that.getOpenTenderID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "openTenderID", lhsOpenTenderID), LocatorUtils.property(thatLocator, "openTenderID", rhsOpenTenderID), lhsOpenTenderID, rhsOpenTenderID, (this.openTenderID!= null), (that.openTenderID!= null))) {
                return false;
            }
        }
        {
            List<ProcurementProjectLotType> lhsProcurementProjectLot;
            lhsProcurementProjectLot = (((this.procurementProjectLot!= null)&&(!this.procurementProjectLot.isEmpty()))?this.getProcurementProjectLot():null);
            List<ProcurementProjectLotType> rhsProcurementProjectLot;
            rhsProcurementProjectLot = (((that.procurementProjectLot!= null)&&(!that.procurementProjectLot.isEmpty()))?that.getProcurementProjectLot():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "procurementProjectLot", lhsProcurementProjectLot), LocatorUtils.property(thatLocator, "procurementProjectLot", rhsProcurementProjectLot), lhsProcurementProjectLot, rhsProcurementProjectLot, ((this.procurementProjectLot!= null)&&(!this.procurementProjectLot.isEmpty())), ((that.procurementProjectLot!= null)&&(!that.procurementProjectLot.isEmpty())))) {
                return false;
            }
        }
        {
            List<TenderRequirementType> lhsDocumentTenderRequirement;
            lhsDocumentTenderRequirement = (((this.documentTenderRequirement!= null)&&(!this.documentTenderRequirement.isEmpty()))?this.getDocumentTenderRequirement():null);
            List<TenderRequirementType> rhsDocumentTenderRequirement;
            rhsDocumentTenderRequirement = (((that.documentTenderRequirement!= null)&&(!that.documentTenderRequirement.isEmpty()))?that.getDocumentTenderRequirement():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentTenderRequirement", lhsDocumentTenderRequirement), LocatorUtils.property(thatLocator, "documentTenderRequirement", rhsDocumentTenderRequirement), lhsDocumentTenderRequirement, rhsDocumentTenderRequirement, ((this.documentTenderRequirement!= null)&&(!this.documentTenderRequirement.isEmpty())), ((that.documentTenderRequirement!= null)&&(!that.documentTenderRequirement.isEmpty())))) {
                return false;
            }
        }
        {
            List<EncryptionDataType> lhsTenderEncryptionData;
            lhsTenderEncryptionData = (((this.tenderEncryptionData!= null)&&(!this.tenderEncryptionData.isEmpty()))?this.getTenderEncryptionData():null);
            List<EncryptionDataType> rhsTenderEncryptionData;
            rhsTenderEncryptionData = (((that.tenderEncryptionData!= null)&&(!that.tenderEncryptionData.isEmpty()))?that.getTenderEncryptionData():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tenderEncryptionData", lhsTenderEncryptionData), LocatorUtils.property(thatLocator, "tenderEncryptionData", rhsTenderEncryptionData), lhsTenderEncryptionData, rhsTenderEncryptionData, ((this.tenderEncryptionData!= null)&&(!this.tenderEncryptionData.isEmpty())), ((that.tenderEncryptionData!= null)&&(!that.tenderEncryptionData.isEmpty())))) {
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
            TenderEnvelopeIDType theTenderEnvelopeID;
            theTenderEnvelopeID = this.getTenderEnvelopeID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tenderEnvelopeID", theTenderEnvelopeID), currentHashCode, theTenderEnvelopeID, (this.tenderEnvelopeID!= null));
        }
        {
            TenderEnvelopeTypeCodeType theTenderEnvelopeTypeCode;
            theTenderEnvelopeTypeCode = this.getTenderEnvelopeTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tenderEnvelopeTypeCode", theTenderEnvelopeTypeCode), currentHashCode, theTenderEnvelopeTypeCode, (this.tenderEnvelopeTypeCode!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            OpenTenderIDType theOpenTenderID;
            theOpenTenderID = this.getOpenTenderID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "openTenderID", theOpenTenderID), currentHashCode, theOpenTenderID, (this.openTenderID!= null));
        }
        {
            List<ProcurementProjectLotType> theProcurementProjectLot;
            theProcurementProjectLot = (((this.procurementProjectLot!= null)&&(!this.procurementProjectLot.isEmpty()))?this.getProcurementProjectLot():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "procurementProjectLot", theProcurementProjectLot), currentHashCode, theProcurementProjectLot, ((this.procurementProjectLot!= null)&&(!this.procurementProjectLot.isEmpty())));
        }
        {
            List<TenderRequirementType> theDocumentTenderRequirement;
            theDocumentTenderRequirement = (((this.documentTenderRequirement!= null)&&(!this.documentTenderRequirement.isEmpty()))?this.getDocumentTenderRequirement():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentTenderRequirement", theDocumentTenderRequirement), currentHashCode, theDocumentTenderRequirement, ((this.documentTenderRequirement!= null)&&(!this.documentTenderRequirement.isEmpty())));
        }
        {
            List<EncryptionDataType> theTenderEncryptionData;
            theTenderEncryptionData = (((this.tenderEncryptionData!= null)&&(!this.tenderEncryptionData.isEmpty()))?this.getTenderEncryptionData():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tenderEncryptionData", theTenderEncryptionData), currentHashCode, theTenderEncryptionData, ((this.tenderEncryptionData!= null)&&(!this.tenderEncryptionData.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
