package spring.springboot;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import employee.Employee;
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

    @GetMapping("/employees/{name}")
    public String employees(@PathVariable String name, Model model) {
        var listEmployees = new ArrayList<>();

        for (Employee employee : personalData.getEmployees()) {
            if (employee.getName().equals(name)) {
                listEmployees.add(employee);
            } else if (String.valueOf(employee.getYearOfBirth()).equals(name)) {
                listEmployees.add(employee);

            }
        }

        model.addAttribute("employees", listEmployees);

        return "employees";
    }
    

}