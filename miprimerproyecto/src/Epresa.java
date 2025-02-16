import java.util.Scanner;

public class Epresa {
    public static void main(String[] args) {
        //salidas
        double insumos, incentivos, prestamo;
        //entradas
        double capital;
        System.out.println("escriba su capital inicial");
        Scanner input= new Scanner(System.in);
        System.out.println("su capital inicial");
        capital=input.nextDouble();
        if(capital<0){
            prestamo=10000-(capital);
            capital=10000;
        }else if (capital<20000){
        prestamo=20000-capital;
        capital=20000;
        }else{
            prestamo=0;
        }
        insumos=(capital-7000)/2;
        incentivos=(capital-7000)/2;
        System.out.println("prestano a solicitar " + prestamo);
        System.out.println("insumo " + insumos);
        System.out.println("incentivos " + incentivos);






    }
}
