package AdminSecurity.AdminSecurity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasicController {

    @GetMapping("/")
    public String main(){
        return "redirect:/login";
    }
}
