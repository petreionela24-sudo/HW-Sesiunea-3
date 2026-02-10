  package org.example;

   import java.util.Scanner;

  public class Convertor {
       public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          double suma, rataSchimb = 0;
          int optiune;

           System.out.println(" Convertor Valutar ");
           System.out.println("1. RON -> EUR");
           System.out.println("2. EUR -> RON");
           System.out.print("Alege conversia (1-2): ");
           optiune = sc.nextInt();

           System.out.print("Introdu suma: ");
           suma = sc.nextDouble();

           switch (optiune) {
               case 1:
                  rataSchimb = 0.20; // Exemplu curs: 1 RON = 0.20 EUR
                   System.out.println(suma + " RON = " + (suma * rataSchimb) + " EUR");
                    break;
                case 2:
                  rataSchimb = 5.10; // Exemplu curs: 1 EUR = 5.10 RON
                   System.out.println(suma + " EUR = " + (suma * rataSchimb) + " RON");
                   break;

                   default:
                   System.out.println("Optiune invalida!");
        }
            sc.close();
    }
}

