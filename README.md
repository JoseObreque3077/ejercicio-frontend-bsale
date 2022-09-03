# Consumo de API: Desafío Técnico BSALE

## Descripción
El ejercicio corresponde a la segunda parte del desafío técnico de postulación a la oferta laboral de Software Developer en BSALE. Se solicita el consumo de una API REST para una tienda online, para la creación de un sitio web para una tienda online, tomando los siguientes puntos en consideración:

* Se deben poder mostrar los productos de acuerdo a la categoría a la cual pertenecen.
* Se debe implementar un buscador de productos.
* Se pueden implementar filtros por atributo, ordenar productos y paginación de forma opcional.

## Desarrollo de la Aplicación
En este caso, se optó por la implementación de la página web utilizando HTML, CSS y Thymeleaf
(como motor de plantillas). El controlador de las vistas fue implementado
mediante Spring Framework y Java 11. 

Algunas de las características de la página web son las siguientes:
* Cada producto es presentado en una tarjeta que contiene:
  * Imagen del producto.
  * Nombre del producto.
  * Precio normal.
  * Precio de oferta (solo si aplica, se calcula automáticamente).
  * Botón de "comprar" (por el momento solo tiene utilidad decorativa).
* Se cuenta con una barra de navegación que permite desplazarse entre la página de inicio y
las páginas de las distintas categorías disponibles.
* Se cuenta con una barra de búsqueda la cual permite filtrar productos, buscando por nombre
o por parte de este.
* La página de inicio muestra todos los productos disponibles.

## Despliegue de la Implementación
El código de la aplicación resultante se encuentra alojado en un repositorio público en la plataforma [Github](https://github.com/JoseObreque3077/ejercicio-frontend-bsale). El proyecto se encuentra desplegado en [Heroku](https://bsale-store-test-frontend.herokuapp.com/).
