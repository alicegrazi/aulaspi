package alice.pi.eventos.controlles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
  
@Controller
public class EventosController {
	
	@Autowired
	private EventoRepository er;
	
	 @RequestMapping("/eventos/form")
	public String form() {
		return "formevento";
	}

  @PostMapping
}
