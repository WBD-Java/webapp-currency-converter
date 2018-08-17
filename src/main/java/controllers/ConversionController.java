package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConversionController {
    @GetMapping("/")
    public String converter(){
        return "index";
    }
    @GetMapping("/convert")
    public String conversion(@RequestParam double usd, double rate, Model model) {
        double vnd = usd * rate;
        model.addAttribute("usd", usd);
        model.addAttribute("rate", rate);
        model.addAttribute("vnd", vnd);
        return "currency-conversion";
    }
}
