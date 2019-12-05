//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PartyTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PartyTypeType;
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
 * <p>Classe Java per ContractingPartyTypeType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ContractingPartyTypeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PartyTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PartyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractingPartyTypeType", propOrder = {
    "partyTypeCode",
    "partyType"
})
public class ContractingPartyTypeType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "PartyTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PartyTypeCodeType partyTypeCode;
    @XmlElement(name = "PartyType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PartyTypeType partyType;

    /**
     * Recupera il valore della proprietà partyTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link PartyTypeCodeType }
     *     
     */
    public PartyTypeCodeType getPartyTypeCode() {
        return partyTypeCode;
    }

    /**
     * Imposta il valore della proprietà partyTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyTypeCodeType }
     *     
     */
    public void setPartyTypeCode(PartyTypeCodeType value) {
        this.partyTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà partyType.
     * 
     * @return
     *     possible object is
     *     {@link PartyTypeType }
     *     
     */
    public PartyTypeType getPartyType() {
        return partyType;
    }

    /**
     * Imposta il valore della proprietà partyType.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyTypeType }
     *     
     */
    public void setPartyType(PartyTypeType value) {
        this.partyType = value;
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
            PartyTypeCodeType thePartyTypeCode;
            thePartyTypeCode = this.getPartyTypeCode();
            strategy.appendField(locator, this, "partyTypeCode", buffer, thePartyTypeCode, (this.partyTypeCode!= null));
        }
        {
            PartyTypeType thePartyType;
            thePartyType = this.getPartyType();
            strategy.appendField(locator, this, "partyType", buffer, thePartyType, (this.partyType!= null));
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
        final ContractingPartyTypeType that = ((ContractingPartyTypeType) object);
        {
            PartyTypeCodeType lhsPartyTypeCode;
            lhsPartyTypeCode = this.getPartyTypeCode();
            PartyTypeCodeType rhsPartyTypeCode;
            rhsPartyTypeCode = that.getPartyTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partyTypeCode", lhsPartyTypeCode), LocatorUtils.property(thatLocator, "partyTypeCode", rhsPartyTypeCode), lhsPartyTypeCode, rhsPartyTypeCode, (this.partyTypeCode!= null), (that.partyTypeCode!= null))) {
                return false;
            }
        }
        {
            PartyTypeType lhsPartyType;
            lhsPartyType = this.getPartyType();
            PartyTypeType rhsPartyType;
            rhsPartyType = that.getPartyType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partyType", lhsPartyType), LocatorUtils.property(thatLocator, "partyType", rhsPartyType), lhsPartyType, rhsPartyType, (this.partyType!= null), (that.partyType!= null))) {
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
            PartyTypeCodeType thePartyTypeCode;
            thePartyTypeCode = this.getPartyTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partyTypeCode", thePartyTypeCode), currentHashCode, thePartyTypeCode, (this.partyTypeCode!= null));
        }
        {
            PartyTypeType thePartyType;
            thePartyType = this.getPartyType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partyType", thePartyType), currentHashCode, thePartyType, (this.partyType!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
