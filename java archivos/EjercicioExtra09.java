/**
Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
obtener un resultado menor que el divisor, este resultado es el residuo, y
el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 - 13 = 37 una resta realizada
37 - 13 = 24 dos restas realizadas
24 - 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es
3.
¿Aún no lo entendiste? Recomendamos googlear división con restas
sucesivas.
 * 
 */
package guia.pkg02;

import java.util.Scanner;

/**
 *
 * @author Leandro Arriola
 */
public class EjercicioExtra09 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in).useDelimiter("\n");

        int div, d;

        System.out.print("Ingrese el dividendo: ");
        div = read.nextInt();
        System.out.print("Ingrese el divisor: ");
        d = read.nextInt();
        System.out.println("");

        double division = DIVISION(div, d);
        System.out.println("");
        System.out.println("El cociente es " + division);
        
    }

    private static double DIVISION(double div, double d) {
        int cont = 0;
        if (div == 0) {
            System.out.println("No se puede dividir por cero.");
            System.exit(0);
        }
        for (cont = 0; div > 0; cont++) {
            if (div < d) {
                break;
            }
            div = div - d;
        }
        System.out.println("El residuo es: " + (div));
        return cont;
        
    }

}
