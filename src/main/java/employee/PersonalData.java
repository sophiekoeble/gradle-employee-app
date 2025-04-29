package employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class PersonalData {

    public void main() {
        
        var file = "src\\main\\resources\\Employees.csv";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            List<String> data = reader.lines().collect(Collectors.toList());
            List<Employee> employees = new ArrayList<>();

            for (var line : data) {
                var lines = Arrays.asList(line.split(","));
                Employee employee = new Employee(lines.get(0), lines.get(1), Integer.parseInt(lines.get(2)));
                employees.add(employee);
            }

            employees.stream().forEach(Employee::log);
            // employees.stream().forEach(e -> e.log());


                //employee.setter(lines.get(0), lines.get(1), Integer.parseInt(lines.get(2)));

                // var employees = Arrays.asList();
                // eins.setName(lines.get(0));
                // eins.setEmailAddress(lines.get(1));
                // eins.setYearOfBirth(Integer.parseInt(lines.get(2)));
                
                // Employee name = new Employee(.setName(lines.get(0)));
                // Employee email


                // employees.add(String lines.get(0), String lines.get(1), int lines.get(2));
            
                // employees = (List<String>) employees.stream();
                //var name = employees.get(0);
                // employee.Employee.setName(employees.get(0));
                //var name = String.valueOf(employees.get(0).strip());
                // List<String> names = (List<String>) employees.stream();

                // System.out.println(lines.get(0));

                // var age = Integer.parseInt(employees.get(2).strip());
                // if (age > 1950) {
                //    employees.stream()
                //      //.forEach(System.out::printf);
                //      .forEach(s -> System.out.printf(s + " "));
                // }

                // // for(String index : row) {
                // //     System.out.printf(index.strip() + " ");
                // // }
                // System.out.println("");
            // }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}