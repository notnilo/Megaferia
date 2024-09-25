/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author devergel
 */
public class Editorial {

    private String nit;
    private String nombre;
    private String direccion;
    private Gerente gerente;
    private ArrayList<Libro> libros;
    private ArrayList<Stand> stands;

    public Editorial(String nit, String nombre, String direccion, Gerente gerente, ArrayList<Libro> libros, ArrayList<Stand> stands) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.gerente = gerente;
        this.libros = libros;
        this.stands = stands;
    }
    
    public boolean addLibro(Libro libro){
        if(!this.libros.contains(libro)){
            this.libros.add(libro);
            return true;
        }
        return false;
    }
}
