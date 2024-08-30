package com.example.lab2_20211688;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value={"/home","/",""},method= RequestMethod.GET)
public class BingoController {
    @GetMapping({"/","/formulario",""})
    public String mostrarConfiguracionJuego(){
        return "configuracion";
    }
}
