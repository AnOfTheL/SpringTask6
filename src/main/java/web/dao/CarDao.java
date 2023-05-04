package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


public class CarDao {
    private static List<String> cars;

    static {
        cars = new ArrayList<>();

        cars.add(new Car(1, "model-1", "white").toString());
        cars.add(new Car(2, "model-2", "blue").toString());
        cars.add(new Car(3, "model-3", "red").toString());
        cars.add(new Car(4, "model-4", "black").toString());
        cars.add(new Car(5, "model-5", "yellow").toString());
        cars.add(new Car(6, "model-6", "gray").toString());
    }

    public static List<String> printCars() {
        return List.copyOf(cars);
    }
}
