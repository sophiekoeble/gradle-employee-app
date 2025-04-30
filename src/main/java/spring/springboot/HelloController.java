package spring.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import employee.Employee;
import employee.PersonalData;

@RestController
public class HelloController {

  private final PersonalData personalData;
  public static final Logger logger = LoggerFactory.getLogger(HelloController.class);

  @Autowired
  public HelloController(PersonalData personalData) {
    this.personalData = personalData;
  }
  
    @GetMapping("/getEmployees")
    public String getEmployees() {
      String output = "";

      for (Employee employee : personalData.getEmployees()) {
        employee.log();
        output += "Name: " + employee.getName() +  ", E-Mail: " + employee.getEmailAddress() + ", Year of Birth: " + employee.getYearOfBirth() + " ";
      }

      return output;
      // return personalData.getEmployees().toString();
    }

    @GetMapping("/getEmployee/{name}")
    public String getEmployee(@PathVariable String name) {
      String output = "person not found!";
      logger.error(name);

      for (Employee employee : personalData.getEmployees()) {
        if (String.valueOf(employee.getName()).equals(name)) {
          output = "Name: " + employee.getName() +  ", E-Mail: " + employee.getEmailAddress() + ", Year of Birth: " + employee.getYearOfBirth() + " ";
        }
      
      }

      return output;
    }
}

