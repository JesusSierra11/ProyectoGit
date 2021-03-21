/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.PrintWriter;

/**
 * Esta es la clase cono, es una forma tridimensional.
 *
 * @author Jesus
 * @version 1.0 Fecha: 20/03/2021
 * @see ThreeDimensionalShape
 */
public class Cone extends ThreeDimensionalShape {

    //Variable radius y height. Ambas tipo double.
    double radius;
    double height;

    /**
     * Constructor completo, pide todos los atributos del objeto.
     *
     * @param radius
     * @param height
     */
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    /**
     * Constructor que pide como parametro un objeto Cone. Clona el objeto
     * introducido
     *
     * @param con
     */
    public Cone(Cone con) {
        this.radius = con.radius;
        this.height = con.height;
    }

    /**
     * Metodo que devuelve el radio del cono.
     *
     * @return Devuelve el radio del cono.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Metodo para asignar un radio al cono.
     *
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Metodo que devuelve la altura del cono.
     *
     * @return Devuelve el valor de la altura del cono.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Metodo para asignar la altura de un cono.
     *
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Metodo que devuelve el area de la superficie de un cono.
     *
     * @return devuelve el area de la superficie del cono.
     */
    @Override
    public double getSurfaceArea() {

        return (Math.PI * (this.radius * this.radius) * this.height) / 3;
    }

    /**
     * Metodo que devuelve el volumen de un cono.
     *
     * @return devuelve el volumen de un cono.
     */
    @Override
    public double getVolume() {

        return (Math.PI * (this.radius)) * (this.radius + Math.sqrt((this.radius * this.radius) + (this.height * this.height)));

    }

    /**
     * Metodo que imprime los datos del objeto en un archivo.
     *
     * @param out
     */
    @Override
    public void print(PrintWriter out) {
        super.print(out);
        out.write("\n Radius  = " + this.getRadius() + "\r\n");
        out.write("\n Height  = " + this.getHeight() + "\r\n");
        out.write("\n  Surface  Area = " + this.getVolume() + "\r\n");
        out.write("\n  Volume  = " + this.getSurfaceArea() + "\r\n");
        out.write("\n\n\n");
    }

}

