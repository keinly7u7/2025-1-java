import java.util.Scanner;

public class manzanas {
    public static void main(String[] args) {
        
        System.out.println("cada kilo de manzana tiene un costo de 1000");
        System.err.println(" ingrese el numero de kilos comprados");
        Scanner scanner = new Scanner(System.in);
        double kilos = scanner.nextDouble();
        double manzana=1000;
        if (kilos>=0 && kilos<=2) {
            System.out.println("no tendra ningun descuento");

            
        }
        if (kilos>=2.01 && kilos<=5) {
            System.out.println(" tendra un descuento del 10%");
            double costo= manzana*kilos;
             double descuento = (costo-(costo*0.10));
             System.out.println("el total a pagar es" + descuento);

            
            
        }
        if (kilos>=5.01 && kilos<=10) {
            System.out.println("tendra un descuento del 15%");
            
            double costo= manzana*kilos;
             double descuento = (costo-(costo*0.15));
             System.out.println("el total a pagar es" + descuento);

        }
        if (kilos>=10.01) {
            System.out.println(" tendra un descuento del 20%");
            double costo= manzana*kilos;
             double descuento = (costo-(costo*0.20));
             System.out.println("el total a pagar es" + descuento);

            
        }
    }
    
}
