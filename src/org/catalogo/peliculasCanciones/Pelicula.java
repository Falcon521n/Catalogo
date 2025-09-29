package org.catalogo.peliculasCanciones;

import java.util.ArrayList;

public class Pelicula{
    private int id;
    private String nombre;
    private String año;
    private String calificacion;
    private String notas;


    public Pelicula(int id, String nombre, String año, String calificacion, String notas){
        this.id=id;
        this.nombre=nombre;
        this.año=año;
        this.calificacion=calificacion;
        this.notas=notas;
    }

    public int getid(){
        return id;
    }

    public void setid(int id){
        this.id=id;
    }

    public String getnombre(){
        return nombre;
    }

    public void setnombre(String nombre){
        this.nombre=nombre;
    }

    public String getaño(){
        return año;
    }

    public String setaño(String año){
        this.año=año;
    }

    public String getcalificacion(){
        return calificacion;
    }

    public String setcalificacion(String calificacion){
        this.calificacion=calificacion;
    }

    public String getnotas(){
        return notas;
    }

    public String setnotas(String notas){
        this.notas=notas;
    }

    private ArrayList<Pelicula> ListaPelicula;

    public Pelicula(){
        ListaPelicula= new ArrayList<>();
    }

    public void agrearPelicula(pelicula c){
        ListaPelicula.add(c);
    }

    public void agrearPelicula(pelicula c){
        ListaPelicula.remove(c);
    }

    public void buscarpelicula(String nombre){
        for (Pelicula c: ListaPelicula) {
            if(solicitudP == nombre){

            }
        }
    }

}