package org.example;

import java.util.Scanner;

     class Calculator {

          public static void main(String[] args) {

              System.out.println("Sa calculam!\n");
               System.out.println();

            char operator;
            double number1, number2, result;

             // am creat un obiect cu clasa scanner
            Scanner input = new Scanner(System.in);

             // ii spunem useru-lui sa aleaga un operator
            System.out.println("Alege un operator: +, -, *, or /");
            operator = input.next().charAt(0);

             // ii spunem useru-lui sa introduca un numar
             System.out.println("Introduceti primul numar!");
             number1 = input.nextDouble();

             System.out.println("Introduceti al doilea numar!");
              number2= input.nextDouble();


              switch (operator) {

               // Adunare
               case '+':
                  result = number1 + number2;
                  System.out.println(number1 + " + " + number2 + " = " + result);
                    break;

               //Scadere
               case '-':
                  result = number1 - number2;
                  System.out.println(number1 + " - " + number2 + " = " + result);
                   break;

               //Inmultire
               case '*':
                 result = number1 * number2;
                  System.out.println(number1 + " * " + number2 + " = " + result);
                   break;

                //Impartire
               case '/':
                  result = number1 / number2;
                  System.out.println(number1 + " / " + number2 + " = " + result);
                    break;

               default:
                  System.out.println("Invalid operator!");
                     break;
        }

          input.close();
    }
}
