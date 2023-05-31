package jobsagrigator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {
    /**
     * Метод формирует страницу из HTML-файла index.html,
     * который находится в папке resources/templates.
     * Это делает библиотека Thymeleaf.
     */

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/profile")
    public String profile() {
        return "profile";
    }

    @RequestMapping("/addVacancy")
    public String vacancyAddition() {
        return "vacancyAddition";
    }

    @RequestMapping("/searchVacancy")
    public String searchVacancy() {
        return "searchVacancy";
    }

    @RequestMapping("/searchEmployee")
    public String searchEmployee() {
        return "searchEmployee";
    }
}
