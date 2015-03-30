package org.wso2.carbon.mdm.mobileservices.windowspc.services.discovery.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscoveryResponse")
public class DiscoveryResponse implements Serializable{

    @XmlElement(name = "AuthPolicy")
    private String authPolicy;

    @XmlElement(name = "AuthenticationServiceUrl")
    private String authenticationServiceUrl;

    @XmlElement(name = "EnrollmentPolicyServiceUrl")
    private String enrollmentPolicyServiceUrl;

    @XmlElement(name = "EnrollmentServiceUrl")
    private String enrollmentServiceUrl;


    public String getAuthPolicy() {
        return authPolicy;
    }

    public String getAuthenticationServiceUrl() {
        return authenticationServiceUrl;
    }

    public String getEnrollmentPolicyServiceUrl() {
        return enrollmentPolicyServiceUrl;
    }

    public String getEnrollmentServiceUrl() {
        return enrollmentServiceUrl;
    }

    public void setAuthPolicy(String authPolicy) {
        this.authPolicy = authPolicy;
    }

    public void setAuthenticationServiceUrl(String authenticationServiceUrl) {
        this.authenticationServiceUrl = authenticationServiceUrl;
    }

    public void setEnrollmentPolicyServiceUrl(String enrollmentPolicyServiceUrl) {
        this.enrollmentPolicyServiceUrl = enrollmentPolicyServiceUrl;
    }

    public void setEnrollmentServiceUrl(String enrollmentServiceUrl) {
        this.enrollmentServiceUrl = enrollmentServiceUrl;
    }

}
