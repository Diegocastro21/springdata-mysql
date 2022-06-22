package co.com.gm.web;

import co.com.gm.domain.Persona;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@Slf4j
public class ControladorInicio {



    @GetMapping("/")
    public String inicio(Model model){

        log.info("ejecutando el controlador Spring MVC");
       // model.addAttribute("personas", personas);
        return "index";
    }

}
