/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectogit;

/**
 * Esta es la clase Forma tridimensional. Es una clase abstracta. Esta clase
 * apunta hacia otras clases en jerarquia, sus metodos los implementan sus
 * hijos. esta clase no se puede instanciar.
 *
 *
 * @author Jesus
 * @version 1.0 Fecha: 20/03/2021
 * @see Shape
 */
public abstract class ThreeDimensionalShape extends Shape {

    /**
     * Metodo que devuelve el area de la superficie.
     *
     * @return 0
     */
    public double getSurfaceArea() {
        return 0;
    }

    /**
     * Metodo que devuelve el volumen.
     *
     * @return 0
     */
    public double getVolume() {
        return 0;
    }

}
