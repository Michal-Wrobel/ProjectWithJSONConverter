package gJava.service;


import gJava.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public interface EmployeeService {

    Employee createEmployee(String firstName, String lastName);

    Employee readEmployee(UUID id);

    Employee updateEmployee(Employee employee);

    List<Employee> deleteEmployee(UUID id);

    List<Employee> removeAll();

  //  List<Employee> findAll();
}
