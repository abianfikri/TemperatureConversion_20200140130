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
        
        int getSuhu = Integer.parseInt(data.getParameter("suhu"));
        int get = Integer.parseInt(data.getParameter("data"));
        
        double celciusTo_Fahre = computeData.celciusToFahrenheit(getSuhu);
        double fahreTo_Celcius = computeData.fahreinheitToCelcius(get);
        
        return "Celcius = " + getSuhu + " C" + "<p>" +
                "Convert Fahreinheit = " + celciusTo_Fahre + " F" + "<p>" + "<hr>" +
                "Fahreinhet = " + get + " F" + "<p>" +
                "Convert Celcius = " + fahreTo_Celcius + " C";
    }
    
    @RequestMapping("/reamur")
    @ResponseBody
    public String getReamur(HttpServletRequest data, Model model){
        
        int getReamur = Integer.parseInt(data.getParameter("suhu"));
        int get = Integer.parseInt(data.getParameter("data"));
        
        double compute = computeData.celciusToReamur(getReamur);
        double compute2 = computeData.reamurToCelcius(get);
        
        return "Celcius = " + getReamur + " C" + "<p>" +
                "Convert Reamur = " + compute + " R" + "<hr><p>" +
                "Reamur = " + get + " R" + "<p>" +
                "Convert Celcius = " + compute2 + " C";
    }
    
    @RequestMapping("/kelvin")
    @ResponseBody
    public String getKelvin(HttpServletRequest data, Model model){
        
        int getKelvin = Integer.parseInt(data.getParameter("data"));
        
        double compute = computeData.celciusToKelvin(getKelvin);
        
        return "Celcius = " + getKelvin + "<p>" +
                "Convert Kelvin = " + compute;
    }
    
    @RequestMapping("/suhu")
    @ResponseBody
    public String getSuhu(HttpServletRequest data, Model model){
        
        int getdata = Integer.parseInt(data.getParameter("suhu"));
        
        // Bagian Celcius
        double celciusTo_Fahre = computeData.celciusToFahrenheit(getdata);
        double celciusTo_Reamur = computeData.celciusToReamur(getdata);
        double celciusTo_Kelvin = computeData.celciusToKelvin(getdata);
        
        // Bagian Fahreinheit
        double fahreTo_Celcius = computeData.fahreinheitToCelcius(getdata);
        double fahreTo_Reamur = computeData.fahreinheitToReamur(getdata);
        
        
        return "Suhu Awal = " + getdata + "<p>" + "<hr>" + "<b>Dari Celcius Ke</b>" + "<p>" +
                "Convert Fahrenheit = " + celciusTo_Fahre+ " F" + "<p>" +
                "Convert Reamur = " + celciusTo_Reamur + " R" + "<p>" + 
                "Convert Kelvin = " + celciusTo_Kelvin + " K"+ "<p>" + "<hr>" +
                "<b>Dari Fahreinheit Ke -</b>" + "<p>" +
                "Convert Celcius = " + fahreTo_Celcius + " C" + "<p>" +
                "Convert Reamur = " + fahreTo_Reamur + " R";
    }
}
