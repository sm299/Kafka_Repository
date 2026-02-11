package com.kafka.demo.model;

public class Course {
    private String id;
    private String name;
    private double price;

    public Course() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + ", price=" + price + "]";
    }

}
