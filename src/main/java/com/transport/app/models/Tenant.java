package com.transport.app.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Tenant extends ParentEntity{




    @OneToMany(mappedBy="tanent", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Travel> travels = new ArrayList<>();
}
