//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package oasis.names.specification.ubl.schema.xsd.commonsignaturecomponents_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.signatureaggregatecomponents_2.SignatureInformationType;
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
 * <p>Classe Java per UBLDocumentSignaturesType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UBLDocumentSignaturesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:SignatureAggregateComponents-2}SignatureInformation" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UBLDocumentSignaturesType", propOrder = {
    "signatureInformation"
})
public class UBLDocumentSignaturesType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "SignatureInformation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:SignatureAggregateComponents-2", required = true)
    protected List<SignatureInformationType> signatureInformation;

    /**
     * Gets the value of the signatureInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signatureInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignatureInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignatureInformationType }
     * 
     * 
     */
    public List<SignatureInformationType> getSignatureInformation() {
        if (signatureInformation == null) {
            signatureInformation = new ArrayList<SignatureInformationType>();
        }
        return this.signatureInformation;
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
            List<SignatureInformationType> theSignatureInformation;
            theSignatureInformation = (((this.signatureInformation!= null)&&(!this.signatureInformation.isEmpty()))?this.getSignatureInformation():null);
            strategy.appendField(locator, this, "signatureInformation", buffer, theSignatureInformation, ((this.signatureInformation!= null)&&(!this.signatureInformation.isEmpty())));
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
        final UBLDocumentSignaturesType that = ((UBLDocumentSignaturesType) object);
        {
            List<SignatureInformationType> lhsSignatureInformation;
            lhsSignatureInformation = (((this.signatureInformation!= null)&&(!this.signatureInformation.isEmpty()))?this.getSignatureInformation():null);
            List<SignatureInformationType> rhsSignatureInformation;
            rhsSignatureInformation = (((that.signatureInformation!= null)&&(!that.signatureInformation.isEmpty()))?that.getSignatureInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "signatureInformation", lhsSignatureInformation), LocatorUtils.property(thatLocator, "signatureInformation", rhsSignatureInformation), lhsSignatureInformation, rhsSignatureInformation, ((this.signatureInformation!= null)&&(!this.signatureInformation.isEmpty())), ((that.signatureInformation!= null)&&(!that.signatureInformation.isEmpty())))) {
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
            List<SignatureInformationType> theSignatureInformation;
            theSignatureInformation = (((this.signatureInformation!= null)&&(!this.signatureInformation.isEmpty()))?this.getSignatureInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "signatureInformation", theSignatureInformation), currentHashCode, theSignatureInformation, ((this.signatureInformation!= null)&&(!this.signatureInformation.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
