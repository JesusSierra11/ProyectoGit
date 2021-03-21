/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;


/**
 * Esta clase muestra la jerarquía de formas matemáticas que vamos a crear
 * utilizando herencia.
 *
 * @author Jesus
 * @version 1.0 Fecha: 20/03/2021
 */
public class Project4 {

    /**
     *
     * @param args
     */
    public static void main(String args[]) {
        try {
            //Creamos un objeto PrintWriter que sirve para imprimir un archivo 
            //de los valores a la hora de ejecutar.
            PrintWriter out = new PrintWriter(new FileWriter(args[0]));
            //Creamos un ArrayLisdt de figuras. Array de 30 elementos.
            ArrayList<Shape> myShapes = new ArrayList<Shape>(30);
            //Creamos los objetos puntos.
            Point pt1 = new Point(1, 1);
            Point pt2 = new Point(5, 8);
            Point pt3;
            Point pt4 = new Point();
            //Creamos un objeto triangulo
            Triangle triangle_1 = new Triangle(pt1, pt2, new Point(10, 4));
            //Añadimos un valor a X
            pt1.setX(2);
            //Añadimos un valor a Y.
            pt1.setY(2);
            //Creamos dos objetos puntos.
            pt2 = new Point(2, 8);
            pt3 = new Point(12, 2);
            //Creamos dos objetos Triangulos.
            Triangle triangle_2 = new Triangle(pt1, pt2, pt3);
            Triangle triangle_3 = new Triangle(triangle_2);
            //Establece el punto 2 del triangulo y establece un nuevo punto.
            triangle_2.setPoint2(new Point(5, 8));
            //Añado triangulo_1, triangulo_2 y triangulo_3 al array.
            myShapes.add(triangle_1);
            myShapes.add(triangle_2);
            myShapes.add(triangle_3);
            //Creamos 3 objetos circulo.
            Circle circle_1, circle_2, circle_3;
            circle_1 = new Circle(pt1, 4);
            circle_2 = new Circle(pt2, 12);
            circle_3 = new Circle(circle_2);
            //Esteblecemos el radio del circulo 3.
            circle_3.setRadius(5);
            //Añadimos los circulos al array
            myShapes.add(circle_1);
            myShapes.add(circle_2);
            myShapes.add(circle_3);
            //Creamos dos rectangulos.
            Rectangle r1, r2, r3;
            r1 = new Rectangle(10, 3);
            r2 = new Rectangle(20, 4);
            //Establecemos el ancho del rectangulo 1.
            r1.setWidth(3);
            //Establecemos la altura del rectangulo 2.
            r2.setHeight(10);
            //Creamos un objeto rectangulo. Clonamos el rectangulo 2.
            r3 = new Rectangle(r2);
            //Establecemos la altura del rectangulo 3.
            r3.setHeight(100);
            //Añadimos los objetos rectangulo al array.
            myShapes.add(r1);
            myShapes.add(r2);
            myShapes.add(r3);
            //Creamos 3 objetos Esferas.
            Sphere sphere_1, sphere_2, sphere_3;
            sphere_1 = new Sphere(4);
            sphere_2 = new Sphere(12);
            //Creamos el la Esfera 3, clonando la Esfera 1.
            sphere_3 = new Sphere(sphere_1);
            //Esteblecemos el radio de la esfera 3.
            sphere_3.setRadius(5);
            //Añadimos los objetos Esfera al array.
            myShapes.add(sphere_1);
            myShapes.add(sphere_2);
            myShapes.add(sphere_3);
            //Creamos 3 objetos cubo.
            Cube cube_1, cube_2, cube_3;
            cube_1 = new Cube(4);
            cube_2 = new Cube(12);
            //Creamos el cubo 3, clonando el cubo 1.
            cube_3 = new Cube(cube_1);
            //Establecemos la longitud lateral del cubo 3.
            cube_3.setSideLength(5);
            //Añadimos los objetos cubo al array.
            myShapes.add(cube_1);
            myShapes.add(cube_2);
            myShapes.add(cube_3);
            //Creamos 3 objetos cilindro.
            Cylinder cy1, cy2, cy3;
            cy1 = new Cylinder(4, 10);
            cy2 = new Cylinder(7, 12);
            //Creamos el cilindro 3, clonando el cilindro 2
            cy3 = new Cylinder(cy2);
            //Establecemos la altura del cilindro3
            cy3.setHeight(15);
            //Establecemos el radio del cilindro3
            cy3.setRadius(10);
            //Añadimos los objetos cilindro al array.
            myShapes.add(cy1);
            myShapes.add(cy2);
            myShapes.add(cy3);
            //Creamos 3 objetos cono.
            Cone cone_1, cone_2, cone_3;
            cone_1 = new Cone(4, 10);
            cone_2 = new Cone(7, 12);
            //Creamos el cono 3, clonando el cono 3.
            cone_3 = new Cone(cone_1);
            //Establece la altura del cono 3.
            cone_3.setHeight(15);
            //Establece el radio del cono 3.
            cone_3.setRadius(10);
            //Añadimos los objetos cono al array.
            myShapes.add(cone_1);
            myShapes.add(cone_2);
            myShapes.add(cone_3);
            //Mostramos nuestro array de figuras.
            for (Shape s : myShapes) {
                //Mostramos el nombre de la clase en un fichero
                out.println(s.getClass().getName());
                //Imprimimos las variables out
                s.print(out);
                out.println();
            }
            out.close();
        } //final del try.
        //Catch para capturar las excepciones.
        catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.exit(0);
        }  //final del catch

    }
}
