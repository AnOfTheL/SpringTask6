package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDao;

import java.util.List;
@Component
public class CarService {
    private final CarDao carDao = new CarDao();

    public List<String> printCars(Integer count){
        if (count == null){
            return carDao.printCars();
        } else {
            return count < 5 ? carDao.printCars().stream().limit(count).toList() : carDao.printCars();
        }
    }
}
