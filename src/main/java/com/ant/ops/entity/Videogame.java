package com.ant.ops.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Getter
@Setter
public class Videogame {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="software_house_id")
    @JsonManagedReference
    private SoftwareHouse softwareHouse;
}
