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
@Table(name = "road_paths")
@Entity
public class Road_paths {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "isactive", columnDefinition = "BOOLEAN")
    private boolean isactive;

    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date created_at;

    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date updated_at;

    @Column(name = "image_path", length = 80, nullable = true, unique = true)
    String image_path;

    @Column(name = "path_name", length = 80, nullable = true, unique = true)
    String pathname;

    @Column(name = "description", length = 80, nullable = true, unique = true)
    String description;

}
