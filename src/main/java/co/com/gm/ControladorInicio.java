package co.com.gm;

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

    @Value("${index.saludo}")
    private String saludo;

    @GetMapping("/")
    public String inicio(Model model){
        String mensaje = "Empezando con Thymeleaf";

        Persona persona = new Persona();
        persona.setNombre("Diego");
        persona.setApellido("Castro");
        persona.setEmail("dcastro@gmail.com");
        persona.setTelefono("31056563834");

        Persona persona2 = new Persona();
        persona2.setNombre("petro");
        persona2.setApellido("presidente");
        persona2.setEmail("petrosky2022@gmail.com");
        persona2.setTelefono("31387723434");

        Persona persona3 = new Persona();
        persona3.setNombre("Karla");
        persona3.setApellido("Gomez");
        persona3.setEmail("kgomez@gmail.com");
        persona3.setTelefono("31293533445");

        /*List<Persona> personas = new ArrayList<>();
        personas.add(persona);
        personas.add(persona2);
        personas.add(persona3);*/

        List<Persona> personas = Arrays.asList(persona, persona2, persona3);
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        //model.addAttribute("persona", persona);
        model.addAttribute("personas", personas);
        return "index";
    }

}
