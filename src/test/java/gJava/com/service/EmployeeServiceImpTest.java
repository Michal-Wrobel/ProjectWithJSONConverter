package gJava.com.service;

import gJava.Employee;
import gJava.com.EmployeeRepository;
import gJava.com.EmployeeRepositoryImp;
import gJava.service.EmployeeService;

import gJava.service.EmployeeServiceImp;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

import static org.mockito.Mockito.times;


@RunWith(SpringRunner.class)
public class EmployeeServiceImpTest {

    private Employee employee;

    @Mock
    private EmployeeRepository employeeRepository;


    @InjectMocks
    private EmployeeServiceImp employeeService;


    @Before
    public void setUp() {

        employee = new Employee("Piotr", "Kowalski");
    }

    @Test
    public void create() {

        Mockito.verify(employeeRepository, times(1)).createEmployee(Matchers.any(Employee.class));
    }

    @Test
    public void read() {
        Mockito.verify(employeeRepository, times(1)).readEmployee(UUID.randomUUID());
    }

    @Test
    public void update() {
        Mockito.verify(employeeRepository, times(1)).updateEmployee(Matchers.any(Employee.class));
    }

    @Test
    public void deleteEmployee() {

        Mockito.verify(employeeRepository, times(1)).deleteEmployee(UUID.randomUUID());

    }

}

