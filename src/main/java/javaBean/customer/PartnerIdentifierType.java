
package javaBean.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PartnerIdentifierType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PartnerIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationIdentifiers" type="{}ApplicationIdentifiersType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartnerIdentifierType", propOrder = {
    "applicationIdentifiers"
})
public class PartnerIdentifierType {

    @XmlElement(name = "ApplicationIdentifiers", required = true)
    protected ApplicationIdentifiersType applicationIdentifiers;

    /**
     * 获取applicationIdentifiers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ApplicationIdentifiersType }
     *     
     */
    public ApplicationIdentifiersType getApplicationIdentifiers() {
        return applicationIdentifiers;
    }

    /**
     * 设置applicationIdentifiers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationIdentifiersType }
     *     
     */
    public void setApplicationIdentifiers(ApplicationIdentifiersType value) {
        this.applicationIdentifiers = value;
    }

}
