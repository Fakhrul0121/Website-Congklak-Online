package WCO.Website.Congklak.Online;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
    
    @GetMapping("/welcome")
    public String goHome(){
        return "welcome";
    }

}
