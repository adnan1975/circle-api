package com.radiusplay.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "circles")


public class User  extends AuditModel{

    @NotNull
    @Size(max = 250)
    @Column
    private String firstName;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(max = 250)
    @Column
    private String lastName;
}
