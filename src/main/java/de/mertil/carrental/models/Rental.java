package de.mertil.carrental.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "rental")
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate startDate;
    private LocalDate endDate;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "pick_up_location_id")
    private Location pickUpLocation;
    @ManyToOne
    @JoinColumn(name = "return_location_id")
    private Location returnLocation;

    public Rental() {
    }

    public Rental(LocalDate startDate, LocalDate endDate, Customer customer, Location pickUpLocation, Location returnLocation) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.customer = customer;
        this.pickUpLocation = pickUpLocation;
        this.returnLocation = returnLocation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Location getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(Location pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public Location getReturnLocation() {
        return returnLocation;
    }

    public void setReturnLocation(Location returnLocation) {
        this.returnLocation = returnLocation;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", customer=" + customer +
                ", pickUpLocation=" + pickUpLocation +
                ", returnLocation=" + returnLocation +
                '}';
    }
}
