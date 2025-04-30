package spring.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages= {"employee", "spring"})
public class Application {
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        // PersonalData personalData = new PersonalData();
        // personalData.loadEmployeesFromCSV();
        // new HelloController(personalData);
    }
}