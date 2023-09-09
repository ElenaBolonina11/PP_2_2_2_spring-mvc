package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarDAO;
import web.services.CarService;

@Controller
@RequestMapping("/cars")
public class CarsController {
    private final CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }
    @GetMapping(value = "cars")
    public String getCarsNumber(@RequestParam(name = "count", defaultValue = "5") Integer count, ModelMap modelMap) {
        if (count > 5 ) {
            count = 5;
            //modelMap.addAttribute("cars", carService.getAllCars());
        }
        modelMap.addAttribute("cars", carService.getCarsNumber(count));
        return "cars";
    }
}
