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
@Table(name = "user")
@Entity
public class User {

      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;


      @Column(name = "name",length = 255, nullable = false, unique = true)
      String name;
      
      @Column(name = "password",length = 255, nullable = false, unique = true)
      String password;

      @Column(name = "user_name",length = 255, nullable = false, unique = true)
      String username;
}
