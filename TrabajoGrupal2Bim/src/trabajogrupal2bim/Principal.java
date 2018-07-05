/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajogrupal2bim;

/**
 *
 * @author USUARIO
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiantes[] arreglo_estudiantes = new Estudiantes[5];
        // Declaracion de variables
        String[] nombres = {"José", "María", "Ana", "Paul", "David"};
        String[] apellidos = {"Yaguana", "Benitez", "Gaviria", "Davila", "Andrade"};
        int[] edades = {20, 19, 20, 19, 25};
        double[] calificaciones1 = {9.1, 10, 8, 7, 9.1};
        double[] calificaciones2 = {6.1, 5, 10, 7.2, 4.1};

        double[] promedio = new double[5];
        // Agregamos un for para agregar valores al arreglo estudiantes
        for (int i = 0; i < arreglo_estudiantes.length; i++) {
            // Declaramos suma como doble para poder encontrar el promedio
            double suma = 0;
            // Creamos objetos para ingresar valores
            Estudiantes p = new Estudiantes();
            // Llamamos a los objetos 
            p.nombre = nombres[i];
            p.apellido = apellidos[i];
            p.edad = edades[i];
            p.calificacion1 = calificaciones1[i];
            p.calificacion2 = calificaciones2[i];
            arreglo_estudiantes[i] = p;
            suma = suma + p.calificacion1 + p.calificacion2;
            promedio[i] = suma / 2;

        }
        for (int i = 0; i < arreglo_estudiantes.length; i++) {
            System.out.printf("\n%s %s\nEdad - %d\nCalificacion 1: %.2f\nCalificacion 2 %.2f\nPromedio: %.2f\n",
                     arreglo_estudiantes[i].nombre,
                     arreglo_estudiantes[i].apellido,
                     arreglo_estudiantes[i].edad,
                     arreglo_estudiantes[i].calificacion1,
                     arreglo_estudiantes[i].calificacion2,
                     promedio[i]);
        }
    }

}
