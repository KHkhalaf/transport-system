package com.transport.app.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class User extends ParentEntity{
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Request> requests = new ArrayList<>();

    public List<Request> getRequests() {
        return requests;
    }

    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }
}
