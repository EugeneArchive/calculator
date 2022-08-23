package com.example.calculator.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceImplParamTest {
    CalculatorServiceImpl out = new CalculatorServiceImpl();

    public static Stream<Arguments> provideParamsForTests() {
        return Stream.of(
                Arguments.of(2, 5),
                Arguments.of(2, 4),
                Arguments.of(2, 8),
                Arguments.of(2, 15),
                Arguments.of(2, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldCorrectServicePlus(int number1,
                                         int number2) {
        int result = out.servicePlus(number1, number2);
        assertEquals(number1 + number2, result);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldCorrectServiceMinus(int number1,
                                          int number2) {
        int result = out.serviceMinus(number1, number2);
        assertEquals(number1 - number2, result);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldCorrectServiceMultiply(int number1,
                                             int number2) {
        int result = out.serviceMultiply(number1, number2);
        assertEquals(number1 * number2, result);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldCorrectServiceDivide(int number1,
                                          int number2) {
        double result = out.serviceDivide(number1, number2);
        assertEquals(number1 / number2, result);
    }


}
