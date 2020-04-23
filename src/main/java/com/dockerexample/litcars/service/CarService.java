package com.dockerexample.litcars.service;

import com.dockerexample.litcars.model.Car;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CarService {

    static Map<String, Car> cars= new HashMap<>();
    public Car addCar(Car c){

        cars.put(c.getName(),c);
        return cars.get(c.getName());
    }
    public List<Car> getCars(){
        List<Car> output=new ArrayList<>();
        for(Map.Entry<String,Car> temp:cars.entrySet()){
            output.add(temp.getValue());
        }
        return output;
    }
    @PostConstruct
    public void init(){
        cars.put("honda1", new Car("Honda1","crv",2000.0));
    }
}