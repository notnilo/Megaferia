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
public class Narrador extends Persona {
    private ArrayList<AudioLibro> libros;

    public Narrador(ArrayList<AudioLibro> libros, String nombre, int cedula) {
        super(nombre, cedula);
        this.libros = libros;
    }
    
    public boolean addLibro(AudioLibro libro){
        if(!this.libros.contains(libro)){
            this.libros.add(libro);
            return true;
        }
        return false;
    }
}
