package com.transport.app.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class VehicleStation extends BrokenRelation{
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="station_id", nullable=false)
    private Station station;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="vehicle_id", nullable=false)
    private Vehicle vehicle;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date arrivedAt;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date leftAt;

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getArrivedAt() {
        return arrivedAt;
    }

    public void setArrivedAt(Date arrivedAt) {
        this.arrivedAt = arrivedAt;
    }

    public Date getLeftAt() {
        return leftAt;
    }

    public void setLeftAt(Date leftAt) {
        this.leftAt = leftAt;
    }
}
