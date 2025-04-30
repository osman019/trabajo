package com.trabajo.trabajo.domain.entities;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.Setter;
import lombok.Getter;

@Data
@Getter
@Setter
@Table(name = "exams")
@Entity
public class Exams {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    
    @Temporal(TemporalType.DATE)
    private Timestamp fecha;

}
