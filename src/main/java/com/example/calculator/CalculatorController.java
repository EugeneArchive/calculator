package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private CalculatorService calculatorService =  new CalculatorService();

//    public CalculatorController(CalculatorService calculatorService) {
//        this.calculatorService = calculatorService;
//    }
@GetMapping(path = "/calculator/plus")
public String plus(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {

    return number1 + " + " + number2 + " = " + calculatorService.servicePlus(number1, number2);
}
}
