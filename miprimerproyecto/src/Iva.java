import java.util.Scanner;

public class Iva {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Ingrese el valor del aparato:");
      int valor = scanner.nextInt();
      scanner.nextLine(); 
      
        System.out.println("si su producto corresponde a la marca Nosy escriba: si, de lo contrario escriba: no");
        String marca= scanner.nextLine();
        if (valor>=500 && marca.equals("si")) {
          
          double iva=((valor*0.19)+valor);
         
          double descuento = ((iva*0.10)-iva);
          double otrodescuento = ((descuento*0.05)-descuento);
          System.out.println("por ser de la marca nosy se le añade un descuento del 5% por lo tanto el valor de su compra es de: " + otrodescuento);


          }
          if  (valor>=500 && marca.equals("no")) {
          double iva = ((valor*0.19)+valor);
          double descuento = (iva-(iva*0.10));
          System.out.println("el valor de su compra es de  " + descuento);


            
          }
          if (valor<500 && marca.equals("no")) {
            System.out.println("no aplica ningun descuento");
            double iva = ((valor*0.19)+valor);
            System.out.println("el precio de su compra es " + iva);
            
          }
          if (valor<500 && marca.equals("si")) {
            System.out.println(" aplica descuento");
            double iva = ((valor*0.19)+valor);
            double descuento = (iva-(iva*0.05));
            System.out.println("el precio de su compra es " + descuento);
          }
        }
    
}
