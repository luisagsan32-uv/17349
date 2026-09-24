package mx.uv.fei.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludarContolador {

    String nombre;

    @GetMapping("/getSaludo")
    public String Saludar() {
        return "Hola Mundo! " + nombre;
    }
    
    @GetMapping("/getDespedida")
    public String adios() {
        return "Adios Mundo! " + nombre;
    }

    @PostMapping("/postNombre")
    public String nombre() {
        nombre = "Rafael";
        return nombre;
    }
}