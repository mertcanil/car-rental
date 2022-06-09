package de.mertil.carrental.models;

import javax.persistence.*;

@Entity
@Table(name = "cartype")
public class CarType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public CarType() {
    }

    public CarType(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CarType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
