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
@Table(name = "type_options")
@Entity
public class Type_options {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "description", length = 80, nullable = true, unique = true)
    String description;
    @Column(name = "tag_option", length = 80, nullable = true, unique = true)
    String tagoption;
}
