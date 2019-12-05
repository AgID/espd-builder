//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package oasis.names.specification.ubl.schema.xsd.unqualifieddatatypes_2;

import java.io.Serializable;
import java.time.LocalDate;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ActualDeliveryDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ActualDespatchDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ActualPickupDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ApprovalDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AvailabilityDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AwardDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BestBeforeDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BirthDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CallDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ComparisonForecastIssueDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DueDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EarliestPickupDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EffectiveDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EndDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EstimatedDeliveryDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EstimatedDespatchDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExpiryDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FirstShipmentAvailibilityDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.GuaranteedDespatchDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.InstallmentDueDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IssueDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LastRevisionDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LatestDeliveryDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LatestMeterReadingDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LatestPickupDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LatestProposalAcceptanceDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LatestReplyDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LatestSecurityClearanceDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ManufactureDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NominationDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.OccurrenceDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PaidDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PaymentDueDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PlannedDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PreviousMeterReadingDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ReceivedDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ReferenceDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RegisteredDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RegistrationDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RegistrationExpirationDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RequestedDeliveryDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RequestedDespatchDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RequestedPublicationDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RequiredDeliveryDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResolutionDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RevisionDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SourceForecastIssueDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.StartDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SubmissionDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SubmissionDueDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TaxPointDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValidationDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValidityStartDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.WeighingDateType;
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
import org.w3._2001.xmlschema.Adapter2;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UBLUDT000009&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Date. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;One calendar day according the Gregorian calendar.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Date&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java per DateType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DateType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;date"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateType", propOrder = {
    "value"
})
@XmlSeeAlso({
    ActualDeliveryDateType.class,
    ActualDespatchDateType.class,
    ActualPickupDateType.class,
    ApprovalDateType.class,
    AvailabilityDateType.class,
    AwardDateType.class,
    BestBeforeDateType.class,
    BirthDateType.class,
    CallDateType.class,
    ComparisonForecastIssueDateType.class,
    oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DateType.class,
    DueDateType.class,
    EarliestPickupDateType.class,
    EffectiveDateType.class,
    EndDateType.class,
    EstimatedDeliveryDateType.class,
    EstimatedDespatchDateType.class,
    ExpiryDateType.class,
    FirstShipmentAvailibilityDateType.class,
    GuaranteedDespatchDateType.class,
    InstallmentDueDateType.class,
    IssueDateType.class,
    LastRevisionDateType.class,
    LatestDeliveryDateType.class,
    LatestMeterReadingDateType.class,
    LatestPickupDateType.class,
    LatestProposalAcceptanceDateType.class,
    LatestReplyDateType.class,
    LatestSecurityClearanceDateType.class,
    ManufactureDateType.class,
    NominationDateType.class,
    OccurrenceDateType.class,
    PaidDateType.class,
    PaymentDueDateType.class,
    PlannedDateType.class,
    PreviousMeterReadingDateType.class,
    ReceivedDateType.class,
    ReferenceDateType.class,
    RegisteredDateType.class,
    RegistrationDateType.class,
    RegistrationExpirationDateType.class,
    RequestedDeliveryDateType.class,
    RequestedDespatchDateType.class,
    RequestedPublicationDateType.class,
    RequiredDeliveryDateType.class,
    ResolutionDateType.class,
    ResponseDateType.class,
    RevisionDateType.class,
    SourceForecastIssueDateType.class,
    StartDateType.class,
    SubmissionDateType.class,
    SubmissionDueDateType.class,
    TaxPointDateType.class,
    ValidationDateType.class,
    ValidityStartDateType.class,
    WeighingDateType.class
})
public class DateType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlValue
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate value;

    /**
     * Recupera il valore della proprietà value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getValue() {
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
    public void setValue(LocalDate value) {
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
            LocalDate theValue;
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
        final DateType that = ((DateType) object);
        {
            LocalDate lhsValue;
            lhsValue = this.getValue();
            LocalDate rhsValue;
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
            LocalDate theValue;
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
