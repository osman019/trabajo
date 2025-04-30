package com.trabajo.trabajo.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Table(name = "chapters")
@Entity
public class Chapters {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

     @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date created_at;

    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date updated_at;

    @Column(name = "description", length = 80, nullable = true, unique = true)
    String description;

    @Column(name = "chapter_summary", columnDefinition = "TEXT")
    String chaptersummary;

}
