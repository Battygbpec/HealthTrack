package com.bits.wilp.persistence.entity;

import com.bits.wilp.enums.UserTypes;
import com.bits.wilp.persistence.entity.base.AuditableEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "users")
public class Users extends AuditableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String userEmail;
    private String userPassword;
    @Enumerated(EnumType.STRING)
    private UserTypes userType;
    @OneToMany(fetch = FetchType.EAGER, orphanRemoval = true, mappedBy = "users")
    List<Appointments> appointments;
    @OneToMany(fetch = FetchType.EAGER, orphanRemoval = true, mappedBy = "staff")
    List<Appointments> appointmentsOfStaff;

    @OneToMany(fetch = FetchType.EAGER, orphanRemoval = true, mappedBy = "users")
    List<MedicationsTracking> medicationsTrackings;

    @OneToMany(fetch = FetchType.EAGER, orphanRemoval = true, mappedBy = "users")
    List<HealthMetrics> healthMetrics;

    @OneToMany(fetch = FetchType.EAGER, orphanRemoval = true, mappedBy = "users")
    List<HealthRecords> healthRecords;



}
