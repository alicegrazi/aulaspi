package alice.pi.eventos.controlles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventosController {
	
	 @RequestMapping("/eventos/form")
	public String form() {
		return "formevento";
	}

}
