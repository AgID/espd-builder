//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package org.w3._2009.xmldsig11_;

import java.io.Serializable;
import java.math.BigInteger;
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
 * <p>Classe Java per ECParametersType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ECParametersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FieldID" type="{http://www.w3.org/2009/xmldsig11#}FieldIDType"/&gt;
 *         &lt;element name="Curve" type="{http://www.w3.org/2009/xmldsig11#}CurveType"/&gt;
 *         &lt;element name="Base" type="{http://www.w3.org/2009/xmldsig11#}ECPointType"/&gt;
 *         &lt;element name="Order" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/&gt;
 *         &lt;element name="CoFactor" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ValidationData" type="{http://www.w3.org/2009/xmldsig11#}ECValidationDataType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ECParametersType", propOrder = {
    "fieldID",
    "curve",
    "base",
    "order",
    "coFactor",
    "validationData"
})
public class ECParametersType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "FieldID", required = true)
    protected FieldIDType fieldID;
    @XmlElement(name = "Curve", required = true)
    protected CurveType curve;
    @XmlElement(name = "Base", required = true)
    protected byte[] base;
    @XmlElement(name = "Order", required = true)
    protected byte[] order;
    @XmlElement(name = "CoFactor")
    protected BigInteger coFactor;
    @XmlElement(name = "ValidationData")
    protected ECValidationDataType validationData;

    /**
     * Recupera il valore della proprietà fieldID.
     * 
     * @return
     *     possible object is
     *     {@link FieldIDType }
     *     
     */
    public FieldIDType getFieldID() {
        return fieldID;
    }

    /**
     * Imposta il valore della proprietà fieldID.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIDType }
     *     
     */
    public void setFieldID(FieldIDType value) {
        this.fieldID = value;
    }

    /**
     * Recupera il valore della proprietà curve.
     * 
     * @return
     *     possible object is
     *     {@link CurveType }
     *     
     */
    public CurveType getCurve() {
        return curve;
    }

    /**
     * Imposta il valore della proprietà curve.
     * 
     * @param value
     *     allowed object is
     *     {@link CurveType }
     *     
     */
    public void setCurve(CurveType value) {
        this.curve = value;
    }

    /**
     * Recupera il valore della proprietà base.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBase() {
        return base;
    }

    /**
     * Imposta il valore della proprietà base.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBase(byte[] value) {
        this.base = value;
    }

    /**
     * Recupera il valore della proprietà order.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getOrder() {
        return order;
    }

    /**
     * Imposta il valore della proprietà order.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setOrder(byte[] value) {
        this.order = value;
    }

    /**
     * Recupera il valore della proprietà coFactor.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCoFactor() {
        return coFactor;
    }

    /**
     * Imposta il valore della proprietà coFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCoFactor(BigInteger value) {
        this.coFactor = value;
    }

    /**
     * Recupera il valore della proprietà validationData.
     * 
     * @return
     *     possible object is
     *     {@link ECValidationDataType }
     *     
     */
    public ECValidationDataType getValidationData() {
        return validationData;
    }

    /**
     * Imposta il valore della proprietà validationData.
     * 
     * @param value
     *     allowed object is
     *     {@link ECValidationDataType }
     *     
     */
    public void setValidationData(ECValidationDataType value) {
        this.validationData = value;
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
            FieldIDType theFieldID;
            theFieldID = this.getFieldID();
            strategy.appendField(locator, this, "fieldID", buffer, theFieldID, (this.fieldID!= null));
        }
        {
            CurveType theCurve;
            theCurve = this.getCurve();
            strategy.appendField(locator, this, "curve", buffer, theCurve, (this.curve!= null));
        }
        {
            byte[] theBase;
            theBase = this.getBase();
            strategy.appendField(locator, this, "base", buffer, theBase, (this.base!= null));
        }
        {
            byte[] theOrder;
            theOrder = this.getOrder();
            strategy.appendField(locator, this, "order", buffer, theOrder, (this.order!= null));
        }
        {
            BigInteger theCoFactor;
            theCoFactor = this.getCoFactor();
            strategy.appendField(locator, this, "coFactor", buffer, theCoFactor, (this.coFactor!= null));
        }
        {
            ECValidationDataType theValidationData;
            theValidationData = this.getValidationData();
            strategy.appendField(locator, this, "validationData", buffer, theValidationData, (this.validationData!= null));
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
        final ECParametersType that = ((ECParametersType) object);
        {
            FieldIDType lhsFieldID;
            lhsFieldID = this.getFieldID();
            FieldIDType rhsFieldID;
            rhsFieldID = that.getFieldID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fieldID", lhsFieldID), LocatorUtils.property(thatLocator, "fieldID", rhsFieldID), lhsFieldID, rhsFieldID, (this.fieldID!= null), (that.fieldID!= null))) {
                return false;
            }
        }
        {
            CurveType lhsCurve;
            lhsCurve = this.getCurve();
            CurveType rhsCurve;
            rhsCurve = that.getCurve();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "curve", lhsCurve), LocatorUtils.property(thatLocator, "curve", rhsCurve), lhsCurve, rhsCurve, (this.curve!= null), (that.curve!= null))) {
                return false;
            }
        }
        {
            byte[] lhsBase;
            lhsBase = this.getBase();
            byte[] rhsBase;
            rhsBase = that.getBase();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "base", lhsBase), LocatorUtils.property(thatLocator, "base", rhsBase), lhsBase, rhsBase, (this.base!= null), (that.base!= null))) {
                return false;
            }
        }
        {
            byte[] lhsOrder;
            lhsOrder = this.getOrder();
            byte[] rhsOrder;
            rhsOrder = that.getOrder();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "order", lhsOrder), LocatorUtils.property(thatLocator, "order", rhsOrder), lhsOrder, rhsOrder, (this.order!= null), (that.order!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsCoFactor;
            lhsCoFactor = this.getCoFactor();
            BigInteger rhsCoFactor;
            rhsCoFactor = that.getCoFactor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "coFactor", lhsCoFactor), LocatorUtils.property(thatLocator, "coFactor", rhsCoFactor), lhsCoFactor, rhsCoFactor, (this.coFactor!= null), (that.coFactor!= null))) {
                return false;
            }
        }
        {
            ECValidationDataType lhsValidationData;
            lhsValidationData = this.getValidationData();
            ECValidationDataType rhsValidationData;
            rhsValidationData = that.getValidationData();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validationData", lhsValidationData), LocatorUtils.property(thatLocator, "validationData", rhsValidationData), lhsValidationData, rhsValidationData, (this.validationData!= null), (that.validationData!= null))) {
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
            FieldIDType theFieldID;
            theFieldID = this.getFieldID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fieldID", theFieldID), currentHashCode, theFieldID, (this.fieldID!= null));
        }
        {
            CurveType theCurve;
            theCurve = this.getCurve();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "curve", theCurve), currentHashCode, theCurve, (this.curve!= null));
        }
        {
            byte[] theBase;
            theBase = this.getBase();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "base", theBase), currentHashCode, theBase, (this.base!= null));
        }
        {
            byte[] theOrder;
            theOrder = this.getOrder();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "order", theOrder), currentHashCode, theOrder, (this.order!= null));
        }
        {
            BigInteger theCoFactor;
            theCoFactor = this.getCoFactor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "coFactor", theCoFactor), currentHashCode, theCoFactor, (this.coFactor!= null));
        }
        {
            ECValidationDataType theValidationData;
            theValidationData = this.getValidationData();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validationData", theValidationData), currentHashCode, theValidationData, (this.validationData!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
