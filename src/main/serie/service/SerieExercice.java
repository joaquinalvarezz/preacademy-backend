package main.serie.service;

import main.models.Episodio;
import main.models.Serie;
import main.models.Temporada;

import java.util.Arrays;

public class SerieExercice {
    public static void main(String[] args) {

        // ¡Ejercicio: ¡Sistema de Series!
        // En este ejercicio vas a modelar una serie compuesta por temporadas y episodios.
        // Vas a practicar composición, encapsulamiento, control de lógica y validaciones.

        // CONSIGNA 1:
        // Crear las clases necesarias para representar:
        // - Una Serie
        // - Varias Temporadas
        // - Episodios dentro de cada Temporada

        // CONSIGNA 2:
        // Un Episodio debe tener:
        // - un título
        // - una descripción
        // - un indicador de si fue visto o no
        // - una calificación dada por el usuario
        //   (si no fue visto, debe tener un valor negativo por defecto)

        // CONSIGNA 3:
        // Una Serie debe tener:
        // - un título
        // - una descripción
        // - un creador
        // - un género
        // - una lista de temporadas, cada una con sus episodios

        // CONSIGNA 4:
        // Implementar un método que permita ingresar una calificación a un episodio.
        // Si la calificación no es válida, mostrar un mensaje y no modificar el valor anterior.

        // CONSIGNA 5:
        // Implementar un método que devuelva el total de episodios vistos en una temporada.

        // CONSIGNA 6:
        // Implementar un método que devuelva el total de episodios vistos en toda la serie.

        // CONSIGNA 7:
        // Implementar un método que calcule el promedio de calificaciones en una temporada.
        // Solo se deben tener en cuenta los episodios que hayan sido vistos.

        // CONSIGNA 8:
        // Implementar un método que calcule el promedio de calificaciones en toda la serie.
        // Solo se deben tener en cuenta los episodios que hayan sido vistos.

        // CONSIGNA 9:
        // Implementar un método que determine si el usuario vio todos los episodios de la serie.

        // CONSIGNA 10:
        // Crear al menos una serie con dos temporadas y varios episodios, probando todas las funcionalidades.
        // Mostrar los resultados por consola.

        // ¡A programar!

        Episodio ep1 = new Episodio("El chico callado", "Yeon Si-eun sorprende con su inteligencia.");
        Episodio ep2 = new Episodio("Golpe preventivo", "El acoso escala y Si-eun responde.");
        Episodio ep3 = new Episodio("Nuevos aliados", "Aparecen Su-ho y Beom-seok.");
        Episodio ep4 = new Episodio("El enemigo invisible", "Las verdaderas amenazas se revelan.");

        Temporada temporada1 = new Temporada(1, Arrays.asList(ep1, ep2, ep3, ep4));

        // Crear episodios de la Temporada 2
        Episodio ep5 = new Episodio("La transferencia", "Si-eun llega a una nueva escuela.");
        Episodio ep6 = new Episodio("La Unión", "Una pandilla domina el colegio.");
        Episodio ep7 = new Episodio("Enfrentamiento", "La violencia vuelve a explotar.");

        Temporada temporada2 = new Temporada(2, Arrays.asList(ep5, ep6, ep7));

        // Crear la serie
        Serie heroeDebil = new Serie(
                "Un Héroe Débil",
                "Un estudiante brillante usa su mente para enfrentar el bullying.",
                "Seopass",
                "Drama / Acción"
        );

        ep1.agregarCalificacion(5);
        ep2.agregarCalificacion(9);
        ep3.agregarCalificacion(7);
        ep4.agregarCalificacion(9);
        ep5.agregarCalificacion(4);
        ep6.agregarCalificacion(10);
        ep7.agregarCalificacion(9);


        heroeDebil.agregarTemporada(temporada1);
        heroeDebil.agregarTemporada(temporada2);

        // Mostrar datos
        System.out.println("== SERIE: " + heroeDebil.getTitulo() + " ==");
        System.out.println("Creador: " + heroeDebil.getCreador());
        System.out.println("Género: " + heroeDebil.getGenero());
        System.out.println("Descripción: " + heroeDebil.getDescripcion());

        System.out.println("\nEpisodios vistos en T1: " + temporada1.episodiosVistos());
        System.out.println("Episodios vistos en T2: " + temporada2.episodiosVistos());
        System.out.println("Total episodios vistos en serie: " + heroeDebil.episodiosVistos());

        System.out.println("\nPromedio T1: " + temporada1.getPromedio());
        System.out.println("Promedio T2: " + temporada2.getPromedio());
        System.out.println("Promedio general: " + heroeDebil.getPromedio());

        System.out.println("\n¿Se vio toda la serie?: " + (heroeDebil.vioTodo() ? "Sí" : "No"));
    }
}

