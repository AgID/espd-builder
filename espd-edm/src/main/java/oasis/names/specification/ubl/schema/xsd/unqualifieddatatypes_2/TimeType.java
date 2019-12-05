//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package oasis.names.specification.ubl.schema.xsd.unqualifieddatatypes_2;

import java.io.Serializable;
import java.time.LocalTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ActualDeliveryTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ActualDespatchTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ActualPickupTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AwardTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CallTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ComparisonForecastIssueTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EarliestPickupTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EffectiveTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EndTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EstimatedDeliveryTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EstimatedDespatchTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExpiryTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.GuaranteedDespatchTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IssueTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LastRevisionTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LatestDeliveryTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LatestPickupTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LatestReplyTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ManufactureTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NominationTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.OccurrenceTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PaidTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ReferenceTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RegisteredTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RequestedDespatchTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RequiredDeliveryTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResolutionTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RevisionTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SourceForecastIssueTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.StartTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValidationTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.WeighingTimeType;
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
import org.w3._2001.xmlschema.Adapter1;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UBLUDT0000010&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Time. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;An instance of time that occurs every day.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Time&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java per TimeType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TimeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;time"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeType", propOrder = {
    "value"
})
@XmlSeeAlso({
    ActualDeliveryTimeType.class,
    ActualDespatchTimeType.class,
    ActualPickupTimeType.class,
    AwardTimeType.class,
    CallTimeType.class,
    ComparisonForecastIssueTimeType.class,
    EarliestPickupTimeType.class,
    EffectiveTimeType.class,
    EndTimeType.class,
    EstimatedDeliveryTimeType.class,
    EstimatedDespatchTimeType.class,
    ExpiryTimeType.class,
    GuaranteedDespatchTimeType.class,
    IssueTimeType.class,
    LastRevisionTimeType.class,
    LatestDeliveryTimeType.class,
    LatestPickupTimeType.class,
    LatestReplyTimeType.class,
    ManufactureTimeType.class,
    NominationTimeType.class,
    OccurrenceTimeType.class,
    PaidTimeType.class,
    ReferenceTimeType.class,
    RegisteredTimeType.class,
    RequestedDespatchTimeType.class,
    RequiredDeliveryTimeType.class,
    ResolutionTimeType.class,
    ResponseTimeType.class,
    RevisionTimeType.class,
    SourceForecastIssueTimeType.class,
    StartTimeType.class,
    ValidationTimeType.class,
    WeighingTimeType.class
})
public class TimeType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlValue
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "time")
    protected LocalTime value;

    /**
     * Recupera il valore della proprietà value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalTime getValue() {
        return value;
    }

    /**
     * Imposta il valore della proprietà value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(LocalTime value) {
        this.value = value;
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
            LocalTime theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
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
        final TimeType that = ((TimeType) object);
        {
            LocalTime lhsValue;
            lhsValue = this.getValue();
            LocalTime rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue, (this.value!= null), (that.value!= null))) {
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
            LocalTime theValue;
            theValue = this.getValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue, (this.value!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
