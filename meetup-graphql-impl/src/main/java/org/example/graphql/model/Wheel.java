package org.example.graphql.model;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Data
@Entity
@Accessors(chain = true)
public class Wheel {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "for_winter")
    private boolean isForWinter;

    @Column(name = "maker")
    private String maker;

    @ManyToOne
    @JoinColumn(name = "vehicle_id", updatable = false)
    private Vehicle vehicle;

}
