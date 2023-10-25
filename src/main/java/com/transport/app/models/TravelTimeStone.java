package com.transport.app.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class TravelTimeStone extends BrokenRelationEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "travel_id", nullable = false)
    private Travel travel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "timestone_id", nullable = false)
    private TimeStone timeStone;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date startedAt;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date endedAt;

    public Travel getTravel() {
        return travel;
    }

    public void setTravel(Travel travel) {
        this.travel = travel;
    }

    public TimeStone getTimeStone() {
        return timeStone;
    }

    public void setTimeStone(TimeStone timeStone) {
        this.timeStone = timeStone;
    }

    public Date getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
    }

    public Date getEndedAt() {
        return endedAt;
    }

    public void setEndedAt(Date endedAt) {
        this.endedAt = endedAt;
    }
}
