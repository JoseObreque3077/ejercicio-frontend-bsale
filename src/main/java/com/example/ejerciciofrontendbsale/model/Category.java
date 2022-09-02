package com.example.ejerciciofrontendbsale.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * Entidad que representa a una categoría (presente en la tabla category) de un determinado producto.
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Category {
    // Id de tipo entero auto-incremental (corresponde a columna id de la DB)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    // Campo de texto (admite valores nulos) que se corresponde con la columna name de la DB
    @Column(name = "name")
    private String name;

    // Relación uno a muchos entre la tabla categoría y la tabla productos
    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private List<Product> products;

}
