package org.example;

import lombok.Data;
import lombok.Getter;

@Data
public class TemperatureMeter {

    public double fahrenheitToCelsius(int fahrenheit){
        return (double) ((fahrenheit - 32) * 5) /9;
    }

    public double celsiusToFahrenheit(int celsius){
        return (double) (celsius * 9) /5+32;
    }

}
