package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.List;

class ListToJson {
    public static void main(String[] args) throws Exception {
        ObjectMapper om = new ObjectMapper();
        List<Car> cars = Arrays.asList(new Car("Toyota", "Fortuner"), new Car("Audi", "Q4"));
        String carsJson = om.writeValueAsString(cars);
        System.out.println(carsJson);
    }
}

