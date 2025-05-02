package com.trabajo.trabajo.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Table(name = "subchapters")
@Entity
public class Subchapters {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "description", length = 90, nullable = true, unique = true)
    String description;

    @Column(name = "summary", length = 50, nullable = true, unique = true)
    String sumary;

       @ManyToOne
    @JoinColumn(name = "chapter_id", nullable = false)
    private Chapters chapter;
}
