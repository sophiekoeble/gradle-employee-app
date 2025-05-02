package spring.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import employee.PersonalData;

@Controller
public class GreetingController {

    private final PersonalData personalData;

    @Autowired
    public GreetingController(PersonalData personalData) {
        this.personalData = personalData;
    }

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

    @GetMapping("/employees")
    public String employees(Model model) {
        
      model.addAttribute("employees", personalData.getEmployees());

      return "employees";
    }

}