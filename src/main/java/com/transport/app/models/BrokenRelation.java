package com.transport.app.models;

import com.transport.app.enums.BrokenRelationStatus;
import com.transport.app.enums.BrokenRelationType;
import jakarta.persistence.*;

import java.util.Date;

@MappedSuperclass
public class BrokenRelation{
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    @Enumerated(EnumType.STRING)
    private BrokenRelationType type;

    @Column
    private String value1;

    @Column
    private String value2;

    @Column
    private String notes;

    @Column
    @Enumerated(EnumType.STRING)
    private BrokenRelationStatus status;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date expireTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="tenant_id", nullable=false)
    private Tenant tenant;

    @Column
    private Boolean isDeleted;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedAt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BrokenRelationType getType() {
        return type;
    }

    public void setType(BrokenRelationType type) {
        this.type = type;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public BrokenRelationStatus getStatus() {
        return status;
    }

    public void setStatus(BrokenRelationStatus status) {
        this.status = status;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
