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
public class Autor extends Persona {
    private ArrayList<Libro> libros;

    public Autor(ArrayList<Libro> libros, String nombre, int cedula) {
        super(nombre, cedula);
        this.libros = libros;
    }
    
    public boolean addLibro(Libro libro){
        if(!this.libros.contains(libro)){
            this.libros.add(libro);
            return true;
        }
        return false;
    }
}
