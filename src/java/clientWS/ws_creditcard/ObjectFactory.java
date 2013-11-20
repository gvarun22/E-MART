
package ws_creditcard;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws_creditcard package. 
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

    private final static QName _Ismod10Response_QNAME = new QName("http://WS_CreditCard/", "ismod10Response");
    private final static QName _VerifyCardResponse_QNAME = new QName("http://WS_CreditCard/", "VerifyCardResponse");
    private final static QName _VerifyCard_QNAME = new QName("http://WS_CreditCard/", "VerifyCard");
    private final static QName _Ismod10_QNAME = new QName("http://WS_CreditCard/", "ismod10");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws_creditcard
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Ismod10Response }
     * 
     */
    public Ismod10Response createIsmod10Response() {
        return new Ismod10Response();
    }

    /**
     * Create an instance of {@link VerifyCardResponse }
     * 
     */
    public VerifyCardResponse createVerifyCardResponse() {
        return new VerifyCardResponse();
    }

    /**
     * Create an instance of {@link VerifyCard }
     * 
     */
    public VerifyCard createVerifyCard() {
        return new VerifyCard();
    }

    /**
     * Create an instance of {@link Ismod10 }
     * 
     */
    public Ismod10 createIsmod10() {
        return new Ismod10();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ismod10Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS_CreditCard/", name = "ismod10Response")
    public JAXBElement<Ismod10Response> createIsmod10Response(Ismod10Response value) {
        return new JAXBElement<Ismod10Response>(_Ismod10Response_QNAME, Ismod10Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyCardResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS_CreditCard/", name = "VerifyCardResponse")
    public JAXBElement<VerifyCardResponse> createVerifyCardResponse(VerifyCardResponse value) {
        return new JAXBElement<VerifyCardResponse>(_VerifyCardResponse_QNAME, VerifyCardResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS_CreditCard/", name = "VerifyCard")
    public JAXBElement<VerifyCard> createVerifyCard(VerifyCard value) {
        return new JAXBElement<VerifyCard>(_VerifyCard_QNAME, VerifyCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ismod10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS_CreditCard/", name = "ismod10")
    public JAXBElement<Ismod10> createIsmod10(Ismod10 value) {
        return new JAXBElement<Ismod10>(_Ismod10_QNAME, Ismod10 .class, null, value);
    }

}
