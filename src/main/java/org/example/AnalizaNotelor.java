package org.example;

public class AnalizaNotelor {

         static void main(String[] args) {

            // Tablou de String pentru nume
            String[] elevi = {"Ionut", "Ana", "Marius", "Elena", "Vlad", "Andreea"};
            // Tablou de int pentru note
               int[] note = {10, 4, 8, 7, 9, 6};

            // Afișăm situația fiecărui elev folosind un loop
            System.out.println("--- Catalog Elevi ---");

               for (int i = 0; i < elevi.length; i++) {
                   System.out.println(elevi[i] + " are nota: " + note[i]);
            }

              // Afișăm statisticile
                System.out.println("--- Statistici Generale ---");
                System.out.println("Media clasei: " + calculeazaMedia(note));
                System.out.println("Cea mai mare nota: " + gasesteNotaMaxima(note));
                System.out.println("Cea mai mica nota: " + gasesteNotaMinima(note));
        }

             // Metoda pentru medie
        public static double calculeazaMedia(int[] note) {

            double suma = 0;
            for (int n : note) suma += n;

            return suma / note.length;
        }

           // Metoda pentru nota maximă
        public static int gasesteNotaMaxima(int[] note) {

            int max = note[0];
            for (int n : note) {
                if (n > max) max = n;
            }
            return max;
        }

           // Metoda pentru nota minimă
        public static int gasesteNotaMinima(int[] note) {

            int min = note[0];
            for (int n : note) {
                if (n < min) min = n;
            }
            return min;
        }
    }



