package com.example.lab2_20211688;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value={"/home","/",""},method= RequestMethod.GET)
public class BingoController {
    @GetMapping({"/","/formulario",""})
    public String mostrarConfiguracionJuego(){
        return "configuracion";
    }
    @PostMapping({"/formularioPost"})
    public String formularioPost(@RequestParam("tamanho") String tamanho, @RequestParam("numeroTarjetas") String numeroTarjetas){
        //imprimimos en terminal para verificar que llega al controlador
        System.out.println(tamanho);
        System.out.println(numeroTarjetas);
        return "bingo";
    }

}
