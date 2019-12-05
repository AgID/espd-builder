//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package org.etsi.uri._01903.v1_4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
import org.w3._2000._09.xmldsig_.DigestMethodType;


/**
 * <p>Classe Java per RenewedDigestsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RenewedDigestsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}DigestMethod"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.4.1#}RecomputedDigestValue" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "RenewedDigestsType", propOrder = {
    "digestMethod",
    "recomputedDigestValue"
})
public class RenewedDigestsType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "DigestMethod", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected DigestMethodType digestMethod;
    @XmlElement(name = "RecomputedDigestValue", required = true)
    protected List<RecomputedDigestValueType> recomputedDigestValue;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Recupera il valore della proprietà digestMethod.
     * 
     * @return
     *     possible object is
     *     {@link DigestMethodType }
     *     
     */
    public DigestMethodType getDigestMethod() {
        return digestMethod;
    }

    /**
     * Imposta il valore della proprietà digestMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link DigestMethodType }
     *     
     */
    public void setDigestMethod(DigestMethodType value) {
        this.digestMethod = value;
    }

    /**
     * Gets the value of the recomputedDigestValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recomputedDigestValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecomputedDigestValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecomputedDigestValueType }
     * 
     * 
     */
    public List<RecomputedDigestValueType> getRecomputedDigestValue() {
        if (recomputedDigestValue == null) {
            recomputedDigestValue = new ArrayList<RecomputedDigestValueType>();
        }
        return this.recomputedDigestValue;
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
            DigestMethodType theDigestMethod;
            theDigestMethod = this.getDigestMethod();
            strategy.appendField(locator, this, "digestMethod", buffer, theDigestMethod, (this.digestMethod!= null));
        }
        {
            List<RecomputedDigestValueType> theRecomputedDigestValue;
            theRecomputedDigestValue = (((this.recomputedDigestValue!= null)&&(!this.recomputedDigestValue.isEmpty()))?this.getRecomputedDigestValue():null);
            strategy.appendField(locator, this, "recomputedDigestValue", buffer, theRecomputedDigestValue, ((this.recomputedDigestValue!= null)&&(!this.recomputedDigestValue.isEmpty())));
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
        final RenewedDigestsType that = ((RenewedDigestsType) object);
        {
            DigestMethodType lhsDigestMethod;
            lhsDigestMethod = this.getDigestMethod();
            DigestMethodType rhsDigestMethod;
            rhsDigestMethod = that.getDigestMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "digestMethod", lhsDigestMethod), LocatorUtils.property(thatLocator, "digestMethod", rhsDigestMethod), lhsDigestMethod, rhsDigestMethod, (this.digestMethod!= null), (that.digestMethod!= null))) {
                return false;
            }
        }
        {
            List<RecomputedDigestValueType> lhsRecomputedDigestValue;
            lhsRecomputedDigestValue = (((this.recomputedDigestValue!= null)&&(!this.recomputedDigestValue.isEmpty()))?this.getRecomputedDigestValue():null);
            List<RecomputedDigestValueType> rhsRecomputedDigestValue;
            rhsRecomputedDigestValue = (((that.recomputedDigestValue!= null)&&(!that.recomputedDigestValue.isEmpty()))?that.getRecomputedDigestValue():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recomputedDigestValue", lhsRecomputedDigestValue), LocatorUtils.property(thatLocator, "recomputedDigestValue", rhsRecomputedDigestValue), lhsRecomputedDigestValue, rhsRecomputedDigestValue, ((this.recomputedDigestValue!= null)&&(!this.recomputedDigestValue.isEmpty())), ((that.recomputedDigestValue!= null)&&(!that.recomputedDigestValue.isEmpty())))) {
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
            DigestMethodType theDigestMethod;
            theDigestMethod = this.getDigestMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "digestMethod", theDigestMethod), currentHashCode, theDigestMethod, (this.digestMethod!= null));
        }
        {
            List<RecomputedDigestValueType> theRecomputedDigestValue;
            theRecomputedDigestValue = (((this.recomputedDigestValue!= null)&&(!this.recomputedDigestValue.isEmpty()))?this.getRecomputedDigestValue():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "recomputedDigestValue", theRecomputedDigestValue), currentHashCode, theRecomputedDigestValue, ((this.recomputedDigestValue!= null)&&(!this.recomputedDigestValue.isEmpty())));
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
