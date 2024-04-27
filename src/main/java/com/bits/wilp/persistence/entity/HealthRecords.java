package com.bits.wilp.persistence.entity;

import com.bits.wilp.persistence.entity.base.AuditableEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "health_record")
public class HealthRecords extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pastIllnesses;
    private String surgeries;
    private String allergies;

    @ManyToOne
    @JoinColumn(name = "medications_id", referencedColumnName = "id")
    private Medications medications;

    @ManyToOne
    @JoinColumn(name = "patient_id", referencedColumnName = "id")
    private Users users;


}
