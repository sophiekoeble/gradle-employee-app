package spring.springboot;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import employee.Employee;
import employee.PersonalData;

@RestController
public class HelloController {

  private final PersonalData personalData;
  public static String newline = System.getProperty("line.separator");

  @Autowired
  public HelloController(PersonalData personalData) {
    this.personalData = personalData;
  }
  
    @GetMapping("/getEmployees")
    public String index() {
      String output = "";

      for (Employee employee : personalData.getEmployees()) {
        employee.log();
        output += "Name: " + employee.getName() + newline + ", E-Mail: " + employee.getEmailAddress() + ", Year of Birth: " + employee.getYearOfBirth();
      }

      return output;
      // return personalData.getEmployees().toString();
    }
}

