package gJava.com;


import gJava.Employee;

import java.util.List;
import java.util.UUID;

public interface EmployeeRepository {

     Employee createEmployee(Employee employee);

    Employee readEmployee(UUID id);

    Employee updateEmployee(Employee employee);

    List<Employee> deleteEmployee(UUID id);

    List<Employee> removeAll();

}
