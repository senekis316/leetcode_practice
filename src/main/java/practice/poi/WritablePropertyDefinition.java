package practice.poi;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.StringUtils;

@JsonInclude(Include.NON_NULL)
@EqualsAndHashCode
public class WritablePropertyDefinition {

    private Collection<String> options;
    private String groupName;
    private String fieldName;
    private String chineseName;
    private PropertyFieldTypeEnum fieldType;

    public WritablePropertyDefinition() {

    }

    public WritablePropertyDefinition(PropertyDescriptResource propertyDescriptResource) {
        this.options = propertyDescriptResource.getOptions();
        this.fieldName = propertyDescriptResource.getFieldName();
        this.fieldType = propertyDescriptResource.getFieldType();
        this.chineseName = propertyDescriptResource.getChineseName();
    }

    public WritablePropertyDefinition(
        String groupName, String fieldName, String chineseName,
        Collection<String> options, PropertyFieldTypeEnum fieldType) {
        this.groupName = groupName;
        this.fieldType = fieldType;
        this.fieldName = fieldName;
        this.chineseName = chineseName;
        this.options = options;
    }

    public PropertyFieldTypeEnum getFieldType() {
        return fieldType;
    }

    public void setFieldType(PropertyFieldTypeEnum fieldType) {
        this.fieldType = fieldType;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public Collection<String> getOptions() {
        return options;
    }

    public void setOptions(Collection<String> options) {
        this.options = options;
    }
}