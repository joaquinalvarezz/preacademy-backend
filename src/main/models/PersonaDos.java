package main.models;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class PersonaDos {

    private String nombre;
    private int edad;
    private LocalDate fechaNacimiento;
    private String dni;
    private String sexo;
    private double peso;
    private double altura;

    public PersonaDos(String dni) {
        this.nombre = "N";
        this.fechaNacimiento = LocalDate.of(2000,1,1);
        this.edad = calcularEdad();
        this.dni = dni;
        this.sexo = "F";
        this.peso = 1;
        this.altura = 1;
    }

    public PersonaDos(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = LocalDate.of(2000,1,1);
        this.edad = calcularEdad();
        this.sexo = "F";
        this.peso = 1;
        this.altura = 1;
    }

    public PersonaDos(String nombre, LocalDate fechaNacimiento, String dni) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.edad = calcularEdad();
        this.sexo = "F";
        this.peso = 1;
        this.altura = 1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularEdad(){
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public double getIMC(){
        return peso / (altura * altura);
    }

    public boolean estaEnForma(){
        double imc = getIMC();
        return imc >= 18.5 && imc <= 25;
    }

    public boolean esCumpleHoy(){
        LocalDate hoy = LocalDate.now();
        return hoy.getDayOfMonth() == fechaNacimiento.getDayOfMonth()
                && hoy.getMonthValue() == fechaNacimiento.getMonthValue();
    }

    public boolean esMayordeEdad(){
        return edad >= 18;
    }

    public boolean puedeVotar(){
        return edad >= 16;
    }

    @Override
    public String toString() {
        return "PersonaDos{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", fechaNacimiento=" + fechaNacimiento +
                ", dni='" + dni + '\'' +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
