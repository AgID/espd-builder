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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CargoTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CommodityCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ItemClassificationCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NatureCodeType;
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
 * <p>Classe Java per CommodityClassificationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CommodityClassificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NatureCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CargoTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CommodityCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ItemClassificationCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityClassificationType", propOrder = {
    "natureCode",
    "cargoTypeCode",
    "commodityCode",
    "itemClassificationCode"
})
public class CommodityClassificationType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "NatureCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NatureCodeType natureCode;
    @XmlElement(name = "CargoTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CargoTypeCodeType cargoTypeCode;
    @XmlElement(name = "CommodityCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CommodityCodeType commodityCode;
    @XmlElement(name = "ItemClassificationCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ItemClassificationCodeType itemClassificationCode;

    /**
     * Recupera il valore della proprietà natureCode.
     * 
     * @return
     *     possible object is
     *     {@link NatureCodeType }
     *     
     */
    public NatureCodeType getNatureCode() {
        return natureCode;
    }

    /**
     * Imposta il valore della proprietà natureCode.
     * 
     * @param value
     *     allowed object is
     *     {@link NatureCodeType }
     *     
     */
    public void setNatureCode(NatureCodeType value) {
        this.natureCode = value;
    }

    /**
     * Recupera il valore della proprietà cargoTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link CargoTypeCodeType }
     *     
     */
    public CargoTypeCodeType getCargoTypeCode() {
        return cargoTypeCode;
    }

    /**
     * Imposta il valore della proprietà cargoTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CargoTypeCodeType }
     *     
     */
    public void setCargoTypeCode(CargoTypeCodeType value) {
        this.cargoTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà commodityCode.
     * 
     * @return
     *     possible object is
     *     {@link CommodityCodeType }
     *     
     */
    public CommodityCodeType getCommodityCode() {
        return commodityCode;
    }

    /**
     * Imposta il valore della proprietà commodityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityCodeType }
     *     
     */
    public void setCommodityCode(CommodityCodeType value) {
        this.commodityCode = value;
    }

    /**
     * Recupera il valore della proprietà itemClassificationCode.
     * 
     * @return
     *     possible object is
     *     {@link ItemClassificationCodeType }
     *     
     */
    public ItemClassificationCodeType getItemClassificationCode() {
        return itemClassificationCode;
    }

    /**
     * Imposta il valore della proprietà itemClassificationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemClassificationCodeType }
     *     
     */
    public void setItemClassificationCode(ItemClassificationCodeType value) {
        this.itemClassificationCode = value;
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
            NatureCodeType theNatureCode;
            theNatureCode = this.getNatureCode();
            strategy.appendField(locator, this, "natureCode", buffer, theNatureCode, (this.natureCode!= null));
        }
        {
            CargoTypeCodeType theCargoTypeCode;
            theCargoTypeCode = this.getCargoTypeCode();
            strategy.appendField(locator, this, "cargoTypeCode", buffer, theCargoTypeCode, (this.cargoTypeCode!= null));
        }
        {
            CommodityCodeType theCommodityCode;
            theCommodityCode = this.getCommodityCode();
            strategy.appendField(locator, this, "commodityCode", buffer, theCommodityCode, (this.commodityCode!= null));
        }
        {
            ItemClassificationCodeType theItemClassificationCode;
            theItemClassificationCode = this.getItemClassificationCode();
            strategy.appendField(locator, this, "itemClassificationCode", buffer, theItemClassificationCode, (this.itemClassificationCode!= null));
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
        final CommodityClassificationType that = ((CommodityClassificationType) object);
        {
            NatureCodeType lhsNatureCode;
            lhsNatureCode = this.getNatureCode();
            NatureCodeType rhsNatureCode;
            rhsNatureCode = that.getNatureCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "natureCode", lhsNatureCode), LocatorUtils.property(thatLocator, "natureCode", rhsNatureCode), lhsNatureCode, rhsNatureCode, (this.natureCode!= null), (that.natureCode!= null))) {
                return false;
            }
        }
        {
            CargoTypeCodeType lhsCargoTypeCode;
            lhsCargoTypeCode = this.getCargoTypeCode();
            CargoTypeCodeType rhsCargoTypeCode;
            rhsCargoTypeCode = that.getCargoTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cargoTypeCode", lhsCargoTypeCode), LocatorUtils.property(thatLocator, "cargoTypeCode", rhsCargoTypeCode), lhsCargoTypeCode, rhsCargoTypeCode, (this.cargoTypeCode!= null), (that.cargoTypeCode!= null))) {
                return false;
            }
        }
        {
            CommodityCodeType lhsCommodityCode;
            lhsCommodityCode = this.getCommodityCode();
            CommodityCodeType rhsCommodityCode;
            rhsCommodityCode = that.getCommodityCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "commodityCode", lhsCommodityCode), LocatorUtils.property(thatLocator, "commodityCode", rhsCommodityCode), lhsCommodityCode, rhsCommodityCode, (this.commodityCode!= null), (that.commodityCode!= null))) {
                return false;
            }
        }
        {
            ItemClassificationCodeType lhsItemClassificationCode;
            lhsItemClassificationCode = this.getItemClassificationCode();
            ItemClassificationCodeType rhsItemClassificationCode;
            rhsItemClassificationCode = that.getItemClassificationCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemClassificationCode", lhsItemClassificationCode), LocatorUtils.property(thatLocator, "itemClassificationCode", rhsItemClassificationCode), lhsItemClassificationCode, rhsItemClassificationCode, (this.itemClassificationCode!= null), (that.itemClassificationCode!= null))) {
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
            NatureCodeType theNatureCode;
            theNatureCode = this.getNatureCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "natureCode", theNatureCode), currentHashCode, theNatureCode, (this.natureCode!= null));
        }
        {
            CargoTypeCodeType theCargoTypeCode;
            theCargoTypeCode = this.getCargoTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cargoTypeCode", theCargoTypeCode), currentHashCode, theCargoTypeCode, (this.cargoTypeCode!= null));
        }
        {
            CommodityCodeType theCommodityCode;
            theCommodityCode = this.getCommodityCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "commodityCode", theCommodityCode), currentHashCode, theCommodityCode, (this.commodityCode!= null));
        }
        {
            ItemClassificationCodeType theItemClassificationCode;
            theItemClassificationCode = this.getItemClassificationCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemClassificationCode", theItemClassificationCode), currentHashCode, theItemClassificationCode, (this.itemClassificationCode!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
