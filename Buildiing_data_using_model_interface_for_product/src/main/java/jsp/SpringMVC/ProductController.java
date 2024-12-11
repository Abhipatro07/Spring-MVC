package jsp.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
	@GetMapping("/product")
	public String showProductDetails(Model model) {
		model.addAttribute("ProductId", "101");
		model.addAttribute("ProductName", "Shirt");
		model.addAttribute("ProductPrice", "1000");
		return "product.jsp";
	}
}
