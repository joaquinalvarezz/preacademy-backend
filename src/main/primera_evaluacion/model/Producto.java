package main.primera_evaluacion.model;

import java.util.Objects;

public class Producto implements Comparable<Producto> {

    private int id;
    private String nombre;
    private double precio;
    private String categoria;

    public Producto() {
    }

    public Producto(int id, String nombre, double precio, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public static class Builder{
        private final Producto producto;

        public Builder(){
            producto = new Producto();
        }

        public Builder id(int id){
            producto.setId(id);
            return this;
        }

        public Builder nombre(String nombre){
            producto.setNombre(nombre);
            return this;
        }

        public Builder precio(double precio){
            producto.setPrecio(precio);
            return this;
        }

        public Builder categoria(String categoria){
            producto.setCategoria(categoria);
            return this;
        }

        public Producto build(){
            return producto;
        }

    }

    public int compareTo(Producto otro){
        return Double.compare(this.precio, otro.precio);
    }


    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", categoria='" + categoria + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return id == producto.id && Double.compare(precio, producto.precio) == 0 && Objects.equals(nombre, producto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, precio);
    }
}
