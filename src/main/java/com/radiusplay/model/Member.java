package com.radiusplay.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "members")

public class Member  extends AuditModel{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @OneToOne
    private User user;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date memberSince;

    @Enumerated(EnumType.STRING)
    private Enum<Rank> rank;
}
