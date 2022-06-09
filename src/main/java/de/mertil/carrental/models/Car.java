package de.mertil.carrental.models;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String license;
    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;
    private String model;
    @ManyToOne
    @JoinColumn(name = "car_type_id")
    private CarType carType;

    public Car() {
    }

    public Car(String license, Brand brand, String model, CarType carType) {
        this.license = license;
        this.brand = brand;
        this.model = model;
        this.carType = carType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", license='" + license + '\'' +
                ", brand=" + brand +
                ", model='" + model + '\'' +
                ", carType=" + carType +
                '}';
    }
}
