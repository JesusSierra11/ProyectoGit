/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectogit;

import java.io.PrintWriter;

/**
 * Esta es la clase Cubo, es una forma tridimensional.
 *
 * @author Jesús
 * @version 1.0 Fecha: 20/03/2021
 * @see ThreeDimensionalShape
 */
public class Cube extends ThreeDimensionalShape {

    //Variable length. Tipo double
    double length;

    /**
     * Constructor completo. Pide todos los atributos del objeto.
     *
     * @param length
     */
    public Cube(double length) {
        this.length = length;
    }

    /**
     * Constructor que pide un Cubo para poder ser construido. Clona el objeto
     * introducido
     *
     * @param cube
     */
    public Cube(Cube cube) {
        this.length = cube.length;
    }

    /**
     * Metodo que devuelve la longitud del cubo.
     *
     * @return devuelve el valor de la longitud.
     */
    public double getLength() {
        return length;
    }

    /**
     * Metodo que asigna la longitud lateral del cubo.
     *
     * @param length
     */
    public void setSideLength(double length) {
        this.length = length;
    }

    /**
     * Metodo que devuelve el área de la superficie del cubo.
     *
     * @return devuelve el área de la superficie del cubo.
     */
    @Override
    public double getSurfaceArea() {
        return 6 * this.length * this.length;
    }

    /**
     * Metodo que devuelve el volumen del cubo.
     *
     * @return delvuelve el volumen del cubo.
     */
    @Override
    public double getVolume() {
        return this.length * this.length * this.length;
    }

    /**
     * Metodo que imprime los datos del objeto en un archivo.
     *
     * @param out
     */
    @Override
    public void print(PrintWriter out) {

        super.print(out);
        out.write("\n Side  Length = " + this.getLength() + "\r\n");
        out.write("\n Surface  Area = " + this.getSurfaceArea() + "\r\n");
        out.write("\n Volume = " + this.getVolume() + "\r\n");;
        out.write("\n\n\n");

    }

}
