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
public class Stand {

    private static int idCount = 0; //Contador para asignar el id, es estática porque es una variable propia de la clase
    private int id;
    private float precio;
    private ArrayList<Editorial> editoriales;

    public Stand(float precio) {
        this.id = Stand.idCount;
        this.precio = precio;
        this.editoriales = new ArrayList<>();

        Stand.idCount++;
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.id + ", " + this.precio + ")";
    }
}
