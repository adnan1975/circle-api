package com.radiusplay.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;


@Entity
@Table(name = "circles")
public class Circle extends AuditModel{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @NotNull
    @Size(max = 250)
    @Column(unique = true)
    private String name;

    @Transient
    private List<Member> members;

    @Column
    private Long maintainer;
}
