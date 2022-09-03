# Consumo de API: Desafío Técnico BSALE
## Descripción
Corresponde a la segunda parte de la prueba técnica para la
postulación como Software Developer en BSALE. La actividad consiste
en consumir la API REST desarrollada en la parte anterior del 
mismo desafío (backend).

## Resolución del problema
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

## Despliegue del proyecto
El proyecto se encuentra desplegado en [Heroku](https://bsale-store-test-frontend.herokuapp.com/).