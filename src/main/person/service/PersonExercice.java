package main.person.service;

import main.models.PersonaDos;

import java.time.LocalDate;

public class PersonExercice {
    public static void main(String[] args) {

        // Welcome!
        // En este ejercicio van a trabajar con constructores, atributos por defecto,
        // lógica de validación y cálculo, y encapsulamiento.

        // CONSIGNA 1:
        // Crear una clase llamada "Persona" fuera de esta clase.

        // CONSIGNA 2:
        // La clase debe tener los siguientes atributos privados:
        // - nombre
        // - edad
        // - fechaNacimiento
        // - dni
        // - sexo
        // - peso
        // - altura

        // CONSIGNA 3:
        // Declarar los siguientes valores por defecto para cada atributo:
        // - nombre = "N"
        // - sexo = "F"
        // - fechaNacimiento = 1 de enero de 2000
        // - peso = 1
        // - altura = 1
        // - dni no tiene valor por defecto (es obligatorio)

        // CONSIGNA 4:
        // Crear diferentes constructores para la clase:
        // - Constructor con solo DNI (usa todos los valores por defecto)
        // - Constructor con DNI, nombre y apellido
        // - Constructor con DNI, nombre, apellido y fecha de nacimiento

        // CONSIGNA 5:
        // Agregar los métodos set para cada atributo, excepto el DNI.

        // CONSIGNA 6:
        // Agregar método que retorne el índice de masa corporal (peso en kg / altura en m^2)

        // CONSIGNA 7:
        // Agregar método que devuelva true si el IMC está entre 18.5 y 25 inclusive (la persona esta en forma).

        // CONSIGNA 8:
        // Agregar método que indique si es el día de cumpleaños de la persona:
        // Retorna true si hoy es el día y mes de su cumpleaños.

        // CONSIGNA 9:
        // Agregar método que indique si la persona es mayor de edad (retorna true si tiene más de 18 años).

        // CONSIGNA 10:
        // Agregar método que indique si la persona puede votar (retorna true si tiene 16 años o más).

        // CONSIGNA 11:
        // Agregar método que indique si la relación entre la edad de la persona y la fecha de nacimiento es coherente:
        // Compara la edad con la fecha de nacimiento para verificar si coinciden.

        // CONSIGNA 12:
        // Agregar método para mostrar un resumen de la información de la persona en formato String

        // CONSIGNA 13:
        // Crear al menos 3 objetos Persona con distintos constructores desde este método main.
        // Llamar y probar todos los métodos de instancia desde aquí.

        // ¡A programar!

        PersonaDos p1 = new PersonaDos("123456789");
        PersonaDos p2 = new PersonaDos("Pedro","987654312");
        PersonaDos p3 = new PersonaDos("Juan", LocalDate.of(2020,5,7),"569874123");

        p1.setPeso(90.5);
        p1.setAltura(1.70);
        p2.setPeso(70);
        p2.setAltura(1.75);
        p3.setPeso(50);
        p3.setAltura(1.80);
        p1.setSexo("F");
        p2.setSexo("M");
        p3.setSexo("M");

        PersonaDos[] personas = {p1,p2,p3};

        for (PersonaDos p : personas){
            System.out.println("==== RESUMEN ====");
            System.out.println(p.toString());
            System.out.println("Está en forma: " + p.estaEnForma());
            System.out.println("Es su cumpleaños hoy: " + p.esCumpleHoy());
            System.out.println("Es mayor de edad: " + p.esMayordeEdad());
            System.out.println("Puede votar: " + p.puedeVotar());
            System.out.println();
        }

    }
}

