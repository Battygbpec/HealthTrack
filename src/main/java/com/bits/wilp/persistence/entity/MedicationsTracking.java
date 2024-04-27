package com.bits.wilp.persistence.entity;

import com.bits.wilp.persistence.entity.base.AuditableEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "medication_tracking")
public class MedicationsTracking extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "patient_id", referencedColumnName = "id")
    private Users users;

    @ManyToOne
    @JoinColumn(name = "medication_id", referencedColumnName = "id")
    private Medications medications;

    private String intakeTime;
    private String lastIntakeTime;




}
