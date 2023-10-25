package com.transport.app.models;

import jakarta.persistence.*;

@Entity
public class Ticket extends ParentEntity{

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reservation_id", nullable = false)
    private Reservation reservation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "travel_seat_id", nullable = false)
    private TravelSeat travelSeat;

    @Column
    private Long number;

    @Column
    private String code;

    @Column Long cost;

    @Column
    private Long tax;

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public TravelSeat getTravelSeat() {
        return travelSeat;
    }

    public void setTravelSeat(TravelSeat travelSeat) {
        this.travelSeat = travelSeat;
    }

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
}
