
package javaBean.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CommunicationChannelsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CommunicationChannelsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommunicationChannel" type="{}CommunicationChannelType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationChannelsType", propOrder = {
    "communicationChannel"
})
public class CommunicationChannelsType {

    @XmlElement(name = "CommunicationChannel", required = true)
    protected CommunicationChannelType communicationChannel;

    /**
     * 获取communicationChannel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommunicationChannelType }
     *     
     */
    public CommunicationChannelType getCommunicationChannel() {
        return communicationChannel;
    }

    /**
     * 设置communicationChannel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationChannelType }
     *     
     */
    public void setCommunicationChannel(CommunicationChannelType value) {
        this.communicationChannel = value;
    }

}
