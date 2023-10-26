package com.transport.app.models;

import com.transport.app.enums.AdditionCategory;
import com.transport.app.enums.AdditionType;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Addition extends ParentEntity{

    @Column
    @Enumerated(EnumType.STRING)
    private AdditionType type;

    @Column
    @Enumerated(EnumType.STRING)
    private AdditionCategory category;

    @Column
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="tenant_id", nullable=false)
    private Tenant tenant;

    @OneToMany(mappedBy = "addition", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TravelAddition> travelAdditionList = new ArrayList<>();

    @OneToMany(mappedBy = "addition", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<VehicleAddition> vehicleAdditionList = new ArrayList<>();

    public List<TravelAddition> getTravelAdditionList() {
        return travelAdditionList;
    }

    public void setTravelAdditionList(List<TravelAddition> travelAdditionList) {
        this.travelAdditionList = travelAdditionList;
    }

    public List<VehicleAddition> getVehicleAdditionList() {
        return vehicleAdditionList;
    }

    public void setVehicleAdditionList(List<VehicleAddition> vehicleAdditionList) {
        this.vehicleAdditionList = vehicleAdditionList;
    }

    public AdditionType getType() {
        return type;
    }

    public void setType(AdditionType type) {
        this.type = type;
    }

    public AdditionCategory getCategory() {
        return category;
    }

    public void setCategory(AdditionCategory category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

}
