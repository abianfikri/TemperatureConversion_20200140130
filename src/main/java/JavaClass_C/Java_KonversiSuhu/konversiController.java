/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaClass_C.Java_KonversiSuhu;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Abian
 */
@Controller
public class konversiController {
    
    @RequestMapping("/Fahreinheit")
    @ResponseBody
    public String getFahreinheit(HttpServletRequest data, Model model){
        
        int getFahreinheit = Integer.parseInt(data.getParameter("suhu"));
        
        double compute = computeData.celciusToFahrenheit(getFahreinheit);
        
        return "Celcius = " + getFahreinheit + "<p>" +
                "Convert Fahreinheit = " + compute;
    }
    
    @RequestMapping("/kelvin")
    @ResponseBody
    public String getKelvin(HttpServletRequest data, Model model){
        
        int getKelvin = Integer.parseInt(data.getParameter("data"));
        
        double compute = computeData.celciusToKelvin(getKelvin);
        
        return "Celcius = " + getKelvin + "<p>" +
                "Convert Kelvin = " + compute;
    }
    
    @RequestMapping("/reamur")
    @ResponseBody
    public String getReamur(HttpServletRequest data, Model model){
        
        int getReamur = Integer.parseInt(data.getParameter("suhu"));
        
        double compute = computeData.celciusToReamur(getReamur);
        
        return "Celcius = " + getReamur + "<p>" +
                "Convert Kelvin = " + compute;
    }
    
        @RequestMapping("/suhu")
    @ResponseBody
    public String getSuhu(HttpServletRequest data, Model model){
        
        int getdata = Integer.parseInt(data.getParameter("suhu"));
        
        double fahre = computeData.celciusToFahrenheit(getdata);
        double reamur = computeData.celciusToReamur(getdata);
        double kelvin = computeData.celciusToKelvin(getdata);
        
        return "Celcius = " + getdata + " C" + "<p>" +
                "Convert Fahrenheit = " + fahre+ " F" + "<p>" +
                "Convert Reamur = " + reamur + " R" + "<p>" + 
                "Convert Kelvin = " + kelvin + " K";
    }
}
