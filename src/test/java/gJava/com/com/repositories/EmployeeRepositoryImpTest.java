package gJava.com.com.repositories;

import gJava.Employee;
import gJava.com.EmployeeRepository;
import gJava.com.EmployeeRepositoryImp;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;
import java.util.List;

//ZROB RESZTE METOD W EMPLOYEE ORAZ TESTY

class EmployeeRepositoryImpTest {
    // UMIESC REGULATORY DOSTEPU
    private EmployeeRepository employeeRepository;
    private Employee employee;

    @Before
    void setUp() {
        employeeRepository = new EmployeeRepositoryImp();
        employee = new Employee("Michal", "Michalczewki");
        //  employeeRepository.createEmployee(employee);

        this.employee = employeeRepository.createEmployee(employee);
    }

    @After
    void tearDown() {
        employeeRepository.removeAll();

    }


    @Test
    void createEmployee() {

        Employee employee= new Employee("Ala","Wasacz");

        Employee expectedEmployee = employeeRepository.createEmployee(employee);
            employee.setFirstName("Dupa");


       Assertions.assertEquals(employee.getFirstName(), expectedEmployee.getFirstName());
        Assertions.assertEquals(employee.getLastName(), expectedEmployee.getLastName());


    }

    @Test
    void readEmployee() {


        var actualEmployeeId = employee.getId();


        Employee actualEmployee = employeeRepository.readEmployee(actualEmployeeId);


//        Assertions.assertEquals(employee.getFirstName(), actualEmployee.getFirstName());
//        Assertions.assertEquals(employee.getLastName(), actualEmployee.getLastName());

    }

    @Test
    void updateEmployee() {

        Employee actualEmployee = employeeRepository.updateEmployee(employee);
        employee.setUpdated(LocalDate.of(2020, 04, 20));

//        Assertions.assertEquals(employee.getId(), actualEmployee.getId());
//        Assertions.assertEquals(employee.getFirstName(), actualEmployee.getFirstName());
//        Assertions.assertEquals(employee.getLastName(), actualEmployee.getLastName());
//        Assertions.assertFalse(employee.getUpdated().isEqual(actualEmployee.getUpdated()));
//        Assertions.assertTrue(employee.getCreated().isEqual(actualEmployee.getCreated()));
    }

    @Test
    void deleteEmployee() {


        List<Employee> actualList = employeeRepository.deleteEmployee(employee.getId());

        Long listSize = actualList.stream().filter(x -> x.getId().equals(employee.getId())).count();

      //  Assertions.assertEquals(listSize, 0);

    }
}