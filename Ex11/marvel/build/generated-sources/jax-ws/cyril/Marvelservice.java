
package cyril;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "marvelservice", targetNamespace = "http://cyril/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Marvelservice {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://cyril/", className = "cyril.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://cyril/", className = "cyril.HelloResponse")
    @Action(input = "http://cyril/marvelservice/helloRequest", output = "http://cyril/marvelservice/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
