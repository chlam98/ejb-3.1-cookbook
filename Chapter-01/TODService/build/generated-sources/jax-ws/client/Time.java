
package client;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2-hudson-752-
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Time", targetNamespace = "http://service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Time {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "timeOfDay", targetNamespace = "http://service/", className = "client.TimeOfDay")
    @ResponseWrapper(localName = "timeOfDayResponse", targetNamespace = "http://service/", className = "client.TimeOfDayResponse")
    @Action(input = "http://service/Time/timeOfDayRequest", output = "http://service/Time/timeOfDayResponse")
    public String timeOfDay();

}
