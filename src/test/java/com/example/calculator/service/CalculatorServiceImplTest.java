package com.example.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorServiceImplTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();
    private int number1;
    private int number2;
    private int number3;
    private String welcome;

    @BeforeEach
    public void setUp() {
        number1 = 2;
        number2 = 5;
        number3 = 0;
        welcome = "<b>Добро пожаловать в калькулятор!</b>";
    }

    @Test
    public void shouldReturnWelcome() {
        Assertions.assertEquals(out.serviceWelcome(), welcome);
    }


    @Test
    public void shouldReturnServicePlusTwoAndFive() {
        Assertions.assertEquals(out.servicePlus(number1, number2), number1 + number2);
    }

    @Test
    public void shouldReturnServicePlusFiveAndZero() {
        Assertions.assertEquals(out.servicePlus(number2, number3), number2 + number3);
    }

    @Test
    public void shouldReturnServiceMinusFiveAndTwo() {
        Assertions.assertEquals(out.serviceMinus(number2, number1), number2 - number1);
    }

    @Test
    public void shouldReturnServiceMinusZeroAndTwo() {
        Assertions.assertEquals(out.serviceMinus(number3, number1), number3 - number1);
    }

    @Test
    public void shouldReturnServiceMultiplyTwoAndFive() {
        Assertions.assertEquals(out.serviceMultiply(number1, number2), number1 * number2);
    }

    @Test
    public void shouldReturnServiceMultiplyZeroAndTwo() {
        Assertions.assertEquals(out.serviceMultiply(number3, number1), number3 * number1);
    }

    @Test
    public void shouldReturnServiceDivideFiveAndTwo() {
        Assertions.assertEquals(out.serviceDivide(number2, number1), (double) number2 / number1);
    }

    @Test
    public void shouldReturnServiceDivideTwoAndFive() {
        Assertions.assertEquals(out.serviceDivide(number1, number2), (double) number1 / number2 );
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWithNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> out.serviceDivide(number1, number3));
    }
}
