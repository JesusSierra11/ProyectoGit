/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectogit;

import java.io.PrintWriter;

/**
 * Esta es la clase Triangulo. Es una forma bidimensional
 *
 *
 * @author Jesus
 * @version 1.0 Fecha: 20/03/2021
 * @see TwoDimensionalShape
 */
public class Triangle extends TwoDimensionalShape {

    //Creo los atributos, todos de tipo Point.
    private Point point1, point2, point3;

    /**
     * Constructor completo que pide como parametro todos los atributos.
     *
     * @param pt1
     * @param py2
     * @param py3
     */
    public Triangle(Point pt1, Point py2, Point py3) {
        this.point1 = pt1;
        this.point2 = py2;
        this.point3 = py3;
    }

    /**
     * Constructor que pide como parametro un objeto tipo triangulo. Clona el
     * objeto introducido
     *
     * @param t
     */
    public Triangle(Triangle t) {
        this.point1 = t.point1;
        this.point2 = t.point2;
        this.point3 = t.point3;
    }

    /**
     * Metodo que devuelve el valor del punto 1.
     *
     * @return devuelve el valor del punto 1.
     */
    public Point getPoint1() {
        return point1;
    }

    /**
     * Metodo para establecer el valor del punto 1.
     *
     * @param point1
     */
    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    /**
     * Metodo que devuelve el valor del punto 2.
     *
     * @return devuelve el valor del punto 2.
     */
    public Point getPoint2() {
        return point2;
    }

    /**
     * Metodo para establecer el valor del punto 1.
     *
     * @param point2
     */
    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    /**
     * Metodo que devuelve el valor del punto 3.
     *
     * @return devuelve el valor del punto 3.
     */
    public Point getPoint3() {
        return point3;
    }

    /**
     * Metodo que establece el valor del punto 3.
     *
     * @param point3
     */
    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    /**
     * Metodo que imprime los datos del objeto en un archivo
     *
     * @param out
     */
    @Override
    public void print(PrintWriter out) {
        super.print(out);
        out.write("\n Triangle Data => " + "\r\n");
        out.write("\n Point 1 = " + this.point1.getX() + " , " + this.point1.getY() + "\r\n");
        out.write("\n Point 2 = " + this.point2.getX() + " , " + this.point2.getY() + "\r\n");
        out.write("\n Point 3 = " + this.point3.getX() + " , " + this.point3.getY() + "\r\n");
        out.write("\n Area = " + this.getArea() + "\r\n");
        out.write("\n Perimeter = " + this.getPerimeter() + "\r\n");
        out.write("\n\n\n");;
    }

    /**
     * Metodo que devuelve el area del triangulo.
     *
     * @return devuelve el area del triangulo.
     */
    @Override
    public double getArea() {

        double area;
        double perimeter = this.getPerimeter() / 2;

        double a = this.point1.getX() + this.point1.getY();
        double b = this.point2.getX() + this.point2.getY();
        double c = this.point3.getX() + this.point3.getY();

        area = Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
        return area;
    }

    /**
     * Metodo que devuelve el perimetro del triangulo.
     *
     * @return devuelve el perimetro del triangulo.
     */
    @Override
    public double getPerimeter() {

        double sum = 0;
        sum += this.point1.getX() + this.point1.getY();
        sum += this.point2.getX() + this.point2.getY();
        sum += this.point3.getX() + this.point3.getY();
        return sum;

    }
}
