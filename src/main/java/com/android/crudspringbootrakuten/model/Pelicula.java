package com.android.crudspringbootrakuten.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pelicula")
public class Pelicula {

    @Id
    @Column(name = "ID_Pelicula")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Titulo")
    private String titulo;
    @Column(name = "Precio")
    private double precio;
    @Column(name = "Duracion")
    private int duracion;
    @Column(name = "Trailer")
    private String trailer;
    @Column(name = "Sinopsis")
    private String sinopsis;
    @Column(name = "N_Votos")
    private int votos;
    @Column(name = "S_Puntuacion")
    private int puntuacion;
    @Column(name = "Fecha_Estreno")
    private String estreno;
    @Column(name = "URL")
    private String url;

    public Pelicula() {}

    public Pelicula(int id, String titulo, double precio, int duracion, String trailer, String sinopsis, int votos, int puntuacion, String estreno, String url) {
        this.id = id;
        this.titulo = titulo;
        this.precio = precio;
        this.duracion = duracion;
        this.trailer = trailer;
        this.sinopsis = sinopsis;
        this.votos = votos;
        this.puntuacion = puntuacion;
        this.estreno = estreno;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getEstreno() {
        return estreno;
    }

    public void setEstreno(String estreno) {
        this.estreno = estreno;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
