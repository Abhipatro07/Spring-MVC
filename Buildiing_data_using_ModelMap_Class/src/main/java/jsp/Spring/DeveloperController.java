package jsp.Spring;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeveloperController {
	@GetMapping("/developer")
	public String showDetails(ModelMap map) {
		map.put("AppVersion", "WhatsApp 1.0.0");
		map.put("DeveloperName", "Abhi");
		Map<String , Double> map2 = new LinkedHashMap<String, Double>();
		map2.put("memory", 1.8);
		map2.put("RAM", 8.0);
		map.addAllAttributes(map2);
		return "developer.jsp";
	}
}
