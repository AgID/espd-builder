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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ApprovalStatusType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DocumentIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RemarksType;
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
 * <p>Classe Java per EndorsementType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EndorsementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DocumentID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ApprovalStatus"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Remarks" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EndorserParty"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Signature" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndorsementType", propOrder = {
    "documentID",
    "approvalStatus",
    "remarks",
    "endorserParty",
    "signature"
})
public class EndorsementType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "DocumentID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected DocumentIDType documentID;
    @XmlElement(name = "ApprovalStatus", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ApprovalStatusType approvalStatus;
    @XmlElement(name = "Remarks", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<RemarksType> remarks;
    @XmlElement(name = "EndorserParty", required = true)
    protected EndorserPartyType endorserParty;
    @XmlElement(name = "Signature")
    protected List<SignatureType> signature;

    /**
     * Recupera il valore della proprietà documentID.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIDType }
     *     
     */
    public DocumentIDType getDocumentID() {
        return documentID;
    }

    /**
     * Imposta il valore della proprietà documentID.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIDType }
     *     
     */
    public void setDocumentID(DocumentIDType value) {
        this.documentID = value;
    }

    /**
     * Recupera il valore della proprietà approvalStatus.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalStatusType }
     *     
     */
    public ApprovalStatusType getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * Imposta il valore della proprietà approvalStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalStatusType }
     *     
     */
    public void setApprovalStatus(ApprovalStatusType value) {
        this.approvalStatus = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemarksType }
     * 
     * 
     */
    public List<RemarksType> getRemarks() {
        if (remarks == null) {
            remarks = new ArrayList<RemarksType>();
        }
        return this.remarks;
    }

    /**
     * Recupera il valore della proprietà endorserParty.
     * 
     * @return
     *     possible object is
     *     {@link EndorserPartyType }
     *     
     */
    public EndorserPartyType getEndorserParty() {
        return endorserParty;
    }

    /**
     * Imposta il valore della proprietà endorserParty.
     * 
     * @param value
     *     allowed object is
     *     {@link EndorserPartyType }
     *     
     */
    public void setEndorserParty(EndorserPartyType value) {
        this.endorserParty = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignatureType }
     * 
     * 
     */
    public List<SignatureType> getSignature() {
        if (signature == null) {
            signature = new ArrayList<SignatureType>();
        }
        return this.signature;
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
            DocumentIDType theDocumentID;
            theDocumentID = this.getDocumentID();
            strategy.appendField(locator, this, "documentID", buffer, theDocumentID, (this.documentID!= null));
        }
        {
            ApprovalStatusType theApprovalStatus;
            theApprovalStatus = this.getApprovalStatus();
            strategy.appendField(locator, this, "approvalStatus", buffer, theApprovalStatus, (this.approvalStatus!= null));
        }
        {
            List<RemarksType> theRemarks;
            theRemarks = (((this.remarks!= null)&&(!this.remarks.isEmpty()))?this.getRemarks():null);
            strategy.appendField(locator, this, "remarks", buffer, theRemarks, ((this.remarks!= null)&&(!this.remarks.isEmpty())));
        }
        {
            EndorserPartyType theEndorserParty;
            theEndorserParty = this.getEndorserParty();
            strategy.appendField(locator, this, "endorserParty", buffer, theEndorserParty, (this.endorserParty!= null));
        }
        {
            List<SignatureType> theSignature;
            theSignature = (((this.signature!= null)&&(!this.signature.isEmpty()))?this.getSignature():null);
            strategy.appendField(locator, this, "signature", buffer, theSignature, ((this.signature!= null)&&(!this.signature.isEmpty())));
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
        final EndorsementType that = ((EndorsementType) object);
        {
            DocumentIDType lhsDocumentID;
            lhsDocumentID = this.getDocumentID();
            DocumentIDType rhsDocumentID;
            rhsDocumentID = that.getDocumentID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentID", lhsDocumentID), LocatorUtils.property(thatLocator, "documentID", rhsDocumentID), lhsDocumentID, rhsDocumentID, (this.documentID!= null), (that.documentID!= null))) {
                return false;
            }
        }
        {
            ApprovalStatusType lhsApprovalStatus;
            lhsApprovalStatus = this.getApprovalStatus();
            ApprovalStatusType rhsApprovalStatus;
            rhsApprovalStatus = that.getApprovalStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "approvalStatus", lhsApprovalStatus), LocatorUtils.property(thatLocator, "approvalStatus", rhsApprovalStatus), lhsApprovalStatus, rhsApprovalStatus, (this.approvalStatus!= null), (that.approvalStatus!= null))) {
                return false;
            }
        }
        {
            List<RemarksType> lhsRemarks;
            lhsRemarks = (((this.remarks!= null)&&(!this.remarks.isEmpty()))?this.getRemarks():null);
            List<RemarksType> rhsRemarks;
            rhsRemarks = (((that.remarks!= null)&&(!that.remarks.isEmpty()))?that.getRemarks():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "remarks", lhsRemarks), LocatorUtils.property(thatLocator, "remarks", rhsRemarks), lhsRemarks, rhsRemarks, ((this.remarks!= null)&&(!this.remarks.isEmpty())), ((that.remarks!= null)&&(!that.remarks.isEmpty())))) {
                return false;
            }
        }
        {
            EndorserPartyType lhsEndorserParty;
            lhsEndorserParty = this.getEndorserParty();
            EndorserPartyType rhsEndorserParty;
            rhsEndorserParty = that.getEndorserParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endorserParty", lhsEndorserParty), LocatorUtils.property(thatLocator, "endorserParty", rhsEndorserParty), lhsEndorserParty, rhsEndorserParty, (this.endorserParty!= null), (that.endorserParty!= null))) {
                return false;
            }
        }
        {
            List<SignatureType> lhsSignature;
            lhsSignature = (((this.signature!= null)&&(!this.signature.isEmpty()))?this.getSignature():null);
            List<SignatureType> rhsSignature;
            rhsSignature = (((that.signature!= null)&&(!that.signature.isEmpty()))?that.getSignature():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "signature", lhsSignature), LocatorUtils.property(thatLocator, "signature", rhsSignature), lhsSignature, rhsSignature, ((this.signature!= null)&&(!this.signature.isEmpty())), ((that.signature!= null)&&(!that.signature.isEmpty())))) {
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
            DocumentIDType theDocumentID;
            theDocumentID = this.getDocumentID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentID", theDocumentID), currentHashCode, theDocumentID, (this.documentID!= null));
        }
        {
            ApprovalStatusType theApprovalStatus;
            theApprovalStatus = this.getApprovalStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "approvalStatus", theApprovalStatus), currentHashCode, theApprovalStatus, (this.approvalStatus!= null));
        }
        {
            List<RemarksType> theRemarks;
            theRemarks = (((this.remarks!= null)&&(!this.remarks.isEmpty()))?this.getRemarks():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remarks", theRemarks), currentHashCode, theRemarks, ((this.remarks!= null)&&(!this.remarks.isEmpty())));
        }
        {
            EndorserPartyType theEndorserParty;
            theEndorserParty = this.getEndorserParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endorserParty", theEndorserParty), currentHashCode, theEndorserParty, (this.endorserParty!= null));
        }
        {
            List<SignatureType> theSignature;
            theSignature = (((this.signature!= null)&&(!this.signature.isEmpty()))?this.getSignature():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "signature", theSignature), currentHashCode, theSignature, ((this.signature!= null)&&(!this.signature.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
