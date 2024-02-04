package mvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping(path = "/home", method = RequestMethod.GET)
    public String home(Model modal) {
        System.out.println("NOW IN HOME URL");

        modal.addAttribute("name", "dinz");
        modal.addAttribute("id", 20);
        List<String> friends = new ArrayList<>();

        friends.add("a");
        friends.add("b");
        friends.add("c");

        modal.addAttribute("friends", friends);
        return "home";
    }

    @GetMapping("/About")
    public String About() {
        System.out.println("NOW IN About URL");
        return "about";

    }

    @GetMapping("/help")
    public ModelAndView help() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", "cgg");
        mv.addObject("roll", 20);
        LocalDateTime now = LocalDateTime.now();
        mv.addObject("date", now);

        List<String> friends = new ArrayList<>();

        friends.add("a");
        friends.add("b");
        friends.add("c");

        mv.addObject("frnds", friends);
        mv.setViewName("help");

        return mv;

    }

}
