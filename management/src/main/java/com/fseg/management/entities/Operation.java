package com.fseg.management.entities;

import com.fseg.management.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    private Status status;

    private String topic;

    private String userId;

    @OneToMany(cascade = {CascadeType.PERSIST , CascadeType.REMOVE}, orphanRemoval = true)
    private List<React> react ;

    @OneToMany(cascade = {CascadeType.PERSIST , CascadeType.REMOVE} , orphanRemoval = true)
    private List<Image> images;


}
