package com.transport.app.models;

import com.transport.app.enums.TravelCategory;
import com.transport.app.enums.TravelClass;
import com.transport.app.enums.TravelStatus;
import com.transport.app.enums.TravelType;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Travel extends ParentEntity{

    @Column
    private String code;

    @Column
    @Enumerated(value = EnumType.STRING)
    private TravelStatus status;

    @Column
    @Enumerated(value = EnumType.STRING)
    private TravelType type;

    @Column
    @Enumerated(EnumType.STRING)
    private TravelClass travelClass;

    @Column
    @Enumerated(value = EnumType.STRING)
    private TravelCategory category;

    @Column
    private Long cost;

    @Column
    private Long tax;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="tenant_id", nullable=false)
    private Tenant tenant;

    @Column
    private Boolean isEditable;

    @OneToMany(mappedBy = "travel", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TravelAddition> additions = new ArrayList<>();

    @OneToMany(mappedBy = "travel", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Request> requests = new ArrayList<>();

    @OneToMany(mappedBy = "travel", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TravelSeat> travelSeats = new ArrayList<>();

    @OneToMany(mappedBy = "travel", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TravelTimeStone> travelTimeStones = new ArrayList<>();

    @OneToMany(mappedBy = "travel", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TravelStation> travelStations = new ArrayList<>();

    @OneToMany(mappedBy = "travel", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TravelVehicle> travelVehicles = new ArrayList<>();

    public List<TravelSeat> getTravelSeats() {
        return travelSeats;
    }

    public void setTravelSeats(List<TravelSeat> travelSeats) {
        this.travelSeats = travelSeats;
    }

    public List<TravelTimeStone> getTravelTimeStones() {
        return travelTimeStones;
    }

    public void setTravelTimeStones(List<TravelTimeStone> travelTimeStones) {
        this.travelTimeStones = travelTimeStones;
    }

    public List<TravelStation> getTravelStations() {
        return travelStations;
    }

    public void setTravelStations(List<TravelStation> travelStations) {
        this.travelStations = travelStations;
    }

    public List<TravelVehicle> getTravelVehicles() {
        return travelVehicles;
    }

    public void setTravelVehicles(List<TravelVehicle> travelVehicles) {
        this.travelVehicles = travelVehicles;
    }

    public List<Request> getRequests() {
        return requests;
    }

    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public TravelStatus getStatus() {
        return status;
    }

    public void setStatus(TravelStatus status) {
        this.status = status;
    }

    public TravelType getType() {
        return type;
    }

    public void setType(TravelType type) {
        this.type = type;
    }

    public TravelClass getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(TravelClass travelClass) {
        this.travelClass = travelClass;
    }

    public TravelCategory getCategory() {
        return category;
    }

    public void setCategory(TravelCategory category) {
        this.category = category;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public Long getTax() {
        return tax;
    }

    public void setTax(Long tax) {
        this.tax = tax;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public Boolean getEditable() {
        return isEditable;
    }

    public void setEditable(Boolean editable) {
        isEditable = editable;
    }

}

