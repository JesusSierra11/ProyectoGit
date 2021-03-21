/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.PrintWriter;

/**
 * Esta es la clase Rectangulo. Es una forma bidimensional.
 *
 * @author Jesus
 * @version 1.0 Fecha: 20/03/2021
 * @see TwoDimensionalShape
 */
public class Rectangle extends TwoDimensionalShape {

    //Creamos los atributos length y width. Ambos de tipo double.
    double length;
    double width;

    /**
     * Constructor completo, pide como parametro todos los atributos.
     *
     * @param length
     * @param width
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Constructor que pide como parametro un objeto tipo rectangulo. Clona el
     * objeto introducido
     *
     * @param rect
     */
    public Rectangle(Rectangle rect) {
        this.length = rect.length;
        this.width = rect.width;
    }

    /**
     * Metodo que devuelve la longitud del rectangulo.
     *
     * @return devuelve la longitud del rectangulo.
     */
    public double getLength() {
        return length;
    }

    /**
     * Metodo que asigna asigna la altura del rectangulo.
     *
     * @param length
     */
    public void setHeight(double length) {
        this.length = length;
    }

    /**
     * Metodo que devuelve el valor de la anchura del rectangulo
     *
     * @return devuelve el valor de la anchura del rectangulo.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Metodo que asigna la anchura del rectangulo.
     *
     * @param width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Metodo que imprime los datos del objeto en un archivo.
     *
     * @param out
     */
    @Override
    public void print(PrintWriter out) {

        super.print(out);
        out.write("\n Area = " + this.getArea() + "\r\n");
        out.write("\n Perimeter = " + this.getPerimeter() + "\r\n");
        out.write("\n Is Square? = " + this.isSquare() + "\r\n");;
        out.write("\n\n\n");

    }

    /**
     * Metodo que devuelve el area del rectangulo.
     *
     * @return devuelve el area del rectangulo.
     */
    @Override
    public double getArea() {
        return this.length * this.width;
    }

    /**
     * Metodo que devuelve el perimetro del rectangulo.
     *
     * @return devuelve el perimetro del rectangulo.
     */
    @Override
    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    /**
     * Este metodo devuelve si un rectangulo es cuadrado o no, si la longitud y
     * el ancho son iguales, devuelve true si no, devuelve false.
     *
     * @return devuelve si un rectangulo es cuadrado o no.
     */
    public boolean isSquare() {
        if (this.length == this.width) {
            return true;
        } else {
            return false;
        }
    }

}
