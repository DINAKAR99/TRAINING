package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import mvc.models.Student;

@Controller
public class FormController {
    @GetMapping("/complex")
    public String showForm() {

        return "complexform";

    }

    // @InitBinder
    // public void initBinder(WebDataBinder binder) {

    // SimpleDateFormat sf = new SimpleDateFormat("dd**MM**yyyy");
    // binder.registerCustomEditor(Date.class, "dob", new CustomDateEditor(sf,
    // false));

    // }

    @PostMapping("/handleform")
    public String handleform(@ModelAttribute Student stud, Model mod, BindingResult br) {

        if (br.hasErrors()) {
            return "complexform";

        }

        mod.addAttribute("student", stud);
        return "success_1";

    }

}
