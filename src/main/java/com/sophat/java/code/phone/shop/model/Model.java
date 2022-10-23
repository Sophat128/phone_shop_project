package com.sophat.java.code.phone.shop.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "models")
public class Model {
    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @GeneratedValue(generator = "model_seq_generator")
    @SequenceGenerator(name = "model_seq_generator", initialValue = 1, sequenceName = "model_seq")
    private Integer id;
    @Column(name = "model_name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

}
