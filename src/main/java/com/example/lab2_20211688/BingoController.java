package com.example.lab2_20211688;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping(value={"/home","/",""},method= RequestMethod.GET)
public class BingoController {

    @GetMapping({"/","/formulario",""})
    public String mostrarConfiguracionJuego(){
        return "configuracion";
    }
    @PostMapping({"/formularioPost"})
    public String formularioPost(Model model,@RequestParam("tamanho") Integer tamanho, @RequestParam("numeroTarjetas") Integer numeroTarjetas){
        //imprimimos en terminal para verificar que llega al controlador
        System.out.println(tamanho);
        System.out.println(numeroTarjetas);

        ArrayList<Integer> listaTarjetas = new ArrayList<>();
        for(int i=0;i<numeroTarjetas;i++){
            listaTarjetas.add(i);
        }

        //llenamos numeros random
        ArrayList<Integer> numerosRandom = new ArrayList<>();
        for(int i=0;i<tamanho*tamanho;i++){
            numerosRandom.add((int)(Math.random()*99+1));

        }



        model.addAttribute("listaTarjetas",listaTarjetas);
        model.addAttribute("tamanho",tamanho);
        model.addAttribute("numerosRandom",numerosRandom);


        return "bingo";
    }

}
