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
    @JoinColumn(name = "model_id")
    private CarModel model;
    private boolean rented;

    public Car() {
    }

    public Car(String license, CarModel model, boolean rented) {
        this.license = license;
        this.model = model;
        this.rented = rented;
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

    public CarModel getModel() {
        return model;
    }

    public void setModel(CarModel model) {
        this.model = model;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", license='" + license + '\'' +
                ", model=" + model +
                ", rented=" + rented +
                '}';
    }
}
