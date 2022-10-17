package com.oyataco.rest.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController//indicamos que manejaremos las solicitudes HTTP por un controlador que marca la clase donde cada metodo devuelve on objeto de dominio
public class SaludoController {
    private static final String plantilla="Hello, %s";
    private final AtomicLong contador=new AtomicLong();



    @GetMapping("/Saludo")//garantiza que las solicitudes HTTP "/Saludo" se asignen al metodo saludo
    public Saludo saludo(@RequestParam(value = "name",defaultValue = "World")String name){ //@RequestParam enlaza el valor del parametro
                                                //de cadena de consulta name,c on el name parametro del metodo saludo()
        return new Saludo(contador.incrementAndGet(),String.format(plantilla,name));
    }
}
