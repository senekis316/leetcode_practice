package practice.leecode.DFS;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.Test;
import practice.leecode.Common.Employee;

public class GetImportance_690Test {

    @Test
    public void getImportance() {

        Employee employee1 = new Employee();
        employee1.id = 1;
        employee1.importance = 5;
        employee1.subordinates = Stream.of(new Integer[]{2,3}).collect(Collectors.toList());

        Employee employee2 = new Employee();
        employee2.id = 2;
        employee2.importance = 3;
        employee2.subordinates = new ArrayList<>();

        Employee employee3 = new Employee();
        employee3.id = 3;
        employee3.importance = 3;
        employee3.subordinates = new ArrayList<>();

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        GetImportance_690 GetImportance_690 = new GetImportance_690();
        assertEquals(11, GetImportance_690.getImportance(employees, 1));

    }
}