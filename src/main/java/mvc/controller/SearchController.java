package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {
    @RequestMapping(path = "/search", method = RequestMethod.POST)
    public String Search() {
        System.out.println("going to home view");

        return "home";
    }

    @GetMapping("/query")
    public String query(@RequestParam("queryBox") String query) {
        String url = "https://www.google.com/search?q=" + query;

        return "redirect:" + url;
    }

}
