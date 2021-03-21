/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.PrintWriter;

/**
 * Esta es la clase Cilindro. Es una forma tridimensional.
 *
 * @author Jesus
 * @version 1.0 Fecha: 20/03/2021
 * @see ThreeDimensionalShape
 */
public class Cylinder extends ThreeDimensionalShape {

    //Creo las variables radius y height. Ambas tipo double.
    double radius, height;

    /**
     * Constructor completo, contiene todos los atributos.
     *
     * @param radius
     * @param height
     */
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    /**
     * Constructor que pide como parametro un objeto Cilindro. Clona el objeto
     * introducido
     *
     * @param cyl
     */
    public Cylinder(Cylinder cyl) {
        this.radius = cyl.radius;
        this.height = cyl.height;
    }

    /**
     * Metodo que devuelve el radio del cilindro.
     *
     * @return devuelve el radio del cilindro.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Metodo que asigna un radio al cilindro.
     *
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Metodo que devuelve la altura del cilindro.
     *
     * @return devuelve la altura del cilindro.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Metodo que asigna la altura del cilindro.
     *
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Metodo que devuelve el area de la superficie del cilindro.
     *
     * @return devuelve el area de la superficie del cilindro.
     */
    @Override
    public double getSurfaceArea() {
        return 2 * Math.PI * this.radius * this.height;
    }

    /**
     * Metodo que devuelve el volumen del cilindro.
     *
     * @return devuelve el volumen del cilindro.
     */
    @Override
    public double getVolume() {
        return Math.PI * this.radius * this.radius * this.height;
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
        out.write("\n Height = " + this.getHeight() + "\r\n");
        out.write("\n Surface  Area = " + this.getSurfaceArea() + "\r\n");;
        out.write("\n Volume = " + this.getVolume() + "\r\n");
        out.write("\n\n\n");

    }

}
