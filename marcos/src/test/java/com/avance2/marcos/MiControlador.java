package com.avance2.marcos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MiControlador {

    @GetMapping("/peliculas")
    public String pagina1() {
        return "peliculas"; // nombre de la vista
    }

    @GetMapping("/series")
    public String pagina2() {
        return "pagina2"; // nombre de la vista
    }

    @GetMapping("/sobre")
    public String pagina3() {
        return "pagina3"; // nombre de la vista
    }
}


