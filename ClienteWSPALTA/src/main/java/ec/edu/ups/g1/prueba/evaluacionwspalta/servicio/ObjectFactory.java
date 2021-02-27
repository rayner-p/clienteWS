
package ec.edu.ups.g1.prueba.evaluacionwspalta.servicio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.edu.ups.g1.prueba.evaluacionwspalta.servicio package. 
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

    private final static QName _RegistrarTituloResponse_QNAME = new QName("http://servicio.EvaluacionWSPALTA.prueba.g1.ups.edu.ec/", "registrarTituloResponse");
    private final static QName _Exception_QNAME = new QName("http://servicio.EvaluacionWSPALTA.prueba.g1.ups.edu.ec/", "Exception");
    private final static QName _ObtenerTituLOS_QNAME = new QName("http://servicio.EvaluacionWSPALTA.prueba.g1.ups.edu.ec/", "obtenerTituLOS");
    private final static QName _ObtenerTituLOSResponse_QNAME = new QName("http://servicio.EvaluacionWSPALTA.prueba.g1.ups.edu.ec/", "obtenerTituLOSResponse");
    private final static QName _RegistrarTitulo_QNAME = new QName("http://servicio.EvaluacionWSPALTA.prueba.g1.ups.edu.ec/", "registrarTitulo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.edu.ups.g1.prueba.evaluacionwspalta.servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerTituLOS }
     * 
     */
    public ObtenerTituLOS createObtenerTituLOS() {
        return new ObtenerTituLOS();
    }

    /**
     * Create an instance of {@link ObtenerTituLOSResponse }
     * 
     */
    public ObtenerTituLOSResponse createObtenerTituLOSResponse() {
        return new ObtenerTituLOSResponse();
    }

    /**
     * Create an instance of {@link RegistrarTitulo }
     * 
     */
    public RegistrarTitulo createRegistrarTitulo() {
        return new RegistrarTitulo();
    }

    /**
     * Create an instance of {@link RegistrarTituloResponse }
     * 
     */
    public RegistrarTituloResponse createRegistrarTituloResponse() {
        return new RegistrarTituloResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link Titulos }
     * 
     */
    public Titulos createTitulos() {
        return new Titulos();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarTituloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.EvaluacionWSPALTA.prueba.g1.ups.edu.ec/", name = "registrarTituloResponse")
    public JAXBElement<RegistrarTituloResponse> createRegistrarTituloResponse(RegistrarTituloResponse value) {
        return new JAXBElement<RegistrarTituloResponse>(_RegistrarTituloResponse_QNAME, RegistrarTituloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.EvaluacionWSPALTA.prueba.g1.ups.edu.ec/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTituLOS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.EvaluacionWSPALTA.prueba.g1.ups.edu.ec/", name = "obtenerTituLOS")
    public JAXBElement<ObtenerTituLOS> createObtenerTituLOS(ObtenerTituLOS value) {
        return new JAXBElement<ObtenerTituLOS>(_ObtenerTituLOS_QNAME, ObtenerTituLOS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTituLOSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.EvaluacionWSPALTA.prueba.g1.ups.edu.ec/", name = "obtenerTituLOSResponse")
    public JAXBElement<ObtenerTituLOSResponse> createObtenerTituLOSResponse(ObtenerTituLOSResponse value) {
        return new JAXBElement<ObtenerTituLOSResponse>(_ObtenerTituLOSResponse_QNAME, ObtenerTituLOSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarTitulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.EvaluacionWSPALTA.prueba.g1.ups.edu.ec/", name = "registrarTitulo")
    public JAXBElement<RegistrarTitulo> createRegistrarTitulo(RegistrarTitulo value) {
        return new JAXBElement<RegistrarTitulo>(_RegistrarTitulo_QNAME, RegistrarTitulo.class, null, value);
    }

}
