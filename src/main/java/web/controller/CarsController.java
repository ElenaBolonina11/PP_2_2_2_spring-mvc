package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarDAO;

@Controller
@RequestMapping("/cars")
public class CarsController {
    private final CarDAO carDAO;

    public CarsController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }
    @GetMapping()
    public String show(@RequestParam(name = "count", required = false) Integer count,
                       ModelMap modelMap) {
        if (count == null) {
            modelMap.addAttribute("cars", carDAO.getAllCars());
        } else {
            modelMap.addAttribute("cars", carDAO.getCarsNumber(count));
        }
        return "cars";
    }
}
