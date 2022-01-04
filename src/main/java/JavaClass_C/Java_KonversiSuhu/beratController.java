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
public class beratController {
    
    @RequestMapping("/konversi")
    public String getBerat(HttpServletRequest data, Model model){
        
        double input = Double.parseDouble(data.getParameter("nilai"));
        
        double getData1 = beratCompute.gramToKilogram(input);
        double getData2 = beratCompute.kilogramToGram(input);
        double getData3 = beratCompute.gramToMiligram(input);
        double getData4 = beratCompute.gramToOns(input);
        
        model.addAttribute("kilo", input +  " gram = " + getData1 + " Kg");
        model.addAttribute("gram", input + " Kg = " + getData2 + " gram");
        model.addAttribute("mili", input + " gram = " + getData3 + " Mg");
        model.addAttribute("ons", input + " gram = "+ getData4 + " ons");
        
        return "berat";
    }
    
}
