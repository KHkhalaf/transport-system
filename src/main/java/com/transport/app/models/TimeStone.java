package com.transport.app.models;

import com.transport.app.enums.TimeStoneCategory;
import com.transport.app.enums.TimeStoneStatus;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class TimeStone extends ParentEntity{

    @Column
    private String key;

    @Column
    @Enumerated(EnumType.STRING)
    private TimeStoneCategory category;

    @Column
    @Enumerated(EnumType.STRING)
    private TimeStoneStatus status;

    @OneToMany(mappedBy = "timeStone", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TravelTimeStone> travelTimeStones = new ArrayList<>();

    public List<TravelTimeStone> getTravelTimeStones() {
        return travelTimeStones;
    }

    public void setTravelTimeStones(List<TravelTimeStone> travelTimeStones) {
        this.travelTimeStones = travelTimeStones;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public TimeStoneCategory getCategory() {
        return category;
    }

    public void setCategory(TimeStoneCategory category) {
        this.category = category;
    }

    public TimeStoneStatus getStatus() {
        return status;
    }

    public void setStatus(TimeStoneStatus status) {
        this.status = status;
    }
}
