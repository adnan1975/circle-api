package com.radiusplay.model;

import javax.persistence.*;

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
    private java.time.LocalDateTime memberSince;

    @Enumerated(EnumType.STRING)
    private Enum<Rank> rank;
}
