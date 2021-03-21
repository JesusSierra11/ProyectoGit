/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.PrintWriter;

/**
 * Esta es la clase Shape. Esta clase es abstracta. Estos metodos van a ser
 * implementados en las clases hijas.
 *
 * @author Jesus
 * @version 1.0 Fecha: 20/03/2021
 */
public abstract class Shape {

    /**
     * Metodo que imprime los datos del objeto en un archivo.
     *
     * @param out
     */
    public void print(PrintWriter out) {

    }

    /**
     * Metodo que devuelve el valor del area.
     *
     * @return devuelve 0.
     */
    public double getArea() {
        return 0;

    }

    /**
     * Metodo que devuelve el valor del perimetro.
     *
     * @return devuelve 0
     */
    public double getPerimeter() {
        return 0;
    }

}
