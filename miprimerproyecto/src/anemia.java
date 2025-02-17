import java.util.Scanner;

public class anemia {
    public static void main(String[] args) {
        System.out.println("indique el numero en donde se encuentre su edad");
        System.out.println(" 1) 0 a un mes ");
        System.out.println(" 2) 1 a 6 meses");
        System.out.println(" 3) 6 a 12 meses");
        System.out.println(" 4) 1 a 5 años");
        System.out.println(" 5) 5 a 10 años");
        System.out.println(" 6) 10 a 15 años");
        System.out.println(" 7) mujer mayor  de 15 años");
        System.out.println(" 8) hombre mayor de 15 años");
         Scanner scanner = new Scanner(System.in);
         int edad = scanner.nextInt();

         System.out.println("indique su nivel de hemoglobina");
        System.out.println(" 1) 13- 26gg% ");
        System.out.println(" 2) 10 a 18g%");
        System.out.println(" 3) 11- 15g%");
        System.out.println(" 4) 11.5 -15g%");
        System.out.println(" 5) 12.6 15.5g%");
        System.out.println(" 6) 13 -15.5g%");
        System.out.println(" 7) 16g%");
        System.out.println(" 8) 18g%");
      
         int hemoglobina = scanner.nextInt();
         
         if (edad==1 && hemoglobina != 1) {
            System.out.println("positivo para anemia");
         } 
         if (edad==1 && hemoglobina == 1) {
            System.out.println("negativo para anemia");
         } 
         if (edad==2 && hemoglobina != 2) {
            System.out.println("positivo para anemia");
         } 
         if (edad==2 && hemoglobina == 2) {
            System.out.println("negativoo para anemia");
         } 
         if (edad==3 && hemoglobina != 3) {
            System.out.println("positivo para anemia");
         } 
         if (edad==3 && hemoglobina == 3) {
            System.out.println("negativo para anemia");
         } 
         if (edad==4 && hemoglobina != 4) {
            System.out.println("positivo para anemia");
         } 
         if (edad==4 && hemoglobina == 4) {
            System.out.println("negativo para anemia");
         } 
         if (edad==5 && hemoglobina != 5) {
            System.out.println("positivo para anemia");
         } 
         if (edad==5 && hemoglobina == 5) {
            System.out.println("negativo para anemia");
         } 
         if (edad==6 && hemoglobina != 6) {
            System.out.println("positivo para anemia");
         } 
         if (edad==6 && hemoglobina == 6) {
            System.out.println("negativo para anemia");
            
         } 
         if (edad==7 && hemoglobina != 7) {
            System.out.println("positivo para anemia");
         } 
         if (edad==7 && hemoglobina == 7) {
            System.out.println("negativo para anemia");
         } 
         if (edad==8 && hemoglobina != 8) {
            System.out.println("positivo para anemia");
         } 
         if (edad==8 && hemoglobina == 8) {
            System.out.println("negativo para anemia");
         } 
          
    }
    
}

