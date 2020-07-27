package gJava.com.controller;

import gJava.Employee;
import gJava.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.nio.file.Path;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {
    private final EmployeeService employeeService;


    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public Employee create(@RequestParam String firstName, @RequestParam String lastName) {
        Employee employee = employeeService.createEmployee(firstName, lastName);
        return employee;
    }

    @GetMapping
    public Employee readEmployee(@RequestParam UUID id) {

        return this.employeeService.readEmployee(id);

    }


    @PutMapping()
    public Employee updateEmployee( @RequestBody Employee employee) {
        return this.employeeService.updateEmployee(employee);

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/employee/{id}")
    public List<Employee> deleteEmployee(@PathVariable UUID id) {
        return this.employeeService.deleteEmployee(id);

    }

}
