//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package oasis.names.specification.ubl.schema.xsd.unqualifieddatatypes_2;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AdditionalStreetNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AgencyNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AliasNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BirthplaceNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BlockNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BrandNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BuildingNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CategoryNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CityNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CitySubdivisionNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ContractNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EconomicOperatorGroupNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FamilyNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FileNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FirstNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.HolderNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MeterNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MiddleNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ModelNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.OtherNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RegistrationNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RetailEventNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RoamingPartnerNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ServiceNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.StreetNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TechnicalNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.VesselNameType;
import oasis.names.specification.ubl.schema.xsd.commonextensioncomponents_2.ExtensionAgencyNameType;
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
import un.unece.uncefact.data.specification.corecomponenttypeschemamodule._2.TextType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UBLUDT0000020&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Name. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A character string that constitutes the distinctive
 * 					designation of a person, place, thing or concept.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Name&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java per NameType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="NameType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2&gt;TextType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameType")
@XmlSeeAlso({
    AdditionalStreetNameType.class,
    AgencyNameType.class,
    AliasNameType.class,
    BirthplaceNameType.class,
    BlockNameType.class,
    BrandNameType.class,
    BuildingNameType.class,
    CategoryNameType.class,
    CityNameType.class,
    CitySubdivisionNameType.class,
    ContractNameType.class,
    EconomicOperatorGroupNameType.class,
    FamilyNameType.class,
    FileNameType.class,
    FirstNameType.class,
    HolderNameType.class,
    MeterNameType.class,
    MiddleNameType.class,
    ModelNameType.class,
    oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NameType.class,
    OtherNameType.class,
    RegistrationNameType.class,
    RetailEventNameType.class,
    RoamingPartnerNameType.class,
    ServiceNameType.class,
    StreetNameType.class,
    TechnicalNameType.class,
    VesselNameType.class,
    ExtensionAgencyNameType.class
})
public class NameType
    extends TextType
    implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;

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
        super.appendFields(locator, buffer, strategy);
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
