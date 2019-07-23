package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.LinkedHashSet;
import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    CategoryRepository catergoryRepository;

    @Autowired
    CarRepository carRepository;

    @Override
    public void run(String... args) throws Exception {


        Category catergory1 = new Category("Sedan");
        catergoryRepository.save(catergory1);

        Category catergory2 = new Category("SUV");
        catergoryRepository.save(catergory2);

        Category catergory3 = new Category("Truck");
        catergoryRepository.save(catergory3);

        Category catergory4 = new Category("Sport");
        catergoryRepository.save(catergory4);
    }
}