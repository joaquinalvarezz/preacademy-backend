package main.models;

import java.util.List;

public class Temporada {
    private int numero;
    private List<Episodio> episodios;

    public Temporada(int numero, List<Episodio> episodios) {
        this.numero = numero;
        this.episodios = episodios;
    }

    public void agregarEpisodio(Episodio episodio){
        episodios.add(episodio);
    }

    public int episodiosVistos(){
        int vistos = 0;
        for(Episodio e : episodios){
            if(e.fueVisto()){
                vistos++;
            }
        }
        return vistos;
    }

    public double getPromedio(){
        double suma = 0;
        int i = 0;
        for(Episodio e : episodios){
            if(e.fueVisto()){
                suma += e.getCalificacion();
                i++;
            }
        }
        return i > 0 ? suma / i : 0;
    }

    public List<Episodio> getEpisodios(){
        return episodios;
    }

}
