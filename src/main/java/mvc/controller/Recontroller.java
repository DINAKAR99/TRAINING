package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class Recontroller {
    @GetMapping("/one")
    public String one() {
        System.out.println("this is first handler");
        return "redirect:/two";

    }

    @GetMapping("/two")
    public String two() {
        System.out.println("this is second handler");

        RedirectView rv = new RedirectView();
        rv.setUrl("https://www.google.com");

        return "register";

    }

}
