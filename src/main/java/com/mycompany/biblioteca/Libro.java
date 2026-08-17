/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

public class Libro extends Material {

    protected String autor;
    protected boolean disponible;

    public Libro(String codigo, String titulo, int anioPublicacion, String autor) {
        super(codigo, titulo, anioPublicacion);
        this.autor = autor;
        this.disponible = true;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + " | Titulo: " + titulo
                + " | Anio: " + anioPublicacion
                + " | Autor: " + autor
                + " | Disponible: " + (disponible ? "Si" : "No");
    }
}