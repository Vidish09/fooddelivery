package com.fooddelivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.*;
import java.util.List;

@SpringBootApplication
public class FoodDeliveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoodDeliveryApplication.class, args);
    }

    // ENTITY
    @Entity
    class FoodItem {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        private double price;

        public Long getId() { return id; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public double getPrice() { return price; }
        public void setPrice(double price) { this.price = price; }
    }

    // REPOSITORY
    interface FoodRepository extends JpaRepository<FoodItem, Long> {}

    // SERVICE
    @Service
    class FoodService {
        @Autowired
        private FoodRepository repo;

        public List<FoodItem> getAllFoods() {
            return repo.findAll();
        }

        public FoodItem addFood(FoodItem food) {
            return repo.save(food);
        }
    }

    // CONTROLLER
    @RestController
    @RequestMapping("/api/foods")
    @CrossOrigin("*")
    class FoodController {

        @Autowired
        private FoodService service;

        @GetMapping
        public List<FoodItem> getFoods() {
            return service.getAllFoods();
        }

        @PostMapping
        public FoodItem addFood(@RequestBody FoodItem food) {
            return service.addFood(food);
        }
    }
}