/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ProyectoGit;

import java.io.PrintWriter;

/**
 * Esta es la clase circulo que representa el radio. El centro del circulo es un
 * objeto Point.
 *
 * @author Jesus
 * @version 1.0 Fecha: 20/03/2021
 * @see TwoDimensionalShape
 */
public class Circle extends TwoDimensionalShape {

    //Variables radius y center. Center tipo Point y radius tipo double.
    private double radius;
    private Point center;

    /**
     * Constructor que pide los parametros center y radius.
     *
     * @param center
     * @param radius
     */
    public Circle(Point center, double radius) {
        this.radius = radius;
        this.center = center;
    }

    /**
     * Constructor que pide el parametro Circle. Pide un objeto circulo. Clona
     * el objeto introducido
     *
     * @param circle
     */
    public Circle(Circle circle) {
        this.radius = circle.radius;
        this.center = circle.center;
    }

    /**
     * Metodo para devolver el valor del radio.
     *
     * @return devuelve el valor del radio.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Metodo para asignar un radio al circulo.
     *
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Metodo para devolver el valor del centro del circulo.
     *
     * @return devuelve el valor del centro.
     */
    public Point getCenter() {
        return center;
    }

    /**
     * Metodo para asignar el centro del circulo.
     *
     * @param center
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * Metodo que imprime los datos del objeto en un archivo
     *
     * @param out
     */
    @Override
    public void print(PrintWriter out) {
        super.print(out);
        out.write("\n Cirle: " + "\r\n");
        out.print("\n Center = " + this.center.getX() + " " + this.center.getY() + "\r\n");
        out.write("\n Area = " + this.getArea() + "\r\n");;
        out.write("\n Perimeter = " + this.getPerimeter() + "\r\n");
        out.write("\n Radius = " + this.getRadius() + "\r\n");;
        out.write("\n\n\n");
    }

    /**
     * Metodo para calcular el area del circulo.
     *
     * @return Devuelve el area del circulo.
     */
    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    /**
     * Metodo para calcular el perimetro del circulo.
     *
     * @return Devuelve el perimetro del circulo.
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

}
