import java.util.Scanner;

public class Serviteca {
    public static void main(String[] args) {
        System.out.println("¿cuantas llantas desea comprar?");
        Scanner scanner = new Scanner(System.in);
        int cantidad= scanner.nextInt();
        if (cantidad<5) {
         int  llanta=100;
         System.out.println("cada llanta tiene un valor de 100");
         int total1= cantidad*llanta;
         System.out.println("el total a pagar es: " + total1);
         }
         if (cantidad>=5 && cantidad<=10) {
            int  llanta=75;
         System.out.println("cada llanta tiene un valor de 75");
         int total1= cantidad*llanta;
         System.out.println("el total a pagar es: " + total1);

         }
         if (cantidad>10) {
            int  llanta=50;
         System.out.println("cada llanta tiene un valor de 50");
         int total1= cantidad*llanta;
         System.out.println("el total a pagar es: " + total1);

                
           
            }
        }
}
