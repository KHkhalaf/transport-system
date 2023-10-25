package com.transport.app.models;

import com.transport.app.enums.StationStatus;
import com.transport.app.enums.StationType;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Station extends ParentEntity{

    @Column
    private String name;

    @Column
    @Enumerated(EnumType.STRING)
    private StationType type;

    @Column
    private String city;

    @Column
    private String region;

    @Column
    @Enumerated(EnumType.STRING)
    private StationStatus status;

    @Column
    private String value1;

    @Column
    private String value2;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="tenant_id", nullable=false)
    private Tenant tenant;

    @OneToMany(mappedBy = "station", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<VehicleStation> vehicleStations = new ArrayList<>();

    @OneToMany(mappedBy = "station", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TravelStation> travelStations = new ArrayList<>();

    public List<VehicleStation> getVehicleStations() {
        return vehicleStations;
    }

    public void setVehicleStations(List<VehicleStation> vehicleStations) {
        this.vehicleStations = vehicleStations;
    }

    public List<TravelStation> getTravelStations() {
        return travelStations;
    }

    public void setTravelStations(List<TravelStation> travelStations) {
        this.travelStations = travelStations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StationType getType() {
        return type;
    }

    public void setType(StationType type) {
        this.type = type;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public StationStatus getStatus() {
        return status;
    }

    public void setStatus(StationStatus status) {
        this.status = status;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }
}
