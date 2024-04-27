package com.bits.wilp.persistence.entity;

import com.bits.wilp.persistence.entity.base.AuditableEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "appointments")
public class Appointments extends AuditableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String appointmentTime;
    private String appointmentDate;
    private String reason;
    private String status;
    @ManyToOne
    @JoinColumn(name = "patient_id", referencedColumnName = "id")
    private Users users;

    @ManyToOne
    @JoinColumn(name = "doctor_id", referencedColumnName = "id")
    private Users staff;


}
