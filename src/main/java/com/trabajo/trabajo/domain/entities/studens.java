package com.trabajo.trabajo.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Table(name = "students")
@Entity
public class studens {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "firstname", length = 50, nullable = false, unique = true)
    String nameState;

    @Column(name = "lastname", length = 50, nullable = false, unique = true)
    String abbreviation;

    @Column(name = "age", columnDefinition = "INTEGER")
    int age;

    @Column(name = "celphone", length = 30, nullable = true, unique = true)
    String celphone;

    @Column(name = "email", length = 50, nullable = true, unique = true)
    String email;
}
