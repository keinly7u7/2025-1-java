import java.util.Scanner;

public class Ivas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor del aparato:");
        int valor = scanner.nextInt();
        scanner.nextLine(); // Esto consume el salto de línea pendiente después de nextInt()
        
        System.out.println("Si su producto corresponde a la marca Nosy, escriba: si. De lo contrario, escriba: no");
        String marca = scanner.nextLine();

        if (valor >= 500 && marca.equals("si")) {
            // Descuento del 10% por la marca
            double descuento = valor * 0.10;
            double precioConDescuento = valor - descuento;
            
            // IVA (19%)
            double iva = precioConDescuento * 0.19;
            
            // Otro descuento del 5% sobre el precio con descuento
            double otroDescuento = precioConDescuento * 0.05;
            
            // Total
            double total = precioConDescuento + iva - otroDescuento;

            System.out.println("El precio sin IVA es de: " + precioConDescuento);
            System.out.println("Por ser de la marca Nosy se le añade un descuento del 5%, por lo tanto el valor de su compra es de: " + total);
        } else if (valor > 500 && marca.equals("no")) {
            // Descuento del 10% sin marca Nosy
            double descuento = valor * 0.10;
            double precioConDescuento = valor - descuento;
            
            // IVA (19%)
            double iva = precioConDescuento * 0.19;
            
            // Total
            double total = precioConDescuento + iva;

            System.out.println("El precio sin IVA es de: " + precioConDescuento);
            System.out.println("El valor de su compra es de: " + total);
        } else if (valor < 500) {
            // Si el valor es menor a 500 no se aplica ningún descuento
            double iva = valor * 0.19;
            double total = valor + iva;

            System.out.println("No aplica ningún descuento.");
            System.out.println("El precio de su compra es: " + total);
        }
    }
}