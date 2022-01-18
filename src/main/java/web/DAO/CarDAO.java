package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAO {
    private List<Car> carsList = new ArrayList<>();
    {
        carsList.add( new Car(2001,"Mercedes", 100.5));
        carsList.add( new Car(2013,"Volkswagen", 33.2));
        carsList.add( new Car(1998,"Skoda", 73.8));
        carsList.add( new Car(2020,"Nissan", 303.6));
        carsList.add( new Car(2007,"Lada", 50.9));
    }
    public List<Car> getAllCars() {
        return carsList;
    }

    public List<Car> getCarsNumber(int count) {
        return carsList.stream().limit(count).collect(Collectors.toList());
    }

}
