package com.spring.rest.doc.springrestdocsapi;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@EqualsAndHashCode
@Entity
@Table(name = "ORDER_TB")
public class Order {
    @Id
    private int orderId;
    private String name;
    private int quantity;
    private double price;

    public Order() {
    }
    public Order(int orderId, String name, int quantity, double price ) {
        this.orderId = orderId;
        this.name = name;
        this.quantity =quantity;
        this.price = price;
    }
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}