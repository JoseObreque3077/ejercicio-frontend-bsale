package com.example.ejerciciofrontendbsale.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Entidad que representa a un determinado producto (presente en la tabla product).
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {

    private int id;

    private String name;

    private String urlImage;

    private Double price;

    private Integer discount;

}
