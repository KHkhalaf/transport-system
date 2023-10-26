package com.transport.app.models;

import com.transport.app.enums.CarClass;
import com.transport.app.enums.CarColor;
import com.transport.app.enums.CarStatus;
import com.transport.app.enums.CarType;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Vehicle extends ParentEntity{

    @Column
    private Long number;

    @Column
    private String code;

    @Column
    @Enumerated(EnumType.STRING)
    private CarType type;

    @Column
    @Enumerated(EnumType.STRING)
    private CarColor color;

    @Column
    @Enumerated(EnumType.STRING)
    private CarStatus status;

    @Column
    @Enumerated(EnumType.STRING)
    private CarClass carClass;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="tenant_id", nullable=false)
    private Tenant tenant;

    @OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<VehicleAddition> vehicleAdditions = new ArrayList<>();

    @OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<VehicleStation> vehicleStations = new ArrayList<>();

    @OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TravelVehicle> travelVehicles = new ArrayList<>();

    @Column
    private String model;

    @Column
    private String version;

    @Column
    private Long totalSeats;

    @Column
    private Long totalColumns;

    @Column
    private Long totalLevels;

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public CarColor getColor() {
        return color;
    }

    public void setColor(CarColor color) {
        this.color = color;
    }

    public CarStatus getStatus() {
        return status;
    }

    public void setStatus(CarStatus status) {
        this.status = status;
    }

    public CarClass getCarClass() {
        return carClass;
    }

    public void setCarClass(CarClass carClass) {
        this.carClass = carClass;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Long getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(Long totalSeats) {
        this.totalSeats = totalSeats;
    }

    public Long getTotalColumns() {
        return totalColumns;
    }

    public void setTotalColumns(Long totalColumns) {
        this.totalColumns = totalColumns;
    }

    public Long getTotalLevels() {
        return totalLevels;
    }

    public void setTotalLevels(Long totalLevels) {
        this.totalLevels = totalLevels;
    }

    public List<VehicleStation> getVehicleStations() {
        return vehicleStations;
    }

    public void setVehicleStations(List<VehicleStation> vehicleStations) {
        this.vehicleStations = vehicleStations;
    }
}
