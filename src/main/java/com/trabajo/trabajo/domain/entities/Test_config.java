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
@Table(name = "test_config")
@Entity
public class Test_config {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "score", columnDefinition = "INTEGER")
    int score;

    @Column(name = "description", length = 90, nullable = true, unique = true)
    String description;

    @Column(name = "test_summary", length = 50, nullable = false, unique = true)
    String testsumary;

}
