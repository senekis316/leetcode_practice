package practice.poi;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public final class PropertyGroupAssembler {

  private PropertyGroupAssembler() {

  }

  public static Collection<PropertyGroupResource> toResources(
      Collection<WritablePropertyDefinition> propertyDefinitions) {
    Map<String, Set<PropertyDescriptResource>>
        propertyDescriptResourceMap = new ConcurrentHashMap<>();
    for (WritablePropertyDefinition writablePropertyDefinition : propertyDefinitions) {
      PropertyDescriptResource propertyDescriptResource = new PropertyDescriptResource();
      propertyDescriptResource.setOptions(writablePropertyDefinition.getOptions());
      propertyDescriptResource.setFieldName(writablePropertyDefinition.getFieldName());
      propertyDescriptResource.setFieldType(writablePropertyDefinition.getFieldType());
      propertyDescriptResource.setChineseName(writablePropertyDefinition.getChineseName());
      Set<PropertyDescriptResource> propertyDescriptResources =
          propertyDescriptResourceMap.getOrDefault(writablePropertyDefinition.getGroupName(), new LinkedHashSet<>());
      propertyDescriptResources.add(propertyDescriptResource);
      propertyDescriptResourceMap.put(writablePropertyDefinition.getGroupName(), propertyDescriptResources);
    }
    Set<PropertyGroupResource> propertyGroupResources = new LinkedHashSet<>();
    for (Entry<String, Set<PropertyDescriptResource>> entry : propertyDescriptResourceMap.entrySet()) {
      propertyGroupResources.add(new PropertyGroupResource(entry.getKey(), entry.getValue()));
    }
    return propertyGroupResources;
  }

  public static Collection<WritablePropertyDefinition> toProperties(
      Collection<PropertyGroupResource> propertyGroupResources) {
    return propertyGroupResources.stream().map(PropertyGroupResource::getPropertyDescripts)
            .flatMap(Collection::stream).map(WritablePropertyDefinition::new).collect(Collectors.toList());
  }

  public static Set<WritablePropertyValueDefinition> toPropertyValues(
      Collection<PropertyGroupResource> propertyGroupResources) {
      Set<WritablePropertyValueDefinition> writablePropertyValueDefinitions = new LinkedHashSet<>();
      for (PropertyGroupResource propertyGroupResource : propertyGroupResources) {
          for (PropertyDescriptResource propertyDescriptResource : propertyGroupResource.getPropertyDescripts()) {
              writablePropertyValueDefinitions.add(
                  new WritablePropertyValueDefinition(propertyGroupResource, propertyDescriptResource));
          }
      }
      return writablePropertyValueDefinitions;
  }
}