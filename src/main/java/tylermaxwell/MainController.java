package tylermaxwell;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class MainController {
	
	@RequestMapping("")
	public String index() {
		return "Welcome";
	}

}
