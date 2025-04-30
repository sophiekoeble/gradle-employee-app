package employee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// @SpringBootApplication
public class EmployeeApp {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeApp.class);


    public static void main(String[] args) {

        PersonalData personalData = new PersonalData();
        personalData.loadEmployeesFromCSV();

        System.exit(0);
    }
}
