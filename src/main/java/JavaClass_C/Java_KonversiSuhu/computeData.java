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
    public static double celciusToFahrenheit(double value){
        return ((9 * value) / 5) + 32;
    }
    public static double celciusToReamur(double value){
        return (4 * value) / 5;
    }
    public static double celciusToKelvin(double value){
        return value + 273;
    }
}
