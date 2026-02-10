package org.example;

    import java.util.Scanner;

    public class GhicesteNumarul {

        public static void main(String[] args) {

             Scanner cititor = new Scanner(System.in);
                int secret = 7;
                int incercare;
                System.out.println("Ghicește numărul secret!");

               while (true) {

                   System.out.print("Introdu un număr: ");
                   incercare = cititor.nextInt();

                    if (incercare == secret) {
                        System.out.println("Felicitări!");
                        break;
                }
                    else {
                       System.out.println("Mai încearcă!");
                }
               }

                  cititor.close();
             }
        }



