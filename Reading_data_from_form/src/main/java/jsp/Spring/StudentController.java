package jsp.Spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class StudentController {
	@PostMapping("/save")
	public ModelAndView saveDetails(HttpServletRequest request) {
		String name = request.getParameter("studentName");
		String email = request.getParameter("studentEmail");
		String age = request.getParameter("studentAge");
		String gender = request.getParameter("studentGender");
		
		
		ModelAndView mav = new ModelAndView("display.jsp");
		mav.addObject("studentName", name);
		mav.addObject("studentEmail" , email);
		mav.addObject("studentAge" , age);
		mav.addObject("studentGender" , gender);
		
		
		return mav;
	}
}
