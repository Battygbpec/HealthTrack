package com.bits.wilp.persistence.entity;

import com.bits.wilp.persistence.entity.base.AuditableEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "health_metrics")
public class HealthMetrics extends AuditableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String glucoseLevel;
    private String bloodPressure;
    private String weight;

    @ManyToOne
    @JoinColumn(name = "patient_id", referencedColumnName = "id")
    private Users users;


}
