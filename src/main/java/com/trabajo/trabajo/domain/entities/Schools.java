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
@Table(name = "schools")
@Entity
public class Schools {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date created_at;

    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date updated_at;

     @Column(name = "description_school", length = 50, nullable = true, unique = true)
     String descriptionschool;

     @Column(name = "headmaster_school", length = 50, nullable = true, unique = true)
     String headmasterschool;

     @Column(name = "celphone_school", length = 80, nullable = true, unique = true)
     String celphoneschool;

     @Column(name = "email_school", length = 80, nullable = true, unique = true)
     String emailschool;


}
