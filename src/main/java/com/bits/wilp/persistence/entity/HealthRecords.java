package com.bits.wilp.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class HealthRecords {
    @Id
    private Long id;
}
