package com.fseg.management.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class React {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userId;


    private boolean reaction;

}
