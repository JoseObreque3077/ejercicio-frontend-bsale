package com.example.ejerciciofrontendbsale.restTemplate;

import com.example.ejerciciofrontendbsale.model.Category;
import com.example.ejerciciofrontendbsale.model.Product;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Clase que permite interactuar con una API REST desde el lado del cliente en un sitio web.
 */
public class RestTemplateProvider {

    /**
     * Método que obtiene la lista completa de categorías de productos disponibles, desde una API REST.
     * @return Lista con registros de categorías disponibles.
     */
    public List<Category> categoriasDesdeApi() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> request = new HttpEntity<>(headers);
        String url = "https://bsale-store-test-backend.herokuapp.com/api/categorias/todas";
        ResponseEntity<List<Category>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                request,
                new ParameterizedTypeReference<>() {}
        );
        return response.getBody();
    }

    /**
     * Método que obtiene la lista completa de productos a la venta, desde una API REST.
     * @return Lista con registros de productos disponibles.
     */
    public List<Product> productosDesdeApi() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> request = new HttpEntity<>(headers);
        String url = "https://bsale-store-test-backend.herokuapp.com/api/productos/todos";
        ResponseEntity<List<Product>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                request,
                new ParameterizedTypeReference<>() {}
        );
        return response.getBody();
    }

    /**
     * Método que obtiene una lista de productos disponibles, filtrada por categoría, desde una API REST.
     * @param id Identificador único de la categoría.
     * @return Lista con registros de productos por categoría seleccionada.
     */
    public List<Product> productosPorCategoriaDesdeApi(int id) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> request = new HttpEntity<>(headers);
        String url = "https://bsale-store-test-backend.herokuapp.com/api/productos/categoria/" + id;
        ResponseEntity<List<Product>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                request,
                new ParameterizedTypeReference<>() {}
        );
        return response.getBody();
    }

    /**
     * Método que obtiene una lista de productos disponibles, filtrada por nombre o parte de su nombre, desde
     * una API REST.
     * @param textoBusqueda Nombre (o una parte del mismo) de un producto.
     * @return Lista con registros de productos que coinciden con el criterio de búsqueda.
     */
    public List<Product> productosPorNombreDesdeApi(String textoBusqueda) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> request = new HttpEntity<>(headers);
        String url = "https://bsale-store-test-backend.herokuapp.com/api/productos/" + textoBusqueda;
        ResponseEntity<List<Product>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                request,
                new ParameterizedTypeReference<>() {}
        );
        return response.getBody();
    }
}
