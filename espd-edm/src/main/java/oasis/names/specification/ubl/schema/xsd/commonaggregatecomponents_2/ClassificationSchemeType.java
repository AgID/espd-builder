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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AgencyIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AgencyNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LanguageIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LastRevisionDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LastRevisionTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NoteType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SchemeURIType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.URIType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.UUIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.VersionIDType;
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
 * <p>Classe Java per ClassificationSchemeType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ClassificationSchemeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UUID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LastRevisionDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LastRevisionTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AgencyID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AgencyName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}VersionID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}URI" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SchemeURI" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LanguageID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ClassificationCategory" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassificationSchemeType", propOrder = {
    "id",
    "uuid",
    "lastRevisionDate",
    "lastRevisionTime",
    "note",
    "name",
    "description",
    "agencyID",
    "agencyName",
    "versionID",
    "uri",
    "schemeURI",
    "languageID",
    "classificationCategory"
})
public class ClassificationSchemeType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IDType id;
    @XmlElement(name = "UUID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected UUIDType uuid;
    @XmlElement(name = "LastRevisionDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LastRevisionDateType lastRevisionDate;
    @XmlElement(name = "LastRevisionTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LastRevisionTimeType lastRevisionTime;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<NoteType> note;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NameType name;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "AgencyID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AgencyIDType agencyID;
    @XmlElement(name = "AgencyName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AgencyNameType agencyName;
    @XmlElement(name = "VersionID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected VersionIDType versionID;
    @XmlElement(name = "URI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected URIType uri;
    @XmlElement(name = "SchemeURI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SchemeURIType schemeURI;
    @XmlElement(name = "LanguageID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LanguageIDType languageID;
    @XmlElement(name = "ClassificationCategory", required = true)
    protected List<ClassificationCategoryType> classificationCategory;

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
     * Recupera il valore della proprietà uuid.
     * 
     * @return
     *     possible object is
     *     {@link UUIDType }
     *     
     */
    public UUIDType getUUID() {
        return uuid;
    }

    /**
     * Imposta il valore della proprietà uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link UUIDType }
     *     
     */
    public void setUUID(UUIDType value) {
        this.uuid = value;
    }

    /**
     * Recupera il valore della proprietà lastRevisionDate.
     * 
     * @return
     *     possible object is
     *     {@link LastRevisionDateType }
     *     
     */
    public LastRevisionDateType getLastRevisionDate() {
        return lastRevisionDate;
    }

    /**
     * Imposta il valore della proprietà lastRevisionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link LastRevisionDateType }
     *     
     */
    public void setLastRevisionDate(LastRevisionDateType value) {
        this.lastRevisionDate = value;
    }

    /**
     * Recupera il valore della proprietà lastRevisionTime.
     * 
     * @return
     *     possible object is
     *     {@link LastRevisionTimeType }
     *     
     */
    public LastRevisionTimeType getLastRevisionTime() {
        return lastRevisionTime;
    }

    /**
     * Imposta il valore della proprietà lastRevisionTime.
     * 
     * @param value
     *     allowed object is
     *     {@link LastRevisionTimeType }
     *     
     */
    public void setLastRevisionTime(LastRevisionTimeType value) {
        this.lastRevisionTime = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoteType }
     * 
     * 
     */
    public List<NoteType> getNote() {
        if (note == null) {
            note = new ArrayList<NoteType>();
        }
        return this.note;
    }

    /**
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setName(NameType value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Recupera il valore della proprietà agencyID.
     * 
     * @return
     *     possible object is
     *     {@link AgencyIDType }
     *     
     */
    public AgencyIDType getAgencyID() {
        return agencyID;
    }

    /**
     * Imposta il valore della proprietà agencyID.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyIDType }
     *     
     */
    public void setAgencyID(AgencyIDType value) {
        this.agencyID = value;
    }

    /**
     * Recupera il valore della proprietà agencyName.
     * 
     * @return
     *     possible object is
     *     {@link AgencyNameType }
     *     
     */
    public AgencyNameType getAgencyName() {
        return agencyName;
    }

    /**
     * Imposta il valore della proprietà agencyName.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyNameType }
     *     
     */
    public void setAgencyName(AgencyNameType value) {
        this.agencyName = value;
    }

    /**
     * Recupera il valore della proprietà versionID.
     * 
     * @return
     *     possible object is
     *     {@link VersionIDType }
     *     
     */
    public VersionIDType getVersionID() {
        return versionID;
    }

    /**
     * Imposta il valore della proprietà versionID.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionIDType }
     *     
     */
    public void setVersionID(VersionIDType value) {
        this.versionID = value;
    }

    /**
     * Recupera il valore della proprietà uri.
     * 
     * @return
     *     possible object is
     *     {@link URIType }
     *     
     */
    public URIType getURI() {
        return uri;
    }

    /**
     * Imposta il valore della proprietà uri.
     * 
     * @param value
     *     allowed object is
     *     {@link URIType }
     *     
     */
    public void setURI(URIType value) {
        this.uri = value;
    }

    /**
     * Recupera il valore della proprietà schemeURI.
     * 
     * @return
     *     possible object is
     *     {@link SchemeURIType }
     *     
     */
    public SchemeURIType getSchemeURI() {
        return schemeURI;
    }

    /**
     * Imposta il valore della proprietà schemeURI.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemeURIType }
     *     
     */
    public void setSchemeURI(SchemeURIType value) {
        this.schemeURI = value;
    }

    /**
     * Recupera il valore della proprietà languageID.
     * 
     * @return
     *     possible object is
     *     {@link LanguageIDType }
     *     
     */
    public LanguageIDType getLanguageID() {
        return languageID;
    }

    /**
     * Imposta il valore della proprietà languageID.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageIDType }
     *     
     */
    public void setLanguageID(LanguageIDType value) {
        this.languageID = value;
    }

    /**
     * Gets the value of the classificationCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classificationCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassificationCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationCategoryType }
     * 
     * 
     */
    public List<ClassificationCategoryType> getClassificationCategory() {
        if (classificationCategory == null) {
            classificationCategory = new ArrayList<ClassificationCategoryType>();
        }
        return this.classificationCategory;
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
            UUIDType theUUID;
            theUUID = this.getUUID();
            strategy.appendField(locator, this, "uuid", buffer, theUUID, (this.uuid!= null));
        }
        {
            LastRevisionDateType theLastRevisionDate;
            theLastRevisionDate = this.getLastRevisionDate();
            strategy.appendField(locator, this, "lastRevisionDate", buffer, theLastRevisionDate, (this.lastRevisionDate!= null));
        }
        {
            LastRevisionTimeType theLastRevisionTime;
            theLastRevisionTime = this.getLastRevisionTime();
            strategy.appendField(locator, this, "lastRevisionTime", buffer, theLastRevisionTime, (this.lastRevisionTime!= null));
        }
        {
            List<NoteType> theNote;
            theNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            strategy.appendField(locator, this, "note", buffer, theNote, ((this.note!= null)&&(!this.note.isEmpty())));
        }
        {
            NameType theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            AgencyIDType theAgencyID;
            theAgencyID = this.getAgencyID();
            strategy.appendField(locator, this, "agencyID", buffer, theAgencyID, (this.agencyID!= null));
        }
        {
            AgencyNameType theAgencyName;
            theAgencyName = this.getAgencyName();
            strategy.appendField(locator, this, "agencyName", buffer, theAgencyName, (this.agencyName!= null));
        }
        {
            VersionIDType theVersionID;
            theVersionID = this.getVersionID();
            strategy.appendField(locator, this, "versionID", buffer, theVersionID, (this.versionID!= null));
        }
        {
            URIType theURI;
            theURI = this.getURI();
            strategy.appendField(locator, this, "uri", buffer, theURI, (this.uri!= null));
        }
        {
            SchemeURIType theSchemeURI;
            theSchemeURI = this.getSchemeURI();
            strategy.appendField(locator, this, "schemeURI", buffer, theSchemeURI, (this.schemeURI!= null));
        }
        {
            LanguageIDType theLanguageID;
            theLanguageID = this.getLanguageID();
            strategy.appendField(locator, this, "languageID", buffer, theLanguageID, (this.languageID!= null));
        }
        {
            List<ClassificationCategoryType> theClassificationCategory;
            theClassificationCategory = (((this.classificationCategory!= null)&&(!this.classificationCategory.isEmpty()))?this.getClassificationCategory():null);
            strategy.appendField(locator, this, "classificationCategory", buffer, theClassificationCategory, ((this.classificationCategory!= null)&&(!this.classificationCategory.isEmpty())));
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
        final ClassificationSchemeType that = ((ClassificationSchemeType) object);
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
            UUIDType lhsUUID;
            lhsUUID = this.getUUID();
            UUIDType rhsUUID;
            rhsUUID = that.getUUID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uuid", lhsUUID), LocatorUtils.property(thatLocator, "uuid", rhsUUID), lhsUUID, rhsUUID, (this.uuid!= null), (that.uuid!= null))) {
                return false;
            }
        }
        {
            LastRevisionDateType lhsLastRevisionDate;
            lhsLastRevisionDate = this.getLastRevisionDate();
            LastRevisionDateType rhsLastRevisionDate;
            rhsLastRevisionDate = that.getLastRevisionDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastRevisionDate", lhsLastRevisionDate), LocatorUtils.property(thatLocator, "lastRevisionDate", rhsLastRevisionDate), lhsLastRevisionDate, rhsLastRevisionDate, (this.lastRevisionDate!= null), (that.lastRevisionDate!= null))) {
                return false;
            }
        }
        {
            LastRevisionTimeType lhsLastRevisionTime;
            lhsLastRevisionTime = this.getLastRevisionTime();
            LastRevisionTimeType rhsLastRevisionTime;
            rhsLastRevisionTime = that.getLastRevisionTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastRevisionTime", lhsLastRevisionTime), LocatorUtils.property(thatLocator, "lastRevisionTime", rhsLastRevisionTime), lhsLastRevisionTime, rhsLastRevisionTime, (this.lastRevisionTime!= null), (that.lastRevisionTime!= null))) {
                return false;
            }
        }
        {
            List<NoteType> lhsNote;
            lhsNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            List<NoteType> rhsNote;
            rhsNote = (((that.note!= null)&&(!that.note.isEmpty()))?that.getNote():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "note", lhsNote), LocatorUtils.property(thatLocator, "note", rhsNote), lhsNote, rhsNote, ((this.note!= null)&&(!this.note.isEmpty())), ((that.note!= null)&&(!that.note.isEmpty())))) {
                return false;
            }
        }
        {
            NameType lhsName;
            lhsName = this.getName();
            NameType rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
                return false;
            }
        }
        {
            List<DescriptionType> lhsDescription;
            lhsDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            List<DescriptionType> rhsDescription;
            rhsDescription = (((that.description!= null)&&(!that.description.isEmpty()))?that.getDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, ((this.description!= null)&&(!this.description.isEmpty())), ((that.description!= null)&&(!that.description.isEmpty())))) {
                return false;
            }
        }
        {
            AgencyIDType lhsAgencyID;
            lhsAgencyID = this.getAgencyID();
            AgencyIDType rhsAgencyID;
            rhsAgencyID = that.getAgencyID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "agencyID", lhsAgencyID), LocatorUtils.property(thatLocator, "agencyID", rhsAgencyID), lhsAgencyID, rhsAgencyID, (this.agencyID!= null), (that.agencyID!= null))) {
                return false;
            }
        }
        {
            AgencyNameType lhsAgencyName;
            lhsAgencyName = this.getAgencyName();
            AgencyNameType rhsAgencyName;
            rhsAgencyName = that.getAgencyName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "agencyName", lhsAgencyName), LocatorUtils.property(thatLocator, "agencyName", rhsAgencyName), lhsAgencyName, rhsAgencyName, (this.agencyName!= null), (that.agencyName!= null))) {
                return false;
            }
        }
        {
            VersionIDType lhsVersionID;
            lhsVersionID = this.getVersionID();
            VersionIDType rhsVersionID;
            rhsVersionID = that.getVersionID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "versionID", lhsVersionID), LocatorUtils.property(thatLocator, "versionID", rhsVersionID), lhsVersionID, rhsVersionID, (this.versionID!= null), (that.versionID!= null))) {
                return false;
            }
        }
        {
            URIType lhsURI;
            lhsURI = this.getURI();
            URIType rhsURI;
            rhsURI = that.getURI();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uri", lhsURI), LocatorUtils.property(thatLocator, "uri", rhsURI), lhsURI, rhsURI, (this.uri!= null), (that.uri!= null))) {
                return false;
            }
        }
        {
            SchemeURIType lhsSchemeURI;
            lhsSchemeURI = this.getSchemeURI();
            SchemeURIType rhsSchemeURI;
            rhsSchemeURI = that.getSchemeURI();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schemeURI", lhsSchemeURI), LocatorUtils.property(thatLocator, "schemeURI", rhsSchemeURI), lhsSchemeURI, rhsSchemeURI, (this.schemeURI!= null), (that.schemeURI!= null))) {
                return false;
            }
        }
        {
            LanguageIDType lhsLanguageID;
            lhsLanguageID = this.getLanguageID();
            LanguageIDType rhsLanguageID;
            rhsLanguageID = that.getLanguageID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "languageID", lhsLanguageID), LocatorUtils.property(thatLocator, "languageID", rhsLanguageID), lhsLanguageID, rhsLanguageID, (this.languageID!= null), (that.languageID!= null))) {
                return false;
            }
        }
        {
            List<ClassificationCategoryType> lhsClassificationCategory;
            lhsClassificationCategory = (((this.classificationCategory!= null)&&(!this.classificationCategory.isEmpty()))?this.getClassificationCategory():null);
            List<ClassificationCategoryType> rhsClassificationCategory;
            rhsClassificationCategory = (((that.classificationCategory!= null)&&(!that.classificationCategory.isEmpty()))?that.getClassificationCategory():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classificationCategory", lhsClassificationCategory), LocatorUtils.property(thatLocator, "classificationCategory", rhsClassificationCategory), lhsClassificationCategory, rhsClassificationCategory, ((this.classificationCategory!= null)&&(!this.classificationCategory.isEmpty())), ((that.classificationCategory!= null)&&(!that.classificationCategory.isEmpty())))) {
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
            UUIDType theUUID;
            theUUID = this.getUUID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uuid", theUUID), currentHashCode, theUUID, (this.uuid!= null));
        }
        {
            LastRevisionDateType theLastRevisionDate;
            theLastRevisionDate = this.getLastRevisionDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastRevisionDate", theLastRevisionDate), currentHashCode, theLastRevisionDate, (this.lastRevisionDate!= null));
        }
        {
            LastRevisionTimeType theLastRevisionTime;
            theLastRevisionTime = this.getLastRevisionTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastRevisionTime", theLastRevisionTime), currentHashCode, theLastRevisionTime, (this.lastRevisionTime!= null));
        }
        {
            List<NoteType> theNote;
            theNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "note", theNote), currentHashCode, theNote, ((this.note!= null)&&(!this.note.isEmpty())));
        }
        {
            NameType theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            AgencyIDType theAgencyID;
            theAgencyID = this.getAgencyID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "agencyID", theAgencyID), currentHashCode, theAgencyID, (this.agencyID!= null));
        }
        {
            AgencyNameType theAgencyName;
            theAgencyName = this.getAgencyName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "agencyName", theAgencyName), currentHashCode, theAgencyName, (this.agencyName!= null));
        }
        {
            VersionIDType theVersionID;
            theVersionID = this.getVersionID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "versionID", theVersionID), currentHashCode, theVersionID, (this.versionID!= null));
        }
        {
            URIType theURI;
            theURI = this.getURI();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uri", theURI), currentHashCode, theURI, (this.uri!= null));
        }
        {
            SchemeURIType theSchemeURI;
            theSchemeURI = this.getSchemeURI();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "schemeURI", theSchemeURI), currentHashCode, theSchemeURI, (this.schemeURI!= null));
        }
        {
            LanguageIDType theLanguageID;
            theLanguageID = this.getLanguageID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "languageID", theLanguageID), currentHashCode, theLanguageID, (this.languageID!= null));
        }
        {
            List<ClassificationCategoryType> theClassificationCategory;
            theClassificationCategory = (((this.classificationCategory!= null)&&(!this.classificationCategory.isEmpty()))?this.getClassificationCategory():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classificationCategory", theClassificationCategory), currentHashCode, theClassificationCategory, ((this.classificationCategory!= null)&&(!this.classificationCategory.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
