package hola;

import java.util.Scanner;
public class condicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.print("Introduce x: ");
        x = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduce y: ");
        y = sc.nextInt();
        int mayor = (x > y) ? x : y; 	// Asigna el valor mayor de X e Y
        int menor = (x < y) ? x : y; 	// Asigna el valor menor de X e Y
        //return (x < 25) ? x : -1; 		// Si el valor de X es menor que 25, devuelve
        // el valor de X, en otro caso, devuelve -1
        System.out.println("El mayor valor es :"+mayor);
        System.out.println("El menor valor es :"+menor);
        if(x % 2 == 0){
            System.out.println("x es par");
        }
        else {
            System.out.println("x es impar");
        }
        if(y % 2 == 0){
            System.out.println("y es par");
        }
        else {
            System.out.println("y es impar");
        }
    }
}
