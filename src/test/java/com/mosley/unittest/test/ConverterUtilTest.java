package com.mosley.unittest.test;

import com.mosley.unittest.converter.ConverterUtil;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Unit tests for ConverterUtil class
 */
public class ConverterUtilTest {

   private static final int[][] CELSIUS_FAHRENHEIT_MAPPING = { 
        { 10, 50 }, 
        { 40, 104 }, 
        { 0, 32 },
        {-40, -40} //Added edge case for extreme temperatures 
    };

    /**
     * Test conversion from Celsius to Fahrenheit
     * 
     * @return a stream of dynamic tests for Celsius to Fahrenheit conversion.
     */

    @TestFactory
    Stream<DynamicTest> ensureThatCelsiusConvertsToFahrenheit() {
        return Arrays.stream(CELSIUS_FAHRENHEIT_MAPPING).map(entry -> {
            // access celsius and fahrenheit from entry
            int celsius = entry[0];
            int fahrenheit = entry[1];
            return DynamicTest.dynamicTest(
                celsius + "°C -> " + fahrenheit + "°F",
                () -> assertEquals(fahrenheit, ConverterUtil.convertCelsiusToFahrenheit(celsius))
            );
        });

    }

    @TestFactory
    Stream<DynamicTest> ensureThatFahrenheitConvertsToCelsius() {
        return Arrays.stream(CELSIUS_FAHRENHEIT_MAPPING).map(entry -> {
            int celsius = entry[0];
            int fahrenheit = entry[1];
            return DynamicTest.dynamicTest(
                fahrenheit + "°F -> " + celsius + "°C", 
                () -> assertEquals(celsius, ConverterUtil.convertFahrenheitToCelsius(fahrenheit))
            );
        });
    } 
}
