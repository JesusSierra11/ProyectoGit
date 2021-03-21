/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectogit;

import java.io.PrintWriter;

/**
 * Esta es la clase Esfera. Es una forma tridimensional.
 *
 * @author Jesus
 * @version 1.0 Fecha: 20/03/2021
 * @see ThreeDimensionalShape
 */
public class Sphere extends ThreeDimensionalShape {

    //Creo el atributo radius. Tipo double.
    double radius;

    /**
     * Constructor completo, pide como parametros todos los atributos.
     *
     * @param radius
     */
    public Sphere(double radius) {
        this.radius = radius;
    }

    /**
     * Constructor que pide como parametro un objeto tipo Esfera. Clona el
     * objeto introducido
     *
     * @param sp
     */
    public Sphere(Sphere sp) {
        this.radius = sp.radius;
    }

    /**
     * Metodo que devuelve el valor del radio de la esfera.
     *
     * @return devuelve el valor del radio de la esfera.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Metodo que asigna el valor del radio de la esfera.
     *
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Metodo que devuelve el area de superficie de la esfera.
     *
     * @return devuelve el area de superficie de la esfera.
     */
    @Override
    public double getSurfaceArea() {

        return 4 * Math.PI * this.radius * this.radius;

    }

    /**
     * Metodo que devuelve el volumen de la esfera.
     *
     * @return devuelve el volumen de la esfera.
     */
    @Override
    public double getVolume() {
        return (4 * Math.PI * this.radius * this.radius * this.radius) / 3;
    }

    /**
     * Metodo que imprime los datos del objeto en un archivo.
     *
     * @param out
     */
    @Override
    public void print(PrintWriter out) {

        super.print(out);
        out.write("\n Radius = " + this.getRadius() + "\r\n");
        out.write("\n Surface  Area = " + this.getSurfaceArea() + "\r\n");
        out.write("\n Volume = " + this.getVolume() + "\r\n");
        out.write("\n\n\n");

    }

}
