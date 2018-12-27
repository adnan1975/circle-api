package com.radiusplay.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Organization  extends AuditModel{

    @NotNull
    @Size(max = 250)
    @Column(unique = true)
    private String name;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private java.time.LocalDateTime registeredOn;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private java.util.List<User> users;
    private java.util.List<Circle> circles;


}