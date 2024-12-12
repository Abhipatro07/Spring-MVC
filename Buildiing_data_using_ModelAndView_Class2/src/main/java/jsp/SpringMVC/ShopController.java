package jsp.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShopController {
	@GetMapping("/shop")
	public ModelAndView showdeatils() {
		ModelAndView mav = new ModelAndView("shop.jsp");
		mav.addObject("shopName", "Zudio");
		mav.addObject("Shirt", "1000");
		return mav;
	}
}
