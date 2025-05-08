package main.models;

public class Episodio {

    private String titulo;
    private String descripcion;
    private boolean visto;
    private double calificacion;

    public Episodio(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.visto = false;
        this.calificacion = -1;
    }

    public void agregarCalificacion(double calificacion){
        if(calificacion >= 0 && calificacion <= 10){
            this.calificacion = calificacion;
            this.visto = true;
        }else {
            System.out.println("La calificacion debe ser entre 0 y 10");
        }
    }

    public boolean fueVisto(){
        return visto;
    }

    public double getCalificacion(){
        return calificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
