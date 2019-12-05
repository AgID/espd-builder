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
 * <p>Classe Java per SignedAssertionsListType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SignedAssertionsListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SignedAssertion" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignedAssertionsListType", propOrder = {
    "signedAssertion"
})
public class SignedAssertionsListType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "SignedAssertion", required = true)
    protected List<AnyType> signedAssertion;

    /**
     * Gets the value of the signedAssertion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signedAssertion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignedAssertion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnyType }
     * 
     * 
     */
    public List<AnyType> getSignedAssertion() {
        if (signedAssertion == null) {
            signedAssertion = new ArrayList<AnyType>();
        }
        return this.signedAssertion;
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
            List<AnyType> theSignedAssertion;
            theSignedAssertion = (((this.signedAssertion!= null)&&(!this.signedAssertion.isEmpty()))?this.getSignedAssertion():null);
            strategy.appendField(locator, this, "signedAssertion", buffer, theSignedAssertion, ((this.signedAssertion!= null)&&(!this.signedAssertion.isEmpty())));
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
        final SignedAssertionsListType that = ((SignedAssertionsListType) object);
        {
            List<AnyType> lhsSignedAssertion;
            lhsSignedAssertion = (((this.signedAssertion!= null)&&(!this.signedAssertion.isEmpty()))?this.getSignedAssertion():null);
            List<AnyType> rhsSignedAssertion;
            rhsSignedAssertion = (((that.signedAssertion!= null)&&(!that.signedAssertion.isEmpty()))?that.getSignedAssertion():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "signedAssertion", lhsSignedAssertion), LocatorUtils.property(thatLocator, "signedAssertion", rhsSignedAssertion), lhsSignedAssertion, rhsSignedAssertion, ((this.signedAssertion!= null)&&(!this.signedAssertion.isEmpty())), ((that.signedAssertion!= null)&&(!that.signedAssertion.isEmpty())))) {
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
            List<AnyType> theSignedAssertion;
            theSignedAssertion = (((this.signedAssertion!= null)&&(!this.signedAssertion.isEmpty()))?this.getSignedAssertion():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "signedAssertion", theSignedAssertion), currentHashCode, theSignedAssertion, ((this.signedAssertion!= null)&&(!this.signedAssertion.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
