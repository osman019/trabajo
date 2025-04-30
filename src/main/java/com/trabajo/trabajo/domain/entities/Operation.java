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
@Table(name = "operation")
@Entity
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "permit_all", columnDefinition = "BOOLEAN")
    private boolean permitall;

    @Column(name = "http_method",length = 255, nullable = true, unique = true)
    String httpmethod;

    @Column(name = "name",length = 255, nullable = false, unique = true)
    String name;

    @Column(name = "path",length = 255, nullable = false, unique = true)
    String path;


}
