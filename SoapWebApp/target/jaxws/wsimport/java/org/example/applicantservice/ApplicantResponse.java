
package org.example.applicantservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicantCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicantAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicantMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "applicantCode",
    "applicantName",
    "applicantAddress",
    "applicantMobile"
})
@XmlRootElement(name = "applicantResponse")
public class ApplicantResponse {

    @XmlElement(defaultValue = "A007")
    protected String applicantCode;
    @XmlElement(defaultValue = "Suresh Shivale")
    protected String applicantName;
    @XmlElement(defaultValue = "Pune")
    protected String applicantAddress;
    @XmlElement(defaultValue = "9876543210")
    protected String applicantMobile;

    /**
     * Gets the value of the applicantCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantCode() {
        return applicantCode;
    }

    /**
     * Sets the value of the applicantCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantCode(String value) {
        this.applicantCode = value;
    }

    /**
     * Gets the value of the applicantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantName() {
        return applicantName;
    }

    /**
     * Sets the value of the applicantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantName(String value) {
        this.applicantName = value;
    }

    /**
     * Gets the value of the applicantAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantAddress() {
        return applicantAddress;
    }

    /**
     * Sets the value of the applicantAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantAddress(String value) {
        this.applicantAddress = value;
    }

    /**
     * Gets the value of the applicantMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantMobile() {
        return applicantMobile;
    }

    /**
     * Sets the value of the applicantMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantMobile(String value) {
        this.applicantMobile = value;
    }

}
