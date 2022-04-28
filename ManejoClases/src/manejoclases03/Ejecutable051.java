/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package manejoclases03;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutable051 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Hospital h1 = new Hospital();
        Hospital h2 = new Hospital();
        Hospital h3 = new Hospital();
        
        double valor;
        String nombre;
        int camas, sumacamas;
        System.out.println("Ingrese el nombre del Hospital 1:");
        nombre = sc.nextLine();
        h1.establecerNombre(nombre);
        System.out.println("Ingrese el presupuesto del Hospital 1: ");
        valor = sc.nextDouble();
        h1.establecerPresupuesto(valor);
        System.out.println("Ingrese las camas del Hospital 1: ");
        camas = sc.nextInt();
        h1.establecerNumeroCamas(camas);
        //System.out.println("El nombre es " + h1.obtenerNombre() + " tiene un presupuesto de " + h1.obtenerNumeroCamas() + " y su presupuesto es de: " + h1.obtenerPresupuesto());
        
        sc.nextLine();
        System.out.println("Ingrese el nombre del Hospital 2:");
        nombre = sc.nextLine();
        h2.establecerNombre(nombre);
        System.out.println("Ingrese el presupuesto del Hospital 2: ");
        valor = sc.nextDouble();
        h2.establecerPresupuesto(valor);
        System.out.println("Ingrese las camas del Hospital 2: ");
        camas = sc.nextInt();
        h2.establecerNumeroCamas(camas);
        //System.out.println("El nombre es " + h2.obtenerNombre() + " tiene un presupuesto de " + h2.obtenerNumeroCamas() + " y su presupuesto es de: " + h2.obtenerPresupuesto());
        
        sc.nextLine();
        System.out.println("Ingrese el nombre del Hospital 3:");
        nombre = sc.nextLine();
        h3.establecerNombre(nombre);
        System.out.println("Ingrese el presupuesto del Hospital 3: ");
        valor = sc.nextDouble();
        h3.establecerPresupuesto(valor);
        System.out.println("Ingrese las camas del Hospital 3: ");
        camas = sc.nextInt();
        h3.establecerNumeroCamas(camas);
        //System.out.println("El nombre es " + h3.obtenerNombre() + " tiene un presupuesto de " + h3.obtenerNumeroCamas() + " y su presupuesto es de: " + h3.obtenerPresupuesto());
        
        
        double suma = h1.obtenerPresupuesto() + h2.obtenerPresupuesto() +
                h3.obtenerPresupuesto();
        sumacamas = h2.obtenerNumeroCamas() + h2.obtenerNumeroCamas() +
                h3.obtenerNumeroCamas();
        System.out.printf("La suma de presupuestos es %.2f\n", suma);
        System.out.printf("La suma de camas es %d\n", sumacamas);
        
        System.out.printf("%s - %d - %.2f\n", h1.obtenerNombre(), 
                h1.obtenerNumeroCamas(), h1.obtenerPresupuesto());
        System.out.printf("%s - %d - %.2f\n", h2.obtenerNombre(), 
                h3.obtenerNumeroCamas(), h3.obtenerPresupuesto());
        System.out.printf("%s - %d - %.2f\n", h2.obtenerNombre(), 
                h2.obtenerNumeroCamas(), h3.obtenerPresupuesto());
        
    }
}
