/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca;

/**
 *
 * @author Edward
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Cliente> clientes = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Aqui pondre el menu (Fase 8)
    }

    static void crearCliente() {
        System.out.print("ID: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Telefono: ");
        String telefono = sc.nextLine();

        clientes.add(new Cliente(id, nombre, telefono));
        System.out.println("Cliente creado correctamente.");
    }
    
    static void listarClientes() {
        System.out.println("--- CLIENTES ---");
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
            return;
        }
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }

    static Cliente buscarClientePorId(int id) {
        for (Cliente c : clientes) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    static void buscarCliente() {
        System.out.print("ID a buscar: ");
        int id = Integer.parseInt(sc.nextLine());

        Cliente c = buscarClientePorId(id);
        if (c == null) {
            System.out.println("Cliente no encontrado.");
        } else {
            System.out.println(c);
        }
    }
    
    static void actualizarCliente() {
        System.out.print("ID del cliente a actualizar: ");
        int id = Integer.parseInt(sc.nextLine());

        Cliente c = buscarClientePorId(id);
        if (c == null) {
            System.out.println("Cliente no encontrado.");
            return;
        }

        System.out.print("Nuevo nombre: ");
        String nuevoNombre = sc.nextLine();

        System.out.print("Nuevo telefono: ");
        String nuevoTelefono = sc.nextLine();

        c.setNombre(nuevoNombre);
        c.setTelefono(nuevoTelefono);
        System.out.println("Cliente actualizado correctamente.");
    }
}