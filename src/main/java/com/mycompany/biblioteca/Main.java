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
import java.time.LocalDate;

public class Main {
    static ArrayList<Cliente> clientes = new ArrayList<>();
        static ArrayList<Libro> libros = new ArrayList<>();
            static ArrayList<Prestamo> prestamos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

       public static void main(String[] args) {
        int opcion;

        do {
            System.out.println();
            System.out.println("===== SISTEMA DE BIBLIOTECA =====");
            System.out.println("1. Crear cliente");
            System.out.println("2. Listar clientes");
            System.out.println("3. Buscar cliente");
            System.out.println("4. Actualizar cliente");
            System.out.println("5. Eliminar cliente");
            System.out.println("6. Crear libro");
            System.out.println("7. Listar libros");
            System.out.println("8. Buscar libro");
            System.out.println("9. Actualizar libro");
            System.out.println("10. Eliminar libro");
            System.out.println("11. Registrar prestamo");
            System.out.println("12. Registrar devolucion");
            System.out.println("13. Listar prestamos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    crearCliente();
                    break;
                case 2:
                    listarClientes();
                    break;
                case 3:
                    buscarCliente();
                    break;
                case 4:
                    actualizarCliente();
                    break;
                case 5:
                    eliminarCliente();
                    break;
                case 6:
                    crearLibro();
                    break;
                case 7:
                    listarLibros();
                    break;
                case 8:
                    buscarLibro();
                    break;
                case 9:
                    actualizarLibro();
                    break;
                case 10:
                    eliminarLibro();
                    break;
                case 11:
                    crearPrestamo();
                    break;
                case 12:
                    devolverPrestamo();
                    break;
                case 13:
                    listarPrestamos();
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 0);
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
    
    static void eliminarCliente() {
        System.out.print("ID del cliente a eliminar: ");
        int id = Integer.parseInt(sc.nextLine());

        Cliente c = buscarClientePorId(id);
        if (c == null) {
            System.out.println("Cliente no encontrado.");
            return;
        }

        clientes.remove(c);
        System.out.println("Cliente eliminado correctamente.");
    }
    static void crearLibro() {
        System.out.print("Codigo: ");
        String codigo = sc.nextLine();

        System.out.print("Titulo: ");
        String titulo = sc.nextLine();

        System.out.print("Anio de publicacion: ");
        int anio = Integer.parseInt(sc.nextLine());

        System.out.print("Autor: ");
        String autor = sc.nextLine();

        libros.add(new Libro(codigo, titulo, anio, autor));
        System.out.println("Libro creado correctamente.");
    }
    static void listarLibros() {
        System.out.println("--- LIBROS ---");
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
            return;
        }
        for (Libro l : libros) {
            System.out.println(l);
        }
    }

    static Libro buscarLibroPorCodigo(String codigo) {
        for (Libro l : libros) {
            if (l.getCodigo().equals(codigo)) {
                return l;
            }
        }
        return null;
    }

    static void buscarLibro() {
        System.out.print("Codigo a buscar: ");
        String codigo = sc.nextLine();

        Libro l = buscarLibroPorCodigo(codigo);
        if (l == null) {
            System.out.println("Libro no encontrado.");
        } else {
            System.out.println(l);
        }
    }
    static void actualizarLibro() {
        System.out.print("Codigo del libro a actualizar: ");
        String codigo = sc.nextLine();

        Libro l = buscarLibroPorCodigo(codigo);
        if (l == null) {
            System.out.println("Libro no encontrado.");
            return;
        }

        System.out.print("Nuevo titulo: ");
        String nuevoTitulo = sc.nextLine();

        System.out.print("Nuevo autor: ");
        String nuevoAutor = sc.nextLine();

        l.setTitulo(nuevoTitulo);
        l.setAutor(nuevoAutor);
        System.out.println("Libro actualizado correctamente.");
    }
    static void eliminarLibro() {
        System.out.print("Codigo del libro a eliminar: ");
        String codigo = sc.nextLine();

        Libro l = buscarLibroPorCodigo(codigo);
        if (l == null) {
            System.out.println("Libro no encontrado.");
            return;
        }

        libros.remove(l);
        System.out.println("Libro eliminado correctamente.");
    }
    static void crearPrestamo() {
        System.out.print("ID del cliente: ");
        int idCliente = Integer.parseInt(sc.nextLine());

        Cliente c = buscarClientePorId(idCliente);
        if (c == null) {
            System.out.println("Cliente no encontrado.");
            return;
        }

        System.out.print("Codigo del libro: ");
        String codigoLibro = sc.nextLine();

        Libro l = buscarLibroPorCodigo(codigoLibro);
        if (l == null) {
            System.out.println("Libro no encontrado.");
            return;
        }

        if (!l.isDisponible()) {
            System.out.println("El libro no esta disponible.");
            return;
        }

        System.out.print("ID del prestamo: ");
        String idPrestamo = sc.nextLine();

        Prestamo p = new Prestamo(idPrestamo, c, l, LocalDate.now());
        prestamos.add(p);
        l.setDisponible(false);
        System.out.println("Prestamo registrado correctamente.");
    }
    static void devolverPrestamo() {
        System.out.print("ID del prestamo a devolver: ");
        String idPrestamo = sc.nextLine();

        for (Prestamo p : prestamos) {
            if (p.getIdPrestamo().equals(idPrestamo) && p.getEstado().equals("ACTIVO")) {
                p.setEstado("DEVUELTO");
                p.getLibro().setDisponible(true);
                System.out.println("Devolucion registrada correctamente.");
                return;
            }
        }
        System.out.println("Prestamo activo no encontrado.");
    }
    static void listarPrestamos() {
        System.out.println("--- PRESTAMOS ---");
        if (prestamos.isEmpty()) {
            System.out.println("No hay prestamos registrados.");
            return;
        }
        for (Prestamo p : prestamos) {
            System.out.println(p);
        }
    }
}