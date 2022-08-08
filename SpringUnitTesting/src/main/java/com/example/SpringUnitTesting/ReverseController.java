package com.example.SpringUnitTesting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseController {

    //@GetMapping("/reverse")
    public String reverse(String word) {
        //String noSpacesFormatted = word.replaceAll("\\s+","").toLowerCase();
        StringBuilder sb = new StringBuilder(word);
        return sb.reverse().toString();
    }

}
