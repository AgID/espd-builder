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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EmergencyProceduresCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExtensionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PlacardEndorsementType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PlacardNotationType;
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
 * <p>Classe Java per SecondaryHazardType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SecondaryHazardType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PlacardNotation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PlacardEndorsement" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EmergencyProceduresCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Extension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecondaryHazardType", propOrder = {
    "id",
    "placardNotation",
    "placardEndorsement",
    "emergencyProceduresCode",
    "extension"
})
public class SecondaryHazardType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "PlacardNotation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PlacardNotationType placardNotation;
    @XmlElement(name = "PlacardEndorsement", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PlacardEndorsementType placardEndorsement;
    @XmlElement(name = "EmergencyProceduresCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EmergencyProceduresCodeType emergencyProceduresCode;
    @XmlElement(name = "Extension", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ExtensionType> extension;

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getID() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setID(IDType value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà placardNotation.
     * 
     * @return
     *     possible object is
     *     {@link PlacardNotationType }
     *     
     */
    public PlacardNotationType getPlacardNotation() {
        return placardNotation;
    }

    /**
     * Imposta il valore della proprietà placardNotation.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacardNotationType }
     *     
     */
    public void setPlacardNotation(PlacardNotationType value) {
        this.placardNotation = value;
    }

    /**
     * Recupera il valore della proprietà placardEndorsement.
     * 
     * @return
     *     possible object is
     *     {@link PlacardEndorsementType }
     *     
     */
    public PlacardEndorsementType getPlacardEndorsement() {
        return placardEndorsement;
    }

    /**
     * Imposta il valore della proprietà placardEndorsement.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacardEndorsementType }
     *     
     */
    public void setPlacardEndorsement(PlacardEndorsementType value) {
        this.placardEndorsement = value;
    }

    /**
     * Recupera il valore della proprietà emergencyProceduresCode.
     * 
     * @return
     *     possible object is
     *     {@link EmergencyProceduresCodeType }
     *     
     */
    public EmergencyProceduresCodeType getEmergencyProceduresCode() {
        return emergencyProceduresCode;
    }

    /**
     * Imposta il valore della proprietà emergencyProceduresCode.
     * 
     * @param value
     *     allowed object is
     *     {@link EmergencyProceduresCodeType }
     *     
     */
    public void setEmergencyProceduresCode(EmergencyProceduresCodeType value) {
        this.emergencyProceduresCode = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionType }
     * 
     * 
     */
    public List<ExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<ExtensionType>();
        }
        return this.extension;
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
            IDType theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID, (this.id!= null));
        }
        {
            PlacardNotationType thePlacardNotation;
            thePlacardNotation = this.getPlacardNotation();
            strategy.appendField(locator, this, "placardNotation", buffer, thePlacardNotation, (this.placardNotation!= null));
        }
        {
            PlacardEndorsementType thePlacardEndorsement;
            thePlacardEndorsement = this.getPlacardEndorsement();
            strategy.appendField(locator, this, "placardEndorsement", buffer, thePlacardEndorsement, (this.placardEndorsement!= null));
        }
        {
            EmergencyProceduresCodeType theEmergencyProceduresCode;
            theEmergencyProceduresCode = this.getEmergencyProceduresCode();
            strategy.appendField(locator, this, "emergencyProceduresCode", buffer, theEmergencyProceduresCode, (this.emergencyProceduresCode!= null));
        }
        {
            List<ExtensionType> theExtension;
            theExtension = (((this.extension!= null)&&(!this.extension.isEmpty()))?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theExtension, ((this.extension!= null)&&(!this.extension.isEmpty())));
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
        final SecondaryHazardType that = ((SecondaryHazardType) object);
        {
            IDType lhsID;
            lhsID = this.getID();
            IDType rhsID;
            rhsID = that.getID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsID), LocatorUtils.property(thatLocator, "id", rhsID), lhsID, rhsID, (this.id!= null), (that.id!= null))) {
                return false;
            }
        }
        {
            PlacardNotationType lhsPlacardNotation;
            lhsPlacardNotation = this.getPlacardNotation();
            PlacardNotationType rhsPlacardNotation;
            rhsPlacardNotation = that.getPlacardNotation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "placardNotation", lhsPlacardNotation), LocatorUtils.property(thatLocator, "placardNotation", rhsPlacardNotation), lhsPlacardNotation, rhsPlacardNotation, (this.placardNotation!= null), (that.placardNotation!= null))) {
                return false;
            }
        }
        {
            PlacardEndorsementType lhsPlacardEndorsement;
            lhsPlacardEndorsement = this.getPlacardEndorsement();
            PlacardEndorsementType rhsPlacardEndorsement;
            rhsPlacardEndorsement = that.getPlacardEndorsement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "placardEndorsement", lhsPlacardEndorsement), LocatorUtils.property(thatLocator, "placardEndorsement", rhsPlacardEndorsement), lhsPlacardEndorsement, rhsPlacardEndorsement, (this.placardEndorsement!= null), (that.placardEndorsement!= null))) {
                return false;
            }
        }
        {
            EmergencyProceduresCodeType lhsEmergencyProceduresCode;
            lhsEmergencyProceduresCode = this.getEmergencyProceduresCode();
            EmergencyProceduresCodeType rhsEmergencyProceduresCode;
            rhsEmergencyProceduresCode = that.getEmergencyProceduresCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "emergencyProceduresCode", lhsEmergencyProceduresCode), LocatorUtils.property(thatLocator, "emergencyProceduresCode", rhsEmergencyProceduresCode), lhsEmergencyProceduresCode, rhsEmergencyProceduresCode, (this.emergencyProceduresCode!= null), (that.emergencyProceduresCode!= null))) {
                return false;
            }
        }
        {
            List<ExtensionType> lhsExtension;
            lhsExtension = (((this.extension!= null)&&(!this.extension.isEmpty()))?this.getExtension():null);
            List<ExtensionType> rhsExtension;
            rhsExtension = (((that.extension!= null)&&(!that.extension.isEmpty()))?that.getExtension():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "extension", lhsExtension), LocatorUtils.property(thatLocator, "extension", rhsExtension), lhsExtension, rhsExtension, ((this.extension!= null)&&(!this.extension.isEmpty())), ((that.extension!= null)&&(!that.extension.isEmpty())))) {
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
            IDType theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID, (this.id!= null));
        }
        {
            PlacardNotationType thePlacardNotation;
            thePlacardNotation = this.getPlacardNotation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "placardNotation", thePlacardNotation), currentHashCode, thePlacardNotation, (this.placardNotation!= null));
        }
        {
            PlacardEndorsementType thePlacardEndorsement;
            thePlacardEndorsement = this.getPlacardEndorsement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "placardEndorsement", thePlacardEndorsement), currentHashCode, thePlacardEndorsement, (this.placardEndorsement!= null));
        }
        {
            EmergencyProceduresCodeType theEmergencyProceduresCode;
            theEmergencyProceduresCode = this.getEmergencyProceduresCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "emergencyProceduresCode", theEmergencyProceduresCode), currentHashCode, theEmergencyProceduresCode, (this.emergencyProceduresCode!= null));
        }
        {
            List<ExtensionType> theExtension;
            theExtension = (((this.extension!= null)&&(!this.extension.isEmpty()))?this.getExtension():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "extension", theExtension), currentHashCode, theExtension, ((this.extension!= null)&&(!this.extension.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
