package com.mosley.unittest.converter;

public class ConverterUtil {

    // converts to celsius
    public static float convertFahrenheitToCelsius(float fahrenheit) {
        validateTemperature(fahrenheit);
        return ((fahrenheit - 32) * 5 / 9);
    }

    // converts to fahrenheit
    public static float convertCelsiusToFahrenheit(float celsius) {
        validateTemperature(celsius);
        return ((celsius * 9) / 5) + 32;
    }

    private static void validateTemperature(float temperature) {
        // Adjust bounds based on needs of application
        if (temperature < -2273.15 || temperature  > 1_000) {
            throw new IllegalArgumentException("Temperature is our of the realistic due bounds: " + temperature);
        }
    }

}
