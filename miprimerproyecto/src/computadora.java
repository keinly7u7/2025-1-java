import java.util.Scanner;

public class computadora {
   
    public static void main(String[] args) {
        int valorcomputadores=500;
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("ingrese la cantidad de computadoras que compro");
        int computadores=scanner.nextInt();
        if (computadores<5) {
             double total=valorcomputadores*computadores;
             System.out.println(" el valor total es: " + total);
             System.out.println("se le hara un descuento de 10%");
             double descuento=total*0.10;
             double totalpagar=total-descuento;
             System.out.println("el total a pagar sera:" + totalpagar);
             }
          if (computadores>=5 && computadores<10) {
            double total=valorcomputadores*computadores;
            System.out.println(" el valor total es: " + total);
            System.out.println("se le hara un descuento de 20%");
            double descuento=total*0.20;
            double totalpagar=total-descuento;
            System.out.println("el total a pagar sera:" + totalpagar);
            }
            if (computadores>10) {
                double total=valorcomputadores*computadores;
                System.out.println(" el valor total es: " + total);
                System.out.println("se le hara un descuento de 40%");
                double descuento=total*0.40;
                double totalpagar=total-descuento;
                System.out.println("el total a pagar sera:" + totalpagar);
                }
                
            }
            
            
    }
    
