package org.example.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "planet")
public class Planet {

    @Id
    private String id;

    @Column(length = 500)
    private String name;
}
