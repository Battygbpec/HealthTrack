package com.bits.wilp.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "medications")
public class Medications {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @OneToMany(fetch = FetchType.EAGER,orphanRemoval = true, mappedBy = "medications")
    List<MedicationsTracking> medicationsTrackings;

    @OneToMany(fetch = FetchType.EAGER,orphanRemoval = true, mappedBy = "medications")
    List<HealthRecords> healthRecords;


}
