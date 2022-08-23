package com.example.calculator.controller;

import com.example.calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

 public CalculatorController(CalculatorService calculatorService) {
      this.calculatorService = calculatorService;
   }

    @GetMapping
    public String welcome() {
        return calculatorService.serviceWelcome();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") int number1,
                       @RequestParam("num2") int number2) {

    return answerMessage(number1, number2, "+", calculatorService.servicePlus(number1, number2));

    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") int number1,
                        @RequestParam("num2") int number2) {

        return answerMessage(number1, number2, "-", calculatorService.serviceMinus(number1, number2));
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") int number1,
                           @RequestParam("num2") int number2) {

        return answerMessage(number1, number2, "*", calculatorService.serviceMultiply(number1, number2));
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") int number1,
                         @RequestParam("num2") int number2) {
        return answerMessage(number1, number2, "/", calculatorService.serviceDivide(number1, number2));
    }
    private String answerMessage(int number1,
                                 int number2,
                                 String operation,
                                 Number result) {
        return String.format("%d %s %d = %s", number1, operation, number2, result);
    }


}
