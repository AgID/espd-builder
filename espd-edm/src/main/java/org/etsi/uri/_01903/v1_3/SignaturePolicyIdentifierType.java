//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package org.etsi.uri._01903.v1_3;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Classe Java per SignaturePolicyIdentifierType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SignaturePolicyIdentifierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="SignaturePolicyId" type="{http://uri.etsi.org/01903/v1.3.2#}SignaturePolicyIdType"/&gt;
 *         &lt;element name="SignaturePolicyImplied" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignaturePolicyIdentifierType", propOrder = {
    "signaturePolicyId",
    "signaturePolicyImplied"
})
public class SignaturePolicyIdentifierType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "SignaturePolicyId")
    protected SignaturePolicyIdType signaturePolicyId;
    @XmlElement(name = "SignaturePolicyImplied")
    protected Object signaturePolicyImplied;

    /**
     * Recupera il valore della proprietà signaturePolicyId.
     * 
     * @return
     *     possible object is
     *     {@link SignaturePolicyIdType }
     *     
     */
    public SignaturePolicyIdType getSignaturePolicyId() {
        return signaturePolicyId;
    }

    /**
     * Imposta il valore della proprietà signaturePolicyId.
     * 
     * @param value
     *     allowed object is
     *     {@link SignaturePolicyIdType }
     *     
     */
    public void setSignaturePolicyId(SignaturePolicyIdType value) {
        this.signaturePolicyId = value;
    }

    /**
     * Recupera il valore della proprietà signaturePolicyImplied.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSignaturePolicyImplied() {
        return signaturePolicyImplied;
    }

    /**
     * Imposta il valore della proprietà signaturePolicyImplied.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSignaturePolicyImplied(Object value) {
        this.signaturePolicyImplied = value;
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
            SignaturePolicyIdType theSignaturePolicyId;
            theSignaturePolicyId = this.getSignaturePolicyId();
            strategy.appendField(locator, this, "signaturePolicyId", buffer, theSignaturePolicyId, (this.signaturePolicyId!= null));
        }
        {
            Object theSignaturePolicyImplied;
            theSignaturePolicyImplied = this.getSignaturePolicyImplied();
            strategy.appendField(locator, this, "signaturePolicyImplied", buffer, theSignaturePolicyImplied, (this.signaturePolicyImplied!= null));
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
        final SignaturePolicyIdentifierType that = ((SignaturePolicyIdentifierType) object);
        {
            SignaturePolicyIdType lhsSignaturePolicyId;
            lhsSignaturePolicyId = this.getSignaturePolicyId();
            SignaturePolicyIdType rhsSignaturePolicyId;
            rhsSignaturePolicyId = that.getSignaturePolicyId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "signaturePolicyId", lhsSignaturePolicyId), LocatorUtils.property(thatLocator, "signaturePolicyId", rhsSignaturePolicyId), lhsSignaturePolicyId, rhsSignaturePolicyId, (this.signaturePolicyId!= null), (that.signaturePolicyId!= null))) {
                return false;
            }
        }
        {
            Object lhsSignaturePolicyImplied;
            lhsSignaturePolicyImplied = this.getSignaturePolicyImplied();
            Object rhsSignaturePolicyImplied;
            rhsSignaturePolicyImplied = that.getSignaturePolicyImplied();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "signaturePolicyImplied", lhsSignaturePolicyImplied), LocatorUtils.property(thatLocator, "signaturePolicyImplied", rhsSignaturePolicyImplied), lhsSignaturePolicyImplied, rhsSignaturePolicyImplied, (this.signaturePolicyImplied!= null), (that.signaturePolicyImplied!= null))) {
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
            SignaturePolicyIdType theSignaturePolicyId;
            theSignaturePolicyId = this.getSignaturePolicyId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "signaturePolicyId", theSignaturePolicyId), currentHashCode, theSignaturePolicyId, (this.signaturePolicyId!= null));
        }
        {
            Object theSignaturePolicyImplied;
            theSignaturePolicyImplied = this.getSignaturePolicyImplied();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "signaturePolicyImplied", theSignaturePolicyImplied), currentHashCode, theSignaturePolicyImplied, (this.signaturePolicyImplied!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
