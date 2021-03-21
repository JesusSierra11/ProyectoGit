/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.PrintWriter;

/**
 * Esta es la clase Point. Esta clase no va heredar de ninguna otra clase pero
 * va a ser utilizada por otras clases.
 *
 * @author Jesus
 * @version 1.0 Fecha: 20/03/2021
 */
public class Point {

    //Creamos los atributos x e y. Son de tipo double
    private double x;
    private double y;

    /**
     * Constructor vacio.
     */
    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    /**
     * Constructor completo, pide todos los atributos.
     *
     * @param x
     * @param y
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Constructor que pide como parametro un objeto tipo Point. Clona el objeto
     * introducido
     *
     * @param pnt
     */
    public Point(Point pnt) {
        this.x = pnt.x;
        this.y = pnt.y;
    }

    /**
     * Metodo que devuelve el valor de x.
     *
     * @return devuelve el valor de x.
     */
    public double getX() {
        return x;
    }

    /**
     * Metodo para asignar un valor a x.
     *
     * @param x
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Metodo que devuelve el valor de y.
     *
     * @return devuelve el valor de y.
     */
    public double getY() {
        return y;
    }

    /**
     * Medoto para asignar un valor y.
     *
     * @param y
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Metodo que devuelve la distancia entre este punto y otro punto. Toma el
     * objeto Point como parametro. Calcula la longitud de la linea.
     *
     * @param p
     * @return devuelve la distancia.
     */
    public double distance(Point p) {
        return Math.sqrt(((this.x - p.x) * (this.x - p.x)) + ((this.y - p.y) * (this.y - p.y)));

    }

    /**
     * Metodo que imprime los datos del objeto en un archivo
     *
     * @param out
     */
    public void print(PrintWriter out) {

        out.write("\n Point Data => ");
        out.write("\nPrint Data = x = " + x + " y = " + y);
        out.write("\n\n\n");;
    }

}
