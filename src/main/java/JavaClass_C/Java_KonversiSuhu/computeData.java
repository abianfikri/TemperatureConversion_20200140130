/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaClass_C.Java_KonversiSuhu;

/**
 *
 * @author Abian
 */
public class computeData {
    
    // Tim Celcius
    public static double celciusToFahrenheit(double value){
        return ((9 * value) / 5) + 32;
    }
    public static double celciusToReamur(double value){
        return (4 * value) / 5;
    }
    public static double celciusToKelvin(double value){
        return value + 273;
    }
    
    // Tim Fahreinheit
    public static double fahreinheitToCelcius(double value){
        return 0.5555 * (value-32); // 5/9
    }
    public static double fahreinheitToReamur(double value){
        return 0.4444 * (value-32); // 4/9
    }
    
    // Tim Reamur
    public static double reamurToCelcius(double value){
        return (5*value)/4;
    }
    
    
}
