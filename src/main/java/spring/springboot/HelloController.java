package spring.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import employee.PersonalData;

@RestController
public class HelloController {

  private final PersonalData personalData;

  @Autowired
  public HelloController(PersonalData personalData) {
    this.personalData = personalData;
  }
  
  @GetMapping("/")
  public String index() {
    return "Greetings from Sophie and Matthias!";
  }
}
