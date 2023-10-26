package com.transport.app.models;

import com.transport.app.enums.SeatStatus;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Seat extends ParentEntity{

    @Column
    private Long seatNumber;

    @Column
    private String seatClass;

    @Column
    private Long seatColumn;

    @Column
    private Long seatLevel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tenant_id", nullable = false)
    private Tenant tenant;

//    @OneToMany(mappedBy = "seat", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<TravelSeat> travelSeats = new ArrayList<>();

    @Column
    @Enumerated(EnumType.STRING)
    private SeatStatus status;

    public Long getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Long seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getSeatClass() {
        return seatClass;
    }

    public void setSeatClass(String seatClass) {
        this.seatClass = seatClass;
    }

    public Long getSeatColumn() {
        return seatColumn;
    }

    public void setSeatColumn(Long column) {
        this.seatColumn = column;
    }

    public Long getSeatLevel() {
        return seatLevel;
    }

    public void setSeatLevel(Long level) {
        this.seatLevel = level;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public SeatStatus getStatus() {
        return status;
    }

    public void setStatus(SeatStatus status) {
        this.status = status;
    }
}
