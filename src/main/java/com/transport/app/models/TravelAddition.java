package com.transport.app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class TravelAddition extends BrokenRelation{

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="travel_id", nullable=false)
    private Travel travel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="addition_id", nullable=false)
    private Addition addition;

    public Travel getTravel() {
        return travel;
    }

    public void setTravel(Travel travel) {
        this.travel = travel;
    }

    public Addition getAddition() {
        return addition;
    }

    public void setAddition(Addition addition) {
        this.addition = addition;
    }
}
