package com.dockerexample.litcars.Controller;


import com.dockerexample.litcars.model.Car;
import com.dockerexample.litcars.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="api/v1/cars")

public class CarController {
   @Autowired
   CarService carService;

    @PostMapping
    public Car addcar(@RequestBody com.dockerexample.litcars.model.Car c){
       return carService.addCar(c);
    }
    @GetMapping
    public List<Car>  getAllCars(){
        return carService.getCars();
    }

}
