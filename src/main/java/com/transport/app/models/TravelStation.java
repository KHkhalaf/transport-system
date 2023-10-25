package com.transport.app.models;

import jakarta.persistence.*;

import java.util.Date;

public class TravelStation extends BrokenRelation{
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="station_id", nullable=false)
    private Station station;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="travel_id", nullable=false)
    private Travel travel;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date time1At;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date time2At;

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public Travel getTravel() {
        return travel;
    }

    public void setTravel(Travel travel) {
        this.travel = travel;
    }

    public Date getTime1At() {
        return time1At;
    }

    public void setTime1At(Date time1At) {
        this.time1At = time1At;
    }

    public Date getTime2At() {
        return time2At;
    }

    public void setTime2At(Date time2At) {
        this.time2At = time2At;
    }
}
