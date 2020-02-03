package practice.leecode.DFS;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import practice.leecode.Common.Employee;

public class GetImportance_690 {

    private Map<Integer, Employee> employeeMap;

    public int getImportance(List<Employee> employees, int id) {
        employeeMap = new HashMap<>();
        for (Employee employee: employees) {
            employeeMap.put(employee.id, employee);
        }
        return getImportance(id);
    }

    private int getImportance(int id) {
        Employee employee = employeeMap.get(id);
        int important = employee.importance;
        for(int employeeId : employee.subordinates) {
            important += getImportance(employeeId);
        }
        return important;
    }

}
