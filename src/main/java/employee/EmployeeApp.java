package employee;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeApp {

    public static void main(String[] args) {

        PersonalData personalData = new PersonalData();
        personalData.loadEmployeesFromCSV();

        System.exit(0);
    }
}
