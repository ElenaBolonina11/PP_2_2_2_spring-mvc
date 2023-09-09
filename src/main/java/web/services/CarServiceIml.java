package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarDAO;
import web.model.Car;

import java.util.List;
@Service
public class CarServiceIml implements CarService {
    private final CarDAO carDAO;
    @Autowired
    public CarServiceIml(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getCarsNumber(int count) {
        return carDAO.getCarsNumber(count);
    }
}
