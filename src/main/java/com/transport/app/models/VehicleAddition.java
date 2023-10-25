package com.transport.app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class VehicleAddition extends ParentRelationEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="addition_id", nullable=false)
    private Addition addition;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="vehicle_id", nullable=false)
    private Vehicle vehicle;

    public Addition getAddition() {
        return addition;
    }

    public void setAddition(Addition addition) {
        this.addition = addition;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
