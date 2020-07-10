package practice.poi;

import java.util.Collection;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;

public class PropertyGroupResource {

    private static final String DEFAULT_GROUP_NAME = "基本信息";
    private String groupName;
    Collection<PropertyDescriptResource> propertyDescripts;

    public PropertyGroupResource(String groupName,
        Set<PropertyDescriptResource> propertyDescripts) {
        this.groupName = groupName;
        this.propertyDescripts = propertyDescripts;
    }

    public String getGroupName() {
        if (StringUtils.isBlank(groupName)) {
            return DEFAULT_GROUP_NAME;
        }
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Collection<PropertyDescriptResource> getPropertyDescripts() {
        return propertyDescripts;
    }

    public void setPropertyDescripts(
        Set<PropertyDescriptResource> propertyDescripts) {
        this.propertyDescripts = propertyDescripts;
    }

}