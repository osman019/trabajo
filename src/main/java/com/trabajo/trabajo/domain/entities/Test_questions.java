package com.trabajo.trabajo.domain.entities;

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
@Table(name = "test_questions")
@Entity
public class Test_questions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

}
