/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

import java.time.LocalDate;

public class Prestamo {

    protected String idPrestamo;
    protected Cliente cliente;
    protected Libro libro;
    protected LocalDate fecha;
    protected String estado;

    public Prestamo(String idPrestamo, Cliente cliente, Libro libro, LocalDate fecha) {
        this.idPrestamo = idPrestamo;
        this.cliente = cliente;
        this.libro = libro;
        this.fecha = fecha;
        this.estado = "ACTIVO";
    }

    public String getIdPrestamo() {
        return idPrestamo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Libro getLibro() {
        return libro;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Prestamo: " + idPrestamo
                + " | Cliente: " + cliente.getNombre()
                + " | Libro: " + libro.getTitulo()
                + " | Fecha: " + fecha
                + " | Estado: " + estado;
    }
}