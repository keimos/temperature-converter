package com.mosley.unittest.test;

import com.mosley.unittest.converter.ConverterUtil;
import org.junit.jupiter.api.DynamicTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.stream.Stream;

public class ConverterUtilTest {

    int[][] celsiusFahrenheitMapping = new int[][] { { 10, 50 }, { 40, 104 }, { 0, 32 } };

    @TestFactory
    Stream<DynamicTest> ensureThatCelsiusConvertsToFahrenheit() {
        return Arrays.stream(celsiusFahrenheitMapping).map(entry -> {
            // access celsius and fahrenheit from entry
            int celsius = entry[0];
            int fahrenheit = entry[1];
            return null;
            // return a dynamicTest which checks that the conversion from celsius to
            // fahrenheit is correct
        });

    }

    Stream<DynamicTest> ensureThatFahrenheitToCelsiusConverts() {
        return null;
        // TODO Write a similar test fahrenheit to celsius
    }

/*    @TestFactory
    public Stream<DynamicTest> ensureThatCelsiusConvertsToFahrenheit() {

        ConverterUtil converterUtil = new ConverterUtil();

        int[][] data = new int [][] { { 10, 50 }, { 40, 104 }, { 0, 32 } };

        return Arrays.stream(data).map(entry -> {
            // access celsius and fahrenheit from entry
            int celsius = entry[0];
            int fahrenheit = entry[1];
            return DynamicTest.dynamicTest(celsius + " Celsius are " + fahrenheit,() ->{
                assertEquals(fahrenheit, converterUtil.convertCelsiusToFahrenheit(celsius));
            });
        });

    }

    @TestFactory
    public Stream<DynamicTest> ensureThatFahrenheitConvertsToCelsius() {
        ConverterUtil converter = new ConverterUtil();
        int[][] data = new int[][] { { 10,50 }, { 40, 104}, { 0, 32 } };
        return Arrays.stream(data).map(entry -> {
            int celsius = entry[0];
            int fahrenheit = entry[1];
            return DynamicTest.dynamicTest(celsius + " Celsius are " + fahrenheit, () -> {
                assertEquals(celsius, converter.convertFahrenheitToCelsius(fahrenheit));
            });
        });
    } */
}
