/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ProyectoGit;

/**
 * Esta es la clase Forma bidimensional. Es una clase abstracta, sus metodos van
 * a ser heredador por sus hijos.
 *
 * @author Jesus
 * @version 1.0 Fecha: 20/03/2021
 * @see Shape
 */
abstract public class TwoDimensionalShape extends Shape {

    /**
     * Metodo que obtiene el valor del perimetro.
     *
     * @return 0
     */
    public double getPerimeter() {
        return 0;
    }

    /**
     * Metodo que obtiene el valor del area.
     *
     * @return 0
     */
    public double getArea() {
        return 0;
    }

}
