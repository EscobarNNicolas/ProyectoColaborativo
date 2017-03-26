
package proyectcolaborativo;

import java.util.Scanner;

/**
 *
 * @author william Rosales
 */
public class ProyectColaborativo {

    public static void main(String[] args) {
        double par1;
        double par2;
        double par3;
        double examen;
        double trabajo;
        double nota1;
        double nota2;
        double nota3;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la nota del parcial 1");
        par1 = leer.nextDouble();
        System.out.println("Ingrese la nota del parcial 2");
        par2 = leer.nextDouble();
        System.out.println("Ingrese la nota del parcial 3");
        par3 = leer.nextDouble();
        System.out.println("Ingrese la nota del Examen Final");
        examen = leer.nextDouble();
        System.out.println("Ingrese la nota del Trabajo Final");
        trabajo = leer.nextDouble();
        
        nota1 =  ((par1 + par2 + par3)*0.55)/3;
        nota2 = (examen * 0.30);
        nota3 = (trabajo * 0.15);
        System.out.println("la nota 1 es " + nota1);
        System.out.println("La nota 2 es " + nota2);
        System.out.println("La nota 3 es " +nota3); 
        System.out.println("la nota final es "+(nota1+nota2+nota3));
        System.out.println("********************gracias*******************");
        System.out.println("******************** cruel mundo******************* " );
        
    }
    
}
