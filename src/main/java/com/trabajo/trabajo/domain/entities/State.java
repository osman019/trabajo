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
@Table(name = "states")
@Entity
public class State {
 @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "name_state",length = 50, nullable = false, unique = true)
    String nameState;

}

// @Column(name = "created_at")
// private LocalDateTime createdAt;
// @Column(name = "updated_at")
// private LocalDateTime updatedAt;

// @Column(columnDefinition="DATE")
// LocalDate datePresentation;