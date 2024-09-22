package web.service;

import web.model.Car;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService{
    private final List<Car> cars = new ArrayList<>();

    public CarServiceImp() {
        cars.add(new Car("Tesla", "Model S", 2020));
        cars.add(new Car("Toyota", "Camry", 2019));
        cars.add(new Car("Honda", "Civic", 2018));
        cars.add(new Car("Ford", "Focus", 2021));
        cars.add(new Car("Chevrolet", "Malibu", 2020));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count <=0 || count > cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }

}
