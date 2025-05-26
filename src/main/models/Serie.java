package main.models;

import java.util.ArrayList;
import java.util.List;

public class Serie {

    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;
    private List<Temporada> temporadas;

    public Serie(String titulo, String descripcion, String creador, String genero) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
        this.temporadas = new ArrayList<>();
    }

    public void agregarTemporada(Temporada temporada){
        this.temporadas.add(temporada);
    }

    public int episodiosVistos(){
        int vistos = 0;
        for (Temporada t : temporadas){
            vistos += t.episodiosVistos();
        }
        return vistos;
    }

    public double getPromedio(){
        double suma = 0;
        int i  = 0;
        for (Temporada t : temporadas){
            for (Episodio e : t.getEpisodios()){
                if(e.fueVisto()){
                    suma += e.getCalificacion();
                    i++;
                }
            }
        }
        return i > 0 ? suma / i : 0;
    }

    public boolean vioTodo(){
        for (Temporada t : temporadas){
            for (Episodio e : t.getEpisodios()){
                if(!e.fueVisto()) {
                    return false;
                }
            }
        }
        return true;
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

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
