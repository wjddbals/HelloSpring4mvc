package jiho.spring4.mvc.controller;

import javax.xml.ws.RequestWrapper;

@Controller
public class HomeController {

    @RequestMapping(value="/",nmethod=RequsetMethod.GET)
    public String home(){
        return "home";
    }

}
