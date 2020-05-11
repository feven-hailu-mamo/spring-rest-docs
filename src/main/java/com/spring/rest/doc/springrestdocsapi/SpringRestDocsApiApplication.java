package com.spring.rest.doc.springrestdocsapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class SpringRestDocsApiApplication {

    @Autowired
    private OrderRepository repository;

    @PostMapping("/place-order")
    public List<Order> saveOrder(@RequestBody List<Order> orders) {
        repository.saveAll(orders);
        return orders;
    }

    @GetMapping("/get-orders")
    public List<Order> getOrders() {
        return repository.findAll();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringRestDocsApiApplication.class, args);
    }

}
