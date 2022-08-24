package com.example.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.example.calculator.service.Constants.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceImplTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    public void shouldReturnWelcome() {
        assertEquals(out.serviceWelcome(), WELCOME);
    }


    @Test
    public void shouldReturnServicePlusTwoAndFive() {
        assertEquals(out.servicePlus(TWO, FIVE), TWO + FIVE);
    }

    @Test
    public void shouldReturnServicePlusFiveAndZero() {
        assertEquals(out.servicePlus(FIVE, ZERO), FIVE + ZERO);
    }

    @Test
    public void shouldReturnServiceMinusFiveAndTwo() {
        assertEquals(out.serviceMinus(FIVE, TWO), FIVE - TWO);
    }

    @Test
    public void shouldReturnServiceMinusZeroAndTwo() {
        assertEquals(out.serviceMinus(ZERO, TWO), ZERO - TWO);
    }

    @Test
    public void shouldReturnServiceMultiplyTwoAndFive() {
        assertEquals(out.serviceMultiply(TWO, FIVE), TWO * FIVE);
    }

    @Test
    public void shouldReturnServiceMultiplyZeroAndTwo() {
        assertEquals(out.serviceMultiply(ZERO, TWO), ZERO * TWO);
    }

    @Test
    public void shouldReturnServiceDivideFiveAndTwo() {
        assertEquals(out.serviceDivide(FIVE, TWO), (double) FIVE / TWO);
    }

    @Test
    public void shouldReturnServiceDivideTwoAndFive() {
        assertEquals(out.serviceDivide(TWO, FIVE), (double) TWO / FIVE );
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWithNull() {
        assertThrows(IllegalArgumentException.class, () -> out.serviceDivide(TWO, ZERO));
    }
}
