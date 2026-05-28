package com.example.quizadaptadores.Clases;

public class Jugador {
    private String imagen;
    private String nombre;
    private String edad;
    private String equipo;
    private String posicion;

    public Jugador(String imagen, String nombre, String edad, String equipo, String posicion) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.edad = edad;
        this.equipo = equipo;
        this.posicion = posicion;
    }

    public String getImagen() {
        return imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public String getEquipo() {
        return equipo;
    }

    public String getPosicion() {
        return posicion;
    }
}
