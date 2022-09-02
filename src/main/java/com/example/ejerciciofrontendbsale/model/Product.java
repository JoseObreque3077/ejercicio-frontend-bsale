package com.example.ejerciciofrontendbsale.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Entidad que representa a un determinado producto (presente en la tabla product).
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {
    // Id de tipo entero auto-incremental (corresponde a columna id de la DB)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    // Campo de texto (admite valores nulos) que se corresponde con la columna name de la DB
    @Column(name = "name")
    private String name;

    // Campo de texto (admite valores nulos) que se corresponde con la columna url_image de la DB
    @Column(name = "url_image")
    private String urlImage;

    // Campo numérico flotante (admite valores nulos) que se corresponde con la columna price de la DB
    @Column(name = "price")
    private Double price;

    // Campo numérico entero (admite valores nulos) que se corresponde con la columna discount de la DB
    @Column(name = "discount")
    private Integer discount;

    //Relación muchos a uno: Llave foránea de categoría en tabla producto (columna llamada category)
    @ManyToOne(optional = false)
    @JoinColumn(name = "category", nullable = false)
    @JsonIgnoreProperties("products")
    private Category category;

}
