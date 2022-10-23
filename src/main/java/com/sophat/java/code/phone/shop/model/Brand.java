package com.sophat.java.code.phone.shop.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Brand {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)

//    To separate the sequence
    @GeneratedValue(generator = "brand_seq_generator")
    @SequenceGenerator(name = "brand_seq_generator", initialValue = 1, sequenceName = "brand_seq")
    private Integer id;
    private String name;
}
