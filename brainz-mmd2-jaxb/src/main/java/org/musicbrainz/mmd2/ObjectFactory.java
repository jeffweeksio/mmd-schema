
package org.musicbrainz.mmd2;

import java.math.BigInteger;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.musicbrainz.mmd2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Iswc_QNAME = new QName("http://musicbrainz.org/ns/mmd-2.0#", "iswc");
    private final static QName _Disambiguation_QNAME = new QName("http://musicbrainz.org/ns/mmd-2.0#", "disambiguation");
    private final static QName _Target_QNAME = new QName("http://musicbrainz.org/ns/mmd-2.0#", "target");
    private final static QName _Language_QNAME = new QName("http://musicbrainz.org/ns/mmd-2.0#", "language");
    private final static QName _Attributes_QNAME = new QName("http://musicbrainz.org/ns/mmd-2.0#", "attributes");
    private final static QName _UserRating_QNAME = new QName("http://musicbrainz.org/ns/mmd-2.0#", "user-rating");
    private final static QName _Status_QNAME = new QName("http://musicbrainz.org/ns/mmd-2.0#", "status");
    private final static QName _CatalogNumber_QNAME = new QName("http://musicbrainz.org/ns/mmd-2.0#", "catalog-number");
    private final static QName _SortName_QNAME = new QName("http://musicbrainz.org/ns/mmd-2.0#", "sort-name");
    private final static QName _Barcode_QNAME = new QName("http://musicbrainz.org/ns/mmd-2.0#", "barcode");
    private final static QName _Format_QNAME = new QName("http://musicbrainz.org/ns/mmd-2.0#", "format");
    private final static QName _Sectors_QNAME = new QName("http://musicbrainz.org/ns/mmd-2.0#", "sectors");
    private final static QName _Script_QNAME = new QName("http://musicbrainz.org/ns/mmd-2.0#", "script");
    private final static QName _Begin_QNAME = new QName("http://musicbrainz.org/ns/mmd-2.0#", "begin");
    private final static QName _Title_QNAME = new QName("http://musicbrainz.org/ns/mmd-2.0#", "title");
    private final static QName _LabelCode_QNAME = new QName("http://musicbrainz.org/ns/mmd-2.0#", "label-code");
    private final static QName _UserTag_QNAME = new QName("http://musicbrainz.org/ns/mmd-2.0#", "user-tag");
    private final static QName _Packaging_QNAME = new QName("http://musicbrainz.org/ns/mmd-2.0#", "packaging");
    private final static QName _Name_QNAME = new QName("http://musicbrainz.org/ns/mmd-2.0#", "name");
    private final static QName _Length_QNAME = new QName("http://musicbrainz.org/ns/mmd-2.0#", "length");
    private final static QName _Gender_QNAME = new QName("http://musicbrainz.org/ns/mmd-2.0#", "gender");
    private final static QName _End_QNAME = new QName("http://musicbrainz.org/ns/mmd-2.0#", "end");
    private final static QName _Position_QNAME = new QName("http://musicbrainz.org/ns/mmd-2.0#", "position");
    private final static QName _Isrc_QNAME = new QName("http://musicbrainz.org/ns/mmd-2.0#", "isrc");
    private final static QName _Asin_QNAME = new QName("http://musicbrainz.org/ns/mmd-2.0#", "asin");
    private final static QName _Direction_QNAME = new QName("http://musicbrainz.org/ns/mmd-2.0#", "direction");
    private final static QName _Date_QNAME = new QName("http://musicbrainz.org/ns/mmd-2.0#", "date");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.musicbrainz.mmd2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RelationList }
     * 
     */
    public RelationList createRelationList() {
        return new RelationList();
    }

    /**
     * Create an instance of {@link Release }
     * 
     */
    public Release createRelease() {
        return new Release();
    }

    /**
     * Create an instance of {@link Alias }
     * 
     */
    public Alias createAlias() {
        return new Alias();
    }

    /**
     * Create an instance of {@link UserTagList }
     * 
     */
    public UserTagList createUserTagList() {
        return new UserTagList();
    }

    /**
     * Create an instance of {@link Rating }
     * 
     */
    public Rating createRating() {
        return new Rating();
    }

    /**
     * Create an instance of {@link ArtistList }
     * 
     */
    public ArtistList createArtistList() {
        return new ArtistList();
    }

    /**
     * Create an instance of {@link ReleaseGroup }
     * 
     */
    public ReleaseGroup createReleaseGroup() {
        return new ReleaseGroup();
    }

    /**
     * Create an instance of {@link Label }
     * 
     */
    public Label createLabel() {
        return new Label();
    }

    /**
     * Create an instance of {@link Work }
     * 
     */
    public Work createWork() {
        return new Work();
    }

    /**
     * Create an instance of {@link Track }
     * 
     */
    public Track createTrack() {
        return new Track();
    }

    /**
     * Create an instance of {@link PuidList }
     * 
     */
    public PuidList createPuidList() {
        return new PuidList();
    }

    /**
     * Create an instance of {@link RecordingList }
     * 
     */
    public RecordingList createRecordingList() {
        return new RecordingList();
    }

    /**
     * Create an instance of {@link LabelInfo }
     * 
     */
    public LabelInfo createLabelInfo() {
        return new LabelInfo();
    }

    /**
     * Create an instance of {@link LabelList }
     * 
     */
    public LabelList createLabelList() {
        return new LabelList();
    }

    /**
     * Create an instance of {@link Recording }
     * 
     */
    public Recording createRecording() {
        return new Recording();
    }

    /**
     * Create an instance of {@link Medium }
     * 
     */
    public Medium createMedium() {
        return new Medium();
    }

    /**
     * Create an instance of {@link DiscList }
     * 
     */
    public DiscList createDiscList() {
        return new DiscList();
    }

    /**
     * Create an instance of {@link NameCredit }
     * 
     */
    public NameCredit createNameCredit() {
        return new NameCredit();
    }

    /**
     * Create an instance of {@link MediumList }
     * 
     */
    public MediumList createMediumList() {
        return new MediumList();
    }

    /**
     * Create an instance of {@link Puid }
     * 
     */
    public Puid createPuid() {
        return new Puid();
    }

    /**
     * Create an instance of {@link IsrcList }
     * 
     */
    public IsrcList createIsrcList() {
        return new IsrcList();
    }

    /**
     * Create an instance of {@link TagList }
     * 
     */
    public TagList createTagList() {
        return new TagList();
    }

    /**
     * Create an instance of {@link Metadata }
     * 
     */
    public Metadata createMetadata() {
        return new Metadata();
    }

    /**
     * Create an instance of {@link TextRepresentation }
     * 
     */
    public TextRepresentation createTextRepresentation() {
        return new TextRepresentation();
    }

    /**
     * Create an instance of {@link LifeSpan }
     * 
     */
    public LifeSpan createLifeSpan() {
        return new LifeSpan();
    }

    /**
     * Create an instance of {@link Artist }
     * 
     */
    public Artist createArtist() {
        return new Artist();
    }

    /**
     * Create an instance of {@link LabelInfoList }
     * 
     */
    public LabelInfoList createLabelInfoList() {
        return new LabelInfoList();
    }

    /**
     * Create an instance of {@link AliasList }
     * 
     */
    public AliasList createAliasList() {
        return new AliasList();
    }

    /**
     * Create an instance of {@link ReleaseList }
     * 
     */
    public ReleaseList createReleaseList() {
        return new ReleaseList();
    }

    /**
     * Create an instance of {@link ReleaseGroupList }
     * 
     */
    public ReleaseGroupList createReleaseGroupList() {
        return new ReleaseGroupList();
    }

    /**
     * Create an instance of {@link Tag }
     * 
     */
    public Tag createTag() {
        return new Tag();
    }

    /**
     * Create an instance of {@link Relation }
     * 
     */
    public Relation createRelation() {
        return new Relation();
    }

    /**
     * Create an instance of {@link TrackList }
     * 
     */
    public TrackList createTrackList() {
        return new TrackList();
    }

    /**
     * Create an instance of {@link WorkList }
     * 
     */
    public WorkList createWorkList() {
        return new WorkList();
    }

    /**
     * Create an instance of {@link ArtistCredit }
     * 
     */
    public ArtistCredit createArtistCredit() {
        return new ArtistCredit();
    }

    /**
     * Create an instance of {@link Disc }
     * 
     */
    public Disc createDisc() {
        return new Disc();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://musicbrainz.org/ns/mmd-2.0#", name = "iswc")
    public JAXBElement<String> createIswc(String value) {
        return new JAXBElement<String>(_Iswc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://musicbrainz.org/ns/mmd-2.0#", name = "disambiguation")
    public JAXBElement<String> createDisambiguation(String value) {
        return new JAXBElement<String>(_Disambiguation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://musicbrainz.org/ns/mmd-2.0#", name = "target")
    public JAXBElement<String> createTarget(String value) {
        return new JAXBElement<String>(_Target_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://musicbrainz.org/ns/mmd-2.0#", name = "language")
    public JAXBElement<String> createLanguage(String value) {
        return new JAXBElement<String>(_Language_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://musicbrainz.org/ns/mmd-2.0#", name = "attributes")
    public JAXBElement<List<String>> createAttributes(List<String> value) {
        return new JAXBElement<List<String>>(_Attributes_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://musicbrainz.org/ns/mmd-2.0#", name = "user-rating")
    public JAXBElement<BigInteger> createUserRating(BigInteger value) {
        return new JAXBElement<BigInteger>(_UserRating_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://musicbrainz.org/ns/mmd-2.0#", name = "status")
    public JAXBElement<String> createStatus(String value) {
        return new JAXBElement<String>(_Status_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://musicbrainz.org/ns/mmd-2.0#", name = "catalog-number")
    public JAXBElement<String> createCatalogNumber(String value) {
        return new JAXBElement<String>(_CatalogNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://musicbrainz.org/ns/mmd-2.0#", name = "sort-name")
    public JAXBElement<String> createSortName(String value) {
        return new JAXBElement<String>(_SortName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://musicbrainz.org/ns/mmd-2.0#", name = "barcode")
    public JAXBElement<String> createBarcode(String value) {
        return new JAXBElement<String>(_Barcode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://musicbrainz.org/ns/mmd-2.0#", name = "format")
    public JAXBElement<String> createFormat(String value) {
        return new JAXBElement<String>(_Format_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://musicbrainz.org/ns/mmd-2.0#", name = "sectors")
    public JAXBElement<BigInteger> createSectors(BigInteger value) {
        return new JAXBElement<BigInteger>(_Sectors_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://musicbrainz.org/ns/mmd-2.0#", name = "script")
    public JAXBElement<String> createScript(String value) {
        return new JAXBElement<String>(_Script_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://musicbrainz.org/ns/mmd-2.0#", name = "begin")
    public JAXBElement<String> createBegin(String value) {
        return new JAXBElement<String>(_Begin_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://musicbrainz.org/ns/mmd-2.0#", name = "title")
    public JAXBElement<String> createTitle(String value) {
        return new JAXBElement<String>(_Title_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://musicbrainz.org/ns/mmd-2.0#", name = "label-code")
    public JAXBElement<BigInteger> createLabelCode(BigInteger value) {
        return new JAXBElement<BigInteger>(_LabelCode_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://musicbrainz.org/ns/mmd-2.0#", name = "user-tag")
    public JAXBElement<String> createUserTag(String value) {
        return new JAXBElement<String>(_UserTag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://musicbrainz.org/ns/mmd-2.0#", name = "packaging")
    public JAXBElement<String> createPackaging(String value) {
        return new JAXBElement<String>(_Packaging_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://musicbrainz.org/ns/mmd-2.0#", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://musicbrainz.org/ns/mmd-2.0#", name = "length")
    public JAXBElement<BigInteger> createLength(BigInteger value) {
        return new JAXBElement<BigInteger>(_Length_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://musicbrainz.org/ns/mmd-2.0#", name = "gender")
    public JAXBElement<String> createGender(String value) {
        return new JAXBElement<String>(_Gender_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://musicbrainz.org/ns/mmd-2.0#", name = "end")
    public JAXBElement<String> createEnd(String value) {
        return new JAXBElement<String>(_End_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://musicbrainz.org/ns/mmd-2.0#", name = "position")
    public JAXBElement<BigInteger> createPosition(BigInteger value) {
        return new JAXBElement<BigInteger>(_Position_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://musicbrainz.org/ns/mmd-2.0#", name = "isrc")
    public JAXBElement<String> createIsrc(String value) {
        return new JAXBElement<String>(_Isrc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://musicbrainz.org/ns/mmd-2.0#", name = "asin")
    public JAXBElement<String> createAsin(String value) {
        return new JAXBElement<String>(_Asin_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DefDirection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://musicbrainz.org/ns/mmd-2.0#", name = "direction")
    public JAXBElement<DefDirection> createDirection(DefDirection value) {
        return new JAXBElement<DefDirection>(_Direction_QNAME, DefDirection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://musicbrainz.org/ns/mmd-2.0#", name = "date")
    public JAXBElement<String> createDate(String value) {
        return new JAXBElement<String>(_Date_QNAME, String.class, null, value);
    }

}