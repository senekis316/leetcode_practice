
package javaBean.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PartnerType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PartnerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartnerKindChoice" type="{}PartnerKindChoiceType"/>
 *         &lt;element name="Addresses" type="{}AddressesType"/>
 *         &lt;element name="CommunicationChannels" type="{}CommunicationChannelsType"/>
 *         &lt;element name="InactiveStatus" type="{}InactiveStatusType"/>
 *         &lt;element name="ProcessingInformation" type="{}ProcessingInformationType"/>
 *         &lt;element name="ControlData" type="{}ControlDataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartnerType", propOrder = {
    "partnerKindChoice",
    "addresses",
    "communicationChannels",
    "inactiveStatus",
    "processingInformation",
    "controlData"
})
public class PartnerType {

    @XmlElement(name = "PartnerKindChoice", required = true)
    protected PartnerKindChoiceType partnerKindChoice;
    @XmlElement(name = "Addresses", required = true)
    protected AddressesType addresses;
    @XmlElement(name = "CommunicationChannels", required = true)
    protected CommunicationChannelsType communicationChannels;
    @XmlElement(name = "InactiveStatus", required = true)
    protected InactiveStatusType inactiveStatus;
    @XmlElement(name = "ProcessingInformation", required = true)
    protected ProcessingInformationType processingInformation;
    @XmlElement(name = "ControlData", required = true)
    protected ControlDataType controlData;

    /**
     * 获取partnerKindChoice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PartnerKindChoiceType }
     *     
     */
    public PartnerKindChoiceType getPartnerKindChoice() {
        return partnerKindChoice;
    }

    /**
     * 设置partnerKindChoice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerKindChoiceType }
     *     
     */
    public void setPartnerKindChoice(PartnerKindChoiceType value) {
        this.partnerKindChoice = value;
    }

    /**
     * 获取addresses属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddressesType }
     *     
     */
    public AddressesType getAddresses() {
        return addresses;
    }

    /**
     * 设置addresses属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddressesType }
     *     
     */
    public void setAddresses(AddressesType value) {
        this.addresses = value;
    }

    /**
     * 获取communicationChannels属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommunicationChannelsType }
     *     
     */
    public CommunicationChannelsType getCommunicationChannels() {
        return communicationChannels;
    }

    /**
     * 设置communicationChannels属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationChannelsType }
     *     
     */
    public void setCommunicationChannels(CommunicationChannelsType value) {
        this.communicationChannels = value;
    }

    /**
     * 获取inactiveStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InactiveStatusType }
     *     
     */
    public InactiveStatusType getInactiveStatus() {
        return inactiveStatus;
    }

    /**
     * 设置inactiveStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InactiveStatusType }
     *     
     */
    public void setInactiveStatus(InactiveStatusType value) {
        this.inactiveStatus = value;
    }

    /**
     * 获取processingInformation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProcessingInformationType }
     *     
     */
    public ProcessingInformationType getProcessingInformation() {
        return processingInformation;
    }

    /**
     * 设置processingInformation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingInformationType }
     *     
     */
    public void setProcessingInformation(ProcessingInformationType value) {
        this.processingInformation = value;
    }

    /**
     * 获取controlData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ControlDataType }
     *     
     */
    public ControlDataType getControlData() {
        return controlData;
    }

    /**
     * 设置controlData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ControlDataType }
     *     
     */
    public void setControlData(ControlDataType value) {
        this.controlData = value;
    }

}
