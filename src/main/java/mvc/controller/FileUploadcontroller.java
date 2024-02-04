package mvc.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpSession;

@Controller
@MultipartConfig
public class FileUploadcontroller {

    @GetMapping("/fileform")
    public String showUploadform() {

        System.out.println("file upload form...");
        return "fileform";

    }

    @PostMapping("/uploadimage")
    public String fileupload(@RequestParam("profile") MultipartFile file, HttpSession s, Model m) {

        System.out.println("file upload handler...");

        System.out.println(file.getSize());
        System.out.println(file.getContentType());
        System.out.println(file.getName());
        System.out.println(file.getOriginalFilename());
        byte[] pack = null;

        try {
            pack = file.getBytes();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // save file to server

        String path = s.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources" + File.separator
                + "images" + File.separator + file.getOriginalFilename();

        System.out.println(path);

        try {
            FileOutputStream fs = new FileOutputStream(path);

            fs.write(pack);
            fs.close();
            System.out.println("file uploaded succesfully ");
            m.addAttribute("message", "file upload success");
            m.addAttribute("filename", file.getOriginalFilename());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("uploading error...");
            m.addAttribute("message", "uploading error...");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return "filesuccess";

    }

    @GetMapping("/user/{username}")
    public String getUserDetails(@PathVariable("username") String name) {

        name = null;
        System.out.println("the id is " + name);
        return "hemlo";

    }

    // @ExceptionHandler(NullPointerException.class)
    // public String execptionhandler(Model m) {

    // m.addAttribute("msg", "null pointer exception");

    // return "errorpage";

    // }

}
