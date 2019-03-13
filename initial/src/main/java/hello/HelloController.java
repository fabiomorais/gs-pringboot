package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    
    @GetMapping("/")
    public String index() {
        return "Fabio test";
    }
    
    @RequestMapping("/list")
    public String listar() {
        return "Listando";
    }
    
    prings
    
}
