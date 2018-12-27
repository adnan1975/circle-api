package com.radiusplay.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "organizations")

public class Organization  extends AuditModel{

    @NotNull
    @Size(max = 250)
    @Column(unique = true)
    private String name;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date registeredOn;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Transient
    private java.util.List<User> users;
    @Transient
    private java.util.List<Circle> circles;


}
