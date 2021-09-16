package com.microservice.recommadationservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Recommadation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recommadationId;
    private Long productId;
    private String Author;
    private int rate;
    private String content;
}
