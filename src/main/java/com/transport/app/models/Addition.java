package com.transport.app.models;

import com.transport.app.enums.AdditionCategory;
import com.transport.app.enums.AdditionType;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Addition extends ParentEntity{

    @Column
    @Enumerated(EnumType.STRING)
    private AdditionType type;

    @Column
    @Enumerated(EnumType.STRING)
    private AdditionCategory category;

    @Column
    private String name;

    @Column
    private String notes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="tenant_id", nullable=false)
    private Tenant tenant;


    public AdditionType getType() {
        return type;
    }

    public void setType(AdditionType type) {
        this.type = type;
    }

    public AdditionCategory getCategory() {
        return category;
    }

    public void setCategory(AdditionCategory category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

}
