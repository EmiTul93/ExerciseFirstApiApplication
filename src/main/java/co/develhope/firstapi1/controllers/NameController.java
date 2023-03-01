package co.develhope.firstapi1.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/name")

public class NameController {
    @GetMapping ("/sayMyName")
    public String getName(@RequestParam String name){
        return "Emidio";

    }

    @PostMapping ("/sayMyNameInv")
    public String getInverse( @RequestParam String name){
        StringBuilder stringBuilder = new StringBuilder("Emidio");
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}