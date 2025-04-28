# Bienvenidos, devs backend!

# 🧠 Ejercicio Teórico - Programación Orientada a Objetos en Java

Este desafío complementa el trabajo práctico que desarrollaron anteriormente.

El objetivo es que puedas **reflexionar sobre los conceptos clave de Java y la POO**, y detectar si estás comprendiendo la forma en que se estructura un programa en este lenguaje.

A continuación, respondé estas preguntas directamente por escrito, debajo de cada punto.

---

## 🔹 Preguntas sobre Java

1. ¿Cuál es la diferencia entre una clase y un objeto en Java?
2. ¿Por qué en Java todo debe estar dentro de una clase?
3. ¿Qué significa que Java sea un lenguaje *fuertemente tipado*?
4. ¿Qué función cumple el método `main()` en una aplicación Java?
5. ¿Qué diferencias notás entre Java y otros lenguajes que hayas usado anteriormente? (por ejemplo Python, JavaScript, etc.)

---

## 🔹 Preguntas sobre Programación Orientada a Objetos (POO)

6. ¿Qué es la **encapsulación** y por qué es importante?
7. ¿Qué ventajas tiene crear métodos *getter* y *setter* en lugar de acceder directamente a los atributos?
8. ¿Qué es un **constructor** y para qué se usa?
9. ¿Podés explicar con tus palabras qué es un **método** y cómo se relaciona con los objetos?
10. ¿Cuál es el beneficio de tener más de una clase en un programa?

---

## 🔹 Ejercicio reflexivo

11. Imaginá que estás programando un videojuego. ¿Qué clases podrías crear para representar los elementos del juego?  
    ¿Qué atributos y métodos tendrían esas clases?

---

### ✅ Objetivo de estas preguntas

Estas preguntas no tienen una única respuesta correcta. Lo importante es que puedas expresarte con tus palabras, detectar lo que ya sabés y lo que no te queda claro.  
¡Si algo no lo entendés, preguntá! Así todos seguimos aprendiendo juntos 😊

--- 

## 📂 Estructura de paquetes y clases

Las clases de un proyecto pueden ser estructuradas de diferentes maneras dependiendo de varios factores, como la complejidad, 
el tipo de proyecto, la arquitectura, entre otras cosas. Los paquetes son los que nos permiten organizar las clases, agrupando aquellas 
que tengan algún vínculo entre sí. 

En este repositorio, se plantea la siguiente estructura de paquetes: `src/main/[nombre-ejercicio]`
Dentro de cada carpeta de ejercicio van a encontrar los siguientes paquetes base: 
- `model` **(lo tienen que crear ustedes)**: en este paquete se almacenan todas las clases de entidad que van a conformar el desarrollo del ejercicio.
- `service`: acá se va a encontrar la clase con el método main (punto de ejecución).
- `util` **(lo tienen que crear ustedes)**: acá pueden almacenar clases que contengan funcionalidades extra a las que ya poseen las clases de entidad.

Esta estructura de paquetes es una propuesta. En caso de no utilizar alguno de los paquetes sugeridos, pueden borrarlo (el util, por ejemplo), 
como así también pueden agregar algún otro paquete que consideren necesario, siempre y cuando sea coherente (es decir, que aporte a la organización 
y entendimiento). 
