package jsp.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

	@GetMapping("/employee")
	public String showdetails(Model model) {
		model.addAttribute("MyName", "Abhi");
		model.addAttribute("MyAge", "21");
		return "employee.jsp";
	}
}
