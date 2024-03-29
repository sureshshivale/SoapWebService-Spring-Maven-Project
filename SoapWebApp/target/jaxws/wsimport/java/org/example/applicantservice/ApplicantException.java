
package org.example.applicantservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "serviceException", targetNamespace = "http://www.example.org/applicantService/")
public class ApplicantException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ServiceException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public ApplicantException(String message, ServiceException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public ApplicantException(String message, ServiceException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.example.applicantservice.ServiceException
     */
    public ServiceException getFaultInfo() {
        return faultInfo;
    }

}
