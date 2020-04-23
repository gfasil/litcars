package com.dockerexample.litcars.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@ToString
public class Car {

    private String model;
    private String name;
    private Double price;

    public Car(String model, String name, Double price) {
        this.model = model;
        this.name = name;
        this.price = price;
    }

}
