package employee;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;


/**
 * This class defines methods to load all employees into memory
 */
@Service
public class PersonalData {

    private final List<Employee> employees = new ArrayList<>();

    @PostConstruct
    public void loadEmployeesFromCSV() {
        var inputStream = getClass().getClassLoader().getResourceAsStream("Employees.csv");
        
        try {
            InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            BufferedReader reader = new BufferedReader(streamReader);
            List<String> data = reader.lines().collect(Collectors.toList());
           
            for (var line : data) {
                var lines = Arrays.asList(line.split(","));
                Employee employee = new Employee(lines.get(0), lines.get(1), Integer.parseInt(lines.get(2)));
                employees.add(employee);
            }

            employees.stream().forEach(Employee::log);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public List<Employee> getEmployees() {
        return this.employees;
    }
}