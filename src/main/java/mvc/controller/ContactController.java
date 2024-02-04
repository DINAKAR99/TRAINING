
package mvc.controller;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import mvc.models.User;
import mvc.services.UserService;

@Controller
public class ContactController {
    private UserService userserv;

    public ContactController(UserService userserv) {
        this.userserv = userserv;
    }

    @RequestMapping("/contact")
    public String showForm(Model model) {
        System.out.println("this is meth of contact controller");

        return "register";
    }

    // for shared common data
    @ModelAttribute
    public void commonContent(Model model) {
        model.addAttribute("Header", "cgg");
        model.addAttribute("desc", "its a good company");

    }

    @PostMapping("/processform")
    public String fromprocessor(@ModelAttribute User u1, Model model) {

        if (u1.getUser_name().isEmpty()) {

            return "redirect:/register";
        }

        userserv.saveUser(u1);

        System.out.println("the user is " + u1);

        model.addAttribute("message", "user created");

        return "success";
    }

}
