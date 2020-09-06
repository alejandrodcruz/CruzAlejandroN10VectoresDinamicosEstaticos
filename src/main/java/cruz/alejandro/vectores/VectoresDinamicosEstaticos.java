/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cruz.alejandro.vectores;

import java.util.Scanner;

/**
 *
 * @author EntornoVM
 */
public class VectoresDinamicosEstaticos {

    public static void main(String[] args) {

        String nombre, fechaNacimiento;
        Integer dni;

        String[] materia = {"Matematica", "Lengua", "Quimica"};
        int[] nota = {5, 5, 6, 8, 7, 9, 5, 6, 7};

        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor ingresar el nombre del Alumno");
        nombre = teclado.nextLine();

        System.out.println("Por favor ingrese la fecha del nacimiento del Alumno");
        fechaNacimiento = teclado.nextLine();

        System.out.println("Por favor ingrese el numero de DNI del Alumno");
        dni = teclado.nextInt();

        System.out.println("==========================\n"
                + "         Boletin          \n"
                + "==========================\n"
                + "Alumno: " + nombre
                + "\nFecha de Nacimiento: " + fechaNacimiento
                + "\nDni: " + dni);
        int contador = 0;
        int promedio = 0;

        for (int i = 0; i < materia.length; i++) {

            System.out.println("Materia: " + materia[i]);
            for (int j = 0; j < 3; j++) {
                System.out.println("Trimestre " + (j + 1) + " : Nota: " + nota[contador + j]);

                promedio = promedio + nota[contador + j];
            }

            contador = contador + 3;

            System.out.println("Promedio: " + promedio / 3);
            promedio = 0;
        }
        
        teclado.close();
    }

}
