package practice.poi;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.Collection;
import java.util.Objects;
import lombok.EqualsAndHashCode;

@JsonInclude(Include.NON_NULL)
@EqualsAndHashCode(callSuper = true)
public class WritablePropertyValueDefinition extends WritablePropertyDefinition {

    private String fieldValue;

    public WritablePropertyValueDefinition() {

    }

    public WritablePropertyValueDefinition(
        String groupName,
        String chineseName,
        String fieldName,
        String fieldValue) {
        this.setGroupName(groupName);
        this.setFieldName(fieldName);
        this.setChineseName(chineseName);
        this.fieldValue = fieldValue;
    }

    public WritablePropertyValueDefinition(
        WritablePropertyDefinition writablePropertyDefinition,
        String fieldValue) {
        super(writablePropertyDefinition.getGroupName(),
            writablePropertyDefinition.getFieldName(),
            writablePropertyDefinition.getChineseName(),
            writablePropertyDefinition.getOptions(),
            writablePropertyDefinition.getFieldType());
        this.fieldValue = fieldValue;
    }

    public WritablePropertyValueDefinition(
        PropertyGroupResource propertyGroupResource,
        PropertyDescriptResource propertyDescriptResource) {
        this.setGroupName(propertyGroupResource.getGroupName());
        this.setOptions(propertyDescriptResource.getOptions());
        this.setFieldName(propertyDescriptResource.getFieldName());
        this.setFieldType(propertyDescriptResource.getFieldType());
        this.setChineseName(propertyDescriptResource.getChineseName());
        if (propertyDescriptResource.getFieldValue() == null) {
            this.fieldValue = "";
        } else {
            this.fieldValue = propertyDescriptResource.getFieldValue();
        }
        //this.fieldValue = propertyDescriptResource.getFieldValue();
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }
}