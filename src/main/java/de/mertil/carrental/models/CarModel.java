package de.mertil.carrental.models;

import javax.persistence.*;

@Entity
@Table(name = "car_model")
public class CarModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;
    private String name;
    @ManyToOne
    @JoinColumn(name = "type_id")
    private CarType type;

    public CarModel() {
    }

    public CarModel(Brand brand, String name, CarType type) {
        this.brand = brand;
        this.name = name;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String model) {
        this.name = model;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "id=" + id +
                ", brand=" + brand +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
